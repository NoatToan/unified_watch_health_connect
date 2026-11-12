package mv1;

import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import wr.g;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lmv1/f;", "", "Lwt1/q;", "day", "", "subtext", "", "isChecked", Constants.ENABLE_DISABLE, "<init>", "(Lwt1/q;Ljava/lang/String;ZZ)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f121191e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f121192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f121195d;

    public f(q qVar, String str, boolean z14, boolean z15) {
        qVar.getClass();
        str.getClass();
        this.f121192a = qVar;
        this.f121193b = str;
        this.f121194c = z14;
        this.f121195d = z15;
    }

    public static f a(f fVar, boolean z14) {
        q qVar = fVar.f121192a;
        String str = fVar.f121193b;
        boolean z15 = fVar.f121195d;
        fVar.getClass();
        return new f(qVar, str, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f121192a == fVar.f121192a && this.f121193b.equals(fVar.f121193b) && this.f121194c == fVar.f121194c && this.f121195d == fVar.f121195d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121195d) + q6.f.g(g.j(this.f121192a.hashCode() * 31, 31, this.f121193b), 31, this.f121194c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingDaysUIModel(day=");
        sb3.append(this.f121192a);
        sb3.append(", subtext=");
        sb3.append(this.f121193b);
        sb3.append(", isChecked=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isEnabled=", ")", sb3, this.f121194c, this.f121195d);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmv1/f$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static boolean a(int i14, List list) {
            list.getClass();
            int size = list.size();
            boolean z14 = false;
            ArrayList arrayListI1 = h0.i1(h0.b1(h0.C0(list, list)), i14 + 1, 1, false);
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj : arrayListI1) {
                if (((List) obj).size() <= size) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                z14 = true;
            } else {
                for (List list2 : arrayList) {
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (!((f) it.next()).f121194c);
                    }
                }
                z14 = true;
            }
            return !z14;
        }

        private a() {
        }
    }
}
