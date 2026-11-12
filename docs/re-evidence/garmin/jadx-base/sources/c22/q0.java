package c22;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailability;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/q0;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23203a = new a(null);

    private q0() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lc22/q0$a;", "", "<init>", "()V", "", "APP_STORE_URL", "Ljava/lang/String;", "APP_WEBSITE_URL", "CHINA_DOWNLOAD_URL", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c22.q0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0345a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23204a;

            static {
                int[] iArr = new int[hb2.g.a.values().length];
                try {
                    iArr[hb2.g.a.GARMIN_GOLF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hb2.g.a.GARMIN_CONNECT_IQ.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[hb2.g.a.GARMIN_DIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[hb2.g.a.GARMIN_CONNECT_MOBILE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[hb2.g.a.GARMIN_VIRB.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[hb2.g.a.GARMIN_EXPLORE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f23204a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Uri a(Context context, hb2.g.a aVar) {
            String str;
            aVar.getClass();
            context.getClass();
            if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
                int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
                String str2 = aVar.f82804a;
                if (iIsGooglePlayServicesAvailable == 0) {
                    str2.getClass();
                    Uri uri = Uri.parse("market://details?id=".concat(str2));
                    uri.getClass();
                    return uri;
                }
                str2.getClass();
                Uri uri2 = Uri.parse("https://play.google.com/store/apps/details?id=".concat(str2));
                uri2.getClass();
                return uri2;
            }
            switch (C0345a.f23204a[aVar.ordinal()]) {
                case 1:
                    str = "https://www.garmin.com.cn/products/apps/garmingolfapp/";
                    break;
                case 2:
                    str = "https://www.garmin.com.cn/products/apps/connect-iq/";
                    break;
                case 3:
                    str = "https://www.garmin.com.cn/products/apps/garmin-dive-app/";
                    break;
                case 4:
                    str = "https://www.garmin.com.cn/products/apps/Garmin_Connect_Mobile/";
                    break;
                case 5:
                    str = "https://www.garmin.com.cn/products/apps/garmin_virbapp/";
                    break;
                case 6:
                    str = "https://www.garmin.com.cn/products/apps/garmin-explore-app/";
                    break;
                default:
                    str = "";
                    break;
            }
            Uri uri3 = Uri.parse(str);
            uri3.getClass();
            return uri3;
        }

        public static void b(Context context, String str) {
            str.getClass();
            context.getClass();
            try {
                Uri uri = Uri.parse("market://details?id=".concat(str));
                uri.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
            } catch (ActivityNotFoundException unused) {
                Uri uri2 = Uri.parse("https://play.google.com/store/apps/details?id=".concat(str));
                uri2.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", uri2));
            }
        }

        private a() {
        }
    }
}
