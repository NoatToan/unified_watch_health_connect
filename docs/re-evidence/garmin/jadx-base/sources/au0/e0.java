package au0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityRepositoryWrapper$registerListener$3", f = "LiveActivityRepositoryWrapper.kt", l = {150}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f12891c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f12892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z f12893b;

        /* JADX INFO: renamed from: au0.e0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityRepositoryWrapper$registerListener$3$1", f = "LiveActivityRepositoryWrapper.kt", l = {157, 158}, m = "emit", v = 2)
        public static final class C0182a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f12894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f12895b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<T> f12896c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f12897d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0182a(a<? super T> aVar, t13.d<? super C0182a> dVar) {
                super(dVar);
                this.f12896c = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f12895b = obj;
                this.f12897d |= Integer.MIN_VALUE;
                return this.f12896c.a(false, this);
            }
        }

        public a(o53.b0 b0Var, z zVar) {
            this.f12892a = b0Var;
            this.f12893b = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            if (r10 == r1) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(boolean z14, t13.d<? super Unit> dVar) {
            C0182a c0182a;
            Object objA;
            boolean zA;
            x xVar;
            if (dVar instanceof C0182a) {
                c0182a = (C0182a) dVar;
                int i14 = c0182a.f12897d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0182a.f12897d = i14 - Integer.MIN_VALUE;
                } else {
                    c0182a = new C0182a(this, dVar);
                }
            } else {
                c0182a = new C0182a(this, dVar);
            }
            Object obj = c0182a.f12895b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0182a.f12897d;
            z zVar = this.f12893b;
            if (i15 != 0) {
                if (i15 == 1) {
                    z14 = c0182a.f12894a;
                    o13.r.b(obj);
                    c0182a.f12894a = z14;
                    c0182a.f12897d = 2;
                    objA = zVar.f13007f.a(c0182a);
                    if (objA != aVar) {
                        objA = Unit.INSTANCE;
                    }
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z14 = c0182a.f12894a;
                    o13.r.b(obj);
                }
                jg2.a aVar2 = (jg2.a) zVar.f13014m.f150540a.getValue();
                zVar.f13009h.getClass();
                zA = bh2.d.a(aVar2, z14);
                xVar = zVar.f13008g;
                if (xVar.d() != zA) {
                    xVar.c(zA);
                    a2 a2Var = a2.SUBSCRIPTIONS;
                    String strH = com.airbnb.lottie.animation.keyframe.a.h("Set locked in Activity Recording session: ", zA);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "LiveActivityRepositoryWrapper", strH);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            a2 a2Var2 = a2.SUBSCRIPTIONS;
            String strH2 = com.airbnb.lottie.animation.keyframe.a.h("Received hasActiveSession == ", z14);
            i2.f36769a.getClass();
            i2.a.k(a2Var2, "LiveActivityRepositoryWrapper", strH2);
            if (!z14) {
                zVar.f13010i.setValue(null);
                zVar.f13011j.k(null, Boolean.FALSE);
                zVar.f13019r = null;
                c2 c2Var = zVar.f13020s;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                s sVar = zVar.f13007f;
                c0182a.f12894a = z14;
                c0182a.f12897d = 1;
                if (sVar.c() != aVar) {
                    c0182a.f12894a = z14;
                    c0182a.f12897d = 2;
                    objA = zVar.f13007f.a(c0182a);
                    if (objA != aVar) {
                        objA = Unit.INSTANCE;
                    }
                }
                return aVar;
            }
            jg2.a aVar3 = (jg2.a) zVar.f13014m.f150540a.getValue();
            zVar.f13009h.getClass();
            zA = bh2.d.a(aVar3, z14);
            xVar = zVar.f13008g;
            if (xVar.d() != zA) {
                xVar.c(zA);
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                String strH3 = com.airbnb.lottie.animation.keyframe.a.h("Set locked in Activity Recording session: ", zA);
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "LiveActivityRepositoryWrapper", strH3);
            }
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public final /* bridge */ /* synthetic */ Object emit(Object obj, t13.d dVar) {
            return a(((Boolean) obj).booleanValue(), dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(z zVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f12891c = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f12891c, dVar);
        e0Var.f12890b = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f12890b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12889a;
        if (i14 == 0) {
            o13.r.b(obj);
            z zVar = this.f12891c;
            p2 p2Var = zVar.f13003b.f131784m;
            a aVar2 = new a(b0Var, zVar);
            this.f12890b = null;
            this.f12889a = 1;
            if (p2Var.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
