package xm0;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.x0;
import com.google.android.material.tabs.TabLayout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabLayout f191330a;

    public b(TabLayout tabLayout) {
        this.f191330a = tabLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        TabLayout.TabView tabView;
        view2.removeOnLayoutChangeListener(this);
        TabLayout tabLayout = this.f191330a;
        int tabCount = tabLayout.getTabCount();
        if (tabCount < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            Typeface typefaceA = h22.a.a("font/roboto_medium.ttf", tabLayout.getContext());
            TabLayout.Tab tabAt = tabLayout.getTabAt(i26);
            if (tabAt != null && (tabView = tabAt.f53250view) != null) {
                for (View view3 : new x0(tabView)) {
                    if (view3 instanceof TextView) {
                        ((TextView) view3).setTypeface(typefaceA);
                    }
                }
            }
            if (i26 == tabCount) {
                return;
            } else {
                i26++;
            }
        }
    }
}
