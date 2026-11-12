package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import defpackage.eu6;
import defpackage.hir;
import defpackage.jyo;
import defpackage.kyo;
import defpackage.mjr;
import defpackage.rxo;
import defpackage.wjr;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b5\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u0004H\u0014¢\u0006\u0004\b$\u0010\bR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetMangerViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "loadWidgetGroupListLiveData", "()V", "Ljyo$b;", "list", "Leu6;", "", "callback", "setWidgetGroupListToDevice", "(Ljyo$b;Leu6;)V", "Landroidx/lifecycle/LiveData;", "Lkyo$a;", "loadWidgetSupportedList", "()Landroidx/lifecycle/LiveData;", "", "Lrxo;", "loadSportListFromDevice", "setSupportedSportList", "(Ljava/util/List;)V", "getSupportedSportList", "()Ljava/util/List;", "", "widgetItemIndex", "Lwjr;", "getSelectSportEntity", "(I)Lwjr;", "entity", "setSelectSportEntity", "(ILwjr;)V", "selectSportEntityMapClear", "onCleared", "Lmjr;", "mRepository", "Lmjr;", "Landroidx/lifecycle/MutableLiveData;", "Lhir;", "mWidgetGroupListLiveData", "Landroidx/lifecycle/MutableLiveData;", "getMWidgetGroupListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setMWidgetGroupListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "", "mSelectedSportEntityMap", "Ljava/util/Map;", "mSupportedSportList", "Ljava/util/List;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetMangerViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    private static final String TAG = "WidgetMangerViewModel";

    @Nullable
    private mjr mRepository;

    @Nullable
    private List<rxo> mSupportedSportList;

    @NotNull
    private MutableLiveData<hir> mWidgetGroupListLiveData = new MutableLiveData<>();

    @NotNull
    private final Map<Integer, wjr> mSelectedSportEntityMap = new LinkedHashMap();

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.mRepository = wearableDeviceModel != null ? new mjr(AppUtil.getApp(), wearableDeviceModel) : null;
    }

    @NotNull
    public final MutableLiveData<hir> getMWidgetGroupListLiveData() {
        return this.mWidgetGroupListLiveData;
    }

    @Nullable
    public final wjr getSelectSportEntity(int widgetItemIndex) {
        return this.mSelectedSportEntityMap.get(Integer.valueOf(widgetItemIndex));
    }

    @Nullable
    public final List<rxo> getSupportedSportList() {
        return this.mSupportedSportList;
    }

    @Nullable
    public final LiveData<List<rxo>> loadSportListFromDevice() {
        mjr mjrVar = this.mRepository;
        if (mjrVar == null) {
            Logger.e(TAG, "loadSportListFromDevice: your device dose not support WidgetGroup");
            return new MutableLiveData(CollectionsKt__CollectionsKt.emptyList());
        }
        Intrinsics.checkNotNull(mjrVar);
        return mjrVar.g();
    }

    public final void loadWidgetGroupListLiveData() {
        mjr mjrVar = this.mRepository;
        if (mjrVar == null) {
            Logger.e(TAG, "loadWidgetGroupListLiveData: your device dose not support WidgetGroup");
        } else {
            Intrinsics.checkNotNull(mjrVar);
            mjrVar.i(new eu6<jyo.b>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetMangerViewModel.loadWidgetGroupListLiveData.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    WidgetMangerViewModel.this.getMWidgetGroupListLiveData().postValue(hir.f);
                }

                @Override // defpackage.eu6
                public void onResult(jyo.b list) {
                    Intrinsics.checkNotNullParameter(list, "list");
                    WidgetMangerViewModel.this.getMWidgetGroupListLiveData().postValue(new hir(list));
                }
            });
        }
    }

    @Nullable
    public final LiveData<kyo.a> loadWidgetSupportedList() {
        mjr mjrVar = this.mRepository;
        if (mjrVar == null) {
            Logger.e(TAG, "loadWidgetSupportedList: your device dose not support WidgetGroup");
            return null;
        }
        Intrinsics.checkNotNull(mjrVar);
        return mjrVar.d();
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        mjr mjrVar = this.mRepository;
        if (mjrVar != null) {
            Intrinsics.checkNotNull(mjrVar);
            mjrVar.c();
        }
    }

    public final void selectSportEntityMapClear() {
        this.mSelectedSportEntityMap.clear();
    }

    public final void setMWidgetGroupListLiveData(@NotNull MutableLiveData<hir> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mWidgetGroupListLiveData = mutableLiveData;
    }

    public final void setSelectSportEntity(int widgetItemIndex, @NotNull wjr entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        try {
            this.mSelectedSportEntityMap.put(Integer.valueOf(widgetItemIndex), entity.clone());
        } catch (CloneNotSupportedException unused) {
        }
    }

    public final void setSupportedSportList(@Nullable List<rxo> list) {
        this.mSupportedSportList = list;
    }

    public final void setWidgetGroupListToDevice(@Nullable jyo.b list, @Nullable eu6<Boolean> callback) {
        mjr mjrVar = this.mRepository;
        if (mjrVar != null) {
            Intrinsics.checkNotNull(mjrVar);
            mjrVar.k(list, callback);
        } else {
            Logger.e(TAG, "updateWidgetGroupListToDevice: your device dose not support WidgetGroup");
            if (callback != null) {
                callback.onResult(Boolean.FALSE);
            }
        }
    }
}
