package com.huawei.ui.main.stories.configuredpage.adpters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.Utils;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import defpackage.dlm;
import defpackage.dlo;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.tre;
import defpackage.trh;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ConfiguredLayoutAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f26376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<dlm>> f26377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26378c;
    private int d;
    private Context e;
    private boolean f;
    private boolean g;
    private boolean h;
    private List<dlm> i;
    private int j;
    private int k;
    private int l;
    private String m;
    private int n;
    private int o;
    private OperationInteractorsApi q;
    private int r;

    private ConfiguredLayoutAdapter(boolean z, Context context, dlo dloVar) {
        this.h = true;
        this.e = context;
        this.f26376a = LayoutInflater.from(context);
        this.f = z;
        if (dloVar == null) {
            return;
        }
        this.j = dloVar.c();
        this.o = dloVar.a();
        this.l = dloVar.i();
        this.k = dloVar.h();
        this.m = dloVar.f();
        this.r = dloVar.m();
        this.q = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
    }

    public ConfiguredLayoutAdapter(Context context, List<dlm> list, dlo dloVar) {
        this(false, context, dloVar);
        this.i = list;
    }

    public ConfiguredLayoutAdapter(Context context, List<List<dlm>> list, dlo dloVar, boolean z) {
        this(false, context, dloVar);
        this.f26377b = list;
        this.g = z;
    }

    public ConfiguredLayoutAdapter(boolean z, Context context, List<dlm> list, dlo dloVar) {
        this(z, context, dloVar);
        this.i = list;
    }

    public ConfiguredLayoutAdapter(boolean z, Context context, List<List<dlm>> list, dlo dloVar, boolean z2) {
        this(z, context, dloVar);
        this.f26377b = list;
        this.g = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 2 || i == 4) {
            if (this.o == 5) {
                viewInflate = this.f26376a.inflate(R.layout.item_configure_image_grid_two_optimization, viewGroup, false);
            } else {
                viewInflate = this.f26376a.inflate(R.layout.configured_page_item_common_layout, viewGroup, false);
            }
        } else if (i != 14) {
            switch (i) {
                case 6:
                    int i2 = this.o;
                    if (i2 == 3 && this.f) {
                        viewInflate = this.f26376a.inflate(R.layout.configured_page_item_huawei_activity, viewGroup, false);
                    } else if (i2 == 3) {
                        viewInflate = this.f26376a.inflate(R.layout.configured_page_item_huawei_activity_harmony, viewGroup, false);
                    } else {
                        viewInflate = this.f26376a.inflate(R.layout.configured_page_item_common_layout, viewGroup, false);
                    }
                    break;
                case 7:
                    viewInflate = this.f26376a.inflate(R.layout.item_configure_image_text, viewGroup, false);
                    break;
                case 8:
                    viewInflate = this.f26376a.inflate(R.layout.item_configure_image_grid_vertical, viewGroup, false);
                    break;
                case 9:
                    if (qrs.af(BaseApplication.getContext())) {
                        viewInflate = this.f26376a.inflate(R.layout.item_configure_image_grid_two_optimization, viewGroup, false);
                    } else {
                        viewInflate = this.f26376a.inflate(R.layout.item_configure_image_vertical_attach, viewGroup, false);
                    }
                    break;
                case 10:
                    viewInflate = this.f26376a.inflate(R.layout.configured_page_item_discover_icon, viewGroup, false);
                    break;
                case 11:
                    viewInflate = this.f26376a.inflate(R.layout.item_configure_information_image_text, viewGroup, false);
                    break;
                case 12:
                    viewInflate = this.f26376a.inflate(R.layout.item_configure_image_grid_four_optimization, viewGroup, false);
                    break;
                default:
                    viewInflate = this.f26376a.inflate(R.layout.configured_page_item_common_layout, viewGroup, false);
                    break;
            }
        } else {
            viewInflate = this.f26376a.inflate(R.layout.configured_page_item_three_list, viewGroup, false);
        }
        return new c(viewInflate, this.o, i, this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        if (this.g) {
            if (njy.e(this.f26377b, i)) {
                return;
            }
            d(cVar);
            return;
        }
        if (njy.e(this.i, i)) {
            return;
        }
        int i2 = this.j;
        if (i2 == 2 || i2 == 4) {
            k(cVar, i);
            return;
        }
        if (i2 != 14) {
            switch (i2) {
                case 6:
                    m(cVar, i);
                    break;
                case 7:
                    j(cVar, i);
                    break;
                case 8:
                    n(cVar, i);
                    break;
                case 9:
                    if (qrs.af(BaseApplication.getContext())) {
                        o(cVar, i);
                    } else {
                        d(cVar);
                    }
                    break;
                case 10:
                    h(cVar, i);
                    break;
                case 11:
                    f(cVar, i);
                    break;
                case 12:
                    d(cVar, i);
                    break;
                default:
                    i(cVar, i);
                    break;
            }
            return;
        }
        l(cVar, i);
    }

    private void m(c cVar, int i) {
        int i2 = this.o;
        if (i2 == 3 && this.f) {
            a(cVar, i);
        } else if (i2 == 3) {
            b(cVar, i);
        } else {
            i(cVar, i);
        }
    }

    private void k(c cVar, int i) {
        if (this.o == 5) {
            o(cVar, i);
        } else {
            i(cVar, i);
        }
    }

    private dlm c(c cVar, int i) {
        if (cVar == null || njy.e(this.i)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "getCardItemObject() holder or mListSingle or position is null.");
            return null;
        }
        if (!njy.c(this.i, i)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "getCardItemObject() outOfBounds, position = ", Integer.valueOf(i));
            return null;
        }
        return this.i.get(i);
    }

    private void f(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setGraphicalSeparationLayout itemObject is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar.n.getLayoutParams();
        int iA = tre.a(this.e, 11, this.l);
        int i2 = (iA * 9) / 21;
        layoutParams.width = iA;
        layoutParams.height = i2;
        cVar.n.setLayoutParams(layoutParams);
        String strA = a(dlmVarC);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setInformationImageTextLayout() imageUrl is empty.");
        } else {
            cVar.l.setLayoutParams(new RelativeLayout.LayoutParams(iA, i2));
            qqf.b(cVar.l, strA, qqf.d, 1, 0);
        }
        a(dlmVarC.o(), dlmVarC.i(), cVar.s);
        String strE = dlmVarC.e();
        int iK = dlmVarC.k();
        if (TextUtils.isEmpty(strE) || iK != 1) {
            cVar.o.setVisibility(8);
        } else {
            cVar.o.setVisibility(0);
            cVar.o.setText(strE);
        }
        b(dlmVarC, cVar.n);
    }

    private void d(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setApplicationServerImageTextLayout itemObject is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar.d.getLayoutParams();
        int iD = qrs.d(this.e, 64.0f);
        layoutParams.width = iD;
        layoutParams.height = (iD * 3) / 2;
        cVar.d.setLayoutParams(layoutParams);
        String strA = a(dlmVarC);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setApplicationServerImageTextLayout() imageUrl is empty.");
        } else {
            qqf.b(cVar.f26382b, strA, qqf.e, 0, 0);
        }
        a(dlmVarC.o(), dlmVarC.i(), cVar.f26383c);
        b(dlmVarC, cVar.d);
    }

    private void o(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setOptimizationLayout itemObject is null.");
            return;
        }
        int iA = tre.a(this.e, this.j, this.l);
        ViewGroup.LayoutParams layoutParams = cVar.as.getLayoutParams();
        layoutParams.width = iA;
        if (this.j != 9) {
            iA = (iA * 5) / 4;
        }
        layoutParams.height = iA;
        cVar.as.setLayoutParams(layoutParams);
        a(dlmVarC.o(), dlmVarC.i(), cVar.aq);
        b(dlmVarC.e(), dlmVarC.k(), cVar.aj);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        cVar.aq.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        cVar.aj.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = cVar.aq.getMeasuredHeight();
        int measuredHeight2 = cVar.aj.getMeasuredHeight();
        int iD = qrs.d(this.e, 12.0f);
        int iD2 = (((((iA - measuredHeight) - iD) - qrs.d(this.e, 4.0f)) - measuredHeight2) - qrs.d(this.e, 20.0f)) - qrs.d(this.e, 16.0f);
        ViewGroup.LayoutParams layoutParams2 = cVar.ap.getLayoutParams();
        layoutParams2.height = iD2;
        layoutParams2.width = iD2;
        cVar.ap.setLayoutParams(layoutParams2);
        c(a(dlmVarC), cVar.ap);
        b(dlmVarC, cVar.as);
    }

    private void d(c cVar) {
        LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setImageVerticalAttachLayout() enter");
        if (cVar == null || njy.e(this.f26377b)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setImageVerticalAttachLayout holder or mGridVerticalList or position is null.");
            return;
        }
        List<dlm> list = this.f26377b.get(0);
        if (njy.e(list, 2)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setImageVerticalAttachLayout outOfBounds.");
            return;
        }
        if (njy.e(list, 0) || njy.e(list, 1) || njy.e(list, 2)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "cardItemObjectList outOfBounds.");
            return;
        }
        dlm dlmVar = list.get(0);
        dlm dlmVar2 = list.get(1);
        dlm dlmVar3 = list.get(2);
        if (dlmVar == null || dlmVar2 == null || dlmVar3 == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setImageVerticalAttachLayout itemObject is null.");
            return;
        }
        b(cVar, dlmVar);
        b(cVar, dlmVar2);
        b(cVar, dlmVar3);
    }

    private void b(c cVar, dlm dlmVar) {
        if (cVar == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setVerticalLayoutShow holder or object is null.");
            return;
        }
        this.f26378c = dlmVar.s();
        String strA = a(dlmVar);
        int iA = tre.a(this.e, 9, this.l);
        this.d = (iA * 5) / 4;
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        int i = this.d;
        this.n = (i - dimensionPixelSize) / 2;
        int i2 = this.f26378c;
        if (i2 != 1) {
            if (i2 != 2) {
                LogUtil.a("ConfiguredPage_ConfiguredLayoutAdapter", "invalid imageType.");
                return;
            } else {
                b(cVar, dlmVar, strA, iA);
                return;
            }
        }
        if (this.o == 4) {
            b(dlmVar, iA, i, cVar.ad, cVar.ak);
            return;
        }
        if (cVar.ad == null || cVar.ak == null) {
            return;
        }
        cVar.ad.setVisibility(0);
        cVar.ad.setLayoutParams(new RelativeLayout.LayoutParams(iA, this.d));
        cVar.ad.setBackground(this.e.getResources().getDrawable(R.drawable.item_configure_grid_bg));
        cVar.ak.setVisibility(8);
        e(dlmVar, strA, cVar.az, cVar.au, cVar.ab);
        b(dlmVar, cVar.ad);
    }

    private void b(c cVar, dlm dlmVar, String str, int i) {
        if (this.h) {
            this.h = false;
            if (this.l == 15 && this.o == 4) {
                b(dlmVar, i, this.n, cVar.an, cVar.am);
                return;
            }
            if (cVar.an == null || cVar.am == null) {
                return;
            }
            cVar.an.setVisibility(0);
            cVar.an.setLayoutParams(new RelativeLayout.LayoutParams(i, this.n));
            cVar.an.setBackground(this.e.getResources().getDrawable(R.drawable.item_configure_grid_bg));
            cVar.am.setVisibility(8);
            e(dlmVar, str, cVar.ba, cVar.av, cVar.af);
            b(dlmVar, cVar.an);
            return;
        }
        this.h = true;
        if (this.l == 15 && this.o == 4) {
            b(dlmVar, i, this.n, cVar.ah, cVar.al);
            return;
        }
        if (cVar.ah == null || cVar.al == null) {
            return;
        }
        cVar.ah.setVisibility(0);
        cVar.ah.setLayoutParams(new RelativeLayout.LayoutParams(i, this.n));
        cVar.ah.setBackground(this.e.getResources().getDrawable(R.drawable.item_configure_grid_bg));
        cVar.al.setVisibility(8);
        e(dlmVar, str, cVar.bb, cVar.at, cVar.ai);
        b(dlmVar, cVar.ah);
    }

    private void e(dlm dlmVar, String str, HealthTextView healthTextView, HealthTextView healthTextView2, ImageView imageView) {
        int iD;
        if (dlmVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setOptimizationImageItem object is null.");
            return;
        }
        a(dlmVar.o(), dlmVar.i(), healthTextView);
        b(dlmVar.e(), dlmVar.k(), healthTextView2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        healthTextView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        healthTextView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = healthTextView.getMeasuredHeight();
        int measuredHeight2 = healthTextView2.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = this.f26378c;
        if (i == 1) {
            int i2 = this.d;
            iD = (((((i2 - measuredHeight) - measuredHeight2) - qrs.d(this.e, 12.0f)) - qrs.d(this.e, 4.0f)) - qrs.d(this.e, 20.0f)) - qrs.d(this.e, 16.0f);
        } else if (i == 2) {
            int i3 = this.n;
            iD = (((i3 - measuredHeight) - qrs.d(this.e, 12.0f)) - qrs.d(this.e, 4.0f)) - qrs.d(this.e, 4.0f);
        } else {
            iD = qrs.d(this.e, 108.0f);
        }
        layoutParams.height = iD;
        layoutParams.width = iD;
        imageView.setLayoutParams(layoutParams);
        c(str, imageView);
    }

    private String a(dlm dlmVar) {
        if (dlmVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "getImageUrl object is null.");
            return "";
        }
        if (qrs.af(BaseApplication.getContext())) {
            String strH = dlmVar.h();
            return TextUtils.isEmpty(strH) ? dlmVar.j() : strH;
        }
        return dlmVar.j();
    }

    private void b(dlm dlmVar, int i, int i2, LinearLayout linearLayout, ImageView imageView) {
        if (linearLayout == null || imageView == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setInformationImageItem optimizationLayout or informationImageView is null.");
            return;
        }
        linearLayout.setVisibility(8);
        imageView.setVisibility(0);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(i, i2));
        qqf.b(imageView, dlmVar.j(), (int) this.e.getResources().getDimension(R.dimen.gridCornerRadius), 1, 0);
        b(dlmVar, imageView);
    }

    private View.OnClickListener b(final dlm dlmVar) {
        return new View.OnClickListener() { // from class: com.huawei.ui.main.stories.configuredpage.adpters.ConfiguredLayoutAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (dlmVar == null || qrs.r()) {
                    return;
                }
                int iM = dlmVar.m();
                if (iM != 3 && iM != 1 && iM != 2 && !Utils.isNotSupportBrowseUrl(dlmVar.c())) {
                    ConfiguredLayoutAdapter.this.c(dlmVar.o(), dlmVar.g());
                    tre.c(ConfiguredLayoutAdapter.this.e, dlmVar);
                } else {
                    LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.configuredpage.adpters.ConfiguredLayoutAdapter.3.5
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (i == 0) {
                                ConfiguredLayoutAdapter.this.c(dlmVar.o(), dlmVar.g());
                                tre.c(ConfiguredLayoutAdapter.this.e, dlmVar);
                            } else {
                                LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "getViewClickListener errorCode = ", Integer.valueOf(i));
                            }
                        }
                    }, AnalyticsValue.HEALTH_CONFIGURE_PAGE_FRAGMENT_2020029.value());
                }
            }
        };
    }

    private void b(dlm dlmVar, View view) {
        if (dlmVar == null || view == null) {
            return;
        }
        if (TextUtils.isEmpty(dlmVar.c())) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setOnClickListener() detailUrl is empty.");
        } else {
            view.setOnClickListener(b(dlmVar));
        }
    }

    private void c(String str, ImageView imageView) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            qqf.b(imageView, str, (int) this.e.getResources().getDimension(R.dimen.gridCornerRadius), 1, 0);
        } else {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "imageUrl is empty or imageView is null.");
        }
    }

    private void b(String str, int i, HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "textView is null.");
        } else if (TextUtils.isEmpty(str) || i != 1) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
    }

    private void a(String str, int i, HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "titleView is null.");
        } else if (TextUtils.isEmpty(str) || i != 1) {
            healthTextView.setVisibility(4);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
    }

    private void h(c cVar, int i) {
        int iA;
        if (cVar == null || njy.e(this.i)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setDiscoverItemLayout() holder or mListSingle or position is null.");
            return;
        }
        if (njy.e(this.i, i)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setDiscoverItemLayout() outOfBounds, position = ", Integer.valueOf(i));
            return;
        }
        dlm dlmVar = this.i.get(i);
        if (dlmVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setDiscoverItemLayout() cardItemObject is null.");
            return;
        }
        int iA2 = tre.a();
        if (this.i.size() == 3) {
            iA = (iA2 - (qqp.a(this.e, 40.0f) * 2)) / 3;
        } else {
            iA = iA2 / 4;
        }
        ViewGroup.LayoutParams layoutParams = cVar.m.getLayoutParams();
        layoutParams.width = iA;
        cVar.m.setLayoutParams(layoutParams);
        a(dlmVar.o(), dlmVar.i(), cVar.k);
        qqf.b(cVar.i, a(dlmVar), (int) this.e.getResources().getDimension(R.dimen.gridCornerRadius), 0, 0);
        b(dlmVar, cVar.m);
    }

    private void j(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setGraphicalSeparationLayout cardItemObject is null.");
            return;
        }
        String strA = a(dlmVarC);
        ViewGroup.LayoutParams layoutParams = cVar.ag.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = qqp.a(BaseApplication.getContext(), 54.0f);
            layoutParams2.width = (layoutParams2.height * 16) / 9;
            cVar.ag.setLayoutParams(layoutParams2);
        }
        qqf.b(cVar.ag, strA, qqf.e, 0, 0);
        a(dlmVarC.o(), dlmVarC.i(), cVar.bc);
        String strE = dlmVarC.e();
        int iK = dlmVarC.k();
        if (TextUtils.isEmpty(strE) || iK != 1) {
            cVar.ay.setVisibility(8);
        } else {
            cVar.ay.setVisibility(0);
            cVar.ay.setText(strE);
        }
        if (qrs.af(BaseApplication.getContext()) || i == this.i.size() - 1) {
            cVar.r.setVisibility(8);
        } else {
            cVar.r.setVisibility(0);
        }
        b(dlmVarC, cVar.ae);
    }

    private void n(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setSecondPalaceVerticalLayout object is null.");
            return;
        }
        int iA = tre.a(this.e, 8, this.l);
        ViewGroup.LayoutParams layoutParams = cVar.ax.getLayoutParams();
        layoutParams.width = iA;
        layoutParams.height = (iA * 9) / 21;
        cVar.ax.setLayoutParams(layoutParams);
        qqf.b(cVar.ao, a(dlmVarC), (int) this.e.getResources().getDimension(R.dimen.gridCornerRadius), 1, 0);
        a(dlmVarC.o(), dlmVarC.i(), cVar.aw);
        b(dlmVarC.e(), dlmVarC.k(), cVar.ar);
        b(dlmVarC, cVar.ax);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    private void i(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            return;
        }
        int iA = tre.a(this.e, this.j, this.l);
        ViewGroup.LayoutParams layoutParams = cVar.e.getLayoutParams();
        layoutParams.width = iA;
        int i2 = (iA * 9) / 21;
        int i3 = this.j;
        if (i3 == 2) {
            i2 = (iA * 2) / 3;
        } else if (i3 == 3) {
            i2 = iA;
        } else if (i3 == 4) {
            i2 = this.f ? (iA * 2) / 3 : iA / 2;
        } else if (i3 == 5) {
            i2 = iA;
        }
        layoutParams.height = i2;
        cVar.e.setLayoutParams(layoutParams);
        qqf.b(cVar.e, a(dlmVarC), qqf.d, 1, 0);
        if (this.f) {
            c(cVar, dlmVarC, iA, i2);
        } else {
            d(cVar, dlmVarC, iA, i2);
        }
        b(dlmVarC, cVar.f26381a);
    }

    private void c(c cVar, dlm dlmVar, int i, int i2) {
        String strO = dlmVar.o();
        int i3 = dlmVar.i();
        ViewGroup.LayoutParams layoutParams = cVar.f26381a.getLayoutParams();
        layoutParams.width = i;
        if (this.r == 1) {
            cVar.g.setVisibility(8);
            if (TextUtils.isEmpty(strO) || i3 != 1) {
                cVar.j.setVisibility(8);
            } else {
                cVar.j.setVisibility(0);
                cVar.j.setText(strO);
            }
            layoutParams.height = i2;
        } else {
            cVar.j.setVisibility(8);
            if (TextUtils.isEmpty(strO) || i3 != 1) {
                cVar.g.setVisibility(8);
            } else {
                cVar.g.setVisibility(0);
                cVar.h.setText(strO);
                b(dlmVar.e(), dlmVar.k(), cVar.f);
            }
            layoutParams.height = -2;
        }
        cVar.f26381a.setLayoutParams(layoutParams);
    }

    private void d(c cVar, dlm dlmVar, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = cVar.f26381a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        trh.b(cVar.j, cVar.g, cVar.h, dlmVar, this.r);
        int i3 = this.r;
        if (i3 != 1 && i3 != 2) {
            layoutParams.height = -2;
            if (!TextUtils.isEmpty(dlmVar.o()) && dlmVar.i() == 1) {
                cVar.g.setVisibility(0);
                b(dlmVar.e(), dlmVar.k(), cVar.f);
            }
        }
        cVar.f26381a.setLayoutParams(layoutParams);
    }

    private void a(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setActivityLayout cardItemObject is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar.w.getLayoutParams();
        int iA = tre.a(this.e, 6, this.l);
        int i2 = (iA * 9) / 21;
        layoutParams.width = iA;
        layoutParams.height = i2;
        cVar.w.setLayoutParams(layoutParams);
        e(cVar, dlmVarC, iA, i2);
        String strO = dlmVarC.o();
        int i3 = dlmVarC.i();
        if (dlmVarC.a() == 1) {
            d(cVar, i, strO, i3);
        } else {
            cVar.y.setVisibility(8);
            cVar.z.setVisibility(4);
            cVar.u.setVisibility(8);
            a(strO, i3, cVar.ac);
        }
        b(dlmVarC, cVar.w);
    }

    private void e(c cVar, dlm dlmVar, int i, int i2) {
        if (cVar == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "loadRoundImage holder or itemObject is null.");
            return;
        }
        String strA = a(dlmVar);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "loadRoundImage() imageUrl is empty.");
            return;
        }
        cVar.x.setLayoutParams(new RelativeLayout.LayoutParams(i, i2));
        qqf.b(cVar.x, strA, (int) this.e.getResources().getDimension(R.dimen.gridCornerRadius), 1, 0);
    }

    private void d(c cVar, int i, String str, int i2) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setHuaweiActivityLayout itemObject is null.");
            return;
        }
        String strL = dlmVarC.l();
        if (!TextUtils.isEmpty(strL)) {
            try {
                if (Integer.parseInt(strL) >= 0) {
                    cVar.u.setVisibility(0);
                    cVar.u.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_activity_social_people_attended, strL));
                } else {
                    cVar.u.setVisibility(8);
                }
            } catch (NumberFormatException e) {
                LogUtil.e("ConfiguredPage_ConfiguredLayoutAdapter", "setHuaweiActivityLayout NumberFormatException ", e.getMessage());
            }
        } else {
            cVar.u.setVisibility(8);
        }
        String strD = dlmVarC.d();
        String strF = dlmVarC.f();
        if (i2 == 1) {
            if (TextUtils.isEmpty(str)) {
                cVar.ac.setVisibility(8);
            } else {
                cVar.ac.setVisibility(0);
                cVar.ac.setText(str);
            }
            if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strF)) {
                cVar.y.setVisibility(8);
            } else {
                cVar.y.setVisibility(0);
                cVar.aa.setText(this.q.getGMTtoLocal(strD));
                cVar.v.setText(this.q.getGMTtoLocal(strF));
            }
        } else {
            cVar.ac.setVisibility(8);
            cVar.y.setVisibility(8);
        }
        b(dlmVarC, cVar, strD, strF);
    }

    private void b(dlm dlmVar, c cVar, String str, String str2) {
        if (dlmVar == null || cVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setDateAndStatusUi() itemObject or holder is null.");
            return;
        }
        int activityStatus = this.q.getActivityStatus(SharedPreferenceManager.e(this.e, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivityServerCurrentTime" + this.l), str, str2);
        if (activityStatus == 0) {
            cVar.z.setVisibility(0);
            cVar.z.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_activity_social_coming_soon));
            cVar.z.setBackground(this.e.getResources().getDrawable(R.drawable.activity_status_in_coming_bg));
        } else if (activityStatus == 1) {
            cVar.z.setVisibility(0);
            cVar.z.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_group_underway));
            cVar.z.setBackground(this.e.getResources().getDrawable(R.drawable.activity_status_in_progress_bg));
        } else if (activityStatus == -1) {
            cVar.z.setVisibility(0);
            cVar.z.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_activity_social_is_over));
            cVar.z.setBackground(this.e.getResources().getDrawable(R.drawable.activity_status_finished_bg));
        } else {
            cVar.z.setVisibility(8);
            LogUtil.a("ConfiguredPage_ConfiguredLayoutAdapter", "Activity Status is empty.");
        }
    }

    private void b(c cVar, int i) {
        String strA;
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setActivityLayout cardItemObject is null.");
            return;
        }
        int iA = tre.a(this.e, 6, this.l);
        int i2 = (iA * 9) / 16;
        ViewGroup.LayoutParams layoutParams = cVar.x.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = iA;
            layoutParams2.height = i2;
            cVar.x.setLayoutParams(layoutParams2);
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) cVar.w.getLayoutParams();
        layoutParams3.width = iA;
        layoutParams3.height = i2;
        cVar.w.setLayoutParams(layoutParams3);
        if (!TextUtils.isEmpty(dlmVarC.n())) {
            strA = dlmVarC.n();
        } else {
            strA = a(dlmVarC);
        }
        qqf.b(cVar.x, strA, 0, 1, 0);
        trh.d(cVar.ac, dlmVarC.o(), dlmVarC.i());
        trh.e(cVar.t, dlmVarC.e(), dlmVarC.k());
        trh.e(cVar.p, dlmVarC);
        trh.e(cVar.u, dlmVarC, this.o);
        if (dlmVarC.a() == 1) {
            g(cVar, i);
        } else {
            cVar.z.setVisibility(8);
        }
        b(dlmVarC, cVar.q);
    }

    private void l(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            return;
        }
        int iA = tre.a(this.e, this.j, this.l);
        ViewGroup.LayoutParams layoutParams = cVar.bg.getLayoutParams();
        layoutParams.width = iA;
        layoutParams.height = iA;
        cVar.bg.setLayoutParams(layoutParams);
        qqf.b(cVar.bg, a(dlmVarC), 0, 1, 0);
        if (dlmVarC.q() == 1) {
            cVar.bj.setVisibility(0);
        } else {
            cVar.bj.setVisibility(4);
        }
        int iP = dlmVarC.p();
        if (iP > 0) {
            cVar.bk.setVisibility(0);
            cVar.bh.setVisibility(0);
            cVar.bh.setText(String.valueOf(iP));
        } else {
            cVar.bk.setVisibility(8);
            cVar.bh.setVisibility(8);
        }
        a(dlmVarC.o(), dlmVarC.i(), cVar.bf);
        ViewGroup.LayoutParams layoutParams2 = cVar.be.getLayoutParams();
        layoutParams2.width = iA;
        layoutParams2.height = iA;
        cVar.be.setLayoutParams(layoutParams2);
        b(dlmVarC, cVar.bd);
    }

    private void g(c cVar, int i) {
        dlm dlmVarC = c(cVar, i);
        if (dlmVarC == null) {
            LogUtil.j("ConfiguredPage_ConfiguredLayoutAdapter", "setHuaweiActivityLayout itemObject is null.");
        } else {
            trh.e(cVar.z, dlmVarC, this.l, this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        HashMap map = new HashMap(7);
        map.put("click", "1");
        map.put(CommonUtil.PAGE_TYPE, Integer.valueOf(this.l));
        map.put("moduleType", Integer.valueOf(this.o));
        map.put("moduleName", this.m);
        map.put(Constants.BI_MODULE_ID, Integer.valueOf(this.k));
        map.put("name", str);
        map.put("id", Integer.valueOf(i));
        lmf.d().c(this.e, AnalyticsValue.HEALTH_CONFIGURE_PAGE_FRAGMENT_2020029.value(), map, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.g) {
            List<List<dlm>> list = this.f26377b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
        List<dlm> list2 = this.i;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RelativeLayout f26381a;
        private HealthTextView aa;
        private ImageView ab;
        private HealthTextView ac;
        private LinearLayout ad;
        private LinearLayout ae;
        private ImageView af;
        private ImageView ag;
        private LinearLayout ah;
        private ImageView ai;
        private HealthTextView aj;
        private ImageView ak;
        private ImageView al;
        private ImageView am;
        private LinearLayout an;
        private ImageView ao;
        private ImageView ap;
        private HealthTextView aq;
        private HealthTextView ar;
        private LinearLayout as;
        private HealthTextView at;
        private HealthTextView au;
        private HealthTextView av;
        private HealthTextView aw;
        private LinearLayout ax;
        private HealthTextView ay;
        private HealthTextView az;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f26382b;
        private HealthTextView ba;
        private HealthTextView bb;
        private HealthTextView bc;
        private RelativeLayout bd;
        private RelativeLayout be;
        private HealthTextView bf;
        private ImageView bg;
        private HealthTextView bh;
        private ImageView bj;
        private ImageView bk;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f26383c;
        private LinearLayout d;
        private ImageView e;
        private HealthTextView f;
        private LinearLayout g;
        private HealthTextView h;
        private ImageView i;
        private HealthTextView j;
        private HealthTextView k;
        private ImageView l;
        private LinearLayout m;
        private RelativeLayout n;
        private HealthTextView o;
        private HealthTextView p;
        private HealthCardView q;
        private HealthDivider r;
        private HealthTextView s;
        private HealthTextView t;
        private HealthTextView u;
        private HealthTextView v;
        private RelativeLayout w;
        private ImageView x;
        private LinearLayout y;
        private HealthTextView z;

        c(View view, int i, int i2, boolean z) {
            super(view);
            if (i2 == 2 || i2 == 4) {
                if (i == 5) {
                    g(view);
                    return;
                } else {
                    a(view);
                    return;
                }
            }
            if (i2 != 14) {
                switch (i2) {
                    case 6:
                        if (i == 3 && z) {
                            d(view);
                        } else if (i == 3) {
                            c(view);
                        } else {
                            a(view);
                        }
                        break;
                    case 7:
                        f(view);
                        break;
                    case 8:
                        j(view);
                        break;
                    case 9:
                        if (qrs.af(BaseApplication.getContext())) {
                            g(view);
                        } else {
                            o(view);
                        }
                        break;
                    case 10:
                        e(view);
                        break;
                    case 11:
                        i(view);
                        break;
                    case 12:
                        b(view);
                        break;
                    default:
                        a(view);
                        break;
                }
                return;
            }
            h(view);
        }

        private void e(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getDiscoverIconItemView() itemView is null.");
                return;
            }
            this.m = (LinearLayout) view.findViewById(R.id.item_discover_root_layout);
            this.i = (ImageView) view.findViewById(R.id.item_discover_icon);
            this.k = (HealthTextView) view.findViewById(R.id.item_discover_title);
        }

        private void a(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getCommonHolder() itemView is null.");
                return;
            }
            this.f26381a = (RelativeLayout) view.findViewById(R.id.item_common_root_layout);
            this.e = (ImageView) view.findViewById(R.id.item_common_image_view);
            this.j = (HealthTextView) view.findViewById(R.id.item_common_title);
            this.g = (LinearLayout) view.findViewById(R.id.item_common_text_area_layout);
            this.h = (HealthTextView) view.findViewById(R.id.item_common_text_area_title);
            this.f = (HealthTextView) view.findViewById(R.id.item_common_text_area_description);
        }

        private void b(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getApplicationServerImageTextGridItemView() itemView is null.");
                return;
            }
            this.d = (LinearLayout) view.findViewById(R.id.application_server_item_image_text_layout);
            this.f26382b = (ImageView) view.findViewById(R.id.application_server_item_image);
            this.f26383c = (HealthTextView) view.findViewById(R.id.application_server_item_title);
        }

        private void i(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getInformationImageTextGridItemView() itemView is null.");
                return;
            }
            this.n = (RelativeLayout) view.findViewById(R.id.information_item_image_text_layout);
            this.l = (ImageView) view.findViewById(R.id.information_item_image);
            this.s = (HealthTextView) view.findViewById(R.id.information_item_title);
            this.o = (HealthTextView) view.findViewById(R.id.information_item_description);
        }

        private void j(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getSecondPalaceVerticalHolder() itemView is null.");
                return;
            }
            this.ax = (LinearLayout) view.findViewById(R.id.item_configure_message_layout);
            this.ao = (ImageView) view.findViewById(R.id.img_item_configure);
            this.aw = (HealthTextView) view.findViewById(R.id.item_title);
            this.ar = (HealthTextView) view.findViewById(R.id.item_describe);
        }

        private void g(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getOptimizationGridItemView() itemView is null.");
                return;
            }
            this.as = (LinearLayout) view.findViewById(R.id.item_layout);
            this.aq = (HealthTextView) view.findViewById(R.id.item_title);
            this.aj = (HealthTextView) view.findViewById(R.id.item_describe);
            this.ap = (ImageView) view.findViewById(R.id.img_item);
        }

        private void o(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getVerticalImageAttachItemView() itemView is null.");
                return;
            }
            this.ad = (LinearLayout) view.findViewById(R.id.item_configure_big_layout);
            this.ak = (ImageView) view.findViewById(R.id.big_item_image);
            this.am = (ImageView) view.findViewById(R.id.top_item_image);
            this.al = (ImageView) view.findViewById(R.id.bottom_item_image);
            this.an = (LinearLayout) view.findViewById(R.id.item_configure_small_layout_top);
            this.ah = (LinearLayout) view.findViewById(R.id.item_configure_small_layout_bottom);
            this.ab = (ImageView) view.findViewById(R.id.img_item_configure_1);
            this.az = (HealthTextView) view.findViewById(R.id.item_title_1);
            this.au = (HealthTextView) view.findViewById(R.id.item_describe_1);
            this.af = (ImageView) view.findViewById(R.id.img_item_configure_2);
            this.ba = (HealthTextView) view.findViewById(R.id.item_title_2);
            this.av = (HealthTextView) view.findViewById(R.id.item_describe_2);
            this.ai = (ImageView) view.findViewById(R.id.img_item_configure_3);
            this.bb = (HealthTextView) view.findViewById(R.id.item_title_3);
            this.at = (HealthTextView) view.findViewById(R.id.item_describe_3);
        }

        private void f(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getImageLeftAndTextRightHolder() itemView is null.");
                return;
            }
            this.ae = (LinearLayout) view.findViewById(R.id.item_configure_image_text_layout);
            this.ag = (ImageView) view.findViewById(R.id.left_img_item_configure);
            this.bc = (HealthTextView) view.findViewById(R.id.text_area_title);
            this.ay = (HealthTextView) view.findViewById(R.id.text_area_description);
            this.r = (HealthDivider) view.findViewById(R.id.right_img_item_line);
        }

        private void c(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getHuaweiActivityHolder() itemView is null.");
                return;
            }
            this.q = (HealthCardView) view.findViewById(R.id.item_card);
            this.w = (RelativeLayout) view.findViewById(R.id.huawei_image_layout);
            this.x = (ImageView) view.findViewById(R.id.activity_image);
            this.z = (HealthTextView) view.findViewById(R.id.activity_status);
            this.ac = (HealthTextView) view.findViewById(R.id.activity_title);
            this.u = (HealthTextView) view.findViewById(R.id.activity_join_num);
            this.p = (HealthTextView) view.findViewById(R.id.page_attribute_text);
            this.t = (HealthTextView) view.findViewById(R.id.activity_description);
        }

        private void d(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getHuaweiActivityHolder() itemView is null.");
                return;
            }
            this.w = (RelativeLayout) view.findViewById(R.id.activity_layout);
            this.x = (ImageView) view.findViewById(R.id.activity_img);
            this.z = (HealthTextView) view.findViewById(R.id.activity_status);
            this.ac = (HealthTextView) view.findViewById(R.id.activity_title);
            this.y = (LinearLayout) view.findViewById(R.id.activity_duration);
            this.aa = (HealthTextView) view.findViewById(R.id.activity_start_date);
            this.v = (HealthTextView) view.findViewById(R.id.activity_end_date);
            this.u = (HealthTextView) view.findViewById(R.id.activity_join_num);
        }

        private void h(View view) {
            if (view == null) {
                LogUtil.j("ConfiguredPage_ConfiguredPageHolder", "getThreeGridListHolder() itemView is null.");
                return;
            }
            this.bd = (RelativeLayout) view.findViewById(R.id.item_three_list_root_layout);
            this.be = (RelativeLayout) view.findViewById(R.id.item_three_list_image_layout);
            this.bg = (ImageView) view.findViewById(R.id.item_three_list_image_view);
            this.bk = (ImageView) view.findViewById(R.id.item_three_list_icon);
            this.bj = (ImageView) view.findViewById(R.id.item_three_list_image_new);
            this.bh = (HealthTextView) view.findViewById(R.id.item_three_hot_amount);
            this.bf = (HealthTextView) view.findViewById(R.id.item_three_list_text_area_title);
        }
    }
}
