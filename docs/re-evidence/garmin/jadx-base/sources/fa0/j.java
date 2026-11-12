package fa0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p92.o;
import q92.v;
import q92.x;
import r53.p2;
import y80.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentViewModel$revokeConsent$1", f = "DeviceSetupConsentViewModel.kt", l = {137}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f70148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f70149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f70151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f70152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f70153f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentViewModel$revokeConsent$1$1$2", f = "DeviceSetupConsentViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f70155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f70156c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70156c = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f70156c, dVar);
            aVar.f70155b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            b0 b0Var = (b0) this.f70155b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70154a;
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ConsentViewModel", "Save isAutoActivityDetectEnabledV2 false device setting for pendingActivityCapable device");
                h hVar = this.f70156c;
                w wVar = hVar.f70127i;
                long j8 = hVar.f70121c.f143493a;
                z80.f fVar = new z80.f((List) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, Boolean.FALSE, 127, (p005kotlin.jvm.internal.j) null);
                this.f70155b = b0Var;
                this.f70154a = 1;
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
            String strH = com.airbnb.lottie.animation.keyframe.a.h("Save isAutoActivityDetectEnabledV2 false completed successfully: ", !(objB instanceof q.b));
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ConsentViewModel", strH);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70157a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.DI_CONNECT_AUTO_ACTIVITY_DETECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f70157a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, x xVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f70152e = hVar;
        this.f70153f = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f70152e, this.f70153f, dVar);
        jVar.f70151d = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        Object value;
        Object objU;
        x xVar;
        Object value2;
        b0 b0Var = (b0) this.f70151d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70150c;
        if (i14 == 0) {
            r.b(obj);
            hVar = this.f70152e;
            LinkedHashMap linkedHashMap = hVar.f70129k;
            x xVar2 = this.f70153f;
            s92.g gVar = (s92.g) linkedHashMap.get(xVar2);
            if (gVar != null) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "ConsentViewModel", "Revoking consent for consentTypeId: " + xVar2);
                p2 p2Var = hVar.f70132n;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new c(true, null, null, null, null, 30, null)));
                o oVar = o.f136619a;
                this.f70151d = b0Var;
                this.f70148a = xVar2;
                this.f70149b = hVar;
                this.f70150c = 1;
                objU = oVar.u(xVar2, gVar, this);
                if (objU == aVar) {
                    return aVar;
                }
                xVar = xVar2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h hVar2 = this.f70149b;
        xVar = this.f70148a;
        r.b(obj);
        hVar = hVar2;
        objU = obj;
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "ConsentViewModel", "Revoke consent result for consentTypeId: " + xVar + " is " + ((v) objU));
        if (b.f70157a[xVar.ordinal()] == 1 && hVar.f70121c.f143502j) {
            ge1.b.T(c0.a(hVar.f70128j), null, null, new a(hVar, null), 3);
        }
        List list = (List) hVar.f70130l.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                String str = ((ca0.j.c) obj2).f26297e;
                if ((str != null ? x.valueOf(str) : null) == xVar) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "ConsentViewModel", "Removing dependent consents for consentTypeId: " + xVar + ", dependentConsent: " + arrayList);
                p2 p2Var2 = hVar.f70130l;
                List list2 = (List) p2Var2.getValue();
                p2Var2.setValue(list2 != null ? h0.z0(list2, h0.g1(arrayList)) : null);
            }
        }
        p2 p2Var3 = hVar.f70132n;
        do {
            value2 = p2Var3.getValue();
        } while (!p2Var3.b(value2, new c(false, null, null, fa0.a.REVOKE, null, 23, null)));
        return Unit.INSTANCE;
    }
}
