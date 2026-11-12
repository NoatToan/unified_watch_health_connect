package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSongList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pd6 extends ViewDataBinding {
    public final TextView A;
    public final AppCompatCheckedTextView B;
    public final ConstraintLayout C;
    public AddSongList D;

    public pd6(Object obj, View view, int i, TextView textView, AppCompatCheckedTextView appCompatCheckedTextView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = appCompatCheckedTextView;
        this.C = constraintLayout;
    }

    public static pd6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static pd6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (pd6) ViewDataBinding.G(layoutInflater, eui.f17079k, viewGroup, z, obj);
    }

    public abstract void C0(AddSongList addSongList);
}
