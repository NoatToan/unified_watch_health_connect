package md2;

import c83.a0;
import com.google.common.net.HttpHeaders;
import d53.t;
import e23.l;
import java.io.IOException;
import o13.r;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lwc2/a;", "<anonymous>", "()Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.android.lib.networking.retrofit.repo.BaseRepository$safeApiResult$2", f = "BaseRepository.kt", l = {71}, m = "invokeSuspend")
public final class c extends i implements l<t13.d<? super wc2.a<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<t13.d<? super a0<Object>>, Object> f117942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Logger f117943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f117944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super t13.d<? super a0<Object>>, ? extends Object> lVar, Logger logger, String str, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f117942b = lVar;
        this.f117943c = logger;
        this.f117944d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f117942b, this.f117943c, this.f117944d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super wc2.a<Object>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Integer numI;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117941a;
        if (i14 == 0) {
            r.b(obj);
            this.f117941a = 1;
            obj = this.f117942b.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        a0 a0Var = (a0) obj;
        T t7 = a0Var.f25746b;
        Response response = a0Var.f25745a;
        if (response.isSuccessful() && t7 != 0) {
            return new wc2.a.b(t7, response.code());
        }
        if (response.isSuccessful()) {
            return new wc2.a.b(Unit.INSTANCE, response.code());
        }
        int iCode = response.code();
        String strMessage = response.message();
        StringBuilder sb3 = new StringBuilder();
        String str = this.f117944d;
        sb3.append(str);
        sb3.append(" -> server error response code=[");
        sb3.append(iCode);
        sb3.append("] message=[");
        sb3.append(strMessage);
        sb3.append("].");
        this.f117943c.error(sb3.toString());
        IOException iOException = new IOException("Error Occurred during getting safe Api result, " + str + ", Response [" + a0Var + "]");
        Integer num = new Integer(response.code());
        ResponseBody responseBody = a0Var.f25747c;
        Integer numI2 = null;
        String strString = responseBody != null ? responseBody.string() : null;
        String str2 = response.headers().get(HttpHeaders.RETRY_AFTER);
        if (str2 == null || (numI = t.i(str2)) == null) {
            String str3 = response.headers().get(com.mapbox.common.HttpHeaders.RETRY_AFTER);
            if (str3 != null) {
                numI2 = t.i(str3);
            }
        } else {
            numI2 = numI;
        }
        return new wc2.a.C3415a(iOException, num, strString, numI2);
    }
}
