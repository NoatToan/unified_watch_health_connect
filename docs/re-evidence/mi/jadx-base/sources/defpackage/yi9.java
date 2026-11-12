package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.history.DialogueInfo;

/* JADX INFO: loaded from: classes8.dex */
public class yi9 extends xi9 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(cri.p, 4);
    }

    public yi9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1], (View) objArr[4]);
        this.G = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(DialogueInfo dialogueInfo) {
        this.E = dialogueInfo;
        synchronized (this) {
            this.G |= 1;
        }
        notifyPropertyChanged(bv1.c);
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
            this.G = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String title;
        String content;
        String date;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        DialogueInfo dialogueInfo = this.E;
        long j2 = j & 3;
        if (j2 == 0 || dialogueInfo == null) {
            title = null;
            content = null;
            date = null;
        } else {
            title = dialogueInfo.getTitle();
            content = dialogueInfo.getContent();
            date = dialogueInfo.getDate();
        }
        if (j2 != 0) {
            r8p.b(this.A, content);
            r8p.b(this.B, date);
            r8p.b(this.C, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.c != i) {
            return false;
        }
        A0((DialogueInfo) obj);
        return true;
    }

    public yi9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
