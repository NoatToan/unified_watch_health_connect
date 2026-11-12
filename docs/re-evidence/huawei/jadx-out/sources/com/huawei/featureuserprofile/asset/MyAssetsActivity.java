package com.huawei.featureuserprofile.asset;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.award.ui.MyAwardActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MyAssetsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f5509a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f5510b = new d(this.f5509a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5511c;
    private String d;
    private String e;
    private String f;
    private HealthButton g;
    private boolean j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_assets);
        this.f5511c = this;
        b();
        d();
    }

    private void d() {
        HealthButton healthButton = (HealthButton) findViewById(R.id.btn_use_code);
        this.g = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: cvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        this.g.setVisibility(Utils.o() ? 8 : 0);
        e();
    }

    public /* synthetic */ void b(View view) {
        j();
        a(4);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a();
    }

    private void b() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("MyAssets", "getData intent is null");
            return;
        }
        this.f = intent.getStringExtra("coupon");
        this.d = intent.getStringExtra("card_case");
        this.e = intent.getStringExtra("award");
        this.j = intent.getBooleanExtra("point", false);
        LogUtil.a("MyAssets", "mCouponTime:", this.f, " mCardCaseTime:", this.d, " mAwardTime:", this.e);
    }

    private void a() {
        LogUtil.a("MyAssets", "enter checkRedPoint");
        if (njy.e(this.f5509a) || this.f5510b == null) {
            ReleaseLogUtil.a("MyAssets", "checkRedPoint with null, return");
            return;
        }
        for (a aVar : this.f5509a) {
            if (aVar != null) {
                int i = aVar.e;
                if (i == R.string.IDS_coupons) {
                    aVar.e(!TextUtils.isEmpty(this.f));
                } else if (i == R.string.IDS_card_case) {
                    aVar.e(!TextUtils.isEmpty(this.d));
                } else if (i == R.string.IDS_prize) {
                    aVar.e(!TextUtils.isEmpty(this.e));
                } else {
                    aVar.e(this.j);
                }
            }
        }
        this.f5510b.e(this.f5509a);
    }

    public void b(int i) {
        if (qrs.r()) {
            LogUtil.a("MyAssets", "click too fast");
            return;
        }
        if (i == R.string.IDS_coupons) {
            h();
            qhu.e(4, 2);
            return;
        }
        if (i == R.string.IDS_card_case) {
            g();
            qhu.e(3, 2);
            return;
        }
        if (i == R.string.IDS_prize) {
            f();
            Intent intent = new Intent(this.f5511c, (Class<?>) MyAwardActivity.class);
            intent.putExtra("from", "1");
            this.f5511c.startActivity(intent);
            a(3);
            return;
        }
        if (i == R.string.IDS_active_task_asset_point) {
            c();
            a(5);
        } else {
            LogUtil.j("MyAssets", "onClick default");
        }
    }

    private void c() {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.external-task?h5pro=true&urlType=4&pName=com.huawei.health&isImmerse&path=mypoints"));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        lsx.c(intent, BaseApplication.b());
        this.j = false;
    }

    private void j() {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&path=MembersExchange&pName=com.huawei.health&h5pro=true&from=2"));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        lsx.c(intent, getApplicationContext());
    }

    private static void a(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("activity", 2);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MY_ASSET_ENTRANCE_2120121.value(), map, 0);
    }

    private void h() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        String accountInfo = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1011);
        SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_coupon_time", this.f, new StorageParams());
        this.f = "";
    }

    private void g() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        String accountInfo = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1011);
        SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_card_time", this.d, new StorageParams());
        this.d = "";
    }

    private void f() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        long jI = CommonUtil.i(this.e);
        String accountInfo = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1011);
        SharedPreferenceManager.c(Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_award_time", jI);
        this.e = "";
    }

    private void e() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.assets_recycle);
        this.f5509a.add(new a(R.string.IDS_coupons, R.drawable.ic_couponts, !TextUtils.isEmpty(this.f)));
        this.f5509a.add(new a(R.string.IDS_card_case, R.drawable.ic_card_case, !TextUtils.isEmpty(this.d)));
        this.f5509a.add(new a(R.string.IDS_prize, R.drawable.ic_prize, !TextUtils.isEmpty(this.e)));
        if (ActiveTipStringUtils.c()) {
            this.f5509a.add(new a(R.string.IDS_active_task_asset_point, R.drawable.ic_point, this.j));
        }
        this.f5510b.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: cva
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.f31376c.d(recyclerHolder, i, obj);
            }
        });
        healthRecycleView.setAdapter(this.f5510b);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this));
        this.f5510b.e(this.f5509a);
    }

    public /* synthetic */ void d(RecyclerHolder recyclerHolder, int i, Object obj) {
        if (obj instanceof a) {
            b(((a) obj).e);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class d extends BaseRecyclerAdapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<a> f5513a;

        public d(List<a> list) {
            super(list, R.layout.activity_my_assets_item);
            this.f5513a = new ArrayList();
        }

        @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void convert(RecyclerHolder recyclerHolder, int i, a aVar) {
            LogUtil.a("MyAssets", "convert holder ", recyclerHolder, " itemData ", aVar, " position ", Integer.valueOf(i));
            if (recyclerHolder == null || aVar == null || njy.e(this.f5513a)) {
                return;
            }
            if (i == this.f5513a.size() - 1) {
                recyclerHolder.d(R.id.assets_divider).setVisibility(8);
            } else {
                recyclerHolder.d(R.id.assets_divider).setVisibility(0);
            }
            ((HealthTextView) recyclerHolder.d(R.id.assets_text)).setText(aVar.e);
            recyclerHolder.d(R.id.assets_red_point).setVisibility(aVar.f5512b ? 0 : 8);
            Drawable drawableC = qre.c(aVar.d);
            if (LanguageUtil.ba(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
                ((ImageView) recyclerHolder.d(R.id.assets_arrow)).setBackgroundResource(R.drawable.common_ui_arrow_left);
                drawableC = qqz.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), drawableC);
            }
            ((ImageView) recyclerHolder.d(R.id.assets_icon)).setImageDrawable(drawableC);
        }

        public void e(List<a> list) {
            this.f5513a = list;
            refreshDataChange(list);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5512b;
        private final int d;
        private final int e;

        a(int i, int i2, boolean z) {
            this.e = i;
            this.d = i2;
            this.f5512b = z;
        }

        public void e(boolean z) {
            this.f5512b = z;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
