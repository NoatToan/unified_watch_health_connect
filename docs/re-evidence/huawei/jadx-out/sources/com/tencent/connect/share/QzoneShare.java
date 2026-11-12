package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class QzoneShare extends BaseApi {
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final String SHARE_TO_QZONE_EXTMAP = "extMap";
    public static final String SHARE_TO_QZONE_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_MINI_PROGRAM = 7;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30949a;
    private boolean d;
    private boolean e;
    private boolean f;
    public String mViaShareQzoneType;

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    public QzoneShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQzoneType = "";
        this.f30949a = true;
        this.d = false;
        this.e = false;
        this.f = false;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x034d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0351  */
    /* JADX WARN: Code duplicated, block: B:111:0x0391  */
    /* JADX WARN: Code duplicated, block: B:112:0x039b  */
    /* JADX WARN: Code duplicated, block: B:131:0x041a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0142  */
    /* JADX WARN: Code duplicated, block: B:46:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x020e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0214  */
    /* JADX WARN: Code duplicated, block: B:65:0x0251  */
    /* JADX WARN: Code duplicated, block: B:66:0x025e  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d8  */
    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        int i;
        Bundle bundle2;
        String str2;
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
        if (com.tencent.connect.a.a("openSDK_LOG.QzoneShare", iUiListener)) {
            return;
        }
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() params is null");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string5 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String strA = m.a(activity);
        if (strA != null) {
            str = "appName";
            if (strA.length() > 20) {
                strA = strA.substring(0, 20) + "...";
            }
            i = bundle.getInt("req_type");
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i);
            if (i != 1 && i == 5) {
                this.mViaShareQzoneType = "2";
            } else {
                this.mViaShareQzoneType = "1";
            }
            if (i != 1) {
                SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
                this.f30949a = true;
                this.d = false;
                this.e = true;
                this.f = false;
            } else {
                if (i != 5) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
                    return;
                }
                if (i != 7) {
                    if (!TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                        iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                    }
                    this.e = false;
                    this.f = false;
                    this.f30949a = false;
                } else {
                    if (!m.e(string) && m.e(string2)) {
                        if (stringArrayList != null && stringArrayList.size() != 0) {
                            this.f30949a = false;
                        } else {
                            string = "来自" + strA + "的分享";
                            this.f30949a = true;
                        }
                    } else {
                        this.f30949a = true;
                    }
                    this.d = false;
                    SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
                    this.e = true;
                    this.f = false;
                }
            }
            if (m.a() && m.g(activity, "4.5.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_NOSD_ERROR);
                return;
            }
            if (this.f30949a) {
                if (TextUtils.isEmpty(string3)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                    return;
                }
                if (!m.h(string3)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                    return;
                }
            }
            if (this.d) {
                bundle2 = bundle;
                bundle2.putString("title", "");
                bundle2.putString("summary", "");
            } else {
                bundle2 = bundle;
                if (!this.e && m.e(string)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
                    return;
                }
                if (!m.e(string) || string.length() <= 200) {
                    str2 = null;
                } else {
                    str2 = null;
                    bundle2.putString("title", m.a(string, 200, (String) null, (String) null));
                }
                if (!m.e(string2) && string2.length() > 600) {
                    bundle2.putString("summary", m.a(string2, 600, str2, str2));
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                bundle2.putString(str, strA);
            }
            if (stringArrayList != null || (stringArrayList != null && stringArrayList.size() == 0)) {
                if (this.f) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                    return;
                }
            } else {
                int i2 = 0;
                while (i2 < stringArrayList.size()) {
                    String str3 = stringArrayList.get(i2);
                    if (!m.h(str3) && !m.i(str3)) {
                        stringArrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                if (stringArrayList.size() == 0) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 非法的图片地址!");
                    return;
                }
                bundle2.putStringArrayList("imageUrl", stringArrayList);
            }
            if (!m.g(activity, "4.6.0")) {
                SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
                b(activity, bundle, iUiListener);
            } else if (k.c(activity, "4.2.0") < 0 && k.c(activity, "4.6.0") < 0) {
                SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
                QQShare qQShare = new QQShare(activity, this.f30928c);
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    String str4 = stringArrayList.get(0);
                    if (i == 5 && !m.i(str4)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_MUST_BE_LOCAL, null));
                        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        return;
                    }
                    bundle2.putString("imageLocalUrl", str4);
                }
                if (!m.g(activity, "4.5.0")) {
                    bundle2.putInt("cflag", 1);
                }
                qQShare.shareToQQ(activity, bundle2, iUiListener);
            } else {
                SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
                new TDialog(activity, "", a(""), null, this.f30928c).show();
            }
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
        }
        strA = bundle.getString("appName");
        str = "appName";
        i = bundle.getInt("req_type");
        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i);
        if (i != 1) {
            this.mViaShareQzoneType = "1";
        } else {
            this.mViaShareQzoneType = "1";
        }
        if (i != 1) {
            SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
            this.f30949a = true;
            this.d = false;
            this.e = true;
            this.f = false;
        } else {
            if (i != 5) {
                iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
                return;
            }
            if (i != 7) {
                if (!TextUtils.isEmpty(string4)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                } else {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                }
                this.e = false;
                this.f = false;
                this.f30949a = false;
            } else {
                if (!m.e(string)) {
                    this.f30949a = true;
                } else {
                    this.f30949a = true;
                }
                this.d = false;
                SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
                this.e = true;
                this.f = false;
            }
        }
        if (m.a()) {
        }
        if (this.f30949a) {
            if (TextUtils.isEmpty(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                return;
            }
            if (!m.h(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                return;
            }
        }
        if (this.d) {
            bundle2 = bundle;
            bundle2.putString("title", "");
            bundle2.putString("summary", "");
        } else {
            bundle2 = bundle;
            if (!this.e) {
            }
            if (m.e(string)) {
                str2 = null;
            } else {
                str2 = null;
            }
            if (!m.e(string2)) {
                bundle2.putString("summary", m.a(string2, 600, str2, str2));
            }
        }
        if (!TextUtils.isEmpty(strA)) {
            bundle2.putString(str, strA);
        }
        if (stringArrayList != null) {
            if (this.f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
        } else if (this.f) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
            return;
        }
        if (!m.g(activity, "4.6.0")) {
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
            b(activity, bundle, iUiListener);
        } else if (k.c(activity, "4.2.0") < 0) {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.f30928c).show();
        } else {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.f30928c).show();
        }
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0125  */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x0189  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0200  */
    /* JADX WARN: Code duplicated, block: B:60:0x021b  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0262  */
    /* JADX WARN: Code duplicated, block: B:69:0x0286  */
    /* JADX WARN: Code duplicated, block: B:72:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0375  */
    /* JADX WARN: Code duplicated, block: B:80:0x0387  */
    /* JADX WARN: Code duplicated, block: B:82:0x0398  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0125, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0149, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0169, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0189, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x01a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x01c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x01e0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x023f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0262, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0286, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x02aa, please report this as an issue */
    private void b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        int i;
        String str;
        String str2;
        String string;
        String appId;
        String openIdWithCache;
        int i2;
        int i3;
        Intent intent;
        String str3;
        String strA;
        SLog.i("openSDK_LOG.QzoneShare", "doshareToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString("targetUrl");
        String string5 = bundle.getString("audio_url");
        int i4 = bundle.getInt("req_type", 1);
        String string6 = bundle.getString("appName");
        String string7 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string8 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string9 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i5 = bundle.getInt("cflag", 0);
        String string10 = bundle.getString("share_qq_ext_str");
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                str2 = string10;
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (String str4 : setKeySet) {
                        str = string7;
                        try {
                            i = i4;
                            try {
                                jSONObject.put(str4, bundle2.get(str4));
                                i4 = i;
                                string7 = str;
                            } catch (Exception e) {
                                e = e;
                                SLog.e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                                string = "";
                                appId = this.f30928c.getAppId();
                                openIdWithCache = this.f30928c.getOpenIdWithCache();
                                SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                                if (stringArrayList != null) {
                                    str3 = stringArrayList.get(0);
                                    stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
                                    if (!m.h(str3)) {
                                        strA = m.a(appId, activity, str3, iUiListener);
                                        if (!TextUtils.isEmpty(strA)) {
                                            stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    stringBuffer.append("&title=" + Base64.encodeToString(m.j(string2), 2));
                                }
                                if (!TextUtils.isEmpty(string3)) {
                                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string3), 2));
                                }
                                if (!TextUtils.isEmpty(appId)) {
                                    stringBuffer.append("&share_id=" + appId);
                                }
                                if (!TextUtils.isEmpty(string4)) {
                                    stringBuffer.append("&url=" + Base64.encodeToString(m.j(string4), 2));
                                }
                                if (!TextUtils.isEmpty(string6)) {
                                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string6), 2));
                                }
                                if (!m.e(openIdWithCache)) {
                                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
                                }
                                if (m.e(string5)) {
                                    i2 = 2;
                                } else {
                                    StringBuilder sb = new StringBuilder("&audioUrl=");
                                    i2 = 2;
                                    sb.append(Base64.encodeToString(m.j(string5), 2));
                                    stringBuffer.append(sb.toString());
                                }
                                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i)), i2));
                                if (!TextUtils.isEmpty(str)) {
                                    stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), i2));
                                }
                                if (!TextUtils.isEmpty(string8)) {
                                    stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
                                }
                                if (!TextUtils.isEmpty(string9)) {
                                    stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string9)), 2));
                                }
                                if (!m.e(str2)) {
                                    stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
                                }
                                if (TextUtils.isEmpty(string)) {
                                    i3 = 2;
                                } else {
                                    StringBuilder sb2 = new StringBuilder("&share_qzone_ext_str=");
                                    i3 = 2;
                                    sb2.append(Base64.encodeToString(m.j(string), 2));
                                    stringBuffer.append(sb2.toString());
                                }
                                stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i5)), i3));
                                SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                                com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
                                intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                                intent.setData(Uri.parse(stringBuffer.toString()));
                                intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                                intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                                if (m.g(activity, "4.6.0")) {
                                    UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                                    a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                                } else {
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                    if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                        SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                    }
                                    a(activity, 10104, intent, false);
                                }
                                SLog.i(SLog.TAG, "doShareToQzone() --end");
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = i4;
                            SLog.e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                            string = "";
                            appId = this.f30928c.getAppId();
                            openIdWithCache = this.f30928c.getOpenIdWithCache();
                            SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                            if (stringArrayList != null) {
                                str3 = stringArrayList.get(0);
                                stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
                                if (!m.h(str3)) {
                                    strA = m.a(appId, activity, str3, iUiListener);
                                    if (!TextUtils.isEmpty(strA)) {
                                        stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                stringBuffer.append("&title=" + Base64.encodeToString(m.j(string2), 2));
                            }
                            if (!TextUtils.isEmpty(string3)) {
                                stringBuffer.append("&description=" + Base64.encodeToString(m.j(string3), 2));
                            }
                            if (!TextUtils.isEmpty(appId)) {
                                stringBuffer.append("&share_id=" + appId);
                            }
                            if (!TextUtils.isEmpty(string4)) {
                                stringBuffer.append("&url=" + Base64.encodeToString(m.j(string4), 2));
                            }
                            if (!TextUtils.isEmpty(string6)) {
                                stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string6), 2));
                            }
                            if (!m.e(openIdWithCache)) {
                                stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
                            }
                            if (m.e(string5)) {
                                StringBuilder sb3 = new StringBuilder("&audioUrl=");
                                i2 = 2;
                                sb3.append(Base64.encodeToString(m.j(string5), 2));
                                stringBuffer.append(sb3.toString());
                            } else {
                                i2 = 2;
                            }
                            stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i)), i2));
                            if (!TextUtils.isEmpty(str)) {
                                stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), i2));
                            }
                            if (!TextUtils.isEmpty(string8)) {
                                stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
                            }
                            if (!TextUtils.isEmpty(string9)) {
                                stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string9)), 2));
                            }
                            if (!m.e(str2)) {
                                stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
                            }
                            if (TextUtils.isEmpty(string)) {
                                StringBuilder sb4 = new StringBuilder("&share_qzone_ext_str=");
                                i3 = 2;
                                sb4.append(Base64.encodeToString(m.j(string), 2));
                                stringBuffer.append(sb4.toString());
                            } else {
                                i3 = 2;
                            }
                            stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i5)), i3));
                            SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                            com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
                            intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                            intent.setData(Uri.parse(stringBuffer.toString()));
                            intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                            intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                            if (m.g(activity, "4.6.0")) {
                                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                                a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                            } else {
                                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                }
                                a(activity, 10104, intent, false);
                            }
                            SLog.i(SLog.TAG, "doShareToQzone() --end");
                        }
                    }
                    i = i4;
                    str = string7;
                    if (setKeySet.size() > 0) {
                        string = jSONObject.toString();
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = i4;
                    str = string7;
                }
                appId = this.f30928c.getAppId();
                openIdWithCache = this.f30928c.getOpenIdWithCache();
                SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    str3 = stringArrayList.get(0);
                    stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
                    if (!m.h(str3)) {
                        strA = m.a(appId, activity, str3, iUiListener);
                        if (!TextUtils.isEmpty(strA)) {
                            stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                        }
                    }
                }
                if (!TextUtils.isEmpty(string2)) {
                    stringBuffer.append("&title=" + Base64.encodeToString(m.j(string2), 2));
                }
                if (!TextUtils.isEmpty(string3)) {
                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string3), 2));
                }
                if (!TextUtils.isEmpty(appId)) {
                    stringBuffer.append("&share_id=" + appId);
                }
                if (!TextUtils.isEmpty(string4)) {
                    stringBuffer.append("&url=" + Base64.encodeToString(m.j(string4), 2));
                }
                if (!TextUtils.isEmpty(string6)) {
                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string6), 2));
                }
                if (!m.e(openIdWithCache)) {
                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
                }
                if (m.e(string5)) {
                    StringBuilder sb5 = new StringBuilder("&audioUrl=");
                    i2 = 2;
                    sb5.append(Base64.encodeToString(m.j(string5), 2));
                    stringBuffer.append(sb5.toString());
                } else {
                    i2 = 2;
                }
                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i)), i2));
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), i2));
                }
                if (!TextUtils.isEmpty(string8)) {
                    stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
                }
                if (!TextUtils.isEmpty(string9)) {
                    stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string9)), 2));
                }
                if (!m.e(str2)) {
                    stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
                }
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb6 = new StringBuilder("&share_qzone_ext_str=");
                    i3 = 2;
                    sb6.append(Base64.encodeToString(m.j(string), 2));
                    stringBuffer.append(sb6.toString());
                } else {
                    i3 = 2;
                }
                stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i5)), i3));
                SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
                intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(Uri.parse(stringBuffer.toString()));
                intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                if (m.g(activity, "4.6.0")) {
                    UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                    a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                } else {
                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                    if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                        SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                    }
                    a(activity, 10104, intent, false);
                }
                SLog.i(SLog.TAG, "doShareToQzone() --end");
            }
            i = i4;
            str = string7;
            str2 = string10;
        } catch (Exception e4) {
            e = e4;
            i = i4;
            str = string7;
            str2 = string10;
        }
        string = "";
        appId = this.f30928c.getAppId();
        openIdWithCache = this.f30928c.getOpenIdWithCache();
        SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
        if (stringArrayList != null) {
            str3 = stringArrayList.get(0);
            stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
            if (!m.h(str3)) {
                strA = m.a(appId, activity, str3, iUiListener);
                if (!TextUtils.isEmpty(strA)) {
                    stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                }
            }
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(m.j(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(m.j(string3), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(m.j(string4), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string6), 2));
        }
        if (!m.e(openIdWithCache)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
        }
        if (m.e(string5)) {
            StringBuilder sb7 = new StringBuilder("&audioUrl=");
            i2 = 2;
            sb7.append(Base64.encodeToString(m.j(string5), 2));
            stringBuffer.append(sb7.toString());
        } else {
            i2 = 2;
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i)), i2));
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), i2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
        }
        if (!TextUtils.isEmpty(string9)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string9)), 2));
        }
        if (!m.e(str2)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
        }
        if (TextUtils.isEmpty(string)) {
            StringBuilder sb8 = new StringBuilder("&share_qzone_ext_str=");
            i3 = 2;
            sb8.append(Base64.encodeToString(m.j(string), 2));
            stringBuffer.append(sb8.toString());
        } else {
            i3 = 2;
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i5)), i3));
        SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
        com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
        intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
        if (m.g(activity, "4.6.0")) {
            UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
            a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
            SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
        } else {
            SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
            }
            a(activity, 10104, intent, false);
        }
        SLog.i(SLog.TAG, "doShareToQzone() --end");
    }
}
