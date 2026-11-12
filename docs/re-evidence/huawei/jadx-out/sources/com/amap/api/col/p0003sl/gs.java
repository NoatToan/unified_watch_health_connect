package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
final class gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f2590a = false;

    public static void a() {
        synchronized (gs.class) {
            if (!f2590a) {
                gt.a().a("regeo", new gv("/geocode/regeo"));
                gt.a().a("placeAround", new gv("/place/around"));
                gt.a().a("placeText", new gu("/place/text"));
                gt.a().a("geo", new gu("/geocode/geo"));
                f2590a = true;
            }
        }
    }
}
