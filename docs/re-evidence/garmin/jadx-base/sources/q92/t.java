package q92;

import java.io.IOException;
import lc.u0;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$updateThirdPartyConsent$2", f = "ConsentRepository.kt", l = {325}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<b0, t13.d<? super a0<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f143761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f143762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f143763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s92.g f143764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s92.l f143765g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$updateThirdPartyConsent$2$1", f = "ConsentRepository.kt", l = {328, 329}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f143767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f143768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f143769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s92.g f143770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s92.l f143771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b0 f143772g;

        /* JADX INFO: renamed from: q92.t$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2712a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f143773a;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.OPT_IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.OPT_OUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f143773a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, f fVar, String str, s92.g gVar, s92.l lVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143767b = yVar;
            this.f143768c = fVar;
            this.f143769d = str;
            this.f143770e = gVar;
            this.f143771f = lVar;
            this.f143772g = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143767b, this.f143768c, this.f143769d, this.f143770e, this.f143771f, this.f143772g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        
            if (r10 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        
            if (r10 == r0) goto L33;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c83.a0 a0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143766a;
            s92.g gVar = this.f143770e;
            y yVar = this.f143767b;
            String str = this.f143769d;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = C2712a.f143773a[yVar.ordinal()];
                s92.l lVar = this.f143771f;
                f fVar = this.f143768c;
                if (i15 == 1) {
                    this.f143766a = 1;
                    r92.a aVar2 = fVar.f143628a;
                    obj = lVar != null ? aVar2.c(f.b(gVar, str, lVar), this) : aVar2.n(f.b(gVar, str, null), this);
                } else {
                    if (i15 != 2) {
                        u0.r();
                        return null;
                    }
                    this.f143766a = 2;
                    r92.a aVar3 = fVar.f143628a;
                    if (lVar == null) {
                        obj = aVar3.f(f.b(gVar, str, null), this);
                        if (obj != aVar) {
                            obj = (c83.a0) obj;
                        }
                    } else {
                        obj = aVar3.q(str, false, f.a(gVar, str, false, lVar), this);
                        if (obj != aVar) {
                            obj = (c83.a0) obj;
                        }
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                a0Var = (c83.a0) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                a0Var = (c83.a0) obj;
            }
            Response response = a0Var.f25745a;
            if (!response.isSuccessful()) {
                int iCode = response.code();
                String strMessage = response.message();
                StringBuilder sbK = androidx.core.view.j.k(iCode, "Error updating consent ", str, " code[", "] ");
                sbK.append(strMessage);
                IOException iOException = new IOException(sbK.toString());
                p92.y.f136664a.getClass();
                p92.y.a.d("ConsentRepository", iOException);
                return new a0.a(iOException);
            }
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentRepository", "updateConsent(" + str + ", " + yVar + ") successfully consentText[" + gVar + "]");
            return new a0.b(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, y yVar, f fVar, s92.g gVar, s92.l lVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f143761c = str;
        this.f143762d = yVar;
        this.f143763e = fVar;
        this.f143764f = gVar;
        this.f143765g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f143761c, this.f143762d, this.f143763e, this.f143764f, this.f143765g, dVar);
        tVar.f143760b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends Unit>> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143759a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143762d, this.f143763e, this.f143761c, this.f143764f, this.f143765g, (b0) this.f143760b, null);
        String strN = fb1.c.n("Error updating third party app consent ", this.f143761c);
        this.f143759a = 1;
        Object objA = u92.b.a(aVar2, strN, this);
        return objA == aVar ? aVar : objA;
    }
}
