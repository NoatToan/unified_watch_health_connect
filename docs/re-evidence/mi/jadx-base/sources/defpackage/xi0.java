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
import com.xiaomi.fitness.sport_eco.utils.StringUtils;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class xi0 extends wi0 {
    public static final ViewDataBinding.i l0;
    public static final SparseIntArray m0;
    public final ConstraintLayout W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final TextView a0;
    public final TextView b0;
    public final TextView c0;
    public final TextView d0;
    public final TextView e0;
    public final TextView f0;
    public final TextView g0;
    public final TextView h0;
    public final qsq i0;
    public final TextView j0;
    public long k0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(33);
        l0 = iVar;
        iVar.a(1, new String[]{"view_eco_indoor_title_land"}, new int[]{23}, new int[]{fvi.q0});
        iVar.a(5, new String[]{"view_eco_indoor_sport_target"}, new int[]{24}, new int[]{fvi.o0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        m0 = sparseIntArray;
        sparseIntArray.put(zri.T, 25);
        sparseIntArray.put(zri.T1, 26);
        sparseIntArray.put(zri.U1, 27);
        sparseIntArray.put(zri.V1, 28);
        sparseIntArray.put(zri.W1, 29);
        sparseIntArray.put(zri.X1, 30);
        sparseIntArray.put(zri.B0, 31);
        sparseIntArray.put(zri.n2, 32);
    }

    public xi0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[20], (ConstraintLayout) objArr[25], (TextView) objArr[3], (ImageView) objArr[31], (TextView) objArr[7], null, (FrameLayout) objArr[5], (LinearLayout) objArr[26], (LinearLayout) objArr[27], (LinearLayout) objArr[28], (LinearLayout) objArr[29], (LinearLayout) objArr[30], (ConstraintLayout) objArr[19], (SportCommandView) objArr[32], (ConstraintLayout) objArr[1], (TextView) objArr[2], (vsq) objArr[23], (TextView) objArr[4]);
        this.k0 = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.W = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.X = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.Y = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[12];
        this.Z = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[13];
        this.a0 = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[14];
        this.b0 = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[15];
        this.c0 = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[16];
        this.d0 = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[17];
        this.e0 = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[18];
        this.f0 = textView9;
        textView9.setTag(null);
        TextView textView10 = (TextView) objArr[21];
        this.g0 = textView10;
        textView10.setTag(null);
        TextView textView11 = (TextView) objArr[22];
        this.h0 = textView11;
        textView11.setTag(null);
        qsq qsqVar = (qsq) objArr[24];
        this.i0 = qsqVar;
        k0(qsqVar);
        TextView textView12 = (TextView) objArr[9];
        this.j0 = textView12;
        textView12.setTag(null);
        this.I.setTag(null);
        this.O.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        k0(this.S);
        this.T.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(vsq vsqVar, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.k0 |= 1;
        }
        return true;
    }

    @Override // defpackage.wi0
    public void A0(List<SportingItemData> list) {
        this.U = list;
        synchronized (this) {
            this.k0 |= 2;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.wi0
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.V = map;
        synchronized (this) {
            this.k0 |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.k0 != 0) {
                    return true;
                }
                return this.S.F() || this.i0.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.k0 = 8L;
        }
        this.S.H();
        this.i0.H();
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
        this.S.l0(lifecycleOwner);
        this.i0.l0(lifecycleOwner);
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
        int i3;
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
            j = this.k0;
            this.k0 = 0L;
        }
        List<SportingItemData> list = this.U;
        Map<CommonSportModel.SportTitle, String> map = this.V;
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
                str9 = map.get(CommonSportModel.SportTitle.majorData);
                str11 = map.get(CommonSportModel.SportTitle.connectDevice);
                str12 = map.get(CommonSportModel.SportTitle.unit);
                str13 = str14;
            } else {
                str11 = null;
                str12 = null;
                str9 = null;
                str13 = null;
            }
            boolean z2 = str13 == null;
            boolean zIsBlank = StringUtils.isBlank(str11);
            if (j3 != 0) {
                j |= z2 ? 512L : 256L;
            }
            if ((j & 12) != 0) {
                j |= zIsBlank ? 128L : 64L;
            }
            int i4 = z2 ? 8 : 0;
            int i5 = zIsBlank ? 8 : 0;
            str8 = str11;
            i2 = i5;
            str10 = str12;
            i3 = i4;
        } else {
            i2 = 0;
            i3 = 0;
            str8 = null;
            str9 = null;
            str10 = null;
        }
        if ((j & 12) != 0) {
            r8p.b(this.A, str8);
            this.B.setVisibility(i2);
            r8p.b(this.E, str9);
            this.G.setVisibility(i2);
            this.i0.A0(map);
            this.I.setVisibility(i3);
            r8p.b(this.R, str9);
            this.S.A0(map);
            r8p.b(this.T, str10);
        }
        if ((j & 10) != 0) {
            r8p.b(this.C, str6);
            r8p.b(this.X, str2);
            r8p.b(this.Y, str);
            r8p.b(this.Z, str4);
            r8p.b(this.a0, data);
            r8p.b(this.b0, dataDes);
            r8p.b(this.c0, data2);
            r8p.b(this.d0, dataDes3);
            r8p.b(this.e0, str3);
            r8p.b(this.f0, dataDes2);
            r8p.b(this.g0, str5);
            r8p.b(this.h0, str7);
            r8p.b(this.j0, data3);
            this.O.setVisibility(i);
        }
        ViewDataBinding.r(this.S);
        ViewDataBinding.r(this.i0);
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

    public xi0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 33, l0, m0));
    }
}
