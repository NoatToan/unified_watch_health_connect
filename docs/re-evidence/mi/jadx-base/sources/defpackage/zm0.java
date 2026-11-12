package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class zm0 extends ym0 {
    public static final ViewDataBinding.i j0;
    public static final SparseIntArray k0;
    public final ConstraintLayout U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final TextView a0;
    public final TextView b0;
    public final TextView c0;
    public final TextView d0;
    public final qsq e0;
    public final TextView f0;
    public final TextView g0;
    public final TextView h0;
    public long i0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(31);
        j0 = iVar;
        iVar.a(1, new String[]{"view_eco_indoor_title_land"}, new int[]{21}, new int[]{fvi.q0});
        iVar.a(5, new String[]{"view_eco_indoor_sport_target"}, new int[]{22}, new int[]{fvi.o0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        k0 = sparseIntArray;
        sparseIntArray.put(zri.T, 23);
        sparseIntArray.put(zri.T1, 24);
        sparseIntArray.put(zri.U1, 25);
        sparseIntArray.put(zri.V1, 26);
        sparseIntArray.put(zri.W1, 27);
        sparseIntArray.put(zri.X1, 28);
        sparseIntArray.put(zri.B0, 29);
        sparseIntArray.put(zri.n2, 30);
    }

    public zm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[6], (TextView) objArr[18], (ConstraintLayout) objArr[23], (TextView) objArr[3], (ImageView) objArr[29], null, (FrameLayout) objArr[5], (LinearLayout) objArr[24], (LinearLayout) objArr[25], (LinearLayout) objArr[26], (LinearLayout) objArr[27], (LinearLayout) objArr[28], (ConstraintLayout) objArr[17], (SportCommandView) objArr[30], (ConstraintLayout) objArr[1], (TextView) objArr[2], (vsq) objArr[21], (TextView) objArr[4]);
        this.i0 = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.U = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.V = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.W = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[12];
        this.X = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[13];
        this.Y = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[14];
        this.Z = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[15];
        this.a0 = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[16];
        this.b0 = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[19];
        this.c0 = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[20];
        this.d0 = textView9;
        textView9.setTag(null);
        qsq qsqVar = (qsq) objArr[22];
        this.e0 = qsqVar;
        k0(qsqVar);
        TextView textView10 = (TextView) objArr[7];
        this.f0 = textView10;
        textView10.setTag(null);
        TextView textView11 = (TextView) objArr[8];
        this.g0 = textView11;
        textView11.setTag(null);
        TextView textView12 = (TextView) objArr[9];
        this.h0 = textView12;
        textView12.setTag(null);
        this.G.setTag(null);
        this.M.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        k0(this.Q);
        this.R.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(vsq vsqVar, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.i0 |= 1;
        }
        return true;
    }

    @Override // defpackage.ym0
    public void A0(List<SportingItemData> list) {
        this.S = list;
        synchronized (this) {
            this.i0 |= 2;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.ym0
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.T = map;
        synchronized (this) {
            this.i0 |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.i0 != 0) {
                    return true;
                }
                return this.Q.F() || this.e0.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.i0 = 8L;
        }
        this.Q.H();
        this.e0.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((vsq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.Q.l0(lifecycleOwner);
        this.e0.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String dataDes;
        String data;
        String dataDes2;
        int i;
        String data2;
        String str;
        String dataDes3;
        String data3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        SportingItemData sportingItemData;
        SportingItemData sportingItemData2;
        SportingItemData sportingItemData3;
        SportingItemData sportingItemData4;
        SportingItemData sportingItemData5;
        SportingItemData sportingItemData6;
        String dataDes4;
        String data4;
        String data5;
        String dataDes5;
        String dataDes6;
        String data6;
        String other;
        synchronized (this) {
            j = this.i0;
            this.i0 = 0L;
        }
        List<SportingItemData> list = this.S;
        Map<CommonSportModel.SportTitle, String> map = this.T;
        long j2 = j & 10;
        if (j2 != 0) {
            if (list != null) {
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData5 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 4);
                sportingItemData6 = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData3 = (SportingItemData) ViewDataBinding.B(list, 5);
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 2);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
                sportingItemData3 = null;
                sportingItemData4 = null;
                sportingItemData5 = null;
                sportingItemData6 = null;
            }
            if (sportingItemData4 != null) {
                data2 = sportingItemData4.getData();
                dataDes3 = sportingItemData4.getDataDes();
            } else {
                data2 = null;
                dataDes3 = null;
            }
            if (sportingItemData5 != null) {
                dataDes4 = sportingItemData5.getDataDes();
                data3 = sportingItemData5.getData();
            } else {
                data3 = null;
                dataDes4 = null;
            }
            if (sportingItemData2 != null) {
                data4 = sportingItemData2.getData();
                dataDes2 = sportingItemData2.getDataDes();
            } else {
                dataDes2 = null;
                data4 = null;
            }
            if (sportingItemData6 != null) {
                dataDes5 = sportingItemData6.getDataDes();
                data5 = sportingItemData6.getData();
            } else {
                data5 = null;
                dataDes5 = null;
            }
            if (sportingItemData3 != null) {
                dataDes6 = sportingItemData3.getDataDes();
                data6 = sportingItemData3.getData();
                other = sportingItemData3.getOther();
            } else {
                dataDes6 = null;
                data6 = null;
                other = null;
            }
            boolean z = sportingItemData3 == null;
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            if (sportingItemData != null) {
                data = sportingItemData.getData();
                dataDes = sportingItemData.getDataDes();
            } else {
                dataDes = null;
                data = null;
            }
            i = z ? 8 : 0;
            str = data5;
            str2 = dataDes4;
            str3 = data4;
            str4 = dataDes5;
            str5 = dataDes6;
            str6 = data6;
            str7 = other;
        } else {
            dataDes = null;
            data = null;
            dataDes2 = null;
            i = 0;
            data2 = null;
            str = null;
            dataDes3 = null;
            data3 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        long j3 = j & 12;
        if (j3 != 0) {
            if (map != null) {
                String str14 = map.get(CommonSportModel.SportTitle.progressDetail);
                str10 = map.get(CommonSportModel.SportTitle.majorData);
                str11 = map.get(CommonSportModel.SportTitle.connectDevice);
                str12 = map.get(CommonSportModel.SportTitle.unit);
                str13 = str14;
            } else {
                str11 = null;
                str12 = null;
                str10 = null;
                str13 = null;
            }
            boolean z2 = str13 == null;
            if (j3 != 0) {
                j |= z2 ? 128L : 64L;
            }
            str9 = str12;
            str8 = str11;
            i2 = z2 ? 8 : 0;
        } else {
            i2 = 0;
            str8 = null;
            str9 = null;
            str10 = null;
        }
        if ((j & 12) != 0) {
            r8p.b(this.A, str8);
            r8p.b(this.D, str10);
            this.e0.A0(map);
            this.G.setVisibility(i2);
            r8p.b(this.P, str10);
            this.Q.A0(map);
            r8p.b(this.R, str9);
        }
        if ((j & 10) != 0) {
            r8p.b(this.B, str6);
            r8p.b(this.V, str4);
            r8p.b(this.W, data);
            r8p.b(this.X, dataDes);
            r8p.b(this.Y, data2);
            r8p.b(this.Z, dataDes3);
            r8p.b(this.a0, str3);
            r8p.b(this.b0, dataDes2);
            r8p.b(this.c0, str5);
            r8p.b(this.d0, str7);
            r8p.b(this.f0, data3);
            r8p.b(this.g0, str2);
            r8p.b(this.h0, str);
            this.M.setVisibility(i);
        }
        ViewDataBinding.r(this.Q);
        ViewDataBinding.r(this.e0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.g == i) {
            A0((List) obj);
        } else {
            if (pv1.h != i) {
                return false;
            }
            B0((Map) obj);
        }
        return true;
    }

    public zm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 31, j0, k0));
    }
}
