package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.common.C;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.device.wifi.interfaces.CommBaseCallback;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.ClaimDataFatRateFluctuationFragment;
import com.huawei.ui.main.stories.health.fragment.ClaimDataSimilarOrNotMatchFragment;
import com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment;
import com.huawei.ui.main.stories.health.interactors.healthdata.SelectUserInterface;
import defpackage.dnj;
import defpackage.ean;
import defpackage.eau;
import defpackage.njy;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.qre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ClaimMeasureDataActivity extends BaseActivity implements SelectUserInterface, HealthToolBar.OnSingleTapListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ClaimMeasureDataFragment f27444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f27446c;
    private ArrayList<ClaimMeasureDataFragment> d = new ArrayList<>();
    private int e;
    private qpn f;
    private HealthToolBar g;
    private NoTitleCustomAlertDialog h;
    private boolean i;
    private String j;
    private HealthViewPager k;
    private CustomTitleBar l;
    private HealthSubTabWidget m;
    private CustomTextAlertDialog o;

    /* JADX INFO: loaded from: classes19.dex */
    public static class c extends StaticHandler<ClaimMeasureDataActivity> {
        c(ClaimMeasureDataActivity claimMeasureDataActivity) {
            super(claimMeasureDataActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessage(ClaimMeasureDataActivity claimMeasureDataActivity, Message message) {
            if (claimMeasureDataActivity != null && !claimMeasureDataActivity.isFinishing() && !claimMeasureDataActivity.isDestroyed()) {
                ClaimMeasureDataActivity.a(claimMeasureDataActivity, message);
            } else {
                LogUtil.e("PluginDevice_ClaimMeasureDataActivity", "ClaimMeasureDataActivity object is null or is Destroyed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(ClaimMeasureDataActivity claimMeasureDataActivity, Message message) {
        int i = message.what;
        if (i == 0) {
            Bundle data = message.getData();
            if (claimMeasureDataActivity.f27444a == null || data == null) {
                LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "mCurrentClaimMeasureData is null or MsgData is null");
                return;
            }
            claimMeasureDataActivity.f27444a.claimFinishAndChangeUi(data.getBoolean(ClaimMeasureDataFragment.CLAIM_DATA_FINISH_RESULT), data.getString(ClaimMeasureDataFragment.CLAIM_DATA_FINISH_USER_NAME));
            claimMeasureDataActivity.i = false;
            claimMeasureDataActivity.c(data.getString(ClaimMeasureDataFragment.CLAIM_DATA_FINISH_USER_ID));
            return;
        }
        switch (i) {
            case 2:
                ClaimWeightDataManager.INSTANCE.initShowTip();
                claimMeasureDataActivity.i();
                break;
            case 3:
                f(claimMeasureDataActivity);
                break;
            case 4:
                ClaimMeasureDataFragment claimMeasureDataFragment = claimMeasureDataActivity.f27444a;
                if (claimMeasureDataFragment != null) {
                    claimMeasureDataActivity.i = true;
                    claimMeasureDataFragment.saveWeightData();
                }
                break;
            case 5:
                ClaimMeasureDataFragment claimMeasureDataFragment2 = claimMeasureDataActivity.f27444a;
                if (claimMeasureDataFragment2 != null) {
                    claimMeasureDataFragment2.showDialog();
                }
                break;
            case 6:
                claimMeasureDataActivity.l();
                break;
            case 7:
                if (message.obj instanceof dnj) {
                    claimMeasureDataActivity.d((dnj) message.obj);
                }
                break;
            case 8:
                ClaimMeasureDataFragment claimMeasureDataFragment3 = claimMeasureDataActivity.f27444a;
                if (claimMeasureDataFragment3 != null) {
                    claimMeasureDataFragment3.sendClaimWeight();
                }
                break;
            default:
                LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "other");
                break;
        }
    }

    private static void f(ClaimMeasureDataActivity claimMeasureDataActivity) {
        claimMeasureDataActivity.d();
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "delete data success and start sync");
        ClaimWeightDataManager.INSTANCE.startSync();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_claim_measure_data_layout);
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "onCreate...");
        ClaimWeightDataManager.INSTANCE.initShowTip();
        this.f27446c = new c(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("productId");
            this.j = stringExtra;
            LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "getIntent mProductId = ", stringExtra);
        }
        j();
        a();
        f();
        ClaimWeightDataManager.INSTANCE.registerCallBack(getClass().getSimpleName(), new CommBaseCallback<ClaimMeasureDataActivity>(this) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.5
            @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onResult(ClaimMeasureDataActivity claimMeasureDataActivity, int i, String str, Object obj) {
                if (ClaimWeightDataManager.INSTANCE.getNewClaimDataCatch().size() > 0) {
                    LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "begin sendMessage CLAIM_WEIGHT_DATA_CHANGE_LIST_UI");
                    ClaimMeasureDataActivity.this.f27446c.sendEmptyMessage(2);
                } else {
                    LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "ClaimWeightDataManager.INSTANCE.getNewClaimDataCatch() = null");
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    private void f() {
        long jMax;
        boolean z = this.d.size() == 3;
        if (z) {
            Map<dnj, ArrayList<eau>> fatRateFluctuationDataBean = ClaimWeightDataManager.INSTANCE.getFatRateFluctuationDataBean();
            if (fatRateFluctuationDataBean.size() > 0) {
                jMax = 0;
                for (ArrayList<eau> arrayList : fatRateFluctuationDataBean.values()) {
                    if (!njy.e(arrayList)) {
                        jMax = Math.max(jMax, arrayList.get(0).e());
                    }
                }
            } else {
                jMax = 0;
            }
        } else {
            jMax = 0;
        }
        ArrayList<eau> similarWeightDataBean = ClaimWeightDataManager.INSTANCE.getSimilarWeightDataBean();
        ArrayList<eau> notMatchDataBean = ClaimWeightDataManager.INSTANCE.getNotMatchDataBean();
        long jE = njy.b(similarWeightDataBean) ? similarWeightDataBean.get(0).e() : 0L;
        long jE2 = njy.b(notMatchDataBean) ? notMatchDataBean.get(0).e() : 0L;
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList2.add(Long.valueOf(jMax));
        }
        arrayList2.add(Long.valueOf(jE));
        arrayList2.add(Long.valueOf(jE2));
        Long l = (Long) Collections.max(arrayList2);
        l.longValue();
        int iIndexOf = arrayList2.indexOf(l);
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "setCurrentItem fatRateTime: ", Long.valueOf(jMax), " similarTime: ", Long.valueOf(jE), " notMatchTime: ", Long.valueOf(jE2));
        this.k.setCurrentItem(iIndexOf);
    }

    private void j() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.custom_title_bar_weight_measure);
        this.l = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.transparent));
        this.l.setLeftButtonDrawable(getResources().getDrawable(R.drawable.ic_public_select_cancel), qre.f(R.string.accessibility_close));
        h();
        HealthToolBar healthToolBar = (HealthToolBar) findViewById(R.id.claim_weight_data_health_tool_bar);
        this.g = healthToolBar;
        healthToolBar.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        this.g.setIcon(1, R.drawable.measure_weight_data_no_delete);
        this.g.setIcon(2, R.drawable.measure_weight_data_no_mearsure);
        this.g.setIcon(3, R.drawable.ic_public_select_all);
        this.g.setIconTitleColor(1, getString(R.string.IDS_hw_health_show_healthdata_heart_delete), R.color.textColorTertiary);
        this.g.setIconTitleColor(2, getString(R.string.IDS_hw_weight_claim_data_claim), R.color.textColorTertiary);
        this.g.setIconTitle(3, getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select));
        this.g.setIconEnabled(1, false);
        this.g.setIconEnabled(2, false);
        this.g.a(this);
        this.g.setOnSingleTapListener(this);
    }

    private void h() {
        this.m = (HealthSubTabWidget) findViewById(R.id.fitness_detail_sub_tab_layout);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.hw_base_health_viewpager);
        this.k = healthViewPager;
        healthViewPager.setScrollHeightArea(200);
        this.k.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.1
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "onPageSelected position = ", Integer.valueOf(i));
                if (njy.c(ClaimMeasureDataActivity.this.d, i)) {
                    ClaimMeasureDataFragment claimMeasureDataFragment = (ClaimMeasureDataFragment) ClaimMeasureDataActivity.this.d.get(i);
                    if (ClaimMeasureDataActivity.this.f27444a != claimMeasureDataFragment) {
                        ClaimMeasureDataActivity.this.f27445b = false;
                        ClaimMeasureDataActivity.this.f27444a.setAllChooseItem(false);
                        ClaimMeasureDataActivity.this.f27444a = claimMeasureDataFragment;
                        return;
                    }
                    return;
                }
                LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "onPageSelected position is isOutOfBounds");
            }
        });
        this.k.setOffscreenPageLimit(3);
    }

    private void n() {
        if (this.e == 0) {
            if (this.g.d(2)) {
                this.l.setTitleText(getString(R.string.IDS_hw_show_main_health_page_healthdata_selectNone));
                this.g.setIcon(1, R.drawable.measure_weight_data_no_delete);
                this.g.setIcon(2, R.drawable.measure_weight_data_no_mearsure);
                this.g.setIcon(3, R.drawable.ic_public_select_all);
                this.g.setIconEnabled(1, false);
                this.g.setIconEnabled(2, false);
                this.g.setIconTitleColor(1, getString(R.string.IDS_hw_health_show_healthdata_heart_delete), R.color.textColorTertiary);
                this.g.setIconTitleColor(2, getString(R.string.IDS_hw_weight_claim_data_claim), R.color.textColorTertiary);
                this.g.setIconTitle(3, getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select));
                return;
            }
            return;
        }
        if (!this.g.d(2)) {
            this.g.setIcon(1, R.drawable.measure_weight_data_delete);
            this.g.setIcon(2, R.drawable.measure_weight_data_cmearsure);
            this.g.setIconEnabled(1, true);
            this.g.setIconEnabled(2, true);
            this.g.setIconTitleColor(1, getString(R.string.IDS_hw_health_show_healthdata_heart_delete), R.color.textColorPrimary);
            this.g.setIconTitleColor(2, getString(R.string.IDS_hw_weight_claim_data_claim), R.color.textColorPrimary);
        }
        Resources resources = getResources();
        int i = R.plurals.IDS_hw_weight_delete_check_measure_data;
        int i2 = this.e;
        this.l.setTitleText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        ClaimMeasureDataFragment claimMeasureDataFragment = this.f27444a;
        if (this.e == (claimMeasureDataFragment != null ? claimMeasureDataFragment.getListSize() : 0)) {
            this.f27445b = true;
            this.g.setIcon(3, R.drawable.measure_weight_data_all_check);
            this.g.setIconTitle(3, getString(R.string.IDS_contact_delete_uncheck_all));
        } else {
            this.f27445b = false;
            this.g.setIcon(3, R.drawable.ic_public_select_all);
            this.g.setIconTitle(3, getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select));
        }
    }

    private void a() {
        if (this.f == null) {
            this.f = new qpn(this, this.k, this.m);
            e(1, R.string.IDS_hw_weight_similar, !e());
            e(2, R.string.IDS_hw_claim_not_match, false);
            this.f27444a = this.d.get(0);
            this.k.setOffscreenPageLimit(3);
        }
        ArrayList<HiHealthData> claimDataCatch = ClaimWeightDataManager.INSTANCE.getClaimDataCatch();
        if (njy.e(claimDataCatch)) {
            LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "initData claimDataCatch is empty, begin startSync");
            ClaimWeightDataManager.INSTANCE.startSync();
        } else {
            LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "initData claimDataCatch not Empty size = ", Integer.valueOf(claimDataCatch.size()));
        }
    }

    private void e(int i, int i2, boolean z) {
        ClaimDataSimilarOrNotMatchFragment claimDataSimilarOrNotMatchFragment = new ClaimDataSimilarOrNotMatchFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("pagetype", i);
        bundle.putString("productId", this.j);
        claimDataSimilarOrNotMatchFragment.setArguments(bundle);
        claimDataSimilarOrNotMatchFragment.setUserInterfaceAndHandler(this, this.f27446c);
        this.f.b(this.m.b(getResources().getString(i2)), claimDataSimilarOrNotMatchFragment, z);
        this.d.add(claimDataSimilarOrNotMatchFragment);
        this.f.notifyDataSetChanged();
    }

    private boolean e() {
        if (ClaimWeightDataManager.INSTANCE.getFatRateFluctuationDataBean().size() <= 0) {
            return false;
        }
        ClaimDataFatRateFluctuationFragment claimDataFatRateFluctuationFragment = new ClaimDataFatRateFluctuationFragment();
        claimDataFatRateFluctuationFragment.setUserInterfaceAndHandler(this, this.f27446c);
        this.f.e(this.m.b(getResources().getString(R.string.IDS_hw_fatrate_fluctuation)), 0, claimDataFatRateFluctuationFragment, true);
        this.d.add(0, claimDataFatRateFluctuationFragment);
        this.f.notifyDataSetChanged();
        return true;
    }

    private void g() {
        if (ClaimWeightDataManager.INSTANCE.getFatRateFluctuationDataBean().size() == 0) {
            this.f.b(0);
            this.d.remove(0);
            this.f.notifyDataSetChanged();
        }
    }

    private void i() {
        if (this.f == null) {
            LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "mSubTabFragmentPagerAdapter is null");
            return;
        }
        if (njy.e(this.d)) {
            LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "refreshClaimDataList mClaimMeasureDataList is empty");
            return;
        }
        ArrayList<HiHealthData> claimDataCatch = ClaimWeightDataManager.INSTANCE.getClaimDataCatch();
        if (njy.b(claimDataCatch)) {
            LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "refreshClaimDataList claimDataCatch not Empty size = ", Integer.valueOf(claimDataCatch.size()));
            if (this.d.size() == 3) {
                g();
            } else {
                e();
            }
            Iterator<ClaimMeasureDataFragment> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().setList();
            }
            return;
        }
        LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "refreshClaimDataList claimWeightDataBean is empty, begin startSync");
        ClaimWeightDataManager.INSTANCE.startSync();
    }

    private void d(dnj dnjVar) {
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "user.getName()", dnjVar.h());
        String string = getString(R.string.IDS_hw_weight_measure_data_claim_hint, new Object[]{dnjVar.h()});
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "content", string);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_hw_weight_measure_data_claim).a(string).e(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimMeasureDataActivity.this.o.dismiss();
            }
        }).a(R.string.IDS_hw_weight_claim_data_claim, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimMeasureDataActivity.this.o.dismiss();
                ClaimMeasureDataActivity.this.f27446c.sendEmptyMessage(8);
            }
        }).b();
        this.o = customTextAlertDialogB;
        customTextAlertDialogB.show();
    }

    private void l() {
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "syncDataStart in");
        this.f27446c.removeMessages(6);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(HiSyncType.HiSyncDataType.f12263a);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(this).synCloud(hiSyncOption, new HiCommonListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "syncDataStart onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "syncDataStart onFailure");
            }
        });
    }

    @Override // com.huawei.ui.main.stories.health.interactors.healthdata.SelectUserInterface
    public void selectItem(int i, int i2) {
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "selectItem dataSize:", Integer.valueOf(i), " listSize:", Integer.valueOf(i2));
        this.e = i2;
        n();
    }

    @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
    public void onSingleTap(int i) {
        if (i == 1) {
            if (this.e > 0) {
                b();
            }
        } else if (i == 2) {
            if (this.e > 0) {
                this.f27444a.claimMeasureData();
            }
        } else if (i != 3) {
            LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "onSingleTap default");
        } else {
            if (this.i) {
                LogUtil.j("PluginDevice_ClaimMeasureDataActivity", "onSingleTap is Claiming or Deleting");
                return;
            }
            boolean z = !this.f27445b;
            this.f27445b = z;
            this.f27444a.setAllChooseItem(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f27446c.removeMessages(6);
        ClaimMeasureDataFragment claimMeasureDataFragment = this.f27444a;
        if (claimMeasureDataFragment != null) {
            this.i = true;
            claimMeasureDataFragment.deleteWeightData();
        }
    }

    private void d() {
        this.f27446c.sendEmptyMessageDelayed(6, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        this.f27444a.removeItem();
        this.i = false;
        qpx.e(this, R.string.IDS_hw_weight_claim_data_delete_success_hint);
    }

    private void b() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).b(R.string.IDS_hw_weight_delete_data_hint).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimMeasureDataActivity.this.h.dismiss();
            }
        }).c(R.string.IDS_hw_health_show_healthdata_heart_delete, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimMeasureDataActivity.this.h.dismiss();
                ClaimMeasureDataActivity.this.c();
            }
        }).c();
        this.h = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.h.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1) {
            if (intent == null && this.f27444a == null) {
                LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "onActivityResult mCurrentClaimMeasureData is null or data is null");
            } else {
                this.f27444a.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.f27446c.hasMessages(6)) {
            this.f27446c.removeMessages(6);
            l();
        }
        super.onDestroy();
        ClaimWeightDataManager.INSTANCE.startSync();
        ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        ean.d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    private void c(String str) {
        boolean z;
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser != null) {
            String strI = mainUser.i();
            if (TextUtils.isEmpty(strI) || !strI.equals(str)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Intent intent = new Intent();
        HashMap map = new HashMap(1);
        if (z) {
            str = "";
        }
        map.put("uid", str);
        String strD = HiJsonUtil.d(map);
        intent.putExtra("result", strD);
        LogUtil.a("PluginDevice_ClaimMeasureDataActivity", "setResult json ", strD);
        setResult(-1, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
