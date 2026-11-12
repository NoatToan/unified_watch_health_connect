package com.xiaomi.hm.health.ui.pai.hrsetting;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.view.ComponentActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.arch.HeartRateSettingViewModel;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.dataflow.HealthData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/hrsetting/AssistHeartRateSetting;", "Lcom/xiaomi/hm/health/ui/pai/hrsetting/IHrSettingWrap;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/LiveData;", "", "setHeartRate", "showHrSetting", "<init>", "()V", "Lcom/huami/watch/companion/arch/HeartRateSettingViewModel;", "vm", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AssistHeartRateSetting implements IHrSettingWrap {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartRateSettingViewModel a(Lazy<? extends HeartRateSettingViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.pai.ui.hrsetting.IHeartRateSetting
    @Nullable
    public LiveData<Boolean> setHeartRate(@Nullable final Context context) {
        if (!(context instanceof FragmentActivity)) {
            return null;
        }
        final MutableLiveData mutableLiveData = new MutableLiveData();
        final ComponentActivity componentActivity = (ComponentActivity) context;
        final ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HeartRateSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.ui.pai.hrsetting.AssistHeartRateSetting$setHeartRate$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return componentActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.ui.pai.hrsetting.AssistHeartRateSetting$setHeartRate$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return componentActivity.getDefaultViewModelProviderFactory();
            }
        });
        a(viewModelLazy).statusData.observe((LifecycleOwner) context, new Observer<Result<?>>() { // from class: com.xiaomi.hm.health.ui.pai.hrsetting.AssistHeartRateSetting.setHeartRate.1
            @Override // androidx.p008lifecycle.Observer
            public void onChanged(@Nullable Result<?> result) {
                if (result == null || result.isError()) {
                    AssistHeartRateSetting.this.showOpenResultDialog(context, false);
                    AssistHeartRateSetting.a(viewModelLazy).statusData.removeObserver(this);
                } else if (result.isSuccess()) {
                    IHrSettingWrap.DefaultImpls.showToastShort$default(AssistHeartRateSetting.this, context, 0, 2, null);
                    AssistHeartRateSetting.a(viewModelLazy).statusData.removeObserver(this);
                    mutableLiveData.postValue(Boolean.TRUE);
                }
            }
        });
        a(viewModelLazy).updateIsAllDay(true);
        return mutableLiveData;
    }

    @Override // com.huami.pai.ui.hrsetting.IHeartRateSetting
    public boolean showHrSetting(@NotNull Context context) {
        return !HealthData.isAllDayHR(context);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showOpenResultDialog(@Nullable Context context, int i, int i2) {
        IHrSettingWrap.DefaultImpls.showOpenResultDialog(this, context, i, i2);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showToastShort(@Nullable Context context, int i) {
        IHrSettingWrap.DefaultImpls.showToastShort(this, context, i);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showOpenResultDialog(@Nullable Context context, boolean z) {
        IHrSettingWrap.DefaultImpls.showOpenResultDialog(this, context, z);
    }
}
