package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fu4 extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;

    public fu4(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
    }

    public static fu4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static fu4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fu4) ViewDataBinding.G(layoutInflater, sti.course_layout_audio_content, viewGroup, z, obj);
    }
}
