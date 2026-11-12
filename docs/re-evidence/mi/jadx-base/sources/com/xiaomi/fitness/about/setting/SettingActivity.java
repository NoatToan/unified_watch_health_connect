package com.xiaomi.fitness.about.setting;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.about.AboutViewModel;
import com.xiaomi.fitness.about.preference.SettingPreference;
import com.xiaomi.fitness.about.setting.SettingActivity;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.widget.SingleChoiceDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.keep_alive.KeepAliveHelper;
import com.xiaomi.fitness.keep_alive.KeepAlivePreference;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.region.RegionSelectListActivity;
import com.xiaomi.fitness.push.export.PushManager;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.av6;
import defpackage.gz;
import defpackage.im9;
import defpackage.j2j;
import defpackage.lzi;
import defpackage.vv1;
import defpackage.xii;
import defpackage.yaa;
import defpackage.yti;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\bG\u0010\u000fJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u000fJ'\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010!\u001a\u0004\u0018\u00010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010\u000fR\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/about/setting/SettingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/about/AboutViewModel;", "Lgz;", "Lyaa;", "", "bytes", "", "setCacheView", "(J)V", "", "isChecked", "setNewMsgNotifyDes", "(Z)V", "showDialog", "()V", "oneTrackSettingsAppSetReview", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "countryItemList", "", "country", "findCountryName", "(Ljava/util/List;Ljava/lang/String;)Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "setTextView", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "Lcom/xiaomi/fitness/push/export/PushManager;", "pushManager", "Lcom/xiaomi/fitness/push/export/PushManager;", "getPushManager", "()Lcom/xiaomi/fitness/push/export/PushManager;", "setPushManager", "(Lcom/xiaomi/fitness/push/export/PushManager;)V", "COUNTRY_INFO", "Ljava/lang/String;", "getCOUNTRY_INFO", "()Ljava/lang/String;", "TAG", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "noOpSwitchCallback", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "Ljava/text/DecimalFormat;", "format", "Ljava/text/DecimalFormat;", "", "curCacheSize", "F", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingActivity.kt\ncom/xiaomi/fitness/about/setting/SettingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
public final class SettingActivity extends Hilt_SettingActivity<AboutViewModel, gz> implements yaa {
    private float curCacheSize;
    public AccountManager mAccountManager;
    public PushManager pushManager;

    @NotNull
    private final String COUNTRY_INFO = RegionSelectListActivity.COUNTRY_INFO;

    @NotNull
    private final String TAG = "SettingActivity";

    @NotNull
    private final ISwitchButton.a noOpSwitchCallback = new ISwitchButton.a() { // from class: p0m
        @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
        public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
            SettingActivity.noOpSwitchCallback$lambda$0(z, iSwitchButton);
        }
    };

    @NotNull
    private final DecimalFormat format = new DecimalFormat("0.##");

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ gz access$getMBinding(SettingActivity settingActivity) {
        return (gz) settingActivity.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void noOpSwitchCallback$lambda$0(boolean z, ISwitchButton iSwitchButton) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$11(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(this$0);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(this$0, DeviceDualAuthorizationActivity.class);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            RegionExtKt.selectRegion(this$0);
        } else {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SingleChoiceDialog singleChoiceDialogCreate = new SingleChoiceDialog.a("coach").setCustomLayoutId(yti.f40525k).setNegativeText(lzi.V).setDialogTitle(lzi.g).setCancelable(true).setCanceledOnTouchOutside(true).create();
        singleChoiceDialogCreate.G(new int[]{lzi.f, lzi.e});
        singleChoiceDialogCreate.setRequestCode(17);
        singleChoiceDialogCreate.F(SettingPreference.INSTANCE.isCoachMale() ? 1 : 2);
        singleChoiceDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(SettingActivity this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(l);
        this$0.setCacheView(l.longValue());
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$6(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(lzi.f25585b, false);
        ((AboutViewModel) this$0.getMViewModel()).clearCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(this$0);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(this$0, SportHealthServiceActivity.class);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDialog();
    }

    private final void oneTrackSettingsAppSetReview() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36275"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_app_set_up")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCacheView(long bytes) {
        this.curCacheSize = bytes / 1.07374182E9f;
        this.format.setRoundingMode(RoundingMode.FLOOR);
        ((gz) getMBinding()).D.setRemindText(getString(lzi.c, this.format.format(Float.valueOf(this.curCacheSize))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setNewMsgNotifyDes(boolean isChecked) {
        if (isChecked) {
            ((gz) getMBinding()).H.setSwitch(true);
            ((gz) getMBinding()).H.setSubtitle(getString(lzi.M));
        } else {
            ((gz) getMBinding()).H.setSwitch(false);
            ((gz) getMBinding()).H.setSubtitle(getString(lzi.L));
        }
    }

    private final void showDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTheme(j2j.f22357a).setDialogTitle(lzi.o).setNegativeText(lzi.V).setNeutralText(lzi.i).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.setting.SettingActivity.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -3) {
                    SettingActivity.this.getMAccountManager().logout();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Nullable
    public final CountryInfo findCountryName(@NotNull List<CountryInfo> countryItemList, @NotNull String country) {
        Intrinsics.checkNotNullParameter(countryItemList, "countryItemList");
        Intrinsics.checkNotNullParameter(country, "country");
        if (TextUtils.isEmpty(country)) {
            return null;
        }
        for (CountryInfo countryInfo : countryItemList) {
            Logger.d(this.TAG, "country is " + country + ", item.country is " + countryInfo.getCountry() + " item.name is " + countryInfo.getName() + " item.pinyin is " + countryInfo.getPinyin());
            if (StringsKt__StringsJVMKt.equals(countryInfo.getName(), country, true)) {
                return countryInfo;
            }
        }
        return null;
    }

    @NotNull
    public final String getCOUNTRY_INFO() {
        return this.COUNTRY_INFO;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return yti.f;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @NotNull
    public final PushManager getPushManager() {
        PushManager pushManager = this.pushManager;
        if (pushManager != null) {
            return pushManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return vv1.f37253a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        oneTrackSettingsAppSetReview();
        super.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.about.setting.Hilt_SettingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"StringFormatInvalid"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(lzi.J);
        setTitleBackground(xii.f39161b);
        setActionBarDisplayable(true);
        setTextView();
        ((gz) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: q0m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.onCreate$lambda$2(this.f30965a, view);
            }
        });
        ((gz) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: r0m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.onCreate$lambda$4(this.f32057a, view);
            }
        });
        ((gz) getMBinding()).J.setRemindText(getString(SettingPreference.INSTANCE.isCoachMale() ? lzi.f : lzi.e));
        ((AboutViewModel) getMViewModel()).getCacheEmitter().observe(this, new SettingActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s0m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingActivity.onCreate$lambda$5(this.f33140a, (Long) obj);
            }
        }));
        ((gz) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: t0m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.onCreate$lambda$6(this.f34179a, view);
            }
        });
        setCacheView(im9.G(new File(im9.M())));
        ((gz) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: u0m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.onCreate$lambda$8(this.f35257a, view);
            }
        });
        setNewMsgNotifyDes(getPushManager().isOpenPush());
        ((gz) getMBinding()).H.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.about.setting.SettingActivity.onCreate.6
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public void onCheckedChanged(boolean isChecked, ISwitchButton switchButton) {
                SettingActivity.this.setNewMsgNotifyDes(isChecked);
                if (isChecked) {
                    PushManager pushManager = SettingActivity.this.getPushManager();
                    Application application = SettingActivity.this.getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                    pushManager.register(application);
                } else {
                    PushManager pushManager2 = SettingActivity.this.getPushManager();
                    Application application2 = SettingActivity.this.getApplication();
                    Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
                    pushManager2.unRegister(application2);
                }
                SettingActivity.access$getMBinding(SettingActivity.this).H.getMIvFeatureItemSwitchBtn().announceForAccessibility(SettingActivity.access$getMBinding(SettingActivity.this).H.getMIvFeatureItemSwitchBtn().getContentDescription());
            }
        });
        ((gz) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.about.setting.SettingActivity.onCreate.7
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public void onCheckedChanged(boolean isChecked, ISwitchButton switchButton) {
                KeepAlivePreference.INSTANCE.setKEY_SHOW_CONNECTION_NOTIFICATION(isChecked);
                KeepAliveHelper.INSTANCE.getInstance().startService();
            }
        });
        AppUtil appUtil = AppUtil.INSTANCE;
        if (appUtil.isPlayChannel() || !RomUtils.INSTANCE.isMiui()) {
            ((gz) getMBinding()).E.setVisibility(0);
            ((gz) getMBinding()).E.setSwitch(KeepAlivePreference.INSTANCE.getKEY_SHOW_CONNECTION_NOTIFICATION());
        } else {
            ((gz) getMBinding()).E.setVisibility(8);
        }
        if (getMAccountManager().isLogin()) {
            ((gz) getMBinding()).C.setVisibility(0);
            ((gz) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: v0m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingActivity.onCreate$lambda$9(this.f36353a, view);
                }
            });
        }
        if (appUtil.isPlayChannel()) {
            RightArrowTwoLineTextView tvDeviceDualAuthorization = ((gz) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(tvDeviceDualAuthorization, "tvDeviceDualAuthorization");
            ViewExtKt.gone(tvDeviceDualAuthorization);
        } else {
            RightArrowTwoLineTextView tvDeviceDualAuthorization2 = ((gz) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(tvDeviceDualAuthorization2, "tvDeviceDualAuthorization");
            ViewExtKt.visible(tvDeviceDualAuthorization2);
            ((gz) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: w0m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingActivity.onCreate$lambda$11(this.f37421a, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.about.setting.Hilt_SettingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ((gz) getMBinding()).H.setOnCheckedChangeCallback(this.noOpSwitchCallback);
        ((gz) getMBinding()).E.setOnCheckedChangeCallback(this.noOpSwitchCallback);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        String str;
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 17) {
            int i = data.getInt("selected_option", 0);
            Logger.d("SettingActivity", "option = " + i + " ");
            if (i != 0) {
                SettingPreference settingPreference = SettingPreference.INSTANCE;
                if (i == 1) {
                    ((gz) getMBinding()).J.setRemindText(lzi.f);
                    str = "male";
                } else {
                    ((gz) getMBinding()).J.setRemindText(lzi.e);
                    str = "female";
                }
                settingPreference.setCOACH_PREFER(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
        boolean z = RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) && !AppUtil.INSTANCE.isPlayChannel();
        if (zIsLogin && z) {
            RightArrowBindingSingleLineTextView settingCoach = ((gz) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(settingCoach, "settingCoach");
            ViewExtKt.visible(settingCoach);
            RightArrowBindingSingleLineTextView cacheView = ((gz) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(cacheView, "cacheView");
            ViewExtKt.visible(cacheView);
        } else {
            RightArrowBindingSingleLineTextView settingCoach2 = ((gz) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(settingCoach2, "settingCoach");
            ViewExtKt.gone(settingCoach2);
            RightArrowBindingSingleLineTextView cacheView2 = ((gz) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(cacheView2, "cacheView");
            ViewExtKt.gone(cacheView2);
        }
        setTextView();
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }

    public final void setPushManager(@NotNull PushManager pushManager) {
        Intrinsics.checkNotNullParameter(pushManager, "<set-?>");
        this.pushManager = pushManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextView() {
        String country;
        RegionManager.Companion companion = RegionManager.INSTANCE;
        CountryInfo countryInfoFindCountryName = findCountryName(RegionExtKt.getInstance(companion).getCountryList(), RegionExtKt.getInstance(companion).getLocalCountry());
        if (countryInfoFindCountryName != null) {
            if (ServerConstants.NEW_TW_COUNTRY_CODE.equals(countryInfoFindCountryName.getName())) {
                country = getResources().getString(lzi.i0);
                Intrinsics.checkNotNullExpressionValue(country, "getString(...)");
            } else {
                country = countryInfoFindCountryName.getCountry();
            }
            Logger.d(this.TAG, "COUNTTRY after is " + ((Object) country) + " RegionManager.instance.getLocalCountry() is " + RegionExtKt.getInstance(companion).getLocalCountry());
        } else {
            country = "";
        }
        ((gz) getMBinding()).K.setRemindText(country);
    }
}
