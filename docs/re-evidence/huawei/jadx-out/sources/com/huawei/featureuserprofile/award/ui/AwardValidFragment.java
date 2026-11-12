package com.huawei.featureuserprofile.award.ui;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.award.listener.OnClickAddressButtonListener;
import com.huawei.featureuserprofile.award.listener.OnClickCopyListener;
import com.huawei.featureuserprofile.award.model.AddressInfo;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.AwardRecordsBean;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class AwardValidFragment extends BaseFragment implements OnClickAddressButtonListener, OnClickCopyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AwardValidAdapter f5543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f5544c;
    private HealthRecycleView d;
    private List<AwardRecordsBean> e;

    public static AwardValidFragment b() {
        return new AwardValidFragment();
    }

    public void c(List<AwardRecordsBean> list) {
        List<AwardRecordsBean> list2 = this.e;
        if (list2 == null) {
            this.e = new ArrayList(list.size());
        } else {
            list2.clear();
        }
        this.e.addAll(list);
        e();
        AwardValidAdapter awardValidAdapter = this.f5543b;
        if (awardValidAdapter != null) {
            awardValidAdapter.e(this.e);
            this.f5543b.notifyDataSetChanged();
        }
    }

    public void c() {
        HealthRecycleView healthRecycleView = this.d;
        if (healthRecycleView != null) {
            healthRecycleView.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f5544c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    private void e() {
        RelativeLayout relativeLayout = this.f5544c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        HealthRecycleView healthRecycleView = this.d;
        if (healthRecycleView != null) {
            healthRecycleView.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_award_valid, (ViewGroup) null);
        this.d = (HealthRecycleView) viewInflate.findViewById(R.id.award_recycler_view);
        this.f5544c = (RelativeLayout) viewInflate.findViewById(R.id.award_empty_layout);
        this.d.setLayoutManager(new LinearLayoutManager(getActivity()));
        AwardValidAdapter awardValidAdapter = new AwardValidAdapter(getActivity());
        this.f5543b = awardValidAdapter;
        awardValidAdapter.a(this);
        this.f5543b.c(this);
        this.d.setAdapter(this.f5543b);
        return viewInflate;
    }

    @Override // com.huawei.featureuserprofile.award.listener.OnClickAddressButtonListener
    public void onClickAddressButton(AddressInfo addressInfo) {
        Intent intent = new Intent(getActivity(), (Class<?>) WriteDeliveryInfoActivity.class);
        intent.putExtra("address_info", addressInfo);
        startActivityForResult(intent, 100);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && intent != null) {
            c(intent.getIntExtra("click_pos", -1), intent.getStringExtra("mail_name"), intent.getStringExtra("mail_phone"), intent.getStringExtra("mail_address"), intent.getStringExtra("mail_remark"));
        }
    }

    private void c(int i, String str, String str2, String str3, String str4) {
        AwardValidAdapter awardValidAdapter;
        if (i == -1 || (awardValidAdapter = this.f5543b) == null || i >= awardValidAdapter.getItemCount() || !njy.b(this.f5543b.e())) {
            return;
        }
        AwardRecordsBean.MaillingBean maillingBean = new AwardRecordsBean.MaillingBean();
        maillingBean.setName(str);
        maillingBean.setTelephone(str2);
        maillingBean.setAddress(str3);
        maillingBean.setRemark(str4);
        this.f5543b.e().get(i).setMailling(maillingBean);
        this.f5543b.e().get(i).setExchangeStatus("is_exchange");
        this.f5543b.notifyItemChanged(i);
    }

    @Override // com.huawei.featureuserprofile.award.listener.OnClickAddressButtonListener
    public void onClickLinkButton(String str, String str2) {
        onClickCopy(str2);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AwardValidFragment", "onClickLinkButton url is empty");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(str.contains("?") ? "&" : "?");
        sb.append("pullFrom=51");
        String string = sb.toString();
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(string);
        LogUtil.a("AwardValidFragment", "skipUrl:", string);
    }

    @Override // com.huawei.featureuserprofile.award.listener.OnClickCopyListener
    public void onClickCopy(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AwardValidFragment", "onClickCopy code isempty");
            return;
        }
        Object systemService = ((FragmentActivity) Objects.requireNonNull(getActivity())).getSystemService("clipboard");
        if (!(systemService instanceof ClipboardManager)) {
            LogUtil.j("AwardValidFragment", "object not instanceof ClipboardManager");
            return;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            ClipData clipDataNewPlainText = ClipData.newPlainText("Label", str);
            ClipDescription description = clipDataNewPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            if (Build.VERSION.SDK_INT >= 33) {
                persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            } else {
                persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            }
            description.setExtras(persistableBundle);
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            if (Build.VERSION.SDK_INT < 33) {
                qpx.e(getActivity(), R.string.my_award_coupon_code_copied);
            }
        } catch (SecurityException unused) {
            LogUtil.e("AwardValidFragment", "securityException");
        }
    }
}
