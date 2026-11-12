package vh;

import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvh/l0;", "T", "Lvh/a;", "wrappedAdapter", "", "buffered", "<init>", "(Lvh/a;Z)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class l0<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f178347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178348b;

    public l0(a<T> aVar, boolean z14) {
        aVar.getClass();
        this.f178347a = aVar;
        this.f178348b = z14;
    }

    @Override // vh.a
    public final void a(zh.g gVar, z zVar, T t7) {
        gVar.getClass();
        zVar.getClass();
        boolean z14 = this.f178348b;
        a<T> aVar = this.f178347a;
        if (!z14 || (gVar instanceof zh.i)) {
            gVar.y();
            aVar.a(gVar, zVar, t7);
            gVar.A();
            return;
        }
        zh.i iVar = new zh.i();
        iVar.y();
        aVar.a(iVar, zVar, t7);
        iVar.A();
        Object objC = iVar.c();
        objC.getClass();
        zh.b.a(gVar, objC);
    }

    @Override // vh.a
    public final T b(zh.f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        if (this.f178348b) {
            zh.h.f204756j.getClass();
            if (fVar instanceof zh.h) {
                fVar = (zh.h) fVar;
            } else {
                zh.f.a aVarPeek = fVar.getF204759c();
                if (aVarPeek != zh.f.a.BEGIN_OBJECT) {
                    n23.j.t("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `", aVarPeek, "` json token");
                    return null;
                }
                ArrayList path = fVar.getPath();
                Object objA = zh.a.a(fVar);
                objA.getClass();
                fVar = new zh.h((Map) objA, path);
            }
        }
        fVar.y();
        T tB = this.f178347a.b(fVar, zVar);
        fVar.A();
        return tB;
    }
}
