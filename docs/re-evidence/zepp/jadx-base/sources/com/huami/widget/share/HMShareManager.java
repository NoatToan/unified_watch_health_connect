package com.huami.widget.share;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicerecorder.UriGetter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.HMShareManager;
import com.huami.widget.share.config.ShareKitConfig;
import com.huami.widget.share.dialog.SuccessDialogFragment;
import com.huami.widget.share.platform.ErrorMessage;
import com.huami.widget.share.platform.ShareMissionListener;
import com.huami.widget.share.platform.ShareResult;
import com.huami.widget.share.platform.Sharer;
import com.huami.widget.share.utils.ShareStatEvent;
import com.huami.widget.share.utils.ShareUtils;
import com.huami.widget.share.utils.UriCompatKt;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class HMShareManager implements IWXAPIEventHandler, WbShareCallback {
    private static final String A = "com.sina.weibo";
    private static final String B = "com.sina.weibog3";
    private static final String C = "com.qzone";
    private static final String D = "com.tencent.mobileqq";
    private static final String E = "com.facebook.katana";
    private static final String F = "com.twitter.android";
    private static final String G = "com.instagram.android";
    private static final String H = "jp.naver.line.android";
    private static final String I = "com.tencent.mobileqq.activity.JumpActivity";
    private static final String J = "com.tencent.mm.ui.tools.ShareImgUI";
    private static final String K = "com.tencent.mm.ui.tools.ShareToTimeLineUI";
    private static final int L = 18;
    public static final int M = 19;
    public static final int N = 20;
    public static final int TYPE_SHARE_CUSTOM_ITEMS = 9;
    public static final int TYPE_SHARE_FIT_AND_COPY_DELETE = 8;
    public static final int TYPE_SHARE_FIT_ONLY_BLOCK = 5;
    public static final int TYPE_SHARE_FIT_ONLY_SHARE = 4;
    public static final int TYPE_SHARE_FIT_REPORT_AND_COPY = 6;
    public static final int TYPE_SHARE_FIT_REPORT_AND_COPY_DELETE = 7;
    public static final int TYPE_SHARE_HTML = 2;
    public static final int TYPE_SHARE_NORMAL = 1;
    public static final int TYPE_SHARE_OUTSIDE = 3;
    private static final String l = "HMShareManager";
    private static final String m = "domestic";
    private static final float n = 32768.0f;
    private static final float o = 2097152.0f;
    private static final int p = 1000;
    private static final String q = "_mifit_circle_resize";
    private static final String r = ".jpg";
    private static final String s = ".png";
    private static final String t = "we_chat";
    private static final String u = "weibo";
    private static final String v = "qq";
    private static final String w = "qzone";
    private static final String x = "line";
    private static final String y = "twitter";
    private static final String z = "com.tencent.mm";
    private FragmentActivity a;
    private IWBAPI b;
    private IWXAPI c;
    private Tencent d;
    private long e;
    private final Handler f;
    private Sharer g;
    private ShareResultListener h;
    private final IUiListener i;
    public boolean isFaceBookForbidden;
    private final IUiListener j;
    private LoadingDialog k;

    public interface ShareResultListener {
        void onCancel(int i);

        void onClicked(int i);

        void onComplete(int i);

        void onError(int i, int i2, String str);
    }

    public class a implements ShareMissionListener {
        public a() {
        }

        @Override // com.huami.widget.share.platform.ShareMissionListener
        public void onCancel(int i) {
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onCancel(i);
            }
        }

        @Override // com.huami.widget.share.platform.ShareMissionListener
        public void onFailed(int i, ErrorMessage errorMessage) {
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onError(i, 0, errorMessage.message);
            }
        }

        @Override // com.huami.widget.share.platform.ShareMissionListener
        public void onSuccess(int i, ShareResult shareResult) {
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onComplete(i);
            }
        }
    }

    public class b implements IUiListener {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(UiError uiError) {
            return "share_qq_selector onError " + uiError.errorMessage + AESEncryptionHelper.SEPARATOR + uiError.errorCode;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onCancel(6);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onComplete(6);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(final UiError uiError) {
            HMLog.error(HMShareManager.l, new Function0() { // from class: com.huami.widget.share.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.b.b(uiError);
                }
            });
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onError(6, uiError.errorCode, uiError.errorMessage);
            }
        }
    }

    public class c implements IUiListener {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "mShareToQQzone onCancel. ";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(UiError uiError) {
            return String.format("mShareToQQzone onError errorCode = %s , errorMessage = %s", Integer.valueOf(uiError.errorCode), uiError.errorMessage);
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            HMLog.warn(HMShareManager.l, new Function0() { // from class: com.huami.widget.share.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.c.c();
                }
            });
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onCancel(5);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onComplete(5);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(final UiError uiError) {
            HMLog.error(HMShareManager.l, new Function0() { // from class: com.huami.widget.share.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.c.d(uiError);
                }
            });
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onError(5, uiError.errorCode, uiError.errorMessage);
            }
        }
    }

    public class d implements ShareMifitCircleApi.ApiListener {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public d(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Context context) {
            HMShareManager.this.k.setFailed(context.getString(R.string.share_fail));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            HMShareManager.this.k.dismiss();
            SuccessDialogFragment.INSTANCE.newInstance(str).show(HMShareManager.this.a.getSupportFragmentManager());
        }

        @Override // com.huami.widget.share.ShareMifitCircleApi.ApiListener
        public void onFailed(int i, String str) {
            HMShareManager hMShareManager = HMShareManager.this;
            final Context context = this.a;
            hMShareManager.k0(new Runnable() { // from class: com.huami.widget.share.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(context);
                }
            });
            if (i == 601002) {
                CustomToast.showShort(this.a, str);
            }
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onError(14, i, str);
            }
            HMShareManager.this.z(this.b);
            HMShareManager.this.j0("SportBriefing_ShareStatus", "Fail");
        }

        @Override // com.huami.widget.share.ShareMifitCircleApi.ApiListener
        public void onSuccess(String str, final String str2) {
            HMShareManager.this.k0(new Runnable() { // from class: com.huami.widget.share.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(str2);
                }
            });
            if (HMShareManager.this.h != null) {
                HMShareManager.this.h.onComplete(14);
            }
            HMShareManager.this.z(this.b);
            HMShareManager.this.j0("SportBriefing_ShareStatus", "Success");
        }
    }

    public HMShareManager() {
        this.c = null;
        this.d = null;
        this.isFaceBookForbidden = false;
        this.i = new b();
        this.j = new c();
        this.f = new Handler(Looper.getMainLooper());
    }

    private void A(@NonNull SparseArray<ShareTarget> sparseArray, @Nullable ResolveInfo resolveInfo, int i) {
        ShareTarget shareTarget = sparseArray.get(i);
        if (shareTarget != null) {
            shareTarget.enable = true;
            shareTarget.a = resolveInfo;
        }
    }

    private int D(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getByteCount();
    }

    private List<ShareTarget> E(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        SparseArray<ShareTarget> sparseArray = new SparseArray<>();
        for (int i : iArr) {
            u(arrayList, sparseArray, ShareTargetFactory.INSTANCE.create(i));
        }
        x(sparseArray);
        return arrayList;
    }

    private String F() {
        return "share_" + Calendar.getInstance().getTimeInMillis() + r;
    }

    private List<ShareTarget> G(int i) {
        ArrayList arrayList = new ArrayList();
        SparseArray<ShareTarget> sparseArray = new SparseArray<>();
        J(arrayList, sparseArray, i);
        x(sparseArray);
        return arrayList;
    }

    private String H(String str) {
        if (!str.endsWith(r) && !str.endsWith(s)) {
            return str + q + r;
        }
        return str.substring(0, str.length() - 4) + q + str.substring(str.length() - 4);
    }

    private List<ShareTarget> I() {
        ArrayList arrayList = new ArrayList();
        SparseArray<ShareTarget> sparseArray = new SparseArray<>();
        J(arrayList, sparseArray, 3);
        x(sparseArray);
        return arrayList;
    }

    private void J(List<ShareTarget> list, SparseArray<ShareTarget> sparseArray, int i) {
        if (!ShareKitConfig.INSTANCE.isMainLandChannel()) {
            u(list, sparseArray, new ShareTarget(R.drawable.ic_line_44, R.string.share_line_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_LINE, 7));
            u(list, sparseArray, new ShareTarget(R.drawable.ic_twitter_44, R.string.share_twitter_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_TWITTER, 9));
            if (S(8)) {
                u(list, sparseArray, new ShareTarget(R.drawable.ic_facebook_44, R.string.share_facebook_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_FACEBOOK, 8));
                return;
            }
            return;
        }
        u(list, sparseArray, new ShareTarget(R.drawable.ic_weichat_44, R.string.share_weixin_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_WECHAT, 1));
        u(list, sparseArray, new ShareTarget(R.drawable.ic_moments_44, R.string.share_pengyouquan_label, ShareStatEvent.VALUE_SHARE_TO_WECHAT_FRIENDS, 2));
        u(list, sparseArray, new ShareTarget(R.drawable.ic_weibo_44, R.string.share_weibo_label, ShareStatEvent.VALUE_SHARE_TO_WEIBO, 4));
        u(list, sparseArray, new ShareTarget(R.drawable.ic_qq_44, R.string.share_qq_label, ShareStatEvent.VALUE_SHARE_TO_QQ, 6));
        u(list, sparseArray, new ShareTarget(R.drawable.ic_qzone_44, R.string.share_qq_zone_label, ShareStatEvent.VALUE_SHARE_TO_QQ_ZONE, 5));
        if (i == 5) {
            ShareTarget shareTarget = new ShareTarget(R.drawable.detail_icon_share_pullblack, R.string.share_block, ShareStatEvent.VALUE_SHARE_TO_BLOCK, 18);
            list.add(shareTarget);
            shareTarget.enable = true;
            sparseArray.put(shareTarget.type, shareTarget);
        }
        if (i == 6 || i == 7 || i == 8) {
            ShareTarget shareTarget2 = new ShareTarget(R.drawable.detail_icon_share_coppy, R.string.share_copy, ShareStatEvent.VALUE_SHARE_TO_COPY, 16);
            list.add(shareTarget2);
            shareTarget2.enable = true;
            sparseArray.put(shareTarget2.type, shareTarget2);
            if (i != 8) {
                ShareTarget shareTarget3 = new ShareTarget(R.drawable.detail_icon_share_report, R.string.share_report, ShareStatEvent.VALUE_SHARE_TO_REPORT, 17);
                shareTarget3.enable = true;
                u(list, sparseArray, shareTarget3);
            }
            if (i == 7) {
                ShareTarget shareTarget4 = new ShareTarget(R.drawable.share_detail_icon_delete, R.string.share_optional_delete, ShareStatEvent.VALUE_SHARE_TO_DELETE, 19);
                shareTarget4.enable = true;
                u(list, sparseArray, shareTarget4);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    private List<ResolveInfo> K() {
        Intent intent = new Intent("android.intent.action.SEND", (Uri) null);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType(UriGetter.ShareContentType.IMAGE);
        return this.a.getPackageManager().queryIntentActivities(intent, 0);
    }

    private Bitmap L(String str) {
        try {
            float fD = D(BitmapFactory.decodeFile(str));
            int iW = 1;
            if (fD > o) {
                float f = fD % o;
                float f2 = fD / o;
                if (f != 0.0f) {
                    f2 += 1.0f;
                }
                iW = w(str, Math.sqrt(f2));
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = iW;
            return BitmapFactory.decodeStream(new FileInputStream(str), null, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Bitmap M(File file) {
        if (file == null) {
            return null;
        }
        int iW = 1;
        try {
            float fD = D(BitmapFactory.decodeFile(file.getPath()));
            if (fD > n) {
                iW = w(file.getPath(), Math.sqrt(fD / n));
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = iW;
            return BitmapFactory.decodeStream(new FileInputStream(file), null, options);
        } catch (Exception e) {
            HMLog.error(l, new Function0() { // from class: gg3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(e);
                }
            });
            return null;
        }
    }

    private List<ShareTarget> N() {
        ArrayList arrayList = new ArrayList();
        SparseArray<ShareTarget> sparseArray = new SparseArray<>();
        J(arrayList, sparseArray, 1);
        if (ShareKitConfig.INSTANCE.isMainLandChannel() && Constant.SHOW_MIFIT_CIRCLE_BY_ID_AND_CHANNEL) {
            u(arrayList, sparseArray, new ShareTarget(R.drawable.share_mifit_circle, R.string.share_mifit_circle_label, ShareStatEvent.VALUE_SHARE_TO_MIFIT_CIRCLE, 14));
        }
        u(arrayList, sparseArray, new ShareTarget(R.drawable.ic_download_44, R.string.share_to_local, ShareStatEvent.VALUE_SHARE_TO_LOCAL, 13));
        x(sparseArray);
        return arrayList;
    }

    private String O(String str, String str2) {
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            int iMax = Math.max(height, width);
            int i = 1000;
            if (iMax > 1000) {
                float f = iMax / 1000.0f;
                if (iMax != height) {
                    i = (int) (height / f);
                }
                float f2 = (i * 1.0f) / height;
                Matrix matrix = new Matrix();
                matrix.postScale(f2, f2);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix, true);
            } else {
                bitmapCreateBitmap = bitmapDecodeFile;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            if (bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream)) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            if (!bitmapDecodeFile.isRecycled()) {
                bitmapDecodeFile.recycle();
            }
            if (!bitmapCreateBitmap.isRecycled()) {
                bitmapCreateBitmap.recycle();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    private void P(FragmentActivity fragmentActivity) {
        IWBAPI iwbapiCreateWBAPI = WBAPIFactory.createWBAPI(fragmentActivity.getApplicationContext());
        this.b = iwbapiCreateWBAPI;
        iwbapiCreateWBAPI.registerApp(fragmentActivity, new AuthInfo(fragmentActivity, Constant.WEIBO_APPKEY, Constant.a, Constant.b));
    }

    private static boolean Q(Context context, String str) {
        PackageInfo packageInfo;
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    private boolean R() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.e;
        if (0 < j && j < 1500) {
            return true;
        }
        this.e = jCurrentTimeMillis;
        return false;
    }

    private boolean S(int i) {
        if (this.isFaceBookForbidden && i == 8) {
            return false;
        }
        return HMSharerConfig.isSupportType(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T(Exception exc) {
        return "复制单个文件操作出错:" + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V(BaseReq baseReq) {
        return "BaseReq  errorStr = " + baseReq.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W(BaseResp baseResp) {
        return "BaseResp  errorStr = " + baseResp.errStr + ", errCode = " + baseResp.errCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X(int i) {
        return "share failure , sharedType = " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y(ShareContent shareContent, boolean z2) {
        return "ShareContent = " + shareContent + " , onlyImage = " + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z() {
        return "share_weixin_selector return false, share failure !";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0() {
        return "share_pengyouquan_selector return false, share failure! ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b0() {
        return "click save to local";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c0() {
        return "imagepath 目录不存在";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d0() {
        return "保存图片失败";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchToMifitCircle(FragmentActivity fragmentActivity, String str, String str2) {
        HMShareManager hMShareManager = new HMShareManager();
        hMShareManager.a = fragmentActivity;
        hMShareManager.n0((ShareResultListener) fragmentActivity);
        hMShareManager.r0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e0(Exception exc) {
        return "exception = " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0() {
        FragmentActivity fragmentActivity = this.a;
        int i = R.string.share_starting;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(fragmentActivity, fragmentActivity.getString(i));
        this.k = loadingDialogShowDialog;
        loadingDialogShowDialog.setMessage(this.a.getString(i));
        this.k.setCancelable(false);
        this.k.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str, String str2) {
        Analytics.recordEvent(new CountEventBuilder(str).setValue(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Runnable runnable) {
        this.f.post(runnable);
    }

    private boolean l0(String str, Bitmap bitmap) {
        ImageObject imageObject;
        TextObject textObject = null;
        if (bitmap != null) {
            imageObject = new ImageObject();
            imageObject.setImageData(bitmap);
        } else {
            imageObject = null;
        }
        if (!"".equals(str)) {
            textObject = new TextObject();
            textObject.text = str;
        }
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        if (textObject != null) {
            weiboMultiMessage.textObject = textObject;
        }
        if (imageObject != null) {
            weiboMultiMessage.imageObject = imageObject;
        }
        this.b.shareMessage(this.a, weiboMultiMessage, true);
        return true;
    }

    private boolean m0(String str, Bitmap bitmap) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        if (bitmap != null) {
            ImageObject imageObject = new ImageObject();
            imageObject.setImageData(bitmap);
            weiboMultiMessage.mediaObject = imageObject;
        } else {
            TextObject textObject = new TextObject();
            textObject.text = str;
            weiboMultiMessage.mediaObject = textObject;
        }
        this.b.shareMessage(this.a, weiboMultiMessage, true);
        return true;
    }

    private void o0(ShareTarget shareTarget, String str, String str2, String str3, final int i) throws Throwable {
        if (shareTarget != null) {
            ResolveInfo resolveInfo = shareTarget.a;
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                String str4 = activityInfo.packageName;
                String str5 = activityInfo.name;
                if (Arrays.asList(7, 9).contains(Integer.valueOf(i))) {
                    intent.setPackage(str4);
                } else {
                    intent.setComponent(new ComponentName(str4, str5));
                }
                intent.putExtra("android.intent.extra.SUBJECT", str);
                intent.putExtra("android.intent.extra.TEXT", str2);
                if (TextUtils.isEmpty(str3)) {
                    intent.setType("text/plain");
                } else {
                    intent.setType(UriGetter.ShareContentType.IMAGE);
                    if (Build.VERSION.SDK_INT >= 24) {
                        Uri externalUri = UriCompatKt.getExternalUri(this.a, str3);
                        if (externalUri == null) {
                            externalUri = FileProvider.getUriForFile(this.a.getApplicationContext(), this.a.getString(R.string.share_provider_file_authorities), new File(str3));
                        }
                        intent.putExtra("android.intent.extra.STREAM", externalUri);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                    }
                }
                intent.setFlags(268435456);
                this.a.getApplicationContext().startActivity(intent);
                ShareResultListener shareResultListener = this.h;
                if (shareResultListener != null) {
                    shareResultListener.onComplete(i);
                }
            } catch (Exception e) {
                HMLog.error(l, new Function0() { // from class: bg3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMShareManager.X(i);
                    }
                });
                ShareResultListener shareResultListener2 = this.h;
                if (shareResultListener2 != null) {
                    shareResultListener2.onError(i, -1, e.getMessage());
                }
            }
        }
    }

    private void r0(String str, String str2) {
        ShareResultListener shareResultListener = this.h;
        if (shareResultListener != null) {
            shareResultListener.onClicked(14);
        }
        Context applicationContext = this.a.getApplicationContext();
        if (!ShareUtils.isNetworkConnected(applicationContext)) {
            IconToast.showError(applicationContext, applicationContext.getString(R.string.no_network_connection));
        } else {
            if (TextUtils.isEmpty(str)) {
                IconToast.showError(applicationContext, applicationContext.getString(R.string.share_fail));
                return;
            }
            w0();
            String strO = O(str, H(str));
            ShareMifitCircleApi.shareToMifitCircle(strO, str2, new d(applicationContext, strO));
        }
    }

    private void s0(ShareContent shareContent, ShareTarget shareTarget) throws Throwable {
        String str = shareContent.title;
        String str2 = shareContent.bitmapUrl;
        String str3 = shareContent.url;
        String str4 = shareContent.topic;
        String str5 = shareContent.h5ShareType;
        Bundle bundle = new Bundle();
        if ("card".equals(str5)) {
            bundle.putInt("req_type", 1);
            bundle.putString("title", str);
            bundle.putString("summary", str4);
            bundle.putString("targetUrl", v(str3, "qq"));
            bundle.putString("imageLocalUrl", str2);
        } else if ("image".equals(str5)) {
            bundle.putInt("req_type", 5);
            bundle.putString("imageLocalUrl", str2);
        } else {
            if ("text".equals(str5)) {
                o0(shareTarget, str, str4, str2, 6);
                return;
            }
            if ("mix".equals(str5)) {
                bundle.putInt("req_type", 1);
                if (TextUtils.isEmpty(str)) {
                    bundle.putString("title", str4);
                } else if (TextUtils.isEmpty(str4)) {
                    bundle.putString("title", str);
                } else {
                    bundle.putString("title", str);
                    bundle.putString("summary", str4);
                }
                bundle.putString("targetUrl", v(str3, "qq"));
            } else {
                if (TextUtils.isEmpty(str3)) {
                    bundle.putInt("req_type", 5);
                } else {
                    bundle.putInt("req_type", 1);
                }
                bundle.putString("title", str);
                bundle.putString("summary", str4);
                bundle.putString("targetUrl", v(str3, "qq"));
                bundle.putString("imageLocalUrl", str2);
            }
        }
        this.d.shareToQQ(this.a, bundle, this.i);
    }

    private void t0(ShareContent shareContent) {
        String str = shareContent.title;
        String str2 = shareContent.bitmapUrl;
        String str3 = shareContent.url;
        String str4 = shareContent.topic;
        String str5 = shareContent.h5ShareType;
        Bundle bundle = new Bundle();
        bundle.putString("summary", str4);
        if (TextUtils.isEmpty(str2)) {
            bundle.putStringArrayList("imageUrl", new ArrayList<>());
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str2);
            bundle.putStringArrayList("imageUrl", arrayList);
        }
        if ("card".equals(str5) || (TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str3))) {
            bundle.putInt("req_type", 1);
            bundle.putString("title", str);
            bundle.putString("targetUrl", v(str3, "qzone"));
            this.d.shareToQzone(this.a, bundle, this.j);
            return;
        }
        if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str3)) {
            bundle.putInt("req_type", 3);
            this.d.publishToQzone(this.a, bundle, this.j);
        }
    }

    private void u(List<ShareTarget> list, SparseArray<ShareTarget> sparseArray, ShareTarget shareTarget) {
        if (HMSharerConfig.isSupportType(shareTarget.type)) {
            list.add(shareTarget);
            sparseArray.put(shareTarget.type, shareTarget);
        }
    }

    private boolean u0(ShareContent shareContent) {
        Bitmap bitmapL;
        String str;
        String str2 = shareContent.title;
        String str3 = shareContent.bitmapUrl;
        String str4 = shareContent.url;
        String str5 = shareContent.topic;
        String str6 = shareContent.h5ShareType;
        if (str2 == null || "".equals(str2.trim())) {
            str2 = "";
        }
        if (str5 == null || "".equals(str5.trim())) {
            str5 = "";
        }
        try {
            String str7 = null;
            if ("image".equals(str6)) {
                bitmapL = L(str3);
            } else {
                if ("text".equals(str6)) {
                    str = str2 + str5;
                } else if ("mix".equals(str6)) {
                    str = str2 + str5 + v(str4, "weibo");
                } else {
                    str7 = str2 + str5 + v(str4, "weibo");
                    bitmapL = L(str3);
                }
                str7 = str;
                bitmapL = null;
            }
            HMLog.i(l, "shareToWeibo:" + str7 + ",path:" + str3 + "bmp = " + bitmapL, new Object[0]);
            return this.b.isWBAppSupportMultipleImage() ? l0(str7, bitmapL) : m0(str7, bitmapL);
        } catch (Exception e) {
            HMLog.error(l, new Function0() { // from class: fg3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(e);
                }
            });
            return false;
        }
    }

    private static String v(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("fr", str2);
        return builderBuildUpon.build().toString();
    }

    private boolean v0(ShareContent shareContent, boolean z2) throws Throwable {
        if (!this.c.isWXAppInstalled()) {
            return false;
        }
        String str = shareContent.title;
        String str2 = shareContent.content;
        String str3 = shareContent.bitmapUrl;
        String str4 = shareContent.url;
        String str5 = shareContent.topic;
        String str6 = shareContent.h5ShareType;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        String wxImageContent = UriCompatKt.getWxImageContent(this.c, this.a, str3);
        if ("card".equals(str6)) {
            wXMediaMessage.setThumbImage(TextUtils.isEmpty(str3) ? null : M(new File(str3)));
            WXWebpageObject wXWebpageObject = new WXWebpageObject();
            wXWebpageObject.webpageUrl = v(str4, t);
            wXMediaMessage.mediaObject = wXWebpageObject;
            wXMediaMessage.title = str;
            wXMediaMessage.description = str5;
        } else if ("image".equals(str6)) {
            wXMediaMessage.setThumbImage(TextUtils.isEmpty(str3) ? null : M(new File(str3)));
            WXImageObject wXImageObject = new WXImageObject();
            wXImageObject.setImagePath(wxImageContent);
            wXMediaMessage.mediaObject = wXImageObject;
        } else if ("mix".equals(str6)) {
            WXWebpageObject wXWebpageObject2 = new WXWebpageObject();
            wXWebpageObject2.webpageUrl = v(str4, t);
            wXMediaMessage.mediaObject = wXWebpageObject2;
            wXMediaMessage.title = str;
            wXMediaMessage.description = str5;
        } else if ("text".equals(str6)) {
            WXTextObject wXTextObject = new WXTextObject();
            String str7 = TextUtils.isEmpty(str) ? null : str;
            if (!TextUtils.isEmpty(str2)) {
                str7 = str7 + str2;
            }
            wXTextObject.text = str7;
            wXMediaMessage.mediaObject = wXTextObject;
            wXMediaMessage.title = str;
            wXMediaMessage.description = str5;
        } else {
            wXMediaMessage.setThumbImage(TextUtils.isEmpty(str3) ? null : M(new File(str3)));
            if (TextUtils.isEmpty(str4)) {
                WXImageObject wXImageObject2 = new WXImageObject();
                wXImageObject2.setImagePath(wxImageContent);
                wXMediaMessage.mediaObject = wXImageObject2;
            } else {
                WXWebpageObject wXWebpageObject3 = new WXWebpageObject();
                wXWebpageObject3.webpageUrl = v(str4, t);
                wXMediaMessage.mediaObject = wXWebpageObject3;
                wXMediaMessage.title = str;
            }
            wXMediaMessage.description = str5;
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.c.sendReq(req);
    }

    private int w(String str, double d2) {
        int i = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(str), null, options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            int i4 = (int) (((double) i2) / d2);
            int i5 = (int) (((double) i3) / d2);
            if (i2 > i4 || i3 > i5) {
                int i6 = i2 / 2;
                int i7 = i3 / 2;
                while (i6 / i > i4 && i7 / i > i5) {
                    i *= 2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    private void w0() {
        k0(new Runnable() { // from class: wf3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g0();
            }
        });
    }

    private void x(SparseArray<ShareTarget> sparseArray) {
        for (ResolveInfo resolveInfo : K()) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            String str = activityInfo.applicationInfo.packageName;
            String str2 = activityInfo.name;
            if ("com.sina.weibo".equalsIgnoreCase(str) || B.equalsIgnoreCase(str)) {
                A(sparseArray, resolveInfo, 4);
            } else if ("com.tencent.mm".equalsIgnoreCase(str)) {
                if (K.equalsIgnoreCase(str2)) {
                    A(sparseArray, resolveInfo, 2);
                } else if (J.equalsIgnoreCase(str2)) {
                    A(sparseArray, resolveInfo, 1);
                }
            } else if ("com.tencent.mobileqq".equalsIgnoreCase(str)) {
                A(sparseArray, resolveInfo, 6);
                A(sparseArray, resolveInfo, 5);
            } else if ("jp.naver.line.android".equalsIgnoreCase(str)) {
                A(sparseArray, resolveInfo, 7);
            } else if ("com.facebook.katana".equalsIgnoreCase(str)) {
                A(sparseArray, resolveInfo, 8);
            } else if ("com.twitter.android".equalsIgnoreCase(str)) {
                A(sparseArray, resolveInfo, 9);
            } else if ("com.instagram.android".equalsIgnoreCase(str)) {
                A(sparseArray, resolveInfo, 15);
            }
        }
        A(sparseArray, null, 13);
        A(sparseArray, null, 14);
    }

    private void x0(Activity activity) {
        IconToast.showError(activity.getApplicationContext(), R.string.no_sdcard_permission_title);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[SYNTHETIC] */
    private boolean y(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        boolean z2 = false;
        try {
            try {
                if (new File(str).exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = fileInputStream2.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            z2 = true;
                            fileInputStream = fileInputStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            try {
                                HMLog.error(l, new Function0() { // from class: ig3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HMShareManager.T(e);
                                    }
                                });
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                }
                                return z2;
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                throw th;
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } else {
                    fileOutputStream = null;
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (Exception e8) {
            e = e8;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public List<ShareTarget> B(int i) {
        return C(i, new int[0]);
    }

    public List<ShareTarget> C(int i, @NonNull int[] iArr) {
        if (i == 9) {
            return E(iArr);
        }
        if (i == 1 || i == 2) {
            return N();
        }
        return i == 3 ? I() : G(i);
    }

    public void checkInstallationThenShareToWeiXinFriend(Context context, ShareContent shareContent) throws Throwable {
        if (!Q(context, "com.tencent.mm")) {
            IconToast.showError(context, ShareUtils.getUninstallStr(context, new ShareTarget(0, 0, "", 1)));
        }
        v0(shareContent, false);
    }

    public void checkInstallationThenShareToWeibo(Context context, ShareContent shareContent) {
        if (!Q(context, "com.sina.weibo")) {
            IconToast.showError(context, ShareUtils.getUninstallStr(context, new ShareTarget(0, 0, "", 4)));
        }
        u0(shareContent);
    }

    public void doDestroy() {
        this.a = null;
    }

    public List<ShareTarget> h0(List<ShareTarget> list, Boolean bool) {
        for (ShareTarget shareTarget : list) {
            if (shareTarget.type == 18 && shareTarget.enable) {
                shareTarget.label = bool.booleanValue() ? R.string.share_block_cancel : R.string.share_block;
                break;
            }
        }
        return list;
    }

    public List<ShareTarget> i0(List<ShareTarget> list) {
        boolean z2 = false;
        boolean z3 = false;
        for (ShareTarget shareTarget : list) {
            int i = shareTarget.type;
            if (i == 6 && shareTarget.enable) {
                z2 = true;
            } else if (i == 5 && shareTarget.enable) {
                z3 = true;
            }
        }
        if (z2 && !z3) {
            for (ShareTarget shareTarget2 : list) {
                if (shareTarget2.type == 5) {
                    shareTarget2.enable = true;
                }
            }
        }
        return list;
    }

    public void n0(ShareResultListener shareResultListener) {
        this.h = shareResultListener;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.g == null || !S(8)) {
            return;
        }
        this.g.onActivityResult(i, i2, intent);
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onCancel() {
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onComplete() {
        ShareResultListener shareResultListener = this.h;
        if (shareResultListener != null) {
            shareResultListener.onComplete(4);
        }
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onError(com.sina.weibo.sdk.common.UiError uiError) {
        HMLog.e(l, "微博 ErrorCode.ERR_FAIL! ", new Object[0]);
        ShareResultListener shareResultListener = this.h;
        if (shareResultListener != null) {
            shareResultListener.onError(4, -1, "");
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(final BaseReq baseReq) {
        HMLog.info(l, new Function0() { // from class: dg3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMShareManager.V(baseReq);
            }
        });
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(final BaseResp baseResp) {
        HMLog.info(l, new Function0() { // from class: eg3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMShareManager.W(baseResp);
            }
        });
    }

    public void p0(ShareTarget shareTarget, final ShareContent shareContent, final boolean z2) {
        if (shareTarget == null) {
            return;
        }
        HMLog.info(l, new Function0() { // from class: cg3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMShareManager.Y(shareContent, z2);
            }
        });
        String str = shareContent.title;
        String str2 = shareContent.bitmapUrl;
        String str3 = shareContent.topic;
        if (z2) {
            shareContent.url = null;
        }
        int i = shareTarget.type;
        if (i == 1) {
            ShareAnalytics.analyticsShareType("wechat");
            ShareResultListener shareResultListener = this.h;
            if (shareResultListener != null) {
                shareResultListener.onClicked(1);
            }
            if (v0(shareContent, false)) {
                ShareResultListener shareResultListener2 = this.h;
                if (shareResultListener2 != null) {
                    shareResultListener2.onComplete(1);
                    return;
                }
                return;
            }
            HMLog.error(l, new Function0() { // from class: xf3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.Z();
                }
            });
            ShareResultListener shareResultListener3 = this.h;
            if (shareResultListener3 != null) {
                shareResultListener3.onError(1, -1, "");
                return;
            }
            return;
        }
        if (i == 2) {
            ShareAnalytics.analyticsShareType("moments");
            ShareResultListener shareResultListener4 = this.h;
            if (shareResultListener4 != null) {
                shareResultListener4.onClicked(2);
            }
            if (v0(shareContent, true)) {
                ShareResultListener shareResultListener5 = this.h;
                if (shareResultListener5 != null) {
                    shareResultListener5.onComplete(2);
                    return;
                }
                return;
            }
            HMLog.error(l, new Function0() { // from class: yf3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.a0();
                }
            });
            ShareResultListener shareResultListener6 = this.h;
            if (shareResultListener6 != null) {
                shareResultListener6.onError(2, -1, "");
                return;
            }
            return;
        }
        if (i == 4) {
            ShareAnalytics.analyticsShareType("weibo");
            if (R()) {
                return;
            }
            ShareResultListener shareResultListener7 = this.h;
            if (shareResultListener7 != null) {
                shareResultListener7.onClicked(4);
            }
            u0(shareContent);
            return;
        }
        if (i == 6) {
            ShareAnalytics.analyticsShareType("QQ");
            ShareResultListener shareResultListener8 = this.h;
            if (shareResultListener8 != null) {
                shareResultListener8.onClicked(6);
            }
            s0(shareContent, shareTarget);
            ShareResultListener shareResultListener9 = this.h;
            if (shareResultListener9 != null) {
                shareResultListener9.onComplete(6);
                return;
            }
            return;
        }
        if (i == 5) {
            ShareAnalytics.analyticsShareType(ShareAnalytics.ParamValue.QQ_SPACE);
            ShareResultListener shareResultListener10 = this.h;
            if (shareResultListener10 != null) {
                shareResultListener10.onClicked(5);
            }
            t0(shareContent);
            return;
        }
        if (i == 8 && S(8)) {
            ShareAnalytics.analyticsShareType("facebook");
            ShareResultListener shareResultListener11 = this.h;
            if (shareResultListener11 != null) {
                shareResultListener11.onClicked(8);
            }
            if (this.g == null) {
                this.g = HMSharerConfig.facebookSharerProvider.provide(this.a);
            }
            this.g.shareTo(shareContent, new a());
            return;
        }
        int i2 = shareTarget.type;
        if (i2 == 9) {
            ShareAnalytics.analyticsShareType("twitter");
            ShareResultListener shareResultListener12 = this.h;
            if (shareResultListener12 != null) {
                shareResultListener12.onClicked(9);
            }
            String strV = v(shareContent.url, "twitter");
            if (str3 != null) {
                strV = str3 + " " + strV;
            }
            o0(shareTarget, str, strV, str2, 9);
            ShareResultListener shareResultListener13 = this.h;
            if (shareResultListener13 != null) {
                shareResultListener13.onComplete(9);
                return;
            }
            return;
        }
        if (i2 != 7) {
            if (i2 == 14) {
                ShareAnalytics.analyticsShareType(ShareAnalytics.ParamValue.MICIRCLE);
                r0(str2, "");
                return;
            }
            if (i2 == 15) {
                ShareAnalytics.analyticsShareType("instagram");
                ShareResultListener shareResultListener14 = this.h;
                if (shareResultListener14 != null) {
                    shareResultListener14.onClicked(15);
                }
                o0(shareTarget, str, str3, str2, 15);
                ShareResultListener shareResultListener15 = this.h;
                if (shareResultListener15 != null) {
                    shareResultListener15.onComplete(15);
                    return;
                }
                return;
            }
            return;
        }
        ShareAnalytics.analyticsShareType("line");
        ShareResultListener shareResultListener16 = this.h;
        if (shareResultListener16 != null) {
            shareResultListener16.onClicked(7);
        }
        String strV2 = v(shareContent.url, "line");
        if (str3 != null) {
            strV2 = str3 + " " + strV2;
        }
        o0(shareTarget, str, strV2, str2, 7);
        ShareResultListener shareResultListener17 = this.h;
        if (shareResultListener17 != null) {
            shareResultListener17.onComplete(7);
        }
    }

    public void q0(String str, Context context) {
        HMLog.info(l, new Function0() { // from class: zf3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMShareManager.b0();
            }
        });
        ShareAnalytics.analyticsShareType(ShareAnalytics.ParamValue.SAVE);
        ShareResultListener shareResultListener = this.h;
        if (shareResultListener != null) {
            shareResultListener.onClicked(13);
        }
        try {
            if (ContextCompat.checkSelfPermission(this.a, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                x0(this.a);
                return;
            }
            File file = new File(str);
            if (!file.exists()) {
                HMLog.error(l, new Function0() { // from class: jg3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMShareManager.c0();
                    }
                });
                ShareResultListener shareResultListener2 = this.h;
                if (shareResultListener2 != null) {
                    shareResultListener2.onError(13, 1, "");
                    return;
                }
                return;
            }
            if (ShareUtils.copyImageToExternalStorage(context, file, F())) {
                IconToast.showSuccess(context, context.getString(R.string.save_local_success));
                ShareResultListener shareResultListener3 = this.h;
                if (shareResultListener3 != null) {
                    shareResultListener3.onComplete(13);
                    return;
                }
                return;
            }
            HMLog.error(l, new Function0() { // from class: ag3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.d0();
                }
            });
            ShareResultListener shareResultListener4 = this.h;
            if (shareResultListener4 != null) {
                shareResultListener4.onError(13, 2, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.error(l, new Function0() { // from class: hg3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMShareManager.e0(e);
                }
            });
        }
    }

    @Deprecated
    public void setFaceBookForbidden(boolean z2) {
        this.isFaceBookForbidden = z2;
    }

    public void shareFlavorAnalytics(int i, int i2) {
        String str;
        if (i == 1) {
            str = "Wechat";
        } else if (i == 2) {
            str = "Moments";
        } else if (i == 13) {
            str = "Save";
        } else if (i != 14) {
            switch (i) {
                case 4:
                    str = "weibo";
                    break;
                case 5:
                    str = "QQZone";
                    break;
                case 6:
                    str = "QQ";
                    break;
                case 7:
                    str = "Line";
                    break;
                case 8:
                    str = "Facebook";
                    break;
                case 9:
                    str = "Twitter";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "MiFit";
        }
        if ("".equals(str)) {
            return;
        }
        if (i2 == 18) {
            j0(ShareStatEvent.SHARE_H5_OUT, str);
        } else if (i2 == 19) {
            j0(ShareStatEvent.SHARE_CHART_OUT, str);
        } else {
            j0(ShareStatEvent.SHARE_SPORT_OUT, str);
        }
    }

    public void showToast(int i) {
        CustomToast.makeText(this.a.getApplicationContext(), this.a.getApplicationContext().getString(i), 0).show();
    }

    public HMShareManager(FragmentActivity fragmentActivity) {
        this.c = null;
        this.d = null;
        this.isFaceBookForbidden = false;
        this.i = new b();
        this.j = new c();
        if (fragmentActivity != null) {
            this.a = fragmentActivity;
            Intent intent = fragmentActivity.getIntent();
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(fragmentActivity.getApplicationContext(), Constant.WX_APP_ID);
            this.c = iwxapiCreateWXAPI;
            iwxapiCreateWXAPI.registerApp(Constant.WX_APP_ID);
            this.c.handleIntent(intent, this);
            if (ShareKitConfig.INSTANCE.isMainLandChannel()) {
                P(fragmentActivity);
                this.d = Tencent.createInstance(Constant.QQ_APP_ID, fragmentActivity.getApplicationContext(), fragmentActivity.getString(R.string.share_provider_file_authorities));
            }
            this.f = new Handler(Looper.getMainLooper());
            return;
        }
        throw new IllegalArgumentException("activity is null");
    }
}
