package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes23.dex */
public class bim {
    private static bim d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1129a;
    private int e;

    public String a() {
        return this.f1129a;
    }

    public int c() {
        return this.e;
    }

    public static bim e() {
        bim bimVar;
        synchronized (bim.class) {
            if (d == null) {
                d = new bim();
            }
            bimVar = d;
        }
        return bimVar;
    }

    private String b() {
        return bio.d("ro.build.version.emui", "");
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("_");
        return strArrSplit.length == 2 ? strArrSplit[1] : "";
    }

    private bim() {
        this.e = 0;
        this.f1129a = "";
        this.e = bio.e("ro.build.hw_emui_api_level", 0);
        this.f1129a = d(b());
    }
}
