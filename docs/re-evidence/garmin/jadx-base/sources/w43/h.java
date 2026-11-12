package w43;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.f f182001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d53.k f182002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection<x33.f> f182003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<t23.v, String> f182004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f[] f182005e;

    public static final class a implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f182006a = new a();

        @Override // e23.l
        public final Object invoke(Object obj) {
            ((t23.v) obj).getClass();
            return null;
        }
    }

    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f182007a = new b();

        @Override // e23.l
        public final Object invoke(Object obj) {
            ((t23.v) obj).getClass();
            return null;
        }
    }

    public static final class c implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f182008a = new c();

        @Override // e23.l
        public final Object invoke(Object obj) {
            ((t23.v) obj).getClass();
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(x33.f fVar, f[] fVarArr, e23.l<? super t23.v, String> lVar) {
        this(fVar, (d53.k) null, (Collection<x33.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        fVar.getClass();
        fVarArr.getClass();
        lVar.getClass();
    }

    public /* synthetic */ h(x33.f fVar, f[] fVarArr, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, fVarArr, (e23.l<? super t23.v, String>) ((i14 & 4) != 0 ? a.f182006a : lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(x33.f fVar, d53.k kVar, Collection<x33.f> collection, e23.l<? super t23.v, String> lVar, f... fVarArr) {
        this.f182001a = fVar;
        this.f182002b = kVar;
        this.f182003c = collection;
        this.f182004d = lVar;
        this.f182005e = fVarArr;
    }

    public /* synthetic */ h(d53.k kVar, f[] fVarArr, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(kVar, fVarArr, (e23.l<? super t23.v, String>) ((i14 & 4) != 0 ? b.f182007a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(d53.k kVar, f[] fVarArr, e23.l<? super t23.v, String> lVar) {
        this((x33.f) null, kVar, (Collection<x33.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        kVar.getClass();
        fVarArr.getClass();
        lVar.getClass();
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((Collection<x33.f>) collection, fVarArr, (e23.l<? super t23.v, String>) ((i14 & 4) != 0 ? c.f182008a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection<x33.f> collection, f[] fVarArr, e23.l<? super t23.v, String> lVar) {
        this((x33.f) null, (d53.k) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        collection.getClass();
        fVarArr.getClass();
        lVar.getClass();
    }
}
