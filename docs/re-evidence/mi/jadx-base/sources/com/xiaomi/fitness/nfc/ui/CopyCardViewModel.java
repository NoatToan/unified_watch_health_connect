package com.xiaomi.fitness.nfc.ui;

import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CheckEncryptCardResponse;
import com.miui.tsmclient.sesdk.KeyCardOperation;
import com.miui.tsmclient.sesdk.MifareClassicOperation;
import com.miui.tsmclient.sesdk.SeCard;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.exception.EncryptionCardException;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.exception.SupperCardException;
import com.xiaomi.fitness.nfc.model.MifareCardModel;
import com.xiaomi.fitness.nfc.sdk.RawModeImpl;
import defpackage.fmg;
import defpackage.ltg;
import defpackage.na4;
import defpackage.o0j;
import defpackage.s3q;
import defpackage.ssg;
import defpackage.vqg;
import defpackage.zl3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b6\u00107JG\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u001d\u0010\u001eJg\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CopyCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/miui/tsmclient/sesdk/CheckEncryptCardResponse;", "data", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "", "supperDoorCardSuccess", "Lkotlin/Function2;", "", "fail", "handleCloudDoor", "(Lcom/miui/tsmclient/sesdk/CheckEncryptCardResponse;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lcom/miui/tsmclient/sesdk/SeCard;", "findSupperCard", "()Lcom/miui/tsmclient/sesdk/SeCard;", "Landroid/nfc/Tag;", "tag", "Lcom/miui/tsmclient/entity/MifareTag;", "success", "encryCardCallBack", "parsePhoneTag", "(Landroid/nfc/Tag;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "uid", "Lkotlin/Function0;", "checkMifareIssued", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "status", "encryption", "readMifareTagByDevice", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "Lcom/xiaomi/fitness/nfc/model/MifareCardModel;", "mModel", "Lcom/xiaomi/fitness/nfc/model/MifareCardModel;", "getMModel", "()Lcom/xiaomi/fitness/nfc/model/MifareCardModel;", "setMModel", "(Lcom/xiaomi/fitness/nfc/model/MifareCardModel;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CopyCardViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    @NotNull
    private MifareCardModel mModel = new MifareCardModel();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$checkMifareIssued$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$checkMifareIssued$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        final /* synthetic */ String $uid;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$checkMifareIssued$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$checkMifareIssued$1$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Ref.BooleanRef $ret;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06711(Ref.BooleanRef booleanRef, Function1<? super String, Unit> function1, Function0<Unit> function0, Continuation<? super C06711> continuation) {
                super(2, continuation);
                this.$ret = booleanRef;
                this.$fail = function1;
                this.$success = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06711(this.$ret, this.$fail, this.$success, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$ret.element) {
                    Function1<String, Unit> function1 = this.$fail;
                    String string = AppUtil.getApp().getString(o0j.I4);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    function1.invoke2(string);
                } else {
                    this.$success.invoke();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super String, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uid = str;
            this.$fail = function1;
            this.$success = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uid, this.$fail, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = new KeyCardOperation(null).checkMifareIssued(this.$uid);
            AnyExtKt.main$default(null, new C06711(booleanRef, this.$fail, this.$success, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$handleCloudDoor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$handleCloudDoor$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<String, String, Unit> $fail;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26781(Function2<? super String, ? super String, Unit> function2, Continuation<? super C26781> continuation) {
            super(2, continuation);
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26781(this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$fail.invoke(ResourceExtKt.getString(o0j.o4), null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$handleCloudDoor$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$handleCloudDoor$2", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cloudDoorCardWapper;
        final /* synthetic */ Function1<CardWrapper, Unit> $supperDoorCardSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(CardWrapper cardWrapper, Function1<? super CardWrapper, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$cloudDoorCardWapper = cardWrapper;
            this.$supperDoorCardSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$cloudDoorCardWapper, this.$supperDoorCardSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            zl3.g().l(this.$cloudDoorCardWapper);
            this.$supperDoorCardSuccess.invoke2(this.$cloudDoorCardWapper);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$handleCloudDoor$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$handleCloudDoor$3", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<String, String, Unit> $fail;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super String, ? super String, Unit> function2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$fail.invoke(ResourceExtKt.getString(o0j.o4), null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<MifareTag, Unit> $encryCardCallBack;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function1<MifareTag, Unit> $success;
        final /* synthetic */ Tag $tag;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function1<MifareTag, Unit> $success;
            final /* synthetic */ MifareTag $tag;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06721(MifareTag mifareTag, Function1<? super String, Unit> function1, Function1<? super MifareTag, Unit> function2, Continuation<? super C06721> continuation) {
                super(2, continuation);
                this.$tag = mifareTag;
                this.$fail = function1;
                this.$success = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06721(this.$tag, this.$fail, this.$success, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MifareTag mifareTag = this.$tag;
                if (mifareTag == null) {
                    Function1<String, Unit> function1 = this.$fail;
                    String string = AppUtil.getApp().getString(o0j.M5);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    function1.invoke2(string);
                } else {
                    this.$success.invoke2(mifareTag);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1$2", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ EncryptionCardException $e;
            final /* synthetic */ Function1<MifareTag, Unit> $encryCardCallBack;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function1<? super MifareTag, Unit> function1, EncryptionCardException encryptionCardException, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$encryCardCallBack = function1;
                this.$e = encryptionCardException;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$encryCardCallBack, this.$e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<MifareTag, Unit> function1 = this.$encryCardCallBack;
                MifareTag mifareTag = this.$e.mifareTag;
                Intrinsics.checkNotNullExpressionValue(mifareTag, "mifareTag");
                function1.invoke2(mifareTag);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$parsePhoneTag$1$3", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Ref.ObjectRef<String> $msg;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(Function1<? super String, Unit> function1, Ref.ObjectRef<String> objectRef, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$fail = function1;
                this.$msg = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$fail, this.$msg, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$fail.invoke2(this.$msg.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26791(Tag tag, Function1<? super String, Unit> function1, Function1<? super MifareTag, Unit> function2, Function1<? super MifareTag, Unit> function3, Continuation<? super C26791> continuation) {
            super(2, continuation);
            this.$tag = tag;
            this.$fail = function1;
            this.$success = function2;
            this.$encryCardCallBack = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CopyCardViewModel.this.new C26791(this.$tag, this.$fail, this.$success, this.$encryCardCallBack, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            T t;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                MifareTag tag = CopyCardViewModel.this.getMModel().parseTag(this.$tag);
                if (new KeyCardOperation(null).checkMifareIssued(tag.getUid())) {
                    throw new NfcException(AppUtil.getApp().getString(o0j.I4));
                }
                AnyExtKt.main$default(null, new C06721(tag, this.$fail, this.$success, null), 1, null);
                return Unit.INSTANCE;
            } catch (EncryptionCardException e) {
                vqg.b("parsePhoneTag EncryptionCardException " + e.mifareTag);
                AnyExtKt.main$default(null, new AnonymousClass2(this.$encryCardCallBack, e, null), 1, null);
            } catch (Exception e2) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (TextUtils.isEmpty(e2.getMessage())) {
                    String string = AppUtil.getApp().getString(o0j.M5);
                    Intrinsics.checkNotNull(string);
                    t = string;
                } else {
                    String message = e2.getMessage();
                    Intrinsics.checkNotNull(message);
                    t = message;
                }
                objectRef.element = t;
                AnyExtKt.main$default(null, new AnonymousClass3(this.$fail, objectRef, null), 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1", f = "CopyCardViewModel.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $encryption;
        final /* synthetic */ Function2<String, String, Unit> $fail;
        final /* synthetic */ int $status;
        final /* synthetic */ Function1<MifareTag, Unit> $success;
        final /* synthetic */ Function1<CardWrapper, Unit> $supperDoorCardSuccess;
        int label;
        final /* synthetic */ CopyCardViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $encryption;
            final /* synthetic */ Function2<String, String, Unit> $fail;
            final /* synthetic */ int $status;
            final /* synthetic */ Function1<MifareTag, Unit> $success;
            final /* synthetic */ Function1<CardWrapper, Unit> $supperDoorCardSuccess;
            int label;
            final /* synthetic */ CopyCardViewModel this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MifareTag $mifareTag;
                final /* synthetic */ Function1<MifareTag, Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C06741(Function1<? super MifareTag, Unit> function1, MifareTag mifareTag, Continuation<? super C06741> continuation) {
                    super(2, continuation);
                    this.$success = function1;
                    this.$mifareTag = mifareTag;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06741(this.$success, this.$mifareTag, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success.invoke2(this.$mifareTag);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$10, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$10", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ BaseResponse $cardStatusResponse;
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass10(Function2<? super String, ? super String, Unit> function2, BaseResponse baseResponse, Continuation<? super AnonymousClass10> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                    this.$cardStatusResponse = baseResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass10(this.$fail, this.$cardStatusResponse, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function2<String, String, Unit> function2 = this.$fail;
                    String mMsg = this.$cardStatusResponse.mMsg;
                    Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
                    function2.invoke(mMsg, null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$11, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$11", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ BaseResponse $cardStatusResponse;
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass11(Function2<? super String, ? super String, Unit> function2, BaseResponse baseResponse, Continuation<? super AnonymousClass11> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                    this.$cardStatusResponse = baseResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass11(this.$fail, this.$cardStatusResponse, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function2<String, String, Unit> function2 = this.$fail;
                    String mMsg = this.$cardStatusResponse.mMsg;
                    Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
                    function2.invoke(mMsg, null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$12, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$12", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $encryption;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass12(Function0<Unit> function0, Continuation<? super AnonymousClass12> continuation) {
                    super(2, continuation);
                    this.$encryption = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass12(this.$encryption, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$encryption.invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$13, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$13", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Exception $e;
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass13(Function2<? super String, ? super String, Unit> function2, Exception exc, Continuation<? super AnonymousClass13> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                    this.$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass13(this.$fail, this.$e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function2<String, String, Unit> function2 = this.$fail;
                    String strC = fmg.c(this.$e);
                    Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
                    function2.invoke(strC, ResourceExtKt.getString(o0j.K2));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$2", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function2<? super String, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke(ResourceExtKt.getString(o0j.o4), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$3", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(Function2<? super String, ? super String, Unit> function2, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke(ResourceExtKt.getString(o0j.I4), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$4", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass4(Function2<? super String, ? super String, Unit> function2, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke(ResourceExtKt.getString(o0j.M2), ResourceExtKt.getString(o0j.L2));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$5", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Object $data;
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass5(Function2<? super String, ? super String, Unit> function2, Object obj, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                    this.$data = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$fail, this.$data, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function2<String, String, Unit> function2 = this.$fail;
                    String errorInfo = ((CheckEncryptCardResponse) this.$data).getErrorInfo();
                    Intrinsics.checkNotNullExpressionValue(errorInfo, "getErrorInfo(...)");
                    function2.invoke(errorInfo, null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$7, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$7", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass7(Function2<? super String, ? super String, Unit> function2, Continuation<? super AnonymousClass7> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass7(this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke(ResourceExtKt.getString(o0j.o4), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$8, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$8", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<String, String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass8(Function2<? super String, ? super String, Unit> function2, Continuation<? super AnonymousClass8> continuation) {
                    super(2, continuation);
                    this.$fail = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass8(this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke(ResourceExtKt.getString(o0j.o4), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2<String, String, Unit> $fail;
                final /* synthetic */ MifareClassicOperation $mifareClassicOperation;
                final /* synthetic */ SeCard $supperCard;
                final /* synthetic */ Function1<CardWrapper, Unit> $supperDoorCardSuccess;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass9(MifareClassicOperation mifareClassicOperation, Function2<? super String, ? super String, Unit> function2, SeCard seCard, Function1<? super CardWrapper, Unit> function1, Continuation<? super AnonymousClass9> continuation) {
                    super(2, continuation);
                    this.$mifareClassicOperation = mifareClassicOperation;
                    this.$fail = function2;
                    this.$supperCard = seCard;
                    this.$supperDoorCardSuccess = function1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invokeSuspend$lambda$0(Function2 function2, Ref.ObjectRef objectRef, SeCard seCard, Function1 function1, Boolean bool) {
                    if (!bool.booleanValue()) {
                        AnyExtKt.main$default(null, new CopyCardViewModel$readMifareTagByDevice$1$1$9$1$1(function2, null), 1, null);
                        return;
                    }
                    vqg.d("openRawMode false isMain=" + AppUtil.INSTANCE.isMainThread());
                    AnyExtKt.io$default(null, new CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2(objectRef, seCard, function1, function2, null), 1, null);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass9(this.$mifareClassicOperation, this.$fail, this.$supperCard, this.$supperDoorCardSuccess, continuation);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [T, com.miui.tsmclient.model.BaseResponse] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = this.$mifareClassicOperation.probeData(new RawModeImpl());
                    ltg ltgVarC = ltg.c();
                    final Function2<String, String, Unit> function2 = this.$fail;
                    final SeCard seCard = this.$supperCard;
                    final Function1<CardWrapper, Unit> function1 = this.$supperDoorCardSuccess;
                    ltgVarC.closeTai(new ssg.b() { // from class: com.xiaomi.fitness.nfc.ui.i
                        @Override // ssg.b
                        public final void onResult(Object obj2) {
                            CopyCardViewModel.C26801.C06731.AnonymousClass9.invokeSuspend$lambda$0(function2, objectRef, seCard, function1, (Boolean) obj2);
                        }
                    });
                    this.$mifareClassicOperation.openRawMode(false);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06731(int i, CopyCardViewModel copyCardViewModel, Function1<? super CardWrapper, Unit> function1, Function2<? super String, ? super String, Unit> function2, Function1<? super MifareTag, Unit> function3, Function0<Unit> function0, Continuation<? super C06731> continuation) {
                super(2, continuation);
                this.$status = i;
                this.this$0 = copyCardViewModel;
                this.$supperDoorCardSuccess = function1;
                this.$fail = function2;
                this.$success = function3;
                this.$encryption = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(AtomicReference atomicReference, CountDownLatch countDownLatch, Function2 function2, Boolean bool) {
                if (bool.booleanValue()) {
                    atomicReference.set(Boolean.TRUE);
                    countDownLatch.countDown();
                } else {
                    atomicReference.set(Boolean.FALSE);
                    countDownLatch.countDown();
                    AnyExtKt.main$default(null, new CopyCardViewModel$readMifareTagByDevice$1$1$6$1(function2, null), 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06731(this.$status, this.this$0, this.$supperDoorCardSuccess, this.$fail, this.$success, this.$encryption, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws InterruptedException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    MifareTag mifareTagK1 = s3q.f0().k1(this.$status);
                    Intrinsics.checkNotNullExpressionValue(mifareTagK1, "readMifareTagSync(...)");
                    AnyExtKt.main$default(null, new C06741(this.$success, mifareTagK1, null), 1, null);
                } catch (Exception e) {
                    vqg.c("readMifareTagSync", e);
                    if (!(e instanceof SupperCardException)) {
                        if (e instanceof EncryptionCardException) {
                            AnyExtKt.main$default(null, new AnonymousClass12(this.$encryption, null), 1, null);
                            return Unit.INSTANCE;
                        }
                        AnyExtKt.main$default(null, new AnonymousClass13(this.$fail, e, null), 1, null);
                        return Unit.INSTANCE;
                    }
                    SeCard seCardFindSupperCard = this.this$0.findSupperCard();
                    if (seCardFindSupperCard == null) {
                        AnyExtKt.main$default(null, new AnonymousClass2(this.$fail, null), 1, null);
                        return Unit.INSTANCE;
                    }
                    MifareClassicOperation mifareClassicOperation = new MifareClassicOperation(seCardFindSupperCard);
                    mifareClassicOperation.setTag(((SupperCardException) e).mifareClassicTag);
                    BaseResponse cardStatus = mifareClassicOperation.getCardStatus();
                    if (!cardStatus.isSuccess()) {
                        vqg.d("mifareClassicOperation.cardStatus end code:" + cardStatus.mResultCode + "   msg:" + cardStatus.mMsg);
                        AnyExtKt.main$default(null, new AnonymousClass11(this.$fail, cardStatus, null), 1, null);
                        return Unit.INSTANCE;
                    }
                    Object[] objArr = cardStatus.mDatas;
                    Intrinsics.checkNotNull(objArr);
                    if (!(objArr.length == 0)) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof CheckEncryptCardResponse) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.miui.tsmclient.sesdk.CheckEncryptCardResponse");
                            CheckEncryptCardResponse checkEncryptCardResponse = (CheckEncryptCardResponse) obj2;
                            vqg.d("data.isExist " + checkEncryptCardResponse.isExist());
                            if (checkEncryptCardResponse.isExist()) {
                                AnyExtKt.main$default(null, new AnonymousClass3(this.$fail, null), 1, null);
                                return Unit.INSTANCE;
                            }
                            vqg.d("data.isExistCloudCard " + checkEncryptCardResponse.isExistCloudCard());
                            if (checkEncryptCardResponse.isExistCloudCard()) {
                                this.this$0.handleCloudDoor(checkEncryptCardResponse, this.$supperDoorCardSuccess, this.$fail);
                                return Unit.INSTANCE;
                            }
                            vqg.d("data.isEncryptCardSupported " + checkEncryptCardResponse.isEncryptCardSupported());
                            if (!checkEncryptCardResponse.isEncryptCardSupported()) {
                                AnyExtKt.main$default(null, new AnonymousClass4(this.$fail, null), 1, null);
                                return Unit.INSTANCE;
                            }
                            vqg.d("data.isEncryptCardSupported " + checkEncryptCardResponse.isEncryptCardSupported());
                            if (!checkEncryptCardResponse.isEncryptCardSupported()) {
                                this.$fail.invoke(ResourceExtKt.getString(o0j.M2), ResourceExtKt.getString(o0j.L2));
                                return Unit.INSTANCE;
                            }
                            vqg.d("data.isServiceAvailable " + checkEncryptCardResponse.isServiceAvailable() + " " + checkEncryptCardResponse.getErrorInfo());
                            if (!checkEncryptCardResponse.isServiceAvailable()) {
                                AnyExtKt.main$default(null, new AnonymousClass5(this.$fail, obj2, null), 1, null);
                                return Unit.INSTANCE;
                            }
                            final CountDownLatch countDownLatch = new CountDownLatch(1);
                            final AtomicReference atomicReference = new AtomicReference();
                            ltg ltgVarC = ltg.c();
                            final Function2<String, String, Unit> function2 = this.$fail;
                            ltgVarC.openTai(new ssg.b() { // from class: com.xiaomi.fitness.nfc.ui.h
                                @Override // ssg.b
                                public final void onResult(Object obj3) {
                                    CopyCardViewModel.C26801.C06731.invokeSuspend$lambda$0(atomicReference, countDownLatch, function2, (Boolean) obj3);
                                }
                            });
                            vqg.d("openRawMode true");
                            BaseResponse baseResponseOpenRawMode = mifareClassicOperation.openRawMode(true);
                            countDownLatch.await();
                            vqg.d("openRawMode true response code:" + baseResponseOpenRawMode.mResultCode);
                            if (!baseResponseOpenRawMode.isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass7(this.$fail, null), 1, null);
                                return Unit.INSTANCE;
                            }
                            if (!((Boolean) atomicReference.get()).booleanValue()) {
                                AnyExtKt.main$default(null, new AnonymousClass8(this.$fail, null), 1, null);
                                return Unit.INSTANCE;
                            }
                            AnyExtKt.io$default(null, new AnonymousClass9(mifareClassicOperation, this.$fail, seCardFindSupperCard, this.$supperDoorCardSuccess, null), 1, null);
                        }
                    }
                    vqg.d("mifareClassicOperation.cardStatus end sdk err");
                    AnyExtKt.main$default(null, new AnonymousClass10(this.$fail, cardStatus, null), 1, null);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26801(int i, CopyCardViewModel copyCardViewModel, Function1<? super CardWrapper, Unit> function1, Function2<? super String, ? super String, Unit> function2, Function1<? super MifareTag, Unit> function3, Function0<Unit> function0, Continuation<? super C26801> continuation) {
            super(2, continuation);
            this.$status = i;
            this.this$0 = copyCardViewModel;
            this.$supperDoorCardSuccess = function1;
            this.$fail = function2;
            this.$success = function3;
            this.$encryption = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26801(this.$status, this.this$0, this.$supperDoorCardSuccess, this.$fail, this.$success, this.$encryption, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06731 c06731 = new C06731(this.$status, this.this$0, this.$supperDoorCardSuccess, this.$fail, this.$success, this.$encryption, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06731, this) == coroutine_suspended) {
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
            return ((C26801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCloudDoor(CheckEncryptCardResponse data, Function1<? super CardWrapper, Unit> supperDoorCardSuccess, Function2<? super String, ? super String, Unit> fail) {
        try {
            CardWrapper cardWrapperY = s3q.f0().Y(data.getCloudCardCid());
            if (cardWrapperY != null) {
                AnyExtKt.main$default(null, new AnonymousClass2(cardWrapperY, supperDoorCardSuccess, null), 1, null);
            } else {
                vqg.d("getCloudDoorCardByCidSync is null");
                AnyExtKt.main$default(null, new C26781(fail, null), 1, null);
            }
        } catch (Exception e) {
            vqg.c("getCloudDoorCardByCidSync", e);
            AnyExtKt.main$default(null, new AnonymousClass3(fail, null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkMifareIssued(@NotNull String uid, @NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(uid, fail, success, null), 2, null);
    }

    @Nullable
    public final SeCard findSupperCard() {
        try {
            return s3q.f0().S("99998-00001");
        } catch (Exception e) {
            vqg.c("findSupperCard supperCard", e);
            return null;
        }
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    @NotNull
    public final MifareCardModel getMModel() {
        return this.mModel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void parsePhoneTag(@NotNull Tag tag, @NotNull Function1<? super MifareTag, Unit> success, @NotNull Function1<? super String, Unit> fail, @NotNull Function1<? super MifareTag, Unit> encryCardCallBack) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        Intrinsics.checkNotNullParameter(encryCardCallBack, "encryCardCallBack");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C26791(tag, fail, success, encryCardCallBack, null), 2, null);
    }

    public final void readMifareTagByDevice(int status, @NotNull Function1<? super MifareTag, Unit> success, @NotNull Function1<? super CardWrapper, Unit> supperDoorCardSuccess, @NotNull Function0<Unit> encryption, @NotNull Function2<? super String, ? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(supperDoorCardSuccess, "supperDoorCardSuccess");
        Intrinsics.checkNotNullParameter(encryption, "encryption");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26801(status, this, supperDoorCardSuccess, fail, success, encryption, null), 3, null);
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void setMModel(@NotNull MifareCardModel mifareCardModel) {
        Intrinsics.checkNotNullParameter(mifareCardModel, "<set-?>");
        this.mModel = mifareCardModel;
    }
}
