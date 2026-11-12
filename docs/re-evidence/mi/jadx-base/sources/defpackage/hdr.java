package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.BloodPressureEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;

/* JADX INFO: loaded from: classes9.dex */
public class hdr extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19964a;

    public hdr(Context context) {
        super(0);
        this.f19964a = context;
    }

    private String a(String str, String str2, String str3, String str4) {
        if (AppUtil.isRTLDirection()) {
            return str4 + gv5.CONNECT_VALUE_STR + str3 + "，" + gv5.CONNECT_VALUE_STR + str2 + gv5.CONNECT_VALUE_STR + str;
        }
        return str + gv5.CONNECT_VALUE_STR + str2 + "，" + gv5.CONNECT_VALUE_STR + str3 + gv5.CONNECT_VALUE_STR + str4;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        StringBuilder sb;
        StringBuilder sb2;
        String str = "";
        if (!(recyclerBarEntry instanceof BloodPressureEntry)) {
            return "";
        }
        BloodPressureEntry bloodPressureEntry = (BloodPressureEntry) recyclerBarEntry;
        int i = bloodPressureEntry.f11746a;
        int i2 = bloodPressureEntry.f11747b;
        int i3 = bloodPressureEntry.c;
        int i4 = bloodPressureEntry.d;
        if (i == i2 && i3 == i4 && i == 0 && i3 == 0) {
            return "";
        }
        if (i == i2) {
            strValueOf = String.valueOf(i);
        } else {
            strValueOf = i2 + "-" + i;
        }
        if (i3 == i4) {
            strValueOf2 = String.valueOf(i3);
        } else {
            strValueOf2 = i4 + "-" + i3;
        }
        boolean z = AppUtil.INSTANCE.isPlayChannel() && !LocaleUtil.INSTANCE.isChinese();
        String strA = a(strValueOf, z ? "SBP" : this.f19964a.getString(c0j.B2), strValueOf2, z ? "DBP" : this.f19964a.getString(c0j.C1));
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(recyclerBarEntry.timestamp * 1000);
        int i5 = bloodPressureEntry.f;
        int i6 = bloodPressureEntry.e;
        if (i5 == i6 && i6 == 0) {
            strValueOf3 = "";
        } else if (i5 == i6) {
            strValueOf3 = String.valueOf(i5);
        } else {
            strValueOf3 = i6 + "-" + i5;
        }
        if (!strValueOf3.isEmpty()) {
            str = strValueOf3 + gv5.CONNECT_VALUE_STR + this.f19964a.getString(c0j.j2);
        }
        if (UIUtils.INSTANCE.isTablet()) {
            if (str.isEmpty()) {
                sb2 = new StringBuilder();
                sb2.append(strA);
            } else {
                sb2 = new StringBuilder();
                sb2.append(String.format("%s  @%s", strA, str));
            }
            sb2.append(gv5.CONNECT_STR);
            sb2.append(dateYYYYMMddLocalFormat);
            return sb2.toString();
        }
        if (str.isEmpty()) {
            sb = new StringBuilder();
            sb.append(strA);
        } else {
            sb = new StringBuilder();
            sb.append(strA);
            sb.append(gv5.CONNECT_STR);
            sb.append(str);
        }
        sb.append(gv5.CONNECT_STR);
        sb.append(dateYYYYMMddLocalFormat);
        return sb.toString();
    }
}
