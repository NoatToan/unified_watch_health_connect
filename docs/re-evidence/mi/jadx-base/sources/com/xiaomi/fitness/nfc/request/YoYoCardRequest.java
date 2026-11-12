package com.xiaomi.fitness.nfc.request;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoRequest;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.CommandRequest;
import com.xiaomi.fitness.nfc.bean.yoyo.DisableCardResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.EasyCardResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.PullCommandResponse;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.o0j;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/YoYoCardRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/nfc/request/NfcHttpNewService;", "<init>", "()V", "cardInfo", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoResponse;", "cardInfoRequest", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoRequest;", "(Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullCommand", "Lcom/xiaomi/fitness/nfc/bean/yoyo/EasyCardResponse;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/PullCommandResponse;", "commandRequest", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "(Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableCard", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYoYoCardRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoYoCardRequest.kt\ncom/xiaomi/fitness/nfc/request/YoYoCardRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,82:1\n141#2:83\n141#2:87\n141#2:91\n31#3:84\n28#3,2:85\n31#3:88\n28#3,2:89\n31#3:92\n28#3,2:93\n*S KotlinDebug\n*F\n+ 1 YoYoCardRequest.kt\ncom/xiaomi/fitness/nfc/request/YoYoCardRequest\n*L\n28#1:83\n51#1:87\n69#1:91\n28#1:84\n28#1:85,2\n51#1:88\n51#1:89,2\n69#1:92\n69#1:93,2\n*E\n"})
public final class YoYoCardRequest extends BaseRequest<NfcHttpNewService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.YoYoCardRequest$cardInfo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.YoYoCardRequest", f = "YoYoCardRequest.kt", i = {}, l = {28}, m = "cardInfo", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return YoYoCardRequest.this.cardInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.YoYoCardRequest$disableCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.YoYoCardRequest", f = "YoYoCardRequest.kt", i = {}, l = {69}, m = "disableCard", n = {}, s = {})
    public static final class C26681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26681(Continuation<? super C26681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return YoYoCardRequest.this.disableCard(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.YoYoCardRequest$pullCommand$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.YoYoCardRequest", f = "YoYoCardRequest.kt", i = {}, l = {51}, m = "pullCommand", n = {}, s = {})
    public static final class C26691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26691(Continuation<? super C26691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return YoYoCardRequest.this.pullCommand(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object cardInfo(@NotNull CardInfoRequest cardInfoRequest, @NotNull Continuation<? super CardInfoResponse> continuation) throws NfcException {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCardInfo = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCardInfo);
                String json = getMGson().toJson(cardInfoRequest);
                vqg.d("YoYoCardRequest cardInfo requestData:" + json);
                NfcHttpNewService mService = getMService();
                Intrinsics.checkNotNull(json);
                anonymousClass1.label = 1;
                objCardInfo = mService.cardInfo(json, anonymousClass1);
                if (objCardInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCardInfo);
            }
            EasyCardResponse easyCardResponse = (EasyCardResponse) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCardInfo);
            if (!NfcUtils.isYoYoApiSuccess(easyCardResponse.getRespCode())) {
                vqg.d("YoYoCardViewModel createNewCard respCode is " + easyCardResponse.getRespCode());
                throw new NfcException(NfcUtils.getYoYoCardErrorMsg(easyCardResponse.getRespCode()));
            }
            CardInfoResponse cardInfoResponse = (CardInfoResponse) easyCardResponse.getRespData();
            vqg.d("YoYoCardRequest cardInfo respCode:" + easyCardResponse.getRespCode() + " cardStatus:" + cardInfoResponse.getCardInfo().getCardStatus());
            return cardInfoResponse;
        } catch (NfcException e) {
            throw e;
        } catch (Exception e2) {
            vqg.c("YoYoCardRequest cardInfo", e2);
            throw new NfcException(ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object disableCard(@NotNull CardInfoRequest cardInfoRequest, @NotNull Continuation<? super Boolean> continuation) throws NfcException {
        C26681 c26681;
        if (continuation instanceof C26681) {
            c26681 = (C26681) continuation;
            int i = c26681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26681.label = i - Integer.MIN_VALUE;
            } else {
                c26681 = new C26681(continuation);
            }
        } else {
            c26681 = new C26681(continuation);
        }
        Object objDisableCard = c26681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26681.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDisableCard);
                String json = getMGson().toJson(cardInfoRequest);
                vqg.d("YoYoCardRequest disableCard requestData:" + json);
                NfcHttpNewService mService = getMService();
                Intrinsics.checkNotNull(json);
                c26681.label = 1;
                objDisableCard = mService.disableCard(json, c26681);
                if (objDisableCard == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDisableCard);
            }
            DisableCardResponse disableCardResponse = (DisableCardResponse) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDisableCard);
            if (NfcUtils.isYoYoApiSuccess(disableCardResponse.getRespCode())) {
                return Boxing.boxBoolean(true);
            }
            vqg.d("YoYoCardViewModel disableCard respCode is " + disableCardResponse.getRespCode());
            throw new NfcException(NfcUtils.getYoYoCardErrorMsg(disableCardResponse.getRespCode()));
        } catch (Exception e) {
            vqg.c("YoYoCardRequest cardInfo", e);
            throw new NfcException(ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object pullCommand(@NotNull CommandRequest commandRequest, @NotNull Continuation<? super EasyCardResponse<PullCommandResponse>> continuation) throws NfcException {
        C26691 c26691;
        if (continuation instanceof C26691) {
            c26691 = (C26691) continuation;
            int i = c26691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26691.label = i - Integer.MIN_VALUE;
            } else {
                c26691 = new C26691(continuation);
            }
        } else {
            c26691 = new C26691(continuation);
        }
        Object objPullCommand = c26691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26691.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullCommand);
                String json = getMGson().toJson(commandRequest);
                vqg.b("YoYoCardRequest pullCommand requestData:" + json);
                NfcHttpNewService mService = getMService();
                Intrinsics.checkNotNull(json);
                c26691.label = 1;
                objPullCommand = mService.pullCommand(json, c26691);
                if (objPullCommand == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullCommand);
            }
            EasyCardResponse easyCardResponse = (EasyCardResponse) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objPullCommand);
            vqg.b("YoYoCardRequest pullCommand respCode:" + easyCardResponse.getRespCode());
            if (NfcUtils.isYoYoApiSuccess(easyCardResponse.getRespCode())) {
                vqg.d("YoYoCardRequest pullCommand respCode:" + easyCardResponse.getRespCode() + " stepStatus:" + ((PullCommandResponse) easyCardResponse.getRespData()).getStepStatus());
            }
            return easyCardResponse;
        } catch (Exception e) {
            vqg.c("YoYoCardRequest cardInfo", e);
            throw new NfcException(ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
        }
    }
}
