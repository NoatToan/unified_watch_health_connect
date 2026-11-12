package com.xiaomi.fitness.devicesettings.huami.weather;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.settingitem.settingitem.WeatherSetting;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import defpackage.av6;
import defpackage.eui;
import defpackage.f9r;
import defpackage.mj6;
import defpackage.n1j;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019B\u0007¢\u0006\u0004\b8\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\bJ!\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b'\u0010&J)\u0010-\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00107\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel;", "Lmj6;", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "locationKey", "", "updateWeatherSettingWithLocation", "(Lcom/xiaomi/fitness/sync/export/model/LocationKey;)V", "updateWearOSSyncState", "updateBleSyncState", "getWeatherSyncState", "()V", "", "isBaseLocationPermissionGranted", "()Z", "showLocationDialog", "weatherAlert", "showSettingDialog", "showLocationServiceSettingDialog", "isChecked", "updateWeatherSyncState", "(Z)V", "updateL66HuamiSyncState", "updateBeforeL66HuamiSyncState", "selectLocationKey", "onCitySelectForL66", "onCitySelectForBLESupportMoreCity", "onCitySelectForL66Before", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "", "getLocationPermissionList", "()[Ljava/lang/String;", "getLocationPermissionDescList", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/devicesettings/huami/weather/CityListTagAdapter;", "mCityListTagAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/weather/CityListTagAdapter;", "mTempIndex", "I", "limitAddCityCount", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeatherSetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherSetFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,861:1\n37#2:862\n36#2,3:863\n37#2:866\n36#2,3:867\n29#3:870\n*S KotlinDebug\n*F\n+ 1 WeatherSetFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetFragment\n*L\n377#1:862\n377#1:863,3\n393#1:866\n393#1:867,3\n206#1:870\n*E\n"})
public final class WeatherSetFragment extends BaseLoadableBindingFragment<WeatherSetViewModel, mj6> {
    public static final int RequestCodeSelectCity = 10;

    @NotNull
    public static final String TAG = "WeatherSetFragment";
    private int limitAddCityCount = 5;

    @Nullable
    private CityListTagAdapter mCityListTagAdapter;
    private int mTempIndex;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$showLocationServiceSettingDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/weather/WeatherSetFragment$showLocationServiceSettingDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C22141 extends av6 {
        public C22141() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(WeatherSetFragment this$0, int i, Intent intent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.updateWeatherSyncState(this$0.isBaseLocationPermissionGranted() && WeatherSetFragment.access$getMViewModel(this$0).isLocationServiceOpen());
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -2) {
                WeatherSetFragment.this.updateWeatherSyncState(false);
            } else if (which == -1) {
                FragmentActivity fragmentActivityRequireActivity = WeatherSetFragment.this.requireActivity();
                Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                final WeatherSetFragment weatherSetFragment = WeatherSetFragment.this;
                ((BaseActivity) fragmentActivityRequireActivity).startForActivityResult(intent, new Function2() { // from class: war
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WeatherSetFragment.C22141.onDialogClick$lambda$0(weatherSetFragment, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$showSettingDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/weather/WeatherSetFragment$showSettingDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C22151 extends av6 {
        public C22151() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(WeatherSetFragment this$0, int i, Intent intent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.updateWeatherSyncState(this$0.isBaseLocationPermissionGranted() && WeatherSetFragment.access$getMViewModel(this$0).isLocationServiceOpen());
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -2) {
                WeatherSetFragment.this.updateWeatherSyncState(false);
            } else if (which == -1) {
                WeatherSetFragment weatherSetFragment = WeatherSetFragment.this;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ApplicationExtKt.getApplication().getPackageName(), null));
                final WeatherSetFragment weatherSetFragment2 = WeatherSetFragment.this;
                weatherSetFragment.startForActivityResult(intent, new Function2() { // from class: xar
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WeatherSetFragment.C22151.onDialogClick$lambda$1(weatherSetFragment2, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$updateWeatherSyncState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$updateWeatherSyncState$1", f = "WeatherSetFragment.kt", i = {}, l = {587}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isChecked;
        int label;
        final /* synthetic */ WeatherSetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22161(boolean z, WeatherSetFragment weatherSetFragment, Continuation<? super C22161> continuation) {
            super(2, continuation);
            this.$isChecked = z;
            this.this$0 = weatherSetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22161(this.$isChecked, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(VibrateModeProgressBar.sLongToLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(WeatherSetFragment.TAG, "获取天气信息(定位) delay 2s");
            if (this.$isChecked) {
                WeatherSetFragment.access$getMViewModel(this.this$0).startLocation();
            } else {
                WeatherSetFragment.access$getMViewModel(this.this$0).getLocationInfo().setValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$weatherAlert$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/weather/WeatherSetFragment$weatherAlert$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C22171 extends av6 {
        public C22171() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(final WeatherSetFragment this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WeatherSetFragment.access$getMViewModel(this$0).getHuamiWeatherSetting(new Function1() { // from class: zar
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.C22171.onDialogClick$lambda$1$lambda$0(this$0, (WeatherSetting) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1$lambda$0(WeatherSetFragment this$0, WeatherSetting it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            it.setTemp(this$0.mTempIndex);
            WeatherSetFragment.access$getMViewModel(this$0).saveWeatherSetting(it);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            WeatherSetFragment.this.mTempIndex = which;
            RightArrowSingleLineTextView rightArrowSingleLineTextView = WeatherSetFragment.access$getMBinding(WeatherSetFragment.this).J;
            String string = null;
            if (WeatherSetFragment.this.mTempIndex == 0) {
                FragmentActivity mActivity = WeatherSetFragment.this.getMActivity();
                if (mActivity != null) {
                    string = mActivity.getString(wzi.P9);
                }
            } else {
                FragmentActivity mActivity2 = WeatherSetFragment.this.getMActivity();
                if (mActivity2 != null) {
                    string = mActivity2.getString(wzi.O9);
                }
            }
            rightArrowSingleLineTextView.setRemindText(string);
            Logger.i(WeatherSetFragment.TAG, " update weather unit =" + WeatherSetFragment.this.mTempIndex);
            WearableDeviceModel mDeviceModel = WeatherSetFragment.access$getMViewModel(WeatherSetFragment.this).getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                WeatherSetViewModel weatherSetViewModelAccess$getMViewModel = WeatherSetFragment.access$getMViewModel(WeatherSetFragment.this);
                int i = WeatherSetFragment.this.mTempIndex;
                final WeatherSetFragment weatherSetFragment = WeatherSetFragment.this;
                weatherSetViewModelAccess$getMViewModel.setWeatherTemperatureUnit(i, new Function1() { // from class: yar
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherSetFragment.C22171.onDialogClick$lambda$1(weatherSetFragment, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                WeatherSetFragment.access$getMViewModel(WeatherSetFragment.this).setBleWeatherConfig(WeatherSetFragment.this.mTempIndex);
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ mj6 access$getMBinding(WeatherSetFragment weatherSetFragment) {
        return (mj6) weatherSetFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ WeatherSetViewModel access$getMViewModel(WeatherSetFragment weatherSetFragment) {
        return (WeatherSetViewModel) weatherSetFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getWeatherSyncState() {
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            ((WeatherSetViewModel) getMViewModel()).getHuamiWeatherSetting(new Function1() { // from class: kar
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.getWeatherSyncState$lambda$17(this.f23668a, (WeatherSetting) obj);
                }
            });
            return;
        }
        WearableDeviceModel mDeviceModel2 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel2);
        boolean z = false;
        if (DeviceModelExtKt.isBluetooth(mDeviceModel2)) {
            if (isBaseLocationPermissionGranted()) {
                SyncPreference syncPreference = SyncPreference.INSTANCE;
                WearableDeviceModel mDeviceModel3 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel3);
                if (syncPreference.isNeedSyncWeather(mDeviceModel3.getDid()) && ((WeatherSetViewModel) getMViewModel()).isLocationServiceOpen()) {
                    z = true;
                }
            }
            updateWeatherSyncState(z);
            return;
        }
        WearableDeviceModel mDeviceModel4 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel4);
        if (DeviceModelExtKt.isWearOS(mDeviceModel4)) {
            SwitchButtonTwoLineTextView syncView = ((mj6) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(syncView, "syncView");
            ExtUtilsKt.setVisible(syncView, false);
            DividerView dividerView = ((mj6) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(dividerView, "dividerView");
            ExtUtilsKt.setVisible(dividerView, false);
            updateWeatherSettingWithLocation(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getWeatherSyncState$lambda$17(WeatherSetFragment this$0, WeatherSetting weatherSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weatherSetting, "weatherSetting");
        this$0.updateWeatherSyncState(this$0.isBaseLocationPermissionGranted() && weatherSetting.isSyncOpen() && ((WeatherSetViewModel) this$0.getMViewModel()).isLocationServiceOpen());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBaseLocationPermissionGranted() {
        return PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onCitySelectForBLESupportMoreCity(final LocationKey selectLocationKey) {
        if (getMActivity() == null) {
            return;
        }
        CityListTagAdapter cityListTagAdapter = this.mCityListTagAdapter;
        List<LocationKey> mCityList = cityListTagAdapter != null ? cityListTagAdapter.getMCityList() : null;
        if (mCityList != null && mCityList.size() == this.limitAddCityCount) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
                ToastExtKt.toastShort(mActivity, (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel)) ? wzi.C9 : wzi.D9);
                return;
            }
            return;
        }
        List<LocationKey> list = mCityList;
        if (list != null && !list.isEmpty()) {
            Iterator<LocationKey> it = mCityList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().locationKey, selectLocationKey.locationKey)) {
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 != null) {
                        ToastExtKt.toastShort(mActivity2, wzi.E9);
                        return;
                    }
                    return;
                }
            }
        }
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((WeatherSetViewModel) getMViewModel()).addCityKeyForBleL67(selectLocationKey, new Function2() { // from class: var
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WeatherSetFragment.onCitySelectForBLESupportMoreCity$lambda$31(this.f36681a, selectLocationKey, ((Boolean) obj).booleanValue(), (Integer) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCitySelectForBLESupportMoreCity$lambda$31(WeatherSetFragment this$0, LocationKey selectLocationKey, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectLocationKey, "$selectLocationKey");
        AnyExtKt.main$default(null, new WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1(this$0, z, selectLocationKey, num, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onCitySelectForL66(final LocationKey selectLocationKey) {
        if (getMActivity() == null) {
            return;
        }
        Logger.i(TAG, "onCitySelectForL66 selectLocationKey" + selectLocationKey);
        CityListTagAdapter cityListTagAdapter = this.mCityListTagAdapter;
        List<LocationKey> mCityList = cityListTagAdapter != null ? cityListTagAdapter.getMCityList() : null;
        if (mCityList != null && mCityList.size() == this.limitAddCityCount) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.C9);
                return;
            }
            return;
        }
        List<LocationKey> list = mCityList;
        if (list != null && !list.isEmpty()) {
            Iterator<LocationKey> it = mCityList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().locationKey, selectLocationKey.locationKey)) {
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 != null) {
                        ToastExtKt.toastShort(mActivity2, wzi.E9);
                        return;
                    }
                    return;
                }
            }
        }
        String locationKey = selectLocationKey.locationKey;
        Intrinsics.checkNotNullExpressionValue(locationKey, "locationKey");
        String locationName = selectLocationKey.locationName;
        Intrinsics.checkNotNullExpressionValue(locationName, "locationName");
        City city = new City(locationKey, locationName);
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((WeatherSetViewModel) getMViewModel()).addCityForHuamiL66(city, new Function1() { // from class: bar
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.onCitySelectForL66$lambda$30(this.f3993a, selectLocationKey, (City) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCitySelectForL66$lambda$30(WeatherSetFragment this$0, LocationKey selectLocationKey, City city) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectLocationKey, "$selectLocationKey");
        AnyExtKt.main$default(null, new WeatherSetFragment$onCitySelectForL66$1$1(this$0, city, selectLocationKey, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onCitySelectForL66Before(final LocationKey selectLocationKey) {
        ((mj6) getMBinding()).C.setRemindText(selectLocationKey.locationName);
        ((WeatherSetViewModel) getMViewModel()).getHuamiWeatherSetting(new Function1() { // from class: t9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.onCitySelectForL66Before$lambda$32(selectLocationKey, this, (WeatherSetting) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCitySelectForL66Before$lambda$32(LocationKey selectLocationKey, WeatherSetFragment this$0, WeatherSetting weatherSetting) {
        Intrinsics.checkNotNullParameter(selectLocationKey, "$selectLocationKey");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weatherSetting, "weatherSetting");
        weatherSetting.setLocationKey(new Gson().toJson(selectLocationKey));
        ((WeatherSetViewModel) this$0.getMViewModel()).saveWeatherSetting(weatherSetting);
        ArrayList arrayList = new ArrayList();
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) this$0.getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.export.WearableDeviceModel");
        arrayList.add(mDeviceModel);
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).syncWeatherToDevices(arrayList, true, selectLocationKey, true, null, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(WeatherSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, WeatherHelpFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(WeatherSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.weatherAlert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10(WeatherSetFragment this$0, LocationKey locationKey) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "locationBeanLiveData " + locationKey);
        this$0.updateWeatherSettingWithLocation(locationKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$4(final WeatherSetFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            ((WeatherSetViewModel) this$0.getMViewModel()).setBleWeatherConfigAlert(z ? 1 : 2);
        } else {
            ((WeatherSetViewModel) this$0.getMViewModel()).getHuaMiWeatherSettingsForL66(new Function1() { // from class: ear
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.onViewCreated$lambda$4$lambda$3(z, this$0, (com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$4$lambda$3(final boolean z, final WeatherSetFragment this$0, com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting weatherSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((WeatherSetViewModel) this$0.getMViewModel()).updateWeatherSettings(new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(Boolean.valueOf(z), null, null), new Function1() { // from class: s9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.onViewCreated$lambda$4$lambda$3$lambda$2(this.f33437a, z, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3$lambda$2(WeatherSetFragment this$0, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new WeatherSetFragment$onViewCreated$3$1$1$1(z2, this$0, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$5(WeatherSetFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel != null && !mDeviceModel.getIsDeviceConnected()) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            if (iSwitchButton != null) {
                iSwitchButton.setChecked(!z);
            }
            TextView syncOpenTips = ((mj6) this$0.getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(syncOpenTips, "syncOpenTips");
            ViewExtKt.setVisible(syncOpenTips, !z);
            return;
        }
        if (!z) {
            this$0.updateWeatherSyncState(false);
            return;
        }
        if (this$0.isBaseLocationPermissionGranted() && ((WeatherSetViewModel) this$0.getMViewModel()).isLocationServiceOpen()) {
            this$0.updateWeatherSyncState(true);
        } else if (((WeatherSetViewModel) this$0.getMViewModel()).isLocationServiceOpen()) {
            this$0.showLocationDialog();
        } else {
            this$0.showLocationServiceSettingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(WeatherSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) WeatherSelectCityFragment.class, new Bundle(), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$9(final WeatherSetFragment this$0, final int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CityListTagAdapter cityListTagAdapter = this$0.mCityListTagAdapter;
        Intrinsics.checkNotNull(cityListTagAdapter);
        if (i >= cityListTagAdapter.getMCityList().size()) {
            return Unit.INSTANCE;
        }
        CityListTagAdapter cityListTagAdapter2 = this$0.mCityListTagAdapter;
        Intrinsics.checkNotNull(cityListTagAdapter2);
        LocationKey locationKey = cityListTagAdapter2.getMCityList().get(i);
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            ((WeatherSetViewModel) this$0.getMViewModel()).removeCityKey(locationKey, new Function1() { // from class: gar
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.onViewCreated$lambda$9$lambda$8(this.f18791a, i, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            ((WeatherSetViewModel) this$0.getMViewModel()).removeCityForHuami(locationKey, new Function1() { // from class: far
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.onViewCreated$lambda$9$lambda$7(this.f17613a, i, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$7(WeatherSetFragment this$0, int i, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new WeatherSetFragment$onViewCreated$6$1$1(z, this$0, i, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$8(WeatherSetFragment this$0, int i, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new WeatherSetFragment$onViewCreated$6$2$1(z, this$0, i, null), 1, null);
        return Unit.INSTANCE;
    }

    private final void showLocationDialog() {
        final Function0 function0 = new Function0() { // from class: p9r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeatherSetFragment.showLocationDialog$lambda$23(this.f30155a);
            }
        };
        if (Build.VERSION.SDK_INT >= 30 && !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            function0.invoke();
            return;
        }
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogDescription(wzi.g6).setPositiveText(wzi.f38514b).setNegativeText(wzi.pf).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment.showLocationDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    function0.invoke();
                } else {
                    this.updateWeatherSyncState(false);
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$23(final WeatherSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String[] locationPermissionList = this$0.getLocationPermissionList();
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(locationPermissionList, locationPermissionList.length), this$0.getLocationPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: mar
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.showLocationDialog$lambda$23$lambda$22(this.f25959a, (MultiplePermissionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$23$lambda$22(final WeatherSetFragment this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: nar
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeatherSetFragment.showLocationDialog$lambda$23$lambda$22$lambda$18(this.f27734a);
            }
        });
        permissions.denied(new Function1() { // from class: oar
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.showLocationDialog$lambda$23$lambda$22$lambda$21(this.f28940a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showLocationDialog$lambda$23$lambda$22$lambda$18(WeatherSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((WeatherSetViewModel) this$0.getMViewModel()).isLocationServiceOpen()) {
            this$0.updateWeatherSyncState(true);
        } else {
            this$0.showLocationServiceSettingDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showLocationDialog$lambda$23$lambda$22$lambda$21(final WeatherSetFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.isBaseLocationPermissionGranted() && ((WeatherSetViewModel) this$0.getMViewModel()).isLocationServiceOpen()) {
            this$0.updateWeatherSyncState(true);
        } else if (((WeatherSetViewModel) this$0.getMViewModel()).isLocationServiceOpen()) {
            this$0.updateWeatherSyncState(false);
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            String str = (String) it.get(0);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            instance.showGuideSystemOpenPermissionWhenDeniedIfNeed(str, fragmentActivityRequireActivity, it, null, new Function0() { // from class: q9r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeatherSetFragment.showLocationDialog$lambda$23$lambda$22$lambda$21$lambda$19(this.f31266a);
                }
            }, new Function0() { // from class: r9r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeatherSetFragment.showLocationDialog$lambda$23$lambda$22$lambda$21$lambda$20(this.f32338a);
                }
            });
        } else {
            this$0.showLocationServiceSettingDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$23$lambda$22$lambda$21$lambda$19(WeatherSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSettingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$23$lambda$22$lambda$21$lambda$20(WeatherSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSettingDialog();
        return Unit.INSTANCE;
    }

    private final void showLocationServiceSettingDialog() {
        CommonDialog.c cVar = new CommonDialog.c("PermissionsUtil.showSettingDialog");
        cVar.setDialogTitle(wzi.K9);
        FragmentActivity mActivity = getMActivity();
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(mActivity != null ? mActivity.getString(wzi.J9) : null));
        cVar.setPositiveText(wzi.a2);
        cVar.setNegativeText(wzi.common_cancel);
        cVar.setCancelable(false);
        cVar.setCanceledOnTouchOutside(false);
        cVar.setCanceledOnBackPressed(false);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new C22141());
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        commonDialogCreate.showIfNeed(mActivity2.getSupportFragmentManager());
    }

    private final void showSettingDialog() {
        CommonDialog.c cVar = new CommonDialog.c("PermissionsUtil.showSettingDialog");
        FragmentActivity mActivity = getMActivity();
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(mActivity != null ? mActivity.getString(wzi.L9) : null));
        cVar.setPositiveText(n1j.v);
        cVar.setNegativeText(n1j.common_cancel);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new C22151());
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        commonDialogCreate.showIfNeed(mActivity2.getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateBeforeL66HuamiSyncState(final LocationKey locationKey) {
        ConstraintLayout selectCityView = ((mj6) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(selectCityView, "selectCityView");
        ViewExtKt.setVisible(selectCityView, ((mj6) getMBinding()).I.getSwitch());
        RightArrowSingleLineTextView tempView = ((mj6) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(tempView, "tempView");
        ViewExtKt.gone(tempView);
        SwitchButtonTwoLineTextView alertsView = ((mj6) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(alertsView, "alertsView");
        ViewExtKt.gone(alertsView);
        RecyclerView cityListView = ((mj6) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(cityListView, "cityListView");
        ViewExtKt.gone(cityListView);
        RightArrowTwoLineTextView cityView = ((mj6) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(cityView, "cityView");
        ViewExtKt.visible(cityView);
        ((mj6) getMBinding()).C.setSubtitle("");
        ((WeatherSetViewModel) getMViewModel()).getHuamiWeatherSetting(new Function1() { // from class: car
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.updateBeforeL66HuamiSyncState$lambda$29(this.f5137a, locationKey, (WeatherSetting) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateBeforeL66HuamiSyncState$lambda$29(WeatherSetFragment this$0, LocationKey locationKey, WeatherSetting weatherSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weatherSetting, "weatherSetting");
        Logger.d(TAG, "updateHuamiSyncState weatherSetting " + weatherSetting);
        weatherSetting.setSyncOpen(((mj6) this$0.getMBinding()).I.getSwitch());
        ((WeatherSetViewModel) this$0.getMViewModel()).saveWeatherSetting(weatherSetting);
        if (((mj6) this$0.getMBinding()).I.getSwitch()) {
            String locationKey2 = weatherSetting.getLocationKey();
            if (locationKey2 != null && locationKey2.length() != 0) {
                ((mj6) this$0.getMBinding()).C.setRemindText(((LocationKey) new Gson().fromJson(weatherSetting.getLocationKey(), LocationKey.class)).locationName);
            } else if (locationKey != null && locationKey.isUserAutoLocation) {
                weatherSetting.setLocationKey(new Gson().toJson(locationKey));
                ((WeatherSetViewModel) this$0.getMViewModel()).saveWeatherSetting(weatherSetting);
                ((mj6) this$0.getMBinding()).C.setRemindText(locationKey.locationName);
            }
            ((WeatherSetViewModel) this$0.getMViewModel()).syncWeather();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateBleSyncState(final LocationKey locationKey) {
        if (((mj6) getMBinding()).I.getSwitch()) {
            ConstraintLayout selectCityView = ((mj6) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(selectCityView, "selectCityView");
            ViewExtKt.visible(selectCityView);
        } else {
            ConstraintLayout selectCityView2 = ((mj6) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(selectCityView2, "selectCityView");
            ViewExtKt.gone(selectCityView2);
        }
        if (((mj6) getMBinding()).I.getSwitch()) {
            ((WeatherSetViewModel) getMViewModel()).getBleCityList(true, locationKey, new Function1() { // from class: iar
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.updateBleSyncState$lambda$15(this.f20954a, locationKey, (List) obj);
                }
            });
            ((WeatherSetViewModel) getMViewModel()).getL67BleWeatherConfig(new Function1() { // from class: jar
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.updateBleSyncState$lambda$16(this.f22600a, (f9r) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBleSyncState$lambda$15(WeatherSetFragment this$0, LocationKey locationKey, List updateCityList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(updateCityList, "updateCityList");
        AnyExtKt.main$default(null, new WeatherSetFragment$updateBleSyncState$1$1(this$0, updateCityList, locationKey, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBleSyncState$lambda$16(WeatherSetFragment this$0, f9r f9rVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new WeatherSetFragment$updateBleSyncState$2$1(this$0, f9rVar, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateL66HuamiSyncState(final LocationKey locationKey) {
        if (((mj6) getMBinding()).I.getSwitch()) {
            ConstraintLayout selectCityView = ((mj6) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(selectCityView, "selectCityView");
            ViewExtKt.visible(selectCityView);
            RightArrowSingleLineTextView tempView = ((mj6) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(tempView, "tempView");
            ViewExtKt.visible(tempView);
            if (AppUtil.INSTANCE.isPlayChannel()) {
                SwitchButtonTwoLineTextView alertsView = ((mj6) getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(alertsView, "alertsView");
                ViewExtKt.gone(alertsView);
            } else {
                SwitchButtonTwoLineTextView alertsView2 = ((mj6) getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(alertsView2, "alertsView");
                ViewExtKt.visible(alertsView2);
            }
            RecyclerView cityListView = ((mj6) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(cityListView, "cityListView");
            ViewExtKt.visible(cityListView);
            RightArrowTwoLineTextView cityView = ((mj6) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(cityView, "cityView");
            ViewExtKt.visible(cityView);
        } else {
            ConstraintLayout selectCityView2 = ((mj6) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(selectCityView2, "selectCityView");
            ViewExtKt.gone(selectCityView2);
            RightArrowSingleLineTextView tempView2 = ((mj6) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(tempView2, "tempView");
            ViewExtKt.gone(tempView2);
            SwitchButtonTwoLineTextView alertsView3 = ((mj6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(alertsView3, "alertsView");
            ViewExtKt.gone(alertsView3);
            RecyclerView cityListView2 = ((mj6) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(cityListView2, "cityListView");
            ViewExtKt.gone(cityListView2);
            RightArrowTwoLineTextView cityView2 = ((mj6) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(cityView2, "cityView");
            ViewExtKt.gone(cityView2);
        }
        ((WeatherSetViewModel) getMViewModel()).getHuamiWeatherSetting(new Function1() { // from class: u9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.updateL66HuamiSyncState$lambda$26(this.f35552a, (WeatherSetting) obj);
            }
        });
        if (((mj6) getMBinding()).I.getSwitch()) {
            ((WeatherSetViewModel) getMViewModel()).queryCityListForHuami(new Function1() { // from class: v9r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.updateL66HuamiSyncState$lambda$28(locationKey, this, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateL66HuamiSyncState$lambda$26(WeatherSetFragment this$0, WeatherSetting weatherSetting) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weatherSetting, "weatherSetting");
        Logger.d(TAG, "updateHuamiSyncState weatherSetting " + weatherSetting);
        weatherSetting.setSyncOpen(((mj6) this$0.getMBinding()).I.getSwitch());
        ((WeatherSetViewModel) this$0.getMViewModel()).saveWeatherSetting(weatherSetting);
        this$0.mTempIndex = weatherSetting.getTemp();
        RightArrowSingleLineTextView rightArrowSingleLineTextView = ((mj6) this$0.getMBinding()).J;
        if (this$0.mTempIndex == 1) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                string = mActivity.getString(wzi.O9);
            } else {
                string = null;
            }
        } else {
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 != null) {
                string = mActivity2.getString(wzi.P9);
            } else {
                string = null;
            }
        }
        rightArrowSingleLineTextView.setRemindText(string);
        ((mj6) this$0.getMBinding()).A.setSwitch(weatherSetting.isAlerts());
        ((WeatherSetViewModel) this$0.getMViewModel()).updateWeatherSettings(new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(Boolean.valueOf(weatherSetting.isAlerts()), null, null), new Function1() { // from class: w9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.updateL66HuamiSyncState$lambda$26$lambda$24(((Boolean) obj).booleanValue());
            }
        });
        ((WeatherSetViewModel) this$0.getMViewModel()).setWeatherTemperatureUnit(this$0.mTempIndex, new Function1() { // from class: x9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.updateL66HuamiSyncState$lambda$26$lambda$25(((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateL66HuamiSyncState$lambda$26$lambda$24(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateL66HuamiSyncState$lambda$26$lambda$25(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateL66HuamiSyncState$lambda$28(LocationKey locationKey, WeatherSetFragment this$0, List cityList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cityList, "cityList");
        ArrayList arrayList = new ArrayList();
        if (locationKey != null && locationKey.isUserAutoLocation) {
            arrayList.add(0, locationKey);
        }
        Iterator it = cityList.iterator();
        while (it.hasNext()) {
            City city = (City) it.next();
            LocationKey locationKey2 = new LocationKey();
            locationKey2.locationKey = city.getLocationKey();
            locationKey2.locationName = city.getName();
            if (Intrinsics.areEqual(city.getLocationKey(), locationKey != null ? locationKey.locationKey : null)) {
                ((WeatherSetViewModel) this$0.getMViewModel()).removeCityForHuami(locationKey2, new Function1() { // from class: dar
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherSetFragment.updateL66HuamiSyncState$lambda$28$lambda$27(((Boolean) obj).booleanValue());
                    }
                });
            } else {
                locationKey2.isUserAutoLocation = false;
                arrayList.add(locationKey2);
            }
        }
        CityListTagAdapter cityListTagAdapter = this$0.mCityListTagAdapter;
        Intrinsics.checkNotNull(cityListTagAdapter);
        cityListTagAdapter.updateCityKeyList(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateL66HuamiSyncState$lambda$28$lambda$27(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateWearOSSyncState(final LocationKey locationKey) {
        ConstraintLayout selectCityView = ((mj6) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(selectCityView, "selectCityView");
        ViewExtKt.visible(selectCityView);
        ((WeatherSetViewModel) getMViewModel()).getBleCityList(false, locationKey, new Function1() { // from class: y9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.updateWearOSSyncState$lambda$13(this.f39968a, locationKey, (List) obj);
            }
        });
        ((WeatherSetViewModel) getMViewModel()).getL67BleWeatherConfig(new Function1() { // from class: z9r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.updateWearOSSyncState$lambda$14(this.f41055a, (f9r) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateWearOSSyncState$lambda$13(WeatherSetFragment this$0, LocationKey locationKey, List updateCityList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(updateCityList, "updateCityList");
        AnyExtKt.main$default(null, new WeatherSetFragment$updateWearOSSyncState$1$1(this$0, updateCityList, locationKey, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateWearOSSyncState$lambda$14(WeatherSetFragment this$0, f9r f9rVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new WeatherSetFragment$updateWearOSSyncState$2$1(this$0, f9rVar, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateWeatherSettingWithLocation(final LocationKey locationKey) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = locationKey;
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isL66(mDeviceModel)) {
            ((WeatherSetViewModel) getMViewModel()).getHuamiWeatherSetting(new Function1() { // from class: aar
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherSetFragment.updateWeatherSettingWithLocation$lambda$12(locationKey, this, objectRef, (WeatherSetting) obj);
                }
            });
            return;
        }
        WearableDeviceModel mDeviceModel2 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel2);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel2)) {
            updateBeforeL66HuamiSyncState(locationKey);
            return;
        }
        WearableDeviceModel mDeviceModel3 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel3);
        if (DeviceModelExtKt.isBluetooth(mDeviceModel3)) {
            updateBleSyncState((LocationKey) objectRef.element);
            return;
        }
        WearableDeviceModel mDeviceModel4 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel4);
        if (DeviceModelExtKt.isWearOS(mDeviceModel4)) {
            updateWearOSSyncState((LocationKey) objectRef.element);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.xiaomi.fitness.sync.export.model.LocationKey] */
    public static final Unit updateWeatherSettingWithLocation$lambda$12(LocationKey locationKey, WeatherSetFragment this$0, Ref.ObjectRef currentLocation, WeatherSetting weatherSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentLocation, "$currentLocation");
        Intrinsics.checkNotNullParameter(weatherSetting, "weatherSetting");
        if (locationKey != null && locationKey.isUserAutoLocation) {
            weatherSetting.setLocationKey(new Gson().toJson(locationKey));
            ((WeatherSetViewModel) this$0.getMViewModel()).saveWeatherSetting(weatherSetting);
        } else if (weatherSetting.getLocationKey() != null) {
            Gson gson = new Gson();
            String locationKey2 = weatherSetting.getLocationKey();
            Intrinsics.checkNotNullExpressionValue(locationKey2, "getLocationKey(...)");
            currentLocation.element = (LocationKey) gson.fromJson(locationKey2, new TypeToken<LocationKey>() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$updateWeatherSettingWithLocation$lambda$12$$inlined$fromJson$1
            }.getType());
        }
        T t = currentLocation.element;
        if (t != 0) {
            Intrinsics.checkNotNull(t);
            if (((LocationKey) t).locationKey != null) {
                T t2 = currentLocation.element;
                Intrinsics.checkNotNull(t2);
                if (((LocationKey) t2).locationName != null) {
                    T t3 = currentLocation.element;
                    Intrinsics.checkNotNull(t3);
                    String locationKey3 = ((LocationKey) t3).locationKey;
                    Intrinsics.checkNotNullExpressionValue(locationKey3, "locationKey");
                    T t4 = currentLocation.element;
                    Intrinsics.checkNotNull(t4);
                    String locationName = ((LocationKey) t4).locationName;
                    Intrinsics.checkNotNullExpressionValue(locationName, "locationName");
                    ((WeatherSetViewModel) this$0.getMViewModel()).updateWeatherSettings(new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(null, new City(locationKey3, locationName), null), new Function1() { // from class: har
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WeatherSetFragment.updateWeatherSettingWithLocation$lambda$12$lambda$11(((Boolean) obj).booleanValue());
                        }
                    });
                }
            }
        }
        this$0.updateL66HuamiSyncState((LocationKey) currentLocation.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateWeatherSettingWithLocation$lambda$12$lambda$11(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateWeatherSyncState(boolean isChecked) {
        String did;
        ((mj6) getMBinding()).I.setSwitch(isChecked);
        TextView syncOpenTips = ((mj6) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(syncOpenTips, "syncOpenTips");
        ViewExtKt.setVisible(syncOpenTips, isChecked);
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null) {
            did = "";
        }
        syncPreference.setNeedSyncWeather(did, isChecked);
        Logger.i(TAG, "获取天气信息(缓存)");
        updateWeatherSettingWithLocation(null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C22161(isChecked, this, null), 3, null);
    }

    private final void weatherAlert() {
        FragmentActivity mActivity = getMActivity();
        String string = mActivity != null ? mActivity.getString(wzi.P9) : null;
        FragmentActivity mActivity2 = getMActivity();
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.N9).setItems(new String[]{string, mActivity2 != null ? mActivity2.getString(wzi.O9) : null}).setItemsCheckedIndex(this.mTempIndex).setCanceledOnTouchOutside(true).create().addDialogCallback(new C22171()).show(getParentFragmentManager(), "");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.M0;
    }

    @NotNull
    public final String[] getLocationPermissionDescList() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            FragmentActivity mActivity = getMActivity();
            ListExtKt.add(arrayList, mActivity != null ? mActivity.getString(wzi.f449if) : null);
            arrayList.add(" ");
            FragmentActivity mActivity2 = getMActivity();
            ListExtKt.add(arrayList, mActivity2 != null ? mActivity2.getString(wzi.gf) : null);
        } else {
            FragmentActivity mActivity3 = getMActivity();
            ListExtKt.add(arrayList, mActivity3 != null ? mActivity3.getString(wzi.f449if) : null);
            arrayList.add(" ");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final String[] getLocationPermissionList() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        } else {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        LocationKey locationKey;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 10 || resultCode != -1 || data == null || (locationKey = (LocationKey) data.getParcelableExtra("sData")) == null) {
            return;
        }
        Logger.d(TAG, "onActivityResult selectLocationKey " + locationKey.locationName);
        if (((WeatherSetViewModel) getMViewModel()).getMDeviceModel() == null) {
            return;
        }
        WearableDeviceModel mDeviceModel = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isL66(mDeviceModel)) {
            onCitySelectForL66(locationKey);
            return;
        }
        WearableDeviceModel mDeviceModel2 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel2);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel2)) {
            onCitySelectForL66Before(locationKey);
            return;
        }
        WearableDeviceModel mDeviceModel3 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel3);
        if (DeviceModelExtKt.isBluetooth(mDeviceModel3)) {
            if (((WeatherSetViewModel) getMViewModel()).getIsSupportMoreCity()) {
                onCitySelectForBLESupportMoreCity(locationKey);
            }
        } else {
            WearableDeviceModel mDeviceModel4 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel4);
            if (DeviceModelExtKt.isWearOS(mDeviceModel4)) {
                onCitySelectForBLESupportMoreCity(locationKey);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        WearableDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(view, "view");
        setTitle(wzi.M9);
        if (((WeatherSetViewModel) getMViewModel()).getMDeviceModel() == null || !((mDeviceModel = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel()) == null || mDeviceModel.getIsDeviceConnected())) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
            }
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                mActivity2.finish();
                return;
            }
            return;
        }
        WearableDeviceModel mDeviceModel2 = ((WeatherSetViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel2 == null || !DeviceModelExtKt.isWearOS(mDeviceModel2)) {
            this.limitAddCityCount = 5;
            ((mj6) getMBinding()).C.setSubtitle(wzi.C9);
        } else {
            this.limitAddCityCount = 4;
            ((mj6) getMBinding()).C.setSubtitle(wzi.D9);
        }
        ((mj6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: lar
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeatherSetFragment.onViewCreated$lambda$0(this.f24841a, view2);
            }
        });
        ((mj6) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: par
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeatherSetFragment.onViewCreated$lambda$1(this.f30179a, view2);
            }
        });
        ((mj6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: qar
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                WeatherSetFragment.onViewCreated$lambda$4(this.f31299a, z, iSwitchButton);
            }
        });
        ((mj6) getMBinding()).I.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: rar
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                WeatherSetFragment.onViewCreated$lambda$5(this.f32362a, z, iSwitchButton);
            }
        });
        ((mj6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: sar
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeatherSetFragment.onViewCreated$lambda$6(this.f33468a, view2);
            }
        });
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        flexboxLayoutManager.R(4);
        FragmentActivity mActivity3 = getMActivity();
        Intrinsics.checkNotNull(mActivity3);
        this.mCityListTagAdapter = new CityListTagAdapter(mActivity3, new ArrayList(), new Function1() { // from class: tar
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherSetFragment.onViewCreated$lambda$9(this.f34522a, ((Integer) obj).intValue());
            }
        });
        ((mj6) getMBinding()).B.setLayoutManager(flexboxLayoutManager);
        ((mj6) getMBinding()).B.setAdapter(this.mCityListTagAdapter);
        ((mj6) getMBinding()).B.addItemDecoration(new SelectCityLabelItemDecoration());
        TextPaint paint = ((mj6) getMBinding()).E.getPaint();
        paint.setFlags(8);
        paint.setAntiAlias(true);
        ((WeatherSetViewModel) getMViewModel()).getLocationInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: uar
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WeatherSetFragment.onViewCreated$lambda$10(this.f35578a, (LocationKey) obj);
            }
        });
        getWeatherSyncState();
    }
}
