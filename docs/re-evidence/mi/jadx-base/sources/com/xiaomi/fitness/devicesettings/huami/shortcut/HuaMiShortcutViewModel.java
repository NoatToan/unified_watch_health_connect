package com.xiaomi.fitness.devicesettings.huami.shortcut;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.common.extensions.ListExtensionKt;
import com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel;
import com.xiaomi.fitness.devicesettings.utils.LanguageHelper;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreen;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreenItem;
import com.xiaomi.hm.health.bt.sdk.data.ShortcutItem;
import defpackage.qyi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u001c\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001a\u001a\u00020\u000eJ\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eJ\u0014\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eJ\u0014\u0010$\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eJ\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0002J\u0016\u0010(\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0002J\u0012\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b \u0010\u0013¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "shortcutItemComparator", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel$ShortcutItemComparator;", "getShortcutItemComparator", "()Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel$ShortcutItemComparator;", "shortcutItemComparator$delegate", "Lkotlin/Lazy;", "mDisplayDataList", "", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "mFilteredDataList", "loadRet", "Landroidx/lifecycle/MutableLiveData;", "getLoadRet", "()Landroidx/lifecycle/MutableLiveData;", "loadRet$delegate", "loadData", "", "filterDataListIfNecessary", "handleItemIconClicked", "dataList", "item", "isListChanged", "", "currentList", "", "saveRet", "getSaveRet", "saveRet$delegate", "saveList", "list", "setDisplayDataList", "isL66", "deviceModel", "mergeList", "whetherItemCountOutOfLimit", "attach", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ShortcutItemComparator", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuaMiShortcutViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiShortcutViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n1863#2,2:213\n774#2:215\n865#2,2:216\n*S KotlinDebug\n*F\n+ 1 HuaMiShortcutViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel\n*L\n149#1:213,2\n172#1:215\n172#1:216,2\n*E\n"})
public final class HuaMiShortcutViewModel extends AbsViewModel {
    public static final int MAX_ENABLED_COUNT = 7;

    @Nullable
    private WearableDeviceModel mDeviceModel;

    /* JADX INFO: renamed from: shortcutItemComparator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shortcutItemComparator = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fjc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiShortcutViewModel.shortcutItemComparator_delegate$lambda$0();
        }
    });

    @NotNull
    private List<ShortcutListItem> mDisplayDataList = new ArrayList();

    @NotNull
    private final List<ShortcutListItem> mFilteredDataList = new ArrayList();

    /* JADX INFO: renamed from: loadRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gjc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiShortcutViewModel.loadRet_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: saveRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hjc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiShortcutViewModel.saveRet_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel$ShortcutItemComparator;", "Ljava/util/Comparator;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "<init>", "()V", "compare", "", "o1", "o2", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShortcutItemComparator implements Comparator<ShortcutListItem> {
        @Override // java.util.Comparator
        public int compare(@Nullable ShortcutListItem o1, @Nullable ShortcutListItem o2) {
            if (o1 != null && o2 != null) {
                if (o1.getType() == 1 && o1.getEnable()) {
                    return -1;
                }
                if (o2.getType() == 1 && o2.getEnable()) {
                    return 1;
                }
                if (o1.getType() == 1) {
                    return o2.getEnable() ? 1 : -1;
                }
                if (o2.getType() == 1) {
                    return o1.getEnable() ? -1 : 1;
                }
                if (!o1.getEnable() && o2.getEnable()) {
                    return 1;
                }
                if (o1.getEnable() && !o2.getEnable()) {
                    return -1;
                }
                if (!o1.getEnable() && !o2.getEnable()) {
                    return o1.getTargetIndex() - o2.getTargetIndex();
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$loadData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$loadData$1", f = "HuaMiShortcutViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$loadData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$loadData$1$1", f = "HuaMiShortcutViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HuaMiShortcutViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05041(HuaMiShortcutViewModel huaMiShortcutViewModel, Continuation<? super C05041> continuation) {
                super(2, continuation);
                this.this$0 = huaMiShortcutViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05041(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String did;
                List<ShortcutListItem> listConvert2ShortcutListItems;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel wearableDeviceModel = this.this$0.mDeviceModel;
                if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                    did = "";
                }
                SettingItemEntity settingItemValue = companion.readSettingItemValue(did, "secondaryscreen");
                String value = settingItemValue != null ? settingItemValue.getValue() : null;
                HuaMiShortcutViewModel huaMiShortcutViewModel = this.this$0;
                if (TextUtils.isEmpty(value)) {
                    HuamiShortcutHelper huamiShortcutHelper = HuamiShortcutHelper.INSTANCE;
                    WearableDeviceModel wearableDeviceModel2 = this.this$0.mDeviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel2);
                    List<SecondaryScreenItem> secondaryscreen = huamiShortcutHelper.getDefaultSecondaryScreen(wearableDeviceModel2).getSecondaryscreen();
                    Intrinsics.checkNotNullExpressionValue(secondaryscreen, "getSecondaryscreen(...)");
                    listConvert2ShortcutListItems = ListExtensionKt.convert2ShortcutListItems(secondaryscreen);
                } else {
                    List<SecondaryScreenItem> secondaryscreen2 = HuamiShortcutHelper.INSTANCE.getSecondaryScreen(value).getSecondaryscreen();
                    Intrinsics.checkNotNullExpressionValue(secondaryscreen2, "getSecondaryscreen(...)");
                    listConvert2ShortcutListItems = ListExtensionKt.convert2ShortcutListItems(secondaryscreen2);
                }
                huaMiShortcutViewModel.mDisplayDataList = listConvert2ShortcutListItems;
                this.this$0.filterDataListIfNecessary();
                this.this$0.getLoadRet().postValue(ListExtensionKt.deepCopy(this.this$0.mDisplayDataList));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuaMiShortcutViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05041 c05041 = new C05041(HuaMiShortcutViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05041, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$saveList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$saveList$1", f = "HuaMiShortcutViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ShortcutListItem> $list;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$saveList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutViewModel$saveList$1$1", f = "HuaMiShortcutViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<ShortcutListItem> $list;
            int label;
            final /* synthetic */ HuaMiShortcutViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05051(HuaMiShortcutViewModel huaMiShortcutViewModel, List<ShortcutListItem> list, Continuation<? super C05051> continuation) {
                super(2, continuation);
                this.this$0 = huaMiShortcutViewModel;
                this.$list = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05051(this.this$0, this.$list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                HuamiApiCaller huamiDevice;
                HuamiApiCaller huamiDevice2;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List listMergeList = this.this$0.mergeList(this.$list);
                HuaMiShortcutViewModel huaMiShortcutViewModel = this.this$0;
                WearableDeviceModel wearableDeviceModel = huaMiShortcutViewModel.mDeviceModel;
                Intrinsics.checkNotNull(wearableDeviceModel);
                boolean zIsL66 = huaMiShortcutViewModel.isL66(wearableDeviceModel);
                Boolean boolBoxBoolean = null;
                if (zIsL66) {
                    List<DisplayBean> listConvert2DisplayBean = ListExtensionKt.convert2DisplayBean(listMergeList);
                    WearableDeviceModel wearableDeviceModel2 = this.this$0.mDeviceModel;
                    if (wearableDeviceModel2 != null && (huamiDevice2 = DeviceModelExtKt.getHuamiDevice(wearableDeviceModel2)) != null) {
                        boolBoxBoolean = Boxing.boxBoolean(huamiDevice2.setDisplayListSync(2, listConvert2DisplayBean));
                    }
                } else {
                    List<ShortcutItem> listConvert2ShortcutItems = ListExtensionKt.convert2ShortcutItems(listMergeList);
                    WearableDeviceModel wearableDeviceModel3 = this.this$0.mDeviceModel;
                    if (wearableDeviceModel3 != null && (huamiDevice = DeviceModelExtKt.getHuamiDevice(wearableDeviceModel3)) != null) {
                        boolBoxBoolean = Boxing.boxBoolean(huamiDevice.setShortcutApp(listConvert2ShortcutItems));
                    }
                }
                Logger.i("HuaMiShortcutViewModel", "saveList: " + boolBoxBoolean);
                SecondaryScreen secondaryScreenConvert2SecondaryScreen = ListExtensionKt.convert2SecondaryScreen(listMergeList);
                HuaMiShortcutViewModel huaMiShortcutViewModel2 = this.this$0;
                List<SecondaryScreenItem> secondaryscreen = secondaryScreenConvert2SecondaryScreen.getSecondaryscreen();
                Intrinsics.checkNotNullExpressionValue(secondaryscreen, "getSecondaryscreen(...)");
                huaMiShortcutViewModel2.mDisplayDataList = ListExtensionKt.convert2ShortcutListItems(secondaryscreen);
                if (boolBoxBoolean != null && boolBoxBoolean.booleanValue()) {
                    DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                    WearableDeviceModel wearableDeviceModel4 = this.this$0.mDeviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel4);
                    companion.sendSettingItem(wearableDeviceModel4.getDid(), "secondaryscreen", secondaryScreenConvert2SecondaryScreen);
                }
                this.this$0.getSaveRet().postValue(boolBoxBoolean);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21951(List<ShortcutListItem> list, Continuation<? super C21951> continuation) {
            super(2, continuation);
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuaMiShortcutViewModel.this.new C21951(this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05051 c05051 = new C05051(HuaMiShortcutViewModel.this, this.$list, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05051, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void filterDataListIfNecessary() {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel != null) {
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isKongMing(wearableDeviceModel)) {
                return;
            }
            WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel2);
            HuamiApiCaller huamiDevice = DeviceModelExtKt.getHuamiDevice(wearableDeviceModel2);
            if (huamiDevice == null) {
                return;
            }
            Iterator<ShortcutListItem> it = this.mDisplayDataList.iterator();
            while (it.hasNext()) {
                ShortcutListItem next = it.next();
                int subType = next.getSubType();
                if (subType == 32) {
                    LanguageHelper languageHelper = LanguageHelper.INSTANCE;
                    WearableDeviceModel wearableDeviceModel3 = this.mDeviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel3);
                    if (!languageHelper.isCurrentLanguageInChina(wearableDeviceModel3.getDid())) {
                        this.mFilteredDataList.add(next);
                        it.remove();
                    }
                } else if (subType == 56 && huamiDevice.hasSoftwareFeature(43)) {
                    this.mFilteredDataList.add(next);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isL66(WearableDeviceModel deviceModel) {
        return (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(deviceModel) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isPanGu(deviceModel) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isKongMing(deviceModel)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ShortcutListItem> mergeList(List<ShortcutListItem> list) {
        List<ShortcutListItem> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        for (ShortcutListItem shortcutListItem : this.mFilteredDataList) {
            int subType = shortcutListItem.getSubType();
            if (subType == 32) {
                if (isListChanged(list)) {
                    shortcutListItem.setEnable(false);
                }
                mutableList.add(shortcutListItem);
            } else if (subType != 56) {
                Logger.w("unexpected filtered item:" + shortcutListItem, new Object[0]);
                mutableList.add(shortcutListItem);
            } else {
                mutableList.add(shortcutListItem);
            }
            CollectionsKt__MutableCollectionsJVMKt.sortWith(mutableList, getShortcutItemComparator());
        }
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData saveRet_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShortcutItemComparator shortcutItemComparator_delegate$lambda$0() {
        return new ShortcutItemComparator();
    }

    private final boolean whetherItemCountOutOfLimit(List<ShortcutListItem> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ShortcutListItem shortcutListItem = (ShortcutListItem) obj;
            if (shortcutListItem.getType() == 0 && shortcutListItem.getEnable()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() >= 7;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final MutableLiveData<List<ShortcutListItem>> getLoadRet() {
        return (MutableLiveData) this.loadRet.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSaveRet() {
        return (MutableLiveData) this.saveRet.getValue();
    }

    @NotNull
    public final ShortcutItemComparator getShortcutItemComparator() {
        return (ShortcutItemComparator) this.shortcutItemComparator.getValue();
    }

    public final void handleItemIconClicked(@NotNull List<ShortcutListItem> dataList, @NotNull ShortcutListItem item) {
        ShortcutListItem shortcutListItemFindItem;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.mDeviceModel == null || (shortcutListItemFindItem = ListExtensionKt.findItem(dataList, item)) == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isKongMing(wearableDeviceModel.getProduct()) || shortcutListItemFindItem.getEnable() || !whetherItemCountOutOfLimit(dataList)) {
            shortcutListItemFindItem.toggleStatus();
            CollectionsKt__MutableCollectionsJVMKt.sortWith(dataList, getShortcutItemComparator());
            getLoadRet().postValue(dataList);
        } else {
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.f31974k, 7, 7);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), quantityString);
        }
    }

    public final boolean isListChanged(@NotNull List<ShortcutListItem> currentList) {
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        return !Intrinsics.areEqual(this.mDisplayDataList, currentList);
    }

    public final void loadData() {
        if (this.mDeviceModel == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void saveList(@NotNull List<ShortcutListItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (this.mDeviceModel == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21951(list, null), 3, null);
    }

    public final void setDisplayDataList(@NotNull List<ShortcutListItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mDisplayDataList = ListExtensionKt.deepCopy(list);
    }
}
