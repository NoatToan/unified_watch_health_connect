package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6444a;

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f6445a;

        public b(View view2) {
            this.f6445a = ScrollFeedbackProvider.createProvider(view2);
        }

        @Override // androidx.core.view.f0.d
        public final void onScrollLimit(int i14, int i15, int i16, boolean z14) {
            this.f6445a.onScrollLimit(i14, i15, i16, z14);
        }

        @Override // androidx.core.view.f0.d
        public final void onScrollProgress(int i14, int i15, int i16, int i17) {
            this.f6445a.onScrollProgress(i14, i15, i16, i17);
        }
    }

    public static class c implements d {
        private c() {
        }

        @Override // androidx.core.view.f0.d
        public final void onScrollLimit(int i14, int i15, int i16, boolean z14) {
        }

        @Override // androidx.core.view.f0.d
        public final void onScrollProgress(int i14, int i15, int i16, int i17) {
        }
    }

    public interface d {
        void onScrollLimit(int i14, int i15, int i16, boolean z14);

        void onScrollProgress(int i14, int i15, int i16, int i17);
    }

    private f0(View view2) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f6444a = new b(view2);
        } else {
            this.f6444a = new c();
        }
    }

    public static f0 a(NestedScrollView nestedScrollView) {
        return new f0(nestedScrollView);
    }
}
