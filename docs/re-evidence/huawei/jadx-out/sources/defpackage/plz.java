package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class plz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f45626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45627b = "wx36bda3d35fbcfd06";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IWXAPI f45628c;
    private Context d;

    plz(Context context) {
        this.d = context;
        d(context);
    }

    private void d(Context context) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, this.f45627b, true);
        this.f45628c = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(this.f45627b);
    }

    int c(gxt gxtVar, int i) {
        ReleaseLogUtil.d("Share_WeChatShareManager", "shareByWeChat enter: shareType is ", Integer.valueOf(i));
        if (!d()) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareByWeChat is not installed");
            Toast.makeText(this.d, R.string.IDS_plugin_socialshare_install_wechat, 0).show();
            return 1;
        }
        if (gxtVar == null) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareByWeChat get NULL shareContent!");
            return -1;
        }
        int iU = gxtVar.u();
        if (iU == 0) {
            a(i, gxtVar);
        } else if (iU == 1) {
            c(i, gxtVar);
        } else if (iU == 2) {
            e(i, gxtVar);
        } else if (iU == 4) {
            d(i, gxtVar);
        } else if (iU == 5) {
            b(i, gxtVar);
        } else {
            switch (iU) {
                case 8:
                case 9:
                    h(gxtVar);
                    break;
                case 10:
                case 11:
                    b(gxtVar);
                    break;
                default:
                    ReleaseLogUtil.a("Share_WeChatShareManager", "shareByWeChat unknown WeChat shareType!");
                    return -1;
            }
        }
        return 0;
    }

    private void a(int i, gxt gxtVar) {
        if (this.f45628c == null || gxtVar == null) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "ERROR mIwxApi in shareText()!");
            return;
        }
        String strQ = gxtVar.q();
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = strQ;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = strQ;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = pnq.d("textshare");
        req.message = wXMediaMessage;
        req.scene = i;
        LogUtil.a("Share_WeChatShareManager", "shareText mIwxApi.sendReq(req);");
        this.f45628c.sendReq(req);
    }

    private void b(int i, gxt gxtVar) {
        if (i != 1) {
            if (i != 0) {
                ReleaseLogUtil.a("Share_WeChatShareManager", "shareMultipleImage Unknown WeChat share type:", Integer.valueOf(i));
                return;
            } else {
                d(i, gxtVar);
                return;
            }
        }
        long jB = b();
        if (jB < 60703) {
            e(gxtVar);
            return;
        }
        if (jB == 60703) {
            d(gxtVar);
        } else if (jB < 70000) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareMultipleImage WeChat version unknown");
        } else {
            a(gxtVar);
        }
    }

    private void d(gxt gxtVar) {
        ArrayList<Uri> arrayListB = pnq.b(this.d, gxtVar, 2);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            int size = arrayListB.size();
            final ArrayList arrayList = new ArrayList(1);
            arrayList.add(arrayListB.get(0));
            int i = size - 1;
            new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getResources().getQuantityString(R.plurals.IDS_plugin_socialshare_wechatmoment_select_byself, i, Integer.valueOf(i))).a(this.d.getString(R.string.IDS_plugin_socialshare_go_ahead_sharing), new View.OnClickListener() { // from class: plz.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    plz.this.c((ArrayList<Uri>) arrayList);
                }
            }).c().show();
            return;
        }
        ReleaseLogUtil.a("Share_WeChatShareManager", "guideToMomentMultiImage imageUriList is empty");
    }

    private void a(gxt gxtVar) {
        ArrayList<Uri> arrayListB = pnq.b(this.d, gxtVar, 1);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            int size = arrayListB.size();
            String quantityString = this.d.getResources().getQuantityString(R.plurals.IDS_plugin_socialshare_wechatmoment_select_byself, size, Integer.valueOf(size));
            new NoTitleCustomAlertDialog.Builder(this.d).a(quantityString).a(this.d.getString(R.string.IDS_plugin_socialshare_go_ahead_sharing), new View.OnClickListener() { // from class: plz.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    plz.this.e();
                }
            }).c().show();
            return;
        }
        ReleaseLogUtil.a("Share_WeChatShareManager", "guideToWeChatMultiImage imageUriList is empty");
    }

    private void e(gxt gxtVar) {
        ArrayList<Uri> arrayListB = pnq.b(this.d, gxtVar, 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            c(arrayListB);
        } else {
            ReleaseLogUtil.a("Share_WeChatShareManager", "directShareMultiImage imageUriList is empty");
        }
    }

    private long b() {
        long j = 0;
        try {
            String str = this.d.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionName;
            if (str.contains(".")) {
                long j2 = 10000;
                for (String str2 : str.split("\\.")) {
                    j += ((long) Integer.parseInt(str2)) * j2;
                    j2 /= 100;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "getWeChatVersion fail ", e.getMessage());
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "getWeChatVersion fail: NumberFormatException");
        }
        ReleaseLogUtil.d("Share_WeChatShareManager", "getWeChatVersion is ", Long.valueOf(j));
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ArrayList<Uri> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareMomentMultiImage get images failed");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.addFlags(268435456);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.setType(Constants.IMAGE_TYPE);
        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
        try {
            this.d.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareMomentMultiImage err: ", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.setComponent(componentName);
        try {
            this.d.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "jumpToWeChatLauncher err: ", e.getMessage());
        }
    }

    private void c(int i, gxt gxtVar) {
        Bitmap bitmapCopy;
        Bitmap bitmapE;
        Bitmap bitmapE2;
        Bitmap bitmap;
        LogUtil.a("Share_WeChatShareManager", "sharePicture()");
        if (this.f45628c == null || gxtVar == null || gxtVar.r() == null) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "ERROR mIwxApi in sharePicture()");
            return;
        }
        if (gxtVar.r().isRecycled()) {
            ReleaseLogUtil.e("Share_WeChatShareManager", "ERROR sharePicture is recycled");
            return;
        }
        try {
            bitmapCopy = gxtVar.r().copy(Bitmap.Config.RGB_565, true);
        } catch (OutOfMemoryError unused) {
            ReleaseLogUtil.e("Share_WeChatShareManager", "sharePicture copy bitmap fail: OutOfMemoryError ");
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            ReleaseLogUtil.e("Share_WeChatShareManager", "sharePicture fail bmp is null");
            return;
        }
        if (gxtVar.f() && (bitmap = this.f45626a) != null) {
            bitmapE = qqf.e(this.d, bitmapCopy, bitmap);
        } else {
            LogUtil.a("Share_WeChatShareManager", "let shareBitmap = originBitmap;");
            bitmapE = bitmapCopy;
        }
        if (bitmapE == null) {
            ReleaseLogUtil.d("Share_WeChatShareManager", "sharePicture fail: new shareBitmap is null");
            return;
        }
        if (gxtVar.ad()) {
            bitmapE2 = qqf.d(bitmapE, gxtVar.h());
        } else {
            bitmapE2 = qqf.e(bitmapE);
        }
        if (bitmapE2 == null) {
            ReleaseLogUtil.e("Share_WeChatShareManager", "sharePicture fail: after compressed, new shareBitmap is null");
            return;
        }
        int iB = pnq.b(bitmapE2);
        ReleaseLogUtil.d("Share_WeChatShareManager", "sharePicture WeChatInteractors bitmap size = ", Integer.valueOf(iB));
        if ((iB / 1024) / 1024 >= 1) {
            String str = lrp.g + "wechat_share_pic.jpg";
            qqf.b(bitmapE2, str);
            gxtVar.c(str);
            d(i, gxtVar);
            return;
        }
        b(i, bitmapE2, bitmapCopy);
    }

    private void b(int i, Bitmap bitmap, Bitmap bitmap2) {
        WXImageObject wXImageObject = new WXImageObject(bitmap);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.thumbData = qqf.b(bitmap2, true);
        c(wXMediaMessage, i);
    }

    private void d(final int i, final gxt gxtVar) {
        LogUtil.a("Share_WeChatShareManager", "sharePictureByPath()");
        if (this.f45628c == null || gxtVar == null || gxtVar.g() == null) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "sharePictureByPath param invalid ", gxtVar);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pmg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(gxtVar, i);
                }
            });
        }
    }

    /* synthetic */ void a(gxt gxtVar, int i) {
        String strG = gxtVar.g();
        b(strG);
        if (pnq.c() && a()) {
            strG = c(this.d, new File(strG));
        }
        if (TextUtils.isEmpty(strG)) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "sharePictureByPath imgPath is null");
            return;
        }
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.setImagePath(strG);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.thumbData = qqf.b(qqf.c(gxtVar.g()), true);
        c(wXMediaMessage, i);
    }

    private void c(WXMediaMessage wXMediaMessage, int i) {
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = pnq.d("imgshareappdata");
        req.message = wXMediaMessage;
        req.scene = i;
        LogUtil.a("Share_WeChatShareManager", "sendApiShareMessage mIwxApi.sendReq(req);");
        this.f45628c.sendReq(req);
    }

    private void e(int i, gxt gxtVar) {
        if (this.f45628c == null || gxtVar == null) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "ERROR mIwxApi in shareWebPage()");
            return;
        }
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = gxtVar.v();
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        wXMediaMessage.title = gxtVar.p();
        wXMediaMessage.description = gxtVar.q();
        Bitmap bitmapR = gxtVar.r();
        if (bitmapR == null || bitmapR.isRecycled()) {
            wXMediaMessage.thumbData = qqf.a(BitmapFactory.decodeResource(this.d.getResources(), R.mipmap.huafen_share_img_zero), false);
            ReleaseLogUtil.d("Share_WeChatShareManager", "shareWebPage() thumb is null");
        } else {
            wXMediaMessage.thumbData = qqf.a(qqf.b(bitmapR, 300, 300), false);
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = pnq.d("webpage");
        req.message = wXMediaMessage;
        req.scene = i;
        ReleaseLogUtil.d("Share_WeChatShareManager", "shareWebPage mIwxApi.sendReq(req);");
        this.f45628c.sendReq(req);
    }

    private void b(String str) {
        LogUtil.a("Share_WeChatShareManager", "ensureMaxHeight start");
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "ensureMaxHeight fail:orgFilePath is null");
            return;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            if (bitmapDecodeFile == null) {
                ReleaseLogUtil.d("Share_WeChatShareManager", "ensureMaxHeight decodeFile from orgFilePath return null");
                return;
            }
            int height = bitmapDecodeFile.getHeight();
            Matrix matrix = new Matrix();
            if (height > 50240) {
                ReleaseLogUtil.d("Share_WeChatShareManager", "ensureMaxHeight height exceeds, rescale it");
                float f = 50240.0f / height;
                matrix.setScale(f, f);
                qqf.b(Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true), str);
            }
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "ensureMaxHeight IllegalArgumentException: ", e.getMessage());
        } catch (OutOfMemoryError e2) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "ensureMaxHeight OutOfMemoryError: ", e2.getMessage());
        }
    }

    private boolean d() {
        IWXAPI iwxapi = this.f45628c;
        if (iwxapi != null) {
            return iwxapi.isWXAppInstalled();
        }
        return false;
    }

    private void h(gxt gxtVar) {
        Uri uriY;
        LogUtil.a("Share_WeChatShareManager", "shareVideo enter");
        if (gxtVar.u() == 8) {
            String strX = gxtVar.x();
            if (TextUtils.isEmpty(strX)) {
                return;
            }
            if (pnq.c() && a()) {
                uriY = Uri.parse(c(this.d, new File(strX)));
            } else {
                uriY = Uri.fromFile(new File(strX));
            }
        } else if (gxtVar.u() == 9) {
            uriY = gxtVar.y();
        } else {
            ReleaseLogUtil.e("Share_WeChatShareManager", "shareVideo is other share type");
            uriY = null;
        }
        if (uriY == null || TextUtils.isEmpty(uriY.toString())) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareVideo videoUri is null");
            return;
        }
        ReleaseLogUtil.d("Share_WeChatShareManager", "videoUri:", uriY.getPath());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(MediaQueryHelper.VideoType.TYPE_ALL);
        intent.putExtra("android.intent.extra.STREAM", uriY);
        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
        intent.addFlags(268435456);
        intent.setFlags(1);
        intent.setFlags(2);
        try {
            this.d.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareVideo ActivityNotFoundException: ", e.getMessage());
        }
    }

    private void b(final gxt gxtVar) {
        LogUtil.a("Share_WeChatShareManager", "shareFileByPath()");
        if (this.f45628c == null || gxtVar == null || gxtVar.a() == null) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareFileByPath param invalid ", gxtVar);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pmf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45660a.c(gxtVar);
                }
            });
        }
    }

    /* synthetic */ void c(gxt gxtVar) {
        String strA = gxtVar.a();
        if (pnq.c() && a()) {
            strA = c(this.d, new File(strA));
        }
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.a("Share_WeChatShareManager", "shareFile filePath is null");
            return;
        }
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.setFilePath(strA);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        Bitmap bitmapW = gxtVar.w();
        if (bitmapW != null) {
            wXMediaMessage.setThumbImage(bitmapW);
        }
        wXMediaMessage.title = gxtVar.p();
        c(wXMediaMessage, 0);
    }

    private boolean a() {
        return this.f45628c.getWXAppSupportAPI() >= 654314752;
    }

    private String c(Context context, File file) {
        if (file == null || !file.exists()) {
            ReleaseLogUtil.e("Share_WeChatShareManager", "context is null or file is not exists");
            return "";
        }
        Uri uriA = pnq.a(context, file);
        if (uriA == null) {
            ReleaseLogUtil.e("Share_WeChatShareManager", "getFileUri contentUri is null");
            return "";
        }
        context.grantUriPermission("com.tencent.mm", uriA, 1);
        return uriA.toString();
    }
}
