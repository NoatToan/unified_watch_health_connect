package oi0;

import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loi0/e;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f132244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f132245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f132246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f132247g;

    public e(l22.b bVar) {
        bVar.getClass();
        this.f132241a = bVar.getString(R.string.lbl_time_unit_an_hour);
        this.f132242b = bVar.getString(R.string.lbl_time_unit_hours);
        this.f132243c = bVar.getString(R.string.lbl_time_unit_a_minute);
        this.f132244d = bVar.getString(R.string.lbl_time_unit_minutes);
        this.f132245e = bVar.getString(R.string.lbl_time_unit_a_second);
        this.f132246f = bVar.getString(R.string.lbl_time_unit_seconds);
        this.f132247g = bVar.getString(R.string.lbl_hundredths);
    }

    public final String a(long j8, boolean z14) {
        int i14 = (int) (j8 / ((long) DateTimeConstants.MILLIS_PER_HOUR));
        long j14 = j8 - ((long) (DateTimeConstants.MILLIS_PER_HOUR * i14));
        int i15 = (int) (j14 / ((long) DateTimeConstants.MILLIS_PER_MINUTE));
        long j15 = 1000;
        int i16 = (int) ((j14 - ((long) (DateTimeConstants.MILLIS_PER_MINUTE * i15))) / j15);
        int iC = MathKt.c((j8 % j15) / 10.0f);
        StringBuilder sb3 = new StringBuilder();
        if (i14 > 0) {
            sb3.append(i14);
            sb3.append(StringUtils.SPACE);
            if (i14 == 1) {
                sb3.append(this.f132241a);
            } else {
                sb3.append(this.f132242b);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i15 > 0 || z14) {
            sb3.append(i15);
            sb3.append(StringUtils.SPACE);
            if (i15 == 1) {
                sb3.append(this.f132243c);
            } else {
                sb3.append(this.f132244d);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i16 > 0 || z14) {
            sb3.append(i16);
            sb3.append(StringUtils.SPACE);
            if (i16 == 1) {
                sb3.append(this.f132245e);
            } else {
                sb3.append(this.f132246f);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (iC > 0 || z14) {
            sb3.append(iC);
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f132247g);
        }
        return sb3.toString();
    }
}
