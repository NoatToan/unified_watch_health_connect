package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class jd0 extends b00 {
    public final AppCompatActivity f;

    public jd0(AppCompatActivity appCompatActivity, ze1 ze1Var) {
        super(appCompatActivity.getDrawerToggleDelegate().a(), ze1Var);
        this.f = appCompatActivity;
    }

    @Override // defpackage.b00
    public void c(Drawable drawable, int i) {
        ActionBar supportActionBar = this.f.getSupportActionBar();
        if (drawable == null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        } else {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            this.f.getDrawerToggleDelegate().b(drawable, i);
        }
    }

    @Override // defpackage.b00
    public void d(CharSequence charSequence) {
        this.f.getSupportActionBar().setTitle(charSequence);
    }
}
