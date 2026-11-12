package q92;

import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$checkPassword$2", f = "ConsentRepository.kt", l = {509}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super a0<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f143634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f143635d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$checkPassword$2$1", f = "ConsentRepository.kt", l = {512, 513}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f143636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f143637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f143638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f143639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0 f143640e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143638c = fVar;
            this.f143639d = str;
            this.f143640e = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143638c, this.f143639d, this.f143640e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends String>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r6 == r0) goto L15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143637b;
            if (i14 == 0) {
                o13.r.b(obj);
                p92.o.f136619a.getClass();
                p92.o.l();
                p92.o.l();
                str = "garminConnect";
                this.f143636a = "garminConnect";
                this.f143637b = 1;
                obj = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).C(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                str = this.f143636a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            Response response = a0Var.f25745a;
            if (!response.isSuccessful() || (str2 = (String) a0Var.f25746b) == null || str2.length() <= 0) {
                IOException iOException = new IOException(sn.a.e(response.code(), "Error checkPassword code[", "] ", response.message()));
                p92.y.f136664a.getClass();
                p92.y.a.d("ConsentRepository", iOException);
                return new a0.a(iOException);
            }
            String strConcat = "checkPassword() successfully -> correct password = ".concat(str2);
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentRepository", strConcat);
            return new a0.b(str2);
            r92.b bVar = this.f143638c.f143630c;
            this.f143636a = null;
            this.f143637b = 2;
            obj = bVar.b((String) obj, this.f143639d, str, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f143634c = fVar;
        this.f143635d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f143634c, this.f143635d, dVar);
        gVar.f143633b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends String>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143632a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143634c, this.f143635d, (b0) this.f143633b, null);
        this.f143632a = 1;
        Object objA = u92.b.a(aVar2, "Error checkPassword", this);
        return objA == aVar ? aVar : objA;
    }
}
