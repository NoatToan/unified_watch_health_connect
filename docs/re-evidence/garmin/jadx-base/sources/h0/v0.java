package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f80582b;

    public interface a {
    }

    public v0() {
        this.f80581a = new p0.a().f134643a == null ? 0 : 1;
        this.f80582b = new HashMap();
    }

    public abstract Executor a();

    public abstract int b();

    public abstract Rect c();

    public abstract b0.l0.f d();

    public abstract int e();

    public abstract b0.l0.g f();

    public abstract b0.l0.h g();

    public abstract int h();

    public abstract b0.l0.h i();

    public abstract Matrix j();

    public abstract List<androidx.camera.core.impl.s> k();

    public final boolean l() {
        Iterator it = this.f80582b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean m();

    public final void n(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap map = this.f80582b;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i14), Boolean.TRUE);
        }
    }
}
