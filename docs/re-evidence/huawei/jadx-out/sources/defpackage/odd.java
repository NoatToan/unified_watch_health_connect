package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import com.huawei.multisimsdk.odsa.response.OdsaResponseParam;
import com.huawei.multisimsdk.odsa.view.BaseWebActivity;
import com.tencent.open.apireq.BaseResp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes12.dex */
public class odd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f44179a = new Object();
    private static odd d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f44181c;
    private AbsPrimaryDevice f;
    private AbsPairedDevice h;
    private Message i;
    private HandlerThread j;
    private AuthParam e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f44180b = null;
    private int m = -1;
    private ResponseHandler g = new ResponseHandler() { // from class: odd.4
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            ocq.e("ResponseHandler->", "onCallback" + str);
        }

        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(int i, String str) {
            OdsaResponseParam odsaResponseParamA;
            String token;
            int i2;
            ocq.c("ResponseHandler->", "onCallback type=" + i + ", result=", str);
            if (oco.c(str) && (i2 = Integer.parseInt(str)) != 302) {
                odd.this.c(i2);
                return;
            }
            int iLastIndexOf = str.lastIndexOf("&");
            String strSubstring = str.substring(iLastIndexOf + 1);
            if (iLastIndexOf >= 0) {
                str = str.substring(0, iLastIndexOf);
            }
            try {
                if (strSubstring.contains("json")) {
                    odsaResponseParamA = odl.d(str);
                } else {
                    XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                    if (xmlPullParserNewPullParser != null) {
                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
                    }
                    odsaResponseParamA = odm.a(xmlPullParserNewPullParser);
                }
                if (odsaResponseParamA == null) {
                    token = "";
                } else {
                    token = odsaResponseParamA.getToken();
                }
                if (!TextUtils.isEmpty(token)) {
                    oed.c(token);
                }
                odd.this.e(i, odsaResponseParamA);
            } catch (IOException e) {
                odd.this.c(BaseResp.CODE_UNSUPPORTED_BRANCH);
                ocq.a("OdsaHandleController", "onCallback->e: ", e);
            } catch (IllegalStateException e2) {
                odd.this.c(-1010);
                ocq.a("OdsaHandleController", "onCallback->e: ", e2);
            } catch (XmlPullParserException e3) {
                odd.this.c(BaseResp.CODE_PERMISSION_NOT_GRANTED);
                ocq.a("OdsaHandleController", "onCallback->e: ", e3);
            }
        }
    };

    private odd() {
        HandlerThread handlerThread = new HandlerThread("OdsaHandleController");
        this.j = handlerThread;
        handlerThread.start();
        this.f44181c = new a(this.j.getLooper());
    }

    public static odd d() {
        odd oddVar;
        synchronized (f44179a) {
            if (d == null) {
                d = new odd();
            }
            oddVar = d;
        }
        return oddVar;
    }

    public void b(Context context, AuthParam authParam) {
        this.f44180b = context;
        this.e = authParam;
        this.m = authParam.getSlotId();
    }

    public Context e() {
        return this.f44180b;
    }

    public AuthParam b() {
        return this.e;
    }

    public int c() {
        return this.m;
    }

    public boolean c(Context context, AuthParam authParam, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if (authParam == null || context == null || message == null) {
            ocq.c("OdsaHandleController", "authparam is null or context is null or callbackMessage is null");
            return false;
        }
        if (!oco.d(message)) {
            return false;
        }
        this.i = message;
        this.f = absPrimaryDevice;
        this.h = absPairedDevice;
        this.e = authParam;
        if (!oco.d(0, absPrimaryDevice, absPairedDevice, null)) {
            return false;
        }
        int authType = authParam.getAuthType();
        ocq.e("OdsaHandleController", "startAuth->authType is " + authType);
        if (authType == 2 || authType == 5) {
            new odf(context, authParam, this.f44181c.obtainMessage(2)).c(this.f);
            return true;
        }
        if (authType == 4) {
            new odc(context, authParam, absPrimaryDevice, absPairedDevice, this.f44181c.obtainMessage(1)).startAuthLogin();
            return true;
        }
        if (authType != 1) {
            return false;
        }
        Message messageObtainMessage = this.f44181c.obtainMessage(7);
        odg odgVarA = odg.a();
        odh odhVarC = odh.c();
        if (odgVarA != null && odhVarC != null) {
            odgVarA.c(context, messageObtainMessage);
            odhVarC.a(authParam, absPrimaryDevice, absPairedDevice);
            odgVarA.e();
        }
        return true;
    }

    public void e(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if (message == null) {
            ocq.c("OdsaHandleController", "addMultiSimRequest: callbackMessage is null");
            return;
        }
        this.i = message;
        if (!oco.d(1, absPrimaryDevice, absPairedDevice, null)) {
            c(BaseResp.CODE_QQ_LOW_VERSION);
            return;
        }
        HashMap map = new HashMap();
        if (obm.c("android.permission.READ_PRIVILEGED_PHONE_STATE", this.f44180b)) {
            map.put("terminal_iccid", oco.e());
        }
        map.put("operation_type", String.valueOf(0));
        ocp.d().b(absPrimaryDevice, absPairedDevice, map, this.g, 1);
    }

    public void b(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if (message == null) {
            ocq.c("OdsaHandleController", "changeMultiSimRequest: callbackMessage is null");
            return;
        }
        this.i = message;
        if (!oco.d(1, absPrimaryDevice, absPairedDevice, null)) {
            c(BaseResp.CODE_QQ_LOW_VERSION);
            return;
        }
        HashMap map = new HashMap();
        if (obm.c("android.permission.READ_PRIVILEGED_PHONE_STATE", this.f44180b)) {
            map.put("terminal_iccid", oco.e());
        }
        map.put("operation_type", String.valueOf(2));
        ocp.d().b(absPrimaryDevice, absPairedDevice, map, this.g, 1);
    }

    public void c(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if (message == null) {
            return;
        }
        this.i = message;
        if (!oco.d(3, absPrimaryDevice, absPairedDevice, null)) {
            c(BaseResp.CODE_QQ_LOW_VERSION);
        } else {
            ocp.d().b(absPrimaryDevice, absPairedDevice, null, this.g, 3);
        }
    }

    public void b(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message, int i) {
        if (message == null) {
            return;
        }
        this.i = message;
        if (!oco.d(i, absPrimaryDevice, absPairedDevice, null)) {
            c(BaseResp.CODE_QQ_LOW_VERSION);
        } else {
            ocq.e("OdsaHandleController", "getMultiSimServiceStatus start");
            ocp.d().b(absPrimaryDevice, absPairedDevice, null, this.g, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, OdsaResponseParam odsaResponseParam) {
        if (odsaResponseParam.getOperationResult() == 1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c(1000);
                    } else if (i == 3) {
                        b(odsaResponseParam);
                    } else if (i == 5) {
                        ocq.e("OdsaHandleController", "handleAcquireConfigurationLooping");
                        a(odsaResponseParam);
                    }
                } else if (TextUtils.isEmpty(odsaResponseParam.getSubscriptionServiceUrl())) {
                    c(BaseResp.CODE_QQ_LOW_VERSION);
                } else {
                    c(0);
                    c(odsaResponseParam);
                }
            } else if (!oco.b("ODSA_CHECK_COMPANION_DEVICE_SERVICES", (Boolean) false).booleanValue() || odsaResponseParam.getCompanionDeviceServices().contains("SharedNumber") || (odsaResponseParam.getCompanionAppEligibility().equals("1") && !TextUtils.isEmpty(odsaResponseParam.getNotEnabledUrl()) && !TextUtils.isEmpty(odsaResponseParam.getNotEnabledUserData()))) {
                c(1000);
            } else {
                c(1055);
            }
            ocq.b("OdsaHandleController", "operation success");
            return;
        }
        c(odsaResponseParam.getOperationResult());
        ocq.b("OdsaHandleController", "operation failed");
    }

    private void b(OdsaResponseParam odsaResponseParam) {
        if ("1".equals(odsaResponseParam.getServiceStatus())) {
            String strD = d(odsaResponseParam);
            if (!TextUtils.isEmpty(strD)) {
                if (this.i != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("ActivationCode", strD);
                    this.i.setData(bundle);
                }
                c(1200);
                return;
            }
            c(-1011);
            return;
        }
        c(1000);
    }

    private String d(OdsaResponseParam odsaResponseParam) {
        if (!TextUtils.isEmpty(odsaResponseParam.getProfileActivationCode())) {
            return odsaResponseParam.getProfileActivationCode();
        }
        if (!TextUtils.isEmpty(odsaResponseParam.getProfileSmdpAddress())) {
            return "LPA:1$" + odsaResponseParam.getProfileSmdpAddress() + SampleEvent.SEPARATOR;
        }
        return "";
    }

    private void a(OdsaResponseParam odsaResponseParam) {
        if (!"1".equals(odsaResponseParam.getServiceStatus())) {
            int iE = e(odsaResponseParam);
            ocq.e("OdsaHandleController", "pollingInterval = " + iE);
            this.f44181c.sendEmptyMessageDelayed(6, (long) iE);
            return;
        }
        b(odsaResponseParam);
    }

    private int e(OdsaResponseParam odsaResponseParam) {
        if (odsaResponseParam.getPollingInterval() != 0) {
            return odsaResponseParam.getPollingInterval();
        }
        return 0;
    }

    public void a() {
        HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quit();
            this.j = null;
        }
        if (this.f44181c != null) {
            this.f44181c = null;
        }
        if (d != null) {
            b((odd) null);
        }
        this.f44180b = null;
    }

    private static void b(odd oddVar) {
        d = oddVar;
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
            ocq.b("OdsaHandleController", "looper " + looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.arg1;
            switch (message.what) {
                case 1:
                    odd.this.b(message);
                    break;
                case 2:
                    odd.this.e(message);
                    break;
                case 3:
                    odd.this.c(message);
                    break;
                case 4:
                    odd.this.d(message);
                    break;
                case 5:
                    odd.this.a(message);
                    break;
                case 6:
                    odd oddVar = odd.this;
                    oddVar.b(oddVar.f, odd.this.h, odd.this.i, 5);
                    ocq.e("OdsaHandleController", "getMultiSimServiceStatus polling success");
                    break;
                case 7:
                    odd.this.h(message);
                    break;
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        int i = message.arg1;
        ocq.e("OdsaHandleController", "handleOpenIdAuthResult, resultCode " + i);
        if (i == 1000) {
            oed.c(ocy.c(this.f44180b).d().a());
            ocp.d().b(this.f, this.h, null, this.g, 0);
        } else {
            c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Message message) {
        int i = message.arg1;
        ocq.e("OdsaHandleController", "handleThirdPartyAuthResult, resultCode " + i);
        if (i == 1000) {
            ocp.d().b(this.f, this.h, null, this.g, 0);
        } else {
            c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        int i = message.arg1;
        ocq.e("OdsaHandleController", "handleAkaAuthResult, resultCode " + i);
        if (i == 1100) {
            ocp.d().b(this.f, this.h, null, this.g, 0);
        } else if (this.e.getAuthType() == 5) {
            new odc(this.f44180b, this.e, this.f, this.h, this.f44181c.obtainMessage(1)).startAuthLogin();
        } else {
            c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        ocq.e("OdsaHandleController", "handleCheckEligibility, resultCode " + message.arg1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        ocq.e("OdsaHandleController", "handleAcquireConfiguration, resultCode " + message.arg1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        ocq.e("OdsaHandleController", "handleManageSubscription, resultCode " + message.arg1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.i != null) {
            ocq.e("OdsaHandleController", "response result " + i + " to " + this.i.getTarget());
            this.i.arg1 = i;
            oco.a(this.i);
            this.i = null;
        }
    }

    private void c(OdsaResponseParam odsaResponseParam) {
        Context context = this.f44180b;
        if (!(context instanceof Activity)) {
            ocq.c("OdsaHandleController", "startWebView fail context not activity.");
            return;
        }
        if (odsaResponseParam == null) {
            ocq.c("OdsaHandleController", "startWebView fail odsaResponseParam is null.");
            return;
        }
        Activity activity = (Activity) context;
        Intent intent = new Intent(activity, (Class<?>) BaseWebActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("OdsaResponseParamBundle", odsaResponseParam);
        bundle.putString("companion_terminal_service", this.f.getCompanionTerminalService());
        intent.putExtra("OdsaResponseParam", bundle);
        ocq.e("OdsaHandleController", "startWebView " + intent);
        activity.startActivityForResult(intent, 101);
    }
}
