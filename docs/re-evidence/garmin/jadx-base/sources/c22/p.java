package c22;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/p;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f23187a = new p();

    private p() {
    }

    public static final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            return arrayList.size() == arrayList2.size() && p005kotlin.jvm.internal.s.g(p13.h0.g1(arrayList), p13.h0.g1(arrayList2));
        }
        return p005kotlin.jvm.internal.s.g(arrayList, arrayList2);
    }

    public static ArrayList b(p1.z zVar) {
        ArrayList arrayList = new ArrayList();
        p1.a0 a0Var = new p1.a0(zVar);
        while (a0Var.hasNext()) {
            arrayList.add(a0Var.next());
        }
        return arrayList;
    }
}
