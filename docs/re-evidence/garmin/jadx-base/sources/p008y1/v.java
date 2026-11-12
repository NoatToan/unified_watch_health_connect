package p008y1;

import android.view.ViewConfiguration;
import b5.a0;
import b5.q;
import java.util.List;
import n4.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly1/v;", "Ly1/g2;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f193679a;

    public v(ViewConfiguration viewConfiguration) {
        this.f193679a = viewConfiguration;
    }

    @Override // p008y1.g2
    public final long a(q qVar) {
        z3.f193768a.getClass();
        ViewConfiguration viewConfiguration = this.f193679a;
        float f14 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f15 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List<a0> list = qVar.f15870a;
        c.f123541b.getClass();
        c cVarA = c.a(0L);
        int size = list.size();
        int i14 = 0;
        while (true) {
            long j8 = cVarA.f123544a;
            if (i14 >= size) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * f15;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * f14;
                return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            }
            cVarA = c.a(c.j(j8, list.get(i14).f15757j));
            i14++;
        }
    }
}
