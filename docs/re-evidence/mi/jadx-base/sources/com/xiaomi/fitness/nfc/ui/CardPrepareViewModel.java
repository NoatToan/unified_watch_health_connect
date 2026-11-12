package com.xiaomi.fitness.nfc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.DigitalKeyCardOperation;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.URIUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.ui.CardPrepareViewModel;
import defpackage.bg4;
import defpackage.na4;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J{\u0010\u001d\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardPrepareViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "ing1", "ing2", "ing3", "Landroid/widget/TextView;", "textView", "issuerLoading", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V", "modelStr", "did", "protoType", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "success", "Lkotlin/Function0;", "notFound", "empty", "carSupportListError", "shareUrl", "findDevices", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardPrepareViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1", f = "CardPrepareViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $carSupportListError;
        final /* synthetic */ String $did;
        final /* synthetic */ Function0<Unit> $empty;
        final /* synthetic */ String $modelStr;
        final /* synthetic */ Function0<Unit> $notFound;
        final /* synthetic */ String $protoType;
        final /* synthetic */ String $shareUrl;
        final /* synthetic */ Function1<List<WearableDeviceModel>, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1", f = "CardPrepareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCardPrepareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardPrepareViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardPrepareViewModel$findDevices$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1863#2,2:175\n1863#2,2:177\n1863#2,2:179\n*S KotlinDebug\n*F\n+ 1 CardPrepareViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardPrepareViewModel$findDevices$1$1\n*L\n102#1:175,2\n122#1:177,2\n143#1:179,2\n*E\n"})
        public static final class C06671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $carSupportListError;
            final /* synthetic */ String $did;
            final /* synthetic */ Function0<Unit> $empty;
            final /* synthetic */ String $modelStr;
            final /* synthetic */ Function0<Unit> $notFound;
            final /* synthetic */ String $protoType;
            final /* synthetic */ String $shareUrl;
            final /* synthetic */ Function1<List<WearableDeviceModel>, Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$1", f = "CardPrepareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $empty;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06681(Function0<Unit> function0, Continuation<? super C06681> continuation) {
                    super(2, continuation);
                    this.$empty = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06681(this.$empty, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$empty.invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$3", f = "CardPrepareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $notFound;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Function0<Unit> function0, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$notFound = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$notFound, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$notFound.invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$6, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$6", f = "CardPrepareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $empty;
                final /* synthetic */ Function1<List<WearableDeviceModel>, Unit> $success;
                final /* synthetic */ Ref.ObjectRef<List<WearableDeviceModel>> $supportDeviceList;
                final /* synthetic */ Ref.ObjectRef<ArrayList<String>> $supportList;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass6(Ref.ObjectRef<ArrayList<String>> objectRef, Function1<? super List<WearableDeviceModel>, Unit> function1, Ref.ObjectRef<List<WearableDeviceModel>> objectRef2, Function0<Unit> function0, Continuation<? super AnonymousClass6> continuation) {
                    super(2, continuation);
                    this.$supportList = objectRef;
                    this.$success = function1;
                    this.$supportDeviceList = objectRef2;
                    this.$empty = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass6(this.$supportList, this.$success, this.$supportDeviceList, this.$empty, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!this.$supportList.element.isEmpty()) {
                        this.$success.invoke2(this.$supportDeviceList.element);
                    } else {
                        this.$empty.invoke();
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$7, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$7", f = "CardPrepareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $carSupportListError;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(Function0<Unit> function0, Continuation<? super AnonymousClass7> continuation) {
                    super(2, continuation);
                    this.$carSupportListError = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass7(this.$carSupportListError, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$carSupportListError.invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$8, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardPrepareViewModel$findDevices$1$1$8", f = "CardPrepareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ List<WearableDeviceModel> $deviceList;
                final /* synthetic */ Function1<List<WearableDeviceModel>, Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass8(Function1<? super List<WearableDeviceModel>, Unit> function1, List<WearableDeviceModel> list, Continuation<? super AnonymousClass8> continuation) {
                    super(2, continuation);
                    this.$success = function1;
                    this.$deviceList = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass8(this.$success, this.$deviceList, continuation);
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
                    return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06671(String str, String str2, Function0<Unit> function0, String str3, String str4, Function0<Unit> function1, Function1<? super List<WearableDeviceModel>, Unit> function2, Function0<Unit> function3, Continuation<? super C06671> continuation) {
                super(2, continuation);
                this.$shareUrl = str;
                this.$protoType = str2;
                this.$empty = function0;
                this.$did = str3;
                this.$modelStr = str4;
                this.$notFound = function1;
                this.$success = function2;
                this.$carSupportListError = function3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(CountDownLatch countDownLatch, WearableDeviceModel wearableDeviceModel) {
                vqg.d("addDeviceChangeListener callback");
                countDownLatch.countDown();
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06671(this.$shareUrl, this.$protoType, this.$empty, this.$did, this.$modelStr, this.$notFound, this.$success, this.$carSupportListError, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v20, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.ArrayList] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws InterruptedException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ArrayList<WearableDeviceModel> arrayList = new ArrayList();
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
                if (deviceManagerExtKt.getDeviceModels().isEmpty()) {
                    vqg.d("addDeviceChangeListener when devicesModels is empty");
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.g
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return CardPrepareViewModel.AnonymousClass1.C06671.invokeSuspend$lambda$0(countDownLatch, (WearableDeviceModel) obj2);
                        }
                    };
                    deviceManagerExtKt.addDeviceChangeListener(function1);
                    countDownLatch.await(30L, TimeUnit.SECONDS);
                    deviceManagerExtKt.removeDeviceChangeListener(function1);
                }
                List<T> deviceModels = DeviceManagerExtKt.getInstance(companion).getDeviceModels();
                vqg.b("deviceModels:" + deviceModels.size());
                if (deviceModels.isEmpty()) {
                    AnyExtKt.main$default(null, new C06681(this.$empty, null), 1, null);
                    return Unit.INSTANCE;
                }
                String str = this.$did;
                String str2 = this.$modelStr;
                for (T t : deviceModels) {
                    vqg.d("findDevices item did:" + t.getDid() + "  alias:" + t.getAlias() + " model:" + DeviceModelExtKt.getModel(t));
                    if (str != null && !StringsKt__StringsKt.isBlank(str) && Intrinsics.areEqual(str, t.getDid())) {
                        arrayList.add(t);
                    } else if (str2 != null && !StringsKt__StringsKt.isBlank(str2) && StringsKt__StringsJVMKt.equals(str2, t.getAlias(), true)) {
                        arrayList.add(t);
                    } else if (str2 != null && !StringsKt__StringsKt.isBlank(str2) && StringsKt__StringsJVMKt.equals(str2, DeviceModelExtKt.getModel(t), true)) {
                        arrayList.add(t);
                    } else if (str == null || StringsKt__StringsKt.isBlank(str)) {
                        if (str2 == null || StringsKt__StringsKt.isBlank(str2)) {
                            arrayList.add(t);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    AnyExtKt.main$default(null, new AnonymousClass3(this.$notFound, null), 1, null);
                    return Unit.INSTANCE;
                }
                if (this.$shareUrl != null) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String alias = ((WearableDeviceModel) it.next()).getAlias();
                        if (alias != null) {
                            ((ArrayList) objectRef.element).add(alias);
                        }
                    }
                    s3q.f0().u0();
                    String brandID = URIUtils.getBrandID(this.$shareUrl);
                    SeCard seCardO0 = Intrinsics.areEqual(this.$protoType, "ICCOA") ? s3q.f0().o0(CardCategory.ICCOA_DIGITAL_KEY) : s3q.f0().n0();
                    vqg.d("current SeCard is " + seCardO0 + " protoType:" + this.$protoType);
                    BaseResponse baseResponseQueryDeviceModelsSupportedSharing = new DigitalKeyCardOperation(seCardO0).queryDeviceModelsSupportedSharing(brandID, (List) objectRef.element);
                    vqg.d("findDevices queryDeviceModelsSupportedSharing code:" + baseResponseQueryDeviceModelsSupportedSharing.mResultCode + " msg:" + baseResponseQueryDeviceModelsSupportedSharing.mMsg + " brandID:" + brandID + " allDeviceList:" + ((ArrayList) objectRef.element).size());
                    if (baseResponseQueryDeviceModelsSupportedSharing.isSuccess()) {
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        Object obj2 = baseResponseQueryDeviceModelsSupportedSharing.mDatas[0];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                        objectRef2.element = (ArrayList) obj2;
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        objectRef3.element = new ArrayList();
                        for (WearableDeviceModel wearableDeviceModel : arrayList) {
                            if (CollectionsKt___CollectionsKt.contains((Iterable) objectRef2.element, wearableDeviceModel.getAlias())) {
                                ((List) objectRef3.element).add(wearableDeviceModel);
                            }
                        }
                        AnyExtKt.main$default(null, new AnonymousClass6(objectRef2, this.$success, objectRef3, this.$empty, null), 1, null);
                    } else {
                        AnyExtKt.main$default(null, new AnonymousClass7(this.$carSupportListError, null), 1, null);
                    }
                } else {
                    AnyExtKt.main$default(null, new AnonymousClass8(this.$success, arrayList, null), 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, Function0<Unit> function0, String str3, String str4, Function0<Unit> function1, Function1<? super List<WearableDeviceModel>, Unit> function2, Function0<Unit> function3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$shareUrl = str;
            this.$protoType = str2;
            this.$empty = function0;
            this.$did = str3;
            this.$modelStr = str4;
            this.$notFound = function1;
            this.$success = function2;
            this.$carSupportListError = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$shareUrl, this.$protoType, this.$empty, this.$did, this.$modelStr, this.$notFound, this.$success, this.$carSupportListError, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06671 c06671 = new C06671(this.$shareUrl, this.$protoType, this.$empty, this.$did, this.$modelStr, this.$notFound, this.$success, this.$carSupportListError, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06671, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$0(Activity activity, TextView textView, String ing1, String ing2, String ing3, Long l) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        Intrinsics.checkNotNullParameter(ing1, "$ing1");
        Intrinsics.checkNotNullParameter(ing2, "$ing2");
        Intrinsics.checkNotNullParameter(ing3, "$ing3");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(textView.getText().toString(), ing1)) {
            textView.setText(ing2);
        } else if (Intrinsics.areEqual(textView.getText().toString(), ing2)) {
            textView.setText(ing3);
        } else {
            textView.setText(ing1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$2(Throwable th) {
        vqg.c("mStatusIngTv error", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void findDevices(@Nullable String modelStr, @Nullable String did, @Nullable String protoType, @NotNull Function1<? super List<WearableDeviceModel>, Unit> success, @NotNull Function0<Unit> notFound, @NotNull Function0<Unit> empty, @NotNull Function0<Unit> carSupportListError, @Nullable String shareUrl) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(notFound, "notFound");
        Intrinsics.checkNotNullParameter(empty, "empty");
        Intrinsics.checkNotNullParameter(carSupportListError, "carSupportListError");
        vqg.d("findDevices modelStr:" + modelStr + "  did:" + did);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(shareUrl, protoType, empty, did, modelStr, notFound, success, carSupportListError, null), 3, null);
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void issuerLoading(@NotNull final Activity activity, @NotNull final String ing1, @NotNull final String ing2, @NotNull final String ing3, @NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ing1, "ing1");
        Intrinsics.checkNotNullParameter(ing2, "ing2");
        Intrinsics.checkNotNullParameter(ing3, "ing3");
        Intrinsics.checkNotNullParameter(textView, "textView");
        na4 na4Var = this.compositeDisposable;
        o4h<Long> o4hVarH = o4h.A(1L, TimeUnit.SECONDS).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: xp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardPrepareViewModel.issuerLoading$lambda$0(activity, textView, ing1, ing2, ing3, (Long) obj);
            }
        };
        bg4<? super Long> bg4Var = new bg4() { // from class: yp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardPrepareViewModel.issuerLoading$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: zp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardPrepareViewModel.issuerLoading$lambda$2((Throwable) obj);
            }
        };
        na4Var.a(o4hVarH.O(bg4Var, new bg4() { // from class: aq3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardPrepareViewModel.issuerLoading$lambda$3(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
