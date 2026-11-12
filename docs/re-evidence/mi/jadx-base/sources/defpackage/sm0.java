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
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.utils.StringUtil;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class sm0 extends rm0 {
    public static final SparseIntArray A0;
    public static final ViewDataBinding.i z0;
    public final TextView l0;
    public final TextView m0;
    public final TextView n0;
    public final TextView o0;
    public final TextView p0;
    public final TextView q0;
    public final TextView r0;
    public final TextView s0;
    public final TextView t0;
    public final TextView u0;
    public final TextView v0;
    public final ztq w0;
    public final TextView x0;
    public long y0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(35);
        z0 = iVar;
        iVar.a(1, new String[]{"view_indoor_title_land"}, new int[]{23}, new int[]{dvi.x1});
        iVar.a(5, new String[]{"view_indoor_sport_target"}, new int[]{24}, new int[]{dvi.v1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(xri.C2, 25);
        sparseIntArray.put(xri.D2, 26);
        sparseIntArray.put(xri.D1, 27);
        sparseIntArray.put(xri.y5, 28);
        sparseIntArray.put(xri.z5, 29);
        sparseIntArray.put(xri.A5, 30);
        sparseIntArray.put(xri.B5, 31);
        sparseIntArray.put(xri.C5, 32);
        sparseIntArray.put(xri.o2, 33);
        sparseIntArray.put(xri.r6, 34);
    }

    public sm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, null, null, (TextView) objArr[6], null, null, null, (TextView) objArr[8], (ConstraintLayout) objArr[0], (TextView) objArr[20], (ConstraintLayout) objArr[27], (TextView) objArr[3], (ImageView) objArr[33], (ImageView) objArr[25], (RunningSportMusicView) objArr[26], null, (TextView) objArr[7], null, (FrameLayout) objArr[5], null, null, (LinearLayout) objArr[28], (LinearLayout) objArr[29], (LinearLayout) objArr[30], (LinearLayout) objArr[31], (LinearLayout) objArr[32], (ConstraintLayout) objArr[19], null, null, null, (SportCommandView) objArr[34], (ConstraintLayout) objArr[1], (TextView) objArr[2], (euq) objArr[23], (TextView) objArr[4], null);
        this.y0 = -1L;
        this.C.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.P.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.l0 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.m0 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[12];
        this.n0 = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[13];
        this.o0 = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[14];
        this.p0 = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[15];
        this.q0 = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[16];
        this.r0 = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[17];
        this.s0 = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[18];
        this.t0 = textView9;
        textView9.setTag(null);
        TextView textView10 = (TextView) objArr[21];
        this.u0 = textView10;
        textView10.setTag(null);
        TextView textView11 = (TextView) objArr[22];
        this.v0 = textView11;
        textView11.setTag(null);
        ztq ztqVar = (ztq) objArr[24];
        this.w0 = ztqVar;
        k0(ztqVar);
        TextView textView12 = (TextView) objArr[9];
        this.x0 = textView12;
        textView12.setTag(null);
        this.R.setTag(null);
        this.Z.setTag(null);
        this.e0.setTag(null);
        this.f0.setTag(null);
        k0(this.g0);
        this.h0.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.rm0
    public void B0(List<SportingItemData> list) {
        this.j0 = list;
        synchronized (this) {
            this.y0 |= 16;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // defpackage.rm0
    public void C0(Map<CommonSportModel.SportTitle, String> map) {
        this.k0 = map;
        synchronized (this) {
            this.y0 |= 32;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    public final boolean D0(xtq xtqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.y0 |= 2;
        }
        return true;
    }

    public final boolean E0(pvq pvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.y0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.y0 != 0) {
                    return true;
                }
                return this.g0.F() || this.w0.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(euq euqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.y0 |= 8;
        }
        return true;
    }

    public final boolean G0(xtq xtqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.y0 |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.y0 = 64L;
        }
        this.g0.H();
        this.w0.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return E0((pvq) obj, i2);
        }
        if (i == 1) {
            return D0((xtq) obj, i2);
        }
        if (i == 2) {
            return G0((xtq) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return F0((euq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.g0.l0(lifecycleOwner);
        this.w0.l0(lifecycleOwner);
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
            j = this.y0;
            this.y0 = 0L;
        }
        List<SportingItemData> list = this.j0;
        Map<CommonSportModel.SportTitle, String> map = this.k0;
        long j2 = j & 80;
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
                j |= z ? 256L : 128L;
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
        long j3 = j & 96;
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
            boolean zIsBlank = StringUtil.isBlank(str11);
            if (j3 != 0) {
                j |= z2 ? 1024L : 512L;
            }
            if ((j & 96) != 0) {
                j |= zIsBlank ? 4096L : 2048L;
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
        if ((j & 96) != 0) {
            r8p.b(this.C, str8);
            this.G.setVisibility(i2);
            r8p.b(this.K, str9);
            this.P.setVisibility(i2);
            this.w0.A0(map);
            this.R.setVisibility(i3);
            r8p.b(this.f0, str9);
            this.g0.A0(map);
            r8p.b(this.h0, str10);
        }
        if ((j & 80) != 0) {
            r8p.b(this.I, str6);
            r8p.b(this.l0, str2);
            r8p.b(this.m0, str);
            r8p.b(this.n0, str4);
            r8p.b(this.o0, data);
            r8p.b(this.p0, dataDes);
            r8p.b(this.q0, data2);
            r8p.b(this.r0, dataDes3);
            r8p.b(this.s0, str3);
            r8p.b(this.t0, dataDes2);
            r8p.b(this.u0, str5);
            r8p.b(this.v0, str7);
            r8p.b(this.x0, data3);
            this.Z.setVisibility(i);
        }
        ViewDataBinding.r(this.g0);
        ViewDataBinding.r(this.w0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.i == i) {
            B0((List) obj);
        } else {
            if (nv1.f28392k != i) {
                return false;
            }
            C0((Map) obj);
        }
        return true;
    }

    public sm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 35, z0, A0));
    }
}
