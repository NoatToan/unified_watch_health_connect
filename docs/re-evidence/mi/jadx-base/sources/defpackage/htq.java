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
public class htq extends etq {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public final ConstraintLayout J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(zri.B0, 20);
    }

    public htq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[17], (ImageView) objArr[20], (LinearLayout) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[7], (LinearLayout) objArr[10], (LinearLayout) objArr[13], (ConstraintLayout) objArr[16]);
        this.W = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[11];
        this.K = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[12];
        this.L = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[14];
        this.M = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[15];
        this.N = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[18];
        this.O = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[19];
        this.P = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[2];
        this.Q = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[3];
        this.R = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[5];
        this.S = textView9;
        textView9.setTag(null);
        TextView textView10 = (TextView) objArr[6];
        this.T = textView10;
        textView10.setTag(null);
        TextView textView11 = (TextView) objArr[8];
        this.U = textView11;
        textView11.setTag(null);
        TextView textView12 = (TextView) objArr[9];
        this.V = textView12;
        textView12.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.etq
    public void A0(List<SportingItemData> list) {
        this.I = list;
        synchronized (this) {
            this.W |= 1;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.W != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.W = 2L;
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
        String data;
        String str4;
        String str5;
        String str6;
        String data2;
        String dataDes;
        String str7;
        String str8;
        String str9;
        String str10;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        SportingItemData sportingItemData;
        SportingItemData sportingItemData2;
        SportingItemData sportingItemData3;
        SportingItemData sportingItemData4;
        SportingItemData sportingItemData5;
        SportingItemData sportingItemData6;
        String dataDes2;
        String dataDes3;
        String data3;
        String data4;
        String dataDes4;
        String other;
        String dataDes5;
        String data5;
        String dataDes6;
        String data6;
        synchronized (this) {
            j = this.W;
            this.W = 0L;
        }
        List<SportingItemData> list = this.I;
        long j2 = j & 3;
        if (j2 != 0) {
            if (list != null) {
                sportingItemData3 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData5 = (SportingItemData) ViewDataBinding.B(list, 4);
                sportingItemData6 = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 5);
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 2);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
                sportingItemData3 = null;
                sportingItemData4 = null;
                sportingItemData5 = null;
                sportingItemData6 = null;
            }
            if (sportingItemData3 != null) {
                data = sportingItemData3.getData();
                dataDes2 = sportingItemData3.getDataDes();
            } else {
                data = null;
                dataDes2 = null;
            }
            boolean z = sportingItemData3 == null;
            boolean z2 = sportingItemData4 == null;
            boolean z3 = sportingItemData5 == null;
            boolean z4 = sportingItemData6 == null;
            boolean z5 = sportingItemData2 == null;
            boolean z6 = sportingItemData == null;
            if (j2 != 0) {
                j |= z ? 2048L : 1024L;
            }
            if ((j & 3) != 0) {
                j |= z2 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= z3 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= z4 ? 8192L : 4096L;
            }
            if ((j & 3) != 0) {
                j |= z5 ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= z6 ? 512L : 256L;
            }
            if (sportingItemData4 != null) {
                dataDes3 = sportingItemData4.getDataDes();
                data2 = sportingItemData4.getData();
            } else {
                dataDes3 = null;
                data2 = null;
            }
            if (sportingItemData5 != null) {
                data3 = sportingItemData5.getData();
                dataDes = sportingItemData5.getDataDes();
            } else {
                dataDes = null;
                data3 = null;
            }
            if (sportingItemData6 != null) {
                dataDes4 = sportingItemData6.getDataDes();
                data4 = sportingItemData6.getData();
            } else {
                data4 = null;
                dataDes4 = null;
            }
            if (sportingItemData2 != null) {
                dataDes5 = sportingItemData2.getDataDes();
                data5 = sportingItemData2.getData();
                other = sportingItemData2.getOther();
            } else {
                other = null;
                dataDes5 = null;
                data5 = null;
            }
            if (sportingItemData != null) {
                data6 = sportingItemData.getData();
                dataDes6 = sportingItemData.getDataDes();
            } else {
                dataDes6 = null;
                data6 = null;
            }
            int i7 = z ? 8 : 0;
            int i8 = z2 ? 8 : 0;
            int i9 = z3 ? 8 : 0;
            int i10 = z4 ? 8 : 0;
            int i11 = z5 ? 4 : 0;
            int i12 = z6 ? 8 : 0;
            str10 = dataDes6;
            str5 = other;
            i6 = i11;
            i4 = i7;
            str7 = data4;
            str9 = data6;
            i3 = i12;
            str = dataDes2;
            i = i8;
            i5 = i9;
            i2 = i10;
            str8 = dataDes4;
            str4 = dataDes5;
            str3 = data5;
            str6 = dataDes3;
            str2 = data3;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            data = null;
            str4 = null;
            str5 = null;
            str6 = null;
            data2 = null;
            dataDes = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if ((j & 3) != 0) {
            r8p.b(this.A, str3);
            r8p.b(this.K, data);
            r8p.b(this.L, str);
            r8p.b(this.M, str2);
            r8p.b(this.N, dataDes);
            this.O.setText(str4);
            r8p.b(this.P, str5);
            r8p.b(this.Q, data2);
            r8p.b(this.R, str6);
            r8p.b(this.S, str7);
            r8p.b(this.T, str8);
            r8p.b(this.U, str9);
            r8p.b(this.V, str10);
            this.C.setVisibility(i);
            this.D.setVisibility(i2);
            this.E.setVisibility(i3);
            this.F.setVisibility(i4);
            this.G.setVisibility(i5);
            this.H.setVisibility(i6);
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

    public htq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 21, X, Y));
    }
}
