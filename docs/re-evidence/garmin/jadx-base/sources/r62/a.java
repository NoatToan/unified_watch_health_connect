package r62;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double[] f151019b = {1600.0d, 1440.0d, 1200.0d, 1024.0d, 960.0d};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f151020c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IWXAPI f151021a;

    /* JADX INFO: renamed from: r62.a$a, reason: collision with other inner class name */
    public enum EnumC2839a {
        FRIENDS(0),
        MOMENTS(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f151025a;

        EnumC2839a(int i14) {
            this.f151025a = i14;
        }
    }

    private a() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(GarminConnectMobileApp.f28687i, "wx1161b84b5442e219", true);
        this.f151021a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp("wx1161b84b5442e219");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return String.valueOf(System.currentTimeMillis());
        }
        StringBuilder sbI = sn.a.i(str, "-");
        sbI.append(System.currentTimeMillis());
        return sbI.toString();
    }

    public static a b() {
        if (f151020c == null) {
            f151020c = new a();
        }
        return f151020c;
    }

    public final void c(String str, Bitmap bitmap, String str2, String str3, EnumC2839a enumC2839a) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject(str);
        if (bitmap != null) {
            if (bitmap.getWidth() > 96 || bitmap.getHeight() > 96) {
                bitmap = ThumbnailUtils.extractThumbnail(bitmap, bitmap.getWidth() > 96 ? 96 : bitmap.getWidth(), bitmap.getHeight() <= 96 ? bitmap.getHeight() : 96);
            }
        } else {
            bitmap = null;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXWebpageObject;
        wXMediaMessage.title = str2;
        wXMediaMessage.description = str3;
        if (bitmap != null) {
            wXMediaMessage.setThumbImage(bitmap);
        }
        String strA = a("webpage");
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.transaction = strA;
        req.scene = enumC2839a.f151025a;
        this.f151021a.sendReq(req);
    }
}
