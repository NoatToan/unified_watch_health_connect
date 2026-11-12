package com.huawei.health.health.utils.vippage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.eyd;
import defpackage.fcc;
import defpackage.fcd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class MemberCenterBootPagerHelper extends MemberBaseBootPageHelper {
    public MemberCenterBootPagerHelper(Context context) {
        super(context);
    }

    @Override // com.huawei.health.health.utils.vippage.MemberBaseBootPageHelper
    protected String getSharePreferenceString() {
        return "IS_FIRST_ENTER_MEMBER_CENTER";
    }

    @Override // com.huawei.health.health.utils.vippage.MemberBaseBootPageHelper
    protected void configBootPage() {
        eyd eydVar = new eyd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.drawable.member_center_boot_page_1));
        eydVar.e(arrayList);
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1002);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Hi, " + accountInfo);
        eydVar.c(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(BaseApplication.getContext().getString(R.string.IDS_member_center_description));
        eydVar.a(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(BaseApplication.getContext().getString(R.string.IDS_member_center_start_trip));
        eydVar.d(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(BaseApplication.getContext().getString(R.string.IDS_member_center_plan_recommend));
        eydVar.b(arrayList5);
        fcc fccVar = new fcc(this.mContext, eydVar);
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.member_guide_page, (ViewGroup) null, false);
        this.mBootPageDialog = new fcd(this.mContext, viewInflate);
        fccVar.b(this.mBootPageDialog);
        fccVar.e(viewInflate.findViewById(R.id.member_guide_page_layout));
        HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.member_boot_view_pager);
        fccVar.c(healthViewPager);
        healthViewPager.setAdapter(fccVar);
    }
}
