package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter;
import com.huawei.multisimsdk.odsa.response.OdsaResponseParam;
import com.huawei.multisimsdk.odsa.view.ILoginView;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes12.dex */
public class oea implements IThirdPartyLoginPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44220a;
    private String e;
    private final WeakReference<ILoginView> h;
    private String i;
    private String j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f44222c = new Handler(Looper.getMainLooper()) { // from class: oea.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            ocq.e("ThirdPartyLoginPresenter", "EVENT_START_AUTH_REQUEST");
            oea.this.d();
        }
    };
    private final ResponseHandler g = new ResponseHandler() { // from class: oea.1
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            ocq.e("ResponseHandler->", "onCallback" + str);
        }

        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(int i, String str) {
            OdsaResponseParam odsaResponseParamD;
            int i2;
            try {
                ocq.a("ThirdPartyLoginPresenter", "mResponseHandlerWithUrl onCallback result=" + str);
                if (oco.c(str) && (i2 = Integer.parseInt(str)) != 302) {
                    ocq.c("ThirdPartyLoginPresenter", "mResponseHandlerWithUrl result is invalids, resultCode=" + i2);
                    return;
                }
                int iLastIndexOf = str.lastIndexOf("&");
                String strSubstring = str.substring(iLastIndexOf + 1);
                String strSubstring2 = iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
                if (strSubstring.contains("json")) {
                    odsaResponseParamD = odl.d(strSubstring2);
                } else {
                    XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                    if (xmlPullParserNewPullParser != null) {
                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)), "UTF-8");
                    }
                    odsaResponseParamD = null;
                }
                if (odsaResponseParamD == null) {
                    oea.this.d(1100);
                } else {
                    oea.this.j = String.format("%s?post_data=%s", Objects.toString(odsaResponseParamD.getPortalUrl(), ""), Objects.toString(odsaResponseParamD.getPostData(), ""));
                    oea.this.f44222c.sendMessage(oea.this.f44222c.obtainMessage(1));
                }
            } catch (XmlPullParserException e) {
                ocq.a("ThirdPartyLoginPresenter", "mResponseHandlerWithAuthCode occur an IOException error", e);
                oea.this.d(1100);
            } catch (Exception e2) {
                ocq.a("ThirdPartyLoginPresenter", "mResponseHandlerWithAuthCode occur an Exception ", e2);
            }
        }
    };
    private final ResponseHandler f = new ResponseHandler() { // from class: oea.2
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            ocq.e("ResponseHandler->", "onCallback" + str);
        }

        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(int i, String str) {
            OdsaResponseParam odsaResponseParamD;
            int i2;
            try {
                ocq.b("ThirdPartyLoginPresenter", "mResponseHandlerWithToken onCallback result=" + str);
                if (oco.c(str) && (i2 = Integer.parseInt(str)) != 302) {
                    ocq.c("ThirdPartyLoginPresenter", "mResponseHandlerWithToken result is invalids, resultCode=" + i2);
                    return;
                }
                int iLastIndexOf = str.lastIndexOf("&");
                String strSubstring = str.substring(iLastIndexOf + 1);
                String strSubstring2 = iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
                if (strSubstring.contains("json")) {
                    odsaResponseParamD = odl.d(strSubstring2);
                } else {
                    XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                    if (xmlPullParserNewPullParser != null) {
                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)), "UTF-8");
                    }
                    odsaResponseParamD = null;
                }
                if (odsaResponseParamD == null) {
                    oea.this.d(1100);
                } else {
                    oed.c(odsaResponseParamD.getToken());
                    oea.this.a();
                }
            } catch (XmlPullParserException e) {
                ocq.a("ThirdPartyLoginPresenter", "mResponseHandlerWithToken occur an IOException error", e);
                oea.this.d(1100);
            } catch (Exception e2) {
                ocq.a("ThirdPartyLoginPresenter", "mResponseHandlerWithToken occur an Exception ", e2);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f44221b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    private final ocp d = ocp.d();

    public oea(ILoginView iLoginView) {
        this.h = new WeakReference<>(iLoginView);
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter
    public void startLogin() {
        String strC = oco.c("ODSA_ESURL", "");
        this.e = strC;
        if (TextUtils.isEmpty(strC)) {
            d(1100);
            return;
        }
        if (odg.a() == null) {
            d(1100);
            return;
        }
        ocq.a("ThirdPartyLoginPresenter", "Step1. startLogin, try to get portal url from es server.");
        HashMap map = new HashMap(2);
        map.put("auth_data", odh.c().a().getCiphertext());
        map.put("auth_data_sign", odh.c().a().getCiphertextSign());
        map.put("operation", "getPortalUrl");
        map.put(MapKeyNames.REQUEST_ID, oco.e(2147483646));
        this.d.b(odh.c().e(), odh.c().b(), map, this.g, 4);
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter
    public void onStart() {
        if (this.f44221b.isShutdown()) {
            this.f44221b = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter
    public void onStop() {
        this.f44221b.shutdownNow();
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter
    public void onDestroy() {
        ExecutorService executorService = this.f44221b;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        WeakReference<ILoginView> weakReference = this.h;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    private void c() {
        ocq.e("ThirdPartyLoginPresenter", "Step4. getEsTokenRequest, Try to request token from the ES server.");
        HashMap map = new HashMap(2);
        map.put("operation", "getESToken");
        map.put(Constants.NONCE, this.f44220a);
        map.put("ws_token", this.i);
        map.put(MapKeyNames.REQUEST_ID, oco.e(2147483646));
        this.d.b(odh.c().e(), odh.c().b(), map, this.f, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ocq.e("ThirdPartyLoginPresenter", "responseSuccess");
        if (odg.a() != null) {
            odg.a().b(1000);
        }
        if (b()) {
            this.h.get().finishView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        ocq.e("ThirdPartyLoginPresenter", "responseFailWithReason: reason = " + i);
        if (odg.a() != null) {
            odg.a().b(i);
        }
        if (b()) {
            this.h.get().finishView();
        }
    }

    private boolean b() {
        WeakReference<ILoginView> weakReference = this.h;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ocq.e("ThirdPartyLoginPresenter", "Step2. startAuth, try to load portal url.");
        if (!this.f44221b.isShutdown()) {
            this.f44221b.submit(new Runnable() { // from class: odx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44218b.e();
                }
            });
        } else {
            d(1100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ocq.e("ThirdPartyLoginPresenter", "doAuth");
        if (b()) {
            this.h.get().loadUrl(this.j);
        }
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter
    public void getWsTokenAndNonce(String str) {
        int i;
        ocq.e("ThirdPartyLoginPresenter", "Step3. getWsTokenAndNonce, Try to parse the token and nonce.");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.indexOf("&lt;") >= 0) {
            str = Html.fromHtml(str).toString();
        }
        int iIndexOf = str.indexOf("<wap-provisioningdoc");
        int iIndexOf2 = str.indexOf("</wap-provisioningdoc>");
        ocq.a("ThirdPartyLoginPresenter", "getEsToken firstIndex = " + iIndexOf);
        ocq.a("ThirdPartyLoginPresenter", "getEsToken secondIndex = " + iIndexOf2);
        if (iIndexOf < 0 || iIndexOf2 < 0 || (i = iIndexOf2 + 22) > str.length() || i < iIndexOf) {
            return;
        }
        String strSubstring = str.substring(iIndexOf, i);
        ocq.a("ThirdPartyLoginPresenter", "getEsToken content = " + strSubstring);
        try {
            ocq.a("ThirdPartyLoginPresenter", "getEsToken onCallback result=" + strSubstring);
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            if (xmlPullParserNewPullParser != null) {
                xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(strSubstring.getBytes("UTF-8")), "UTF-8");
            }
            OdsaResponseParam odsaResponseParamA = odm.a(xmlPullParserNewPullParser);
            this.i = odsaResponseParamA.getToken();
            this.f44220a = odsaResponseParamA.getNonce();
            ocq.a("ThirdPartyLoginPresenter", "getEsToken onCallback odsaResponseParam=" + odsaResponseParamA.toString());
            ocq.a("ThirdPartyLoginPresenter", "getEsToken onCallback token=" + this.i.length());
            ocq.a("ThirdPartyLoginPresenter", "getEsToken onCallback nonce=" + this.f44220a.length());
            if (!TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.f44220a)) {
                c();
            } else {
                ocq.e("ThirdPartyLoginPresenter", "getEsToken onCallback token or nonce is empty.");
            }
        } catch (UnsupportedEncodingException e) {
            ocq.a("ThirdPartyLoginPresenter", "getTokenValue occur an UnsupportedEncodingException ", e);
        } catch (IOException e2) {
            e = e2;
            ocq.a("ThirdPartyLoginPresenter", "getTokenValue occur an IOException ", e);
        } catch (XmlPullParserException e3) {
            e = e3;
            ocq.a("ThirdPartyLoginPresenter", "getTokenValue occur an IOException ", e);
        } catch (Exception e4) {
            ocq.a("ThirdPartyLoginPresenter", "getTokenValue occur an Exception ", e4);
        }
    }
}
