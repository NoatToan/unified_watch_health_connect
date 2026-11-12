package cf2;

import c83.a0;
import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "Lcf2/p;", "<anonymous>", "(Lo53/b0;)Lcf2/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.data.CampaignRequestBuilder$executeHTTPRequest$2", f = "CampaignRequestBuilder.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super p<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super a0<Object>>, Object> f27040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Logger f27041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.l<? super t13.d<? super a0<Object>>, ? extends Object> lVar, Logger logger, String str, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f27040b = lVar;
        this.f27041c = logger;
        this.f27042d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f27040b, this.f27041c, this.f27042d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super p<Object>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27039a;
        Logger logger = this.f27041c;
        String str = this.f27042d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                e23.l<t13.d<? super a0<Object>>, Object> lVar = this.f27040b;
                this.f27039a = 1;
                objInvoke = lVar.invoke(this);
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objInvoke = obj;
            }
            a0 a0Var = (a0) objInvoke;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            if (response.isSuccessful() && t7 != 0) {
                return new p.b(t7, response.code());
            }
            if (response.isSuccessful()) {
                return new p.b(Unit.INSTANCE, response.code());
            }
            logger.error("CampaignRequestBuilder", str + " -> Server error response code=[" + response.code() + "] message=[" + response.message() + "].");
            StringBuilder sb3 = new StringBuilder("Error Occurred during getting safe Api result, ");
            sb3.append(str);
            sb3.append(", Response [");
            sb3.append(a0Var);
            sb3.append("]");
            IOException iOException = new IOException(sb3.toString());
            Integer num = new Integer(response.code());
            ResponseBody responseBody = a0Var.f25747c;
            return new p.a(iOException, num, responseBody != null ? responseBody.string() : null);
        } catch (HttpException e4) {
            logger.error("CampaignRequestBuilder", str + " -> Server error response code=[" + e4.code() + "] message=[" + e4.message() + "].");
            return new p.a(new IOException("Error Occurred during getting safe Api result, " + str + ", ERROR [" + e4 + "]"), new Integer(e4.code()), null, 4, null);
        } catch (Throwable th3) {
            logger.error("CampaignRequestBuilder", str + " -> error message=[" + th3 + "].");
            return new p.a(new IOException("Error Occurred during getting safe Api result, " + str + ", ERROR [" + th3 + "]"), null, null, 6, null);
        }
    }
}
