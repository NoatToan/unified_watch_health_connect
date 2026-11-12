package s00;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/c;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f155287a = 0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155288a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.COMMENTED_ON_USER_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.COMMENTED_ON_ACTIVITY_THREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.TAGGED_ON_ACTIVITY_COMMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155288a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(final GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        DateTime dateTimeN;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        int i14 = b.f155288a[cVar.ordinal()];
        if (i14 == 1) {
            final String string = bundle.getString("activity-id");
            String string2 = bundle.getString("activity-start-time-gmt");
            dateTimeN = string2 != null ? c22.j0.N(string2, true) : null;
            final String strA = new mn.a(new l22.a(garminConnectMobileApp)).a(bundle.getString("activity-name"));
            final String string3 = bundle.getString("fromUser-name");
            final String string4 = bundle.getString("comment-text");
            final String string5 = bundle.getString("toUser-name");
            final String string6 = bundle.getString("comment-uuid");
            String string7 = bundle.getString("profileImage-url");
            String string8 = bundle.getString("framedProfileImage-url");
            if (string == null || string.length() == 0 || string3 == null || string3.length() == 0 || string4 == null || string4.length() == 0 || string5 == null || string5.length() == 0) {
                return;
            }
            final int i15 = 0;
            final DateTime dateTime = dateTimeN;
            og2.k.z(garminConnectMobileApp, new e23.l() { // from class: s00.b
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    String str = string4;
                    switch (i16) {
                        case 0:
                            int i17 = c.f155287a;
                            Context context = garminConnectMobileApp;
                            String string9 = context.getString(R.string.pn_title_new_comment);
                            string9.getClass();
                            String str2 = string3;
                            String string10 = context.getString(R.string.pn_commented_on_activity_with_text, str2, str);
                            string10.getClass();
                            po1.d dVar = new po1.d(context, string, dateTime, string5, str2, strA, string6, (Bitmap) obj, string9, string10);
                            oi2.a.f132270a.getClass();
                            l73.c.b().e(dVar);
                            ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                            break;
                        default:
                            int i18 = c.f155287a;
                            Context context2 = garminConnectMobileApp;
                            String string11 = context2.getString(R.string.pn_title_new_mention);
                            string11.getClass();
                            String str3 = string3;
                            String string12 = context2.getString(R.string.pn_someone_tagged_you, str3, str);
                            string12.getClass();
                            po1.d dVar2 = new po1.d(context2, string, dateTime, string5, str3, strA, string6, (Bitmap) obj, string11, string12);
                            oi2.a.f132270a.getClass();
                            l73.c.b().e(dVar2);
                            ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, string8 == null ? string7 : string8);
            return;
        }
        if (i14 == 2) {
            String string9 = bundle.getString("activity-id");
            String strA2 = new mn.a(new l22.a(garminConnectMobileApp)).a(bundle.getString("activity-name"));
            String string10 = bundle.getString("activity-name");
            boolean z14 = string10 == null || string10.length() == 0;
            String string11 = bundle.getString("activity-start-time-gmt");
            dateTimeN = string11 != null ? c22.j0.N(string11, true) : null;
            String string12 = bundle.getString("fromUser-name");
            String string13 = bundle.getString("comment-text");
            String string14 = bundle.getString("comment-uuid");
            String string15 = bundle.getString("profileImage-url");
            String string16 = bundle.getString("framedProfileImage-url");
            if (string9 == null || string9.length() == 0 || string12 == null || string12.length() == 0 || string13 == null || string13.length() == 0) {
                return;
            }
            og2.k.z(garminConnectMobileApp, new gt1.j(garminConnectMobileApp, z14, string12, string13, strA2, string9, dateTimeN, string14), string16 == null ? string15 : string16);
            return;
        }
        if (i14 != 3) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ActivityCommentPushNotificationHandler", "onPushNotificationReceived: " + cVar + " not handled");
            return;
        }
        final String string17 = bundle.getString("activity-id");
        String string18 = bundle.getString("activity-start-time-gmt");
        dateTimeN = string18 != null ? c22.j0.N(string18, true) : null;
        final String strA3 = new mn.a(new l22.a(garminConnectMobileApp)).a(bundle.getString("activity-name"));
        final String string19 = bundle.getString("fromUser-name");
        final String string20 = bundle.getString("comment-text");
        final String string21 = bundle.getString("toUser-name");
        final String string22 = bundle.getString("comment-uuid");
        String string23 = bundle.getString("profileImage-url");
        String string24 = bundle.getString("framedProfileImage-url");
        if (string17 == null || string17.length() == 0 || string19 == null || string19.length() == 0 || string20 == null || string20.length() == 0) {
            return;
        }
        final int i16 = 1;
        final DateTime dateTime2 = dateTimeN;
        og2.k.z(garminConnectMobileApp, new e23.l() { // from class: s00.b
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                String str = string20;
                switch (i17) {
                    case 0:
                        int i18 = c.f155287a;
                        Context context = garminConnectMobileApp;
                        String string25 = context.getString(R.string.pn_title_new_comment);
                        string25.getClass();
                        String str2 = string19;
                        String string110 = context.getString(R.string.pn_commented_on_activity_with_text, str2, str);
                        string110.getClass();
                        po1.d dVar = new po1.d(context, string17, dateTime2, string21, str2, strA3, string22, (Bitmap) obj, string25, string110);
                        oi2.a.f132270a.getClass();
                        l73.c.b().e(dVar);
                        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                        break;
                    default:
                        int i19 = c.f155287a;
                        Context context2 = garminConnectMobileApp;
                        String string111 = context2.getString(R.string.pn_title_new_mention);
                        string111.getClass();
                        String str3 = string19;
                        String string112 = context2.getString(R.string.pn_someone_tagged_you, str3, str);
                        string112.getClass();
                        po1.d dVar2 = new po1.d(context2, string17, dateTime2, string21, str3, strA3, string22, (Bitmap) obj, string111, string112);
                        oi2.a.f132270a.getClass();
                        l73.c.b().e(dVar2);
                        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, string24 == null ? string23 : string24);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.COMMENTED_ON_USER_ACTIVITY, n00.c.COMMENTED_ON_ACTIVITY_THREAD, n00.c.TAGGED_ON_ACTIVITY_COMMENT};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Ls00/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_ACTIVITY_ID", "KEY_ACTIVITY_START_TIME_GMT", "KEY_ACTIVITY_NAME", "KEY_COMMENT_TEXT", "KEY_FROM_USER_NAME", "KEY_TO_USER_NAME", "KEY_CONVERSATION_ID", "KEY_COMMENT_UUID", "KEY_PROFILE_IMAGE_URL", "KEY_FRAMED_PROFILE_IMAGE_URL", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
