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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqt/f;", "Lqt/a;", "", "firstAge", "Lorg/joda/time/DateTime;", "firstAgeDate", "lastAge", "<init>", "(DLorg/joda/time/DateTime;D)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f147443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f147444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f147445c;

    public f(double d14, DateTime dateTime, double d15) {
        dateTime.getClass();
        this.f147443a = d14;
        this.f147444b = dateTime;
        this.f147445c = d15;
    }

    @Override // qt.a
    public final String a(Context context) {
        context.getClass();
        pt.h.f140570a.getClass();
        String strA = pt.h.a(this.f147444b);
        l3.f23124b.getClass();
        String str = l3.f23130h.format(this.f147443a);
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.annual_report_achievement_down_from_content);
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
        return a0.e(R.string.lbl_fitness_age, context);
    }

    @Override // qt.a
    public final String d() {
        l3.f23124b.getClass();
        String str = l3.f23130h.format(this.f147445c);
        str.getClass();
        return str;
    }

    @Override // qt.a
    public final String e() {
        return "icon_fa";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Double.compare(this.f147443a, fVar.f147443a) == 0 && s.g(this.f147444b, fVar.f147444b) && Double.compare(this.f147445c, fVar.f147445c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f147445c) + e0.a(Double.hashCode(this.f147443a) * 31, this.f147444b, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FitnessAgeUIData(firstAge=");
        sb3.append(this.f147443a);
        sb3.append(", firstAgeDate=");
        sb3.append(this.f147444b);
        return j.r(sb3, ", lastAge=", this.f147445c, ")");
    }
}
