package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class e {
    public abstract List<c3.b> a();

    public abstract b0.b0 b();

    public abstract int c();

    public abstract x0 d();

    public abstract int e();

    public abstract Size f();

    public abstract t2 g();

    public abstract Range<Integer> h();

    public abstract boolean i();

    public final q2 j(u.a aVar) {
        q.b bVarA = q2.a(f());
        bVarA.f5708d = Integer.valueOf(e());
        bVarA.b(h());
        b0.b0 b0VarB = b();
        if (b0VarB == null) {
            j20.x.l("Null dynamicRange");
            return null;
        }
        bVarA.f5707c = b0VarB;
        bVarA.f5710f = aVar;
        return bVarA.a();
    }
}
