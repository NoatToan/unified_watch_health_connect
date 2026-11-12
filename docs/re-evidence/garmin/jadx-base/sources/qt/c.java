package qt;

import android.content.Context;
import android.content.res.Resources;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqt/c;", "Lqt/a;", "", "count", "points", "", "", "badgesId", "<init>", "(IILjava/util/List;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f147436c;

    public c(int i14, int i15, List<String> list) {
        list.getClass();
        this.f147434a = i14;
        this.f147435b = i15;
        this.f147436c = list;
    }

    @Override // qt.a
    public final String a(Context context) {
        context.getClass();
        Resources resources = context.getResources();
        int i14 = this.f147435b;
        String quantityString = resources.getQuantityString(R.plurals.achievement_badge_point_format, i14, Integer.valueOf(i14));
        quantityString.getClass();
        return quantityString;
    }

    @Override // qt.a
    public final String b(Context context) {
        context.getClass();
        return a(context);
    }

    @Override // qt.a
    public final String c(Context context) {
        context.getClass();
        String quantityString = context.getResources().getQuantityString(R.plurals.achievement_badge_count, this.f147434a);
        quantityString.getClass();
        return quantityString;
    }

    @Override // qt.a
    public final String d() {
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(this.f147434a));
        str.getClass();
        return str;
    }

    @Override // qt.a
    public final String e() {
        return "icon_badges";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f147434a == cVar.f147434a && this.f147435b == cVar.f147435b && s.g(this.f147436c, cVar.f147436c);
    }

    public final int hashCode() {
        return this.f147436c.hashCode() + q2.d(this.f147435b, Integer.hashCode(this.f147434a) * 31, 31);
    }

    public final String toString() {
        return z.c(e5.j(this.f147434a, this.f147435b, "BadgeUIData(count=", ", points=", ", badgesId="), this.f147436c, ")");
    }
}
