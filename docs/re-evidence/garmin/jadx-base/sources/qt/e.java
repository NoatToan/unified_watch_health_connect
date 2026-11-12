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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqt/e;", "Lqt/a;", "", "firstScore", "Lorg/joda/time/DateTime;", "firstScoreDate", "lastScore", "<init>", "(ILorg/joda/time/DateTime;I)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f147441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147442c;

    public e(int i14, DateTime dateTime, int i15) {
        dateTime.getClass();
        this.f147440a = i14;
        this.f147441b = dateTime;
        this.f147442c = i15;
    }

    @Override // qt.a
    public final String a(Context context) {
        context.getClass();
        pt.h.f140570a.getClass();
        String strA = pt.h.a(this.f147441b);
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(this.f147440a));
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
        return a0.e(R.string.lbl_endurance_score, context);
    }

    @Override // qt.a
    public final String d() {
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(this.f147442c));
        str.getClass();
        return str;
    }

    @Override // qt.a
    public final String e() {
        return "icon_endurance";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f147440a == eVar.f147440a && s.g(this.f147441b, eVar.f147441b) && this.f147442c == eVar.f147442c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147442c) + e0.a(Integer.hashCode(this.f147440a) * 31, this.f147441b, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnduranceScoreUIData(firstScore=");
        sb3.append(this.f147440a);
        sb3.append(", firstScoreDate=");
        sb3.append(this.f147441b);
        sb3.append(", lastScore=");
        return j.q(sb3, this.f147442c, ")");
    }
}
