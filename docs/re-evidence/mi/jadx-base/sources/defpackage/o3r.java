package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.fitness.ShareConfigs;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.TLSCompatSocketFactoryKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class o3r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o3r f28710b;
    public static String c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IWXAPI f28711a;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap[] f28713b;
        public final /* synthetic */ WXMediaMessage c;
        public final /* synthetic */ int d;
        public final /* synthetic */ b e;

        public a(String str, Bitmap[] bitmapArr, WXMediaMessage wXMediaMessage, int i, b bVar) {
            this.f28712a = str;
            this.f28713b = bitmapArr;
            this.c = wXMediaMessage;
            this.d = i;
            this.e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapDecodeStream = !TextUtils.isEmpty(this.f28712a) ? BitmapFactory.decodeStream(o3r.this.h(this.f28712a)) : null;
                if (bitmapDecodeStream == null) {
                    bitmapDecodeStream = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), kxi.f24395a);
                }
                this.f28713b[0] = Bitmap.createScaledBitmap(bitmapDecodeStream, 100, 100, true);
                bitmapDecodeStream.recycle();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.c.thumbData = kq2.b(this.f28713b[0], true);
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = o3r.this.f("webpage");
            req.message = this.c;
            req.scene = this.d;
            o3r.this.m().sendReq(req);
            b bVar = this.e;
            if (bVar != null) {
                bVar.a(true, null);
            }
        }
    }

    public interface b {
        void a(boolean z, String str);
    }

    static {
        c = AppUtil.INSTANCE.isPlayChannel() ? "wxb0e0defb48683fee" : ShareConfigs.appID;
    }

    public o3r(String str) {
        c = str;
    }

    public static o3r i() {
        if (f28710b == null) {
            synchronized (o3r.class) {
                try {
                    if (f28710b == null) {
                        f28710b = new o3r(c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28710b;
    }

    public static int j() {
        return 0;
    }

    public static int k() {
        return 1;
    }

    public void A(String str, String str2, String str3, byte[] bArr) {
        E(str, str2, str3, bArr);
    }

    public final void B(final String str, String str2, String str3, final int i) {
        if (g(i)) {
            final WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = new WXFileObject(str);
            wXMediaMessage.title = str2;
            wXMediaMessage.description = str3;
            new Thread(new Runnable() { // from class: l3r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24615a.t(str, wXMediaMessage, i);
                }
            }).start();
        }
    }

    public void C(String str, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = str;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = f("text");
        req.message = wXMediaMessage;
        req.scene = i;
        m().sendReq(req);
    }

    public void D(Activity activity) {
        if (g(0)) {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.addFlags(268435456);
                intent.setComponent(componentName);
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(AppUtil.getApp(), AppUtil.getApp().getString(z0j.f), 0).show();
            }
        }
    }

    public final void E(String str, String str2, String str3, byte[] bArr) {
        if (g(j())) {
            WXWebpageObject wXWebpageObject = new WXWebpageObject();
            wXWebpageObject.webpageUrl = str;
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
            wXMediaMessage.title = str2;
            wXMediaMessage.description = str3;
            wXMediaMessage.thumbData = bArr;
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = f("webpage");
            req.message = wXMediaMessage;
            req.scene = j();
            m().sendReq(req);
        }
    }

    public void F(String str, String str2, String str3, String str4, int i, b bVar) {
        if (!g(i)) {
            if (bVar != null) {
                bVar.a(false, "wx not support");
                return;
            }
            return;
        }
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        wXMediaMessage.title = str2;
        wXMediaMessage.description = str3;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), kxi.f24395a);
        Bitmap[] bitmapArr = {Bitmap.createScaledBitmap(bitmapDecodeResource, 100, 100, true)};
        bitmapDecodeResource.recycle();
        new Thread(new a(str4, bitmapArr, wXMediaMessage, i, bVar)).start();
    }

    public final String f(String str) {
        if (str == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return str + System.currentTimeMillis();
    }

    public final boolean g(int i) {
        if (i == 0) {
            return q();
        }
        if (i == 1) {
            return o();
        }
        return true;
    }

    public InputStream h(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        TLSCompatSocketFactoryKt.compatSSLSocketFactory(httpURLConnection);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setRequestMethod("GET");
        if (httpURLConnection.getResponseCode() == 200) {
            return httpURLConnection.getInputStream();
        }
        return null;
    }

    public IWXAPI l() {
        u();
        return this.f28711a;
    }

    public final IWXAPI m() {
        if (this.f28711a == null) {
            this.f28711a = WXAPIFactory.createWXAPI(AppUtil.getApp(), c);
        }
        return this.f28711a;
    }

    public final String n(String str) {
        Application app = AppUtil.getApp();
        Uri uriForFile = FileProvider.getUriForFile(app, im9.B(), new File(str));
        app.grantUriPermission("com.tencent.mm", uriForFile, 1);
        return uriForFile.toString();
    }

    public final boolean o() {
        if (q()) {
            if (this.f28711a.getWXAppSupportAPI() >= 553779201) {
                return true;
            }
            Toast.makeText(AppUtil.getApp(), AppUtil.getApp().getString(z0j.j), 0).show();
        }
        return false;
    }

    public boolean p() {
        return q() && o();
    }

    public final boolean q() {
        if (this.f28711a == null) {
            this.f28711a = WXAPIFactory.createWXAPI(AppUtil.getApp(), c);
        }
        if (this.f28711a.isWXAppInstalled()) {
            return true;
        }
        Toast.makeText(AppUtil.getApp(), AppUtil.getApp().getString(z0j.f), 0).show();
        return false;
    }

    public final /* synthetic */ void r(String str, WXMediaMessage wXMediaMessage, Bitmap bitmap, Bitmap[] bitmapArr, int i) {
        try {
            WXImageObject wXImageObject = new WXImageObject();
            wXImageObject.setImagePath(str);
            wXMediaMessage.mediaObject = wXImageObject;
            bitmapArr[0] = Bitmap.createScaledBitmap(bitmap, 100, (int) ((100 / bitmap.getWidth()) * bitmap.getHeight()), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        wXMediaMessage.thumbData = kq2.b(bitmapArr[0], true);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = f("img");
        req.message = wXMediaMessage;
        req.scene = i;
        m().sendReq(req);
    }

    public final /* synthetic */ void s(WXMediaMessage wXMediaMessage, Bitmap bitmap, Bitmap[] bitmapArr, int i) {
        try {
            wXMediaMessage.mediaObject = new WXImageObject(bitmap);
            bitmapArr[0] = Bitmap.createScaledBitmap(bitmap, 100, 100, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        wXMediaMessage.thumbData = kq2.b(bitmapArr[0], true);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = f("img");
        req.message = wXMediaMessage;
        req.scene = i;
        m().sendReq(req);
    }

    public final /* synthetic */ void t(String str, WXMediaMessage wXMediaMessage, int i) {
        try {
            WXFileObject wXFileObject = new WXFileObject();
            wXFileObject.setFilePath(str);
            wXMediaMessage.mediaObject = wXFileObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = f("file");
        req.message = wXMediaMessage;
        req.scene = i;
        m().sendReq(req);
    }

    public void u() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(AppUtil.getApp(), c, true);
        this.f28711a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(c);
    }

    public void v(Activity activity, Bitmap bitmap, String str, String str2, int i) {
        Uri uriSaveImageToTmp = ShareUtil.INSTANCE.saveImageToTmp(bitmap);
        if (uriSaveImageToTmp != null) {
            x(n(uriSaveImageToTmp.getPath()), bitmap, str, str2, i);
        } else {
            Toast.makeText(AppUtil.getApp(), AppUtil.getApp().getString(z0j.e), 0).show();
        }
    }

    public void w(String str, String str2, String str3, int i) {
        String strN = n(str);
        if (strN != null) {
            B(strN, str2, str3, i);
        } else {
            Toast.makeText(AppUtil.getApp(), AppUtil.getApp().getString(z0j.e), 0).show();
        }
    }

    public final void x(final String str, final Bitmap bitmap, String str2, String str3, final int i) {
        if (g(i)) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), kxi.f24395a);
            final WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = new WXImageObject(bitmapDecodeResource);
            wXMediaMessage.title = str2;
            wXMediaMessage.description = str3;
            final Bitmap[] bitmapArr = {Bitmap.createScaledBitmap(bitmapDecodeResource, 100, 100, true)};
            bitmapDecodeResource.recycle();
            new Thread(new Runnable() { // from class: n3r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27519a.r(str, wXMediaMessage, bitmap, bitmapArr, i);
                }
            }).start();
        }
    }

    public void y(final Bitmap bitmap, String str, String str2, final int i) {
        if (g(i)) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), kxi.f24395a);
            WXImageObject wXImageObject = new WXImageObject(bitmapDecodeResource);
            final WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXImageObject;
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
            final Bitmap[] bitmapArr = {Bitmap.createScaledBitmap(bitmapDecodeResource, 100, 100, true)};
            bitmapDecodeResource.recycle();
            new Thread(new Runnable() { // from class: m3r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25725a.s(wXMediaMessage, bitmap, bitmapArr, i);
                }
            }).start();
        }
    }

    public void z(String str, String str2, String str3, byte[] bArr) {
        E(str, str2, str3, bArr);
    }
}
