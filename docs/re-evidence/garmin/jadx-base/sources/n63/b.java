package n63;

import o63.b0;
import o63.d0;
import o63.e0;
import o63.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Ln63/b;", "Li63/m;", "Ln63/g;", "configuration", "Lp63/e;", "serializersModule", "<init>", "(Ln63/g;Lp63/e;)V", "a", "Ln63/b$a;", "Ln63/o;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements i63.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f123892d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f123893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p63.e f123894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o63.k f123895c;

    private b(g gVar, p63.e eVar) {
        this.f123893a = gVar;
        this.f123894b = eVar;
        this.f123895c = new o63.k();
    }

    @Override // i63.m
    /* JADX INFO: renamed from: a, reason: from getter */
    public final p63.e getF123894b() {
        return this.f123894b;
    }

    @Override // i63.m
    public final <T> String b(i63.i<? super T> iVar, T t7) {
        iVar.getClass();
        o63.s sVar = new o63.s();
        try {
            new b0(sVar, this, g0.OBJ, new m[g0.f129861h.getF168272d()]).l(iVar, t7);
            return sVar.toString();
        } finally {
            sVar.e();
        }
    }

    @Override // i63.m
    public final <T> T c(i63.b<? extends T> bVar, String str) {
        bVar.getClass();
        str.getClass();
        d0 d0Var = !this.f123893a.f123933o ? new d0(str) : new e0(str);
        T t7 = (T) new o63.a0(this, g0.OBJ, d0Var, bVar.getF116202c(), null).h(bVar);
        if (d0Var.e() == 10) {
            return t7;
        }
        o63.a.m(d0Var, "Expected EOF after parsing, but had " + d0Var.f129846e.charAt(d0Var.f129815a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public /* synthetic */ b(g gVar, p63.e eVar, p005kotlin.jvm.internal.j jVar) {
        this(gVar, eVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln63/b$a;", "Ln63/b;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {
        private a() {
            super(new g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), p63.h.f136264a, null);
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
