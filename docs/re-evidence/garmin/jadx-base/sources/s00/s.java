package s00;

import android.content.Intent;
import android.os.Bundle;
import c22.s3;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/s;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends j {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155418a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.EMERGENCY_CONTACT_ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.EMERGENCY_CONTACT_DECLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.EMERGENCY_CONTACT_SMS_OPT_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155418a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        String string;
        String str;
        pj1.l lVar;
        pj1.l lVar2;
        String string2;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string3 = bundle.getString("contact-uuid");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = bundle.getString("ec-first-name");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = bundle.getString("ec-last-name");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = bundle.getString("contact-info-pk");
        Long lJ = string6 != null ? d53.t.j(string6) : null;
        String string7 = bundle.getString("admin-first-name");
        if (string7 == null) {
            string7 = "";
        }
        String string8 = d53.w.i0(string7).toString();
        String string9 = bundle.getString("admin-last-name");
        String string10 = d53.w.i0(string9 != null ? string9 : "").toString();
        a2 a2Var = a2.SAFETY_FEATURES;
        StringBuilder sbI = p6.b.i("Received notification for contact ", string4, StringUtils.SPACE, string5, " (");
        sbI.append(string3);
        sbI.append(") and contact method ");
        sbI.append(lJ);
        sbI.append(".");
        String string11 = sbI.toString();
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var, "EmergencyContactPushNotificationHandler", string11);
        if (string3.length() <= 0 || lJ == null) {
            i2.a.f(a2Var, "EmergencyContactPushNotificationHandler", "Unable to post notification! ContactUUID or contactInfoPk were not included.");
            return;
        }
        sz0.e eVar = sz0.e.f161371k;
        String string12 = garminConnectMobileApp.getString(R.string.incident_detection_assistance_contact);
        string12.getClass();
        int i14 = b.f155418a[cVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                lVar2 = pj1.l.DECLINE;
                if (s3.b()) {
                    string2 = garminConnectMobileApp.getString(R.string.pn_child_assistance_contact_declined, d53.w.i0(string4 + StringUtils.SPACE + string5).toString());
                    string2.getClass();
                } else {
                    string2 = garminConnectMobileApp.getString(R.string.contact_declined_your_assistance_contact_request, d53.w.i0(string4 + StringUtils.SPACE + string5).toString());
                    string2.getClass();
                }
            } else {
                if (i14 != 3) {
                    i2.a.f(a2Var, "EmergencyContactPushNotificationHandler", "Unable to post notification! Notification type " + cVar + " is not supported by this handler.");
                    return;
                }
                lVar2 = pj1.l.OPT_OUT;
                string2 = garminConnectMobileApp.getString(R.string.contact_opted_out_of_emergency_messages, d53.w.i0(string4 + StringUtils.SPACE + string5).toString());
                string2.getClass();
            }
            lVar = lVar2;
            str = string2;
        } else {
            pj1.l lVar3 = pj1.l.ACCEPT;
            if (s3.b()) {
                string = garminConnectMobileApp.getString(R.string.pn_child_assistance_contact_accepted, e5.g(string8, StringUtils.SPACE, string10), d53.w.i0(string4 + StringUtils.SPACE + string5).toString());
                string.getClass();
            } else {
                string = garminConnectMobileApp.getString(R.string.contact_accepted_your_assistance_contact_request, d53.w.i0(string4 + StringUtils.SPACE + string5).toString());
                string.getClass();
            }
            str = string;
            lVar = lVar3;
        }
        int iD = d(cVar);
        Intent intentC = SafetyFeaturesActivity.f43691f.c(garminConnectMobileApp, string3, lJ.longValue(), lVar, hl.a.c.f84256b);
        if (lVar != pj1.l.ACCEPT) {
            aVar.getClass();
            i2.a.b(a2Var, "SafetyUtils", "Sending emergency contacts to devices");
            eq0.a aVarA = eq0.a.f65038b.a();
            aVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.f(aVarA), null);
            yr1.e.c("EmergencyContacts", SupportedCapability.CONTACTS_SUPPORT);
        }
        j.e(garminConnectMobileApp, eVar, iD, string12, str, j.c(garminConnectMobileApp, intentC));
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.EMERGENCY_CONTACT_ACCEPT, n00.c.EMERGENCY_CONTACT_DECLINE, n00.c.EMERGENCY_CONTACT_SMS_OPT_OUT};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Ls00/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CONTACT_UUID", "EC_FIRST_NAME", "EC_LAST_NAME", "CONTACT_INFO_PK", "ADMIN_FIRST_NAME", "ADMIN_LAST_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
