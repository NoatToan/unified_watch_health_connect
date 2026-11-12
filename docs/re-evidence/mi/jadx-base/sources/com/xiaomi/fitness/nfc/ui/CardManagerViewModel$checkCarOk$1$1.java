package com.xiaomi.fitness.nfc.ui;

import android.net.Uri;
import com.miui.tsmclient.sesdk.DigitalKeyCardOperation;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.URIUtils;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import defpackage.s3q;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardManagerViewModel$checkCarOk$1$1", f = "CardManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CardManagerViewModel$checkCarOk$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDeviceModel $it;
    final /* synthetic */ Ref.ObjectRef<String> $shareUrl;
    final /* synthetic */ Function2<String, String, Unit> $success;
    int label;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardManagerViewModel$checkCarOk$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardManagerViewModel$checkCarOk$1$1$1", f = "CardManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $it;
        final /* synthetic */ Ref.ObjectRef<String> $shareUrl;
        final /* synthetic */ Function2<String, String, Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super String, ? super String, Unit> function2, Ref.ObjectRef<String> objectRef, WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function2;
            this.$shareUrl = objectRef;
            this.$it = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$success, this.$shareUrl, this.$it, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function2<String, String, Unit> function2 = this.$success;
            String strEncode = Uri.encode(this.$shareUrl.element);
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            function2.invoke(strEncode, this.$it.getDid());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardManagerViewModel$checkCarOk$1$1(Ref.ObjectRef<String> objectRef, WearableDeviceModel wearableDeviceModel, Function2<? super String, ? super String, Unit> function2, Continuation<? super CardManagerViewModel$checkCarOk$1$1> continuation) {
        super(2, continuation);
        this.$shareUrl = objectRef;
        this.$it = wearableDeviceModel;
        this.$success = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardManagerViewModel$checkCarOk$1$1(this.$shareUrl, this.$it, this.$success, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SeCard seCardN0 = s3q.f0().n0();
        if (seCardN0 == null) {
            vqg.b("supportCarSeCard null");
            return Unit.INSTANCE;
        }
        int i = new DigitalKeyCardOperation(seCardN0).queryImportRequestStatus(URIUtils.getMailboxID(this.$shareUrl.element)).mResultCode;
        if (i == 0) {
            AnyExtKt.main$default(null, new AnonymousClass1(this.$success, this.$shareUrl, this.$it, null), 1, null);
        } else if (i != 11 && i != 22022 && i != 3 && i != 4) {
            NfcPreference.setCarMailboxId(this.$it.getDid(), "");
            NfcPreference.setCarDeviceId("");
            NfcPreference.setCarDeviceName("");
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardManagerViewModel$checkCarOk$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
