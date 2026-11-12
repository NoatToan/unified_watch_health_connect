package com.xiaomi.hm.health.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
public class IdGetter {
    public static final String anim = "anim";
    public static final String attr = "attr";
    public static final String color = "color";
    public static final String dimen = "dimen";
    public static final String drawable = "drawable";
    public static final String id = "id";
    public static final String layout = "layout";
    public static final String raw = "raw";
    public static final String sSysPkgName = "android";
    public static final String string = "string";
    public static final String style = "style";
    public static final String styleable = "styleable";

    private static void a(int id2, String name, String type) {
        if (id2 != 0) {
            return;
        }
        throw new RuntimeException("缺少id：R." + type + "." + name);
    }

    public static int getId(Context context, String name, String type) {
        return getId(context, name, type, 0, true);
    }

    public static int getIdSys(Context context, String name, String type, int idDef, boolean check) {
        return getId(context, name, type, "android", idDef, check);
    }

    public static int getId(Context context, String name, String type, boolean check) {
        return getId(context, name, type, 0, check);
    }

    public static int getId(Context context, String name, String type, int idDef, boolean check) {
        return getId(context, name, type, context.getPackageName(), idDef, check);
    }

    public static int getId(Context context, String name, String type, String pkgName, int idDef, boolean check) {
        int identifier = context.getResources().getIdentifier(name, type, pkgName);
        if (identifier != 0) {
            idDef = identifier;
        }
        if (check) {
            a(idDef, name, type);
        }
        return idDef;
    }
}
