package com.huawei.health.marketing.views.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SinglePopUp;
import com.huawei.health.marketing.datatype.templates.PopUpMultiTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.dialog.MarketingDialogFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.njy;
import defpackage.qso;
import defpackage.qtn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class MarketingDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthFragmentStatePagerAdapter f8460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FragmentManager f8461c;
    private HealthDotsPageIndicator e;
    private int f;
    private ResourceBriefInfo g;
    private View i;
    private LinearLayout j;
    private HealthViewPager n;
    private long h = 0;
    private boolean d = false;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.DialogFullScreen);
    }

    public void e(int i, ResourceBriefInfo resourceBriefInfo) {
        this.f = i;
        this.g = resourceBriefInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.introduction_dialog, viewGroup, true);
        this.i = viewInflate;
        viewInflate.setVisibility(4);
        return this.i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n = (HealthViewPager) this.i.findViewById(R.id.introduction_view_pager_dialog);
        this.e = (HealthDotsPageIndicator) this.i.findViewById(R.id.dialog_indicator);
        this.j = (LinearLayout) this.i.findViewById(R.id.introduction_dialog_rotate);
        this.f8459a = (ImageView) this.i.findViewById(R.id.introduction_cancel_dialog);
        this.f8461c = getChildFragmentManager();
        b();
    }

    private void b() {
        ArrayList arrayList = new ArrayList(((PopUpMultiTemplate) new Gson().fromJson(this.g.getContent().getContent(), PopUpMultiTemplate.class)).getGridContents());
        d(arrayList);
        if (this.d) {
            Collections.sort(arrayList, new Comparator() { // from class: gbj
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return MarketingDialogFragment.d((SinglePopUp) obj, (SinglePopUp) obj2);
                }
            });
            if (this.f8461c != null && njy.b(arrayList)) {
                OnPageClickListener onPageClickListener = new OnPageClickListener() { // from class: gbk
                    @Override // com.huawei.health.marketing.views.dialog.OnPageClickListener
                    public final void onPageClick(int i) {
                        this.f34862b.d(i);
                    }
                };
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int i = 0;
                for (SinglePopUp singlePopUp : arrayList) {
                    InnerMarketingFragment innerMarketingFragment = new InnerMarketingFragment();
                    innerMarketingFragment.a(this.f, i, this.g, singlePopUp);
                    innerMarketingFragment.e(onPageClickListener);
                    arrayList2.add(innerMarketingFragment);
                    i++;
                }
                qtn qtnVar = new qtn(this.f8461c, arrayList2);
                this.f8460b = qtnVar;
                this.n.setAdapter(qtnVar);
                this.e.setViewPager(this.n);
                if (arrayList.size() <= 1) {
                    this.e.setVisibility(8);
                    this.n.setIsScroll(false);
                } else {
                    this.e.setVisibility(0);
                }
            }
            this.f8459a.setOnClickListener(new View.OnClickListener() { // from class: gbn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            });
        }
    }

    public static /* synthetic */ int d(SinglePopUp singlePopUp, SinglePopUp singlePopUp2) {
        return singlePopUp2.getPriority() - singlePopUp.getPriority();
    }

    public /* synthetic */ void d(int i) {
        if (i == this.f8460b.getCount() - 1) {
            dismiss();
        } else {
            this.n.setCurrentItem(i + 1);
        }
    }

    public /* synthetic */ void d(View view) {
        MarketingBiUtils.b(this.f, this.g, this.h);
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        qso.d().e(this, this.i);
    }

    private void a(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.j, "scaleX", 0.3f, 1.0f);
        long j = i;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.j, "scaleY", 0.3f, 1.0f);
        objectAnimatorOfFloat2.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.j, "rotationY", 280.0f, 360.0f);
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.j, "alpha", 0.1f, 1.0f);
        objectAnimatorOfFloat4.setStartDelay(50L);
        objectAnimatorOfFloat4.setDuration(j);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.health.marketing.views.dialog.MarketingDialogFragment.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (MarketingDialogFragment.this.i != null) {
                    MarketingDialogFragment.this.i.setVisibility(0);
                }
                super.onAnimationStart(animator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setStartDelay(500L);
        animatorSet.setInterpolator(new Interpolator() { // from class: com.huawei.health.marketing.views.dialog.MarketingDialogFragment.4
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) Math.sin((float) (((double) f) * 1.5707963267948966d));
            }
        });
        animatorSet.start();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void showNow(FragmentManager fragmentManager, String str) {
        try {
            super.showNow(fragmentManager, str);
            if (getDialog() != null) {
                a(400);
                this.h = System.currentTimeMillis();
            }
        } catch (IllegalStateException e) {
            LogUtil.a("MarketingDialogFragment", String.valueOf(e.getMessage()));
        }
    }

    private void d(List<SinglePopUp> list) {
        int contentType = this.g.getContentType();
        boolean z = (contentType == 50 || contentType == 45) && njy.b(list);
        this.d = z;
        if (z) {
            Iterator<SinglePopUp> it = list.iterator();
            while (it.hasNext()) {
                String mediaType = it.next().getMediaType();
                if (!"video".equals(mediaType) && !"image".equals(mediaType)) {
                    it.remove();
                }
            }
            this.d = njy.b(list);
        }
    }
}
