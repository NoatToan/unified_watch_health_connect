package com.xiaomi.hm.health.device;

import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudLoadingDialog;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingResult;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingType;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0017R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010!\u001a\u00020\u001c8\u0004@\u0004X\u0084D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00028\u00008$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "observeData", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "onLoadingSuccess", "onLoadingFail", "", "isDisable", "setDisableClick", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "onDestroy", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventBackgroundThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "onEvent", "a", "Z", "mIsDisableClick", "", "b", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/device/earbud/fragment/dialog/EarbudLoadingDialog;", "c", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/earbud/fragment/dialog/EarbudLoadingDialog;", "mLoadingDialog", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BaseEarbudDeviceActivity<T extends EarbudDeviceViewModel> extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean mIsDisableClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "BaseEarbudDeviceActivity";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoadingDialog = LazyKt__LazyJVMKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/device/earbud/fragment/dialog/EarbudLoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EarbudLoadingDialog> {
        public final /* synthetic */ BaseEarbudDeviceActivity<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(BaseEarbudDeviceActivity<? extends T> baseEarbudDeviceActivity) {
            super(0);
            this.a = baseEarbudDeviceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudLoadingDialog invoke() {
            return new EarbudLoadingDialog(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "", "<no name provided>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<EarbudLoadingType, Unit> {
        public final /* synthetic */ BaseEarbudDeviceActivity<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(BaseEarbudDeviceActivity<? extends T> baseEarbudDeviceActivity) {
            super(1);
            this.a = baseEarbudDeviceActivity;
        }

        public final void a(@NotNull EarbudLoadingType earbudLoadingType) {
            this.a.onLoadingSuccess(earbudLoadingType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EarbudLoadingType earbudLoadingType) {
            a(earbudLoadingType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "", "<no name provided>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<EarbudLoadingType, Unit> {
        public final /* synthetic */ BaseEarbudDeviceActivity<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(BaseEarbudDeviceActivity<? extends T> baseEarbudDeviceActivity) {
            super(1);
            this.a = baseEarbudDeviceActivity;
        }

        public final void a(@NotNull EarbudLoadingType earbudLoadingType) {
            this.a.onLoadingFail(earbudLoadingType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EarbudLoadingType earbudLoadingType) {
            a(earbudLoadingType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceConnectionEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "receive earbud connect event:" + this.a;
        }
    }

    private final EarbudLoadingDialog d() {
        return (EarbudLoadingDialog) this.mLoadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BaseEarbudDeviceActivity baseEarbudDeviceActivity, EarbudLoadingResult earbudLoadingResult) {
        if (earbudLoadingResult == null) {
            return;
        }
        baseEarbudDeviceActivity.d().setResult(earbudLoadingResult, new b(baseEarbudDeviceActivity), new c(baseEarbudDeviceActivity));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.mIsDisableClick) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @NotNull
    public abstract T getMViewModel();

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public void observeData() {
        getMViewModel().getEarbudOperResultData().observe(this, new Observer() { // from class: nq
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseEarbudDeviceActivity.e(this.a, (EarbudLoadingResult) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull HMDeviceBatteryEvent event) {
        if (event.getDeviceType() == HMDeviceType.EARBUD) {
            getMViewModel().loadBattery();
        }
    }

    public final void onEventBackgroundThread(@NotNull HMDeviceConnectionEvent event) {
        if (event.getDeviceType() == HMDeviceType.EARBUD) {
            HMLog.info(this.TAG, new d(event));
            getMViewModel().refreshDevice();
        }
    }

    public void onLoadingFail(@NotNull EarbudLoadingType type) {
    }

    public void onLoadingSuccess(@NotNull EarbudLoadingType type) {
    }

    public final void setDisableClick(boolean isDisable) {
        this.mIsDisableClick = isDisable;
    }
}
