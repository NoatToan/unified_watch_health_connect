package ww2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cx2.h;
import fb1.c;
import java.util.Objects;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lww2/a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3491a f187896a = new C3491a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f187897b = new h("AppInstallation", null, 2, null);

    /* JADX INFO: renamed from: ww2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lww2/a$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "", "WORLD_WIDE_PLAY_STORE_URL", "Ljava/lang/String;", "CHINA_DOWNLOAD_URL", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3491a {

        /* JADX INFO: renamed from: ww2.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3492a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f187898a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.GARMIN_CONNECT_MOBILE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.GARMIN_DIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.GARMIN_GOLF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.GARMIN_TOY_STORE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.GARMIN_VIRB.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f187898a = iArr;
            }
        }

        public /* synthetic */ C3491a(j jVar) {
            this();
        }

        public static void a(Context context, b bVar) {
            String str;
            String strConcat;
            bVar.getClass();
            h hVar = a.f187897b;
            bVar.name();
            hVar.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            if (com.garmin.realtimesettings.app.initialization.b.c().f192457e) {
                strConcat = c.n("https://play.google.com/store/apps/details?id=", bVar.f187905a);
            } else {
                int i14 = C3492a.f187898a[bVar.ordinal()];
                if (i14 == 1) {
                    str = "Garmin_Connect_Mobile/";
                } else if (i14 == 2) {
                    str = "garmin-dive-app/";
                } else if (i14 == 3) {
                    str = "garmingolfapp/";
                } else if (i14 == 4) {
                    str = "connect-iq/";
                } else {
                    if (i14 != 5) {
                        u0.r();
                        return;
                    }
                    str = "garmin_virbapp/";
                }
                strConcat = "https://www.garmin.com.cn/products/apps/".concat(str);
            }
            Uri uri = Uri.parse(strConcat);
            Objects.toString(uri);
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        }

        private C3491a() {
        }
    }
}
