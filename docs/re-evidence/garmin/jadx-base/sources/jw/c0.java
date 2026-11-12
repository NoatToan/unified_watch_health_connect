package jw;

import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import org.joda.time.DateTimeUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Ljw/c0;", "Ljw/c;", "<init>", "()V", "", "maxAge", "maxStale", "(JJ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends c {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f101231a;

        /* JADX INFO: renamed from: jw.c0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1947a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f101232a;

            /* JADX INFO: renamed from: jw.c0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.ResponseCacheController$loadFreshCacheFlow$$inlined$map$1$2", f = "ResponseCacheController.kt", l = {50}, m = "emit", v = 2)
            public static final class C1948a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f101233a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f101234b;

                public C1948a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f101233a = obj;
                    this.f101234b |= Integer.MIN_VALUE;
                    return C1947a.this.emit(null, this);
                }
            }

            public C1947a(r53.j jVar) {
                this.f101232a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1948a c1948a;
                if (dVar instanceof C1948a) {
                    c1948a = (C1948a) dVar;
                    int i14 = c1948a.f101234b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1948a.f101234b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1948a = new C1948a(dVar);
                    }
                } else {
                    c1948a = new C1948a(dVar);
                }
                Object obj2 = c1948a.f101233a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1948a.f101234b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    bb2.r rVar = (bb2.r) obj;
                    String str = rVar != null ? rVar.f17386b : null;
                    c1948a.f101234b = 1;
                    if (this.f101232a.emit(str, c1948a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar) {
            this.f101231a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f101231a.collect(new C1947a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public c0() {
    }

    @Override // jw.c
    public final String a() {
        if (this.f101228a == null) {
            return null;
        }
        bb2.p pVarJ = CacheDatabase.i().j();
        String str = this.f101228a;
        str.getClass();
        bb2.r rVarC = pVarJ.c(str);
        if (rVarC != null) {
            return rVarC.f17386b;
        }
        return null;
    }

    @Override // jw.c
    public final r53.i<String> b() {
        bb2.p pVarJ = CacheDatabase.i().j();
        String str = this.f101228a;
        str.getClass();
        return new a(pVarJ.d(str));
    }

    @Override // jw.c
    public final String c() {
        bb2.p pVarJ = CacheDatabase.i().j();
        String str = this.f101228a;
        str.getClass();
        bb2.r rVarF = pVarJ.f(str);
        if (rVarF != null) {
            return rVarF.f17386b;
        }
        return null;
    }

    @Override // jw.c
    public final void d(Object obj, String str) {
        str.getClass();
        obj.getClass();
        CacheDatabase.i().j().g(new bb2.r(this.f101228a, str, DateTimeUtils.currentTimeMillis(), this.f101229b, this.f101230c));
    }

    public c0(long j8, long j14) {
        super(j8, j14);
    }
}
