package com.huawei.openalliance.ad;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class up implements ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer f20317a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f20318b = Boolean.TRUE;

    @Override // com.huawei.openalliance.ad.ug
    public boolean a() {
        return un.a("com.sina.weibo.sdk.auth.AuthInfo");
    }

    @Override // com.huawei.openalliance.ad.ug
    public void a(Activity activity, uk ukVar, um umVar) {
        hw.b("WeiBoShare", "start WeiBo share");
        IWBAPI iwbapiCreateWBAPI = WBAPIFactory.createWBAPI(activity);
        iwbapiCreateWBAPI.setLoggerEnable(true);
        AuthInfo authInfo = new AuthInfo(activity, umVar.a(), "", "");
        if (!this.f20318b.booleanValue()) {
            b(activity, ukVar, iwbapiCreateWBAPI);
        } else {
            a(activity, ukVar, iwbapiCreateWBAPI, authInfo);
            this.f20318b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity, uk ukVar, IWBAPI iwbapi) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        a(ukVar, weiboMultiMessage);
        a(BitmapFactory.decodeStream(new ByteArrayInputStream(un.a(activity, ukVar, ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT))), weiboMultiMessage);
        a(ukVar, BitmapFactory.decodeStream(new ByteArrayInputStream(un.a(activity, ukVar, 32768))), weiboMultiMessage);
        iwbapi.shareMessage(activity, weiboMultiMessage, true);
    }

    private static void a(uk ukVar, WeiboMultiMessage weiboMultiMessage) {
        TextObject textObject = new TextObject();
        textObject.text = a(ukVar);
        weiboMultiMessage.textObject = textObject;
    }

    private static void a(uk ukVar, Bitmap bitmap, WeiboMultiMessage weiboMultiMessage) {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.actionUrl = ukVar.d();
        webpageObject.identify = UUID.randomUUID().toString();
        webpageObject.defaultText = "分享网页";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, f20317a.intValue(), byteArrayOutputStream);
            webpageObject.thumbData = byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                hw.c("WeiBoShare", th.getClass().getSimpleName());
            } catch (Throwable th2) {
                com.huawei.openalliance.ad.utils.df.a(byteArrayOutputStream);
                throw th2;
            }
        }
        com.huawei.openalliance.ad.utils.df.a(byteArrayOutputStream);
        weiboMultiMessage.mediaObject = webpageObject;
    }

    private static void a(Bitmap bitmap, WeiboMultiMessage weiboMultiMessage) {
        ImageObject imageObject = new ImageObject();
        imageObject.setImageData(bitmap);
        weiboMultiMessage.imageObject = imageObject;
    }

    private static void a(final Activity activity, final uk ukVar, final IWBAPI iwbapi, AuthInfo authInfo) {
        iwbapi.registerApp(activity, authInfo, new SdkListener() { // from class: com.huawei.openalliance.ad.up.1
            public void onInitFailure(Exception exc) {
            }

            public void onInitSuccess() {
                up.b(activity, ukVar, iwbapi);
            }
        });
    }

    private static String a(uk ukVar) {
        return String.format("#%s# %s", un.a(ukVar.b(), 30), un.a(ukVar.c(), 110));
    }
}
