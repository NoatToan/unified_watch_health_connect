package rk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$saveActivityTypes$1$2", f = "GearDetailsViewModel.kt", l = {298, 299}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jk0.x f153212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.j0 f153213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f153214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f153216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jk0.x f153217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qk0.d f153218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f153219h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$saveActivityTypes$1$2$editGearTask$1", f = "GearDetailsViewModel.kt", l = {293}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f153221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ jk0.x f153222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, jk0.x xVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f153221b = h0Var;
            this.f153222c = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f153221b, this.f153222c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153220a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kk0.b bVar = this.f153221b.f153147b;
            this.f153220a = 1;
            Object objD = bVar.d(this.f153222c, this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$saveActivityTypes$1$2$resolveConflictsTask$1", f = "GearDetailsViewModel.kt", l = {296}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f153224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qk0.d f153225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0 h0Var, qk0.d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f153224b = h0Var;
            this.f153225c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f153224b, this.f153225c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153223a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            mk0.l lVar = this.f153224b.f153148c;
            ArrayList arrayListX = oi0.c.X(this.f153225c.f145087b);
            this.f153223a = 1;
            lVar.getClass();
            Object objE = o53.c0.e(new mk0.i(arrayListX, lVar, null), this);
            return objE == aVar ? aVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(jk0.x xVar, qk0.d dVar, h0 h0Var, t13.d<? super l0> dVar2) {
        super(2, dVar2);
        this.f153217f = xVar;
        this.f153218g = dVar;
        this.f153219h = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l0 l0Var = new l0(this.f153217f, this.f153218g, this.f153219h, dVar);
        l0Var.f153216e = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:31:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0135  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        jk0.x xVarB;
        o53.j0 j0VarJ;
        Object objC;
        v2 v2Var;
        Object objAwait;
        jk0.x xVar;
        boolean zBooleanValue;
        p2 p2Var;
        Object value;
        p2 p2Var2;
        Object value2;
        o53.b0 b0Var = (o53.b0) this.f153216e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153215d;
        h0 h0Var = this.f153219h;
        if (i14 == 0) {
            o13.r.b(obj);
            qk0.d dVar = this.f153218g;
            List<am.x0> list = dVar.f145086a;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new jk0.g(((am.x0) it.next()).f4358a, Boolean.TRUE, (Boolean) null, 4, (p005kotlin.jvm.internal.j) null));
            }
            xVarB = jk0.x.b(this.f153217f, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, 8388599);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(h0Var, xVarB, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new b(h0Var, dVar, null), 3);
            this.f153216e = b0Var;
            this.f153212a = xVarB;
            this.f153213b = j0VarJ;
            this.f153215d = 1;
            objC = j0VarJ2.C(this);
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f153213b;
            jk0.x xVar2 = this.f153212a;
            o13.r.b(obj);
            xVarB = xVar2;
            objC = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2 v2Var2 = this.f153214c;
            xVar = this.f153212a;
            o13.r.b(obj);
            v2Var = v2Var2;
            objAwait = obj;
        }
        zBooleanValue = ((Boolean) objAwait).booleanValue();
        if (v2Var instanceof v2.b) {
            h0Var.y4(xVar);
            if (!zBooleanValue) {
                a2 a2Var = a2.GEAR;
                i2.f36769a.getClass();
                i2.a.p(a2Var, "GearDetailsViewModel", "Gear saved, but default gear conflicts could not be fully resolved.");
                p2Var2 = h0Var.f153149d;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.Failed, null, null, false, false, 247)));
            }
        } else {
            if (v2Var instanceof v2.a) {
                lc.u0.r();
                return null;
            }
            a2 a2Var2 = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error saving default activity types. ");
            i2.f36769a.getClass();
            i2.a.p(a2Var2, "GearDetailsViewModel", strD);
            p2Var = h0Var.f153149d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.Failed, null, null, false, false, 247)));
        }
        return Unit.INSTANCE;
        v2Var = (v2) objC;
        this.f153216e = b0Var;
        this.f153212a = xVarB;
        this.f153213b = null;
        this.f153214c = v2Var;
        this.f153215d = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            xVar = xVarB;
            zBooleanValue = ((Boolean) objAwait).booleanValue();
            if (v2Var instanceof v2.b) {
                h0Var.y4(xVar);
                if (!zBooleanValue) {
                    a2 a2Var3 = a2.GEAR;
                    i2.f36769a.getClass();
                    i2.a.p(a2Var3, "GearDetailsViewModel", "Gear saved, but default gear conflicts could not be fully resolved.");
                    p2Var2 = h0Var.f153149d;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.Failed, null, null, false, false, 247)));
                }
            } else {
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var4 = a2.GEAR;
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error saving default activity types. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var4, "GearDetailsViewModel", strD2);
                p2Var = h0Var.f153149d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.Failed, null, null, false, false, 247)));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
