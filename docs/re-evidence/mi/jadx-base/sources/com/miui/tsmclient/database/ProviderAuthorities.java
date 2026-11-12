package com.miui.tsmclient.database;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class ProviderAuthorities {
    private static final String PACKAGE_NAME = "com.miui.tsmclient.common";
    private static final String AUTHORITY_FORMAT = "%s.platform.provider";
    public static String AUTHORITY = String.format(AUTHORITY_FORMAT, "com.miui.tsmclient.common");
    private static final String CONTENT_URI_FORMAT = "content://%s.platform.provider";
    public static Uri CONTENT_URI = Uri.parse(String.format(CONTENT_URI_FORMAT, "com.miui.tsmclient.common"));
    private static final String PUBLIC_CONTENT_URI_FORMAT = "content://%s.platform.provider.public";
    public static Uri PUBLIC_CONTENT_URI = Uri.parse(String.format(PUBLIC_CONTENT_URI_FORMAT, "com.miui.tsmclient.common"));

    public static void init(Context context) {
        String packageName = context.getPackageName();
        AUTHORITY = String.format(AUTHORITY_FORMAT, packageName);
        CONTENT_URI = Uri.parse(String.format(CONTENT_URI_FORMAT, packageName));
        PUBLIC_CONTENT_URI = Uri.parse(String.format(PUBLIC_CONTENT_URI_FORMAT, packageName));
    }
}
