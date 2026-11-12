package com.huami.passport.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class ResUtils {
    public static int getAnimIdByName(Context context, String str) {
        return getResIdByName(context, "anim", str);
    }

    public static int getColorIdByName(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "color", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new RuntimeException("Resource file is not found!");
    }

    public static int getDrawbleIdByName(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new RuntimeException("Resource file is not found!");
    }

    public static int getLayoutIdByName(Context context, String str) {
        return getResIdByName(context, "layout", str);
    }

    public static int getResIdByName(Context context, String str, String str2) {
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new RuntimeException("Resource file is not found!");
    }

    public static int getStringIdByName(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new RuntimeException("Resource file is not found!");
    }

    public static int getStyleIdByName(Context context, String str) {
        return getResIdByName(context, "style", str);
    }

    public static final int getResIdByName(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "id", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new RuntimeException("Resource file is not found!");
    }
}
