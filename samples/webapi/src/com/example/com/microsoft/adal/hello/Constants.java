
package com.example.com.microsoft.adal.hello;

public class Constants {
    public static final String SDK_VERSION = "1.0";

    /**
     * UTF-8 encoding
     */
    public static final String UTF8_ENCODING = "UTF-8";

    public static final String HEADER_AUTHORIZATION = "Authorization";

    public static final String HEADER_AUTHORIZATION_VALUE_PREFIX = "Bearer ";

    // -------------------------------AAD
    // PARAMETERS----------------------------------
    static final String AUTHORITY_URL = "https://login.windows-ppe.net/common";

    static final String CLIENT_ID = "a7558c9a-c964-4fbf-be19-2f277f78a586";

    static final String RESOURCE_ID = "00000002-0000-0ff1-ce00-000000000000"; 

    static final String REDIRECT_URL = "http://msopentech.com";

    static String USER_HINT = "admin@p365ppetap04.ccsctp.net";

    // Endpoint we are targeting for the deployed WebAPI service
    static final String SERVICE_URL = "https://android.azurewebsites.net";

    // ------------------------------------------------------------------------------------------

    static final String TABLE_WORKITEM = "WorkItem";

    public static final String SHARED_PREFERENCE_NAME = "com.example.com.test.settings";

    public static final String KEY_NAME_ASK_BROKER_INSTALL = "test.settings.ask.broker";

    public static final String KEY_NAME_CHECK_BROKER = "test.settings.check.broker";
}
