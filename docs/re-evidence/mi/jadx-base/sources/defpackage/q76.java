package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class q76 extends p76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public q76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (RightArrowBindingTwoLineTextView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    private boolean C0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
    }

    private boolean D0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public void E0(TabContentItem tabContentItem) {
        this.B = tabContentItem;
        synchronized (this) {
            this.C |= 16;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 32L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return B0((MutableLiveData) obj, i2);
        }
        if (i == 2) {
            return D0((MutableLiveData) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return C0((MutableLiveData) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        boolean more;
        String str;
        int i;
        String value;
        String str2;
        String str3;
        String value2;
        String value3;
        long j2;
        String value4;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        TabContentItem tabContentItem = this.B;
        if ((63 & j) != 0) {
            if ((j & 49) == 0) {
                value2 = null;
            } else {
                MutableLiveData<String> remindText = tabContentItem != null ? tabContentItem.getRemindText() : null;
                w0(0, remindText);
                if (remindText != null) {
                    value2 = remindText.getValue();
                } else {
                    value2 = null;
                }
            }
            if ((j & 50) == 0) {
                value3 = null;
            } else {
                MutableLiveData<String> rightTextWithDot = tabContentItem != null ? tabContentItem.getRightTextWithDot() : null;
                w0(1, rightTextWithDot);
                if (rightTextWithDot != null) {
                    value3 = rightTextWithDot.getValue();
                } else {
                    value3 = null;
                }
            }
            if ((j & 52) == 0) {
                value = null;
            } else {
                MutableLiveData<String> title = tabContentItem != null ? tabContentItem.getTitle() : null;
                w0(2, title);
                if (title != null) {
                    value = title.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 56) == 0) {
                j2 = 48;
                value4 = null;
            } else {
                MutableLiveData<String> subtitle = tabContentItem != null ? tabContentItem.getSubtitle() : null;
                w0(3, subtitle);
                if (subtitle != null) {
                    value4 = subtitle.getValue();
                    j2 = 48;
                } else {
                    j2 = 48;
                    value4 = null;
                }
            }
            if ((j & j2) == 0 || tabContentItem == null) {
                str2 = value2;
                str3 = value3;
                str = value4;
                more = false;
                i = 0;
            } else {
                int icon = tabContentItem.getIcon();
                more = tabContentItem.getMore();
                str3 = value3;
                i = icon;
                str2 = value2;
                str = value4;
            }
        } else {
            more = false;
            str = null;
            i = 0;
            value = null;
            str2 = null;
            str3 = null;
        }
        if ((52 & j) != 0) {
            RightArrowBindingTwoLineTextView.setTitle(this.A, value);
        }
        if ((j & 56) != 0) {
            RightArrowBindingTwoLineTextView.setSubtitle(this.A, str);
        }
        if ((48 & j) != 0) {
            RightArrowBindingTwoLineTextView.setIcon(this.A, i);
            RightArrowBindingTwoLineTextView.showMore(this.A, more);
        }
        if ((j & 49) != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.A, str2);
        }
        if ((j & 50) != 0) {
            RightArrowBindingTwoLineTextView.rightTextWithDot(this.A, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        E0((TabContentItem) obj);
        return true;
    }

    public q76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
