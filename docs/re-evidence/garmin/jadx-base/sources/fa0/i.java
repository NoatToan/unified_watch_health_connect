package fa0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import lc.u0;
import o13.q;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import q92.v;
import q92.x;
import r53.p2;
import y80.w;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentViewModel$grantConsent$1", f = "DeviceSetupConsentViewModel.kt", l = {75, 94, 100}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f70137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f70138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f70141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f70142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f70143g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentViewModel$grantConsent$1$4$2", f = "DeviceSetupConsentViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f70145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f70146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70146c = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f70146c, dVar);
            aVar.f70145b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            b0 b0Var = (b0) this.f70145b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70144a;
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ConsentViewModel", "Save isAutoActivityDetectEnabledV2 true device setting for pendingActivityCapable device");
                h hVar = this.f70146c;
                w wVar = hVar.f70127i;
                long j8 = hVar.f70121c.f143493a;
                z80.f fVar = new z80.f((List) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, Boolean.TRUE, 127, (p005kotlin.jvm.internal.j) null);
                this.f70145b = b0Var;
                this.f70144a = 1;
                objB = wVar.b(j8, fVar, this);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objB = ((q) obj).f128597a;
            }
            a2 a2Var2 = a2.DEVICE_SETUP;
            int i15 = q.f128596b;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("Save isAutoActivityDetectEnabledV2 true completed successfully: ", !(objB instanceof q.b));
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ConsentViewModel", strH);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70147a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.DI_CONNECT_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.DI_CONNECT_AUTO_ACTIVITY_DETECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70147a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, x xVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f70142f = hVar;
        this.f70143g = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f70142f, this.f70143g, dVar);
        iVar.f70141e = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r1 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b0, code lost:
    
        if (r1 == r2) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i14;
        Object objP;
        x xVar;
        Object value2;
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0;
        Object objA;
        Object value3;
        Object value4;
        a2 a2Var;
        int i15;
        Object objA2;
        p2 p2Var;
        Object value5;
        b0 b0Var = (b0) this.f70141e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f70140d;
        h hVar = this.f70142f;
        if (i16 == 0) {
            r.b(obj);
            boolean z14 = hVar.f70122d;
            p2 p2Var2 = hVar.f70132n;
            x xVar2 = this.f70143g;
            if (z14) {
                a2 a2Var2 = a2.DEVICE_SETUP;
                String strN = fb1.c.n("Checking parental approval request status for consent type: ", xVar2.f143819a);
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "ConsentViewModel", strN);
                do {
                    value2 = p2Var2.getValue();
                    gVarW0 = hVar.f70123e.W0();
                } while (!p2Var2.b(value2, new c(true, gVarW0 != null ? gVarW0.f46858b : null, null, null, null, 28, null)));
                e20.a aVar2 = hVar.f70124f;
                String str = xVar2.f143819a;
                this.f70141e = null;
                this.f70140d = 1;
                objA = aVar2.a(str, this);
            } else {
                s92.g gVar = (s92.g) hVar.f70129k.get(xVar2);
                if (gVar != null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "ConsentViewModel", "Granting consent for consentTypeId: " + xVar2);
                    do {
                        value = p2Var2.getValue();
                    } while (!p2Var2.b(value, new c(true, null, null, null, null, 30, null)));
                    o oVar = o.f136619a;
                    this.f70141e = b0Var;
                    this.f70137a = xVar2;
                    this.f70138b = hVar;
                    i14 = 0;
                    this.f70139c = 0;
                    this.f70140d = 2;
                    objP = oVar.p(xVar2, gVar, this);
                    if (objP != aVar) {
                        xVar = xVar2;
                        a2Var = a2.DEVICE_SETUP;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "ConsentViewModel", "Grant consent result for consentTypeId: " + xVar + " is " + ((v) objP));
                        i15 = b.f70147a[xVar.ordinal()];
                        if (i15 != 1) {
                            i2.a.b(a2Var, "ConsentViewModel", "Granting device upload consent");
                            o oVar2 = o.f136619a;
                            this.f70141e = b0Var;
                            this.f70137a = hVar;
                            this.f70138b = null;
                            this.f70139c = i14;
                            this.f70140d = 3;
                            objA2 = oVar2.A(true, true, this);
                        } else if (i15 == 2) {
                            ge1.b.T(c0.a(hVar.f70128j), null, null, new a(hVar, null), 3);
                        }
                        p2Var = hVar.f70132n;
                        do {
                            value5 = p2Var.getValue();
                        } while (!p2Var.b(value5, new c(false, null, null, fa0.a.GRANT, null, 23, null)));
                    }
                }
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                int i17 = this.f70139c;
                hVar = this.f70138b;
                xVar = (x) this.f70137a;
                r.b(obj);
                i14 = i17;
                objP = obj;
                a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ConsentViewModel", "Grant consent result for consentTypeId: " + xVar + " is " + ((v) objP));
                i15 = b.f70147a[xVar.ordinal()];
                if (i15 != 1) {
                    i2.a.b(a2Var, "ConsentViewModel", "Granting device upload consent");
                    o oVar3 = o.f136619a;
                    this.f70141e = b0Var;
                    this.f70137a = hVar;
                    this.f70138b = null;
                    this.f70139c = i14;
                    this.f70140d = 3;
                    objA2 = oVar3.A(true, true, this);
                } else if (i15 == 2 && hVar.f70121c.f143502j) {
                    ge1.b.T(c0.a(hVar.f70128j), null, null, new a(hVar, null), 3);
                }
                p2Var = hVar.f70132n;
                do {
                    value5 = p2Var.getValue();
                } while (!p2Var.b(value5, new c(false, null, null, fa0.a.GRANT, null, 23, null)));
            } else {
                if (i16 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h hVar2 = (h) this.f70137a;
                r.b(obj);
                hVar = hVar2;
                objA2 = obj;
            }
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "ConsentViewModel", "Device upload consent granted[" + ((Boolean) objA2) + "]");
            p2Var = hVar.f70132n;
            do {
                value5 = p2Var.getValue();
            } while (!p2Var.b(value5, new c(false, null, null, fa0.a.GRANT, null, 23, null)));
        } else {
            r.b(obj);
            objA = obj;
            v2 v2Var = (v2) objA;
            if (v2Var instanceof v2.b) {
                d1 d1Var = d1.f200951a;
                d20.a aVar3 = (d20.a) ((v2.b) v2Var).f47386a;
                d1Var.getClass();
                fa0.b bVar = d1.g(aVar3) ? fa0.b.CONSENT_PARENTAL_ALREADY_REQUESTED : fa0.b.CONSENT_PARENTAL_REQUEST_NEEDED;
                p2 p2Var3 = hVar.f70132n;
                do {
                    value4 = p2Var3.getValue();
                } while (!p2Var3.b(value4, new c(false, null, null, null, bVar, 15, null)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                p2 p2Var4 = hVar.f70132n;
                do {
                    value3 = p2Var4.getValue();
                } while (!p2Var4.b(value3, new c(false, null, null, fa0.a.CONSENT_PARENTAL_REQUEST_ERROR, null, 23, null)));
            }
        }
        return Unit.INSTANCE;
    }
}
