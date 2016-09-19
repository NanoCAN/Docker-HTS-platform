//DataSource config
dataSource {
    dbCreate = "update"
    driverClassName = "com.mysql.jdbc.Driver" 
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    url = "jdbc:mysql://mysql/olf?useUnicode=yes&characterEncoding=UTF-8"
    username = "savanah"
    password = "thatpasswordagain"
    properties {
        maxActive = -1
        minEvictableIdleTimeMillis = 1800000
        timeBetweenEvictionRunsMillis = 1800000
        numTestsPerEvictionRun = 3
        testOnBorrow = true
        testWhileIdle = true
        testOnReturn = true
        validationQuery = "SELECT 1"
    } 
}
grails.serverURL = "http://localhost/OpenLabFramework"
openlab.upload.dir = "/upload/"
openlab.temp.dir = "/tmp/"

//CAS configuration for single sign on
grails.plugins.springsecurity.cas.active = false

//Default app access token used for MIRACLE and SAVANAH
openlab.app.access.token = "0750ab92-c412-459d-aee3-d7612d009024"