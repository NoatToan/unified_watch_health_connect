package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class btq extends zsq {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(zri.B0, 14);
    }

    public btq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[11], (ImageView) objArr[14], (LinearLayout) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[7], (ConstraintLayout) objArr[10]);
        this.Q = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[12];
        this.I = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[13];
        this.J = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[2];
        this.K = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[3];
        this.L = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[5];
        this.M = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[6];
        this.N = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[8];
        this.O = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[9];
        this.P = textView8;
        textView8.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        o0(view);
        H();
    }

    public void A0(List<SportingItemData> list) {
        this.G = list;
        synchronized (this) {
            this.Q |= 1;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 2L;
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
        String str;
        String str2;
        String str3;
        String str4;
        String dataDes;
        String data;
        String dataDes2;
        int i;
        int i2;
        int i3;
        int i4;
        String str5;
        SportingItemData sportingItemData;
        SportingItemData sportingItemData2;
        SportingItemData sportingItemData3;
        SportingItemData sportingItemData4;
        String data2;
        String data3;
        String other;
        String dataDes3;
        String dataDes4;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        List<SportingItemData> list = this.G;
        long j2 = j & 3;
        String data4 = null;
        if (j2 != 0) {
            if (list != null) {
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData3 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 2);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
                sportingItemData3 = null;
                sportingItemData4 = null;
            }
            if (sportingItemData2 != null) {
                dataDes2 = sportingItemData2.getDataDes();
                data2 = sportingItemData2.getData();
            } else {
                dataDes2 = null;
                data2 = null;
            }
            boolean z = sportingItemData2 == null;
            boolean z2 = sportingItemData3 == null;
            boolean z3 = sportingItemData4 == null;
            boolean z4 = sportingItemData == null;
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if ((j & 3) != 0) {
                j |= z2 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= z3 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= z4 ? 32L : 16L;
            }
            if (sportingItemData3 != null) {
                data3 = sportingItemData3.getData();
                other = sportingItemData3.getOther();
                dataDes = sportingItemData3.getDataDes();
            } else {
                data3 = null;
                dataDes = null;
                other = null;
            }
            if (sportingItemData4 != null) {
                dataDes3 = sportingItemData4.getDataDes();
                data = sportingItemData4.getData();
            } else {
                data = null;
                dataDes3 = null;
            }
            if (sportingItemData != null) {
                data4 = sportingItemData.getData();
                dataDes4 = sportingItemData.getDataDes();
            } else {
                dataDes4 = null;
            }
            int i5 = z ? 8 : 0;
            int i6 = z2 ? 8 : 0;
            int i7 = z3 ? 8 : 0;
            int i8 = z4 ? 8 : 0;
            str3 = data4;
            i3 = i8;
            i2 = i5;
            str5 = data2;
            i4 = i6;
            i = i7;
            str4 = dataDes4;
            data4 = data3;
            str = other;
            str2 = dataDes3;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            dataDes = null;
            data = null;
            dataDes2 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            str5 = null;
        }
        if ((j & 3) != 0) {
            r8p.b(this.A, data4);
            r8p.b(this.I, dataDes);
            r8p.b(this.J, str);
            r8p.b(this.K, data);
            r8p.b(this.L, str2);
            r8p.b(this.M, str5);
            r8p.b(this.N, dataDes2);
            r8p.b(this.O, str3);
            r8p.b(this.P, str4);
            this.C.setVisibility(i);
            this.D.setVisibility(i2);
            this.E.setVisibility(i3);
            this.F.setVisibility(i4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.g != i) {
            return false;
        }
        A0((List) obj);
        return true;
    }

    public btq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, R, S));
    }
}
