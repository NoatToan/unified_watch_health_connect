package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.ShareInitCallback;
import com.huawei.healthcloud.plugintrack.ui.view.TrackShareNewDetailView;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseFragment;
import defpackage.gxz;
import defpackage.gyd;
import defpackage.iyp;
import defpackage.jbr;
import defpackage.jpg;
import defpackage.jqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SportShareNewDetailFragment extends BaseFragment {
    private View f;
    private TrackShareNewDetailView h;
    private Context i;
    private MotionPathSimplify k;
    private ShareInitCallback l;
    private List<jpg> m;
    private gyd n;
    private jqp r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11102c = {R.drawable.share_geometry_1, R.drawable.share_geometry_2, R.drawable.share_geometry_3};
    private static final int[] e = {R.drawable.share_run_default_background};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f11101b = {R.drawable.share_cycling_default_background};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11100a = {R.drawable.basketball_background_default};
    private static final int[] d = {R.drawable.climb_hill_background_default};
    private static final int[] j = {R.drawable.swim_background_default};
    private ArrayList<Integer> g = new ArrayList<>(16);
    private int o = 0;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            throw new AssertionError("LayoutInflater not found.");
        }
        this.i = getActivity();
        this.f = layoutInflater.inflate(R.layout.track_fragment_sport_share_new, viewGroup, false);
        jbr jbrVarC = jbr.c();
        jqp jqpVarD = jbrVarC.d();
        this.r = jqpVarD;
        if (jqpVarD == null) {
            return new View(this.i);
        }
        this.m = jbrVarC.i();
        h();
        d();
        this.f.post(new Runnable() { // from class: joq
            @Override // java.lang.Runnable
            public final void run() {
                this.f38775a.j();
            }
        });
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        ShareInitCallback shareInitCallback = this.l;
        if (shareInitCallback != null) {
            shareInitCallback.onFinish();
        }
    }

    private void i() {
        if (g()) {
            this.o = this.k.requestSportType();
            iyp iypVar = new iyp(this.i, this.k, this.r, this.m);
            iypVar.a();
            if (this.r.ba()) {
                iypVar.b(getString(R.string.IDS_track_route_draw_sport_graffiti));
            }
            iypVar.d(this.r.h());
            iypVar.d(jbr.c().f());
            iypVar.e(jbr.c().h());
            this.n = iypVar.b();
            m();
        }
    }

    private void d() {
        if (g()) {
            i();
        }
    }

    private boolean g() {
        MotionPathSimplify motionPathSimplifyD = this.r.d();
        this.k = motionPathSimplifyD;
        if (motionPathSimplifyD != null) {
            return true;
        }
        LogUtil.j("Track_SportShareNewDetailFragment", "mSimplify is null");
        return false;
    }

    public List<gxz> a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listSingletonList;
        if (LanguageUtil.l(this.i)) {
            arrayList = new ArrayList(Arrays.asList(Integer.valueOf(R.drawable.sport_share_watermark_1005), Integer.valueOf(R.drawable.sport_share_watermark_1006)));
            arrayList2 = new ArrayList(Arrays.asList(Integer.valueOf(R.drawable.sport_share_watermark_1005), Integer.valueOf(R.drawable.sport_share_watermark_1026)));
            listSingletonList = Collections.singletonList(Integer.valueOf(R.drawable.ic_sport_share_watermark_1166));
        } else {
            arrayList = new ArrayList(Arrays.asList(Integer.valueOf(R.drawable.sport_share_watermark_1005_english), Integer.valueOf(R.drawable.sport_share_watermark_1006_english)));
            arrayList2 = new ArrayList(Arrays.asList(Integer.valueOf(R.drawable.sport_share_watermark_1005_english), Integer.valueOf(R.drawable.sport_share_watermark_1026_english)));
            listSingletonList = Collections.singletonList(Integer.valueOf(R.drawable.ic_sport_share_watermark_1166_english));
        }
        ArrayList arrayList3 = new ArrayList(Arrays.asList(1005, 1006));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(1005, 1026));
        ArrayList arrayList5 = new ArrayList(2);
        int i = this.o;
        int i2 = 0;
        if (i == 217) {
            while (i2 < 2) {
                gxz gxzVar = new gxz();
                gxzVar.b(((Integer) arrayList2.get(i2)).intValue());
                gxzVar.a(((Integer) arrayList4.get(i2)).intValue());
                arrayList5.add(gxzVar);
                i2++;
            }
        } else {
            if (i == 222) {
                gxz gxzVar2 = new gxz();
                gxzVar2.b(((Integer) listSingletonList.get(0)).intValue());
                gxzVar2.a(1166);
                arrayList5.add(gxzVar2);
                return arrayList5;
            }
            while (i2 < 2) {
                gxz gxzVar3 = new gxz();
                gxzVar3.b(((Integer) arrayList.get(i2)).intValue());
                gxzVar3.a(((Integer) arrayList3.get(i2)).intValue());
                arrayList5.add(gxzVar3);
                i2++;
            }
        }
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    private void m() {
        int i = this.o;
        if (i == 227) {
            this.g.add(Integer.valueOf(e[0]));
        } else if (i == 262) {
            this.g.add(Integer.valueOf(j[0]));
        } else if (i == 271) {
            this.g.add(Integer.valueOf(f11100a[0]));
        } else if (i != 280) {
            switch (i) {
                case 258:
                    this.g.add(Integer.valueOf(e[0]));
                    break;
                case 259:
                    this.g.add(Integer.valueOf(f11101b[0]));
                    break;
                case 260:
                    this.g.add(Integer.valueOf(d[0]));
                    break;
                default:
                    switch (i) {
                        case 264:
                            this.g.add(Integer.valueOf(e[0]));
                            break;
                        case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                            this.g.add(Integer.valueOf(f11101b[0]));
                            break;
                        case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                            this.g.add(Integer.valueOf(j[0]));
                            break;
                    }
                    break;
            }
        } else {
            this.g.add(Integer.valueOf(e[0]));
        }
        e(this.g, f11102c);
    }

    public View b() {
        return this.h;
    }

    private void h() {
        int iD;
        Bundle arguments = getArguments();
        f();
        WindowManager windowManager = (WindowManager) this.i.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int iD2 = qrs.d(this.i, 250.0f);
        if (arguments != null) {
            iD2 = arguments.getInt("allDataWidth", iD2);
            iD = arguments.getInt("allDataHeight", qrs.d(this.i, 400.0f));
        } else {
            iD = qrs.d(this.i, 400.0f);
        }
        b(i);
        boolean zIsEnable = HwColorPicker.isEnable();
        boolean zBg = CommonUtil.bg();
        boolean z = zIsEnable && zBg;
        LogUtil.a("Track_SportShareNewDetailFragment", "HwColorPicker isEnable ", Boolean.valueOf(zIsEnable), " , isHuaweiPhone ", Boolean.valueOf(zBg));
        float f = (iD2 * 1.0f) / i;
        int iD3 = (int) ((i + qrs.d(this.i, 48.0f)) * f);
        View viewFindViewById = this.f.findViewById(R.id.track_share_all_white);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = (int) (((iD - iD3) - (z ? qrs.d(this.i, 34.0f) : 0)) / 2.0f);
        viewFindViewById.setLayoutParams(layoutParams);
        View viewFindViewById2 = this.f.findViewById(R.id.track_share_new_detail_position);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
        layoutParams2.height = iD3;
        viewFindViewById2.setLayoutParams(layoutParams2);
        b(f);
    }

    private void f() {
        this.h = (TrackShareNewDetailView) this.f.findViewById(R.id.track_share_new_detail);
    }

    private void b(int i) {
        if (LanguageUtil.ba(this.i)) {
            this.h.setPivotX(i);
            this.h.setPivotY(0.0f);
            ((ImageView) this.f.findViewById(R.id.track_share_new_arrow)).setImageResource(R.drawable.arrow_left);
        } else {
            this.h.setPivotX(0.0f);
            this.h.setPivotY(0.0f);
        }
    }

    private void b(float f) {
        this.h.setScaleX(f);
        this.h.setScaleY(f);
    }

    public ArrayList<Integer> e() {
        return this.g;
    }

    public gyd c() {
        return this.n;
    }

    private void e(List<Integer> list, int[] iArr) {
        for (int i : iArr) {
            list.add(Integer.valueOf(i));
        }
    }

    public void b(ShareInitCallback shareInitCallback) {
        this.l = shareInitCallback;
    }
}
