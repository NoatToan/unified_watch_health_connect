package com.xiaomi.hm.health.device.settings.sport;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.arch.core.State;
import com.xiaomi.hm.health.bt.profile.sport.SportItemDataConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportDataViewModel;", "Landroidx/lifecycle/ViewModel;", "", "sportType", "", "loadSportType", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "sportTypeConfig", "setSportTypeSort", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "a", "Landroidx/lifecycle/MutableLiveData;", "getSportDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sportDataLiveData", "b", "getSetDeviceDataLiveData", "setDeviceDataLiveData", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<SportItemDataConfig>> sportDataLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<SportItemDataConfig>> setDeviceDataLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<State<? extends SportItemDataConfig>> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State<SportItemDataConfig> invoke() {
            return SportConfigApiKt.loadSportDataItemFromDevice(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<State<? extends SportItemDataConfig>> {
        public final /* synthetic */ SportItemDataConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SportItemDataConfig sportItemDataConfig) {
            super(0);
            this.a = sportItemDataConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State<SportItemDataConfig> invoke() {
            return SportConfigApiKt.setSportDataConfigToDevice(this.a);
        }
    }

    @NotNull
    public final MutableLiveData<State<SportItemDataConfig>> getSetDeviceDataLiveData() {
        return this.setDeviceDataLiveData;
    }

    @NotNull
    public final MutableLiveData<State<SportItemDataConfig>> getSportDataLiveData() {
        return this.sportDataLiveData;
    }

    public final void loadSportType(int sportType) {
        SportDataViewModelKt.runWithState(this, this.sportDataLiveData, new a(sportType));
    }

    public final void setSportTypeSort(@NotNull SportItemDataConfig sportTypeConfig) {
        SportDataViewModelKt.runWithState(this, this.setDeviceDataLiveData, new b(sportTypeConfig));
    }
}
