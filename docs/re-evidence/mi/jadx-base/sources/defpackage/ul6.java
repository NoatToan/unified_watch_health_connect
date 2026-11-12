package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSong;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ul6 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final AppCompatCheckedTextView C;
    public AddSong D;

    public ul6(Object obj, View view, int i, TextView textView, TextView textView2, AppCompatCheckedTextView appCompatCheckedTextView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = appCompatCheckedTextView;
    }

    public static ul6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ul6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ul6) ViewDataBinding.G(layoutInflater, eui.I1, viewGroup, z, obj);
    }

    public abstract void C0(AddSong addSong);
}
