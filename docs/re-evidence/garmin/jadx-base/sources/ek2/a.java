package ek2;

import am.j;
import android.bluetooth.le.ScanFilter;
import com.garmin.android.apps.connectmobile.f3;
import fk2.d;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB3\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lek2/a;", "", "", "Lfk2/d;", "rules", "Landroid/bluetooth/le/ScanFilter;", "nativeFilters", "", "scanMode", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1367a f64509d = new C1367a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f64510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ScanFilter> f64511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64512c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends d> list, List<ScanFilter> list2, int i14) {
        list.getClass();
        list2.getClass();
        this.f64510a = list;
        this.f64511b = list2;
        this.f64512c = i14;
        if (list.isEmpty()) {
            h.s("Must supply at least one rule");
            throw null;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).getF71939b() < 0) {
                    h.s("All rules must have non-negative threshold seconds");
                    throw null;
                }
            }
        }
        List<d> list3 = this.f64510a;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                if (((d) it3.next()).getF71939b() > 30) {
                    h.s("All rules must be active at 30 seconds");
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f64510a, aVar.f64510a) && s.g(this.f64511b, aVar.f64511b) && this.f64512c == aVar.f64512c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64512c) + u0.b(this.f64510a.hashCode() * 31, 31, this.f64511b);
    }

    public final String toString() {
        return j.q(f3.k("DiscoveryCriteria(rules=", ", nativeFilters=", ", scanMode=", this.f64510a, this.f64511b), this.f64512c, ")");
    }

    /* JADX INFO: renamed from: ek2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lek2/a$a;", "", "<init>", "()V", "", "NO_THRESHOLD_TIME", "J", "SECOND_RULE_THRESHOLD_TIME", "SHORT_THRESHOLD_TIME", "MEDIUM_THRESHOLD_TIME", "LONG_THRESHOLD_TIME", "MAX_THRESHOLD_TIME", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1367a {
        public /* synthetic */ C1367a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1367a() {
        }
    }

    public a() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(List list, List list2, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            fk2.a.f71937e.getClass();
            list = w.c(new fk2.a(new fh0.b(9), 0L, null, 4, null));
        }
        list2 = (i15 & 2) != 0 ? j0.f134944a : list2;
        if ((i15 & 4) != 0) {
            f64509d.getClass();
            gk2.a.f77746a.getClass();
            i14 = 2;
        }
        this(list, list2, i14);
    }
}
