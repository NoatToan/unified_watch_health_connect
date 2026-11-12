package com.xiaomi.hm.health.device.settings.sport;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.arch.core.State;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportTypeViewModel;", "Landroidx/lifecycle/ViewModel;", "", "loadSportType", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "sportTypeConfig", "setSportTypeSort", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "a", "Landroidx/lifecycle/MutableLiveData;", "getSportTypeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sportTypeLiveData", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTypeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<SportTypeConfig>> sportTypeLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<State<? extends SportTypeConfig>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State<SportTypeConfig> invoke() {
            return SportConfigApiKt.loadSportTypeFromDevice();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<State<? extends SportTypeConfig>> {
        public final /* synthetic */ SportTypeConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SportTypeConfig sportTypeConfig) {
            super(0);
            this.a = sportTypeConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State<SportTypeConfig> invoke() {
            return SportConfigApiKt.setSportTypeToDevice(this.a);
        }
    }

    @NotNull
    public final MutableLiveData<State<SportTypeConfig>> getSportTypeLiveData() {
        return this.sportTypeLiveData;
    }

    public final void loadSportType() {
        SportDataViewModelKt.runWithState(this, this.sportTypeLiveData, a.a);
    }

    public final void setSportTypeSort(@NotNull SportTypeConfig sportTypeConfig) {
        SportDataViewModelKt.runWithState(this, this.sportTypeLiveData, new b(sportTypeConfig));
    }
}
