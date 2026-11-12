package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static hg f18871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18872b = new byte[0];

    public static void a(String str) {
        synchronized (f18872b) {
            hw.a("LinkedAdConfigurationDataShare", "set soundSwitch for linked");
            hg hgVar = f18871a;
            if (hgVar != null) {
                hgVar.a(str);
            }
        }
    }

    public static void a(hg hgVar) {
        synchronized (f18872b) {
            try {
                if (hgVar == null) {
                    hw.a("LinkedAdConfigurationDataShare", "set linked ad from linked");
                    f18871a = null;
                } else {
                    f18871a = hgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hg a() {
        hg hgVar;
        synchronized (f18872b) {
            hw.a("LinkedAdConfigurationDataShare", "get linked ad from linked");
            hgVar = f18871a;
        }
        return hgVar;
    }
}
