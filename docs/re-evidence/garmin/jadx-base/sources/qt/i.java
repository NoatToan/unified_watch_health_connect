package qt;

import am.j;
import android.content.Context;
import androidx.room.a0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import java.util.Arrays;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqt/i;", "Lqt/a;", "", "firstMax", "Lorg/joda/time/DateTime;", "firstMaxDate", "lastMax", "<init>", "(DLorg/joda/time/DateTime;D)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f147452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f147453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f147454c;

    public i(double d14, DateTime dateTime, double d15) {
        dateTime.getClass();
        this.f147452a = d14;
        this.f147453b = dateTime;
        this.f147454c = d15;
    }

    @Override // qt.a
    public final String a(Context context) {
        context.getClass();
        pt.h.f140570a.getClass();
        String strA = pt.h.a(this.f147453b);
        l3.f23124b.getClass();
        String str = l3.f23131i.format(this.f147452a);
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.annual_report_achievement_up_from_content);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{str, strA}, 2));
    }

    @Override // qt.a
    public final String b(Context context) {
        context.getClass();
        return a(context);
    }

    @Override // qt.a
    public final String c(Context context) {
        return a0.e(R.string.lbl_vo2_max, context);
    }

    @Override // qt.a
    public final String d() {
        l3.f23124b.getClass();
        String str = l3.f23131i.format(this.f147454c);
        str.getClass();
        return str;
    }

    @Override // qt.a
    public final String e() {
        return "icon_vo2";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.f147452a, iVar.f147452a) == 0 && s.g(this.f147453b, iVar.f147453b) && Double.compare(this.f147454c, iVar.f147454c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f147454c) + e0.a(Double.hashCode(this.f147452a) * 31, this.f147453b, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VO2MaxUIData(firstMax=");
        sb3.append(this.f147452a);
        sb3.append(", firstMaxDate=");
        sb3.append(this.f147453b);
        return j.r(sb3, ", lastMax=", this.f147454c, ")");
    }
}
