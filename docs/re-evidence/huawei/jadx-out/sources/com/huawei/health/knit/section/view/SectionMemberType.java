package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.section.adapter.SectionMemberTypeAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.irz;
import defpackage.njy;
import defpackage.qqw;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMemberType extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f7833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionMemberTypeAdapter f7834c;
    private boolean d;
    private Context e;
    private boolean g;
    private Product h;
    private HealthSubHeader i;
    private HealthRecycleView j;

    public SectionMemberType(Context context) {
        this(context, null);
    }

    public SectionMemberType(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionMemberType(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.g = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_member_type, (ViewGroup) this, false);
        this.e = context;
        Bundle extra = (getKnitFragment() == null || getKnitFragment().getPageResTrigger() == null) ? null : getKnitFragment().getPageResTrigger().getExtra();
        this.f7833b = extra;
        if (extra != null) {
            this.f7832a = extra.getBoolean("is_guardian_mode", false);
            LogUtil.a("SectionMemberProduct", "mIsGuardianMode: " + this.f7832a);
        }
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_member_type_header);
        this.i = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(context, R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section_member_type_recyclerview);
        this.j = healthRecycleView;
        healthRecycleView.setHasFixedSize(true);
        this.j.setNestedScrollingEnabled(false);
        this.j.b(false);
        this.j.e(false);
        this.j.setLayoutManager(new HealthLinearLayoutManager(context, 0, false));
        this.j.addItemDecoration(new c(context.getResources().getDimensionPixelSize(R.dimen.health_common_8dp), context.getResources().getDimensionPixelSize(R.dimen.health_common_12dp)));
        SectionMemberTypeAdapter sectionMemberTypeAdapter = new SectionMemberTypeAdapter();
        this.f7834c = sectionMemberTypeAdapter;
        sectionMemberTypeAdapter.b(this.f7832a);
        this.j.setAdapter(this.f7834c);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionMemberProduct";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        List<Product> listA = qqw.a((Map) map, "PRODUCT", Product.class, (List) null);
        int iC = qqw.c(map, CommonConstant.RETKEY.STATUS, 0);
        boolean zA = qqw.a(map, "IS_SHOW_TOAST", false);
        this.g = zA;
        this.i.setVisibility(zA ? 8 : 0);
        OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        LogUtil.a("SectionMemberProduct", "products: ", Integer.valueOf(listA != null ? listA.size() : 0), " selectedIndex: ", Integer.valueOf(iC));
        c(listA, iC, onClickSectionListenerC);
    }

    private void c(List<Product> list, int i, OnClickSectionListener onClickSectionListener) {
        LogUtil.a("SectionMemberProduct", "refreshLayout selectedIndex: ", Integer.valueOf(i));
        if (njy.e(list, i)) {
            return;
        }
        d();
        this.h = list.get(i);
        this.f7834c.e(list);
        this.f7834c.d(i);
        this.f7834c.c(onClickSectionListener);
        this.f7834c.notifyDataSetChanged();
        this.j.scrollToPosition(i);
        Handler outHandler = getKnitFragment() != null ? getKnitFragment().getOutHandler() : null;
        if (outHandler != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("PRODUCTS", new ArrayList<>(list));
            bundle.putInt("MEMBER_TYPE_SELECT_INDEX", i);
            outHandler.sendMessage(outHandler.obtainMessage(100, bundle));
        }
    }

    private void d() {
        if (this.i == null) {
            return;
        }
        UserMemberInfo userMemberInfoA = irz.a();
        this.i.setHeadTitleText(getResources().getString(userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1 ? R.string.IDS_vip_open_vip : R.string.IDS_vip_renew_vip));
    }

    static class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7836c;

        public c(int i, int i2) {
            this.f7835b = i;
            this.f7836c = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemCount = adapter.getItemCount();
            if (itemCount == 1) {
                rect.left = this.f7836c;
                rect.right = this.f7836c;
                return;
            }
            if (childAdapterPosition == 0) {
                i = this.f7836c;
                i2 = this.f7835b / 2;
            } else if (childAdapterPosition == itemCount - 1) {
                i = this.f7835b / 2;
                i2 = this.f7836c;
            } else {
                i = this.f7835b / 2;
                i2 = i;
            }
            if (LanguageUtil.ba(BaseApplication.b())) {
                rect.left = i2;
                rect.right = i;
            } else {
                rect.left = i;
                rect.right = i2;
            }
        }
    }
}
