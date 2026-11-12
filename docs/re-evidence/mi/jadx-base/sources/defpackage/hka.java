package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hka extends ViewDataBinding {
    public final AppBarLayout A;
    public final FrameLayout B;
    public final TitleBarAlphaView C;

    public hka(Object obj, View view, int i, AppBarLayout appBarLayout, FrameLayout frameLayout, TitleBarAlphaView titleBarAlphaView) {
        super(obj, view, i);
        this.A = appBarLayout;
        this.B = frameLayout;
        this.C = titleBarAlphaView;
    }
}
