package com.xiaomi.fitness.nfc.apdu;

import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.EasyCardService;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoRequest;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.CommandRequest;
import com.xiaomi.fitness.nfc.bean.yoyo.EasyCardResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.PullCommandResponse;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.request.YoYoCardRequest;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.onetrack.api.b;
import defpackage.l7;
import defpackage.o0j;
import defpackage.qrk;
import defpackage.vqg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001b\u0010\u000fJ0\u0010\u001d\u001a\u00020\u00102\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b&\u0010%R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010-¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/nfc/apdu/ApduManager;", "", "", "type", "", TSMAuthContants.PARAM_LOGICAL_NO, "Lcom/miui/tsmclient/model/BaseResponse;", "executeSeiApdu", "(ILjava/lang/String;)Lcom/miui/tsmclient/model/BaseResponse;", "generaterJson", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "commandRequest", "Lqrk;", "executeSpApdu", "(Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll7;", "apduCommand", "executeCapdu", "(Ll7;Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/tsmclient/smartcard/terminal/IScTerminal;", "terminal", "internalExecuteCapdu", "(Ll7;Lcom/tsmclient/smartcard/terminal/IScTerminal;Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ll7;Lcom/tsmclient/smartcard/terminal/IScTerminal;)Ljava/util/ArrayList;", "pullFirstApduBatch", "apduItemList", "pullNextApduBatch", "(Ljava/util/ArrayList;Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/EasyCardResponse;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/PullCommandResponse;", "easyCardResponse", "parserCommand", "(Lcom/xiaomi/fitness/nfc/bean/yoyo/EasyCardResponse;)Ll7;", "startAction", "(ILcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalStartAction", "Lcom/xiaomi/fitness/nfc/request/YoYoCardRequest;", "yoYoCardRequest", "Lcom/xiaomi/fitness/nfc/request/YoYoCardRequest;", "getYoYoCardRequest", "()Lcom/xiaomi/fitness/nfc/request/YoYoCardRequest;", "sTypeIssue", "I", "sTypeDelete", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ApduManager {
    public static final int sTypeDelete = 1;
    public static final int sTypeIssue = 0;

    @NotNull
    public static final ApduManager INSTANCE = new ApduManager();

    @NotNull
    private static final YoYoCardRequest yoYoCardRequest = new YoYoCardRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$executeCapdu$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {0, 0}, l = {162}, m = "executeCapdu", n = {b.I, "terminal"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return ApduManager.this.executeCapdu(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$executeSpApdu$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {0, 0}, l = {143, 148}, m = "executeSpApdu", n = {"this", "commandRequest"}, s = {"L$0", "L$1"})
    public static final class C26551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C26551(Continuation<? super C26551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApduManager.this.executeSpApdu(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$internalExecuteCapdu$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {0, 0, 0, 0}, l = {180, 182}, m = "internalExecuteCapdu", n = {"this", "apduCommand", "terminal", "commandRequest"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C26561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C26561(Continuation<? super C26561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApduManager.this.internalExecuteCapdu(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$internalStartAction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {47, 58, 63, 78, 87}, m = "internalStartAction", n = {"this", "commandRequest", "cardInfoRequest", "this", "commandRequest", "cardInfoRequest", "this", "commandRequest"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class C26571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C26571(Continuation<? super C26571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApduManager.this.internalStartAction(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$pullFirstApduBatch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {0}, l = {216}, m = "pullFirstApduBatch", n = {"this"}, s = {"L$0"})
    public static final class C26581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C26581(Continuation<? super C26581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApduManager.this.pullFirstApduBatch(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$pullNextApduBatch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {0}, l = {SportReportBaseParser.ReportType.avgFreq}, m = "pullNextApduBatch", n = {"this"}, s = {"L$0"})
    public static final class C26591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C26591(Continuation<? super C26591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApduManager.this.pullNextApduBatch(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.apdu.ApduManager$startAction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.apdu.ApduManager", f = "ApduManager.kt", i = {}, l = {36}, m = "startAction", n = {}, s = {})
    public static final class C26601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26601(Continuation<? super C26601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApduManager.this.startAction(0, null, this);
        }
    }

    private ApduManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.xiaomi.fitness.nfc.apdu.ApduManager] */
    /* JADX WARN: Type inference failed for: r7v0, types: [l7] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.tsmclient.smartcard.terminal.IScTerminal] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final Object executeCapdu(l7 l7Var, CommandRequest commandRequest, Continuation<? super qrk> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        qrk qrkVar;
        Exception e;
        IScTerminal iScTerminal;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                qrk qrkVar2 = new qrk(0, "success");
                IScTerminal terminal = null;
                try {
                    CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null);
                    Intrinsics.checkNotNullExpressionValue(cardInfoMakeCardInfo, "makeCardInfo(...)");
                    terminal = cardInfoMakeCardInfo.getTerminal();
                    terminal.open();
                    Intrinsics.checkNotNull(terminal);
                    anonymousClass1.L$0 = qrkVar2;
                    anonymousClass1.L$1 = terminal;
                    anonymousClass1.label = 1;
                    Object objInternalExecuteCapdu = internalExecuteCapdu(l7Var, terminal, commandRequest, anonymousClass1);
                    if (objInternalExecuteCapdu == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    qrkVar = qrkVar2;
                    obj = objInternalExecuteCapdu;
                    iScTerminal = terminal;
                } catch (Exception e2) {
                    qrkVar = qrkVar2;
                    e = e2;
                    iScTerminal = terminal;
                    vqg.c("ApduManager executeCapdu error", e);
                    qrkVar.b(-1);
                    qrkVar.c("设置自定义的code对应的msg");
                    if (iScTerminal != null) {
                        iScTerminal.close();
                    }
                    return qrkVar;
                } catch (Throwable th) {
                    th = th;
                    l7Var = terminal;
                    if (l7Var != 0) {
                        l7Var.close();
                    }
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iScTerminal = (IScTerminal) anonymousClass1.L$1;
                qrkVar = (qrk) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e3) {
                    e = e3;
                    vqg.c("ApduManager executeCapdu error", e);
                    qrkVar.b(-1);
                    qrkVar.c("设置自定义的code对应的msg");
                    if (iScTerminal != null) {
                        iScTerminal.close();
                    }
                    return qrkVar;
                }
            }
            qrk qrkVar3 = (qrk) obj;
            if (iScTerminal == null) {
                return qrkVar3;
            }
            iScTerminal.close();
            return qrkVar3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final BaseResponse executeSeiApdu(int type, String logicalNo) throws JSONException {
        if (type == 0) {
            String strGeneraterJson = generaterJson(logicalNo);
            vqg.d("ApduManager executeSeiApdu issue json:" + strGeneraterJson);
            BaseResponse baseResponseInvoke = new EasyCardService().invoke("OUT_INSTALL", strGeneraterJson);
            vqg.d("ApduManager executeSeiApdu issue code:" + baseResponseInvoke.mResultCode + " msg:" + baseResponseInvoke.mMsg);
            Intrinsics.checkNotNull(baseResponseInvoke);
            return baseResponseInvoke;
        }
        if (type != 1) {
            throw new IllegalStateException("ApduManager executeSeiApdu IllegalStateException type:" + type);
        }
        String strGeneraterJson$default = generaterJson$default(this, null, 1, null);
        vqg.d("ApduManager executeSeiApdu delete json:" + strGeneraterJson$default);
        BaseResponse baseResponseInvoke2 = new EasyCardService().invoke("DELETE", strGeneraterJson$default);
        vqg.d("ApduManager executeSeiApdu delete code:" + baseResponseInvoke2.mResultCode + " msg:" + baseResponseInvoke2.mMsg);
        Intrinsics.checkNotNull(baseResponseInvoke2);
        return baseResponseInvoke2;
    }

    public static /* synthetic */ BaseResponse executeSeiApdu$default(ApduManager apduManager, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return apduManager.executeSeiApdu(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object executeSpApdu(CommandRequest commandRequest, Continuation<? super qrk> continuation) throws Throwable {
        C26551 c26551;
        ApduManager apduManager;
        if (continuation instanceof C26551) {
            c26551 = (C26551) continuation;
            int i = c26551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26551.label = i - Integer.MIN_VALUE;
            } else {
                c26551 = new C26551(continuation);
            }
        } else {
            c26551 = new C26551(continuation);
        }
        Object objPullFirstApduBatch = c26551.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26551.label;
        if (i2 != 0) {
            if (i2 == 1) {
                commandRequest = (CommandRequest) c26551.L$1;
                apduManager = (ApduManager) c26551.L$0;
                ResultKt.throwOnFailure(objPullFirstApduBatch);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullFirstApduBatch);
            }
        }
        ResultKt.throwOnFailure(objPullFirstApduBatch);
        c26551.L$0 = this;
        c26551.L$1 = commandRequest;
        c26551.label = 1;
        objPullFirstApduBatch = pullFirstApduBatch(commandRequest, c26551);
        if (objPullFirstApduBatch == coroutine_suspended) {
            return coroutine_suspended;
        }
        apduManager = this;
        l7 l7Var = (l7) objPullFirstApduBatch;
        if (l7Var.b()) {
            return new qrk(0, "success");
        }
        if (l7Var.a()) {
            c26551.L$0 = null;
            c26551.L$1 = null;
            c26551.label = 2;
            objPullFirstApduBatch = apduManager.executeCapdu(l7Var, commandRequest, c26551);
            return objPullFirstApduBatch == coroutine_suspended ? coroutine_suspended : objPullFirstApduBatch;
        }
        vqg.b("ApduManager executeSpApdu error command.stepStatus:" + l7Var.f24727a);
        return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
    }

    private final String generaterJson(String logicalNo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("card_name", "TAIWAN_YYK");
        jSONObject.put("business_id", UUID.randomUUID());
        if (logicalNo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uid", logicalNo);
            jSONObject.put("personalized_install_param", jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("aid", "A000000322100701");
        jSONObject3.put("oversea", true);
        jSONObject3.put(IssuerActivity.KEY_SOURCE_CHANNEL, "xiaomiwear");
        jSONObject3.put("extra", jSONObject.toString());
        String string = jSONObject3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String generaterJson$default(ApduManager apduManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return apduManager.generaterJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object internalExecuteCapdu(l7 l7Var, IScTerminal iScTerminal, CommandRequest commandRequest, Continuation<? super qrk> continuation) throws InterruptedException, IOException {
        C26561 c26561;
        ApduManager apduManager;
        if (continuation instanceof C26561) {
            c26561 = (C26561) continuation;
            int i = c26561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26561.label = i - Integer.MIN_VALUE;
            } else {
                c26561 = new C26561(continuation);
            }
        } else {
            c26561 = new C26561(continuation);
        }
        Object objPullNextApduBatch = c26561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26561.label;
        if (i2 != 0) {
            if (i2 == 1) {
                commandRequest = (CommandRequest) c26561.L$3;
                iScTerminal = (IScTerminal) c26561.L$2;
                l7Var = (l7) c26561.L$1;
                apduManager = (ApduManager) c26561.L$0;
                ResultKt.throwOnFailure(objPullNextApduBatch);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullNextApduBatch);
            }
        }
        ResultKt.throwOnFailure(objPullNextApduBatch);
        ArrayList<String> arrayListExecuteCapdu = executeCapdu(l7Var, iScTerminal);
        c26561.L$0 = this;
        c26561.L$1 = l7Var;
        c26561.L$2 = iScTerminal;
        c26561.L$3 = commandRequest;
        c26561.label = 1;
        objPullNextApduBatch = pullNextApduBatch(arrayListExecuteCapdu, commandRequest, c26561);
        if (objPullNextApduBatch == coroutine_suspended) {
            return coroutine_suspended;
        }
        apduManager = this;
        l7 l7Var2 = (l7) objPullNextApduBatch;
        if (l7Var2.a()) {
            c26561.L$0 = null;
            c26561.L$1 = null;
            c26561.L$2 = null;
            c26561.L$3 = null;
            c26561.label = 2;
            objPullNextApduBatch = apduManager.internalExecuteCapdu(l7Var, iScTerminal, commandRequest, c26561);
            return objPullNextApduBatch == coroutine_suspended ? coroutine_suspended : objPullNextApduBatch;
        }
        if (l7Var2.b()) {
            return new qrk(0, "success");
        }
        vqg.b("ApduManager internalExecuteCapdu command.stepStatus:" + l7Var2.f24727a);
        return new qrk(-1, "internalExecuteCapdu command.stepStatus:" + l7Var2.f24727a);
    }

    private final l7 parserCommand(EasyCardResponse<PullCommandResponse> easyCardResponse) throws NfcException {
        if (!NfcUtils.isYoYoApiSuccess(easyCardResponse.getRespCode())) {
            throw new NfcException(ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
        }
        PullCommandResponse respData = easyCardResponse.getRespData();
        l7 l7Var = new l7();
        l7Var.f24727a = respData.getStepStatus();
        l7Var.f24728b = respData.getCommands();
        return l7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullFirstApduBatch(CommandRequest commandRequest, Continuation<? super l7> continuation) throws NfcException {
        C26581 c26581;
        ApduManager apduManager;
        if (continuation instanceof C26581) {
            c26581 = (C26581) continuation;
            int i = c26581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26581.label = i - Integer.MIN_VALUE;
            } else {
                c26581 = new C26581(continuation);
            }
        } else {
            c26581 = new C26581(continuation);
        }
        Object objPullCommand = c26581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPullCommand);
            commandRequest.setAction_type("00");
            YoYoCardRequest yoYoCardRequest2 = yoYoCardRequest;
            c26581.L$0 = this;
            c26581.label = 1;
            objPullCommand = yoYoCardRequest2.pullCommand(commandRequest, c26581);
            if (objPullCommand == coroutine_suspended) {
                return coroutine_suspended;
            }
            apduManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apduManager = (ApduManager) c26581.L$0;
            ResultKt.throwOnFailure(objPullCommand);
        }
        return apduManager.parserCommand((EasyCardResponse) objPullCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullNextApduBatch(ArrayList<String> arrayList, CommandRequest commandRequest, Continuation<? super l7> continuation) throws NfcException {
        C26591 c26591;
        ApduManager apduManager;
        if (continuation instanceof C26591) {
            c26591 = (C26591) continuation;
            int i = c26591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26591.label = i - Integer.MIN_VALUE;
            } else {
                c26591 = new C26591(continuation);
            }
        } else {
            c26591 = new C26591(continuation);
        }
        Object objPullCommand = c26591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPullCommand);
            commandRequest.setAction_type("01");
            commandRequest.setResp_apdu(arrayList);
            YoYoCardRequest yoYoCardRequest2 = yoYoCardRequest;
            c26591.L$0 = this;
            c26591.label = 1;
            objPullCommand = yoYoCardRequest2.pullCommand(commandRequest, c26591);
            if (objPullCommand == coroutine_suspended) {
                return coroutine_suspended;
            }
            apduManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apduManager = (ApduManager) c26591.L$0;
            ResultKt.throwOnFailure(objPullCommand);
        }
        return apduManager.parserCommand((EasyCardResponse) objPullCommand);
    }

    @NotNull
    public final YoYoCardRequest getYoYoCardRequest() {
        return yoYoCardRequest;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x0177  */
    /* JADX WARN: Code duplicated, block: B:51:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:55:0x0191  */
    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x0238  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0191, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0238, please report this as an issue */
    @Nullable
    public final Object internalStartAction(int i, @NotNull CommandRequest commandRequest, @NotNull Continuation<? super qrk> continuation) throws Throwable {
        C26571 c26571;
        CommandRequest commandRequest2;
        ApduManager apduManager;
        CardInfoRequest cardInfoRequest;
        CardInfoResponse cardInfoResponse;
        BaseResponse baseResponseExecuteSeiApdu$default;
        ApduManager apduManager2;
        boolean zBooleanValue;
        CommandRequest commandRequest3;
        ApduManager apduManager3;
        boolean zBooleanValue2;
        if (continuation instanceof C26571) {
            c26571 = (C26571) continuation;
            int i2 = c26571.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26571.label = i2 - Integer.MIN_VALUE;
            } else {
                c26571 = new C26571(continuation);
            }
        } else {
            c26571 = new C26571(continuation);
        }
        Object objDisableCard = c26571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c26571.label;
        if (i3 != 0) {
            if (i3 == 1) {
                cardInfoRequest = (CardInfoRequest) c26571.L$2;
                commandRequest2 = (CommandRequest) c26571.L$1;
                apduManager = (ApduManager) c26571.L$0;
                ResultKt.throwOnFailure(objDisableCard);
                cardInfoResponse = (CardInfoResponse) objDisableCard;
                if (Intrinsics.areEqual(cardInfoResponse.getCardInfo().getCardStatus(), "01")) {
                    commandRequest2.setOrder_no(cardInfoResponse.getOrderNo());
                    commandRequest2.setFace_no(cardInfoResponse.getCardInfo().getFaceNo());
                    commandRequest2.setLogical_no(cardInfoResponse.getCardInfo().getLogicalNo());
                } else {
                    vqg.b("ApduManager start issue pre delete card");
                    baseResponseExecuteSeiApdu$default = executeSeiApdu$default(apduManager, 1, null, 2, null);
                    if (baseResponseExecuteSeiApdu$default.isSuccess()) {
                        vqg.b("ApduManager executeSeiApdu disableCard mResultCode:" + baseResponseExecuteSeiApdu$default.mResultCode + " mMsg:" + baseResponseExecuteSeiApdu$default.mMsg);
                        return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
                    }
                    YoYoCardRequest yoYoCardRequest2 = yoYoCardRequest;
                    c26571.L$0 = apduManager;
                    c26571.L$1 = commandRequest2;
                    c26571.L$2 = cardInfoRequest;
                    c26571.label = 2;
                    objDisableCard = yoYoCardRequest2.disableCard(cardInfoRequest, c26571);
                    if (objDisableCard == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apduManager2 = apduManager;
                    zBooleanValue = ((Boolean) objDisableCard).booleanValue();
                    if (!zBooleanValue) {
                        vqg.b("ApduManager executeSeiApdu disableCard issue respCode:" + zBooleanValue);
                        return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
                    }
                    YoYoCardRequest yoYoCardRequest3 = yoYoCardRequest;
                    c26571.L$0 = apduManager2;
                    c26571.L$1 = commandRequest2;
                    c26571.L$2 = null;
                    c26571.label = 3;
                    objDisableCard = yoYoCardRequest3.cardInfo(cardInfoRequest, c26571);
                    if (objDisableCard == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commandRequest3 = commandRequest2;
                    apduManager3 = apduManager2;
                    CardInfoResponse cardInfoResponse2 = (CardInfoResponse) objDisableCard;
                    commandRequest3.setOrder_no(cardInfoResponse2.getOrderNo());
                    commandRequest3.setFace_no(cardInfoResponse2.getCardInfo().getFaceNo());
                    commandRequest3.setLogical_no(cardInfoResponse2.getCardInfo().getLogicalNo());
                    vqg.b("ApduManager start issue pre delete end");
                    apduManager = apduManager3;
                    commandRequest2 = commandRequest3;
                }
            } else if (i3 == 2) {
                cardInfoRequest = (CardInfoRequest) c26571.L$2;
                commandRequest2 = (CommandRequest) c26571.L$1;
                apduManager2 = (ApduManager) c26571.L$0;
                ResultKt.throwOnFailure(objDisableCard);
                zBooleanValue = ((Boolean) objDisableCard).booleanValue();
                if (!zBooleanValue) {
                    vqg.b("ApduManager executeSeiApdu disableCard issue respCode:" + zBooleanValue);
                    return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
                }
                YoYoCardRequest yoYoCardRequest4 = yoYoCardRequest;
                c26571.L$0 = apduManager2;
                c26571.L$1 = commandRequest2;
                c26571.L$2 = null;
                c26571.label = 3;
                objDisableCard = yoYoCardRequest4.cardInfo(cardInfoRequest, c26571);
                if (objDisableCard == coroutine_suspended) {
                    return coroutine_suspended;
                }
                commandRequest3 = commandRequest2;
                apduManager3 = apduManager2;
                CardInfoResponse cardInfoResponse3 = (CardInfoResponse) objDisableCard;
                commandRequest3.setOrder_no(cardInfoResponse3.getOrderNo());
                commandRequest3.setFace_no(cardInfoResponse3.getCardInfo().getFaceNo());
                commandRequest3.setLogical_no(cardInfoResponse3.getCardInfo().getLogicalNo());
                vqg.b("ApduManager start issue pre delete end");
                apduManager = apduManager3;
                commandRequest2 = commandRequest3;
            } else if (i3 == 3) {
                commandRequest3 = (CommandRequest) c26571.L$1;
                apduManager3 = (ApduManager) c26571.L$0;
                ResultKt.throwOnFailure(objDisableCard);
                CardInfoResponse cardInfoResponse4 = (CardInfoResponse) objDisableCard;
                commandRequest3.setOrder_no(cardInfoResponse4.getOrderNo());
                commandRequest3.setFace_no(cardInfoResponse4.getCardInfo().getFaceNo());
                commandRequest3.setLogical_no(cardInfoResponse4.getCardInfo().getLogicalNo());
                vqg.b("ApduManager start issue pre delete end");
                apduManager = apduManager3;
                commandRequest2 = commandRequest3;
            } else {
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objDisableCard);
                    zBooleanValue2 = ((Boolean) objDisableCard).booleanValue();
                    if (!zBooleanValue2) {
                        return new qrk(0, "delete success");
                    }
                    vqg.b("ApduManager executeSeiApdu disableCard issue respCode:" + zBooleanValue2);
                    return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
                }
                ResultKt.throwOnFailure(objDisableCard);
            }
        }
        ResultKt.throwOnFailure(objDisableCard);
        CardInfoRequest cardInfoRequest2 = new CardInfoRequest(commandRequest.getCplc(), commandRequest.getDevice_id(), commandRequest.getDevice_model());
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("startAction Unrecognized service_operation:" + commandRequest.getService_operation());
            }
            BaseResponse baseResponseExecuteSeiApdu$default2 = executeSeiApdu$default(this, 1, null, 2, null);
            if (!baseResponseExecuteSeiApdu$default2.isSuccess()) {
                vqg.b("ApduManager executeSeiApdu disableCard mResultCode:" + baseResponseExecuteSeiApdu$default2.mResultCode + " mMsg:" + baseResponseExecuteSeiApdu$default2.mMsg);
                return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
            }
            YoYoCardRequest yoYoCardRequest5 = yoYoCardRequest;
            c26571.label = 5;
            objDisableCard = yoYoCardRequest5.disableCard(cardInfoRequest2, c26571);
            if (objDisableCard == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue2 = ((Boolean) objDisableCard).booleanValue();
            if (!zBooleanValue2) {
                return new qrk(0, "delete success");
            }
            vqg.b("ApduManager executeSeiApdu disableCard issue respCode:" + zBooleanValue2);
            return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
        }
        YoYoCardRequest yoYoCardRequest6 = yoYoCardRequest;
        c26571.L$0 = this;
        commandRequest2 = commandRequest;
        c26571.L$1 = commandRequest2;
        c26571.L$2 = cardInfoRequest2;
        c26571.label = 1;
        Object objCardInfo = yoYoCardRequest6.cardInfo(cardInfoRequest2, c26571);
        if (objCardInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        apduManager = this;
        objDisableCard = objCardInfo;
        cardInfoRequest = cardInfoRequest2;
        cardInfoResponse = (CardInfoResponse) objDisableCard;
        if (Intrinsics.areEqual(cardInfoResponse.getCardInfo().getCardStatus(), "01")) {
            commandRequest2.setOrder_no(cardInfoResponse.getOrderNo());
            commandRequest2.setFace_no(cardInfoResponse.getCardInfo().getFaceNo());
            commandRequest2.setLogical_no(cardInfoResponse.getCardInfo().getLogicalNo());
        } else {
            vqg.b("ApduManager start issue pre delete card");
            baseResponseExecuteSeiApdu$default = executeSeiApdu$default(apduManager, 1, null, 2, null);
            if (baseResponseExecuteSeiApdu$default.isSuccess()) {
                vqg.b("ApduManager executeSeiApdu disableCard mResultCode:" + baseResponseExecuteSeiApdu$default.mResultCode + " mMsg:" + baseResponseExecuteSeiApdu$default.mMsg);
                return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
            }
            YoYoCardRequest yoYoCardRequest7 = yoYoCardRequest;
            c26571.L$0 = apduManager;
            c26571.L$1 = commandRequest2;
            c26571.L$2 = cardInfoRequest;
            c26571.label = 2;
            objDisableCard = yoYoCardRequest7.disableCard(cardInfoRequest, c26571);
            if (objDisableCard == coroutine_suspended) {
                return coroutine_suspended;
            }
            apduManager2 = apduManager;
            zBooleanValue = ((Boolean) objDisableCard).booleanValue();
            if (!zBooleanValue) {
                vqg.b("ApduManager executeSeiApdu disableCard issue respCode:" + zBooleanValue);
                return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
            }
            YoYoCardRequest yoYoCardRequest8 = yoYoCardRequest;
            c26571.L$0 = apduManager2;
            c26571.L$1 = commandRequest2;
            c26571.L$2 = null;
            c26571.label = 3;
            objDisableCard = yoYoCardRequest8.cardInfo(cardInfoRequest, c26571);
            if (objDisableCard == coroutine_suspended) {
                return coroutine_suspended;
            }
            commandRequest3 = commandRequest2;
            apduManager3 = apduManager2;
            CardInfoResponse cardInfoResponse5 = (CardInfoResponse) objDisableCard;
            commandRequest3.setOrder_no(cardInfoResponse5.getOrderNo());
            commandRequest3.setFace_no(cardInfoResponse5.getCardInfo().getFaceNo());
            commandRequest3.setLogical_no(cardInfoResponse5.getCardInfo().getLogicalNo());
            vqg.b("ApduManager start issue pre delete end");
            apduManager = apduManager3;
            commandRequest2 = commandRequest3;
        }
        vqg.d("ApduManager start issue");
        BaseResponse baseResponseExecuteSeiApdu = apduManager.executeSeiApdu(0, commandRequest2.getLogical_no());
        if (baseResponseExecuteSeiApdu.isSuccess()) {
            c26571.L$0 = null;
            c26571.L$1 = null;
            c26571.L$2 = null;
            c26571.label = 4;
            objDisableCard = apduManager.executeSpApdu(commandRequest2, c26571);
            return objDisableCard == coroutine_suspended ? coroutine_suspended : objDisableCard;
        }
        vqg.b("ApduManager executeSeiApdu issue mResultCode:" + baseResponseExecuteSeiApdu.mResultCode + " mMsg:" + baseResponseExecuteSeiApdu.mMsg);
        return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object startAction(int i, @NotNull CommandRequest commandRequest, @NotNull Continuation<? super qrk> continuation) throws Throwable {
        C26601 c26601;
        if (continuation instanceof C26601) {
            c26601 = (C26601) continuation;
            int i2 = c26601.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26601.label = i2 - Integer.MIN_VALUE;
            } else {
                c26601 = new C26601(continuation);
            }
        } else {
            c26601 = new C26601(continuation);
        }
        Object objInternalStartAction = c26601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c26601.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInternalStartAction);
                c26601.label = 1;
                objInternalStartAction = internalStartAction(i, commandRequest, c26601);
                if (objInternalStartAction == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInternalStartAction);
            }
            return objInternalStartAction;
        } catch (Exception e) {
            vqg.c("ApduManager startAction", e);
            return new qrk(-1, ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
        }
    }

    private final ArrayList<String> executeCapdu(l7 apduCommand, IScTerminal terminal) throws InterruptedException, IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        for (String str : apduCommand.f24728b) {
            i++;
            vqg.b("ApduManager executeCapdu capdu index:" + i + " count:" + str.length() + " " + str + " ");
            ScResponse scResponseTransmit = terminal.transmit(Coder.hexStringToBytes(str));
            Intrinsics.checkNotNullExpressionValue(scResponseTransmit, "transmit(...)");
            Pattern patternCompile = Pattern.compile("^9000$");
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            String strBytesToHexString = Coder.bytesToHexString(scResponseTransmit.getStatus().toBytes());
            Matcher matcher = patternCompile.matcher(strBytesToHexString);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            vqg.b("ApduManager executeCapdu  response:" + strBytesToHexString);
            if (matcher.matches()) {
                arrayList.add(strBytesToHexString);
            } else {
                vqg.b("ApduManager executeCapdu 9000 not match " + strBytesToHexString + " index:" + i);
                throw new NfcException(ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
            }
        }
        return arrayList;
    }
}
