package bl;

import cz2.j;
import e23.l;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.analytics.gcs.GcsAnalyticsService$doLogEvent$1", f = "GcsAnalyticsService.kt", l = {183, 118, 121}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f18563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f18564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk.a f18566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<dl.a> f18567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f18568f;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @v13.e(c = "com.garmin.analytics.gcs.GcsAnalyticsService$doLogEvent$1$2", f = "GcsAnalyticsService.kt", l = {183, 123}, m = "invokeSuspend")
    public static final class a extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f18569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f18570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f18572d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f18572d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f18572d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            b bVar;
            z53.a aVar;
            z53.a aVar2;
            Throwable th3;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f18571c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    bVar = this.f18572d;
                    aVar = bVar.f18560j;
                    this.f18569a = aVar;
                    this.f18570b = bVar;
                    this.f18571c = 1;
                    if (aVar.c(this) != aVar3) {
                    }
                    return aVar3;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = this.f18569a;
                    try {
                        r.b(obj);
                        Unit unit = Unit.INSTANCE;
                        aVar2.e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th3 = th4;
                        aVar2.e(null);
                        throw th3;
                    }
                }
                bVar = this.f18570b;
                z53.a aVar4 = this.f18569a;
                r.b(obj);
                aVar = aVar4;
                this.f18569a = aVar;
                this.f18570b = null;
                this.f18571c = 2;
                bVar.getClass();
                x53.c cVar = s0.f129406a;
                if (ge1.b.e0(x53.b.f189152a, new d(bVar, null), this) != aVar3) {
                    aVar2 = aVar;
                    Unit unit2 = Unit.INSTANCE;
                    aVar2.e(null);
                    return Unit.INSTANCE;
                }
                return aVar3;
            } catch (Throwable th5) {
                aVar2 = aVar;
                th3 = th5;
                aVar2.e(null);
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zk.a aVar, List<dl.a> list, b bVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f18566d = aVar;
        this.f18567e = list;
        this.f18568f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f18566d, this.f18567e, this.f18568f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0068 A[EXC_TOP_SPLITTER, PHI: r1 r12
      0x0068: PHI (r1v2 bl.b) = (r1v1 bl.b), (r1v4 bl.b) binds: [B:27:0x0065, B:15:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r12v9 z53.a) = (r12v3 z53.a), (r12v17 z53.a) binds: [B:27:0x0065, B:15:0x0024] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r12.c(r6, r3, r11) == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        b bVar;
        z53.a aVar;
        z53.a aVar2;
        Throwable th3;
        Object objE0;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18565c;
        if (i14 == 0) {
            r.b(obj);
            boolean z14 = this.f18566d.f205031c;
            bVar = this.f18568f;
            if (z14 || this.f18567e.size() > 1) {
                aVar = bVar.f18560j;
                this.f18563a = aVar;
                this.f18564b = bVar;
                this.f18565c = 1;
                if (aVar.c(this) != aVar3) {
                    this.f18563a = aVar;
                    this.f18564b = null;
                    this.f18565c = 2;
                    bVar.getClass();
                    x53.c cVar = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new d(bVar, null), this);
                    if (objE0 != aVar3) {
                        aVar2 = aVar;
                        obj = objE0;
                        aVar2.e(null);
                    }
                }
                return aVar3;
            }
            long j8 = bVar.f18553c;
            if (j8 <= 0) {
                aVar = bVar.f18560j;
                this.f18563a = aVar;
                this.f18564b = bVar;
                this.f18565c = 1;
                if (aVar.c(this) != aVar3) {
                    this.f18563a = aVar;
                    this.f18564b = null;
                    this.f18565c = 2;
                    bVar.getClass();
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new d(bVar, null), this);
                    if (objE0 != aVar3) {
                        aVar2 = aVar;
                        obj = objE0;
                        aVar2.e(null);
                    }
                }
            } else {
                j<Unit> jVar = bVar.f18559i;
                a aVar4 = new a(bVar, null);
                this.f18565c = 3;
            }
            return aVar3;
        }
        if (i14 == 1) {
            bVar = this.f18564b;
            z53.a aVar5 = this.f18563a;
            r.b(obj);
            aVar = aVar5;
            try {
                this.f18563a = aVar;
                this.f18564b = null;
                this.f18565c = 2;
                bVar.getClass();
                x53.c cVar3 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new d(bVar, null), this);
                if (objE0 != aVar3) {
                    aVar2 = aVar;
                    obj = objE0;
                    aVar2.e(null);
                }
                return aVar3;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th3 = th4;
                aVar2.e(null);
                throw th3;
            }
        }
        if (i14 == 2) {
            aVar2 = this.f18563a;
            try {
                r.b(obj);
                aVar2.e(null);
            } catch (Throwable th5) {
                th3 = th5;
                aVar2.e(null);
                throw th3;
            }
        } else {
            if (i14 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
