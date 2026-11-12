package com.mi.fitness.checkupdate.di;

import android.content.Context;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.mi.fitness.checkupdate.UpdateHelper;
import com.mi.fitness.checkupdate.di.CheckUpdateModule;
import com.mi.fitness.checkupdate.export.CheckUpdateManager;
import com.mi.fitness.checkupdate.util.CheckUpdateManagerImpl;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.mi.fitness.checkupdate.util.CheckUpdateUtil;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import defpackage.gpi;
import defpackage.yyi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/mi/fitness/checkupdate/di/CheckUpdateModule;", "", "<init>", "()V", "bindCheckUpdateManager", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "checkUpdateManager", "Lcom/mi/fitness/checkupdate/util/CheckUpdateManagerImpl;", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckUpdateModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u008a\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012¢\u0006\u0002\b\u0017H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/mi/fitness/checkupdate/di/CheckUpdateModule$Companion;", "", "<init>", "()V", "provideCheckUpdateItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "createFeatureItem", "type", "", "icon", "title", Column.SUBTITLE, "more", "", "remind", "remindText", "", "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "itemVisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ExtensionFunctionType;", "(IIILjava/lang/Integer;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        private final TabContentItem createFeatureItem(int type, int icon, int title, Integer subtitle, boolean more, boolean remind, String remindText, Function1<? super Context, Unit> onClickListener, Function1<? super WearableDeviceModel, Boolean> itemVisible) {
            MutableLiveData<String> liveData;
            String str;
            if (subtitle != null) {
                String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
                if (string != null) {
                    liveData = StringExtKt.toLiveData(string);
                } else {
                    liveData = null;
                }
            } else {
                liveData = null;
            }
            MutableLiveData<String> mutableLiveData = liveData;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String str2 = "";
            if (wearableDeviceModel != null) {
                String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
                String latestFirmwareVersionFromNet = CheckUpdatePreferenceSupport.INSTANCE.getLatestFirmwareVersionFromNet(wearableDeviceModel.getDid());
                LogExtKt.logi("CheckUpdateModule", "currentVersion：" + firmwareVersion + ", latestVersion：" + latestFirmwareVersionFromNet);
                if (CheckUpdateUtil.INSTANCE.compareFirmwareVersion2(latestFirmwareVersionFromNet, firmwareVersion) > 0) {
                    if (firmwareVersion == null) {
                        firmwareVersion = "";
                    }
                    String str3 = firmwareVersion;
                    firmwareVersion = "";
                    str2 = str3;
                } else if (firmwareVersion == null) {
                    firmwareVersion = "";
                }
                str = str2;
                str2 = firmwareVersion;
            } else {
                str = "";
            }
            String string2 = ApplicationExtKt.getApplication().getString(title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new TabContentItem(11, type, icon, StringExtKt.toLiveData(string2), mutableLiveData, more, new ObservableBoolean(remind), StringExtKt.toLiveData(str2), null, onClickListener, itemVisible, null, StringExtKt.toLiveData(str), 2304, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TabContentItem createFeatureItem$default(Companion companion, int i, int i2, int i3, Integer num, boolean z, boolean z2, String str, Function1 function1, Function1 function2, int i4, Object obj) {
            return companion.createFeatureItem(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? null : function1, (i4 & 256) != 0 ? null : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit provideCheckUpdateItem$lambda$0(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                UpdateHelper.INSTANCE.doCheckUpdate(it);
            } else {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.common_hint_network_unavailable);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean provideCheckUpdateItem$lambda$1(WearableDeviceModel createFeatureItem) {
            Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
            return !DeviceModelExtKt.isWearOS(createFeatureItem);
        }

        @NotNull
        public final TabContentItem provideCheckUpdateItem() {
            return createFeatureItem$default(this, 144, gpi.f19215a, yyi.f, null, false, false, null, new Function1() { // from class: tu3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CheckUpdateModule.Companion.provideCheckUpdateItem$lambda$0((Context) obj);
                }
            }, new Function1() { // from class: uu3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(CheckUpdateModule.Companion.provideCheckUpdateItem$lambda$1((WearableDeviceModel) obj));
                }
            }, 120, null);
        }
    }

    @NotNull
    public abstract CheckUpdateManager bindCheckUpdateManager(@NotNull CheckUpdateManagerImpl checkUpdateManager);
}
