package e52;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le52/a;", "Lg32/b;", "Lz42/g;", "<init>", "()V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements g32.b<z42.g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f63064b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x42.a f63065c = (x42.a) KoinJavaComponent.get$default(x42.a.class, null, null, 6, null);

    private a() {
    }

    @Override // g32.b
    public final boolean a() {
        return f63065c.c();
    }

    @Override // g32.b
    public final boolean b() {
        return f63065c.b();
    }

    @Override // g32.b
    public final boolean c(z42.g gVar) {
        List<z42.f> list;
        z42.g gVar2 = gVar;
        Object obj = null;
        if (gVar2 != null && (list = gVar2.f202397b) != null) {
            for (Object obj2 : list) {
                Integer pushes = ((z42.f) obj2).getPushes();
                if ((pushes != null ? pushes.intValue() : 0) > 0) {
                    obj = obj2;
                    break;
                }
            }
            obj = (z42.f) obj;
        }
        return obj != null;
    }

    @Override // g32.b
    public final void d() {
        f63065c.a();
    }

    @Override // g32.b
    public final void e() {
        f63065c.d();
    }
}
