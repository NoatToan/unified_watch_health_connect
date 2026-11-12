package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerViewModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dx8 extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final RecyclerView C;
    public FaceEditPhotoPickerViewModel D;

    public dx8(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = recyclerView;
    }
}
