package kc;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.q;
import androidx.media3.common.x;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import fa.z;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f103848a;

    public b(Resources resources) {
        resources.getClass();
        this.f103848a = resources;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // kc.k
    public final String a(q qVar) {
        String strB;
        String string;
        String str = qVar.f8386n;
        int i14 = qVar.f8382j;
        int i15 = qVar.C;
        int i16 = qVar.f8394v;
        int i17 = qVar.f8393u;
        String str2 = qVar.f8383k;
        int iH = x.h(str);
        if (iH == -1) {
            if (x.i(str2) != null) {
                iH = 2;
            } else if (x.a(str2) != null) {
                iH = 1;
            } else if (i17 != -1 || i16 != -1) {
                iH = 2;
            } else if (i15 == -1 && qVar.D == -1) {
                iH = -1;
            } else {
                iH = 1;
            }
        }
        Resources resources = this.f103848a;
        if (iH == 2) {
            strB = d(c(qVar), (i17 == -1 || i16 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i17), Integer.valueOf(i16)), i14 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i14 / 1000000.0f)) : "");
        } else if (iH == 1) {
            String strB2 = b(qVar);
            if (i15 == -1 || i15 < 1) {
                string = "";
            } else if (i15 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i15 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i15 == 6 || i15 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i15 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strB = d(strB2, string, i14 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i14 / 1000000.0f)) : "");
        } else {
            strB = b(qVar);
        }
        if (strB.length() != 0) {
            return strB;
        }
        String str3 = qVar.f8376d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final String b(q qVar) {
        String displayName;
        String str = qVar.f8376d;
        String str2 = qVar.f8374b;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = z.f70071a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strD = d(displayName, c(qVar));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public final String c(q qVar) {
        int i14 = qVar.f8378f;
        int i15 = i14 & 2;
        Resources resources = this.f103848a;
        String string = i15 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i14 & 4) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i14 & 8) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i14 & 1088) != 0 ? d(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f103848a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
