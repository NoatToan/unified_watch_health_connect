package androidx.camera.core.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Class<? extends e2>> f5550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Class<? extends e2>> f5551c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5552a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashSet f5553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashSet f5554c;
    }

    private f2(boolean z14, Set<Class<? extends e2>> set, Set<Class<? extends e2>> set2) {
        this.f5549a = z14;
        this.f5550b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f5551c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }

    public final boolean a(Class<? extends e2> cls, boolean z14) {
        if (this.f5550b.contains(cls)) {
            return true;
        }
        return !this.f5551c.contains(cls) && this.f5549a && z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        f2 f2Var = (f2) obj;
        return this.f5549a == f2Var.f5549a && Objects.equals(this.f5550b, f2Var.f5550b) && Objects.equals(this.f5551c, f2Var.f5551c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f5549a), this.f5550b, this.f5551c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f5549a + ", forceEnabledQuirks=" + this.f5550b + ", forceDisabledQuirks=" + this.f5551c + CoreConstants.CURLY_RIGHT;
    }
}
