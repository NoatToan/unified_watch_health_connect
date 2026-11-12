package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ovq extends mvq {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(xri.o2, 17);
    }

    public ovq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[11], (ImageView) objArr[17], (LinearLayout) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[7], (ConstraintLayout) objArr[10], (LinearLayout) objArr[14]);
        this.T = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[12];
        this.J = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[13];
        this.K = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[15];
        this.L = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[16];
        this.M = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[2];
        this.N = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[3];
        this.O = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[5];
        this.P = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[6];
        this.Q = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[8];
        this.R = textView9;
        textView9.setTag(null);
        TextView textView10 = (TextView) objArr[9];
        this.S = textView10;
        textView10.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.mvq
    public void A0(List<SportingItemData> list) {
        this.H = list;
        synchronized (this) {
            this.T |= 1;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.T != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.T = 2L;
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
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String dataDes;
        String data;
        String str7;
        String str8;
        String str9;
        SportingItemData sportingItemData;
        SportingItemData sportingItemData2;
        SportingItemData sportingItemData3;
        SportingItemData sportingItemData4;
        SportingItemData sportingItemData5;
        String dataDes2;
        String data2;
        String data3;
        String other;
        String dataDes3;
        String dataDes4;
        String data4;
        String dataDes5;
        String data5;
        synchronized (this) {
            j = this.T;
            this.T = 0L;
        }
        List<SportingItemData> list = this.H;
        long j2 = j & 3;
        if (j2 != 0) {
            if (list != null) {
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData3 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData5 = (SportingItemData) ViewDataBinding.B(list, 2);
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 4);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
                sportingItemData3 = null;
                sportingItemData4 = null;
                sportingItemData5 = null;
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
            boolean z4 = sportingItemData5 == null;
            boolean z5 = sportingItemData == null;
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
            if ((j & 3) != 0) {
                j |= z5 ? 2048L : 1024L;
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
            if (sportingItemData5 != null) {
                data4 = sportingItemData5.getData();
                dataDes4 = sportingItemData5.getDataDes();
            } else {
                dataDes4 = null;
                data4 = null;
            }
            if (sportingItemData != null) {
                data5 = sportingItemData.getData();
                dataDes5 = sportingItemData.getDataDes();
            } else {
                dataDes5 = null;
                data5 = null;
            }
            int i6 = z ? 8 : 0;
            int i7 = z2 ? 8 : 0;
            int i8 = z3 ? 8 : 0;
            int i9 = z4 ? 8 : 0;
            i5 = z5 ? 8 : 0;
            i2 = i6;
            str9 = dataDes4;
            str6 = data2;
            i4 = i7;
            i = i8;
            i3 = i9;
            str5 = dataDes3;
            str8 = data4;
            str4 = dataDes5;
            str7 = dataDes2;
            str = other;
            str3 = data3;
            str2 = data5;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            dataDes = null;
            data = null;
            str7 = null;
            str8 = null;
            str9 = null;
        }
        if ((j & 3) != 0) {
            r8p.b(this.A, str3);
            r8p.b(this.J, dataDes);
            r8p.b(this.K, str);
            r8p.b(this.L, str2);
            r8p.b(this.M, str4);
            r8p.b(this.N, data);
            r8p.b(this.O, str5);
            r8p.b(this.P, str6);
            r8p.b(this.Q, str7);
            r8p.b(this.R, str8);
            r8p.b(this.S, str9);
            this.C.setVisibility(i);
            this.D.setVisibility(i2);
            this.E.setVisibility(i3);
            this.F.setVisibility(i4);
            this.G.setVisibility(i5);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.i != i) {
            return false;
        }
        A0((List) obj);
        return true;
    }

    public ovq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, U, V));
    }
}
