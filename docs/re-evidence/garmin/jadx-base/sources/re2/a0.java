package re2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$safeGetOAuth2Token$returnObj$1", f = "AuthenticationHelper.kt", l = {1630}, m = "invokeSuspend")
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f152211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc2.a f152212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f152213d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152214a;

        static {
            int[] iArr = new int[sc2.a.values().length];
            try {
                iArr[sc2.a.f158478d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc2.a.f158477c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152214a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(String str, sc2.a aVar, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f152211b = str;
        this.f152212c = aVar;
        this.f152213d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f152211b, this.f152212c, this.f152213d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152210a;
        sc2.a aVar2 = this.f152212c;
        String str2 = this.f152211b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b.f152215a.getClass();
                b.J(str2, aVar2);
                b.M(aVar2);
                e23.l<t13.d<Object>, Object> lVar = this.f152213d;
                this.f152210a = 1;
                obj = lVar.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (obj != null) {
                int i15 = a.f152214a[aVar2.ordinal()];
                if (i15 == 1) {
                    str = ((sc2.o) obj).f158544a;
                } else {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("credentialType " + aVar2.name() + " not handled");
                    }
                    str = ((sc2.m) obj).f158528b;
                }
                if (str != null) {
                    return str;
                }
            }
            b.f152216b.warn(str2 + ": runOAuth2 returned null");
            return "";
        } catch (Throwable th3) {
            b.f152216b.error(str2, th3);
            return "";
        }
    }
}
