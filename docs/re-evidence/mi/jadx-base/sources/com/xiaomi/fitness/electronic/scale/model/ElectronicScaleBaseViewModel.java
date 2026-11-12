package com.xiaomi.fitness.electronic.scale.model;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.WeightViewModel;
import com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter;
import com.xiaomi.fitness.electronic.scale.data.Icon;
import com.xiaomi.fitness.electronic.scale.data.UserPhotoIcon;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.UserHelper;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.f4b;
import defpackage.fx7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.qal;
import defpackage.rw7;
import defpackage.u7r;
import defpackage.ww7;
import defpackage.yw7;
import defpackage.zzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 g2\u00020\u0001:\u0003ghiB\u0007¢\u0006\u0004\be\u0010fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0087\u0001\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J=\u00101\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b3\u00104Jk\u00107\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0083\u0001\u0010?\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b?\u0010@J\u0097\u0001\u0010E\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010\u00152\u0006\u00106\u001a\u000205¢\u0006\u0004\bE\u0010FJa\u0010N\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u00042\u001a\u0010\u0019\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L\u0012\u0004\u0012\u00020\u0018\u0018\u00010K¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bP\u0010\"JM\u0010T\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bT\u0010UJ%\u0010V\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\bV\u0010WJ\u0019\u0010Z\u001a\u00020\u00182\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006j"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "did", "", "virtualId", "", "isLastSelected", "(Ljava/lang/String;J)Z", "model", "userId", "icon", "nickName", "", "weight", "sn", "", "userType", "time", "Lrw7;", "bodyComposition", "Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;", "onSyncWeightRecordCallback", "Lkotlin/Function0;", "", "callBack", "saveVirtualUserBodyMakeUpData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;FLjava/lang/String;IJLrw7;Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;Lkotlin/jvm/functions/Function0;)V", "unit", "getUnitString", "(I)Ljava/lang/String;", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSyncCallback", "getWeightUnit", "(Ljava/lang/String;Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "deviceId", "mode", "switchMode", "(Ljava/lang/String;ILcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "reWeight", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "userIcons", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "userAdapter", "hasMain", "addVirtualAccountIcon", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;Ljava/util/List;Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;Z)V", "putLastSelected", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;", "onAddToDbListener", "addVirtualAccountWeightRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;FIJLrw7;Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;)V", "sex", "age", "height", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResult", "toDevice", "saveVirtualUserWeightResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIIIJLcom/xiaomi/fitness/electronic/scale/data/WeightResult;ZLkotlin/jvm/functions/Function0;)V", "heartRate", "", "intArray", "syncWeightRecordCallback", "addBodyCompositionWeightRecord", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;IIIFF[IJZLcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;)V", Column.ACCOUNT_ID, "name", "weightTarget", MedicalIdSPContract.PREF_BIRTHDAY, "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "Ljava/lang/Object;", "modifyVirtualAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFJLkotlin/jvm/functions/Function1;)V", "getDeviceVersion", "userAge", "userSex", "userHeight", "updateVirtualUserToDeviceNew", "(JLjava/lang/String;FIIIILcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "updateMainUser", "(Ljava/lang/String;FI)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "virtualUserMax", "I", "getVirtualUserMax", "()I", "setVirtualUserMax", "(I)V", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "request", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "<init>", "()V", "Companion", "OnVirtualAccountListener", "OnAddToDbListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nElectronicScaleBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectronicScaleBaseViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,535:1\n1863#2,2:536\n*S KotlinDebug\n*F\n+ 1 ElectronicScaleBaseViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel\n*L\n144#1:536,2\n*E\n"})
public class ElectronicScaleBaseViewModel extends AbsViewModel {
    public static final int ELECTRONIC_MODE_BABY = 1;
    public static final int ELECTRONIC_MODE_BALANCED = 2;
    public static final int ELECTRONIC_MODE_NORMAL = 3;

    @NotNull
    public static final String TAG = "ElectronicScaleBaseView";
    private int virtualUserMax = 5;

    @NotNull
    private ScaleRequest request = new ScaleRequest();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;", "", "onSuccess", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnAddToDbListener {
        void onSuccess();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnVirtualAccountListener;", "", "onVirtualAccount", "", "account", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "onNoVirtualAccount", "onFinishVirtualAccount", "onFailed", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnVirtualAccountListener {
        void onFailed();

        void onFinishVirtualAccount();

        void onNoVirtualAccount();

        void onVirtualAccount(@NotNull VirtualAccount account);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel$saveVirtualUserBodyMakeUpData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel$saveVirtualUserBodyMakeUpData$1", f = "ElectronicScaleBaseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C23781(Continuation<? super C23781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23781(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScaleUtil.INSTANCE.sendDataChangedBroadcast(true, Boxing.boxInt(0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addBodyCompositionWeightRecord$lambda$6(OnAddToDbListener onAddToDbListener) {
        Intrinsics.checkNotNullParameter(onAddToDbListener, "$onAddToDbListener");
        Logger.i(TAG, "addRealAccountWeightRecord success");
        onAddToDbListener.onSuccess();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void addVirtualAccountWeightRecord$default(ElectronicScaleBaseViewModel electronicScaleBaseViewModel, String str, String str2, String str3, long j, String str4, float f, int i, long j2, rw7 rw7Var, SyncWeightRecordCallback syncWeightRecordCallback, OnAddToDbListener onAddToDbListener, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addVirtualAccountWeightRecord");
        }
        electronicScaleBaseViewModel.addVirtualAccountWeightRecord(str, str2, str3, j, str4, f, i, j2, rw7Var, (i2 & 512) != 0 ? null : syncWeightRecordCallback, onAddToDbListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccountWeightRecord$lambda$3(OnAddToDbListener onAddToDbListener) {
        Intrinsics.checkNotNullParameter(onAddToDbListener, "$onAddToDbListener");
        Logger.i(TAG, "addVirtualAccountWeightRecord success");
        onAddToDbListener.onSuccess();
        return Unit.INSTANCE;
    }

    private final boolean isLastSelected(String did, long virtualId) {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicScalePreference.LAST_SEL_USER_KEY);
        sb.append(did);
        return StringsKt__StringsJVMKt.equals$default(ElectronicScalePreference.getString(sb.toString()), String.valueOf(virtualId), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyVirtualAccount$lambda$7(Function1 function1, ScaleData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            JSONObject jSONObject = new JSONObject(it.getResp());
            int iOptInt = jSONObject.optInt("code");
            String strOptString = jSONObject.optString("message");
            qal.c("modifyVirtualAccount resp " + jSONObject);
            Intrinsics.checkNotNull(strOptString);
            ProxyResponse proxyResponse = new ProxyResponse(iOptInt, strOptString, null, 4, null);
            if (function1 != null) {
                function1.invoke2(proxyResponse);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyVirtualAccount$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("modifyVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    private final void saveVirtualUserBodyMakeUpData(String did, String model, String userId, long virtualId, String icon, String nickName, float weight, String sn, int userType, long time, rw7 bodyComposition, SyncWeightRecordCallback onSyncWeightRecordCallback, Function0<Unit> callBack) {
        WeightResult weightResultBodyCompositionToWeightResult = WeightResult.INSTANCE.bodyCompositionToWeightResult(bodyComposition, String.valueOf(virtualId), weight, did, time);
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount.setDid(did);
        virtualAccount.setModel(model);
        virtualAccount.setAccountId(virtualId);
        virtualAccount.setUid(Long.parseLong(userId));
        virtualAccount.setDel(false);
        virtualAccount.setIcon(icon == null ? "" : icon);
        virtualAccount.setName(nickName != null ? nickName : "");
        virtualAccount.setType(userType);
        virtualAccount.setBodyComposition(f4b.c(weightResultBodyCompositionToWeightResult));
        virtualAccount.setCreateTime(time);
        virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(time, "yyyyMMdd"));
        qal.c("saveVirtualUserBodyMakeUpData() virtualId : " + virtualAccount.getAccountId() + " ====== createDate : " + virtualAccount.getCreateDate() + " === userType : " + userType);
        if (userType == 1) {
            WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), time, weightResultBodyCompositionToWeightResult);
            AnyExtKt.main$default(null, new C23781(null), 1, null);
        }
        VirtualAccountHelper.INSTANCE.insertVirtualAccount(virtualAccount, callBack, onSyncWeightRecordCallback);
    }

    public static /* synthetic */ void saveVirtualUserBodyMakeUpData$default(ElectronicScaleBaseViewModel electronicScaleBaseViewModel, String str, String str2, String str3, long j, String str4, String str5, float f, String str6, int i, long j2, rw7 rw7Var, SyncWeightRecordCallback syncWeightRecordCallback, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveVirtualUserBodyMakeUpData");
        }
        electronicScaleBaseViewModel.saveVirtualUserBodyMakeUpData(str, str2, str3, j, str4, str5, f, str6, i, j2, rw7Var, (i2 & 2048) != 0 ? null : syncWeightRecordCallback, function0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093  */
    public final void addBodyCompositionWeightRecord(@NotNull String did, @NotNull String model, int userType, @NotNull String userId, long virtualId, @NotNull String icon, @NotNull String nickName, int heartRate, int sex, int age, float height, float weight, @NotNull int[] intArray, long time, boolean toDevice, @Nullable SyncWeightRecordCallback syncWeightRecordCallback, @NotNull final OnAddToDbListener onAddToDbListener) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(intArray, "intArray");
        Intrinsics.checkNotNullParameter(onAddToDbListener, "onAddToDbListener");
        Logger.i(TAG, "addBodyCompositionWeightRecord userType " + userType);
        WeightManager.Companion companion = WeightManager.INSTANCE;
        WeightManager companion2 = companion.getInstance();
        WeightManager companion3 = companion.getInstance();
        Long lValueOf = Long.valueOf(virtualId);
        EcoDeviceManager.Companion companion4 = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion4).getDeviceModel(did);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            sn = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion4).getDeviceModel(did);
            sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                sn = "0";
            }
        }
        companion2.saveBodyMakeUpData(companion3.getBodyMakeUpData(did, model, userType, userId, lValueOf, icon, nickName, heartRate, sex, age, height, weight, intArray, time, sn, toDevice), syncWeightRecordCallback, new Function0() { // from class: h48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ElectronicScaleBaseViewModel.addBodyCompositionWeightRecord$lambda$6(onAddToDbListener);
            }
        });
    }

    public final void addVirtualAccountIcon(@NotNull String did, @NotNull VirtualAccount virtualAccount, @NotNull List<Icon> userIcons, @Nullable UserPhotoAdapter userAdapter, boolean hasMain) {
        List<Icon> list;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(userIcons, "userIcons");
        String strValueOf = String.valueOf(virtualAccount.getUid());
        String strValueOf2 = String.valueOf(virtualAccount.getAccountId());
        String icon = virtualAccount.getIcon();
        String name = virtualAccount.getName();
        int sex = virtualAccount.getSex();
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        UserPhotoIcon userPhotoIcon = new UserPhotoIcon(did, strValueOf, strValueOf2, 0, icon, name, 0, sex, weightInfoUtil.getAge(dateToString), virtualAccount.getHeight(), null, true, virtualAccount.getCreationTime(), false, virtualAccount);
        int i = 0;
        if (isLastSelected(did, virtualAccount.getAccountId())) {
            userPhotoIcon.setLast(true);
            if (hasMain) {
                list = userIcons;
                list.add(1, userPhotoIcon);
            } else {
                list = userIcons;
                list.add(0, userPhotoIcon);
            }
        } else {
            list = userIcons;
            for (Icon icon2 : list) {
                if (icon2 instanceof UserPhotoIcon) {
                    UserPhotoIcon userPhotoIcon2 = (UserPhotoIcon) icon2;
                    if (!userPhotoIcon2.getIsVirtual() || userPhotoIcon2.getIsLast() || userPhotoIcon2.getCreationTime() < userPhotoIcon.getCreationTime()) {
                        i++;
                    }
                }
            }
            list.add(i, userPhotoIcon);
        }
        if (userAdapter != null) {
            userAdapter.updateData(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    public final void addVirtualAccountWeightRecord(@NotNull String did, @NotNull String model, @NotNull String icon, long virtualId, @NotNull String nickName, float weight, int userType, long time, @Nullable rw7 bodyComposition, @Nullable SyncWeightRecordCallback onSyncWeightRecordCallback, @NotNull final OnAddToDbListener onAddToDbListener) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(onAddToDbListener, "onAddToDbListener");
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            sn = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
            sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                sn = "0";
            }
        }
        saveVirtualUserBodyMakeUpData(did, model, userId, virtualId, icon, nickName, weight, sn, userType, time, bodyComposition, onSyncWeightRecordCallback, new Function0() { // from class: g48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ElectronicScaleBaseViewModel.addVirtualAccountWeightRecord$lambda$3(onAddToDbListener);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getDeviceVersion(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 1;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    @NotNull
    public final String getUnitString(int unit) {
        if (unit == 2) {
            return ResourceExtKt.getString(zzi.V5);
        }
        return unit == 3 ? ResourceExtKt.getString(zzi.X5) : ResourceExtKt.getString(zzi.Y5);
    }

    public final int getVirtualUserMax() {
        return this.virtualUserMax;
    }

    public final void getWeightUnit(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 4;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    public final void modifyVirtualAccount(@NotNull String accountId, @NotNull String name, @NotNull String icon, int sex, int height, float weightTarget, long birth, @Nullable final Function1<? super ProxyResponse<Object>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Logger.i(TAG, "modifyVirtualAccount start ");
        this.request.modifyVirtualAccount(ViewModelKt.getViewModelScope(this), accountId, name, icon, sex, height, weightTarget, birth, new Function1() { // from class: e48
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleBaseViewModel.modifyVirtualAccount$lambda$7(callBack, (ScaleData) obj);
            }
        }, new Function1() { // from class: f48
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleBaseViewModel.modifyVirtualAccount$lambda$8((ApiException) obj);
            }
        });
    }

    public final void putLastSelected(@NotNull String did, @NotNull String virtualId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(virtualId, "virtualId");
        ElectronicScalePreference.putString(ElectronicScalePreference.LAST_SEL_USER_KEY + did, virtualId);
    }

    public final void reWeight(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 7;
        Logger.i(TAG, " reWeight send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.reWeight.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(ElectronicScaleBaseViewModel.TAG, "reWeight error type : " + type + " code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(ElectronicScaleBaseViewModel.TAG, "reWeight success");
            }
        }, 2000);
    }

    public final void saveVirtualUserWeightResult(@NotNull String did, @NotNull String model, @NotNull String userId, long virtualId, @NotNull String icon, @NotNull String nickName, int userType, int sex, int age, int height, long time, @NotNull WeightResult weightResult, boolean toDevice, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (weightResult.getMeasuringImpedance1() != 0 && weightResult.getMeasuringImpedance2() != 0 && weightResult.getMeasuringImpedance3() != 0 && weightResult.getMeasuringImpedance4() != 0 && weightResult.getMeasuringImpedance5() != 0 && weightResult.getMeasuringImpedance6() != 0 && weightResult.getMeasuringImpedance7() != 0 && weightResult.getMeasuringImpedance8() != 0 && weightResult.getMeasuringImpedance9() != 0 && weightResult.getMeasuringImpedance10() != 0 && weightResult.getMeasuringImpedance11() != 0 && weightResult.getMeasuringImpedance12() != 0) {
            addBodyCompositionWeightRecord(did, model, userType, userId, virtualId, icon, nickName, weightResult.getHeartRate(), sex, age, height, weightResult.getWeight(), new int[]{weightResult.getMeasuringImpedance1(), weightResult.getMeasuringImpedance2(), weightResult.getMeasuringImpedance3(), weightResult.getMeasuringImpedance4(), weightResult.getMeasuringImpedance5(), weightResult.getMeasuringImpedance6(), weightResult.getMeasuringImpedance7(), weightResult.getMeasuringImpedance8(), weightResult.getMeasuringImpedance9(), weightResult.getMeasuringImpedance10(), weightResult.getMeasuringImpedance11(), weightResult.getMeasuringImpedance12()}, weightResult.getTime(), toDevice, null, new OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.saveVirtualUserWeightResult.1
                @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
                public void onSuccess() {
                    callBack.invoke();
                }
            });
            return;
        }
        weightResult.setVirtualId(String.valueOf(virtualId));
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount.setDid(did);
        virtualAccount.setModel(model);
        virtualAccount.setAccountId(virtualId);
        virtualAccount.setUid(Long.parseLong(userId));
        virtualAccount.setDel(false);
        virtualAccount.setIcon(icon);
        virtualAccount.setName(nickName);
        virtualAccount.setType(userType);
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        virtualAccount.setCreateTime(time);
        virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(time, "yyyyMMdd"));
        qal.c("saveVirtualUserBodyMakeUpData() virtualId : " + virtualAccount.getAccountId() + " ====== createDate : " + virtualAccount.getCreateDate() + " === userType : " + userType);
        VirtualAccountHelper.insertVirtualAccount$default(VirtualAccountHelper.INSTANCE, virtualAccount, callBack, null, 4, null);
    }

    public final void setVirtualUserMax(int i) {
        this.virtualUserMax = i;
    }

    public final void switchMode(@NotNull String deviceId, int mode, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 6;
        ww7 ww7Var = new ww7();
        yw7 yw7Var = new yw7();
        yw7Var.c = mode;
        ww7Var.A(yw7Var);
        u7rVar.D(ww7Var);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }

    public final void updateMainUser(@NotNull String did, float weight, int unit) {
        Intrinsics.checkNotNullParameter(did, "did");
        final u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        jx7Var.c = Long.parseLong(companion.getInstance().getMiId());
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = 0L;
        fx7Var.d = kx7Var;
        fx7Var.g = companion.getInstance().getAge();
        fx7Var.f = companion.getInstance().getSex();
        fx7Var.e = UserHelper.INSTANCE.getMainUserType(did);
        fx7Var.h = (int) companion.getInstance().getHeight();
        fx7Var.i = (int) (WeightManager.INSTANCE.getInstance().convertToKg(weight, unit) * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(WeightViewModel.TAG, " updateMainUser send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.updateMainUser.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.e(WeightViewModel.TAG, " updateMainUser onError send " + did2 + " " + type + " " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(WeightViewModel.TAG, " updateMainUser success send " + u7rVar);
            }
        }, 2000);
    }

    public final void updateVirtualUserToDeviceNew(long virtualId, @NotNull String deviceId, float weight, int unit, int userAge, int userSex, int userHeight, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = virtualId;
        fx7Var.d = kx7Var;
        fx7Var.g = userAge;
        fx7Var.f = userSex;
        fx7Var.e = 1;
        fx7Var.h = userHeight;
        fx7Var.i = (int) (WeightManager.INSTANCE.getInstance().convertToKg(weight, unit) * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(WeightViewModel.TAG, "syncVirtualUser addOrUpdateVirtualUserToDevice pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }
}
