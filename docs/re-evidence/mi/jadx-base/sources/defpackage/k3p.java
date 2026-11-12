package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.TemperatureEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class k3p extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f23400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23401b;

    public k3p(Context context, boolean z) {
        super(0);
        this.f23400a = context;
        this.f23401b = z;
    }

    public final String a(float f) {
        return String.format(Locale.US, "%.1f", Float.valueOf(f));
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        String strA;
        String strA2;
        String dateYYYYMMddLocalFormat;
        if (!(recyclerBarEntry instanceof TemperatureEntry)) {
            return "";
        }
        TemperatureEntry temperatureEntry = (TemperatureEntry) recyclerBarEntry;
        float f = temperatureEntry.f11766a;
        float f2 = temperatureEntry.c;
        float f3 = temperatureEntry.f11767b;
        float f4 = temperatureEntry.d;
        boolean z = (f == 0.0f && f3 == 0.0f) ? false : true;
        boolean z2 = (f2 == 0.0f && f4 == 0.0f) ? false : true;
        String string = this.f23400a.getString(c0j.hn);
        if (f == f2 && f3 == f4 && f == 0.0f && f3 == 0.0f) {
            return "";
        }
        Object[] objArr = new Object[2];
        if (f == f3) {
            strA = a(f3);
        } else {
            strA = a(f3) + "-" + a(f);
        }
        objArr[0] = strA;
        objArr[1] = string;
        String str = String.format("%s%s", objArr);
        Object[] objArr2 = new Object[2];
        if (f2 == f4) {
            strA2 = a(f4);
        } else {
            strA2 = a(f4) + "-" + a(f2);
        }
        objArr2[0] = strA2;
        objArr2[1] = string;
        String str2 = String.format("%s%s", objArr2);
        boolean zIsPlayChannel = AppUtil.INSTANCE.isPlayChannel();
        String string2 = zIsPlayChannel ? "" : this.f23400a.getString(c0j.dn);
        String string3 = zIsPlayChannel ? "" : this.f23400a.getString(c0j.nn);
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(str);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(string2);
        }
        if (z && z2) {
            sb.append("，");
            sb.append(gv5.CONNECT_VALUE_STR);
        }
        if (z2) {
            sb.append(str2);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(string3);
        }
        String dateStr = TimeDateUtil.getDateStr(recyclerBarEntry.timestamp, TimeUtils.FORMAT_H_M);
        if (this.f23401b) {
            dateYYYYMMddLocalFormat = dateStr + "-" + TimeDateUtil.getDateStr(recyclerBarEntry.timestamp + RepositoryManager.GAP_X_MINUTE, TimeUtils.FORMAT_H_M);
        } else {
            dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(recyclerBarEntry.timestamp * 1000);
        }
        return sb.toString() + gv5.CONNECT_STR + dateYYYYMMddLocalFormat;
    }
}
