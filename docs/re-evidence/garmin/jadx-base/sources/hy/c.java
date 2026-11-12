package hy;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhy/c;", "Lg32/b;", "Lxx/b;", "<init>", "()V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements g32.b<xx.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f86320b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vx.g f86321c = ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).a();

    private c() {
    }

    @Override // g32.b
    public final boolean a() {
        return f86321c.c();
    }

    @Override // g32.b
    public final boolean b() {
        return f86321c.d();
    }

    @Override // g32.b
    public final boolean c(xx.b bVar) {
        gs1.t tVar;
        xx.b bVar2 = bVar;
        return (bVar2 == null || (tVar = bVar2.f192468c) == null || !tVar.y()) ? false : true;
    }

    @Override // g32.b
    public final void d() {
        f86321c.a();
    }

    @Override // g32.b
    public final void e() {
        f86321c.b();
    }
}
