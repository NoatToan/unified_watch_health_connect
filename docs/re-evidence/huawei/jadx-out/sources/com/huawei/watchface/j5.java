package com.huawei.watchface;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.ShareModel;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.videoedit.utils.BitmapUtils;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.File;

/* JADX INFO: loaded from: classes45.dex */
public class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IWXAPI f30257b;

    public j5(Context context) {
        this.f30256a = context;
        a(context);
    }

    public final void a(Context context) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, "wx36bda3d35fbcfd06", true);
        this.f30257b = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp("wx36bda3d35fbcfd06");
    }

    public final void b(int i, ShareModel shareModel, c4.c cVar) throws Throwable {
        HwLog.i("WeiXinShare", "shareImage start");
        String shareImagePath = shareModel.getShareImagePath();
        if (TextUtils.isEmpty(shareImagePath)) {
            HwLog.i("WeiXinShare", "shareImage imgPath is empty");
            cVar.a(shareModel.getShareType(), 1, "shareImage imgPath is empty");
            return;
        }
        b(shareImagePath);
        if (CommonUtils.o() && b()) {
            shareImagePath = a(this.f30256a, PversionSdUtils.getFile(shareImagePath));
        }
        if (TextUtils.isEmpty(shareImagePath)) {
            HwLog.e("WeiXinShare", "sharePictureByPath imgPath is null");
            cVar.a(shareModel.getShareType(), 1, "shareImage imgPath is empty");
            return;
        }
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.setImagePath(shareImagePath);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.thumbData = BitmapUtils.getByteArrayOfThumbBitmap(BitmapUtils.decodeImageFromFile(shareModel.getShareImagePath()), true);
        if (a(wXMediaMessage, i)) {
            HwLog.i("WeiXinShare", "shareImage success");
            cVar.a(shareModel.getShareType(), 0, "send share success");
        } else {
            HwLog.i("WeiXinShare", "shareImage error");
            cVar.a(shareModel.getShareType(), 1, "send share error");
        }
    }

    public final void c(int i, ShareModel shareModel, c4.c cVar) {
        HwLog.i("WeiXinShare", "shareWebpage start");
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = shareModel.getShareUrlContent();
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        wXMediaMessage.title = shareModel.getShareTitleContent();
        wXMediaMessage.description = shareModel.getShareTextContent();
        Bitmap bitmapA = h1.a(this.f30256a, shareModel.getImageUrl());
        if (bitmapA != null) {
            wXMediaMessage.thumbData = BitmapUtils.bitmapToByteArray(BitmapUtils.scaleThumbBitmap(bitmapA, 300, 300), false);
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = a("webpage");
        req.message = wXMediaMessage;
        req.scene = i;
        if (this.f30257b.sendReq(req)) {
            HwLog.i("WeiXinShare", "shareWebpage success");
            cVar.a(shareModel.getShareType(), 0, "send share success");
        } else {
            HwLog.i("WeiXinShare", "shareWebpage error");
            cVar.a(shareModel.getShareType(), 1, "send share error");
        }
    }

    public final boolean a() {
        IWXAPI iwxapi = this.f30257b;
        if (iwxapi != null) {
            return iwxapi.isWXAppInstalled();
        }
        return false;
    }

    public void a(int i, ShareModel shareModel, c4.c cVar) throws Throwable {
        HwLog.i("WeiXinShare", "share enter");
        if (this.f30257b != null && shareModel != null) {
            if (!a()) {
                HwLog.i("WeiXinShare", "shareWebPage is not installed");
                cVar.a(shareModel.getShareType(), 2, "not installed");
                return;
            }
            int iA = IntegerUtils.a(shareModel.getShareContentType());
            if (iA == 0) {
                b(i, shareModel, cVar);
                return;
            } else if (iA != 1) {
                cVar.a(shareModel.getShareType(), 1, "shareContentType is unknow");
                HwLog.i("WeiXinShare", "shareContentType is unknow");
                return;
            } else {
                c(i, shareModel, cVar);
                return;
            }
        }
        HwLog.i("WeiXinShare", "shareWebPage is null");
        cVar.a(shareModel == null ? "" : shareModel.getShareType(), 1, "shareWebPage is null");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0096: MOVE (r0 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:35:0x0095 */
    public final void b(String str) throws Throwable {
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        HwLog.i("WeiXinShare", "ensureMaxHeight start");
        if (TextUtils.isEmpty(str)) {
            HwLog.e("WeiXinShare", "ensureMaxHeight fail:orgFilePath is null");
            return;
        }
        Bitmap bitmapCreateBitmap = null;
        try {
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(str);
                try {
                    if (bitmapDecodeFile == null) {
                        HwLog.e("WeiXinShare", "ensureMaxHeight decodeFile from orgFilePath return null");
                        if (bitmapDecodeFile != null) {
                            bitmapDecodeFile.recycle();
                            return;
                        }
                        return;
                    }
                    int height = bitmapDecodeFile.getHeight();
                    Matrix matrix = new Matrix();
                    if (height > 50240) {
                        HwLog.i("WeiXinShare", "ensureMaxHeight height exceeds, rescale it");
                        float f = 50240.0f / height;
                        matrix.setScale(f, f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                        HwLog.i("WeiXinShare", "ensureMaxHeight is save:" + BitmapUtils.saveBmpToFile(bitmapCreateBitmap, str));
                    }
                    bitmapDecodeFile.recycle();
                    if (bitmapCreateBitmap == null) {
                        return;
                    }
                    bitmapCreateBitmap.recycle();
                } catch (IllegalArgumentException e) {
                    e = e;
                    HwLog.e("WeiXinShare", "ensureMaxHeight IllegalArgumentException: " + HwLog.printException((Exception) e));
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.recycle();
                    }
                    if (0 == 0) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    HwLog.e("WeiXinShare", "ensureMaxHeight Exception: " + HwLog.printException(e));
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.recycle();
                    }
                    if (0 == 0) {
                    }
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    HwLog.e("WeiXinShare", "ensureMaxHeight OutOfMemoryError: " + HwLog.printException((Error) e));
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.recycle();
                    }
                    if (0 == 0) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                bitmapCreateBitmap = bitmap;
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                if (bitmapCreateBitmap != 0) {
                    bitmapCreateBitmap.recycle();
                }
                throw th;
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
            bitmapDecodeFile = null;
        } catch (Exception e5) {
            e = e5;
            bitmapDecodeFile = null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            bitmapDecodeFile = null;
        } catch (Throwable th2) {
            th = th2;
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            if (bitmapCreateBitmap != 0) {
                bitmapCreateBitmap.recycle();
            }
            throw th;
        }
    }

    public final boolean a(WXMediaMessage wXMediaMessage, int i) {
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = a("image");
        req.message = wXMediaMessage;
        req.scene = i;
        HwLog.i("WeiXinShare", "sendApiShareMessage mIwxApi.sendReq(req);");
        return this.f30257b.sendReq(req);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + System.currentTimeMillis();
    }

    public final String a(Context context, File file) {
        if (file != null && file.exists()) {
            Uri uriD = FileHelper.d(file);
            if (uriD == null) {
                HwLog.w("WeiXinShare", "getFileUri contentUri is null");
                return "";
            }
            context.grantUriPermission("com.tencent.mm", uriD, 1);
            return uriD.toString();
        }
        HwLog.w("WeiXinShare", "context is null or file is not exists");
        return "";
    }

    public final boolean b() {
        return this.f30257b.getWXAppSupportAPI() >= 654314752;
    }
}
