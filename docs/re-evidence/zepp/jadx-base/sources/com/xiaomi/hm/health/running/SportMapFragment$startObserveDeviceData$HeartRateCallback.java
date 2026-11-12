package com.xiaomi.hm.health.running;

import android.view.View;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.running.SportMapFragment$startObserveDeviceData$HeartRateCallback;
import com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"com/xiaomi/hm/health/running/SportMapFragment$startObserveDeviceData$HeartRateCallback", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController$IHeartRateCallback;", "", Constants.DATA_KEY_HR, "", "onHeartRateChanged", "", "result", "onOpen", "Lcom/xiaomi/hm/health/running/SportMapFragment$a;", "a", "Lcom/xiaomi/hm/health/running/SportMapFragment$a;", "getDevice", "()Lcom/xiaomi/hm/health/running/SportMapFragment$a;", "device", "<init>", "(Lcom/xiaomi/hm/health/running/SportMapFragment;Lcom/xiaomi/hm/health/running/SportMapFragment$a;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportMapFragment$startObserveDeviceData$HeartRateCallback implements HMHeartRateController.IHeartRateCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SportMapFragment.a device;
    public final /* synthetic */ SportMapFragment b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onHeartRateChanged(" + SportMapFragment$startObserveDeviceData$HeartRateCallback.this.getDevice().getDeviceSource() + "): " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onOpen: " + this.a;
        }
    }

    public SportMapFragment$startObserveDeviceData$HeartRateCallback(@NotNull SportMapFragment sportMapFragment, @NotNull SportMapFragment.a aVar) {
        this.b = sportMapFragment;
        this.device = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SportMapFragment sportMapFragment) {
        View view = sportMapFragment.getView();
        SportDeviceView sportDeviceView = (SportDeviceView) (view == null ? null : view.findViewById(R.id.sport_map_device));
        if (sportDeviceView == null) {
            return;
        }
        sportDeviceView.notifyHeartRateChanged();
    }

    @NotNull
    public final SportMapFragment.a getDevice() {
        return this.device;
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
    public void onHeartRateChanged(int hr) {
        if (!Intrinsics.areEqual(this.device, this.b.heartRateAnalysisDevice) || this.b.heartRate == hr) {
            return;
        }
        HMLog.info("SportMapFragment", new a(hr));
        ProxyTreadmill.INSTANCE.getInstance().syncHr(hr);
        this.b.heartRate = hr;
        if (this.b.getUserVisibleHint()) {
            View view = this.b.getView();
            SportDeviceView sportDeviceView = (SportDeviceView) (view == null ? null : view.findViewById(R.id.sport_map_device));
            if (sportDeviceView == null) {
                return;
            }
            final SportMapFragment sportMapFragment = this.b;
            sportDeviceView.post(new Runnable() { // from class: ob7
                @Override // java.lang.Runnable
                public final void run() {
                    SportMapFragment$startObserveDeviceData$HeartRateCallback.b(sportMapFragment);
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
    public void onOpen(boolean result) {
        HMLog.info("SportMapFragment", new b(result));
    }
}
