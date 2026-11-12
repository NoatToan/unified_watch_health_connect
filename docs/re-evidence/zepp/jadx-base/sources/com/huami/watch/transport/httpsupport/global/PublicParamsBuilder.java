package com.huami.watch.transport.httpsupport.global;

import android.content.Context;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.squareup.okhttp.Request;

/* JADX INFO: loaded from: classes9.dex */
public class PublicParamsBuilder {
    public static String HEADER_APP_TOKERN = "apptoken";
    public static String HEADER_APP_VER = "cv";
    public static String HEADER_CALLID = "callid";
    public static String HEADER_CHANNEL = "channel";
    public static String HEADER_COUNTRY = "country";
    public static String HEADER_LOCALE = "lang";
    public static String HEADER_PLATFORM = "appplatform";
    public static String HEADER_PROTO_VER = "v";
    public static String HEADER_TIMEZONE = "timezone";
    public static String HEAD_APP_NAME = "appname";
    public String userId;

    public String completeURL(Context context, String str) {
        return str;
    }

    public void fillPublicHeader(Context context, DataItem dataItem, Request.Builder builder) {
        builder.addHeader(HEAD_APP_NAME, context.getPackageName());
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
