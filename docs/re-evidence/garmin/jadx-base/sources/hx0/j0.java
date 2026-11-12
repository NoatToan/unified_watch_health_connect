package hx0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lhx0/j0;", "Lhx0/d0;", "", "iconWidth", "Ljava/util/ArrayList;", "Lhx0/b0;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.ITEMS, "Lhx0/n0;", "onSymptomsSelectedListener", "<init>", "(DLjava/util/ArrayList;Lhx0/n0;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f86090g = new a(null);

    public j0(double d14, ArrayList<b0> arrayList, n0 n0Var) {
        f86090g.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && (!arrayList.isEmpty())) {
            int iCeil = (int) Math.ceil(((double) arrayList.size()) / ((double) 2));
            int i14 = 0;
            List<b0> listSubList = arrayList.subList(0, iCeil);
            listSubList.getClass();
            List<b0> listSubList2 = arrayList.subList(iCeil, arrayList.size());
            listSubList2.getClass();
            for (Object obj : listSubList) {
                int i15 = i14 + 1;
                obj.getClass();
                arrayList2.add((b0) obj);
                if (i14 < listSubList2.size()) {
                    arrayList2.add(listSubList2.get(i14));
                }
                i14 = i15;
            }
        }
        super(true, d14, arrayList2, null, n0Var, 8, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhx0/j0$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ j0(double d14, ArrayList arrayList, n0 n0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, arrayList, (i14 & 4) != 0 ? null : n0Var);
    }
}
