package xe2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AbstractBaseActivity$generatePortalTokenForLockToEmailAddress$2", f = "AbstractBaseActivity.kt", l = {332, 346}, m = "invokeSuspend")
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.a f190452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f190453c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190454a;

        static {
            int[] iArr = new int[re2.b.c.values().length];
            try {
                iArr[re2.b.c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[re2.b.c.MULTI_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f190454a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.garmin.android.library.mobileauth.ui.a aVar, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f190452b = aVar;
        this.f190453c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f190452b, this.f190453c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r11 == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190451a;
        com.garmin.android.library.mobileauth.ui.a aVar2 = this.f190452b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return wc2.b.a((wc2.a) obj);
        }
        o13.r.b(obj);
        re2.b.f152215a.getClass();
        int i15 = a.f190454a[re2.b.f152226l.ordinal()];
        if (i15 == 1) {
            this.f190451a = 1;
            obj = re2.b.q(this);
        } else {
            if (i15 != 2) {
                lc.u0.r();
                return null;
            }
            ve2.m mVarS9 = aVar2.S9();
            if (mVarS9 == null || (eVar = mVarS9.f177786a) == null) {
                kg.f.n("onAttach: null 'MultiUserMode' object");
                return null;
            }
            ve2.e eVar = eVar;
            sc2.l lVarC = aVar2.R9().c(eVar);
            lVarC.getClass();
            rc2.w wVar = new rc2.w(aVar2, this.f190453c, eVar, lVarC, aVar2.R9().d());
            this.f190451a = 2;
            x53.c cVar = o53.s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new rc2.v(wVar, null), this);
        }
        return aVar;
        ve2.e eVar2 = (ve2.e) obj;
        ve2.e eVar3 = eVar2;
        sc2.l lVarC2 = aVar2.R9().c(eVar3);
        lVarC2.getClass();
        rc2.w wVar2 = new rc2.w(aVar2, this.f190453c, eVar3, lVarC2, aVar2.R9().d());
        this.f190451a = 2;
        x53.c cVar2 = o53.s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new rc2.v(wVar2, null), this);
    }
}
