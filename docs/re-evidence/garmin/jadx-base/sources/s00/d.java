package s00;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/d;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f155289a = 0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155290a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.LIKED_ON_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.LIKED_ON_ACTIVITY_COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155290a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        int i14 = b.f155290a[cVar.ordinal()];
        boolean z14 = true;
        if (i14 == 1) {
            String string = bundle.getString("activity-id");
            String string2 = bundle.getString("activity-start-time-gmt");
            DateTime dateTimeN = string2 != null ? c22.j0.N(string2, true) : null;
            String strA = new mn.a(new l22.a(garminConnectMobileApp)).a(bundle.getString("activity-name"));
            String string3 = bundle.getString("activity-name");
            if (string3 != null && string3.length() != 0) {
                z14 = false;
            }
            String string4 = bundle.getString("fromUser-name");
            String string5 = bundle.getString("profileImage-url");
            String string6 = bundle.getString("framedProfileImage-url");
            if (string == null || string.length() == 0 || string4 == null || string4.length() == 0) {
                return;
            }
            og2.k.z(garminConnectMobileApp, new ds.e(z14, garminConnectMobileApp, string4, strA, string, dateTimeN, 6), string6 == null ? string5 : string6);
            return;
        }
        if (i14 != 2) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ActivityLikePushNotificationHandler", "onPushNotificationReceived: " + cVar + " not handled");
            return;
        }
        String string7 = bundle.getString("activity-id");
        String string8 = bundle.getString("activity-start-time-gmt");
        DateTime dateTimeN2 = string8 != null ? c22.j0.N(string8, true) : null;
        String string9 = bundle.getString("comment-text");
        String string10 = bundle.getString("fromUser-name");
        String string11 = bundle.getString("profileImage-url");
        String string12 = bundle.getString("framedProfileImage-url");
        String string13 = bundle.getString("comment-uuid");
        if (string7 == null || string7.length() == 0 || string9 == null || string9.length() == 0 || string10 == null || string10.length() == 0) {
            return;
        }
        og2.k.z(garminConnectMobileApp, new aa2.p(garminConnectMobileApp, string10, string9, string7, dateTimeN2, string13, 26), string12 == null ? string11 : string12);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.LIKED_ON_ACTIVITY, n00.c.LIKED_ON_ACTIVITY_COMMENT};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Ls00/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_ACTIVITY_ID", "KEY_ACTIVITY_START_TIME_GMT", "KEY_ACTIVITY_NAME", "KEY_FROM_USER_NAME", "KEY_COMMENT_TEXT", "KEY_PROFILE_IMAGE_URL", "KEY_FRAMED_PROFILE_IMAGE_URL", "KEY_COMMENT_UUID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
