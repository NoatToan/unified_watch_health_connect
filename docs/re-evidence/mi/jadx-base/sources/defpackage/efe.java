package defpackage;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class efe implements bh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16589b;

    public efe(int i) {
        this.f16589b = i;
    }

    @Override // defpackage.bh3
    public List<ch3> b(List<ch3> list) {
        ArrayList arrayList = new ArrayList();
        for (ch3 ch3Var : list) {
            g6i.b(ch3Var instanceof dh3, "The camera info doesn't contain internal implementation.");
            Integer numB = ((dh3) ch3Var).b();
            if (numB != null && numB.intValue() == this.f16589b) {
                arrayList.add(ch3Var);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f16589b;
    }
}
