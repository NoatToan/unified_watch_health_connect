package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwidauth.c.j;
import com.huawei.hwidauth.c.k;
import com.huawei.hwidauth.utils.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nne extends AsyncTask<k, Void, Response<ResponseBody>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f43308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43309c;
    private Handler d = new Handler(Looper.getMainLooper()) { // from class: nne.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i = message.what;
            if (i == -2) {
                nne.this.f43308b.onFailure(message.arg1, (String) message.obj);
            } else if (i == -1) {
                nne.this.f43308b.onFailure(-1, "");
            } else if (i == 200) {
                nne.this.f43308b.onSuccess((String) message.obj);
            }
            super.handleMessage(message);
        }
    };
    private k e;

    nne(Context context, String str, k kVar, j jVar) {
        this.f43307a = context;
        this.f43309c = str;
        this.e = kVar;
        this.f43308b = jVar;
    }

    public Map<String, String> c() {
        HashMap map = new HashMap();
        String strE = nph.e();
        if (TextUtils.isEmpty(strE)) {
            strE = "unkown";
        }
        map.put("terminal-type", strE);
        nox.b("GwRequest", "terminal-type:" + strE, false);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Response<ResponseBody> doInBackground(k... kVarArr) {
        nox.b("GwRequest", "doInBackground", true);
        Map<String, String> mapA = nmj.d().a(this.f43307a, this.f43309c, "com.huawei.cloud.hwid");
        if (mapA != null) {
            String str = mapA.get("GwSilentCodeUrl");
            nox.b("GwRequest", "gwSilentCodeUrl = " + str, false);
            if (TextUtils.isEmpty(str)) {
                nox.b("GwRequest", "gwSilentCodeUrl null return", true);
                return null;
            }
            RestClient restClientE = noy.e(this.f43307a, str);
            if (restClientE == null) {
                nox.a("GwRequest", "restClient init failed", true);
                return null;
            }
            a aVar = (a) restClientE.create(a.class);
            nox.b("GwRequest", "url = " + str + this.e.b(), false);
            try {
                String strA_ = this.e.a_();
                if (strA_ == null) {
                    nox.a("GwRequest", "requestData is null.", true);
                    return null;
                }
                nox.b("GwRequest", "requestData = " + strA_, false);
                return aVar.a(this.e.b(), RequestBody.create("application/x-www-form-urlencoded", strA_.getBytes("UTF-8")), c()).execute();
            } catch (IOException unused) {
                nox.a("GwRequest", "IOException", true);
                return null;
            } catch (RuntimeException unused2) {
                nox.a("GwRequest", "IOException", true);
                this.f43308b.onFailure(-1, "");
                return null;
            }
        }
        nox.b("GwRequest", "grs urlMap null", true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(final Response<ResponseBody> response) {
        nnr.d().execute(new Runnable() { // from class: nne.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Response response2 = response;
                    if (response2 == null) {
                        nox.b("GwRequest", "response null", true);
                        nne.this.d.sendEmptyMessage(-1);
                        return;
                    }
                    int code = response2.getCode();
                    if (200 == code && response.getBody() != null) {
                        String str = new String(((ResponseBody) response.getBody()).bytes(), "UTF-8");
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 200;
                        messageObtain.obj = str;
                        nne.this.d.sendMessage(messageObtain);
                        return;
                    }
                    String str2 = new String(response.getErrorBody(), "UTF-8");
                    nox.b("GwRequest", "errorData = ".concat(str2), false);
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = -2;
                    messageObtain2.obj = str2;
                    messageObtain2.arg1 = code;
                    nne.this.d.sendMessage(messageObtain2);
                } catch (IOException unused) {
                    nox.a("GwRequest", "IOException", true);
                    nne.this.d.sendEmptyMessage(-1);
                } catch (RuntimeException unused2) {
                    nox.a("GwRequest", "RuntimeException", true);
                    nne.this.d.sendEmptyMessage(-1);
                }
            }
        });
    }
}
