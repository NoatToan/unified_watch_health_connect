package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.main.MainViewModel;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j1f extends ViewDataBinding {
    public final FrameLayout A;
    public final TabLayout B;
    public MainViewModel C;

    public j1f(Object obj, View view, int i, FrameLayout frameLayout, TabLayout tabLayout) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = tabLayout;
    }
}
