package qt;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqt/h;", "Lqt/a;", "", "count", "", "", "records", "<init>", "(ILjava/util/List;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f147450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147451c;

    public h(int i14, List<String> list) {
        list.getClass();
        this.f147449a = i14;
        this.f147450b = list;
        this.f147451c = " • ";
    }

    @Override // qt.a
    public final String a(Context context) {
        context.getClass();
        return h0.k0(this.f147450b, "\n", null, null, null, 62);
    }

    @Override // qt.a
    public final String b(Context context) {
        context.getClass();
        return h0.k0(this.f147450b, this.f147451c, null, null, null, 62);
    }

    @Override // qt.a
    public final String c(Context context) {
        context.getClass();
        String quantityString = context.getResources().getQuantityString(R.plurals.achievement_personal_record, this.f147449a);
        quantityString.getClass();
        return quantityString;
    }

    @Override // qt.a
    public final String d() {
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(this.f147449a));
        str.getClass();
        return str;
    }

    @Override // qt.a
    public final String e() {
        return "icon_prs";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f147449a == hVar.f147449a && s.g(this.f147450b, hVar.f147450b);
    }

    public final int hashCode() {
        return this.f147450b.hashCode() + (Integer.hashCode(this.f147449a) * 31);
    }

    public final String toString() {
        return "PersonalRecordUIData(count=" + this.f147449a + ", records=" + this.f147450b + ")";
    }
}
