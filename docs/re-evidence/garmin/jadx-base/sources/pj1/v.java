package pj1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$onLTEActivationStatusUpdate$1", f = "SafetyFeaturesViewModel.kt", l = {1018, 1020, 1023}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi1.e f138000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f138001c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$onLTEActivationStatusUpdate$1$1", f = "SafetyFeaturesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f138002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wi1.e f138003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f138004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wi1.e eVar, s sVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138003b = eVar;
            this.f138004c = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f138003b, this.f138004c, dVar);
            aVar.f138002a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            wi1.e eVar = this.f138003b;
            if (eVar != null) {
                boolean z14 = eVar.f185497a;
                boolean z15 = eVar.f185498b;
                s sVar = this.f138004c;
                sVar.f137911m = z14;
                if (z14) {
                    sVar.f137903e.m(Boolean.valueOf(z15));
                }
                a2 a2Var = a2.SAFETY_FEATURES;
                String str = "onLTEActivationStatusUpdate: LTE Sub " + sVar.f137911m + ", supported country " + z15;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SafetyFeaturesViewModel", str);
            } else {
                a2 a2Var2 = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "SafetyFeaturesViewModel", "onLTEActivationStatusUpdate: problem in getting activation object");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wi1.e eVar, s sVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f138000b = eVar;
        this.f138001c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f138000b, this.f138001c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (ge1.b.e0(r9, r1, r8) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g3 g3Var;
        List list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137999a;
        wi1.e eVar = this.f138000b;
        s sVar = this.f138001c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (eVar == null || !eVar.f185497a) {
                x53.c cVar = s0.f129406a;
                t1 t1Var = u53.o.f168762a;
                a aVar2 = new a(eVar, sVar, null);
                this.f137999a = 3;
            } else {
                hl.a aVar3 = sVar.f137981q;
                this.f137999a = 1;
                if (sVar.z4(aVar3, this) != aVar) {
                    g3Var = (g3) sVar.f137906h.d();
                    if (g3Var != null) {
                        list = (List) g3Var.f35301b;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        this.f137999a = 2;
                        if (sVar.A4(this) != aVar) {
                            x53.c cVar2 = s0.f129406a;
                            t1 t1Var2 = u53.o.f168762a;
                            a aVar4 = new a(eVar, sVar, null);
                            this.f137999a = 3;
                        }
                    } else {
                        x53.c cVar3 = s0.f129406a;
                        t1 t1Var3 = u53.o.f168762a;
                        a aVar5 = new a(eVar, sVar, null);
                        this.f137999a = 3;
                    }
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            g3Var = (g3) sVar.f137906h.d();
            if (g3Var != null) {
                list = (List) g3Var.f35301b;
            } else {
                list = null;
            }
            if (list == null) {
                this.f137999a = 2;
                if (sVar.A4(this) != aVar) {
                    x53.c cVar4 = s0.f129406a;
                    t1 t1Var4 = u53.o.f168762a;
                    a aVar6 = new a(eVar, sVar, null);
                    this.f137999a = 3;
                }
            } else {
                x53.c cVar5 = s0.f129406a;
                t1 t1Var5 = u53.o.f168762a;
                a aVar7 = new a(eVar, sVar, null);
                this.f137999a = 3;
            }
            return aVar;
        }
        if (i14 == 2) {
            o13.r.b(obj);
            x53.c cVar6 = s0.f129406a;
            t1 t1Var6 = u53.o.f168762a;
            a aVar8 = new a(eVar, sVar, null);
            this.f137999a = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
