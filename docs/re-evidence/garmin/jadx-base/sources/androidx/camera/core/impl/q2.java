package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f5715a = new Range<>(0, 0);

    @AutoValue.Builder
    public static abstract class a {
    }

    public static q.b a(Size size) {
        q.b bVar = new q.b();
        bVar.c(size);
        bVar.f5706b = size;
        bVar.f5708d = 0;
        bVar.b(f5715a);
        b0.b0 b0Var = b0.b0.f13854d;
        if (b0Var == null) {
            j20.x.l("Null dynamicRange");
            return null;
        }
        bVar.f5707c = b0Var;
        bVar.f5711g = Boolean.FALSE;
        return bVar;
    }

    public abstract b0.b0 b();

    public abstract Range<Integer> c();

    public abstract x0 d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract q.b i();
}
