package androidx.camera.core.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<y> f5878a = Collections.unmodifiableSet(EnumSet.of(y.PASSIVE_FOCUSED, y.PASSIVE_NOT_FOCUSED, y.LOCKED_FOCUSED, y.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<a0> f5879b = Collections.unmodifiableSet(EnumSet.of(a0.CONVERGED, a0.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<w> f5880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<w> f5881d;

    static {
        w wVar = w.CONVERGED;
        w wVar2 = w.FLASH_REQUIRED;
        w wVar3 = w.UNKNOWN;
        Set<w> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(wVar, wVar2, wVar3));
        f5880c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(wVar2);
        enumSetCopyOf.remove(wVar3);
        f5881d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    private z0() {
    }
}
