package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.bindingadapter.BindingAdapters;
import com.xiaomi.fitness.device.manager.export.bean.TabContentSwitchItem;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;

/* JADX INFO: loaded from: classes8.dex */
public class g86 extends f86 implements v7h.a {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public final ISwitchButton.a C;
    public long D;

    public g86(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (SwitchButtonBindingTwoLineTextView) objArr[0]);
        this.D = -1L;
        this.A.setTag(null);
        o0(view);
        this.C = new v7h(this, 1);
        H();
    }

    private boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.D |= 2;
        }
        return true;
    }

    private boolean C0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.D |= 4;
        }
        return true;
    }

    public void D0(TabContentSwitchItem tabContentSwitchItem) {
        this.B = tabContentSwitchItem;
        synchronized (this) {
            this.D |= 8;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 16L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return C0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return B0((MutableLiveData) obj, i2);
    }

    @Override // v7h.a
    public final void c(int i, boolean z, ISwitchButton iSwitchButton) {
        TabContentSwitchItem tabContentSwitchItem = this.B;
        if (tabContentSwitchItem != null) {
            tabContentSwitchItem.handleSwitchChanged(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String value;
        String value2;
        boolean zJ0;
        int i;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        TabContentSwitchItem tabContentSwitchItem = this.B;
        if ((31 & j) != 0) {
            if ((j & 25) == 0) {
                value = null;
            } else {
                MutableLiveData<String> title = tabContentSwitchItem != null ? tabContentSwitchItem.getTitle() : null;
                w0(0, title);
                if (title != null) {
                    value = title.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 26) == 0) {
                value2 = null;
            } else {
                MutableLiveData<String> subtitle = tabContentSwitchItem != null ? tabContentSwitchItem.getSubtitle() : null;
                w0(1, subtitle);
                if (subtitle != null) {
                    value2 = subtitle.getValue();
                } else {
                    value2 = null;
                }
            }
            int icon = ((j & 24) == 0 || tabContentSwitchItem == null) ? 0 : tabContentSwitchItem.getIcon();
            if ((j & 28) != 0) {
                MutableLiveData<Boolean> switchOn = tabContentSwitchItem != null ? tabContentSwitchItem.getSwitchOn() : null;
                w0(2, switchOn);
                zJ0 = ViewDataBinding.j0(switchOn != null ? switchOn.getValue() : null);
                i = icon;
            } else {
                i = icon;
                zJ0 = false;
            }
        } else {
            value = null;
            value2 = null;
            zJ0 = false;
            i = 0;
        }
        if ((24 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setIcon(this.A, i);
        }
        if ((j & 26) != 0) {
            SwitchButtonBindingTwoLineTextView.setSubtitle(this.A, value2);
        }
        if ((16 & j) != 0) {
            BindingAdapters.setOnSwitchChangedListener(this.A, this.C);
        }
        if ((28 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, zJ0);
        }
        if ((j & 25) != 0) {
            SwitchButtonBindingTwoLineTextView.setTitle(this.A, value);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        D0((TabContentSwitchItem) obj);
        return true;
    }

    public g86(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, E, F));
    }
}
