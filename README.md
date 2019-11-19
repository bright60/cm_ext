Cloudera Manager Extensions
===========================

Documentation and tools for creating Cloudera Manager extensions

* Tools are in this git repo
 * Validator for parcels and CSDs
 * make_manifest script to create a manifest for a parcel repository
* Documentation is in the [wiki](../../wiki)

Requirements
------------

* validator
  * Java 7
  * Maven 3.5.x or above (to build, dont' use maven 3.0.5, update to latest version, such as 3.5.2, otherwise it may has "peer not authenticated" error during running "mvn install")
* make_manifest
  * Python 2.7/3.3 or higher

* Upgrade maven version to 3.5.x or above on Centos7.X
```
yum remove maven
yum remove plexus-cipher
yum remove maven-wagon

wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
yum -y install apache-maven
```

Running the Validator
---------------------

Building the validator creates an executable jar file. Make sure a java jre 
is installed and in the path.

```bash
$ mvn -version
Apache Maven 3.5.2 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T15:58:13+08:00)
Maven home: /usr/share/apache-maven
Java version: 1.8.0_121, vendor: Oracle Corporation
Java home: /usr/java/jdk1.8.0_121/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-957.el7.x86_64", arch: "amd64", family: "unix"
$ mvn install
$ cd validator
$ java -jar target/validator.jar <arguments>
```

Running make_manifest
---------------------

```bash
$ python make_manifest/make_manifest.py <path to directory>
```

All source in this repository is [Apache-Licensed](LICENSE.txt).

