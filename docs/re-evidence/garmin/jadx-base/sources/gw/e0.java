package gw;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public class e0 implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.d f79496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f79497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f79498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f79499d;

    public e0(d0 d0Var, com.garmin.android.library.backgroundtaskmanagement.d dVar, String str, String str2) {
        this.f79499d = d0Var;
        this.f79496a = dVar;
        this.f79497b = str;
        this.f79498c = str2;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        i2.i("SSOServiceLoginOp", iOException.toString());
        this.f79499d.j(this.f79496a, com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws IOException {
        boolean zIsSuccessful = response.isSuccessful();
        com.garmin.android.library.backgroundtaskmanagement.d dVar = this.f79496a;
        d0 d0Var = this.f79499d;
        if (!zIsSuccessful) {
            i2.i("SSOServiceLoginOp", response.message());
            d0Var.j(dVar, com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE);
            return;
        }
        pu.k kVar = (pu.k) GsonUtil.f47253b.fromJson(response.body().string(), pu.k.class);
        if (TextUtils.isEmpty(kVar.a())) {
            i2.i("SSOServiceLoginOp", "Invalid empty LOGIN TOKEN!!!");
            d0Var.j(dVar, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            return;
        }
        String strConcat = String.format(am.j.o(this.f79497b, "sso/login?generateExtraServiceTicket=true&logintoken=%1$s&service=%2$s", new StringBuilder()), kVar.a(), this.f79498c);
        try {
            strConcat = strConcat.concat("&mobile=true&cssUrl=" + URLEncoder.encode("https://static.garmincdn.com/com.garmin.connect/ui/css/gcm-sso-theme-v1.8.css?timestamp=" + DateTime.now().getMillis(), "UTF-8"));
        } catch (UnsupportedEncodingException e4) {
            i2.i("SSOServiceLoginOp", e4.toString());
        }
        d0Var.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, strConcat);
        d0Var.j(dVar, com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }
}
