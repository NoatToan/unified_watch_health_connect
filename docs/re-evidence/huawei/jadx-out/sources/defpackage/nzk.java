package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nyv f44002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nys f44003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f44004c;
    private SportEquipItemDrawer d;
    private final Context e;
    private SportEquipItemDrawer f;
    private LinearLayout g;
    private LinearLayout h;
    private LinearLayout i;
    private LinearLayout.LayoutParams j = new LinearLayout.LayoutParams(-2, -2);
    private LinearLayout.LayoutParams k = new LinearLayout.LayoutParams(-2, -2);
    private int l;
    private final View m;
    private IndoorEquipViewModel n;
    private int o;
    private String q;

    public nzk(View view, boolean z, IndoorEquipViewModel indoorEquipViewModel, Context context) {
        this.q = "";
        this.m = view;
        this.f44004c = z;
        this.n = indoorEquipViewModel;
        if (indoorEquipViewModel != null) {
            this.l = indoorEquipViewModel.getSportType();
            this.o = indoorEquipViewModel.getSportTarget();
            this.q = indoorEquipViewModel.s();
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "mSportType=", Integer.valueOf(this.l), ", mTargetType=", Integer.valueOf(this.o), ", hasRunPostureDevice=", Boolean.valueOf(this.n.r()), ", mHasWear=", Boolean.valueOf(z));
        }
        this.e = context;
        a();
    }

    private void a() {
        this.i = (LinearLayout) this.m.findViewById(R.id.land_left_data_layout);
        this.g = (LinearLayout) this.m.findViewById(R.id.land_right_data_layout);
        this.h = (LinearLayout) this.m.findViewById(R.id.land_layout_chart);
    }

    public void d(Map<Integer, Object> map) {
        if (this.m == null) {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "mRootView == null");
            return;
        }
        if (map == null) {
            return;
        }
        d(map, false);
        if (this.d.getParent() != null && (this.d.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        }
        if (this.f.getParent() != null && (this.f.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
        }
        this.g.addView(this.f);
        this.i.addView(this.d);
        LogUtil.d("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "add view");
    }

    public void c(Map<Integer, Object> map) {
        if (this.m == null) {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "mRootView == null");
            return;
        }
        if (map == null) {
            return;
        }
        d(map, true);
        if (this.d.getParent() != null && (this.d.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        }
        if (this.f.getParent() != null && (this.f.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
        }
        this.g.addView(this.f);
        this.i.addView(this.d);
        LogUtil.d("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "add view");
    }

    public void e(SupportDataRange supportDataRange) {
        this.d = new SportEquipItemDrawer(this.e);
        this.f = new SportEquipItemDrawer(this.e);
        HashMap map = new HashMap();
        this.f44002a = new nyv(this.e, this.l, this.f44004c, supportDataRange);
        d(map, false);
    }

    public void b(float f, float f2, SupportDataRange supportDataRange) {
        this.d = new SportEquipItemDrawer(this.e);
        this.f = new SportEquipItemDrawer(this.e);
        HashMap map = new HashMap();
        this.f44003b = new nys(this.e, this.l, this.f44004c, f, f2, supportDataRange);
        d(map, true);
    }

    private void d(Map<Integer, Object> map, boolean z) {
        int i = this.l;
        if (i == 264) {
            if (this.n.r()) {
                e(map, 2, z);
                return;
            } else {
                c(map, 1, 1, z);
                return;
            }
        }
        if (i == 265 || i == 273 || i == 274) {
            e(map, 2, z);
        } else if (i == 281) {
            c(map, 1, 1, z);
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "other sportType =", Integer.valueOf(i));
        }
    }

    private void e(Map<Integer, Object> map, int i, boolean z) {
        int[] iArrA;
        if (qrs.af(this.e)) {
            this.j.setMarginStart(0);
            d();
        } else {
            this.j.setMarginStart((int) this.e.getResources().getDimension(R.dimen.maxPaddingStart));
        }
        if (this.l == 265) {
            this.j.setMarginStart(0);
        }
        if (qrs.ah(this.e)) {
            this.j.setMarginStart(qrs.d(this.e, 80.0f));
        }
        this.d.b(2);
        this.h.setVisibility(0);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.d.setLayoutParams(this.j);
        if (this.l == 264 && this.n.q()) {
            iArrA = nyh.d(this.o);
        } else {
            iArrA = nyh.a(this.l, 4, this.o, this.q);
        }
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayViewHolder", Arrays.toString(iArrA));
        if (z) {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayViewHolder", "setIndoorDisplayInLeft");
            this.f44003b.c(this.d, map, iArrA, i);
        } else {
            this.f44002a.c(this.d, map, iArrA, i);
        }
    }

    private void d() {
        if (this.h.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.width = qrs.d(this.e, 200.0f);
            if (qrs.ah(this.e)) {
                layoutParams.setMarginEnd(qrs.d(this.e, 122.0f));
            }
            this.h.setLayoutParams(layoutParams);
        }
    }

    private void c(Map<Integer, Object> map, int i, int i2, boolean z) {
        this.k.setMarginStart(qrs.d(this.e, 160.0f));
        if (!z && qqv.a(this.e)) {
            this.j.setMarginStart(qrs.d(this.e, 88.0f));
        } else {
            this.j.setMarginStart(qrs.d(this.e, 38.0f));
        }
        if (qrs.af(this.e)) {
            this.k.setMarginStart(qrs.d(this.e, 160.0f));
            this.j.setMarginStart(qrs.d(this.e, 38.0f));
        }
        if (qrs.ah(this.e)) {
            this.k.setMargins(qrs.d(this.e, 286.0f), qrs.d(this.e, 42.0f), 0, 0);
            this.j.setMarginStart(qrs.d(this.e, 122.0f));
        }
        this.f.setLayoutParams(this.k);
        this.d.setLayoutParams(this.j);
        this.h.setVisibility(8);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        this.d.b(1);
        this.f.b(1);
        int[] iArrA = nyh.a(this.l, 2, this.o, this.q);
        int[] iArrA2 = nyh.a(this.l, 3, this.o, this.q);
        if (z) {
            this.f44003b.c(this.d, map, iArrA, i);
            this.f44003b.d(this.f, map, iArrA2, i2);
        } else {
            this.f44002a.c(this.d, map, iArrA, i);
            this.f44002a.d(this.f, map, iArrA2, i2);
        }
    }
}
