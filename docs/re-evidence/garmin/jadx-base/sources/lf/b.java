package lf;

import o53.i1;
import p005kotlin.Metadata;
import p006l2.v0;
import w63.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Llf/b;", "Llf/h;", "Llf/o;", "source", "Lwf/m;", "options", "Lz53/d;", "parallelismLock", "Llf/l;", "exifOrientationStrategy", "<init>", "(Llf/o;Lwf/m;Lz53/d;Llf/l;)V", "c", "b", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f112070e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f112071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f112072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z53.d f112073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f112074d;

    /* JADX INFO: renamed from: lf.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llf/b$b;", "Lw63/o;", "Lw63/g0;", "delegate", "<init>", "(Lw63/g0;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2152b extends w63.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Exception f112075a;

        public C2152b(g0 g0Var) {
            super(g0Var);
        }

        @Override // w63.o, w63.g0
        public final long read(w63.e eVar, long j8) throws Exception {
            try {
                return super.read(eVar, j8);
            } catch (Exception e4) {
                this.f112075a = e4;
                throw e4;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @v13.e(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.d f112078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f112079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f112080c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f112082e;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f112080c = obj;
            this.f112082e |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ b(o oVar, wf.m mVar, z53.d dVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, mVar, (i14 & 4) != 0 ? z53.h.a(Integer.MAX_VALUE) : dVar, (i14 & 8) != 0 ? l.f112099a : lVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lf.h
    public final Object a(t13.d<? super f> dVar) throws Throwable {
        d dVar2;
        z53.d dVar3;
        int i14;
        z53.d dVar4;
        Throwable th3;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f112082e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar2.f112082e = i15 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f112080c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar2.f112082e;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                dVar3 = this.f112073c;
                dVar2.f112078a = dVar3;
                i14 = 0;
                dVar2.f112079b = 0;
                dVar2.f112082e = 1;
                if (dVar3.b(dVar2) != aVar) {
                }
                return aVar;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar4 = dVar2.f112078a;
                try {
                    o13.r.b(obj);
                    f fVar = (f) obj;
                    dVar4.release();
                    return fVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    dVar4.release();
                    throw th3;
                }
            }
            i14 = dVar2.f112079b;
            z53.d dVar5 = dVar2.f112078a;
            o13.r.b(obj);
            dVar3 = dVar5;
            v0 v0Var = new v0(this, 7);
            dVar2.f112078a = dVar3;
            dVar2.f112079b = i14;
            dVar2.f112082e = 2;
            Object objE0 = ge1.b.e0(t13.h.f161748a, new i1(v0Var, null), dVar2);
            if (objE0 != aVar) {
                dVar4 = dVar3;
                obj = objE0;
                f fVar2 = (f) obj;
                dVar4.release();
                return fVar2;
            }
            return aVar;
        } catch (Throwable th5) {
            dVar4 = dVar3;
            th3 = th5;
            dVar4.release();
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llf/b$a;", "", "<init>", "()V", "", "DEFAULT_MAX_PARALLELISM", "I", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llf/b$c;", "Llf/h$a;", "Lz53/d;", "parallelismLock", "Llf/l;", "exifOrientationStrategy", "<init>", "(Lz53/d;Llf/l;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z53.d f112076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f112077b;

        public /* synthetic */ c(z53.d dVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? z53.h.a(4) : dVar, (i14 & 2) != 0 ? l.f112099a : lVar);
        }

        @Override // lf.h.a
        public final h a(nf.o oVar, wf.m mVar) {
            return new b(oVar.f125762a, mVar, this.f112076a, this.f112077b);
        }

        public c(z53.d dVar, l lVar) {
            this.f112076a = dVar;
            this.f112077b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public b(o oVar, wf.m mVar, z53.d dVar, l lVar) {
        this.f112071a = oVar;
        this.f112072b = mVar;
        this.f112073c = dVar;
        this.f112074d = lVar;
    }
}
