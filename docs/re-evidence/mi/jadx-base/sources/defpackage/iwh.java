package defpackage;

import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iwh extends fu3<cwc> {
    public float A() {
        float y = 0.0f;
        for (int i = 0; i < y().O0(); i++) {
            y += y().i(i).getY();
        }
        return y;
    }

    @Override // defpackage.fu3
    public List<cwc> l() {
        List<cwc> listL = super.l();
        listL.size();
        return listL;
    }

    @Override // defpackage.fu3
    public Entry n(r7c r7cVar) {
        return y().i((int) r7cVar.h());
    }

    public cwc y() {
        return (cwc) this.i.get(0);
    }

    @Override // defpackage.fu3
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public cwc i(int i) {
        if (i == 0) {
            return y();
        }
        return null;
    }
}
