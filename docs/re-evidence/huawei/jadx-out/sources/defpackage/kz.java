package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class kz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static kz f39650b = new kz();

    public String d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public static kz a() {
        return f39650b;
    }
}
