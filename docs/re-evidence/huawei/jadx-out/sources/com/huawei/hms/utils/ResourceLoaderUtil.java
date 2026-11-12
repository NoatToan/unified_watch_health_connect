package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResourceLoaderUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f16914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f16915b;

    public static int getAnimId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "anim", f16915b);
    }

    public static int getColorId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "color", f16915b);
    }

    public static int getDimenId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "dimen", f16915b);
    }

    public static Drawable getDrawable(String str) {
        Context context = f16914a;
        if (context == null) {
            return null;
        }
        return context.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "drawable", f16915b);
    }

    public static int getIdId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "id", f16915b);
    }

    public static int getLayoutId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", f16915b);
    }

    public static String getString(String str) {
        Context context = f16914a;
        return context == null ? "" : context.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "string", f16915b);
    }

    public static int getStyleId(String str) {
        Context context = f16914a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, TtmlNode.TAG_STYLE, f16915b);
    }

    public static Context getmContext() {
        return f16914a;
    }

    public static void setmContext(Context context) {
        f16914a = context;
        if (context != null) {
            f16915b = context.getPackageName();
        } else {
            f16915b = null;
            HMSLog.e("ResourceLoaderUtil", "context is null");
        }
    }

    public static String getString(String str, Object... objArr) {
        Context context = f16914a;
        if (context == null) {
            return "";
        }
        return context.getResources().getString(getStringId(str), objArr);
    }
}
