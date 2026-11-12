package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;

/* JADX INFO: loaded from: classes8.dex */
public class m36 extends l36 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final ConstraintLayout D;
    public long E;

    public m36(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (TextView) objArr[1], (TextView) objArr[2]);
        this.E = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }

    public void C0(TabContentItem tabContentItem) {
        this.C = tabContentItem;
        synchronized (this) {
            this.E |= 4;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((MutableLiveData) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String value;
        int i;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        TabContentItem tabContentItem = this.C;
        String value2 = null;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                value = null;
            } else {
                MutableLiveData<String> remindText = tabContentItem != null ? tabContentItem.getRemindText() : null;
                w0(0, remindText);
                if (remindText != null) {
                    value = remindText.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 14) != 0) {
                MutableLiveData<String> title = tabContentItem != null ? tabContentItem.getTitle() : null;
                w0(1, title);
                if (title != null) {
                    value2 = title.getValue();
                }
            }
            long j2 = j & 12;
            if (j2 != 0) {
                boolean more = tabContentItem != null ? tabContentItem.getMore() : false;
                if (j2 != 0) {
                    j |= more ? 32L : 16L;
                }
                if (!more) {
                    i = 8;
                }
            }
            if ((14 & j) != 0) {
                r8p.b(this.A, value2);
            }
            if ((j & 13) != 0) {
                r8p.b(this.B, value);
            }
            if ((j & 12) != 0) {
                this.B.setVisibility(i);
            }
        }
        value = null;
        i = 0;
        if ((14 & j) != 0) {
            r8p.b(this.A, value2);
        }
        if ((j & 13) != 0) {
            r8p.b(this.B, value);
        }
        if ((j & 12) != 0) {
            this.B.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        C0((TabContentItem) obj);
        return true;
    }

    public m36(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
