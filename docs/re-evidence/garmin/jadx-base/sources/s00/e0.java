package s00;

import android.os.Bundle;
import c22.s3;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/e0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends j {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155293a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.LIVE_TRACK_CONTACT_ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.MESSENGER_LIVE_TRACK_RECIPIENT_INVITE_ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.MESSENGER_LIVE_TRACK_INVALID_RECIPIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n00.c.MESSENGER_LIVE_TRACK_RECIPIENT_ACCOUNT_DELETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n00.c.LIVE_TRACK_CONTACT_DECLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n00.c.LIVE_TRACK_CONTACT_SMS_OPT_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n00.c.MESSENGER_LIVE_TRACK_SENDER_ACCOUNT_DELETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n00.c.MESSENGER_LIVE_TRACK_SENDER_SMS_REMOVED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f155293a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        String string;
        String string2;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string3 = bundle.getString("lt-first-name");
        if (string3 == null) {
            String string4 = bundle.getString("contact-first-name");
            if (string4 == null) {
                string4 = "";
            }
            string3 = d53.w.i0(string4).toString();
        }
        String string5 = bundle.getString("lt-last-name");
        if (string5 == null) {
            String string6 = bundle.getString("contact-last-name");
            if (string6 == null) {
                string6 = "";
            }
            string5 = d53.w.i0(string6).toString();
        }
        String string7 = bundle.getString("admin-first-name");
        if (string7 == null) {
            string7 = "";
        }
        String string8 = d53.w.i0(string7).toString();
        String string9 = bundle.getString("admin-last-name");
        String string10 = d53.w.i0(string9 != null ? string9 : "").toString();
        a2 a2Var = a2.LIVETRACK;
        String strJ = androidx.room.a0.j("Received notification for contact ", string3, StringUtils.SPACE, string5);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveTrackPushNotificationHandler", strJ);
        String string11 = garminConnectMobileApp.getString(R.string.string_space_string_pattern, string3, string5);
        string11.getClass();
        String string12 = d53.w.i0(string11).toString();
        int[] iArr = b.f155293a;
        int i14 = iArr[cVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            string = garminConnectMobileApp.getString(R.string.pn_livetrack_contact_accept_title);
        } else if (i14 != 3) {
            string = i14 != 4 ? garminConnectMobileApp.getString(R.string.pn_livetrack_contact_decline_title) : garminConnectMobileApp.getString(R.string.pn_messenger_livetrack_recipient_account_deleted_title);
        } else {
            string = garminConnectMobileApp.getString(R.string.pn_messenger_livetrack_invalid_recipients_title);
        }
        string.getClass();
        switch (iArr[cVar.ordinal()]) {
            case 1:
                string2 = !s3.b() ? garminConnectMobileApp.getString(R.string.pn_livetrack_contact_accept_format, string12) : garminConnectMobileApp.getString(R.string.pn_livetrack_child_contact_added, e5.g(string8, StringUtils.SPACE, string10), string12);
                break;
            case 2:
                string2 = garminConnectMobileApp.getString(R.string.pn_messenger_livetrack_recipient_invite_accepted_format, string12);
                break;
            case 3:
            default:
                string2 = null;
                break;
            case 4:
                string2 = garminConnectMobileApp.getString(R.string.pn_messenger_livetrack_recipient_account_deleted_format, string12);
                break;
            case 5:
                string2 = garminConnectMobileApp.getString(R.string.pn_livetrack_contact_decline_format, string12);
                break;
            case 6:
                string2 = garminConnectMobileApp.getString(R.string.pn_livetrack_contact_sms_optout_format, string12);
                break;
            case 7:
                string2 = garminConnectMobileApp.getString(R.string.pn_messenger_livetrack_sender_account_deleted_format);
                break;
            case 8:
                string2 = garminConnectMobileApp.getString(R.string.pn_messenger_livetrack_sender_sms_removed_format);
                break;
        }
        if (string2 != null) {
            i2.a.b(a2Var, "LiveTrackPushNotificationHandler", "Sending LiveTrack recipients to devices");
            yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
            j.e(garminConnectMobileApp, sz0.e.f161376o, d(cVar), string, string2, j.c(garminConnectMobileApp, LiveTrackActivity.a.b(LiveTrackActivity.f38637g, garminConnectMobileApp, bv0.a.t.INSTANCE)));
        } else {
            i2.a.f(a2Var, "LiveTrackPushNotificationHandler", "Unable to post notification! Notification type " + cVar + " is not supported by this handler.");
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.LIVE_TRACK_CONTACT_ACCEPT, n00.c.LIVE_TRACK_CONTACT_DECLINE, n00.c.LIVE_TRACK_CONTACT_SMS_OPT_OUT, n00.c.MESSENGER_LIVE_TRACK_RECIPIENT_INVITE_ACCEPTED, n00.c.MESSENGER_LIVE_TRACK_RECIPIENT_ACCOUNT_DELETED, n00.c.MESSENGER_LIVE_TRACK_SENDER_ACCOUNT_DELETED, n00.c.MESSENGER_LIVE_TRACK_SENDER_SMS_REMOVED, n00.c.MESSENGER_LIVE_TRACK_INVALID_RECIPIENT};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Ls00/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LT_FIRST_NAME", "LT_LAST_NAME", "CONTACT_FIRST_NAME", "CONTACT_LAST_NAME", "ADMIN_FIRST_NAME", "ADMIN_LAST_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
