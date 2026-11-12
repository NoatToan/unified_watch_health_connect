package com.xiaomi.fitness.rn.share.viewmodel;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.share.bean.DeviceBean;
import com.xiaomi.fitness.rn.share.request.MijiaRequest;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceListViewModel;
import defpackage.vo6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/rn/share/viewmodel/DeviceListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "loadDeviceList", "", "success", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/rn/share/bean/DeviceBean;", "error", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceListViewModel.kt\ncom/xiaomi/fitness/rn/share/viewmodel/DeviceListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1863#2,2:54\n1863#2,2:56\n*S KotlinDebug\n*F\n+ 1 DeviceListViewModel.kt\ncom/xiaomi/fitness/rn/share/viewmodel/DeviceListViewModel\n*L\n29#1:54,2\n41#1:56,2\n*E\n"})
public final class DeviceListViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.viewmodel.DeviceListViewModel$loadDeviceList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.share.viewmodel.DeviceListViewModel$loadDeviceList$1", f = "DeviceListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<DeviceBean> $deviceList;
        final /* synthetic */ Function1<List<DeviceBean>, Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super List<DeviceBean>, Unit> function1, ArrayList<DeviceBean> arrayList, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function1;
            this.$deviceList = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$success, this.$deviceList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$success.invoke2(this.$deviceList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceList$lambda$1(List allDevices, ArrayList deviceList, Function1 success, Map map) {
        Intrinsics.checkNotNullParameter(allDevices, "$allDevices");
        Intrinsics.checkNotNullParameter(deviceList, "$deviceList");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(map, "map");
        Iterator it = allDevices.iterator();
        while (it.hasNext()) {
            RNDeviceModel rNDeviceModel = (RNDeviceModel) it.next();
            if (rNDeviceModel.isOwner()) {
                List list = (List) map.get(rNDeviceModel.getDid());
                DeviceBean deviceBean = new DeviceBean(rNDeviceModel);
                deviceBean.setSharedCount(list != null ? list.size() : 0);
                deviceList.add(deviceBean);
            }
        }
        AnyExtKt.main$default(null, new DeviceListViewModel$loadDeviceList$2$2(success, deviceList, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceList$lambda$3(List allDevices, ArrayList deviceList, Function1 success, int i, String str) {
        Intrinsics.checkNotNullParameter(allDevices, "$allDevices");
        Intrinsics.checkNotNullParameter(deviceList, "$deviceList");
        Intrinsics.checkNotNullParameter(success, "$success");
        Iterator it = allDevices.iterator();
        while (it.hasNext()) {
            RNDeviceModel rNDeviceModel = (RNDeviceModel) it.next();
            DeviceBean deviceBean = new DeviceBean(rNDeviceModel);
            if (rNDeviceModel.isOwner()) {
                deviceList.add(deviceBean);
            }
        }
        AnyExtKt.main$default(null, new DeviceListViewModel$loadDeviceList$3$2(success, deviceList, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void loadDeviceList(@NotNull final Function1<? super List<DeviceBean>, Unit> success, @NotNull Function1<? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        final List<T> deviceModels = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
        vo6.c("allDevices.size " + deviceModels.size());
        final ArrayList arrayList = new ArrayList();
        if (deviceModels.isEmpty()) {
            AnyExtKt.main$default(null, new AnonymousClass1(success, arrayList, null), 1, null);
        } else {
            MijiaRequest.INSTANCE.mineDeviceShareUser(new Function1() { // from class: y86
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceListViewModel.loadDeviceList$lambda$1(deviceModels, arrayList, success, (Map) obj);
                }
            }, new Function2() { // from class: z86
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceListViewModel.loadDeviceList$lambda$3(deviceModels, arrayList, success, ((Integer) obj).intValue(), (String) obj2);
                }
            });
        }
    }
}
