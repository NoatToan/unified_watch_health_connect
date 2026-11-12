package b10;

import am.j;
import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb10/c;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f14211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u00.a f14213c;

    public c(l22.b bVar) {
        bVar.getClass();
        this.f14211a = bVar;
        this.f14212b = bVar.getString(R.string.no_value_card);
        this.f14213c = new u00.a(bVar);
    }

    public static String a(DateTime dateTime, boolean z14) {
        String string;
        return (dateTime == null || (string = dateTime.toString(z14 ? "HH:mm" : "h:mm a")) == null) ? "" : string;
    }

    public final String b(int i14) {
        u00.a aVar = this.f14213c;
        if (i14 == 0) {
            return aVar.f167337b;
        }
        aVar.getClass();
        l22.b bVar = aVar.f167336a;
        double d14 = i14;
        if (d14 < 3600.0d) {
            l3.f23124b.getClass();
            return e.d((int) (d14 / 60.0d), StringUtils.SPACE, u00.a.h(bVar.getString(R.string.common_min_abbreviated_without_period)));
        }
        if (d14 % 3600.0d < 60.0d) {
            l3.f23124b.getClass();
            int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            return e.d(i15, StringUtils.SPACE, aVar.f(i15 != 1));
        }
        long j8 = i14;
        l3.f23124b.getClass();
        int i16 = ((int) j8) / DateTimeConstants.SECONDS_PER_HOUR;
        int iL1 = l3.a.L1(j8);
        String strF = aVar.f(i16 != 1);
        String strH = u00.a.h(bVar.getString(R.string.common_min_abbreviated_without_period));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i16);
        sb3.append(StringUtils.SPACE);
        sb3.append(strF);
        sb3.append(StringUtils.SPACE);
        sb3.append(iL1);
        return j.o(StringUtils.SPACE, strH, sb3);
    }

    public final String c(int i14, Context context) {
        context.getClass();
        int i15 = i14 * 60;
        return i15 > 0 ? this.f14213c.c(i15) : this.f14212b;
    }
}
