package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerModel;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerViewModel;

/* JADX INFO: loaded from: classes10.dex */
public class ex8 extends dx8 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout E;
    public final ImageView F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(isi.y1, 4);
    }

    public ex8(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (TextView) objArr[3], (ConstraintLayout) objArr[1], (RecyclerView) objArr[4]);
        this.G = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.F = imageView;
        imageView.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.G |= 2;
        }
        return true;
    }

    public final boolean B0(ObservableInt observableInt, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public void C0(FaceEditPhotoPickerViewModel faceEditPhotoPickerViewModel) {
        this.D = faceEditPhotoPickerViewModel;
        synchronized (this) {
            this.G |= 4;
        }
        notifyPropertyChanged(tv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((ObservableInt) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return A0((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        boolean z;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        FaceEditPhotoPickerViewModel faceEditPhotoPickerViewModel = this.D;
        boolean z2 = false;
        i = 0;
        int i2 = 0;
        if ((15 & j) != 0) {
            FaceEditPhotoPickerModel mModel = faceEditPhotoPickerViewModel != null ? faceEditPhotoPickerViewModel.getMModel() : null;
            if ((j & 13) == 0) {
                z = false;
            } else {
                ObservableInt intentDeleteSize = mModel != null ? mModel.getIntentDeleteSize() : null;
                x0(0, intentDeleteSize);
                if (intentDeleteSize == null || intentDeleteSize.get() == 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            long j2 = j & 14;
            if (j2 != 0) {
                ObservableBoolean editMode = mModel != null ? mModel.getEditMode() : null;
                x0(1, editMode);
                boolean z3 = editMode != null ? editMode.get() : false;
                if (j2 != 0) {
                    j |= z3 ? 32L : 16L;
                }
                if (!z3) {
                    i2 = 8;
                }
            }
            i = i2;
            z2 = z;
        } else {
            i = 0;
        }
        if ((13 & j) != 0) {
            this.A.setEnabled(z2);
            this.B.setEnabled(z2);
            this.F.setEnabled(z2);
        }
        if ((j & 14) != 0) {
            this.B.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        C0((FaceEditPhotoPickerViewModel) obj);
        return true;
    }

    public ex8(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
