package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel;
import com.huawei.pluginsocialshare.view.template.BaseShareTemplate;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pnd;
import defpackage.pns;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes42.dex */
public class EditShareMultipleFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f22582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap<Integer, Integer> f22583c = new HashMap<>();
    public static float d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BottomSheetBehavior<RelativeLayout> f22584a;
    private HealthBubbleLayout e;
    private HealthBubbleLayout f;
    private int g;
    private RelativeLayout h;
    private Context i;
    private int j;
    private boolean k;
    private int l;
    private HealthDotsPageIndicator m;
    private ShareBottomSheetFragment n;
    private LinearLayout o;
    private int p;
    private ShareViewModel q;
    private ShareCustomFragment r;
    private int t;

    public EditShareMultipleFragment(HealthBubbleLayout healthBubbleLayout) {
        this.e = healthBubbleLayout;
    }

    public static EditShareMultipleFragment c(Boolean bool, HealthBubbleLayout healthBubbleLayout) {
        EditShareMultipleFragment editShareMultipleFragment = new EditShareMultipleFragment(healthBubbleLayout);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFirstEntry", bool.booleanValue());
        editShareMultipleFragment.setArguments(bundle);
        return editShareMultipleFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Share_EditShareMultipleFragment", "onCreate");
        this.i = getContext();
        this.k = getArguments().getBoolean("isFirstEntry");
        gxt gxtVarE = pjm.e();
        if (gxtVarE == null) {
            LogUtil.a("Share_EditShareMultipleFragment", "EditShareActivity_data mShareContent is null");
            return;
        }
        ArrayList<gxy> arrayListE = gxtVarE.e();
        if (njy.e(arrayListE)) {
            return;
        }
        this.p = arrayListE.size();
        for (gxy gxyVar : arrayListE) {
            if (gxyVar != null && gxyVar.m()) {
                pjm.d().c(this.i, gxyVar, LoginInit.getInstance(this.i).getUserInfoFromDbSync());
                break;
            }
        }
        this.q = (ShareViewModel) new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.r.c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.hw_health_multiple_layout, viewGroup, false);
        this.o = (LinearLayout) viewInflate.findViewById(R.id.select_content_layout);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.bottom_sheet);
        this.h = relativeLayout;
        BottomSheetBehavior<RelativeLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(relativeLayout);
        this.f22584a = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f = (HealthBubbleLayout) viewInflate.findViewById(R.id.bubble_custom_guide);
        this.m = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.dots_page_indicator);
        o();
        n();
        f();
        return viewInflate;
    }

    private void f() {
        if (this.k) {
            this.f.setVisibility(0);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.view.EditShareMultipleFragment.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EditShareMultipleFragment.this.f.setVisibility(8);
                }
            });
        }
    }

    private void n() {
        int i = i();
        this.j = i;
        d = i;
        int iE = e();
        this.g = iE;
        this.f22584a.setPeekHeight(iE);
        this.l = h();
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.height = this.l;
        this.h.setLayoutParams(layoutParams);
        this.o.setPivotY(0.0f);
        float fD = d();
        f22582b = fD;
        this.o.setScaleY(fD);
        this.q.b(new pnd(g(), g(), j(), f22582b));
        this.t = this.l - this.g;
        this.f22584a.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.huawei.pluginsocialshare.view.EditShareMultipleFragment.3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
                float fJ = (int) (EditShareMultipleFragment.this.j() - (EditShareMultipleFragment.this.t * f));
                float fA = EditShareMultipleFragment.this.a(fJ);
                EditShareMultipleFragment.this.o.setScaleY(fA);
                EditShareMultipleFragment.this.q.b(new pnd(fJ, EditShareMultipleFragment.this.g(), EditShareMultipleFragment.this.j(), fA));
                if (EditShareMultipleFragment.this.f.getVisibility() == 0) {
                    EditShareMultipleFragment.this.f.setVisibility(8);
                }
            }
        });
    }

    private void o() {
        ShareCustomFragment shareCustomFragment = new ShareCustomFragment();
        this.r = shareCustomFragment;
        shareCustomFragment.d(this.m);
        this.r.d(this.e);
        b(getChildFragmentManager(), R.id.select_content_layout, this.r);
        ShareBottomSheetFragment shareBottomSheetFragment = new ShareBottomSheetFragment();
        this.n = shareBottomSheetFragment;
        shareBottomSheetFragment.c(this.f, this.e);
        b(getChildFragmentManager(), R.id.drag_content_layout, this.n);
    }

    private void b(FragmentManager fragmentManager, int i, Fragment fragment) {
        fragmentManager.beginTransaction().replace(i, fragment).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f) {
        int i = this.j;
        if (i != 0) {
            return f / i;
        }
        return 0.0f;
    }

    private float d() {
        if (this.j != 0) {
            return g() / this.j;
        }
        return 0.0f;
    }

    public View c() {
        ShareCustomFragment shareCustomFragment = this.r;
        if (shareCustomFragment == null) {
            ReleaseLogUtil.e("Share_EditShareMultipleFragment", "getShareContentView mShareCustomFragment is null ");
            return null;
        }
        return shareCustomFragment.d();
    }

    public BaseShareTemplate.VideoInfoManager b() {
        ShareCustomFragment shareCustomFragment = this.r;
        if (shareCustomFragment == null) {
            return null;
        }
        return shareCustomFragment.a();
    }

    public void a() {
        ShareCustomFragment shareCustomFragment = this.r;
        if (shareCustomFragment == null) {
            return;
        }
        shareCustomFragment.j();
    }

    public void c(int i, Intent intent) {
        ShareBottomSheetFragment shareBottomSheetFragment = this.n;
        if (shareBottomSheetFragment != null) {
            shareBottomSheetFragment.b(i, intent);
        }
    }

    private int h() {
        int i = this.p == 1 ? 258 : OldToNewMotionPath.SPORT_TYPE_BODY_BUILDING;
        if (qrs.ah(BaseApplication.getContext())) {
            i = this.p == 1 ? 282 : 262;
        }
        if (!qrs.af(BaseApplication.getContext()) && qrs.t()) {
            i = this.p == 1 ? 300 : OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE;
        }
        return qrs.d(BaseApplication.getContext(), i);
    }

    private int e() {
        return qrs.d(BaseApplication.getContext(), 128.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float j() {
        return this.j - this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float g() {
        return this.j - this.l;
    }

    private int i() {
        int iB = pns.b(getActivity());
        int iD = qrs.d(BaseApplication.getContext(), 56.0f);
        int iD2 = qrs.d(BaseApplication.getContext(), 64.0f);
        int iN = 0;
        if (this.p == 1) {
            iD2 = 0;
        }
        int i = (iB - iD) - iD2;
        if (qrs.af(BaseApplication.getContext()) && pns.o()) {
            iN = pns.n() - iD2;
        }
        LogUtil.a("Share_EditShareMultipleFragment", "viewHeight screenH:", Integer.valueOf(iB), " titleBarH:", Integer.valueOf(iD), " tabLayoutH: ", Integer.valueOf(iD2), " mContentHeight: ", Integer.valueOf(i), " realPadContentHeight=", Integer.valueOf(iN));
        return iN <= 0 ? i : iN;
    }
}
