package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class hb1 implements sb1<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e1e<PointF>> f19896a;

    public hb1(List<e1e<PointF>> list) {
        this.f19896a = list;
    }

    @Override // defpackage.sb1
    public o82<PointF, PointF> a() {
        return this.f19896a.get(0).i() ? new s2i(this.f19896a) : new vlh(this.f19896a);
    }

    @Override // defpackage.sb1
    public List<e1e<PointF>> b() {
        return this.f19896a;
    }

    @Override // defpackage.sb1
    public boolean isStatic() {
        return this.f19896a.size() == 1 && this.f19896a.get(0).i();
    }
}
