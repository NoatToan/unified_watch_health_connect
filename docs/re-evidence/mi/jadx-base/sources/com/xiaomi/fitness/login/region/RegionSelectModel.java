package com.xiaomi.fitness.login.region;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.f;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/login/region/RegionSelectModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "currentCountryItem", "Landroidx/databinding/f;", "getRegionList", "(Lcom/xiaomi/fitness/account/api/bean/CountryInfo;)Landroidx/databinding/f;", "Landroidx/databinding/ObservableArrayList;", "countryDataList", "Landroidx/databinding/ObservableArrayList;", "<init>", "()V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRegionSelectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionSelectModel.kt\ncom/xiaomi/fitness/login/region/RegionSelectModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1863#2,2:31\n*S KotlinDebug\n*F\n+ 1 RegionSelectModel.kt\ncom/xiaomi/fitness/login/region/RegionSelectModel\n*L\n17#1:31,2\n*E\n"})
public final class RegionSelectModel extends BaseModel {

    @NotNull
    private final ObservableArrayList<CountryInfo> countryDataList = new ObservableArrayList<>();

    @NotNull
    public final f<CountryInfo> getRegionList(@Nullable CountryInfo currentCountryItem) {
        this.countryDataList.clear();
        for (CountryInfo countryInfo : RegionExtKt.getInstance(RegionManager.INSTANCE).getCountryList()) {
            if (currentCountryItem == null) {
                RegionManager.Companion companion = RegionManager.INSTANCE;
                if (RegionExtKt.getInstance(companion).getCurrentRegion().length() > 0 && !Intrinsics.areEqual(RegionExtKt.getInstance(companion).getLocalCountry(), countryInfo.getName())) {
                    ObservableArrayList<CountryInfo> observableArrayList = this.countryDataList;
                    Intrinsics.checkNotNull(observableArrayList);
                    observableArrayList.add(countryInfo);
                } else if (RegionExtKt.getInstance(companion).getCurrentRegion().length() == 0) {
                    ObservableArrayList<CountryInfo> observableArrayList2 = this.countryDataList;
                    Intrinsics.checkNotNull(observableArrayList2);
                    observableArrayList2.add(countryInfo);
                }
            } else if (!Intrinsics.areEqual(currentCountryItem.getCountry(), countryInfo.getCountry())) {
                ObservableArrayList<CountryInfo> observableArrayList3 = this.countryDataList;
                Intrinsics.checkNotNull(observableArrayList3);
                observableArrayList3.add(countryInfo);
            }
        }
        return this.countryDataList;
    }
}
