package com.huami.view.basetitle;

import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
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
    public static final String xml = "xml";

    private static void a(int i, String str, String str2, String str3) {
        if (i != 0) {
            return;
        }
        throw new RuntimeException("缺少id：" + str3 + ".R." + str2 + "." + str);
    }

    public static int getAnimId(Context context, String str) {
        return getId(context, str, "anim");
    }

    public static int getAttrId(Context context, String str) {
        return getId(context, str, "attr");
    }

    public static int getColorId(Context context, String str) {
        return getId(context, str, "color");
    }

    public static int getDimenId(Context context, String str) {
        return getId(context, str, "dimen");
    }

    public static int getDrawableId(Context context, String str) {
        return getId(context, str, "drawable");
    }

    public static int getId(Context context, String str, String str2) {
        return getId(context, str, str2, context.getPackageName());
    }

    public static int getIdId(Context context, String str) {
        return getId(context, str, "id");
    }

    public static int getIdSys(Context context, String str, String str2) {
        return getId(context, str, str2, "android");
    }

    public static int getLayoutId(Context context, String str) {
        return getId(context, str, "layout");
    }

    public static int getRawId(Context context, String str) {
        return getId(context, str, "raw");
    }

    public static int getStringId(Context context, String str) {
        return getId(context, str, "string");
    }

    public static int getStyleId(Context context, String str) {
        return getId(context, str, "style");
    }

    public static int getStyleableId(Context context, String str) {
        return getId(context, str, "styleable");
    }

    public static int getXmlId(Context context, String str) {
        return getId(context, str, xml);
    }

    public static int getAnimId(Context context, String str, int i) {
        return getId(context, str, "anim", i);
    }

    public static int getAttrId(Context context, String str, int i) {
        return getId(context, str, "attr", i);
    }

    public static int getColorId(Context context, String str, int i) {
        return getId(context, str, "color", i);
    }

    public static int getDimenId(Context context, String str, int i) {
        return getId(context, str, "dimen", i);
    }

    public static int getDrawableId(Context context, String str, int i) {
        return getId(context, str, "drawable", i);
    }

    public static int getId(Context context, String str, String str2, int i) {
        return getId(context, str, str2, context.getPackageName(), i);
    }

    public static int getIdId(Context context, String str, int i) {
        return getId(context, str, "id", i);
    }

    public static int getIdSys(Context context, String str, String str2, int i) {
        return getId(context, str, str2, "android", i);
    }

    public static int getLayoutId(Context context, String str, int i) {
        return getId(context, str, "layout", i);
    }

    public static int getRawId(Context context, String str, int i) {
        return getId(context, str, "raw", i);
    }

    public static int getStringId(Context context, String str, int i) {
        return getId(context, str, "string", i);
    }

    public static int getStyleId(Context context, String str, int i) {
        return getId(context, str, "style", i);
    }

    public static int getStyleableId(Context context, String str, int i) {
        return getId(context, str, "styleable", i);
    }

    public static int getXmlId(Context context, String str, int i) {
        return getId(context, str, xml, i);
    }

    public static int getId(Context context, String str, String str2, String str3) {
        int identifier = context.getResources().getIdentifier(str, str2, str3);
        a(identifier, str, str2, str3);
        return identifier;
    }

    public static int getId(Context context, String str, String str2, String str3, int i) {
        int identifier = context.getResources().getIdentifier(str, str2, str3);
        return identifier == 0 ? i : identifier;
    }
}
