package ne;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.d0;
import p13.h0;
import p13.x;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lne/a;", "", "", "minWidthDp", "minHeightDp", "<init>", "(II)V", "", "widthDp", "heightDp", "(FF)V", "a", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<Integer> f125414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Integer> f125415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<Integer> f125416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<a> f125417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<a> f125418g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125420b;

    static {
        C2416a c2416a = new C2416a(null);
        List<Integer> listK = x.k(0, 600, 840);
        f125414c = listK;
        ArrayList arrayListC0 = h0.C0(listK, x.k(1200, 1600));
        List<Integer> listK2 = x.k(0, 480, 900);
        f125415d = listK2;
        f125416e = listK2;
        f125417f = C2416a.a(c2416a, listK, listK2);
        f125418g = C2416a.a(c2416a, arrayListC0, listK2);
    }

    public a(int i14, int i15) {
        this.f125419a = i14;
        this.f125420b = i15;
        if (i14 < 0) {
            h.x(e0.i("Expected minWidthDp to be at least 0, minWidthDp: ", i14, '.'));
            throw null;
        }
        if (i15 >= 0) {
            return;
        }
        h.x(e0.i("Expected minHeightDp to be at least 0, minHeightDp: ", i15, '.'));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f125419a == aVar.f125419a && this.f125420b == aVar.f125420b;
    }

    public final int hashCode() {
        return (this.f125419a * 31) + this.f125420b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb3.append(this.f125419a);
        sb3.append(", minHeightDp=");
        return e0.j(sb3, this.f125420b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX INFO: renamed from: ne.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lne/a$a;", "", "<init>", "()V", "", "WIDTH_DP_MEDIUM_LOWER_BOUND", "I", "WIDTH_DP_EXPANDED_LOWER_BOUND", "WIDTH_DP_LARGE_LOWER_BOUND", "WIDTH_DP_EXTRA_LARGE_LOWER_BOUND", "HEIGHT_DP_MEDIUM_LOWER_BOUND", "HEIGHT_DP_EXPANDED_LOWER_BOUND", "", "WIDTH_DP_BREAKPOINTS_V1", "Ljava/util/List;", "WIDTH_DP_BREAKPOINTS_V2", "HEIGHT_DP_BREAKPOINTS_V1", "HEIGHT_DP_BREAKPOINTS_V2", "", "Lne/a;", "BREAKPOINTS_V1", "Ljava/util/Set;", "BREAKPOINTS_V2", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2416a {
        public /* synthetic */ C2416a(j jVar) {
            this();
        }

        public static final Set a(C2416a c2416a, List list, List list2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new a(iIntValue, ((Number) it3.next()).intValue()));
                }
                d0.v(arrayList, arrayList2);
            }
            return h0.g1(arrayList);
        }

        private C2416a() {
        }
    }

    public a(float f14, float f15) {
        this((int) f14, (int) f15);
    }
}
