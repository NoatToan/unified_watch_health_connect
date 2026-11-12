package vf1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import i3.e5;
import java.util.Iterator;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import u53.o;
import v13.i;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionDelegateImpl$onFirstEcgReadingRecorded$1", f = "SaMDAppSessionDelegateImpl.kt", l = {142, 170, 177}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f177884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ff0.i f177885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f177886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f177887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f177888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f177889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f177890g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionDelegateImpl$onFirstEcgReadingRecorded$1$1", f = "SaMDAppSessionDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f177891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<Boolean> f177892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f177893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f177894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, r0<Boolean> r0Var, long j8, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f177891a = cVar;
            this.f177892b = r0Var;
            this.f177893c = j8;
            this.f177894d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f177891a, this.f177892b, this.f177893c, this.f177894d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Iterator it = this.f177891a.f177874a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(this.f177893c, this.f177892b.f105810a, this.f177894d);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j8, String str, c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f177888e = j8;
        this.f177889f = str;
        this.f177890g = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f177888e, this.f177889f, this.f177890g, dVar);
        dVar2.f177887d = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
    
        if (ge1.b.e0(r0, r11, r18) == r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r6v17, types: [T, java.lang.Object] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r14;
        r0 r0VarS;
        ff0.i iVar;
        Object objO;
        r0 r0Var;
        b0 b0Var = (b0) this.f177887d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r15 = this.f177886c;
        long j8 = this.f177888e;
        try {
            if (r15 == 0) {
                r0VarS = g.s(obj);
                iVar = (ff0.i) KoinJavaComponent.get$default(ff0.i.class, null, null, 6, null);
                this.f177887d = b0Var;
                this.f177884a = r0VarS;
                this.f177885b = iVar;
                this.f177886c = 1;
                objO = iVar.o(j8, this.f177889f, this);
                if (objO != aVar) {
                }
                r0Var = r0VarS;
                return aVar;
            }
            if (r15 == 1) {
                ff0.i iVar2 = this.f177885b;
                r0 r0Var2 = this.f177884a;
                r.b(obj);
                iVar = iVar2;
                r0Var = r0Var2;
                objO = obj;
            } else if (r15 == 2) {
                r0 r0Var3 = this.f177884a;
                r.b(obj);
                r15 = r0Var3;
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onFirstEcgReadingRecorded] Updated ECG enabled preference");
                r14 = r15;
                ?? r16 = r14;
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar2 = new a(this.f177890g, r16, this.f177888e, this.f177889f, null);
                this.f177887d = null;
                this.f177884a = null;
                this.f177885b = null;
                this.f177886c = 3;
            } else {
                if (r15 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            r0Var = r0VarS;
            rf1.f fVar = (rf1.f) objO;
            if (fVar instanceof rf1.f.d) {
                ?? r17 = ((rf1.f.d) fVar).f152427a;
                r0Var.f105810a = r17;
                a2 a2Var2 = a2.ONBOARDING;
                String strF = e5.f(r17, "[onFirstEcgReadingRecorded] ECG app enabled on device=");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "SaMDAppSessionDelegate", strF);
            } else if (fVar instanceof rf1.f.a) {
                a2 a2Var3 = a2.ONBOARDING;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((rf1.f.a) fVar).f152424a, "[onFirstEcgReadingRecorded] error: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "SaMDAppSessionDelegate", strD);
            } else if (fVar instanceof rf1.f.b) {
                a2 a2Var4 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.f(a2Var4, "SaMDAppSessionDelegate", "[onFirstEcgReadingRecorded] ECG not supported by device");
            } else {
                if (!s.g(fVar, rf1.f.c.f152426a)) {
                    u0.r();
                    return null;
                }
                a2 a2Var5 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.f(a2Var5, "SaMDAppSessionDelegate", "[onFirstEcgReadingRecorded] Device not connected");
            }
            boolean zG = s.g(r0Var.f105810a, Boolean.TRUE);
            r14 = r0Var;
            if (zG) {
                iVar.d(j8);
                a2 a2Var6 = a2.ONBOARDING;
                String strE = org.apache.commons.lang3.e.e(j8, "[onFirstEcgReadingRecorded] Onboarding item updated for device=");
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "SaMDAppSessionDelegate", strE);
                this.f177887d = b0Var;
                this.f177884a = r0Var;
                this.f177885b = null;
                this.f177886c = 2;
                r15 = r0Var;
                if (hf0.d.a(this) != aVar) {
                    a2 a2Var7 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var7, "SaMDAppSessionDelegate", "[onFirstEcgReadingRecorded] Updated ECG enabled preference");
                    r14 = r15;
                    ?? r18 = r14;
                    x53.c cVar2 = s0.f129406a;
                    t1 t1Var2 = o.f168762a;
                    a aVar3 = new a(this.f177890g, r18, this.f177888e, this.f177889f, null);
                    this.f177887d = null;
                    this.f177884a = null;
                    this.f177885b = null;
                    this.f177886c = 3;
                }
            } else {
                ?? r19 = r14;
                x53.c cVar3 = s0.f129406a;
                t1 t1Var3 = o.f168762a;
                a aVar4 = new a(this.f177890g, r19, this.f177888e, this.f177889f, null);
                this.f177887d = null;
                this.f177884a = null;
                this.f177885b = null;
                this.f177886c = 3;
            }
        } catch (Exception e4) {
            a2 a2Var8 = a2.ONBOARDING;
            String strN = fb1.c.n("[onFirstEcgReadingRecorded] Update ECG enabled preference exception: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var8, "SaMDAppSessionDelegate", strN);
            r14 = r15;
        }
        r0Var = r0VarS;
        return aVar;
    }
}
