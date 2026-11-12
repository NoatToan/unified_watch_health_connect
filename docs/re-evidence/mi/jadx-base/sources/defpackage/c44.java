package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.d;
import androidx.transition.c;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c44 extends b00 {
    public final WeakReference<CollapsingToolbarLayout> f;
    public final WeakReference<Toolbar> g;

    public c44(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, ze1 ze1Var) {
        super(collapsingToolbarLayout.getContext(), ze1Var);
        this.f = new WeakReference<>(collapsingToolbarLayout);
        this.g = new WeakReference<>(toolbar);
    }

    @Override // defpackage.b00, androidx.navigation.NavController.b
    public void a(NavController navController, d dVar, Bundle bundle) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f.get();
        Toolbar toolbar = this.g.get();
        if (collapsingToolbarLayout == null || toolbar == null) {
            navController.removeOnDestinationChangedListener(this);
        } else {
            super.a(navController, dVar, bundle);
        }
    }

    @Override // defpackage.b00
    public void c(Drawable drawable, int i) {
        Toolbar toolbar = this.g.get();
        if (toolbar != null) {
            boolean z = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                c.a(toolbar);
            }
        }
    }

    @Override // defpackage.b00
    public void d(CharSequence charSequence) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f.get();
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(charSequence);
        }
    }
}
