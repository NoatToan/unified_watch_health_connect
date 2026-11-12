package my2;

import c83.a0;
import com.garmin.sync.gc.server.CheckDeviceFirmwareUpdateException;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmy2/e;", "Lc83/f;", "Lokhttp3/ResponseBody;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements c83.f<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f121547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t13.d<hy2.a> f121549c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(a aVar, long j8, t13.d<? super hy2.a> dVar) {
        this.f121547a = aVar;
        this.f121548b = j8;
        this.f121549c = dVar;
    }

    @Override // c83.f
    public final void a(c83.d<ResponseBody> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        int i14 = o13.q.f128596b;
        this.f121549c.resumeWith(new o13.q.b(new CheckDeviceFirmwareUpdateException(th3, null, 2, null)));
    }

    @Override // c83.f
    public final void c(c83.d<ResponseBody> dVar, a0<ResponseBody> a0Var) {
        hy2.a aVar;
        dVar.getClass();
        Response response = a0Var.f25745a;
        boolean zIsSuccessful = response.isSuccessful();
        t13.d<hy2.a> dVar2 = this.f121549c;
        if (!zIsSuccessful) {
            int i14 = o13.q.f128596b;
            dVar2.resumeWith(new o13.q.b(new CheckDeviceFirmwareUpdateException(new Exception("Invalid HTTP response"), Integer.valueOf(response.code()))));
            return;
        }
        try {
            ResponseBody responseBody = a0Var.f25746b;
            String strString = responseBody != null ? responseBody.string() : null;
            if (strString == null || strString.length() == 0) {
                aVar = new hy2.a(this.f121548b, false, false, strString);
            } else {
                JSONObject jSONObject = new JSONObject(strString);
                boolean zOptBoolean = jSONObject.optBoolean("messageExistInQueue", false);
                boolean zOptBoolean2 = jSONObject.optBoolean("messageAddedInQueue", false);
                this.f121547a.f121528c.debug("messageExistInQueue[" + zOptBoolean + "], messageAddedInQueue[" + zOptBoolean2 + "]");
                aVar = new hy2.a(this.f121548b, zOptBoolean, zOptBoolean2, strString);
            }
            int i15 = o13.q.f128596b;
            dVar2.resumeWith(aVar);
        } catch (Throwable th3) {
            int i16 = o13.q.f128596b;
            dVar2.resumeWith(new o13.q.b(new CheckDeviceFirmwareUpdateException(th3, Integer.valueOf(response.code()))));
        }
    }
}
