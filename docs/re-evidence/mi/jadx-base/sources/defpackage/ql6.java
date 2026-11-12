package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ql6 extends ViewDataBinding {
    public final AppCompatImageButton A;
    public final TextView B;
    public final DividerView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final AppCompatImageButton F;
    public final AppCompatCheckedTextView G;
    public final ConstraintLayout H;
    public final TextView I;
    public final RecyclerView J;
    public final Toolbar K;
    public final TextView L;
    public MusicSettingsViewModel M;

    public ql6(Object obj, View view, int i, AppCompatImageButton appCompatImageButton, TextView textView, DividerView dividerView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageButton appCompatImageButton2, AppCompatCheckedTextView appCompatCheckedTextView, ConstraintLayout constraintLayout2, TextView textView2, RecyclerView recyclerView, Toolbar toolbar, TextView textView3) {
        super(obj, view, i);
        this.A = appCompatImageButton;
        this.B = textView;
        this.C = dividerView;
        this.D = constraintLayout;
        this.E = appCompatImageView;
        this.F = appCompatImageButton2;
        this.G = appCompatCheckedTextView;
        this.H = constraintLayout2;
        this.I = textView2;
        this.J = recyclerView;
        this.K = toolbar;
        this.L = textView3;
    }
}
