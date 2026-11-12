package com.xiaomi.fitness.login.region;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.mode.GuidePersonalizeActivity;
import com.xiaomi.fitness.login.region.RegionSelectActivity;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.dv1;
import defpackage.g0j;
import defpackage.lji;
import defpackage.mui;
import defpackage.wqe;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b \u0010\u000eJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/login/region/RegionSelectActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/region/RegionViewModel;", "Lwqe;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "countryItem", "showCountryName", "(Lcom/xiaomi/fitness/account/api/bean/CountryInfo;)V", "setRegionFromCurrentCountry", "()V", "", "region", "Ljava/lang/String;", "country", "currentCountry", "currentCountryItem", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "TAG", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "", "isAdaptActionBar", "()Z", "<init>", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRegionSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionSelectActivity.kt\ncom/xiaomi/fitness/login/region/RegionSelectActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class RegionSelectActivity extends Hilt_RegionSelectActivity<RegionViewModel, wqe> {

    @NotNull
    private final String TAG = "RegionSelectActivity";

    @Nullable
    private String country;

    @Nullable
    private String currentCountry;

    @Nullable
    private CountryInfo currentCountryItem;

    @Nullable
    private String region;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$0(RegionSelectActivity this$0, CountryInfo countryInfo) {
        String lowerCase;
        String name;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.currentCountryItem = countryInfo;
        this$0.country = countryInfo != null ? countryInfo.getName() : null;
        if (countryInfo == null || (name = countryInfo.getName()) == null) {
            lowerCase = null;
        } else {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            lowerCase = name.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        this$0.region = lowerCase;
        String country = countryInfo != null ? countryInfo.getCountry() : null;
        this$0.currentCountry = country;
        Logger.d(this$0.TAG, "countryInfoObserver country is " + this$0.country + " region is " + this$0.region + " currentCountry is " + country);
        ((RegionViewModel) this$0.getMViewModel()).setContryInfo(this$0.currentCountryItem, this$0);
        ((wqe) this$0.getMBinding()).H();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(final RegionSelectActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra(RegionExtKt.GUID_SHOW, true);
        intent.putExtra(RegionSelectListActivity.CURRENT_COUNTRY_ITEM, this$0.currentCountryItem);
        intent.setClass(this$0, RegionSelectListActivity.class);
        this$0.startForActivityResult(intent, new Function2() { // from class: gck
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RegionSelectActivity.onCreate$lambda$2$lambda$1(this.f18836a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2$lambda$1(RegionSelectActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 100) {
            CountryInfo countryInfo = intent != null ? (CountryInfo) intent.getParcelableExtra(RegionSelectListActivity.COUNTRY_INFO) : null;
            ((RegionViewModel) this$0.getMViewModel()).setContryInfo(countryInfo, this$0);
            this$0.currentCountryItem = countryInfo;
            this$0.country = countryInfo != null ? countryInfo.getName() : null;
            this$0.region = countryInfo != null ? countryInfo.getName() : null;
            this$0.currentCountry = countryInfo != null ? countryInfo.getCountry() : null;
            ((wqe) this$0.getMBinding()).H();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("connectDevice: ");
        sb.append(i);
        sb.append(" >> ");
        sb.append(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$7(RegionSelectActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.currentCountryItem == null) {
            ToastUtil.INSTANCE.showToast(g0j.g);
            return;
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            this$0.setRegionFromCurrentCountry();
        } else {
            CountryInfo countryInfo = this$0.currentCountryItem;
            Intrinsics.checkNotNull(countryInfo);
            if (StringsKt__StringsJVMKt.equals$default(countryInfo.getName(), ServerConstants.NEW_CN_COUNTRY_CODE, false, 2, null)) {
                String str = this$0.region;
                if (str != null) {
                    RegionExtKt.getInstance(RegionManager.INSTANCE).switchRegion(str);
                }
                String str2 = this$0.region;
                if (str2 != null) {
                    CountryInfo countryInfo2 = this$0.currentCountryItem;
                    Intrinsics.checkNotNull(countryInfo2);
                    String name = countryInfo2.getName();
                    if (name != null) {
                        LoginUtil.INSTANCE.saveCurrentRegion(str2, name);
                        CountryInfo countryInfo3 = this$0.currentCountryItem;
                        Intrinsics.checkNotNull(countryInfo3);
                        String country = countryInfo3.getCountry();
                        if (country != null) {
                            RegionExtKt.getInstance(RegionManager.INSTANCE).setCurrentCountry(country);
                        }
                    }
                }
            } else {
                this$0.setRegionFromCurrentCountry();
            }
        }
        if (AppUtil.INSTANCE.isPlayChannel()) {
            CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
            CheckerUserSettingManagerExtKt.getInstance(companion).setSelectMode(companion.getCONCISE_MODE());
            MainExtKt.showMainActivity$default(this$0, null, null, 6, null);
            this$0.finish();
        } else {
            String str3 = this$0.TAG;
            CheckerUserSettingManager.Companion companion2 = CheckerUserSettingManager.INSTANCE;
            Logger.d(str3, "LoginUtil.checkDeviceSettingForSelectMode() is " + CheckerUserSettingManagerExtKt.getInstance(companion2).getSelectMode());
            boolean zShowAppV4Enable = ICompareKt.getINSTANCE(ICompare.INSTANCE).showAppV4Enable();
            Logger.d(this$0.TAG, "showV4Ui enable=" + zShowAppV4Enable);
            if (zShowAppV4Enable || CheckerUserSettingManagerExtKt.getInstance(companion2).getSelectMode() != companion2.getUNKOWN_MODE()) {
                MainExtKt.showMainActivity$default(this$0, null, null, 6, null);
                this$0.finish();
            } else {
                this$0.startActivity(new Intent(this$0, (Class<?>) GuidePersonalizeActivity.class));
                this$0.finish();
            }
        }
        ((RegionViewModel) this$0.getMViewModel()).setUserRegion(this$0.currentCountryItem);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity
    /* JADX INFO: renamed from: isAdaptActionBar */
    public boolean getIsAdaptActionBar() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.login.region.Hilt_RegionSelectActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(g0j.O);
        hideBack();
        setTitleBackground(lji.e);
        setSubtitle(g0j.Q);
        ((RegionViewModel) getMViewModel()).loadData(new WeakReference<>(this));
        Logger.d(this.TAG, "RegionSelectActivity country is " + this.country + " region is " + this.region + " currentCountry is " + this.currentCountry);
        ((RegionViewModel) getMViewModel()).getCountryInfoObserver().observe(this, new RegionSelectActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dck
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RegionSelectActivity.onCreate$lambda$0(this.f15372a, (CountryInfo) obj);
            }
        }));
        ((wqe) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: eck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegionSelectActivity.onCreate$lambda$2(this.f16501a, view);
            }
        });
        ((wqe) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: fck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegionSelectActivity.onCreate$lambda$7(this.f17652a, view);
            }
        });
    }

    public final void setRegionFromCurrentCountry() {
        CountryInfo countryInfo = this.currentCountryItem;
        if (countryInfo == null) {
            return;
        }
        Intrinsics.checkNotNull(countryInfo);
        String name = countryInfo.getName();
        String strFindRegionByCountry = name != null ? RegionUtil.INSTANCE.findRegionByCountry(this, name) : null;
        if (strFindRegionByCountry == null) {
            LoginUtil loginUtil = LoginUtil.INSTANCE;
            CountryInfo countryInfo2 = this.currentCountryItem;
            Intrinsics.checkNotNull(countryInfo2);
            loginUtil.onSwitchToErrorRegion(countryInfo2.getName());
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ToastExtKt.toastShort(application, g0j.f);
            return;
        }
        RegionManager.Companion companion = RegionManager.INSTANCE;
        RegionExtKt.getInstance(companion).switchRegion(strFindRegionByCountry);
        CountryInfo countryInfo3 = this.currentCountryItem;
        Intrinsics.checkNotNull(countryInfo3);
        String name2 = countryInfo3.getName();
        if (name2 != null) {
            LoginUtil.INSTANCE.saveCurrentRegion(strFindRegionByCountry, name2);
        }
        CountryInfo countryInfo4 = this.currentCountryItem;
        Intrinsics.checkNotNull(countryInfo4);
        String country = countryInfo4.getCountry();
        if (country != null) {
            RegionExtKt.getInstance(companion).setCurrentCountry(country);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showCountryName(@Nullable CountryInfo countryItem) {
        this.currentCountryItem = countryItem;
        Logger.d(this.TAG, "currentCountryItem is " + countryItem);
        if (this.currentCountryItem != null) {
            TextView textView = ((wqe) getMBinding()).B;
            CountryInfo countryInfo = this.currentCountryItem;
            textView.setText(countryInfo != null ? countryInfo.getCountry() : null);
            ((wqe) getMBinding()).A.setVisibility(0);
            return;
        }
        Logger.d(this.TAG, "currentCountryItem is " + getString(g0j.O));
        ((wqe) getMBinding()).B.setText(getString(g0j.O));
    }
}
