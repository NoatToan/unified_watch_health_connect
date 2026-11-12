package vj1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import g22.n;
import i3.e5;
import java.util.ArrayList;
import l20.r;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvj1/g;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f178466a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178467a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f178467a = iArr;
        }
    }

    public g(l22.b bVar) {
        bVar.getClass();
        this.f178466a = bVar;
    }

    public static String a(String str, String str2) {
        if (n.d(str) && n.d(str2)) {
            return e5.g(str, StringUtils.SPACE, str2);
        }
        if (n.d(str)) {
            return str;
        }
        if (n.d(str2)) {
            return str2;
        }
        return null;
    }

    public final String b(Context context, wj1.a aVar, boolean z14) {
        String lastName;
        r userContactsDTO;
        aVar.getClass();
        tj1.e eVar = aVar.f185783a;
        c cVar = null;
        l20.a emergencyServiceContact = (eVar == null || (userContactsDTO = eVar.getUserContactsDTO()) == null) ? null : userContactsDTO.getEmergencyServiceContact();
        ArrayList arrayListB = aVar.b();
        if (emergencyServiceContact == null || !f.d(emergencyServiceContact)) {
            emergencyServiceContact = f.a(arrayListB);
        }
        if (emergencyServiceContact == null) {
            l22.b bVar = this.f178466a;
            return z14 ? bVar.getString(R.string.mct_setup_required) : bVar.getString(R.string.lbl_select_phone_number);
        }
        if (f.c(emergencyServiceContact)) {
            cVar = c.CONTACT;
        } else {
            String firstName = emergencyServiceContact.getFirstName();
            if ((firstName == null || firstName.length() == 0) && ((lastName = emergencyServiceContact.getLastName()) == null || lastName.length() == 0)) {
                cVar = c.SERVICES;
            }
        }
        String strC = c(context, cVar, emergencyServiceContact);
        return strC == null ? "" : strC;
    }

    public final String c(Context context, c cVar, l20.a aVar) {
        String str;
        l20.c cVarB;
        String str2;
        int i14 = cVar == null ? -1 : a.f178467a[cVar.ordinal()];
        if (i14 == 1) {
            String strA = a(aVar.getFirstName(), aVar.getLastName());
            l20.c cVarB2 = f.b(aVar);
            String strV = (cVarB2 == null || (str = cVarB2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) == null) ? null : jg.b.v(context, str);
            if (strA != null && strA.length() != 0 && strV != null && strV.length() != 0) {
                return this.f178466a.a(R.string.string_comma_string_pattern, strA, strV);
            }
        } else if (i14 == 2 && (cVarB = f.b(aVar)) != null && (str2 = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) != null) {
            return jg.b.v(context, str2);
        }
        return null;
    }
}
