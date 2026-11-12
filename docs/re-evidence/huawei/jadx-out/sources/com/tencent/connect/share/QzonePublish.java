package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class QzonePublish extends BaseApi {
    public static final String HULIAN_CALL_BACK = "hulian_call_back";
    public static final String HULIAN_EXTRA_SCENE = "hulian_extra_scene";
    public static final String PUBLISH_TO_QZONE_APP_NAME = "appName";
    public static final String PUBLISH_TO_QZONE_EXTMAP = "extMap";
    public static final String PUBLISH_TO_QZONE_IMAGE_URL = "imageUrl";
    public static final String PUBLISH_TO_QZONE_KEY_TYPE = "req_type";
    public static final String PUBLISH_TO_QZONE_SUMMARY = "summary";
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD = 3;
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO = 4;
    public static final String PUBLISH_TO_QZONE_VIDEO_DURATION = "videoDuration";
    public static final String PUBLISH_TO_QZONE_VIDEO_PATH = "videoPath";
    public static final String PUBLISH_TO_QZONE_VIDEO_SIZE = "videoSize";

    public QzonePublish(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void publishToQzone(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QzonePublish", "publishToQzone() -- start");
        if (com.tencent.connect.a.a("openSDK_LOG.QzonePublish", iUiListener)) {
            return;
        }
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzonePublish", "-->publishToQzone, params is null");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        if (!m.f(activity)) {
            iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_VERSION_TOO_LOW, null));
            SLog.e("openSDK_LOG.QzonePublish", "-->publishToQzone, this is not support below qq 5.9.5");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publicToQzone, this is not support below qq 5.9.5");
            new TDialog(activity, "", a(""), null, this.f30928c).show();
            return;
        }
        String strA = m.a(activity);
        int i = 0;
        if (strA == null) {
            strA = bundle.getString("appName");
        } else if (strA.length() > 20) {
            strA = strA.substring(0, 20) + "...";
        }
        if (!TextUtils.isEmpty(strA)) {
            bundle.putString("appName", strA);
        }
        int i2 = bundle.getInt("req_type");
        if (i2 == 3) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                while (i < stringArrayList.size()) {
                    if (!m.i(stringArrayList.get(i))) {
                        stringArrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                bundle.putStringArrayList("imageUrl", stringArrayList);
            }
            b(activity, bundle, iUiListener);
            SLog.i("openSDK_LOG.QzonePublish", "publishToQzone() --end");
            return;
        }
        if (i2 == 4) {
            final String string = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
            if (!m.i(string)) {
                SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() video url invalid");
                iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
                return;
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.tencent.connect.share.QzonePublish.1
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer2) {
                    long length = new File(string).length();
                    int duration = mediaPlayer2.getDuration();
                    bundle.putString(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, string);
                    bundle.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, duration);
                    bundle.putLong(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, length);
                    QzonePublish.this.b(activity, bundle, iUiListener);
                    SLog.i("openSDK_LOG.QzonePublish", "publishToQzone() --end");
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.tencent.connect.share.QzonePublish.2
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer2, int i3, int i4) {
                    SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() mediaplayer onError()");
                    iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
                    return false;
                }
            });
            try {
                mediaPlayer.setDataSource(string);
                mediaPlayer.prepareAsync();
                return;
            } catch (Exception unused) {
                SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() exception(s) occurred when preparing mediaplayer");
                iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
                return;
            }
        }
        iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
        SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() error--end请选择支持的分享类型");
        e.a().a(1, "SHARE_CHECK_SDK", "1000", this.f30928c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publishToQzone() 请选择支持的分享类型");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0162  */
    /* JADX WARN: Code duplicated, block: B:48:0x016d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x020e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0225  */
    /* JADX WARN: Code duplicated, block: B:63:0x0245  */
    /* JADX WARN: Code duplicated, block: B:66:0x0265  */
    /* JADX WARN: Code duplicated, block: B:67:0x0280  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x016d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0191, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x01ee, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x020e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0245, please report this as an issue */
    public void b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String string;
        String appId;
        String openId;
        String str3;
        String str4;
        int i;
        String strA;
        SLog.i("openSDK_LOG.QzonePublish", "doPublishToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string2 = bundle.getString("summary");
        int i2 = bundle.getInt("req_type", 3);
        String string3 = bundle.getString("appName");
        String string4 = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
        int i3 = bundle.getInt(PUBLISH_TO_QZONE_VIDEO_DURATION);
        long j = bundle.getLong(PUBLISH_TO_QZONE_VIDEO_SIZE);
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 == null) {
                str = string3;
                str2 = "";
            } else {
                Set<String> setKeySet = bundle2.keySet();
                str2 = "";
                try {
                    JSONObject jSONObject = new JSONObject();
                    Iterator<String> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        Iterator<String> it2 = it;
                        String next = it.next();
                        if (TextUtils.isEmpty(bundle2.getString(next))) {
                            str = string3;
                        } else {
                            str = string3;
                            try {
                                jSONObject.put(next, bundle2.getString(next));
                            } catch (Exception e) {
                                e = e;
                                SLog.e("openSDK_LOG.QzonePublish", "publishToQzone()  --error parse extmap", e);
                                string = str2;
                                appId = this.f30928c.getAppId();
                                openId = this.f30928c.getOpenId();
                                SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
                                if (3 == i2) {
                                    str3 = openId;
                                    str4 = str2;
                                } else {
                                    str3 = openId;
                                    str4 = str2;
                                }
                                if (4 == i2) {
                                    stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
                                    strA = m.a(appId, activity, string4, iUiListener);
                                    if (!TextUtils.isEmpty(strA)) {
                                        stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
                                    }
                                    stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i3)), 2));
                                    stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j)), 2));
                                    str4 = "8";
                                }
                                String str5 = str4;
                                if (!TextUtils.isEmpty(string2)) {
                                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                                }
                                if (!TextUtils.isEmpty(appId)) {
                                    stringBuffer.append("&share_id=" + appId);
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str), 2));
                                }
                                if (!m.e(str3)) {
                                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
                                }
                                if (TextUtils.isEmpty(string)) {
                                    i = 2;
                                } else {
                                    StringBuilder sb = new StringBuilder("&share_qzone_ext_str=");
                                    i = 2;
                                    sb.append(Base64.encodeToString(m.j(string), 2));
                                    stringBuffer.append(sb.toString());
                                }
                                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i2)), i));
                                SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                                com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
                                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                                intent.setPackage("com.tencent.mobileqq");
                                intent.setData(Uri.parse(stringBuffer.toString()));
                                intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                                intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), str5, "", "", "0", "1", "0"));
                                a(activity, 10104, intent, false);
                                SLog.i(SLog.TAG, "doPublishToQzone() --end");
                            }
                        }
                        it = it2;
                        string3 = str;
                    }
                    str = string3;
                    if (jSONObject.length() > 0) {
                        string = jSONObject.toString();
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = string3;
                }
                appId = this.f30928c.getAppId();
                openId = this.f30928c.getOpenId();
                SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
                if (3 == i2 || stringArrayList == null) {
                    str3 = openId;
                    str4 = str2;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    int size = stringArrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        String str6 = openId;
                        stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i4)));
                        String strA2 = m.a(appId, activity, stringArrayList.get(i4), iUiListener);
                        if (!TextUtils.isEmpty(strA2)) {
                            stringBuffer3.append(URLEncoder.encode(strA2));
                        }
                        if (i4 != size - 1) {
                            stringBuffer2.append(";");
                            stringBuffer3.append(";");
                        }
                        i4++;
                        openId = str6;
                    }
                    str3 = openId;
                    stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(stringBuffer2.toString()), 2));
                    if (!TextUtils.isEmpty(stringBuffer3.toString())) {
                        stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(stringBuffer3.toString()), 2));
                    }
                    str4 = "7";
                }
                if (4 == i2) {
                    stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
                    strA = m.a(appId, activity, string4, iUiListener);
                    if (!TextUtils.isEmpty(strA)) {
                        stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
                    }
                    stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i3)), 2));
                    stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j)), 2));
                    str4 = "8";
                }
                String str7 = str4;
                if (!TextUtils.isEmpty(string2)) {
                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                }
                if (!TextUtils.isEmpty(appId)) {
                    stringBuffer.append("&share_id=" + appId);
                }
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str), 2));
                }
                if (!m.e(str3)) {
                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
                }
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder("&share_qzone_ext_str=");
                    i = 2;
                    sb2.append(Base64.encodeToString(m.j(string), 2));
                    stringBuffer.append(sb2.toString());
                } else {
                    i = 2;
                }
                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i2)), i));
                SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent2.setPackage("com.tencent.mobileqq");
                intent2.setData(Uri.parse(stringBuffer.toString()));
                intent2.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                intent2.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), str7, "", "", "0", "1", "0"));
                a(activity, 10104, intent2, false);
                SLog.i(SLog.TAG, "doPublishToQzone() --end");
            }
        } catch (Exception e3) {
            e = e3;
            str = string3;
            str2 = "";
        }
        string = str2;
        appId = this.f30928c.getAppId();
        openId = this.f30928c.getOpenId();
        SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
        if (3 == i2) {
            str3 = openId;
            str4 = str2;
        } else {
            str3 = openId;
            str4 = str2;
        }
        if (4 == i2) {
            stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
            strA = m.a(appId, activity, string4, iUiListener);
            if (!TextUtils.isEmpty(strA)) {
                stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
            }
            stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i3)), 2));
            stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j)), 2));
            str4 = "8";
        }
        String str8 = str4;
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str), 2));
        }
        if (!m.e(str3)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
        }
        if (TextUtils.isEmpty(string)) {
            StringBuilder sb3 = new StringBuilder("&share_qzone_ext_str=");
            i = 2;
            sb3.append(Base64.encodeToString(m.j(string), 2));
            stringBuffer.append(sb3.toString());
        } else {
            i = 2;
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i2)), i));
        SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
        com.tencent.connect.a.a.a(g.a(), this.f30928c, "requireApi", "shareToNativeQQ");
        Intent intent3 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent3.setPackage("com.tencent.mobileqq");
        intent3.setData(Uri.parse(stringBuffer.toString()));
        intent3.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent3.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f30928c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f30928c.getAppId(), str8, "", "", "0", "1", "0"));
        a(activity, 10104, intent3, false);
        SLog.i(SLog.TAG, "doPublishToQzone() --end");
    }
}
