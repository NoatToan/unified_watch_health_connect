package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import defpackage.eu6;
import defpackage.lyo;
import defpackage.mjr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002GFB\t\b\u0007¢\u0006\u0004\bE\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0012R\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010)\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R0\u00102\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\u00160\u00160\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020%0=8F¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020'0=8F¢\u0006\u0006\u001a\u0004\bC\u0010?¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "ng", "setSelectNativeBuiltinGroup", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;)V", "getSelectNativeBuiltinGroup", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "", "getMinWidgetCount", "()I", "getMaxWidgetCount", "loadWidgetList", "()V", "loadWidgetSupportList", "saveWidgetList", "idx", "", "removeWidget", "(I)Z", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "list", "changeWidgetList", "(Ljava/util/List;)V", "nativeBuiltinWrapper", "addWidget", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;)Z", "checkList", "Landroidx/lifecycle/MutableLiveData;", "_widgetList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3SupportedList;", "_supportWidget", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel$SaveState;", "kotlin.jvm.PlatformType", "_saveState", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3Wrapper;", "mWidgetV3", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3Wrapper;", "", "constWidgetList", "[Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "selectNativeBuiltinGroup", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "editorMode", "getEditorMode", "()Landroidx/lifecycle/MutableLiveData;", "setEditorMode", "(Landroidx/lifecycle/MutableLiveData;)V", "Lmjr;", "mRepository", "Lmjr;", "minWidgetNum", "I", "maxWidgetNum", "Landroidx/lifecycle/LiveData;", "getWidgetList", "()Landroidx/lifecycle/LiveData;", "widgetList", "getSupportWidget", "supportWidget", "getSaveState", "saveState", "<init>", "Companion", "SaveState", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetManagerV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetManagerV2ViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,206:1\n37#2:207\n36#2,3:208\n*S KotlinDebug\n*F\n+ 1 WidgetManagerV2ViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel\n*L\n191#1:207\n191#1:208,3\n*E\n"})
public final class WidgetManagerV2ViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "WidgetManagerV2ViewModel";
    private NativeBuiltinWrapper[] constWidgetList;

    @NotNull
    private MutableLiveData<Boolean> editorMode;

    @Nullable
    private mjr mRepository;

    @Nullable
    private WidgetV3Wrapper mWidgetV3;
    private int maxWidgetNum;
    private int minWidgetNum;

    @NotNull
    private WidgetV3NativeBuiltinGroup selectNativeBuiltinGroup;

    @NotNull
    private MutableLiveData<List<NativeBuiltinWrapper>> _widgetList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<WidgetV3SupportedList> _supportWidget = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<SaveState> _saveState = new MutableLiveData<>(SaveState.IDLE);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return WidgetManagerV2ViewModel.TAG;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel$SaveState;", "", "<init>", "(Ljava/lang/String;I)V", "SAVE_SUCCESS", "SAVE_FAIL", "IDLE", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum SaveState {
        SAVE_SUCCESS,
        SAVE_FAIL,
        IDLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<SaveState> getEntries() {
            return $ENTRIES;
        }
    }

    public WidgetManagerV2ViewModel() {
        lyo.b bVarM = new lyo.b().m();
        Intrinsics.checkNotNullExpressionValue(bVarM, "clear(...)");
        this.selectNativeBuiltinGroup = new WidgetV3NativeBuiltinGroup(bVarM);
        this.editorMode = new MutableLiveData<>(Boolean.FALSE);
    }

    public final boolean addWidget(@NotNull NativeBuiltinWrapper nativeBuiltinWrapper) {
        Intrinsics.checkNotNullParameter(nativeBuiltinWrapper, "nativeBuiltinWrapper");
        List<NativeBuiltinWrapper> value = this._widgetList.getValue();
        if (value == null || value.size() >= this.maxWidgetNum) {
            return false;
        }
        Logger.i(TAG, "选择添加小部件：" + nativeBuiltinWrapper);
        value.add(nativeBuiltinWrapper);
        this._widgetList.setValue(value);
        checkList();
        return true;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.mRepository = wearableDeviceModel != null ? new mjr(AppUtil.getApp(), wearableDeviceModel) : null;
    }

    public final void changeWidgetList(@NotNull List<NativeBuiltinWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<NativeBuiltinWrapper> value = this._widgetList.getValue();
        if (value != null) {
            value.clear();
            value.addAll(list);
        }
        checkList();
    }

    public final void checkList() {
        List<NativeBuiltinWrapper> value = this._widgetList.getValue();
        if (value == null || this.constWidgetList == null) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData = this.editorMode;
        Object[] array = value.toArray(new NativeBuiltinWrapper[0]);
        NativeBuiltinWrapper[] nativeBuiltinWrapperArr = this.constWidgetList;
        if (nativeBuiltinWrapperArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("constWidgetList");
            nativeBuiltinWrapperArr = null;
        }
        mutableLiveData.setValue(Boolean.valueOf(!Arrays.equals(array, nativeBuiltinWrapperArr)));
    }

    @NotNull
    public final MutableLiveData<Boolean> getEditorMode() {
        return this.editorMode;
    }

    /* JADX INFO: renamed from: getMaxWidgetCount, reason: from getter */
    public final int getMaxWidgetNum() {
        return this.maxWidgetNum;
    }

    /* JADX INFO: renamed from: getMinWidgetCount, reason: from getter */
    public final int getMinWidgetNum() {
        return this.minWidgetNum;
    }

    @NotNull
    public final LiveData<SaveState> getSaveState() {
        return this._saveState;
    }

    @NotNull
    public final WidgetV3NativeBuiltinGroup getSelectNativeBuiltinGroup() {
        return this.selectNativeBuiltinGroup;
    }

    @NotNull
    public final LiveData<WidgetV3SupportedList> getSupportWidget() {
        return this._supportWidget;
    }

    @NotNull
    public final LiveData<List<NativeBuiltinWrapper>> getWidgetList() {
        return this._widgetList;
    }

    public final void loadWidgetList() {
        Logger.i(TAG, "向设备请求WidgetV3数据: GET_WIDGET_V3");
        mjr mjrVar = this.mRepository;
        if (mjrVar != null) {
            mjrVar.j(new eu6<lyo>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerV2ViewModel.loadWidgetList.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(WidgetManagerV2ViewModel.INSTANCE.getTAG(), "向设备请求WidgetV3数据: 数据获取失败：" + errorCode);
                    WidgetManagerV2ViewModel.this._widgetList.postValue(new ArrayList());
                }

                @Override // defpackage.eu6
                public void onResult(lyo result) {
                    if (result != null) {
                        WidgetManagerV2ViewModel widgetManagerV2ViewModel = WidgetManagerV2ViewModel.this;
                        widgetManagerV2ViewModel.mWidgetV3 = new WidgetV3Wrapper(result);
                        WidgetV3Wrapper widgetV3Wrapper = widgetManagerV2ViewModel.mWidgetV3;
                        if (widgetV3Wrapper != null) {
                            widgetManagerV2ViewModel.minWidgetNum = widgetV3Wrapper.getMinCount();
                            widgetManagerV2ViewModel.maxWidgetNum = widgetV3Wrapper.getMaxCount();
                            widgetManagerV2ViewModel._widgetList.postValue(widgetV3Wrapper.getBuiltinWidgets());
                            widgetManagerV2ViewModel.constWidgetList = (NativeBuiltinWrapper[]) widgetV3Wrapper.getBuiltinWidgets().toArray(new NativeBuiltinWrapper[0]);
                        }
                    }
                }
            });
        }
    }

    public final void loadWidgetSupportList() {
        Logger.i(TAG, "向设备请求WidgetV3.SupportedList数据: GET_SUPPORT_WIDGET_V3");
        mjr mjrVar = this.mRepository;
        if (mjrVar != null) {
            mjrVar.h(new eu6<lyo.c>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerV2ViewModel.loadWidgetSupportList.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(WidgetManagerV2ViewModel.INSTANCE.getTAG(), "向设备请求WidgetV3.SupportedList数据: 失败： " + errorCode);
                    WidgetManagerV2ViewModel.this._supportWidget.postValue(new WidgetV3SupportedList(new lyo.c()));
                }

                @Override // defpackage.eu6
                public void onResult(lyo.c result) {
                    if (result != null) {
                        WidgetManagerV2ViewModel.this._supportWidget.postValue(new WidgetV3SupportedList(result));
                    }
                }
            });
        }
    }

    public final boolean removeWidget(int idx) {
        List<NativeBuiltinWrapper> value = this._widgetList.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        if (idx < this.minWidgetNum || idx >= value.size()) {
            return false;
        }
        Logger.i(TAG, "删除组件：" + value.get(idx));
        ListExtKt.remove(value, idx);
        this._widgetList.setValue(value);
        checkList();
        return true;
    }

    public final void saveWidgetList() {
        Logger.i(TAG, "向设备发送 SET_WIDGET_V3 " + getWidgetList().getValue());
        WidgetV3Wrapper widgetV3Wrapper = this.mWidgetV3;
        if (widgetV3Wrapper != null) {
            List<NativeBuiltinWrapper> value = getWidgetList().getValue();
            Intrinsics.checkNotNull(value);
            widgetV3Wrapper.setBuiltinWidgets(value);
        }
        mjr mjrVar = this.mRepository;
        if (mjrVar != null) {
            WidgetV3Wrapper widgetV3Wrapper2 = this.mWidgetV3;
            mjrVar.l(widgetV3Wrapper2 != null ? widgetV3Wrapper2.phraseWidgetV3() : null, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerV2ViewModel.saveWidgetList.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(WidgetManagerV2ViewModel.INSTANCE.getTAG(), "向设备发送 SET_WIDGET_V3 失败： " + errorCode);
                    WidgetManagerV2ViewModel.this._saveState.postValue(SaveState.SAVE_FAIL);
                }

                @Override // defpackage.eu6
                public void onResult(Boolean result) {
                    List<NativeBuiltinWrapper> builtinWidgets;
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.areEqual(result, bool)) {
                        WidgetManagerV2ViewModel.this.getEditorMode().setValue(bool);
                        WidgetManagerV2ViewModel.this._saveState.postValue(SaveState.SAVE_FAIL);
                        return;
                    }
                    WidgetManagerV2ViewModel.this.getEditorMode().setValue(Boolean.FALSE);
                    WidgetManagerV2ViewModel widgetManagerV2ViewModel = WidgetManagerV2ViewModel.this;
                    WidgetV3Wrapper widgetV3Wrapper3 = widgetManagerV2ViewModel.mWidgetV3;
                    NativeBuiltinWrapper[] nativeBuiltinWrapperArr = (widgetV3Wrapper3 == null || (builtinWidgets = widgetV3Wrapper3.getBuiltinWidgets()) == null) ? null : (NativeBuiltinWrapper[]) builtinWidgets.toArray(new NativeBuiltinWrapper[0]);
                    Intrinsics.checkNotNull(nativeBuiltinWrapperArr);
                    widgetManagerV2ViewModel.constWidgetList = nativeBuiltinWrapperArr;
                    WidgetManagerV2ViewModel.this._saveState.postValue(SaveState.SAVE_SUCCESS);
                }
            });
        }
    }

    public final void setEditorMode(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.editorMode = mutableLiveData;
    }

    public final void setSelectNativeBuiltinGroup(@NotNull WidgetV3NativeBuiltinGroup ng) {
        Intrinsics.checkNotNullParameter(ng, "ng");
        Logger.i(TAG, "选择App：{id = " + ng.getId() + ", name = " + ng.getName() + ", group = " + ng.getBuiltinWidgets() + "}");
        this.selectNativeBuiltinGroup = ng;
    }
}
