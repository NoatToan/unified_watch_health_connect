package fa0;

import ca0.o1;
import e23.l;
import e23.p;
import i3.fe;
import i3.yd;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentScreenKt$DeviceSetupConsentRoute$1$1", f = "DeviceSetupConsentScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<c> f70104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<Boolean, Unit> f70105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f70106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f70107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f70108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f70109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o1 f70110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f70111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fe f70112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f70113j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentScreenKt$DeviceSetupConsentRoute$1$1$1$1", f = "DeviceSetupConsentScreen.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f70115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f70116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70115b = feVar;
            this.f70116c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f70115b, this.f70116c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70114a;
            if (i14 == 0) {
                r.b(obj);
                yd ydVar = yd.Short;
                this.f70114a = 1;
                if (fe.b(this.f70115b, this.f70116c, null, ydVar, this, 6) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70117a;

        static {
            int[] iArr = new int[fa0.a.values().length];
            try {
                iArr[fa0.a.GRANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fa0.a.REVOKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fa0.a.CONSENT_PARENTAL_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fa0.a.CONSENT_PARENTAL_REQUEST_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f70117a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(x3<c> x3Var, l<? super Boolean, Unit> lVar, boolean z14, e23.a<Unit> aVar, h hVar, b0 b0Var, o1 o1Var, e23.a<Unit> aVar2, fe feVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f70104a = x3Var;
        this.f70105b = lVar;
        this.f70106c = z14;
        this.f70107d = aVar;
        this.f70108e = hVar;
        this.f70109f = b0Var;
        this.f70110g = o1Var;
        this.f70111h = aVar2;
        this.f70112i = feVar;
        this.f70113j = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f70104a, this.f70105b, this.f70106c, this.f70107d, this.f70108e, this.f70109f, this.f70110g, this.f70111h, this.f70112i, this.f70113j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        fa0.a aVar2 = this.f70104a.getF182175a().f70097d;
        if (aVar2 != null) {
            int i14 = b.f70117a[aVar2.ordinal()];
            l<Boolean, Unit> lVar = this.f70105b;
            if (i14 != 1) {
                e23.a<Unit> aVar3 = this.f70107d;
                if (i14 != 2) {
                    h hVar = this.f70108e;
                    if (i14 == 3) {
                        hVar.x4();
                        ge1.b.T(this.f70109f, null, null, new a(this.f70112i, this.f70113j, null), 3);
                        o1 o1Var = o1.CREATE_ACCOUNT;
                        o1 o1Var2 = this.f70110g;
                        if (o1Var2 == o1Var || o1Var2 == o1.SIGN_IN) {
                            aVar3.invoke();
                        }
                    } else {
                        if (i14 != 4) {
                            u0.r();
                            return null;
                        }
                        hVar.x4();
                        this.f70111h.invoke();
                        aVar3.invoke();
                    }
                } else if (this.f70106c) {
                    aVar3.invoke();
                } else {
                    lVar.invoke(Boolean.FALSE);
                }
            } else {
                lVar.invoke(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
