package defpackage;

import com.facebook.yoga.YogaNative;

/* JADX INFO: loaded from: classes4.dex */
public class i0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20656a;

    public i0s() {
        long jJni_YGConfigNew = YogaNative.jni_YGConfigNew();
        this.f20656a = jJni_YGConfigNew;
        if (jJni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public void a(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactor(this.f20656a, f);
    }

    public void b(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviour(this.f20656a, z);
    }

    public void finalize() throws Throwable {
        try {
            YogaNative.jni_YGConfigFree(this.f20656a);
        } finally {
            super.finalize();
        }
    }
}
