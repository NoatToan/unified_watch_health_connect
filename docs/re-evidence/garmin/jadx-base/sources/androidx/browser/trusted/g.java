package androidx.browser.trusted;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public static class a implements g {
        @Override // androidx.browser.trusted.g
        public final Bundle toBundle() {
            return am.j.e(0, "androidx.browser.trusted.displaymode.KEY_ID");
        }
    }

    public static class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5323b;

        public b(boolean z14, int i14) {
            this.f5322a = z14;
            this.f5323b = i14;
        }

        @Override // androidx.browser.trusted.g
        public final Bundle toBundle() {
            Bundle bundleE = am.j.e(1, "androidx.browser.trusted.displaymode.KEY_ID");
            bundleE.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f5322a);
            bundleE.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f5323b);
            return bundleE;
        }
    }

    Bundle toBundle();
}
