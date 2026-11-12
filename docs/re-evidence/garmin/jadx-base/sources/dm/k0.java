package dm;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/k0;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f60378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60379k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.BaseActivitySummaryStatsOperation$getTimeInZoneTask$1", f = "BaseActivitySummaryStatsOperation.kt", l = {290}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f60380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f60381b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60383d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60381b = obj;
            this.f60383d |= Integer.MIN_VALUE;
            return k0.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<com.garmin.android.library.backgroundtaskmanagement.b.c> f60384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f60385b;

        public b(p005kotlin.jvm.internal.r0<com.garmin.android.library.backgroundtaskmanagement.b.c> r0Var, o oVar) {
            this.f60384a = r0Var;
            this.f60385b = oVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            T t7;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                ((aq.d) this.f60385b.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11886h = (List) ((v2.b) v2Var).f47386a;
                t7 = (T) com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                t7 = (T) com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            this.f60384a.f105810a = t7;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o oVar, long j8) {
        super(oVar);
        this.f60378j = oVar;
        this.f60379k = j8;
        oVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.garmin.android.library.backgroundtaskmanagement.b$c] */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        p005kotlin.jvm.internal.r0 r0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60383d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60383d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f60381b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60383d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            r0VarS.f105810a = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            o oVar = this.f60378j;
            am.m mVar = oVar.f60399n;
            mVar.getClass();
            c2 c2Var = new c2(new am.l0(mVar, this.f60379k, null));
            x53.c cVar = o53.s0.f129406a;
            r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
            b bVar = new b(r0VarS, oVar);
            aVar.f60380a = r0VarS;
            aVar.f60383d = 1;
            if (iVarA.collect(bVar, aVar) == aVar2) {
                return aVar2;
            }
            r0Var = r0VarS;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = aVar.f60380a;
            o13.r.b(obj);
        }
        return r0Var.f105810a;
    }
}
