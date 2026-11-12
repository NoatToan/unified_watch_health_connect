package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class nvq extends mvq {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V = null;
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

    public nvq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[11], (ImageView) objArr[13], (LinearLayout) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[7], (ConstraintLayout) objArr[10], (LinearLayout) objArr[15]);
        this.T = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[12];
        this.J = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[14];
        this.K = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[16];
        this.L = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[17];
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
        String str;
        String str2;
        String str3;
        String dataDes;
        String data;
        String dataDes2;
        String str4;
        int i;
        String data2;
        String dataDes3;
        String data3;
        String str5;
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
        String other;
        String data4;
        String dataDes4;
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
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData3 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 4);
                sportingItemData5 = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 2);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
                sportingItemData3 = null;
                sportingItemData4 = null;
                sportingItemData5 = null;
            }
            if (sportingItemData2 != null) {
                data = sportingItemData2.getData();
                other = sportingItemData2.getOther();
                dataDes2 = sportingItemData2.getDataDes();
            } else {
                data = null;
                dataDes2 = null;
                other = null;
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
                j |= z2 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= z3 ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= z4 ? 2048L : 1024L;
            }
            if ((j & 3) != 0) {
                j |= z5 ? 128L : 64L;
            }
            if (sportingItemData3 != null) {
                dataDes = sportingItemData3.getDataDes();
                data2 = sportingItemData3.getData();
            } else {
                dataDes = null;
                data2 = null;
            }
            if (sportingItemData4 != null) {
                data4 = sportingItemData4.getData();
                dataDes3 = sportingItemData4.getDataDes();
            } else {
                dataDes3 = null;
                data4 = null;
            }
            if (sportingItemData5 != null) {
                dataDes4 = sportingItemData5.getDataDes();
                data3 = sportingItemData5.getData();
            } else {
                data3 = null;
                dataDes4 = null;
            }
            if (sportingItemData != null) {
                data5 = sportingItemData.getData();
                dataDes5 = sportingItemData.getDataDes();
            } else {
                dataDes5 = null;
                data5 = null;
            }
            int heartVisibility = CommonSportModelUtil.INSTANCE.getHeartVisibility(dataDes2);
            int i7 = z ? 8 : 0;
            int i8 = z2 ? 8 : 0;
            int i9 = z3 ? 8 : 0;
            int i10 = z4 ? 8 : 0;
            int i11 = z5 ? 8 : 0;
            i5 = i7;
            str4 = data5;
            i4 = i11;
            i2 = i8;
            i6 = i9;
            i3 = i10;
            str3 = dataDes4;
            str5 = dataDes5;
            i = heartVisibility;
            str = other;
            str2 = data4;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            dataDes = null;
            data = null;
            dataDes2 = null;
            str4 = null;
            i = 0;
            data2 = null;
            dataDes3 = null;
            data3 = null;
            str5 = null;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if ((j & 3) != 0) {
            r8p.b(this.A, data);
            this.B.setVisibility(i);
            r8p.b(this.J, dataDes2);
            r8p.b(this.K, str);
            r8p.b(this.L, str2);
            r8p.b(this.M, dataDes3);
            r8p.b(this.N, data2);
            r8p.b(this.O, dataDes);
            r8p.b(this.P, data3);
            r8p.b(this.Q, str3);
            r8p.b(this.R, str4);
            r8p.b(this.S, str5);
            this.C.setVisibility(i2);
            this.D.setVisibility(i3);
            this.E.setVisibility(i4);
            this.F.setVisibility(i5);
            this.G.setVisibility(i6);
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

    public nvq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, U, V));
    }
}
