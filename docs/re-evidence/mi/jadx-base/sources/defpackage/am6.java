package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class am6 extends ViewDataBinding {
    public final AppCompatImageButton A;
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageButton D;
    public final AppCompatImageButton E;
    public final RecyclerView F;
    public final Toolbar G;
    public final TextView H;
    public MusicSettingsViewModel I;

    public am6(Object obj, View view, int i, AppCompatImageButton appCompatImageButton, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageButton appCompatImageButton2, AppCompatImageButton appCompatImageButton3, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        super(obj, view, i);
        this.A = appCompatImageButton;
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageButton2;
        this.E = appCompatImageButton3;
        this.F = recyclerView;
        this.G = toolbar;
        this.H = textView;
    }
}
