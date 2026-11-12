package com.xiaomi.fitness.devicesettings.huami.weather;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityFragment;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.WeatherSelectCityInfo;
import defpackage.cf6;
import defpackage.eui;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherSelectCityFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherSelectCityViewModel;", "Lcf6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter;", "selectCityAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter;", "", "key", "Ljava/lang/String;", "", "Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;", "dataList", "Ljava/util/List;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeatherSelectCityFragment extends BaseLoadableBindingFragment<WeatherSelectCityViewModel, cf6> {

    @NotNull
    public static final String TAG = "WeatherSelectCityFragment";

    @NotNull
    public static final String sData = "sData";
    public static final long sHandleDelay = 300;
    public static final int sKeySearch = 100;

    @NotNull
    private List<WeatherSelectCityInfo> dataList = new ArrayList();

    @Nullable
    private String key;

    @NotNull
    private final Handler mHandler;

    @Nullable
    private SelectCityAdapter selectCityAdapter;

    public WeatherSelectCityFragment() {
        final Looper mainLooper = Looper.getMainLooper();
        this.mHandler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityFragment$mHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 100) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    Logger.d(WeatherSelectCityFragment.TAG, "weather: SelectCityFragment handleMessage:" + str);
                    WeatherSelectCityFragment.access$getMViewModel(this.this$0).getLocationByName(str);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ WeatherSelectCityViewModel access$getMViewModel(WeatherSelectCityFragment weatherSelectCityFragment) {
        return (WeatherSelectCityViewModel) weatherSelectCityFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(WeatherSelectCityFragment this$0, LocationKey locationKey) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "locationBeanLiveData " + locationKey);
        if (locationKey == null || !locationKey.isUserAutoLocation) {
            ((cf6) this$0.getMBinding()).A.setText(this$0.getString(wzi.G9));
        } else {
            ((cf6) this$0.getMBinding()).A.setText(locationKey.locationName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(WeatherSelectCityFragment this$0, LocationKey locationKey) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (locationKey == null || (str = locationKey.locationKey) == null || str.length() == 0 || (str2 = locationKey.locationName) == null || str2.length() == 0) {
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            String string = this$0.getString(wzi.B1);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(mActivity, string);
            return;
        }
        Logger.d(TAG, "selectLocationKey " + locationKey.locationKey + " location name " + locationKey.locationName);
        Intent intent = new Intent();
        intent.putExtra("sData", locationKey);
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(-1, intent);
        }
        FragmentActivity mActivity3 = this$0.getMActivity();
        if (mActivity3 != null) {
            mActivity3.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(WeatherSelectCityFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        SelectCityAdapter selectCityAdapter = this$0.selectCityAdapter;
        Intrinsics.checkNotNull(selectCityAdapter);
        selectCityAdapter.updateDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) list2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(WeatherSelectCityFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocationKey value = ((WeatherSelectCityViewModel) this$0.getMViewModel()).getLocationInfo().getValue();
        if (value == null || !value.isUserAutoLocation) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.I9);
            }
            ((WeatherSelectCityViewModel) this$0.getMViewModel()).startLocation();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("sData", value);
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(-1, intent);
        }
        FragmentActivity mActivity3 = this$0.getMActivity();
        if (mActivity3 != null) {
            mActivity3.finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.qa);
        ((cf6) getMBinding()).B.setLayoutManager(new LinearLayoutManager(getMActivity()));
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.selectCityAdapter = new SelectCityAdapter(mActivity, this.dataList, new SelectCityAdapter.OnCityItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityFragment.onViewCreated.1
            @Override // com.xiaomi.fitness.devicesettings.huami.weather.SelectCityAdapter.OnCityItemClickListener
            public void onItemSelect(WeatherSelectCityInfo locationInfo) {
                Intrinsics.checkNotNullParameter(locationInfo, "locationInfo");
                WearableDeviceModel mDeviceModel = WeatherSelectCityFragment.access$getMViewModel(WeatherSelectCityFragment.this).getMDeviceModel();
                if (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel)) {
                    PageState.DefaultImpls.showLoading$default(WeatherSelectCityFragment.this, null, 0, false, 5, null);
                    WeatherSelectCityFragment.access$getMViewModel(WeatherSelectCityFragment.this).requestWeatherToLocation(locationInfo);
                    return;
                }
                LocationKey locationKey = new LocationKey();
                locationKey.locationKey = locationInfo.getLocationKey();
                locationKey.latitude = locationInfo.getLatitude();
                locationKey.longitude = locationInfo.getLongitude();
                locationKey.locationName = locationInfo.getName();
                locationKey.isUserAutoLocation = false;
                Intent intent = new Intent();
                intent.putExtra("sData", locationKey);
                FragmentActivity mActivity2 = WeatherSelectCityFragment.this.getMActivity();
                if (mActivity2 != null) {
                    mActivity2.setResult(-1, intent);
                }
                FragmentActivity mActivity3 = WeatherSelectCityFragment.this.getMActivity();
                if (mActivity3 != null) {
                    mActivity3.finish();
                }
            }
        });
        ((WeatherSelectCityViewModel) getMViewModel()).getLocationInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: k9r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WeatherSelectCityFragment.onViewCreated$lambda$0(this.f23638a, (LocationKey) obj);
            }
        });
        ((WeatherSelectCityViewModel) getMViewModel()).getSelectLocationKey().observe(getViewLifecycleOwner(), new Observer() { // from class: l9r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WeatherSelectCityFragment.onViewCreated$lambda$1(this.f24810a, (LocationKey) obj);
            }
        });
        ((WeatherSelectCityViewModel) getMViewModel()).getLocationList().observe(getViewLifecycleOwner(), new Observer() { // from class: m9r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WeatherSelectCityFragment.onViewCreated$lambda$2(this.f25927a, (List) obj);
            }
        });
        ((cf6) getMBinding()).B.setAdapter(this.selectCityAdapter);
        ((cf6) getMBinding()).D.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityFragment.onViewCreated.5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                WeatherSelectCityFragment.this.key = String.valueOf(s);
                WeatherSelectCityFragment.this.mHandler.removeMessages(100);
                if (!TextUtils.isEmpty(WeatherSelectCityFragment.this.key)) {
                    Message messageObtainMessage = WeatherSelectCityFragment.this.mHandler.obtainMessage(100, WeatherSelectCityFragment.this.key);
                    Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                    WeatherSelectCityFragment.this.mHandler.sendMessageDelayed(messageObtainMessage, 300L);
                } else {
                    SelectCityAdapter selectCityAdapter = WeatherSelectCityFragment.this.selectCityAdapter;
                    if (selectCityAdapter != null) {
                        selectCityAdapter.updateDataList(new ArrayList());
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        WearableDeviceModel mDeviceModel = ((WeatherSelectCityViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel != null && DeviceModelExtKt.isWearOS(mDeviceModel)) {
            TextView autoLocationView = ((cf6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(autoLocationView, "autoLocationView");
            ExtUtilsKt.setVisible(autoLocationView, false);
        } else {
            ((WeatherSelectCityViewModel) getMViewModel()).startLocation();
            TextView autoLocationView2 = ((cf6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(autoLocationView2, "autoLocationView");
            ExtUtilsKt.setVisible(autoLocationView2, true);
            ((cf6) getMBinding()).A.setText(getString(wzi.H9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((cf6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: n9r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeatherSelectCityFragment.setListener$lambda$3(this.f27691a, view);
            }
        });
    }
}
