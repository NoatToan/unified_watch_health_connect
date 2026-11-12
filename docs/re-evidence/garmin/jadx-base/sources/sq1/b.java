package sq1;

import java.util.List;
import jq1.f;
import jq1.g;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsq1/b;", "Lg32/b;", "Ljq1/g;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements g32.b<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f160529b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hq1.a f160530c = (hq1.a) KoinJavaComponent.get$default(hq1.a.class, null, null, 6, null);

    private b() {
    }

    @Override // g32.b
    public final boolean a() {
        return f160530c.a();
    }

    @Override // g32.b
    public final boolean b() {
        return f160530c.d();
    }

    @Override // g32.b
    public final boolean c(g gVar) {
        List<f> list;
        g gVar2 = gVar;
        Object obj = null;
        if (gVar2 != null && (list = gVar2.f100010b) != null) {
            for (Object obj2 : list) {
                Integer num = ((f) obj2).f100004c;
                if ((num != null ? num.intValue() : 0) > 0) {
                    obj = obj2;
                    break;
                }
            }
            obj = (f) obj;
        }
        return obj != null;
    }

    @Override // g32.b
    public final void d() {
        f160530c.b();
    }

    @Override // g32.b
    public final void e() {
        f160530c.c();
    }
}
