package com.huawei.ui.main.stories.configuredpage.views;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.sport.configuredpage.ConfiguredPageItemDecoration;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.configuredpage.ConfigureServerDetailActivity;
import com.huawei.ui.main.stories.configuredpage.adpters.ConfiguredLayoutAdapter;
import defpackage.dlm;
import defpackage.dlo;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.tre;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ConfiguredPageLinearLayout extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f26387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26388c;
    private boolean d;
    private LinearLayout e;
    private boolean f;
    private dlo g;
    private Pair<Integer, Integer> h;
    private int i;
    private int j;
    private List<dlm> k;
    private int l;
    private HealthRecycleView m;
    private List<List<dlm>> o;

    public ConfiguredPageLinearLayout(Context context) {
        super(context);
        this.o = new ArrayList(10);
        this.d = false;
        this.f = false;
        this.l = 1;
        this.h = BaseActivity.getSafeRegionWidth();
        e(context);
    }

    public ConfiguredPageLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new ArrayList(10);
        this.d = false;
        this.f = false;
        this.l = 1;
        this.h = BaseActivity.getSafeRegionWidth();
        e(context);
    }

    public ConfiguredPageLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new ArrayList(10);
        this.d = false;
        this.f = false;
        this.l = 1;
        this.h = BaseActivity.getSafeRegionWidth();
        e(context);
    }

    private void e(Context context) {
        this.f26386a = context;
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.configured_page_parent_layout, this);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.layout_configured_page);
        this.e = linearLayout;
        linearLayout.setVisibility(0);
        this.m = (HealthRecycleView) viewInflate.findViewById(R.id.configured_page_recycler_view);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.configure_page_sub_header);
        this.f26387b = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.m.setNestedScrollingEnabled(false);
        this.m.setHasFixedSize(true);
        this.m.b(false);
        this.m.e(false);
        this.f26388c = qqp.b(this.f26386a);
        this.d = qrs.t();
        boolean zAf = qrs.af(BaseApplication.getContext());
        this.f = zAf;
        if (this.d && zAf) {
            this.l = getTahitiOrientation();
        }
    }

    private int getTahitiOrientation() {
        Resources resources = BaseApplication.getContext().getResources();
        if (resources == null) {
            return 1;
        }
        return resources.getConfiguration().orientation;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String strD = this.g.d();
        try {
            if (this.j == 12) {
                c();
                Intent intent = new Intent(this.f26386a, (Class<?>) ConfigureServerDetailActivity.class);
                intent.putExtra("server_name", this.g);
                intent.setFlags(268435456);
                this.f26386a.startActivity(intent);
                return;
            }
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            c();
            if (strD.contains("h5pro=true")) {
                tre.d(this.f26386a, strD);
                return;
            }
            Intent intent2 = new Intent(this.f26386a, (Class<?>) WebViewActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtra("url", strD);
            this.f26386a.startActivity(intent2);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("ConfiguredPage_ConfiguredPageLinearLayout", "StartActivity exception", e.getMessage());
        }
    }

    public void a(dlo dloVar) {
        ConfiguredLayoutAdapter configuredLayoutAdapter;
        this.g = dloVar;
        if (dloVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "initData() pageModuleObject is null.");
            return;
        }
        this.j = dloVar.c();
        d();
        int iA = this.g.a();
        this.i = this.g.j();
        if (!tre.e(iA, this.j)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "updateConfiguredPageUi() moduleType:", Integer.valueOf(iA), " is not support layout: ", Integer.valueOf(this.j));
            return;
        }
        List<dlm> listE = this.g.e();
        if (njy.e(listE)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "updateConfiguredPageUi() allCardItemObjectList is empty.");
            return;
        }
        List<dlm> listA = tre.a(this.j, iA, listE);
        this.k = listA;
        if (njy.e(listA)) {
            this.e.setVisibility(8);
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "updateConfiguredPageUi() showCardItemObjectList is empty.");
            return;
        }
        if (this.j == 9 && !qrs.af(BaseApplication.getContext())) {
            this.o.clear();
            this.o.add(this.k);
        }
        if (!qrs.af(BaseApplication.getContext()) && this.j == 9) {
            configuredLayoutAdapter = new ConfiguredLayoutAdapter(this.f26386a, this.o, this.g, true);
        } else if (this.j == 12) {
            configuredLayoutAdapter = new ConfiguredLayoutAdapter(this.f26386a, getAppIconData(), this.g);
        } else {
            configuredLayoutAdapter = new ConfiguredLayoutAdapter(this.f26386a, this.k, this.g);
        }
        this.m.setAdapter(configuredLayoutAdapter);
        b();
        e();
    }

    private void d() {
        if (this.j == 7) {
            this.m.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.configured_item_image_text_background));
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
                int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
                layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) this.h.first).intValue());
                layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) this.h.second).intValue());
                this.m.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        this.m.setBackground(null);
    }

    private List<dlm> getAppIconData() {
        ArrayList arrayList = new ArrayList();
        if (njy.e(this.k)) {
            return arrayList;
        }
        List<dlm> list = this.k;
        if (this.f || list.size() <= 4) {
            return (!this.f || list.size() <= 8) ? list : list.subList(0, 8);
        }
        return list.subList(0, 4);
    }

    private void b() {
        if (this.g == null) {
            return;
        }
        LinearLayout.LayoutParams subHeaderParams = getSubHeaderParams();
        if (this.j == 10) {
            this.f26387b.setVisibility(4);
            if (subHeaderParams != null) {
                subHeaderParams.height = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
                return;
            }
            return;
        }
        String strF = this.g.f();
        if (this.g.b() != 1 || TextUtils.isEmpty(strF)) {
            this.f26387b.setVisibility(4);
            if (subHeaderParams != null) {
                subHeaderParams.height = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
                return;
            }
            return;
        }
        this.f26387b.setVisibility(0);
        this.f26387b.setHeadTitleText(strF);
        if (this.j != 12) {
            if (!TextUtils.isEmpty(this.g.d())) {
                this.f26387b.setMoreLayoutVisibility(0);
                this.f26387b.setMoreViewClickListener(this);
            } else {
                this.f26387b.setMoreLayoutVisibility(8);
            }
        } else if ((this.f && this.k.size() > 8) || (!this.f && this.k.size() > 4)) {
            this.f26387b.setMoreLayoutVisibility(0);
            this.f26387b.setMoreViewClickListener(this);
        } else {
            this.f26387b.setMoreLayoutVisibility(8);
        }
        this.f26387b.setSubHeaderBackgroundColor(0);
    }

    private LinearLayout.LayoutParams getSubHeaderParams() {
        ViewGroup.LayoutParams layoutParams = this.f26387b.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int i = layoutParams2.leftMargin;
            int i2 = layoutParams2.rightMargin;
            layoutParams2.leftMargin = i + ((Integer) this.h.first).intValue();
            layoutParams2.rightMargin = i2 + ((Integer) this.h.second).intValue();
        }
        return layoutParams2;
    }

    public boolean a() {
        return !njy.e(this.k);
    }

    private void e() {
        a(tre.b(this.j, this.f, this.k.size()), tre.c(this.j, this.f, this.k.size(), this.f26388c), tre.b(this.j), tre.a(this.g.i(), this.j));
    }

    private void a(int i, int i2, int i3, int[] iArr) {
        GridLayoutManager gridLayoutManager;
        if (this.f26386a == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "setRecyclerViewLayout() mContext is null.");
            return;
        }
        if (njy.e(this.k) && njy.e(this.o)) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "setRecyclerViewLayout() mShowList or mGridVerticalList is empty.");
            return;
        }
        if (i < 1) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "setRecyclerViewLayout() gridNumber should be at least 1.");
            return;
        }
        if (this.i == 2) {
            gridLayoutManager = new GridLayoutManager(this.f26386a, 1);
            gridLayoutManager.setOrientation(0);
        } else {
            gridLayoutManager = new GridLayoutManager(this.f26386a, i);
            gridLayoutManager.setOrientation(1);
        }
        this.m.setLayoutManager(gridLayoutManager);
        if (this.m.getItemDecorationCount() > 0) {
            this.m.removeItemDecorationAt(0);
        }
        this.m.addItemDecoration(new ConfiguredPageItemDecoration(i2, i3, i, iArr));
        this.m.setHasFixedSize(true);
        this.m.setNestedScrollingEnabled(false);
        this.m.setVisibility(0);
    }

    public void d(dlo dloVar) {
        if (dloVar == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageLinearLayout", "refreshUiChanged() pageModuleObject is null");
            return;
        }
        boolean zEquals = this.g.toString().equals(dloVar.toString());
        LogUtil.d("ConfiguredPage_ConfiguredPageLinearLayout", "refreshUiChanged() isSameObject = ", Boolean.valueOf(zEquals));
        if (zEquals) {
            boolean zAf = qrs.af(BaseApplication.getContext());
            int tahitiOrientation = getTahitiOrientation();
            if (this.d) {
                if (this.f == zAf && this.l == tahitiOrientation) {
                    return;
                }
                this.f = zAf;
                this.l = tahitiOrientation;
                if (this.j == 9) {
                    a(dloVar);
                    return;
                } else {
                    e();
                    return;
                }
            }
            return;
        }
        a(dloVar);
    }

    private void c() {
        HashMap map = new HashMap(6);
        map.put("click", "1");
        map.put(CommonUtil.PAGE_TYPE, Integer.valueOf(this.g.i()));
        map.put("moduleType", Integer.valueOf(this.g.a()));
        map.put("moduleName", this.g.f());
        map.put(Constants.BI_MODULE_ID, Integer.valueOf(this.g.h()));
        map.put("layout", Integer.valueOf(this.j));
        lmf.d().c(this.f26386a, AnalyticsValue.HEALTH_CONFIGURE_PAGE_MORE_FRAGMENT.value(), map, 0);
    }
}
