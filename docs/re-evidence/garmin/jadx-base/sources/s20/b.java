package s20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls20/b;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f156004a = new b();

    private b() {
    }

    public static void a(com.garmin.android.apps.connectmobile.courses.model.g gVar, q40.b bVar) {
        bVar.getClass();
        String str = bVar.f142581h;
        gVar.name = bVar.f142575b;
        gVar.m(bVar.f142580g.f32922a);
        if (!g22.n.d(str)) {
            str = null;
        }
        gVar.note = str;
        gVar.restDuration = bVar.f142582i;
        gVar.cutoffDuration = bVar.f142583j;
    }
}
