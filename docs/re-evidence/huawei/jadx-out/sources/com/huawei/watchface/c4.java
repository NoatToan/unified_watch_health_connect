package com.huawei.watchface;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.picture.security.base.broadcast.SafeBroadcastSender;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.ShareModel;
import com.huawei.watchface.mvp.ui.view.CustomWebView;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.ChoosePicUtil;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.PermissionUtils;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.permission.PermissionUtil;
import java.io.File;

/* JADX INFO: loaded from: classes20.dex */
public class c4 {
    public static volatile c4 e;
    public static int f;
    public static final String[] g = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OperateWatchFaceCallback f30108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30110c;
    public c d = new a();

    public class a implements c {
        public a() {
        }

        @Override // com.huawei.watchface.c4.c
        public void a(String str, int i, String str2) {
            c4.this.a(str, i, str2);
        }
    }

    public static abstract /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30112a;

        static {
            int[] iArr = new int[d4.values().length];
            f30112a = iArr;
            try {
                iArr[d4.WEIXIN_FRIEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30112a[d4.WEIXIN_MOMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30112a[d4.XIAOHONGSHU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30112a[d4.DOUYIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30112a[d4.QQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30112a[d4.QQ_ZONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30112a[d4.WEIBO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30112a[d4.FACEBOOK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30112a[d4.TELEGRAM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30112a[d4.INSTAGRAM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30112a[d4.WHATSAPP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30112a[d4.TWITTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30112a[d4.LINKEDIN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30112a[d4.VK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f30112a[d4.MORE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f30112a[d4.SAVE_LOCAL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f30112a[d4.SAVE_CLIPBOARD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public interface c {
        void a(String str, int i, String str2);
    }

    public c4(Context context) {
        this.f30109b = context;
        this.f30110c = ChoosePicUtil.a(context);
    }

    public static c4 a(Context context) {
        if (context == null) {
            return null;
        }
        if (e == null) {
            synchronized (c4.class) {
                if (e == null) {
                    e = new c4(context);
                }
            }
        }
        return e;
    }

    public static /* synthetic */ void c(Activity activity, View view) {
        HwLog.d("ShareManager", "positiveListener click");
        CustomWebView.notifyH5(activity);
    }

    public static /* synthetic */ void d(Activity activity, View view) {
        HwLog.d("ShareManager", "negativeListener click");
        CustomWebView.notifyH5(activity);
    }

    public final /* synthetic */ void b(d4 d4Var, ShareModel shareModel, final Activity activity, boolean z) {
        if (z && PermissionUtils.checkPermission(g[0])) {
            g(d4Var, shareModel);
        } else {
            HwWatchFaceApi.getInstance(activity).showHealthAppSettingGuide(activity, CommonUtils.isAndroid13() ? PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES.getPermission() : PermissionUtil.PermissionType.STORAGE.getPermission(), new View.OnClickListener() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c4.c(activity, view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c4.d(activity, view);
                }
            });
        }
    }

    public final void e(final d4 d4Var, final ShareModel shareModel) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(d4Var, shareModel);
            }
        });
    }

    public final void f(final d4 d4Var, final ShareModel shareModel) {
        if (d4Var != d4.SAVE_LOCAL) {
            d(d4Var, shareModel);
            return;
        }
        if (!CommonUtils.isAndroid10()) {
            String[] strArr = g;
            if (!PermissionUtils.checkPermission(strArr[0])) {
                final Activity activity = WebViewActivity.getActivity();
                if (activity == null || this.f30108a == null) {
                    d(d4Var, shareModel);
                    return;
                } else {
                    CustomWebView.a(System.currentTimeMillis());
                    this.f30108a.requestPermissionAsync(activity, strArr, new PermissionUtils.PermissonListener() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda3
                        @Override // com.huawei.watchface.utils.PermissionUtils.PermissonListener
                        public final void onRequested(boolean z) {
                            this.f$0.a(d4Var, shareModel, activity, z);
                        }
                    }, 3);
                    return;
                }
            }
        }
        d(d4Var, shareModel);
    }

    public final void g(final d4 d4Var, final ShareModel shareModel) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(shareModel, d4Var);
            }
        });
    }

    public final void h(final d4 d4Var, final ShareModel shareModel) {
        if (!CommonUtils.isAndroid10()) {
            String[] strArr = g;
            if (!PermissionUtils.checkPermission(strArr[0])) {
                final Activity activity = WebViewActivity.getActivity();
                if (activity == null || this.f30108a == null) {
                    g(d4Var, shareModel);
                    return;
                } else {
                    CustomWebView.a(System.currentTimeMillis());
                    this.f30108a.requestPermissionAsync(activity, strArr, new PermissionUtils.PermissonListener() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda9
                        @Override // com.huawei.watchface.utils.PermissionUtils.PermissonListener
                        public final void onRequested(boolean z) {
                            this.f$0.b(d4Var, shareModel, activity, z);
                        }
                    }, 3);
                    return;
                }
            }
        }
        g(d4Var, shareModel);
    }

    public final void c(d4 d4Var, ShareModel shareModel) throws Throwable {
        if (IntegerUtils.a(shareModel.getShareContentType()) != 0) {
            HwLog.i("ShareManager", "saveBillImagePath is not SHARE_CONTENT_TYPE_BILL");
            return;
        }
        if (d4Var != d4.SAVE_LOCAL && d4Var != d4.SAVE_CLIPBOARD && d4Var != d4.XIAOHONGSHU) {
            String strA = FileHelper.a(shareModel.getShareImageStr(), b(), this.f30110c, false);
            FlavorConfig.safeHwLog("ShareManager", "shareImagePath:" + strA);
            shareModel.setShareImagePath(strA);
            return;
        }
        HwLog.i("ShareManager", "saveBillImagePath is SAVE_LOCAL or SAVE_CLIPBOARD or XIAOHONGSHU");
    }

    public final void d(final d4 d4Var, final ShareModel shareModel) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.a(d4Var, shareModel);
            }
        });
    }

    public static /* synthetic */ void b(Activity activity, View view) {
        HwLog.d("ShareManager", "negativeListener click");
        CustomWebView.notifyH5(activity);
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.f30108a = operateWatchFaceCallback;
    }

    public final /* synthetic */ void b(d4 d4Var, ShareModel shareModel) {
        new d3().a(d4Var, shareModel, this.d);
    }

    public void a(ShareModel shareModel) throws Throwable {
        if (shareModel == null) {
            HwLog.i("ShareManager", "shareModel is null");
            a("", 1, "shareModel is null");
        }
        int integer = IntegerUtils.getInteger(shareModel.getShareType(), d4.UNKNOWN.getValue());
        HwLog.i("ShareManager", "share shareType:" + integer + "，shareContentType:" + shareModel.getShareContentType());
        d4 d4VarFromValue = d4.fromValue(integer);
        c(d4VarFromValue, shareModel);
        switch (b.f30112a[d4VarFromValue.ordinal()]) {
            case 1:
                b(0, shareModel);
                break;
            case 2:
                b(1, shareModel);
                break;
            case 3:
                h(d4VarFromValue, shareModel);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                e(d4VarFromValue, shareModel);
                break;
            case 16:
            case 17:
                f(d4VarFromValue, shareModel);
                break;
            default:
                this.d.a(shareModel.getShareType(), 1, "shareTypeEnum is unknow");
                HwLog.i("ShareManager", "shareTypeEnum is unknow");
                break;
        }
    }

    public static String b() {
        String str = (System.currentTimeMillis() + ((long) f)) + "_share_tmp.jpg";
        f++;
        return str;
    }

    public final void b(final int i, final ShareModel shareModel) {
        if (!HwWatchFaceApi.getInstance(this.f30109b).isOversea() && TextUtils.equals("CN", HwWatchFaceApi.getInstance(this.f30109b).getCommonCountryCode())) {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.a(i, shareModel);
                }
            });
        } else {
            HwLog.i("ShareManager", "shareWinXin isOversea.");
            a(shareModel.getShareType(), 1, "shareWinXin isOversea");
        }
    }

    public final /* synthetic */ void a(d4 d4Var, ShareModel shareModel, final Activity activity, boolean z) {
        if (z && PermissionUtils.checkPermission(g[0])) {
            d(d4Var, shareModel);
        } else {
            HwWatchFaceApi.getInstance(activity).showHealthAppSettingGuide(activity, CommonUtils.isAndroid13() ? PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES.getPermission() : PermissionUtil.PermissionType.STORAGE.getPermission(), new View.OnClickListener() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c4.a(activity, view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.watchface.c4$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c4.b(activity, view);
                }
            });
        }
    }

    public static /* synthetic */ void a(Activity activity, View view) {
        HwLog.d("ShareManager", "positiveListener click");
        CustomWebView.notifyH5(activity);
    }

    public final /* synthetic */ void a(d4 d4Var, ShareModel shareModel) throws Throwable {
        new y3().a(d4Var, shareModel, this.d);
    }

    public final /* synthetic */ void a(ShareModel shareModel, d4 d4Var) {
        if (!a(shareModel, this.d)) {
            HwLog.i("ShareManager", "shareXiaoHongShuApp save Image failed");
        } else {
            new d3().a(d4Var, shareModel, this.d);
        }
    }

    public final boolean a(ShareModel shareModel, c cVar) throws Throwable {
        Uri uriA;
        Uri uri = Uri.EMPTY;
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i("ShareManager", "saveXiaoHongShuImage context is null");
            cVar.a(shareModel.getShareType(), 1, "saveXiaoHongShuImage context is null");
            return false;
        }
        if (!PermissionUtil.isAndroidQ()) {
            String strA = FileHelper.a(applicationContext, shareModel, FileHelper.c());
            FlavorConfig.safeHwLog("ShareManager", "saveXiaoHongShuImage filePath is :" + strA);
            uriA = !TextUtils.isEmpty(strA) ? Uri.fromFile(PversionSdUtils.getFile(strA)) : uri;
        } else {
            uriA = FileHelper.a(applicationContext, shareModel);
        }
        if (uriA != uri) {
            SafeBroadcastSender.e("android.intent.action.MEDIA_SCANNER_SCAN_FILE", applicationContext).d(uriA).b().d();
            shareModel.setShareImageUri(uriA);
            HwLog.i("ShareManager", "saveXiaoHongShuImage success");
            return true;
        }
        HwLog.i("ShareManager", "saveXiaoHongShuImage failed");
        cVar.a(shareModel.getShareType(), 1, "saveXiaoHongShuImage failed");
        return false;
    }

    public final /* synthetic */ void a(int i, ShareModel shareModel) throws Throwable {
        new j5(this.f30109b).a(i, shareModel, this.d);
    }

    public final void a(String str, int i, String str2) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30108a;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitShareResult(str, i, str2);
        }
    }

    public void a() {
        HwLog.i("ShareManager", "clearShareImageFile enter");
        File file = new File(this.f30110c);
        if (!file.exists()) {
            HwLog.i("ShareManager", "clearShareImageFile rootShareFilePath is not exists");
        } else {
            CommonUtils.a(file);
        }
    }
}
