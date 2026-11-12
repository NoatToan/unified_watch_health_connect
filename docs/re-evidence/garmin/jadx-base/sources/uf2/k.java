package uf2;

import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDILiveSessionProto;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luf2/k;", "Luf2/s;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f170417f = 140.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f170418g = 350.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f170419h = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uf2/k$a", "Luf2/r0$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r0.b {
        public a() {
        }

        @Override // uf2.r0.b
        public final Object a(String str, r0.c cVar) {
            return Unit.INSTANCE;
        }

        @Override // uf2.r0.b
        public final Object b(rs2.c cVar, rf2.g gVar, dt2.g gVar2, GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, t13.d<? super Unit> dVar) throws Throwable {
            rf2.e eVar;
            if (!liveSessionEventNotification.hasActivityStateRequest() || liveSessionEventNotification.getActivityStateRequest().getState() != GDILiveSessionProto.ActivityStateRequest.State.ENDED) {
                return Unit.INSTANCE;
            }
            rf2.e.a aVar = rf2.e.f152468a;
            GDILiveSessionProto.ActivityStateRequest.EndReason endReason = liveSessionEventNotification.getActivityStateRequest().getEndReason();
            endReason.getClass();
            aVar.getClass();
            int i14 = rf2.e.a.C2868a.f152470a[endReason.ordinal()];
            if (i14 == 1) {
                eVar = rf2.e.d.f152473b;
            } else {
                if (i14 != 2) {
                    lc.u0.r();
                    return null;
                }
                eVar = rf2.e.b.f152471b;
            }
            Object objEmit = k.this.f170500a.emit(new sf2.c.l(eVar), dVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }

        @Override // uf2.r0.b
        public final Object c(rs2.c cVar, dt2.g gVar, r0.e eVar) {
            return Unit.INSTANCE;
        }

        @Override // uf2.r0.b
        public final Object d(rs2.c cVar, dt2.g gVar, GDILiveSessionProto.LiveSessionService liveSessionService, t13.d<? super Unit> dVar) {
            return Unit.INSTANCE;
        }
    }

    public k() {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new l(this, null), 3);
    }

    @Override // uf2.s
    public final Object b(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // uf2.s
    public final r0.b e() {
        return this.f170419h;
    }

    @Override // uf2.s
    public final void f() {
    }

    @Override // uf2.s
    public final void g() {
    }

    @Override // uf2.s
    public final void i(int i14, Integer num, Float f14, GDIDataTypes.MeasurementUnit measurementUnit, String str, String str2) {
    }

    @Override // uf2.s
    public final Object j(of2.n0 n0Var) {
        int i14 = o13.q.f128596b;
        return Unit.INSTANCE;
    }

    @Override // uf2.s
    public final void l() {
    }

    @Override // uf2.s
    public final void m(rf2.d dVar) {
        dVar.getClass();
    }

    @Override // uf2.s
    public final Object n(of2.r0 r0Var) {
        int i14 = o13.q.f128596b;
        return Unit.INSTANCE;
    }

    @Override // uf2.s
    public final Object p(of2.s0 s0Var) {
        int i14 = o13.q.f128596b;
        return Unit.INSTANCE;
    }

    @Override // uf2.s
    public final Object r(Integer num, of2.t0 t0Var) {
        int i14 = o13.q.f128596b;
        return Unit.INSTANCE;
    }

    @Override // uf2.s
    public final Object t(Integer num, Integer num2, zf2.i iVar, of2.u0 u0Var) {
        int i14 = o13.q.f128596b;
        return Unit.INSTANCE;
    }

    public final void v(double d14) {
        ArrayList arrayList = new ArrayList();
        int i14 = (int) d14;
        int i15 = i14 * 1000;
        arrayList.add(new rf2.b(rf2.a.TIME, i14, null, Float.valueOf(i15), null, 20, null));
        h23.c.a aVar = h23.c.f81216a;
        aVar.getClass();
        h23.a aVar2 = h23.c.f81217b;
        boolean zNextBoolean = aVar2.g().nextBoolean();
        float f14 = this.f170417f;
        float fMin = zNextBoolean ? Math.min(220.0f, f14 + 5) : Math.max(0.0f, f14 - 5);
        this.f170417f = fMin;
        arrayList.add(new rf2.b(rf2.a.HEART_RATE, i14, null, Float.valueOf(fMin), null, 20, null));
        double d15 = 10;
        arrayList.add(new rf2.b(rf2.a.SPEED, i14, null, Double.valueOf((Math.sin(0.8d * d14) * d15) + d15), null, 20, null));
        boolean zNextBoolean2 = aVar2.g().nextBoolean();
        double d16 = this.f170418g;
        this.f170418g = zNextBoolean2 ? Math.min(1500.0d, d16 + ((double) 20)) : Math.max(0.0d, d16 - ((double) 20));
        arrayList.add(new rf2.b(rf2.a.POWER, i14, null, Float.valueOf(fMin), null, 20, null));
        arrayList.add(new rf2.b(rf2.a.HEART_RATE_AVG, i14, null, Double.valueOf(((double) fMin) * 0.5d), null, 20, null));
        arrayList.add(new rf2.b(rf2.a.DISTANCE, i14, null, Double.valueOf(d14 + 0.5d), null, 20, null));
        try {
            arrayList.add(new rf2.b(rf2.a.PACE_AVG, i14, null, Double.valueOf(gl1.d.N(aVar, new j23.l(1, 4))), null, 20, null));
            double d17 = 60;
            String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d14 / d17)}, 1));
            String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d14 % d17)}, 1));
            arrayList.add(new rf2.b(rf2.a.TIME_ELAPSED, i14, null, Double.valueOf(i15), null, 20, null));
            this.f170500a.d(new sf2.c.b(arrayList));
        } catch (IllegalArgumentException e4) {
            n23.j.s(e4.getMessage());
        }
    }
}
