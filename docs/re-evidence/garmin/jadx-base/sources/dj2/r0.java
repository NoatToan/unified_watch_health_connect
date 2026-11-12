package dj2;

import ch.qos.logback.classic.Logger;
import com.google.gson.Gson;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "Lhj2/j;", "<anonymous>", "(Lo53/b0;)Lhj2/j;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.ICustomerManagementRepository$safeApiCall$2", f = "ICustomerManagementRepository.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super hj2.j<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super c83.a0<Object>>, Object> f60127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dj2.a.EnumC1278a f60128c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60129a;

        static {
            int[] iArr = new int[dj2.a.EnumC1278a.values().length];
            try {
                iArr[dj2.a.EnumC1278a.ValidateAddress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f60129a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(e23.l<? super t13.d<? super c83.a0<Object>>, ? extends Object> lVar, dj2.a.EnumC1278a enumC1278a, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f60127b = lVar;
        this.f60128c = enumC1278a;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f60127b, this.f60128c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super hj2.j<Object>> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strString;
        dj2.a.EnumC1278a enumC1278a = this.f60128c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60126a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                e23.l<t13.d<? super c83.a0<Object>>, Object> lVar = this.f60127b;
                this.f60126a = 1;
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
            c83.a0 a0Var = (c83.a0) obj;
            hj2.i.f84029a.getClass();
            Logger logger = hj2.i.f84030b;
            Response response = a0Var.f25745a;
            T t7 = a0Var.f25746b;
            ResponseBody responseBody = a0Var.f25747c;
            logger.debug("METHOD: {}", response.request().method());
            logger.debug("URL: {}", response.request().url());
            logger.debug("CODE: {}", new Integer(response.code()));
            if (a.f60129a[enumC1278a.ordinal()] != 1) {
                if (response.isSuccessful()) {
                    return t7 != 0 ? new hj2.j.b(new Integer(response.code()), t7, enumC1278a.name()) : new hj2.j.b(new Integer(response.code()), null, enumC1278a.name());
                }
                logger.debug("HEADERS: {}", response.headers());
                logger.debug("ERROR BODY: {}", responseBody);
                return new hj2.j.a(new Integer(response.code()), response.message(), enumC1278a.name());
            }
            int iCode = response.code();
            if (iCode == 200) {
                return t7 != 0 ? new hj2.j.b(new Integer(response.code()), t7, enumC1278a.name()) : new hj2.j.b(new Integer(response.code()), null, enumC1278a.name());
            }
            if (iCode != 400) {
                return new hj2.j.a(new Integer(response.code()), response.message(), null, 4, null);
            }
            if (responseBody == null || (strString = responseBody.string()) == null) {
                return new hj2.j.b(new Integer(response.code()), null, enumC1278a.name());
            }
            mj2.b.f119089a.getClass();
            Gson gson = mj2.b.f119090b;
            gson.getClass();
            return new hj2.j.b(new Integer(response.code()), (fj2.b) gson.fromJson(strString, fj2.b.class), enumC1278a.name());
        } catch (Exception e4) {
            hj2.i.f84029a.getClass();
            hj2.i.f84030b.debug("EXCEPTION: " + e4.getMessage());
            return new hj2.j.a(new Integer(-1), e4.getMessage(), null, 4, null);
        }
    }
}
