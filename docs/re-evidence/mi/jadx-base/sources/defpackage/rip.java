package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.d;
import androidx.transition.c;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class rip extends b00 {
    public final WeakReference<Toolbar> f;

    public rip(Toolbar toolbar, ze1 ze1Var) {
        super(toolbar.getContext(), ze1Var);
        this.f = new WeakReference<>(toolbar);
    }

    @Override // defpackage.b00, androidx.navigation.NavController.b
    public void a(NavController navController, d dVar, Bundle bundle) {
        if (this.f.get() == null) {
            navController.removeOnDestinationChangedListener(this);
        } else {
            super.a(navController, dVar, bundle);
        }
    }

    @Override // defpackage.b00
    public void c(Drawable drawable, int i) {
        Toolbar toolbar = this.f.get();
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
        this.f.get().setTitle(charSequence);
    }
}
