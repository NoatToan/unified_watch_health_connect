package re2;

import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/m;", "<anonymous>", "(Lo53/b0;)Lsc2/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getOAuth2DICredentials$2", f = "AuthenticationHelper.kt", l = {1381, 1386}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f152293b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsc2/m;", "<anonymous>", "()Lsc2/m;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getOAuth2DICredentials$2$1", f = "AuthenticationHelper.kt", l = {1382}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super sc2.m>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152294a;

        public a(t13.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super sc2.m> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152294a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            re2.b bVar = re2.b.f152215a;
            this.f152294a = 1;
            Object objC = bVar.C("getOAuth2DICredentials", false, null, this);
            return objC == aVar ? aVar : objC;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152295a;

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
            f152295a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ve2.d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f152293b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f152293b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.m> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r6 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r6 == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152292a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (sc2.m) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (sc2.m) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        re2.b bVar = re2.b.f152215a;
        bVar.getClass();
        int i15 = b.f152295a[re2.b.f152226l.ordinal()];
        ve2.d dVar = this.f152293b;
        if (i15 != 1) {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            this.f152292a = 2;
            obj = bVar.C("getOAuth2DICredentials", false, dVar, this);
        } else {
            if (dVar != null) {
                com.nimbusds.jose.shaded.gson.internal.a.t("getOAuth2DICredentials: passing [multiUserAuthGarminAccount] object is only allowed by the multi-user-auth library module");
                return null;
            }
            cz2.c cVar = (cz2.c) re2.b.f152229o.getValue();
            a aVar2 = new a(null);
            this.f152292a = 1;
            obj = cVar.a(aVar2, this);
        }
        return aVar;
    }
}
