package ro1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import i3.e5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro1/g0;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f153957a = new g0();

    private g0() {
    }

    public static String a(String str) {
        str.getClass();
        gg1.v0 v0VarK = GCMSettingManager.k();
        v0VarK.getClass();
        String strN = fb1.c.n("https://", v0VarK.f77339e);
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_share_unique_id), 0) + 1;
        GCMSettingManager.f41536b.edit().putInt(GCMSettingManager.f41535a.getString(R.string.key_share_unique_id), i14).apply();
        return strN + str + "?share_unique_id=" + i14;
    }

    public static Bitmap b(Context context, Uri uri) {
        context.getClass();
        if (uri == null) {
            return null;
        }
        try {
            return Build.VERSION.SDK_INT >= 29 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri)) : MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        } catch (IOException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            String str = "Failed to retrieve bitmap from  " + uri + " : " + e4.getMessage();
            aVar.getClass();
            i2.a.f(a2Var, "ShareUtil", str);
            return null;
        }
    }

    public static String c(boolean z14) {
        String str = z14 ? "GarminConnect_%s.png" : "GarminConnect_%s.jpg";
        x0 x0Var = x0.f105818a;
        return String.format(str, Arrays.copyOf(new Object[]{DateTimeFormat.forPattern("yyyyMMdd-HHmmss").print(DateTime.now())}, 1));
    }

    public static String d(Context context) {
        return e5.g(context.getString(R.string.garmin_hashtag), StringUtils.SPACE, context.getString(R.string.beat_yesterday_hashtag));
    }

    public static final void e(Context context) {
        context.getClass();
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        f153957a.getClass();
        String strG = e5.g(GCMSettingManager.k().b(), "/modern/profile/", userDisplayName);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.social_invite_people_message, strG));
        context.startActivity(Intent.createChooser(intent, null));
    }

    public static void f(Context context, Intent intent) {
        Parcelable parcelable;
        byte[] byteArray;
        context.getClass();
        intent.getClass();
        ComponentName component = intent.getComponent();
        if (component == null) {
            context.startActivity(intent);
            return;
        }
        String packageName = component.getPackageName();
        packageName.getClass();
        if (!p005kotlin.jvm.internal.s.g(g.WECHAT.f153956a, packageName)) {
            context.startActivity(intent);
            return;
        }
        byte[] byteArray2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
            parcelable = (Uri) parcelableExtra;
        }
        Uri uri = (Uri) parcelable;
        if (uri != null) {
            String className = component.getClassName();
            className.getClass();
            r62.a.EnumC2839a enumC2839a = d53.w.z(className, "TimeLine", false) ? r62.a.EnumC2839a.MOMENTS : r62.a.EnumC2839a.FRIENDS;
            Bitmap bitmapB = b(context, uri);
            if (bitmapB != null) {
                r62.a aVarB = r62.a.b();
                aVarB.getClass();
                int height = bitmapB.getHeight() * bitmapB.getWidth();
                int iMax = Math.max(bitmapB.getWidth(), bitmapB.getHeight());
                if (height < 921600) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapB.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                    byteArray = byteArrayOutputStream.toByteArray();
                } else {
                    for (int i14 = 0; i14 < 5; i14++) {
                        double d14 = r62.a.f151019b[i14] / ((double) iMax);
                        if (i14 >= 5 || ((double) (((int) (((double) bitmapB.getWidth()) * d14)) * ((int) (((double) bitmapB.getHeight()) * d14)))) * 0.25d <= 501760.0d) {
                            Bitmap bitmapExtractThumbnail = d14 != 1.0d ? ThumbnailUtils.extractThumbnail(bitmapB, (int) (((double) bitmapB.getWidth()) * d14), (int) (((double) bitmapB.getHeight()) * d14)) : bitmapB;
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            bitmapExtractThumbnail.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            i2.d("WXShareManager", "Resized image: size=" + byteArray2.length + ", width=" + ((int) (((double) bitmapB.getWidth()) * d14)) + ", height=" + ((int) (((double) bitmapB.getHeight()) * d14)));
                            if (byteArray2.length <= 501760) {
                                break;
                            }
                        }
                    }
                    byteArray = byteArray2;
                }
                WXImageObject wXImageObject = new WXImageObject(byteArray);
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                wXMediaMessage.mediaObject = wXImageObject;
                wXMediaMessage.title = "";
                wXMediaMessage.description = "";
                String strA = r62.a.a("image");
                SendMessageToWX.Req req = new SendMessageToWX.Req();
                req.message = wXMediaMessage;
                req.transaction = strA;
                req.scene = enumC2839a.f151025a;
                aVarB.f151021a.sendReq(req);
            }
        }
    }

    public static void g(androidx.fragment.app.m mVar, Intent intent) {
        intent.getClass();
        ComponentName component = intent.getComponent();
        if (component == null) {
            mVar.startActivity(intent);
            return;
        }
        String packageName = component.getPackageName();
        packageName.getClass();
        if (!p005kotlin.jvm.internal.s.g(g.WECHAT.f153956a, packageName)) {
            mVar.startActivity(intent);
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(mVar.getResources(), 2131232660);
        String stringExtra = intent.getStringExtra("Kdescription");
        String stringExtra2 = intent.getStringExtra("android.intent.extra.SUBJECT");
        String stringExtra3 = intent.getStringExtra("android.intent.extra.TEXT");
        String className = component.getClassName();
        className.getClass();
        r62.a.EnumC2839a enumC2839a = d53.w.z(className, "TimeLine", false) ? r62.a.EnumC2839a.MOMENTS : r62.a.EnumC2839a.FRIENDS;
        if (enumC2839a == r62.a.EnumC2839a.FRIENDS) {
            r62.a.b().c(stringExtra, null, stringExtra2, stringExtra3, enumC2839a);
        } else {
            r62.a.b().c(stringExtra, bitmapDecodeResource, stringExtra2, stringExtra3, enumC2839a);
        }
    }
}
