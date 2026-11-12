package com.xiaomi.fitness.nfc.request;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.nfc.entity.MasterRegions;
import com.xiaomi.fitness.nfc.request.NfcRequest;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import defpackage.d7f;
import defpackage.drg;
import defpackage.erg;
import defpackage.frg;
import defpackage.h4b;
import defpackage.o0j;
import defpackage.vqg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bJ0\u0010\f\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bJ\u0006\u0010\r\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/nfc/request/NfcHttpService;", "<init>", "()V", "getUserAllMiLock", "", "success", "Lkotlin/Function1;", "", "fail", "", "getAllNfcDoorLock", "initSupportMasterCardRegions", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNfcRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NfcRequest.kt\ncom/xiaomi/fitness/nfc/request/NfcRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n89#2,5:80\n89#2,5:85\n89#2,5:90\n1863#3,2:95\n*S KotlinDebug\n*F\n+ 1 NfcRequest.kt\ncom/xiaomi/fitness/nfc/request/NfcRequest\n*L\n25#1:80,5\n47#1:85,5\n69#1:90,5\n58#1:95,2\n*E\n"})
public final class NfcRequest extends BaseRequest<NfcHttpService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.NfcRequest$getAllNfcDoorLock$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcHttpService;", "it", "Lfrg;", "<anonymous>", "(Lcom/xiaomi/fitness/nfc/request/NfcHttpService;)Lfrg;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.NfcRequest$getAllNfcDoorLock$1", f = "NfcRequest.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<NfcHttpService, Continuation<? super frg>, Object> {
        final /* synthetic */ HashMap<String, Object> $map;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HashMap<String, Object> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$map = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$map, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NfcHttpService nfcHttpService, Continuation<? super frg> continuation) {
            return ((AnonymousClass1) create(nfcHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NfcHttpService nfcHttpService = (NfcHttpService) this.L$0;
                String strB = h4b.b(this.$map);
                Intrinsics.checkNotNull(strB);
                this.label = 1;
                obj = nfcHttpService.getAllNfcDoorLock(strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (frg) obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.NfcRequest$getUserAllMiLock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcHttpService;", "it", "Lerg;", "<anonymous>", "(Lcom/xiaomi/fitness/nfc/request/NfcHttpService;)Lerg;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.NfcRequest$getUserAllMiLock$1", f = "NfcRequest.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26661 extends SuspendLambda implements Function2<NfcHttpService, Continuation<? super erg>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C26661(Continuation<? super C26661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26661 c26661 = new C26661(continuation);
            c26661.L$0 = obj;
            return c26661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NfcHttpService nfcHttpService, Continuation<? super erg> continuation) {
            return ((C26661) create(nfcHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NfcHttpService nfcHttpService = (NfcHttpService) this.L$0;
                this.label = 1;
                obj = nfcHttpService.getUserAllDoorLock(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseResult baseResult = (BaseResult) obj;
            if (baseResult != null) {
                return (erg) baseResult.getResult();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.NfcRequest$initSupportMasterCardRegions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/nfc/entity/MasterRegions;", "it", "Lcom/xiaomi/fitness/nfc/request/NfcHttpService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.NfcRequest$initSupportMasterCardRegions$1", f = "NfcRequest.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26671 extends SuspendLambda implements Function2<NfcHttpService, Continuation<? super MasterRegions>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C26671(Continuation<? super C26671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26671 c26671 = NfcRequest.this.new C26671(continuation);
            c26671.L$0 = obj;
            return c26671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NfcHttpService nfcHttpService, Continuation<? super MasterRegions> continuation) {
            return ((C26671) create(nfcHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NfcHttpService nfcHttpService = (NfcHttpService) this.L$0;
                String json = NfcRequest.this.getMGson().toJson(new d7f());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = nfcHttpService.getSupportMasterRegions(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseResult baseResult = (BaseResult) obj;
            if (baseResult != null) {
                return (MasterRegions) baseResult.getResult();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllNfcDoorLock$lambda$2(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        vqg.c("getUserAllMiLock", it);
        String string = AppUtil.getApp().getString(o0j.t5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllNfcDoorLock$lambda$4(Function1 success, frg result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        StringBuilder sb = new StringBuilder();
        erg ergVar = result.f18126a;
        List<drg> list = ergVar != null ? ergVar.f16989a : null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                sb.append(((drg) it.next()).c);
                sb.append("\n");
            }
            success.invoke2(sb.toString());
        } else {
            success.invoke2(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserAllMiLock$lambda$0(Function1 success, Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        vqg.c("getUserAllMiLock", it);
        if (Intrinsics.areEqual(it, ApiException.INSTANCE.getEMPTY())) {
            success.invoke2(Boolean.FALSE);
        } else {
            String string = AppUtil.getApp().getString(o0j.t5);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserAllMiLock$lambda$1(Function1 success, erg result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        success.invoke2(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSupportMasterCardRegions$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vqg.c("initSupportMasterCardRegions", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSupportMasterCardRegions$lambda$6(NfcRequest this$0, MasterRegions result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        vqg.d("initSupportMasterCardRegions :" + this$0.getMGson().toJson(result));
        NfcPreference.INSTANCE.setSupportMasterRegins(this$0.getMGson().toJson(result));
        return Unit.INSTANCE;
    }

    public final void getAllNfcDoorLock(@NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        HashMap map = new HashMap();
        map.put("platform", 0);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        map.put("model", wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(map, null)).error(new Function1() { // from class: msg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcRequest.getAllNfcDoorLock$lambda$2(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: nsg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcRequest.getAllNfcDoorLock$lambda$4(success, (frg) obj);
            }
        });
    }

    public final void getUserAllMiLock(@NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26661(null)).error(new Function1() { // from class: qsg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcRequest.getUserAllMiLock$lambda$0(success, fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: rsg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcRequest.getUserAllMiLock$lambda$1(success, (erg) obj);
            }
        });
    }

    public final void initSupportMasterCardRegions() {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26671(null)).error(new Function1() { // from class: osg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcRequest.initSupportMasterCardRegions$lambda$5((ApiException) obj);
            }
        }).success(new Function1() { // from class: psg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcRequest.initSupportMasterCardRegions$lambda$6(this.f30706a, (MasterRegions) obj);
            }
        });
    }
}
