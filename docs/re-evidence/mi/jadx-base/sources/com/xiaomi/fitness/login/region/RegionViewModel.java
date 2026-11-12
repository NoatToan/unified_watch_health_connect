package com.xiaomi.fitness.login.region;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.api.bean.CountryRegion;
import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.preference.RegionSelectPreference;
import com.xiaomi.fitness.login.region.RegionViewModel;
import com.xiaomi.fitness.login.request.RegionByIpRequest;
import com.xiaomi.fitness.login.request.RegionRequest;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.g0j;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u001e\u0010,\u001a\u0004\u0018\u00010\u00062\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060.2\u0006\u0010/\u001a\u00020$J\u0018\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020+J\u0010\u00102\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/login/region/RegionViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/login/region/RegionSelectModel;", "<init>", "()V", "countryInfo", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "getCountryInfo", "()Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "setCountryInfo", "(Lcom/xiaomi/fitness/account/api/bean/CountryInfo;)V", "mRegionByIpRequest", "Lcom/xiaomi/fitness/login/request/RegionByIpRequest;", "getMRegionByIpRequest", "()Lcom/xiaomi/fitness/login/request/RegionByIpRequest;", "setMRegionByIpRequest", "(Lcom/xiaomi/fitness/login/request/RegionByIpRequest;)V", "mRegionRequest", "Lcom/xiaomi/fitness/login/request/RegionRequest;", "getMRegionRequest", "()Lcom/xiaomi/fitness/login/request/RegionRequest;", "setMRegionRequest", "(Lcom/xiaomi/fitness/login/request/RegionRequest;)V", "mRegionManager", "Lcom/xiaomi/fitness/login/export/RegionManager;", "getMRegionManager", "()Lcom/xiaomi/fitness/login/export/RegionManager;", "setMRegionManager", "(Lcom/xiaomi/fitness/login/export/RegionManager;)V", "countryInfoObserver", "Landroidx/lifecycle/MutableLiveData;", "getCountryInfoObserver", "()Landroidx/lifecycle/MutableLiveData;", "setCountryInfoObserver", "(Landroidx/lifecycle/MutableLiveData;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "loadData", "", LifecycleConstantKt.TYPE_ACTIVITY, "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/login/region/RegionSelectActivity;", "findCountryName", "countryItemList", "", "country", "setContryInfo", "currentCountyInfo", "setUserRegion", "item", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionViewModel.kt\ncom/xiaomi/fitness/login/region/RegionViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class RegionViewModel extends BaseViewModel<RegionSelectModel> {

    @Nullable
    private CountryInfo countryInfo;

    @NotNull
    private MutableLiveData<CountryInfo> countryInfoObserver = new MutableLiveData<>();
    public RegionByIpRequest mRegionByIpRequest;
    public RegionManager mRegionManager;
    public RegionRequest mRegionRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$0(WeakReference activity, RegionViewModel this$0, CountryRegion it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RegionSelectActivity regionSelectActivity = (RegionSelectActivity) activity.get();
        if (regionSelectActivity != null) {
            regionSelectActivity.dismissDialog();
        }
        RegionSelectPreference.INSTANCE.setLocaleCountryByIP(it.getCountry());
        this$0.findCountryName(RegionExtKt.getInstance(RegionManager.INSTANCE).getCountryList(), it.getCountry());
        Logger.i(this$0.getTAG(), "it.country is " + it.getCountry());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$1(WeakReference activity, RegionViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RegionSelectActivity regionSelectActivity = (RegionSelectActivity) activity.get();
        if (regionSelectActivity != null) {
            regionSelectActivity.dismissDialog();
        }
        Logger.i(this$0.getTAG(), "error " + it.getErrorCode());
        this$0.countryInfoObserver.postValue(null);
        return Unit.INSTANCE;
    }

    @Nullable
    public final CountryInfo findCountryName(@NotNull List<CountryInfo> countryItemList, @NotNull String country) {
        Intrinsics.checkNotNullParameter(countryItemList, "countryItemList");
        Intrinsics.checkNotNullParameter(country, "country");
        if (TextUtils.isEmpty(country)) {
            return null;
        }
        for (CountryInfo countryInfo : countryItemList) {
            if (StringsKt__StringsJVMKt.equals(countryInfo.getName(), country, true)) {
                Logger.d(getTAG(), "postvalue country is " + country + ", item.country is " + countryInfo.getCountry() + " item.name is " + countryInfo.getName() + " item.pinyin is " + countryInfo.getPinyin());
                this.countryInfoObserver.postValue(countryInfo);
                return countryInfo;
            }
        }
        return null;
    }

    @Nullable
    public final CountryInfo getCountryInfo() {
        return this.countryInfo;
    }

    @NotNull
    public final MutableLiveData<CountryInfo> getCountryInfoObserver() {
        return this.countryInfoObserver;
    }

    @NotNull
    public final RegionByIpRequest getMRegionByIpRequest() {
        RegionByIpRequest regionByIpRequest = this.mRegionByIpRequest;
        if (regionByIpRequest != null) {
            return regionByIpRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegionByIpRequest");
        return null;
    }

    @NotNull
    public final RegionManager getMRegionManager() {
        RegionManager regionManager = this.mRegionManager;
        if (regionManager != null) {
            return regionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegionManager");
        return null;
    }

    @NotNull
    public final RegionRequest getMRegionRequest() {
        RegionRequest regionRequest = this.mRegionRequest;
        if (regionRequest != null) {
            return regionRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegionRequest");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "RegionViewModel";
    }

    public final void loadData(@NotNull final WeakReference<RegionSelectActivity> activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RegionSelectActivity regionSelectActivity = activity.get();
        if (regionSelectActivity != null) {
            regionSelectActivity.showLoading(ResourceExtKt.getString(g0j.f18430b), 0, true);
        }
        getMRegionByIpRequest().getUserRegionByIP(new Function1() { // from class: vck
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegionViewModel.loadData$lambda$0(activity, this, (CountryRegion) obj);
            }
        }, new Function1() { // from class: wck
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegionViewModel.loadData$lambda$1(activity, this, (ApiException) obj);
            }
        });
    }

    public final void setContryInfo(@Nullable CountryInfo currentCountyInfo, @NotNull RegionSelectActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.countryInfo = currentCountyInfo;
        String tag = getTAG();
        CountryInfo countryInfo = this.countryInfo;
        Logger.d(tag, "countryInfo country is " + (countryInfo != null ? countryInfo.getCountry() : null));
        activity.showCountryName(this.countryInfo);
    }

    public final void setCountryInfo(@Nullable CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public final void setCountryInfoObserver(@NotNull MutableLiveData<CountryInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.countryInfoObserver = mutableLiveData;
    }

    public final void setMRegionByIpRequest(@NotNull RegionByIpRequest regionByIpRequest) {
        Intrinsics.checkNotNullParameter(regionByIpRequest, "<set-?>");
        this.mRegionByIpRequest = regionByIpRequest;
    }

    public final void setMRegionManager(@NotNull RegionManager regionManager) {
        Intrinsics.checkNotNullParameter(regionManager, "<set-?>");
        this.mRegionManager = regionManager;
    }

    public final void setMRegionRequest(@NotNull RegionRequest regionRequest) {
        Intrinsics.checkNotNullParameter(regionRequest, "<set-?>");
        this.mRegionRequest = regionRequest;
    }

    public final void setUserRegion(@Nullable CountryInfo item) {
        if (item == null) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), g0j.g);
            return;
        }
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), g0j.e);
            return;
        }
        if (RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion() != null) {
            return;
        }
        CountryInfo countryInfo = new CountryInfo(item.getCountry(), null, null, 6, null);
        String name = item.getName();
        String strFindRegionByCountry = null;
        if ((name != null ? new RegionBean.CountryInfo(name) : null) != null) {
            String name2 = item.getName();
            if (name2 != null) {
                RegionUtil regionUtil = RegionUtil.INSTANCE;
                Context baseContext = ApplicationExtKt.getApplication().getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                strFindRegionByCountry = regionUtil.findRegionByCountry(baseContext, name2);
            }
            if (strFindRegionByCountry != null) {
                getMRegionManager().switchRegion(strFindRegionByCountry);
                String name3 = countryInfo.getName();
                if (name3 != null) {
                    LoginUtil.INSTANCE.saveCurrentRegion(strFindRegionByCountry, name3);
                }
            }
        }
    }
}
