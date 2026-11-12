package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.TDialog;
import com.tencent.open.a.d;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.e;
import com.tencent.open.utils.h;
import com.tencent.open.utils.k;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
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
    public static final int SHARE_TO_QZONE_TYPE_APP = 6;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_MINI_PROGRAM = 7;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;
    private boolean a;
    private boolean d;
    private boolean e;
    private boolean f;
    public String mViaShareQzoneType;

    public QzoneShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQzoneType = "";
        this.a = true;
        this.d = false;
        this.e = false;
        this.f = false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:35:0x0120  */
    /* JADX WARN: Code duplicated, block: B:37:0x012a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0150  */
    /* JADX WARN: Code duplicated, block: B:43:0x0172  */
    /* JADX WARN: Code duplicated, block: B:46:0x0194  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0214  */
    /* JADX WARN: Code duplicated, block: B:61:0x0256  */
    /* JADX WARN: Code duplicated, block: B:64:0x027c  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x0372  */
    /* JADX WARN: Code duplicated, block: B:78:0x0378  */
    /* JADX WARN: Code duplicated, block: B:80:0x038c  */
    /* JADX WARN: Code duplicated, block: B:82:0x039f  */
    /* JADX WARN: Code duplicated, block: B:85:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x03ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x012a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0150, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0172, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0194, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x01ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x01d0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x01f2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0214, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0256, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x027c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x02a2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x02c8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x02ea, please report this as an issue */
    private void b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String str3;
        String appId;
        String openIdWithCache;
        Intent intent;
        String str4;
        String strA;
        SLog.i("openSDK_LOG.QzoneShare", "doshareToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString("audio_url");
        int i = bundle.getInt("req_type", 1);
        String string5 = bundle.getString("appName");
        String string6 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string7 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string8 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i2 = bundle.getInt("cflag", 0);
        String string9 = bundle.getString("share_qq_ext_str");
        String string10 = "";
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                str3 = string9;
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (String str5 : setKeySet) {
                        str2 = string7;
                        try {
                            str = string6;
                            try {
                                jSONObject.put(str5, bundle2.get(str5));
                                string6 = str;
                                string7 = str2;
                            } catch (Exception e) {
                                e = e;
                                SLog.e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                                appId = this.c.getAppId();
                                openIdWithCache = this.c.getOpenIdWithCache();
                                SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                                if (stringArrayList != null) {
                                    str4 = stringArrayList.get(0);
                                    stringBuffer.append("&image_url=" + Base64.encodeToString(k.i(URLEncoder.encode(str4)), 2));
                                    if (!k.g(str4)) {
                                        strA = k.a(appId, activity, str4);
                                        if (!TextUtils.isEmpty(strA)) {
                                            stringBuffer.append("&image_uri=" + Base64.encodeToString(k.i(URLEncoder.encode(strA)), 2));
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    stringBuffer.append("&title=" + Base64.encodeToString(k.i(string), 2));
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    stringBuffer.append("&description=" + Base64.encodeToString(k.i(string2), 2));
                                }
                                if (!TextUtils.isEmpty(appId)) {
                                    stringBuffer.append("&share_id=" + appId);
                                }
                                if (!TextUtils.isEmpty(string3)) {
                                    stringBuffer.append("&url=" + Base64.encodeToString(k.i(string3), 2));
                                }
                                if (!TextUtils.isEmpty(string5)) {
                                    stringBuffer.append("&app_name=" + Base64.encodeToString(k.i(string5), 2));
                                }
                                if (!k.e(openIdWithCache)) {
                                    stringBuffer.append("&open_id=" + Base64.encodeToString(k.i(openIdWithCache), 2));
                                }
                                if (!k.e(string4)) {
                                    stringBuffer.append("&audioUrl=" + Base64.encodeToString(k.i(string4), 2));
                                }
                                stringBuffer.append("&req_type=" + Base64.encodeToString(k.i(String.valueOf(i)), 2));
                                if (!TextUtils.isEmpty(str)) {
                                    stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(k.i(String.valueOf(str)), 2));
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    stringBuffer.append("&mini_program_path=" + Base64.encodeToString(k.i(String.valueOf(str2)), 2));
                                }
                                if (!TextUtils.isEmpty(string8)) {
                                    stringBuffer.append("&mini_program_type=" + Base64.encodeToString(k.i(String.valueOf(string8)), 2));
                                }
                                if (!k.e(str3)) {
                                    stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(k.i(str3), 2));
                                }
                                if (!TextUtils.isEmpty(string10)) {
                                    stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(k.i(string10), 2));
                                }
                                stringBuffer.append("&cflag=" + Base64.encodeToString(k.i(String.valueOf(i2)), 2));
                                SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                                com.tencent.connect.a.a.a(e.a(), this.c, "requireApi", "shareToNativeQQ");
                                intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(stringBuffer.toString()));
                                intent.putExtra("pkg_name", activity.getPackageName());
                                if (k.g(activity, "4.6.0")) {
                                    if (a(intent)) {
                                        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                                        a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                                    }
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                                } else {
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                    if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                        SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                    }
                                    if (a(intent)) {
                                        a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
                                    }
                                }
                                if (a(intent)) {
                                    d.a().a(this.c.getOpenId(), this.c.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "0", this.mViaShareQzoneType, "0", "1", "0");
                                    d.a().a(0, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                                } else {
                                    d.a().a(this.c.getOpenId(), this.c.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "1", this.mViaShareQzoneType, "0", "1", "0");
                                    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
                                }
                                SLog.i(SLog.TAG, "doShareToQzone() --end");
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = string6;
                            SLog.e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                            appId = this.c.getAppId();
                            openIdWithCache = this.c.getOpenIdWithCache();
                            SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                            if (stringArrayList != null) {
                                str4 = stringArrayList.get(0);
                                stringBuffer.append("&image_url=" + Base64.encodeToString(k.i(URLEncoder.encode(str4)), 2));
                                if (!k.g(str4)) {
                                    strA = k.a(appId, activity, str4);
                                    if (!TextUtils.isEmpty(strA)) {
                                        stringBuffer.append("&image_uri=" + Base64.encodeToString(k.i(URLEncoder.encode(strA)), 2));
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(string)) {
                                stringBuffer.append("&title=" + Base64.encodeToString(k.i(string), 2));
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                stringBuffer.append("&description=" + Base64.encodeToString(k.i(string2), 2));
                            }
                            if (!TextUtils.isEmpty(appId)) {
                                stringBuffer.append("&share_id=" + appId);
                            }
                            if (!TextUtils.isEmpty(string3)) {
                                stringBuffer.append("&url=" + Base64.encodeToString(k.i(string3), 2));
                            }
                            if (!TextUtils.isEmpty(string5)) {
                                stringBuffer.append("&app_name=" + Base64.encodeToString(k.i(string5), 2));
                            }
                            if (!k.e(openIdWithCache)) {
                                stringBuffer.append("&open_id=" + Base64.encodeToString(k.i(openIdWithCache), 2));
                            }
                            if (!k.e(string4)) {
                                stringBuffer.append("&audioUrl=" + Base64.encodeToString(k.i(string4), 2));
                            }
                            stringBuffer.append("&req_type=" + Base64.encodeToString(k.i(String.valueOf(i)), 2));
                            if (!TextUtils.isEmpty(str)) {
                                stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(k.i(String.valueOf(str)), 2));
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                stringBuffer.append("&mini_program_path=" + Base64.encodeToString(k.i(String.valueOf(str2)), 2));
                            }
                            if (!TextUtils.isEmpty(string8)) {
                                stringBuffer.append("&mini_program_type=" + Base64.encodeToString(k.i(String.valueOf(string8)), 2));
                            }
                            if (!k.e(str3)) {
                                stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(k.i(str3), 2));
                            }
                            if (!TextUtils.isEmpty(string10)) {
                                stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(k.i(string10), 2));
                            }
                            stringBuffer.append("&cflag=" + Base64.encodeToString(k.i(String.valueOf(i2)), 2));
                            SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                            com.tencent.connect.a.a.a(e.a(), this.c, "requireApi", "shareToNativeQQ");
                            intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(stringBuffer.toString()));
                            intent.putExtra("pkg_name", activity.getPackageName());
                            if (k.g(activity, "4.6.0")) {
                                if (a(intent)) {
                                    UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                                    a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                                }
                                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                            } else {
                                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                }
                                if (a(intent)) {
                                    a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
                                }
                            }
                            if (a(intent)) {
                                d.a().a(this.c.getOpenId(), this.c.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "0", this.mViaShareQzoneType, "0", "1", "0");
                                d.a().a(0, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                            } else {
                                d.a().a(this.c.getOpenId(), this.c.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "1", this.mViaShareQzoneType, "0", "1", "0");
                                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
                            }
                            SLog.i(SLog.TAG, "doShareToQzone() --end");
                        }
                    }
                    str = string6;
                    str2 = string7;
                    if (setKeySet.size() > 0) {
                        string10 = jSONObject.toString();
                    }
                } catch (Exception e3) {
                    e = e3;
                    str = string6;
                    str2 = string7;
                }
            } else {
                str = string6;
                str2 = string7;
                str3 = string9;
            }
        } catch (Exception e4) {
            e = e4;
            str = string6;
            str2 = string7;
            str3 = string9;
        }
        appId = this.c.getAppId();
        openIdWithCache = this.c.getOpenIdWithCache();
        SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
        if (stringArrayList != null && stringArrayList.size() > 0) {
            str4 = stringArrayList.get(0);
            stringBuffer.append("&image_url=" + Base64.encodeToString(k.i(URLEncoder.encode(str4)), 2));
            if (!k.g(str4)) {
                strA = k.a(appId, activity, str4);
                if (!TextUtils.isEmpty(strA)) {
                    stringBuffer.append("&image_uri=" + Base64.encodeToString(k.i(URLEncoder.encode(strA)), 2));
                }
            }
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&title=" + Base64.encodeToString(k.i(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&description=" + Base64.encodeToString(k.i(string2), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&url=" + Base64.encodeToString(k.i(string3), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(k.i(string5), 2));
        }
        if (!k.e(openIdWithCache)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(k.i(openIdWithCache), 2));
        }
        if (!k.e(string4)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(k.i(string4), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(k.i(String.valueOf(i)), 2));
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(k.i(String.valueOf(str)), 2));
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(k.i(String.valueOf(str2)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(k.i(String.valueOf(string8)), 2));
        }
        if (!k.e(str3)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(k.i(str3), 2));
        }
        if (!TextUtils.isEmpty(string10)) {
            stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(k.i(string10), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(k.i(String.valueOf(i2)), 2));
        SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
        com.tencent.connect.a.a.a(e.a(), this.c, "requireApi", "shareToNativeQQ");
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra("pkg_name", activity.getPackageName());
        if (k.g(activity, "4.6.0")) {
            if (a(intent)) {
                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
            }
            SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
        } else {
            SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
            }
            if (a(intent)) {
                a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
            }
        }
        if (a(intent)) {
            d.a().a(this.c.getOpenId(), this.c.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "0", this.mViaShareQzoneType, "0", "1", "0");
            d.a().a(0, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
        } else {
            d.a().a(this.c.getOpenId(), this.c.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "1", this.mViaShareQzoneType, "0", "1", "0");
            d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
        }
        SLog.i(SLog.TAG, "doShareToQzone() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    /* JADX WARN: Code duplicated, block: B:113:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:119:0x040d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0417  */
    /* JADX WARN: Code duplicated, block: B:139:0x0497  */
    /* JADX WARN: Code duplicated, block: B:64:0x024e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0254  */
    /* JADX WARN: Code duplicated, block: B:68:0x028b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0291  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x02da  */
    /* JADX WARN: Code duplicated, block: B:86:0x0338  */
    /* JADX WARN: Code duplicated, block: B:94:0x0354  */
    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String str3;
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() params is null");
            d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string5 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String strA = k.a(activity);
        if (strA == null) {
            strA = bundle.getString("appName");
            str = "appName";
        } else {
            str = "appName";
            if (strA.length() > 20) {
                strA = strA.substring(0, 20) + "...";
            }
        }
        int i = bundle.getInt("req_type");
        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i);
        if (i == 1) {
            this.mViaShareQzoneType = "1";
        } else if (i == 5) {
            this.mViaShareQzoneType = "2";
        } else if (i != 6) {
            this.mViaShareQzoneType = "1";
        } else {
            this.mViaShareQzoneType = "4";
        }
        if (i != 1) {
            if (i == 5) {
                iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
                return;
            }
            if (i != 6) {
                if (i != 7) {
                    if (!k.e(string) || !k.e(string2)) {
                        this.a = true;
                    } else if (stringArrayList == null || stringArrayList.size() == 0) {
                        string = "来自" + strA + "的分享";
                        this.a = true;
                    } else {
                        this.a = false;
                    }
                    this.d = false;
                    SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
                    this.e = true;
                    this.f = false;
                } else {
                    if (TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                        iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                    }
                    this.e = false;
                    this.f = false;
                    this.a = false;
                }
            } else {
                if (k.g(activity, "5.0.0")) {
                    iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_APPSHARE_TOO_LOW, null));
                    SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, app share is not support below qq5.0.");
                    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone, app share is not support below qq5.0.");
                    return;
                }
                str2 = String.format("http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1", this.c.getAppId(), "mqq");
                bundle.putString("targetUrl", str2);
            }
            if (k.b() && k.g(activity, "4.5.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_NOSD_ERROR);
                return;
            }
            if (this.a) {
                if (TextUtils.isEmpty(str2)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                    return;
                } else if (!k.g(str2)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                    return;
                }
            }
            if (this.d) {
                bundle.putString("title", "");
                bundle.putString("summary", "");
            } else {
                if (!this.e && k.e(string)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
                    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
                    return;
                }
                if (!k.e(string) || string.length() <= 200) {
                    str3 = null;
                } else {
                    str3 = null;
                    bundle.putString("title", k.a(string, 200, (String) null, (String) null));
                }
                if (!k.e(string2) && string2.length() > 600) {
                    bundle.putString("summary", k.a(string2, 600, str3, str3));
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                bundle.putString(str, strA);
            }
            if (stringArrayList == null && stringArrayList.size() != 0) {
                int i2 = 0;
                while (i2 < stringArrayList.size()) {
                    String str4 = stringArrayList.get(i2);
                    if (!k.g(str4) && !k.h(str4)) {
                        stringArrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                if (stringArrayList.size() == 0) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 非法的图片地址!");
                    return;
                }
                bundle.putStringArrayList("imageUrl", stringArrayList);
            } else if (this.f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
            if (!k.g(activity, "4.6.0")) {
                SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
                b(activity, bundle, iUiListener);
            } else if (h.c(activity, "4.2.0") >= 0 || h.c(activity, "4.6.0") >= 0) {
                SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
                new TDialog(activity, "", a(""), null, this.c).show();
            } else {
                SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
                QQShare qQShare = new QQShare(activity, this.c);
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    String str5 = stringArrayList.get(0);
                    if (i == 5 && !k.h(str5)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_MUST_BE_LOCAL, null));
                        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        return;
                    }
                    bundle.putString("imageLocalUrl", str5);
                }
                if (!k.g(activity, "4.5.0")) {
                    bundle.putInt("cflag", 1);
                }
                qQShare.shareToQQ(activity, bundle, iUiListener);
            }
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
        }
        SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
        this.a = true;
        this.d = false;
        this.e = true;
        this.f = false;
        str2 = string3;
        if (k.b()) {
        }
        if (this.a) {
            if (TextUtils.isEmpty(str2)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                return;
            } else if (!k.g(str2)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                return;
            }
        }
        if (this.d) {
            bundle.putString("title", "");
            bundle.putString("summary", "");
        } else {
            if (!this.e) {
            }
            if (k.e(string)) {
                str3 = null;
            } else {
                str3 = null;
            }
            if (!k.e(string2)) {
                bundle.putString("summary", k.a(string2, 600, str3, str3));
            }
        }
        if (!TextUtils.isEmpty(strA)) {
            bundle.putString(str, strA);
        }
        if (stringArrayList == null) {
            if (this.f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
        } else if (this.f) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
            d.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
            return;
        }
        if (!k.g(activity, "4.6.0")) {
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
            b(activity, bundle, iUiListener);
        } else if (h.c(activity, "4.2.0") >= 0) {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.c).show();
        } else {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.c).show();
        }
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
    }
}
