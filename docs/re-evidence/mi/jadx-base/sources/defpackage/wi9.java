package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.bugreport.DeviceData;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.widget.SquareBindingImageView;

/* JADX INFO: loaded from: classes8.dex */
public class wi9 extends vi9 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final LinearLayout D;
    public long E;

    public wi9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SquareBindingImageView) objArr[1], (TextView) objArr[2]);
        this.E = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(FeedbackItemInfo feedbackItemInfo) {
        this.C = feedbackItemInfo;
        synchronized (this) {
            this.E |= 1;
        }
        notifyPropertyChanged(bv1.c);
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
            this.E = 2L;
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
        DeviceData deviceData;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        FeedbackItemInfo feedbackItemInfo = this.C;
        long j2 = j & 3;
        String bigIcon = null;
        if (j2 != 0) {
            if (feedbackItemInfo != null) {
                title = feedbackItemInfo.getTitle();
                deviceData = feedbackItemInfo.getDeviceData();
            } else {
                title = null;
                deviceData = null;
            }
            if (deviceData != null) {
                bigIcon = deviceData.getBigIcon();
            }
        } else {
            title = null;
        }
        if (j2 != 0) {
            SquareBindingImageView.setSrc(this.A, bigIcon);
            r8p.b(this.B, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.c != i) {
            return false;
        }
        A0((FeedbackItemInfo) obj);
        return true;
    }

    public wi9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
