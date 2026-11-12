package com.xiaomi.fitness.sport.view.route.address;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.services.core.PoiItem;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.sport.view.route.GeoUtils;
import com.xiaomi.fitness.sport.view.route.address.AddressSearchViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/address/AddressSearchViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "addressesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/amap/api/services/core/PoiItem;", "getAddressesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "searchAddressList", "", "context", "Landroid/content/Context;", "key", "", "city", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddressSearchViewModel extends BaseViewModel<BaseModel> {

    @NotNull
    private final MutableLiveData<List<PoiItem>> addressesLiveData = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchAddressList$lambda$0(AddressSearchViewModel this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.addressesLiveData.postValue(it);
        return Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<List<PoiItem>> getAddressesLiveData() {
        return this.addressesLiveData;
    }

    public final void searchAddressList(@NotNull Context context, @NotNull String key, @NotNull String city) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(city, "city");
        GeoUtils.INSTANCE.getAddressList(context, key, city, new Function1() { // from class: qu0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddressSearchViewModel.searchAddressList$lambda$0(this.f31843a, (List) obj);
            }
        });
    }
}
