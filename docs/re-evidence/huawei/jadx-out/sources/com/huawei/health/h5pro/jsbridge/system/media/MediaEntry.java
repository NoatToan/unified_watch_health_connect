package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.jsbridge.Callback;
import com.huawei.health.h5pro.jsbridge.ErrorEnum;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import defpackage.exl;
import defpackage.exm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MediaEntry extends JsBaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Media f6822a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private exl f6824c;
    private PublicFileOperate e;
    private TakePictureOperate j;
    private final Set<Long> d = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6823b = 0;

    @JavascriptInterface
    public void chooseFile(final long j, String str) {
        LogUtil.i(this.TAG, "chooseFile: " + j);
        if (!H5ProTrustListChecker.isTrusted(this.mH5ProInstance)) {
            LogUtil.w(this.TAG, "chooseFile: untrusted");
            onFailureCallback(j, "untrusted");
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f6823b >= 200) {
                this.f6823b = jCurrentTimeMillis;
                String strOptString = new JSONObject(str).optString("mimeType");
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = "*/*";
                }
                Media media = this.f6822a;
                if (media != null) {
                    media.chooseFile(strOptString, new Callback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.9
                        @Override // com.huawei.health.h5pro.jsbridge.Callback
                        public void onFailure(int i, String str2) {
                            LogUtil.i(MediaEntry.this.TAG, a.a("chooseFile: onFailure-> ", str2));
                            MediaEntry.this.onFailureCallback(j, a.a("chooseFile fail: ", str2), i);
                        }

                        @Override // com.huawei.health.h5pro.jsbridge.Callback
                        public void onSuccess(Object obj) {
                            LogUtil.i(MediaEntry.this.TAG, "chooseFile: onSuccess-> " + obj);
                            MediaEntry.this.onSuccessCallback(j, obj);
                        }
                    });
                    return;
                }
                return;
            }
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder("chooseFile: fail-> ");
            ErrorEnum errorEnum = ErrorEnum.REQ_FAST_REPEAT;
            sb.append(errorEnum.getMsg());
            LogUtil.i(str2, sb.toString());
            onFailureCallback(j, "chooseFile fail: " + errorEnum.getMsg(), errorEnum.getCode());
            this.f6823b = jCurrentTimeMillis;
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("chooseFile: catch-> ")));
            onFailureCallback(j, "chooseFile fail:" + e.getMessage());
        }
    }

    @JavascriptInterface
    public void getPublicFiles(final long j, String str) {
        LogUtil.i(this.TAG, "getPublicFiles");
        if (!H5ProTrustListChecker.isTrusted(this.mH5ProInstance)) {
            LogUtil.w(this.TAG, "getPublicFiles: untrusted");
            onFailureCallback(j, "untrusted");
            return;
        }
        PublicFileOperate.e eVar = (PublicFileOperate.e) GsonUtil.parseJson(str, PublicFileOperate.e.class);
        if (eVar == null) {
            onFailureCallback(j, "invalid parameter");
            return;
        }
        if (this.e == null) {
            this.e = new PublicFileOperate((Activity) this.mContext);
        }
        this.e.c(eVar, new PublicFileOperate.OnQueryFileCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.5
            @Override // com.huawei.health.h5pro.jsbridge.system.media.PublicFileOperate.OnQueryFileCallback
            public void onQueryFailure(int i, String str2) {
                LogUtil.i(MediaEntry.this.TAG, "getPublicFiles: onQueryFailure -> " + i + " - " + str2);
                MediaEntry.this.onFailureCallback(j, str2, i);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.media.PublicFileOperate.OnQueryFileCallback
            public void onQuerySuccess(List<JSONObject> list) {
                LogUtil.i(MediaEntry.this.TAG, "getPublicFiles: size -> " + list.size());
                MediaEntry.this.onSuccessCallback(j, list);
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TakePictureOperate takePictureOperate = this.j;
        if (takePictureOperate != null) {
            takePictureOperate.d(i, i2, intent);
            this.j = null;
            return;
        }
        exl exlVar = this.f6824c;
        if (exlVar != null) {
            exlVar.d(i, i2, intent);
            return;
        }
        Media media = this.f6822a;
        if (media != null) {
            media.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        if (this.f6822a == null) {
            this.f6822a = new AndroidMedia();
        }
        this.f6822a.onMount(this.mContext);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        Media media = this.f6822a;
        if (media != null) {
            media.destroy();
            this.f6822a = null;
        }
        TakePictureOperate takePictureOperate = this.j;
        if (takePictureOperate != null) {
            takePictureOperate.c();
            this.j = null;
        }
        PublicFileOperate publicFileOperate = this.e;
        if (publicFileOperate != null) {
            publicFileOperate.a();
        }
        this.f6824c = null;
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        exl exlVar = this.f6824c;
        if (exlVar != null) {
            exlVar.d(i, strArr, iArr);
            return;
        }
        PublicFileOperate publicFileOperate = this.e;
        if (publicFileOperate != null) {
            publicFileOperate.d(i, strArr, iArr);
            this.e = null;
        }
        TakePictureOperate takePictureOperate = this.j;
        if (takePictureOperate != null) {
            takePictureOperate.d(i, strArr, iArr);
            return;
        }
        Media media = this.f6822a;
        if (media != null) {
            media.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @JavascriptInterface
    public void pictureChooser(final long j, String str) {
        LogUtil.i(this.TAG, "pictureChooser");
        if (EnvironmentHelper.getInstance().isMobileAppEngine()) {
            Toast.makeText(this.mContext, R.string.IDS_PictureChooser_toast_pc, 0).show();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("cropType");
            boolean zOptBoolean = jSONObject.optBoolean("isNeedInfo", false);
            long jOptLong = jSONObject.optLong("maxSize", -1L);
            int iOptInt = jSONObject.optInt("maxSideLength", -1);
            if (this.f6824c == null) {
                this.f6824c = new exl((Activity) this.mContext, this.mH5ProInstance);
            }
            this.f6824c.b(strOptString, strOptString2, jOptLong, iOptInt, zOptBoolean, new Callback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.4
                @Override // com.huawei.health.h5pro.jsbridge.Callback
                public void onFailure(int i, String str2) {
                    MediaEntry.this.f6824c = null;
                    MediaEntry.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.Callback
                public void onSuccess(Object obj) {
                    MediaEntry.this.f6824c = null;
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("imgData", obj);
                        MediaEntry.this.onSuccessCallback(j, jSONObject2);
                    } catch (JSONException e) {
                        MediaEntry.this.onFailureCallback(j, e.getMessage());
                    }
                }
            });
        } catch (JSONException e) {
            this.f6824c = null;
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void scanPublicFile(final long j, String str) {
        LogUtil.i(this.TAG, "scanPublicFile");
        try {
            String strOptString = new JSONObject(str).optString("mimeType");
            if (this.e == null) {
                this.e = new PublicFileOperate((Activity) this.mContext);
            }
            this.e.e(Environment.getExternalStorageDirectory().getAbsolutePath(), TextUtils.isEmpty(strOptString) ? new String[]{"*/*"} : strOptString.split(","), new H5ProMediaScanner.OnScanFileCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.3
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str2, Uri uri) {
                    LogUtil.i(MediaEntry.this.TAG, "scanPublicFile: onScanCompleted");
                    MediaEntry.this.onSuccessCallback(j, Boolean.TRUE);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.media.H5ProMediaScanner.OnScanFileCallback
                public void onScanFailure(String str2) {
                    LogUtil.i(MediaEntry.this.TAG, "scanPublicFile: onScanFailure");
                    MediaEntry.this.onFailureCallback(j, str2);
                }
            });
        } catch (JSONException e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void scanQrCode(long j) {
        Media media;
        if (!this.d.add(Long.valueOf(j)) || (media = this.f6822a) == null) {
            return;
        }
        media.scanQrCode(new AndroidMedia.Callback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.2
            @Override // com.huawei.health.h5pro.jsbridge.system.media.AndroidMedia.Callback
            public void onFailure(String str) {
                Iterator it = MediaEntry.this.d.iterator();
                while (it.hasNext()) {
                    MediaEntry.this.onFailureCallback(((Long) it.next()).longValue(), str, exm.b(str));
                }
                MediaEntry.this.d.clear();
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.media.AndroidMedia.Callback
            public void onSuccess(Object obj) {
                Iterator it = MediaEntry.this.d.iterator();
                while (it.hasNext()) {
                    MediaEntry.this.onSuccessCallback(((Long) it.next()).longValue(), obj);
                }
                MediaEntry.this.d.clear();
            }
        });
    }

    @JavascriptInterface
    public void takePicture(final long j, String str) {
        LogUtil.i(this.TAG, "takePicture");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultType");
            long jOptLong = jSONObject.optLong("maxSize");
            int iOptInt = jSONObject.optInt("maxSideLength", -1);
            if (this.j == null) {
                this.j = new TakePictureOperate((Activity) this.mContext, this.mH5ProInstance);
            }
            this.j.e(strOptString, jOptLong, iOptInt, new TakePictureOperate.OnTakePictureCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.6
                @Override // com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.OnTakePictureCallback
                public void onFailure(int i, String str2) {
                    LogUtil.i(MediaEntry.this.TAG, "takePicture: onFailure -> " + i + " - " + str2);
                    MediaEntry.this.j = null;
                    MediaEntry.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.media.TakePictureOperate.OnTakePictureCallback
                public void onSuccess(String str2) {
                    LogUtil.d(MediaEntry.this.TAG, a.a("takePicture: onSuccess -> ", str2));
                    MediaEntry.this.j = null;
                    MediaEntry.this.onSuccessCallback(j, str2);
                }
            });
        } catch (JSONException e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void uploadPicture(final long j, String str) {
        try {
            this.f6822a.uploadPicture(new JSONObject(str).optString("img"));
            new Timer().schedule(new TimerTask() { // from class: com.huawei.health.h5pro.jsbridge.system.media.MediaEntry.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    MediaEntry.this.onSuccessCallback(j, "upload success");
                    cancel();
                }
            }, 1000L, 1000L);
        } catch (JSONException e) {
            onFailureCallback(j, "upload picture fail:" + e.getMessage());
        }
    }
}
