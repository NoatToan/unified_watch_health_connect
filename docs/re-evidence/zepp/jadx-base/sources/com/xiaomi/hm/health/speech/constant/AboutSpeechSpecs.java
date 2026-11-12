package com.xiaomi.hm.health.speech.constant;

import android.text.TextUtils;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.speech.constant.AboutSpeechSpecs;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AboutSpeechSpecs {
    private static final String a = "apps/%s/settings";
    private static final String b = "settingName";
    private static final String c = "huami.web.urls";
    private static final String d = "mode";
    private static final String e = "faqXiaoAi";
    private static final String f = "faqKongmingXiaoAi";
    private static final String g = "faqPanguXiaoAi";
    private static final String h = "faqL66XiaoAi";
    private static final String i = "url";
    private static final String j = "t/mifit.faq.xiaoai.cn";
    public static final String XIAOMI_SPEECH_ENGINE_USER_FAQ_URL = HMServerDef.getHost() + j;

    public interface SpeechFaqUrlCallback {
        void onFail();

        void onSuccess(String str);
    }

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;
        public final /* synthetic */ HMDeviceSource b;
        public final /* synthetic */ SpeechFaqUrlCallback c;

        public a(HMHttpResponseData hMHttpResponseData, HMDeviceSource hMDeviceSource, SpeechFaqUrlCallback speechFaqUrlCallback) {
            this.a = hMHttpResponseData;
            this.b = hMDeviceSource;
            this.c = speechFaqUrlCallback;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.c.onFail();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.c.onFail();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            this.a.copy(hMHttpResponseData);
            String str = this.a.getResponseBody() != null ? new String(this.a.getResponseBody()) : "";
            if (TextUtils.isEmpty(str)) {
                this.c.onFail();
                return;
            }
            try {
                String strOptString = new JSONObject(str).optString(AboutSpeechSpecs.c, "");
                HMLog.i("speech", "Mi AI FAQ url response：" + strOptString, new Object[0]);
                String strOptString2 = new JSONObject(new JSONObject(strOptString).optString(AboutSpeechSpecs.c(this.b))).optString("url");
                if (TextUtils.isEmpty(strOptString2)) {
                    this.c.onFail();
                } else {
                    this.c.onSuccess(strOptString2);
                }
            } catch (JSONException unused) {
                HMLog.i("speech", "parse xiaoai faq url fail", new Object[0]);
                this.c.onFail();
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING_LITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING_PRO_L.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_PANGU.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_PANGU_L.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_L66.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_L66_AP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_L66_I.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[HMDeviceSource.MILI_L66_IN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[HMDeviceSource.MILI_L66_NFC.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[HMDeviceSource.MILI_L66_WE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(final HMDeviceSource hMDeviceSource) {
        switch (b.a[hMDeviceSource.ordinal()]) {
            case 1:
            case 2:
                return e;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return f;
            case 8:
            case 9:
                return g;
            default:
                HMLog.warn("speech", new Function0() { // from class: w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AboutSpeechSpecs.d(hMDeviceSource);
                    }
                });
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(HMDeviceSource hMDeviceSource) {
        return "当前设备：" + hMDeviceSource.name() + "使用的是默认的L66 FAQ";
    }

    public static void getXiaoaiFaqUrl(HMDeviceSource hMDeviceSource, SpeechFaqUrlCallback speechFaqUrlCallback) {
        String url = HMServerDef.getUrl(String.format("apps/%s/settings", HMAppConfig.getPackageName()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("settingName", c);
        systemParams.put("mode", "SINGLE");
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, false, new a(new HMHttpResponseData(), hMDeviceSource, speechFaqUrlCallback));
    }
}
