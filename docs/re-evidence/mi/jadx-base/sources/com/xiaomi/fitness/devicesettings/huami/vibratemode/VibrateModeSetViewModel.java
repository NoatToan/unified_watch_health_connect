package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import defpackage.ayo;
import defpackage.dyo;
import defpackage.eyo;
import defpackage.lhi;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\u0018\u0000 N2\u00020\u0001:\u0002ONB\u0007¢\u0006\u0004\bM\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u001c\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0004J\u0015\u0010$\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0004J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b&\u0010\fJ\u001d\u0010'\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b-\u0010\u001dJ\r\u0010.\u001a\u00020\u0002¢\u0006\u0004\b.\u0010\u0004R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010,R\"\u00104\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001d\u0010?\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00110@8\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010ER\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110@8\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010E¨\u0006P"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "", "getHuamiCustomerVibrateList", "()V", "getBleCustomerVibrateList", "Ldyo;", "item", "updateDefaultSet", "(Ldyo;)V", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "setBleVibrate", "(Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;)V", "vibrateBean", "setHuamiVibrate", "", "type", "", "needCallBack", "setBleDefault", "(IZ)V", "setHuamiDefault", "removeBleVibrate", "removeHuamiVibrate", "Landroid/content/Context;", "context", "", "name", "renameBleVibrate", "(Landroid/content/Context;Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;Ljava/lang/String;)V", "renameHuamiVibrate", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "getVibrateList", "setVibrate", "setDefault", "removeVibrate", "isNameHas", "(Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;Ljava/lang/String;)Z", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "mode", "initVibrateMode", "(Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;)V", "renameVibrate", "stopVibrate", "mVibrateMode", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "getMVibrateMode", "()Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "setMVibrateMode", "version", "I", "getVersion", "()I", "setVersion", "(I)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel$VibrateListObserver;", "vibrateListObserver", "Landroidx/lifecycle/MutableLiveData;", "getVibrateListObserver", "()Landroidx/lifecycle/MutableLiveData;", "", "updateItems", "Ljava/util/List;", "vibrateSetObserver", "getVibrateSetObserver", "defaultVibrateObserver", "getDefaultVibrateObserver", "<init>", "Companion", "VibrateListObserver", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVibrateModeSetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n29#2:522\n29#2:523\n1557#3:524\n1628#3,2:525\n1630#3:531\n11178#4:527\n11513#4,3:528\n13467#4,3:532\n13467#4,3:536\n1#5:535\n*S KotlinDebug\n*F\n+ 1 VibrateModeSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel\n*L\n71#1:522\n75#1:523\n76#1:524\n76#1:525,2\n76#1:531\n80#1:527\n80#1:528,3\n390#1:532,3\n482#1:536,3\n*E\n"})
public final class VibrateModeSetViewModel extends BaseLoadableBindingViewModel {
    public static final int DEFAULT_BBJI = 251;
    public static final int DEFAULT_BINGNATIE = 253;
    public static final int DEFAULT_DEFAULT = 0;
    public static final int DEFAULT_LOVEWORK = 250;
    public static final int DEFAULT_QINGWU = 255;
    public static final int DEFAULT_WANJUZHIJIA = 252;
    public static final int DEFAULT_YUEDONG = 254;

    @Nullable
    private VibrateModeBean mVibrateMode;
    private int version;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cqq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VibrateModeSetViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<VibrateListObserver> vibrateListObserver = new MutableLiveData<>();

    @NotNull
    private final List<dyo> updateItems = new ArrayList();

    @NotNull
    private final MutableLiveData<Boolean> vibrateSetObserver = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> defaultVibrateObserver = new MutableLiveData<>();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\"\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\tHÆ\u0003J@\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel$VibrateListObserver;", "", "success", "", "vibrateList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "Ljava/util/ArrayList;", VibrateModeSetFragment.MAX, "", "<init>", "(ZLjava/util/ArrayList;I)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getVibrateList", "()Ljava/util/ArrayList;", "setVibrateList", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "getMax", "()I", "setMax", "(I)V", "defaultList", "", "getDefaultList", "()Ljava/util/List;", "setDefaultList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "(ZLjava/util/ArrayList;I)Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel$VibrateListObserver;", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VibrateListObserver {

        @NotNull
        private List<Integer> defaultList = new ArrayList();
        private int max;
        private boolean success;

        @Nullable
        private ArrayList<VibrateBean> vibrateList;

        public VibrateListObserver(boolean z, @Nullable ArrayList<VibrateBean> arrayList, int i) {
            this.success = z;
            this.vibrateList = arrayList;
            this.max = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VibrateListObserver copy$default(VibrateListObserver vibrateListObserver, boolean z, ArrayList arrayList, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = vibrateListObserver.success;
            }
            if ((i2 & 2) != 0) {
                arrayList = vibrateListObserver.vibrateList;
            }
            if ((i2 & 4) != 0) {
                i = vibrateListObserver.max;
            }
            return vibrateListObserver.copy(z, arrayList, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        public final ArrayList<VibrateBean> component2() {
            return this.vibrateList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        @NotNull
        public final VibrateListObserver copy(boolean success, @Nullable ArrayList<VibrateBean> vibrateList, int max) {
            return new VibrateListObserver(success, vibrateList, max);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VibrateListObserver)) {
                return false;
            }
            VibrateListObserver vibrateListObserver = (VibrateListObserver) other;
            return this.success == vibrateListObserver.success && Intrinsics.areEqual(this.vibrateList, vibrateListObserver.vibrateList) && this.max == vibrateListObserver.max;
        }

        @NotNull
        public final List<Integer> getDefaultList() {
            return this.defaultList;
        }

        public final int getMax() {
            return this.max;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        public final ArrayList<VibrateBean> getVibrateList() {
            return this.vibrateList;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.success) * 31;
            ArrayList<VibrateBean> arrayList = this.vibrateList;
            return ((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Integer.hashCode(this.max);
        }

        public final void setDefaultList(@NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.defaultList = list;
        }

        public final void setMax(int i) {
            this.max = i;
        }

        public final void setSuccess(boolean z) {
            this.success = z;
        }

        public final void setVibrateList(@Nullable ArrayList<VibrateBean> arrayList) {
            this.vibrateList = arrayList;
        }

        @NotNull
        public String toString() {
            return "VibrateListObserver(success=" + this.success + ", vibrateList=" + this.vibrateList + ", max=" + this.max + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$getBleCustomerVibrateList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$getBleCustomerVibrateList$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VibrateListObserver $observer;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$getBleCustomerVibrateList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$getBleCustomerVibrateList$1$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ VibrateListObserver $observer;
            int label;
            final /* synthetic */ VibrateModeSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05141(VibrateModeSetViewModel vibrateModeSetViewModel, VibrateListObserver vibrateListObserver, Continuation<? super C05141> continuation) {
                super(2, continuation);
                this.this$0 = vibrateModeSetViewModel;
                this.$observer = vibrateListObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05141(this.this$0, this.$observer, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 46;
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final VibrateModeSetViewModel vibrateModeSetViewModel = this.this$0;
                final VibrateListObserver vibrateListObserver = this.$observer;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel.getBleCustomerVibrateList.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "loadBLEModeSettingList onError" + code);
                        vibrateListObserver.setSuccess(false);
                        vibrateListObserver.setDefaultList(CollectionsKt__CollectionsKt.mutableListOf(0));
                        vibrateListObserver.setVibrateList(new ArrayList<>());
                        vibrateModeSetViewModel.getVibrateListObserver().postValue(vibrateListObserver);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        s7r packet;
                        txo txoVarE;
                        dyo dyoVar = null;
                        eyo eyoVarK = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.K();
                        dyo[] dyoVarArr = eyoVarK != null ? eyoVarK.c : null;
                        Integer numValueOf = eyoVarK != null ? Integer.valueOf(eyoVarK.d) : null;
                        ayo[] ayoVarArr = eyoVarK != null ? eyoVarK.e : null;
                        vibrateModeSetViewModel.setVersion(eyoVarK != null ? eyoVarK.f : 0);
                        Integer numValueOf2 = result != null ? Integer.valueOf(result.getCode()) : null;
                        String string = Arrays.toString(ayoVarArr);
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        String string2 = Arrays.toString(dyoVarArr);
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        Logger.i(VibrateModeSetViewModelKt.TAG, "getBleCustomerVibrateList onSuccess code = " + numValueOf2 + " maxNumber = " + numValueOf + " vibrators = " + string + " items = " + string2);
                        ArrayList<VibrateBean> arrayList = new ArrayList<>();
                        ArrayList arrayList2 = new ArrayList();
                        if (dyoVarArr != null && dyoVarArr.length != 0 && ayoVarArr != null && ayoVarArr.length != 0) {
                            for (ayo ayoVar : ayoVarArr) {
                                String name = ayoVar.d;
                                Intrinsics.checkNotNullExpressionValue(name, "name");
                                arrayList.add(new VibrateBean(name, String.valueOf(ayoVar.c), CollectionsKt__CollectionsKt.emptyList()));
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(vibrateModeSetViewModel.updateItems, dyoVarArr);
                        }
                        arrayList2.add(0);
                        if (dyoVarArr != null) {
                            VibrateModeSetViewModel vibrateModeSetViewModel2 = vibrateModeSetViewModel;
                            for (dyo dyoVar2 : dyoVarArr) {
                                VibrateType vibrateTypeIndex2Mode = VibrateSpUtils.INSTANCE.index2Mode(dyoVar2.c - 1);
                                VibrateModeBean mVibrateMode = vibrateModeSetViewModel2.getMVibrateMode();
                                if (vibrateTypeIndex2Mode == (mVibrateMode != null ? mVibrateMode.getType() : null)) {
                                    dyoVar = dyoVar2;
                                    break;
                                }
                            }
                            if (dyoVar == null) {
                                return;
                            }
                            if ((dyoVar.e & 1) == 1) {
                                arrayList2.add(255);
                            }
                            if ((dyoVar.e & 2) == 2) {
                                arrayList2.add(254);
                            }
                            if ((dyoVar.e & 4) == 4) {
                                arrayList2.add(253);
                            }
                            if ((dyoVar.e & 8) == 8) {
                                arrayList2.add(252);
                            }
                            if ((dyoVar.e & 16) == 16) {
                                arrayList2.add(Integer.valueOf(VibrateModeSetViewModel.DEFAULT_BBJI));
                            }
                            if ((dyoVar.e & 32) == 32) {
                                arrayList2.add(250);
                            }
                            vibrateListObserver.setSuccess(true);
                            vibrateListObserver.setVibrateList(arrayList);
                            vibrateListObserver.setDefaultList(arrayList2);
                            vibrateListObserver.setMax(numValueOf != null ? numValueOf.intValue() : 50);
                            vibrateModeSetViewModel.getVibrateListObserver().postValue(vibrateListObserver);
                        }
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VibrateListObserver vibrateListObserver, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$observer = vibrateListObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeSetViewModel.this.new AnonymousClass1(this.$observer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05141 c05141 = new C05141(VibrateModeSetViewModel.this, this.$observer, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05141, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$removeBleVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$removeBleVibrate$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {316}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<VibrateBean> $list;
        final /* synthetic */ VibrateBean $vibrateBean;
        int label;
        final /* synthetic */ VibrateModeSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$removeBleVibrate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$removeBleVibrate$1$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ArrayList<VibrateBean> $list;
            final /* synthetic */ VibrateBean $vibrateBean;
            int label;
            final /* synthetic */ VibrateModeSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05161(VibrateBean vibrateBean, VibrateModeSetViewModel vibrateModeSetViewModel, ArrayList<VibrateBean> arrayList, Continuation<? super C05161> continuation) {
                super(2, continuation);
                this.$vibrateBean = vibrateBean;
                this.this$0 = vibrateModeSetViewModel;
                this.$list = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05161(this.$vibrateBean, this.this$0, this.$list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 61;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Boxing.boxInt(Integer.parseInt(this.$vibrateBean.getId())));
                final ayo.a aVar = new ayo.a();
                aVar.c = CollectionsKt___CollectionsKt.toIntArray(arrayList);
                txo txoVar = new txo();
                txoVar.t0(aVar);
                s7rVar.c0(txoVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final VibrateModeSetViewModel vibrateModeSetViewModel = this.this$0;
                final VibrateBean vibrateBean = this.$vibrateBean;
                final ArrayList<VibrateBean> arrayList2 = this.$list;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel.removeBleVibrate.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "removeBleVibrate onError");
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "removeBleVibrate onSuccess id = " + aVar.c);
                        List<dyo> list = vibrateModeSetViewModel.updateItems;
                        VibrateBean vibrateBean2 = vibrateBean;
                        VibrateModeSetViewModel vibrateModeSetViewModel2 = vibrateModeSetViewModel;
                        for (dyo dyoVar : list) {
                            if (Intrinsics.areEqual(String.valueOf(dyoVar.d), vibrateBean2.getId())) {
                                vibrateModeSetViewModel2.updateDefaultSet(dyoVar);
                            }
                        }
                        String id = vibrateBean.getId();
                        VibrateModeBean mVibrateMode = vibrateModeSetViewModel.getMVibrateMode();
                        if (!Intrinsics.areEqual(id, mVibrateMode != null ? mVibrateMode.getVibrateId() : null)) {
                            arrayList2.remove(vibrateBean);
                            VibrateListObserver value = vibrateModeSetViewModel.getVibrateListObserver().getValue();
                            if (value != null) {
                                value.setVibrateList(arrayList2);
                            }
                            MutableLiveData<VibrateListObserver> vibrateListObserver = vibrateModeSetViewModel.getVibrateListObserver();
                            Intrinsics.checkNotNull(value);
                            vibrateListObserver.postValue(value);
                            return;
                        }
                        VibrateModeBean mVibrateMode2 = vibrateModeSetViewModel.getMVibrateMode();
                        Intrinsics.checkNotNull(mVibrateMode2);
                        mVibrateMode2.setVibrateId("0");
                        arrayList2.remove(vibrateBean);
                        VibrateListObserver value2 = vibrateModeSetViewModel.getVibrateListObserver().getValue();
                        if (value2 != null) {
                            value2.setVibrateList(arrayList2);
                        }
                        MutableLiveData<VibrateListObserver> vibrateListObserver2 = vibrateModeSetViewModel.getVibrateListObserver();
                        Intrinsics.checkNotNull(value2);
                        vibrateListObserver2.postValue(value2);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22031(VibrateBean vibrateBean, VibrateModeSetViewModel vibrateModeSetViewModel, ArrayList<VibrateBean> arrayList, Continuation<? super C22031> continuation) {
            super(2, continuation);
            this.$vibrateBean = vibrateBean;
            this.this$0 = vibrateModeSetViewModel;
            this.$list = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22031(this.$vibrateBean, this.this$0, this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05161 c05161 = new C05161(this.$vibrateBean, this.this$0, this.$list, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05161, this) == coroutine_suspended) {
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
            return ((C22031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$removeHuamiVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$removeHuamiVibrate$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<VibrateBean> $list;
        final /* synthetic */ VibrateBean $vibrateBean;
        final /* synthetic */ VibrateType $vibrateType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22041(ArrayList<VibrateBean> arrayList, VibrateBean vibrateBean, VibrateType vibrateType, Continuation<? super C22041> continuation) {
            super(2, continuation);
            this.$list = arrayList;
            this.$vibrateBean = vibrateBean;
            this.$vibrateType = vibrateType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeSetViewModel.this.new C22041(this.$list, this.$vibrateBean, this.$vibrateType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VibrateModeBean mVibrateMode = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode);
                mVibrateMode.setVibrateId("");
                WearableDeviceModel mDeviceModel = VibrateModeSetViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                String did = mDeviceModel.getDid();
                VibrateModeBean mVibrateMode2 = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode2);
                VibrateSpUtils.setModeId(VibrateSpUtils.getModeIdKey(did, mVibrateMode2.getIndex()), "");
                WearableDeviceModel mDeviceModel2 = VibrateModeSetViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                String did2 = mDeviceModel2.getDid();
                VibrateModeBean mVibrateMode3 = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode3);
                VibrateSpUtils.setModeName(VibrateSpUtils.getModeNameKey(did2, mVibrateMode3.getIndex()), ResourceExtKt.getString(wzi.X8));
                CoroutineDispatcher io2 = Dispatchers.getIO();
                VibrateModeSetViewModel$removeHuamiVibrate$1$success$1 vibrateModeSetViewModel$removeHuamiVibrate$1$success$1 = new VibrateModeSetViewModel$removeHuamiVibrate$1$success$1(VibrateModeSetViewModel.this, this.$vibrateType, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, vibrateModeSetViewModel$removeHuamiVibrate$1$success$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$list.remove(this.$vibrateBean);
                DeviceSettingsPreference.INSTANCE.setVIBRATE_LIST(new Gson().toJson(this.$list));
                VibrateListObserver value = VibrateModeSetViewModel.this.getVibrateListObserver().getValue();
                if (value != null) {
                    value.setVibrateList(this.$list);
                }
                MutableLiveData<VibrateListObserver> vibrateListObserver = VibrateModeSetViewModel.this.getVibrateListObserver();
                Intrinsics.checkNotNull(value);
                vibrateListObserver.postValue(value);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$renameBleVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$renameBleVibrate$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ VibrateBean $vibrateBean;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$renameBleVibrate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$renameBleVibrate$1$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nVibrateModeSetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel$renameBleVibrate$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
        public static final class C05181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $name;
            final /* synthetic */ VibrateBean $vibrateBean;
            int label;
            final /* synthetic */ VibrateModeSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05181(VibrateModeSetViewModel vibrateModeSetViewModel, String str, VibrateBean vibrateBean, Continuation<? super C05181> continuation) {
                super(2, continuation);
                this.this$0 = vibrateModeSetViewModel;
                this.$name = str;
                this.$vibrateBean = vibrateBean;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05181(this.this$0, this.$name, this.$vibrateBean, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                VibrateListObserver value = this.this$0.getVibrateListObserver().getValue();
                Object obj2 = null;
                final ArrayList<VibrateBean> vibrateList = value != null ? value.getVibrateList() : null;
                if (vibrateList == null || vibrateList.isEmpty()) {
                    this.this$0.getDefaultVibrateObserver().postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                VibrateBean vibrateBean = this.$vibrateBean;
                for (Object obj3 : vibrateList) {
                    if (Intrinsics.areEqual(((VibrateBean) obj3).getId(), vibrateBean.getId())) {
                        obj2 = obj3;
                        break;
                    }
                }
                VibrateBean vibrateBean2 = (VibrateBean) obj2;
                if (vibrateBean2 == null) {
                    return Unit.INSTANCE;
                }
                vibrateBean2.setName(this.$name);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 60;
                ayo ayoVar = new ayo();
                ayoVar.c = Integer.parseInt(vibrateBean2.getId());
                ayoVar.d = this.$name;
                txo txoVar = new txo();
                txoVar.q0(ayoVar);
                s7rVar.c0(txoVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final VibrateModeSetViewModel vibrateModeSetViewModel = this.this$0;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel.renameBleVibrate.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "renameBleVibrate onError" + code);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "renameBleVibrate onSuccess");
                        VibrateListObserver value2 = vibrateModeSetViewModel.getVibrateListObserver().getValue();
                        if (value2 != null) {
                            value2.setVibrateList(vibrateList);
                        }
                        MutableLiveData<VibrateListObserver> vibrateListObserver = vibrateModeSetViewModel.getVibrateListObserver();
                        Intrinsics.checkNotNull(value2);
                        vibrateListObserver.postValue(value2);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22051(String str, VibrateBean vibrateBean, Continuation<? super C22051> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$vibrateBean = vibrateBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeSetViewModel.this.new C22051(this.$name, this.$vibrateBean, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05181 c05181 = new C05181(VibrateModeSetViewModel.this, this.$name, this.$vibrateBean, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05181, this) == coroutine_suspended) {
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
            return ((C22051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setBleVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setBleVibrate$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.divingOTU}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VibrateBean $item;
        int label;
        final /* synthetic */ VibrateModeSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setBleVibrate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setBleVibrate$1$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ VibrateBean $item;
            int label;
            final /* synthetic */ VibrateModeSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05201(VibrateBean vibrateBean, VibrateModeSetViewModel vibrateModeSetViewModel, Continuation<? super C05201> continuation) {
                super(2, continuation);
                this.$item = vibrateBean;
                this.this$0 = vibrateModeSetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05201(this.$item, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 47;
                final dyo dyoVar = new dyo();
                dyoVar.d = Integer.parseInt(this.$item.getId());
                VibrateModeBean mVibrateMode = this.this$0.getMVibrateMode();
                Integer numBoxInt = mVibrateMode != null ? Boxing.boxInt(mVibrateMode.getIndex()) : null;
                Intrinsics.checkNotNull(numBoxInt);
                dyoVar.c = numBoxInt.intValue() + 1;
                txo txoVar = new txo();
                txoVar.s0(dyoVar);
                s7rVar.c0(txoVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final VibrateModeSetViewModel vibrateModeSetViewModel = this.this$0;
                final VibrateBean vibrateBean = this.$item;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel.setBleVibrate.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "setBleVibrate onError" + code);
                        vibrateModeSetViewModel.getVibrateSetObserver().postValue(Boolean.FALSE);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        dyo dyoVar2 = dyoVar;
                        Logger.i(VibrateModeSetViewModelKt.TAG, "setBleVibrate onSuccess id = " + dyoVar2.d + " type = " + dyoVar2.c);
                        VibrateModeBean mVibrateMode2 = vibrateModeSetViewModel.getMVibrateMode();
                        Intrinsics.checkNotNull(mVibrateMode2);
                        mVibrateMode2.setVibrateId(vibrateBean.getId());
                        vibrateModeSetViewModel.getVibrateSetObserver().postValue(Boolean.TRUE);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22071(VibrateBean vibrateBean, VibrateModeSetViewModel vibrateModeSetViewModel, Continuation<? super C22071> continuation) {
            super(2, continuation);
            this.$item = vibrateBean;
            this.this$0 = vibrateModeSetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22071(this.$item, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05201 c05201 = new C05201(this.$item, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05201, this) == coroutine_suspended) {
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
            return ((C22071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setDefault$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setDefault$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setDefault$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setDefault$1$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ VibrateModeSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05221(VibrateModeSetViewModel vibrateModeSetViewModel, Continuation<? super C05221> continuation) {
                super(2, continuation);
                this.this$0 = vibrateModeSetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05221(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                VibrateModeSetViewModel vibrateModeSetViewModel = this.this$0;
                VibrateModeBean mVibrateMode = vibrateModeSetViewModel.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode);
                vibrateModeSetViewModel.setBleDefault(mVibrateMode.getIndex() + 1, true);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C22081(Continuation<? super C22081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeSetViewModel.this.new C22081(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05221 c05221 = new C05221(VibrateModeSetViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05221, this) == coroutine_suspended) {
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
            return ((C22081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setHuamiDefault$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setHuamiDefault$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VibrateType $vibrateType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22091(VibrateType vibrateType, Continuation<? super C22091> continuation) {
            super(2, continuation);
            this.$vibrateType = vibrateType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeSetViewModel.this.new C22091(this.$vibrateType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                VibrateModeSetViewModel$setHuamiDefault$1$success$1 vibrateModeSetViewModel$setHuamiDefault$1$success$1 = new VibrateModeSetViewModel$setHuamiDefault$1$success$1(VibrateModeSetViewModel.this, this.$vibrateType, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, vibrateModeSetViewModel$setHuamiDefault$1$success$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(VibrateModeSetViewModelKt.TAG, "setDefault success = " + zBooleanValue);
            VibrateModeSetViewModel.this.postDataLoaded();
            if (zBooleanValue) {
                VibrateModeBean mVibrateMode = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode);
                mVibrateMode.setVibrateId("");
                WearableDeviceModel mDeviceModel = VibrateModeSetViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                String did = mDeviceModel.getDid();
                VibrateModeBean mVibrateMode2 = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode2);
                VibrateSpUtils.setModeId(VibrateSpUtils.getModeIdKey(did, mVibrateMode2.getIndex()), "");
                WearableDeviceModel mDeviceModel2 = VibrateModeSetViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                String did2 = mDeviceModel2.getDid();
                VibrateModeBean mVibrateMode3 = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode3);
                VibrateSpUtils.setModeName(VibrateSpUtils.getModeNameKey(did2, mVibrateMode3.getIndex()), ResourceExtKt.getString(wzi.X8));
                VibrateModeSetViewModel.this.getDefaultVibrateObserver().postValue(Boxing.boxBoolean(true));
            } else {
                VibrateModeSetViewModel.this.getDefaultVibrateObserver().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setHuamiVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$setHuamiVibrate$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.avgFreq}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VibrateBean $vibrateBean;
        final /* synthetic */ VibrateType $vibrateType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22101(VibrateBean vibrateBean, VibrateType vibrateType, Continuation<? super C22101> continuation) {
            super(2, continuation);
            this.$vibrateBean = vibrateBean;
            this.$vibrateType = vibrateType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeSetViewModel.this.new C22101(this.$vibrateBean, this.$vibrateType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                VibrateModeSetViewModel$setHuamiVibrate$1$success$1 vibrateModeSetViewModel$setHuamiVibrate$1$success$1 = new VibrateModeSetViewModel$setHuamiVibrate$1$success$1(VibrateModeSetViewModel.this, this.$vibrateType, this.$vibrateBean, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, vibrateModeSetViewModel$setHuamiVibrate$1$success$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            VibrateModeSetViewModel.this.postDataLoaded();
            Logger.i(VibrateModeSetViewModelKt.TAG, "setVibrate success = " + zBooleanValue);
            if (zBooleanValue) {
                VibrateModeBean mVibrateMode = VibrateModeSetViewModel.this.getMVibrateMode();
                if (mVibrateMode != null) {
                    mVibrateMode.setVibrateId(this.$vibrateBean.getId());
                }
                WearableDeviceModel mDeviceModel = VibrateModeSetViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                String did = mDeviceModel.getDid();
                VibrateModeBean mVibrateMode2 = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode2);
                VibrateSpUtils.setModeId(VibrateSpUtils.getModeIdKey(did, mVibrateMode2.getIndex()), this.$vibrateBean.getId());
                WearableDeviceModel mDeviceModel2 = VibrateModeSetViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                String did2 = mDeviceModel2.getDid();
                VibrateModeBean mVibrateMode3 = VibrateModeSetViewModel.this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode3);
                VibrateSpUtils.setModeName(VibrateSpUtils.getModeNameKey(did2, mVibrateMode3.getIndex()), this.$vibrateBean.getName());
                VibrateModeSetViewModel.this.getVibrateSetObserver().postValue(Boxing.boxBoolean(true));
            } else {
                VibrateModeSetViewModel.this.getVibrateSetObserver().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$stopVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$stopVibrate$1", f = "VibrateModeSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C22111(Continuation<? super C22111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22111(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 103;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel.stopVibrate.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(VibrateModeSetViewModelKt.TAG, "stopVibrate onError = " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(VibrateModeSetViewModelKt.TAG, "stopVibrate onSuccess ");
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void getBleCustomerVibrateList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(new VibrateListObserver(false, null, 50), null), 3, null);
    }

    private final void getHuamiCustomerVibrateList() {
        ArrayList<VibrateBean> arrayList;
        String vibrate_list = DeviceSettingsPreference.INSTANCE.getVIBRATE_LIST();
        VibrateListObserver vibrateListObserver = new VibrateListObserver(false, null, 50);
        if (vibrate_list == null || vibrate_list.length() == 0) {
            vibrateListObserver.setVibrateList(new ArrayList<>());
        } else {
            try {
                try {
                    arrayList = (ArrayList) new Gson().fromJson(vibrate_list, new TypeToken<ArrayList<VibrateBean>>() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$getHuamiCustomerVibrateList$$inlined$fromJson$1
                    }.getType());
                } catch (Exception unused) {
                    ArrayList<VibrateBeanHm> arrayList2 = (ArrayList) new Gson().fromJson(vibrate_list, new TypeToken<ArrayList<VibrateBeanHm>>() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel$getHuamiCustomerVibrateList$$inlined$fromJson$2
                    }.getType());
                    arrayList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    for (VibrateBeanHm vibrateBeanHm : arrayList2) {
                        String name = vibrateBeanHm.getName();
                        String id = vibrateBeanHm.getId();
                        short[] times = vibrateBeanHm.getTimes();
                        ArrayList arrayList3 = new ArrayList(times.length);
                        for (short s : times) {
                            arrayList3.add(new VibrateModeProgressBar.VibrateDataItem(s, 0, 2, null));
                        }
                        arrayList.add(new VibrateBean(name, id, arrayList3));
                    }
                    DeviceSettingsPreference.INSTANCE.setVIBRATE_LIST(new Gson().toJson(arrayList));
                    vibrateListObserver.setVibrateList(arrayList);
                    vibrateListObserver.setDefaultList(CollectionsKt__CollectionsKt.mutableListOf(0));
                    this.vibrateListObserver.setValue(vibrateListObserver);
                }
            } catch (Exception e) {
                Logger.e(VibrateModeSetViewModelKt.TAG, "getHuamiCustomerVibrateList error = " + e.getMessage());
                arrayList = new ArrayList<>();
                DeviceSettingsPreference.INSTANCE.setVIBRATE_LIST(new Gson().toJson(arrayList));
            }
            vibrateListObserver.setVibrateList(arrayList);
        }
        vibrateListObserver.setDefaultList(CollectionsKt__CollectionsKt.mutableListOf(0));
        this.vibrateListObserver.setValue(vibrateListObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final void removeBleVibrate(VibrateBean vibrateBean) {
        VibrateListObserver value = this.vibrateListObserver.getValue();
        ArrayList<VibrateBean> vibrateList = value != null ? value.getVibrateList() : null;
        if (vibrateList == null || vibrateList.isEmpty()) {
            return;
        }
        Logger.i(VibrateModeSetViewModelKt.TAG, "removeBleVibrate vibrateList = " + vibrateList);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22031(vibrateBean, this, vibrateList, null), 3, null);
    }

    private final void removeHuamiVibrate(VibrateBean vibrateBean) {
        VibrateListObserver value = this.vibrateListObserver.getValue();
        ArrayList<VibrateBean> vibrateList = value != null ? value.getVibrateList() : null;
        if (vibrateList == null || vibrateList.isEmpty()) {
            return;
        }
        String id = vibrateBean.getId();
        VibrateModeBean vibrateModeBean = this.mVibrateMode;
        if (Intrinsics.areEqual(id, vibrateModeBean != null ? vibrateModeBean.getVibrateId() : null)) {
            VibrateModeBean vibrateModeBean2 = this.mVibrateMode;
            VibrateType type = vibrateModeBean2 != null ? vibrateModeBean2.getType() : null;
            Intrinsics.checkNotNull(type);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22041(vibrateList, vibrateBean, VibrateType.fromValue(type.ordinal()), null), 3, null);
        } else {
            vibrateList.remove(vibrateBean);
            DeviceSettingsPreference.INSTANCE.setVIBRATE_LIST(new Gson().toJson(vibrateList));
            VibrateListObserver value2 = this.vibrateListObserver.getValue();
            if (value2 != null) {
                value2.setVibrateList(vibrateList);
            }
            MutableLiveData<VibrateListObserver> mutableLiveData = this.vibrateListObserver;
            Intrinsics.checkNotNull(value2);
            mutableLiveData.setValue(value2);
        }
        String[] stringArray = ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), lhi.p);
        if (stringArray != null) {
            int length = stringArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str = stringArray[i];
                int i3 = i2 + 1;
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VibrateModeSetViewModel$removeHuamiVibrate$2$1(this, VibrateSpUtils.INSTANCE.index2Mode(i2), null), 3, null);
                WearableDeviceModel mDeviceModel = getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                if (Intrinsics.areEqual(vibrateBean.getId(), VibrateSpUtils.getModeId(VibrateSpUtils.getModeIdKey(mDeviceModel.getDid(), i2), ""))) {
                    WearableDeviceModel mDeviceModel2 = getMDeviceModel();
                    Intrinsics.checkNotNull(mDeviceModel2);
                    VibrateSpUtils.setModeId(VibrateSpUtils.getModeIdKey(mDeviceModel2.getDid(), i2), "");
                    WearableDeviceModel mDeviceModel3 = getMDeviceModel();
                    Intrinsics.checkNotNull(mDeviceModel3);
                    VibrateSpUtils.setModeName(VibrateSpUtils.getModeNameKey(mDeviceModel3.getDid(), i2), ResourceExtKt.getString(wzi.X8));
                }
                i++;
                i2 = i3;
            }
        }
    }

    private final void renameBleVibrate(Context context, VibrateBean vibrateBean, String name) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22051(name, vibrateBean, null), 3, null);
    }

    private final void renameHuamiVibrate(Context context, VibrateBean vibrateBean, String name) {
        Object next;
        Resources resources;
        VibrateListObserver value = this.vibrateListObserver.getValue();
        String[] stringArray = null;
        ArrayList<VibrateBean> vibrateList = value != null ? value.getVibrateList() : null;
        if (vibrateList != null) {
            Iterator<T> it = vibrateList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((VibrateBean) next).getId(), vibrateBean.getId()));
            VibrateBean vibrateBean2 = (VibrateBean) next;
            if (vibrateBean2 != null && (!vibrateList.isEmpty())) {
                vibrateBean2.setName(name);
                DeviceSettingsPreference.INSTANCE.setVIBRATE_LIST(new Gson().toJson(vibrateList));
                VibrateListObserver value2 = this.vibrateListObserver.getValue();
                if (value2 != null) {
                    value2.setVibrateList(vibrateList);
                }
                MutableLiveData<VibrateListObserver> mutableLiveData = this.vibrateListObserver;
                Intrinsics.checkNotNull(value2);
                mutableLiveData.setValue(value2);
                if (context != null && (resources = context.getResources()) != null) {
                    stringArray = resources.getStringArray(lhi.p);
                }
                if (stringArray != null) {
                    int length = stringArray.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        String str = stringArray[i];
                        int i3 = i2 + 1;
                        String id = vibrateBean2.getId();
                        WearableDeviceModel mDeviceModel = getMDeviceModel();
                        Intrinsics.checkNotNull(mDeviceModel);
                        if (Intrinsics.areEqual(id, VibrateSpUtils.getModeId(VibrateSpUtils.getModeIdKey(mDeviceModel.getDid(), i2), ""))) {
                            WearableDeviceModel mDeviceModel2 = getMDeviceModel();
                            Intrinsics.checkNotNull(mDeviceModel2);
                            VibrateSpUtils.setModeName(VibrateSpUtils.getModeNameKey(mDeviceModel2.getDid(), i2), name);
                        }
                        i++;
                        i2 = i3;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBleDefault(int type, boolean needCallBack) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 47;
        final dyo dyoVar = new dyo();
        dyoVar.d = 0;
        dyoVar.c = type;
        txo txoVar = new txo();
        txoVar.s0(dyoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, needCallBack, needCallBack ? new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel.setBleDefault.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type2, int code) {
                Logger.i(VibrateModeSetViewModelKt.TAG, "setBleDefault onError" + code);
                this.getDefaultVibrateObserver().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type2, SyncResult result) {
                dyo dyoVar2 = dyoVar;
                Logger.i(VibrateModeSetViewModelKt.TAG, "setBleDefault onSuccess id = " + dyoVar2.d + " type = " + dyoVar2.c);
                VibrateModeBean mVibrateMode = this.getMVibrateMode();
                Intrinsics.checkNotNull(mVibrateMode);
                mVibrateMode.setVibrateId("0");
                this.getDefaultVibrateObserver().postValue(Boolean.TRUE);
            }
        } : null, 0, 8, null);
    }

    private final void setBleVibrate(VibrateBean item) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22071(item, this, null), 3, null);
    }

    private final void setHuamiDefault() {
        VibrateModeBean vibrateModeBean = this.mVibrateMode;
        Intrinsics.checkNotNull(vibrateModeBean);
        VibrateType vibrateTypeFromValue = VibrateType.fromValue(vibrateModeBean.getType().ordinal());
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22091(vibrateTypeFromValue, null), 3, null);
    }

    private final void setHuamiVibrate(VibrateBean vibrateBean) {
        postDataOnLoading();
        VibrateModeBean vibrateModeBean = this.mVibrateMode;
        Intrinsics.checkNotNull(vibrateModeBean);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22101(vibrateBean, VibrateType.fromValue(vibrateModeBean.getType().ordinal()), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDefaultSet(dyo item) {
        item.d = 0;
        setBleDefault(item.c, false);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    @NotNull
    public final MutableLiveData<Boolean> getDefaultVibrateObserver() {
        return this.defaultVibrateObserver;
    }

    @Nullable
    public final VibrateModeBean getMVibrateMode() {
        return this.mVibrateMode;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void getVibrateList() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            getBleCustomerVibrateList();
        } else {
            getHuamiCustomerVibrateList();
        }
    }

    @NotNull
    public final MutableLiveData<VibrateListObserver> getVibrateListObserver() {
        return this.vibrateListObserver;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVibrateSetObserver() {
        return this.vibrateSetObserver;
    }

    public final void initVibrateMode(@NotNull VibrateModeBean mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mVibrateMode = mode;
    }

    public final boolean isNameHas(@NotNull VibrateBean vibrateBean, @NotNull String name) {
        Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
        Intrinsics.checkNotNullParameter(name, "name");
        VibrateListObserver value = this.vibrateListObserver.getValue();
        ArrayList<VibrateBean> vibrateList = value != null ? value.getVibrateList() : null;
        if (vibrateList != null && !vibrateList.isEmpty()) {
            int size = vibrateList.size();
            for (int i = 0; i < size; i++) {
                if (!Intrinsics.areEqual(vibrateBean.getId(), vibrateList.get(i).getId()) && Intrinsics.areEqual(name, vibrateList.get(i).getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void removeVibrate(@NotNull VibrateBean vibrateBean) {
        Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            removeBleVibrate(vibrateBean);
        } else {
            removeHuamiVibrate(vibrateBean);
        }
    }

    public final void renameVibrate(@Nullable Context context, @NotNull VibrateBean vibrateBean, @NotNull String name) {
        Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
        Intrinsics.checkNotNullParameter(name, "name");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            renameBleVibrate(context, vibrateBean, name);
        } else {
            renameHuamiVibrate(context, vibrateBean, name);
        }
    }

    public final void setDefault() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22081(null), 3, null);
        } else {
            setHuamiDefault();
        }
    }

    public final void setMVibrateMode(@Nullable VibrateModeBean vibrateModeBean) {
        this.mVibrateMode = vibrateModeBean;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVibrate(@NotNull VibrateBean vibrateBean) {
        Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
        if (getMDeviceModel() == null || this.mVibrateMode == null) {
            return;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            setBleVibrate(vibrateBean);
        } else {
            setHuamiVibrate(vibrateBean);
        }
    }

    public final void stopVibrate() {
        Logger.i(VibrateModeSetViewModelKt.TAG, "stopVibrate");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            AnyExtKt.io$default(null, new C22111(null), 1, null);
        }
    }
}
