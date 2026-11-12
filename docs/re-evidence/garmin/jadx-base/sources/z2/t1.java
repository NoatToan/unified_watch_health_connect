package z2;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class t1 implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f201801a = new t1();

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            f5.v1 v1VarQ = list.get(i14).Q(j8);
            iMax = Math.max(iMax, v1VarQ.f69144a);
            iMax2 = Math.max(iMax2, v1VarQ.f69145b);
            arrayList.add(v1VarQ);
        }
        return f5.b1.h0(b1Var, iMax, iMax2, new com.garmin.android.apps.connectmobile.workouts.data.model.g0(9, arrayList));
    }
}
