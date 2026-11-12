package defpackage;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* JADX INFO: loaded from: classes21.dex */
public final class yb<F extends JacksonFeature> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f53320b;

    protected yb(int i) {
        this.f53320b = i;
    }

    public static <F extends JacksonFeature> yb<F> c(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                mask |= f.getMask();
            }
        }
        return new yb<>(mask);
    }

    public yb<F> c(F f) {
        int mask = f.getMask() | this.f53320b;
        return mask == this.f53320b ? this : new yb<>(mask);
    }

    public boolean a(F f) {
        return (f.getMask() & this.f53320b) != 0;
    }
}
