package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.m;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class hem implements o5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19986b;

    public hem(m mVar, String str) {
        q4d q4dVarH = mVar.H();
        if (q4dVarH == null) {
            throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        Integer num = (Integer) q4dVarH.a().c(str);
        if (num == null) {
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        this.f19985a = num.intValue();
        this.f19986b = mVar;
    }

    @Override // defpackage.o5d
    public List<Integer> a() {
        return Collections.singletonList(Integer.valueOf(this.f19985a));
    }

    @Override // defpackage.o5d
    public lhe<m> b(int i) {
        return i != this.f19985a ? oua.f(new IllegalArgumentException("Capture id does not exist in the bundle")) : oua.h(this.f19986b);
    }

    public void c() {
        this.f19986b.close();
    }
}
