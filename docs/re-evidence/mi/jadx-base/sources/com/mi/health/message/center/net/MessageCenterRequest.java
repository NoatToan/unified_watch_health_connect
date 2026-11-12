package com.mi.health.message.center.net;

import com.mi.health.message.center.entity.ExtraData;
import com.mi.health.message.center.entity.GetMsgListResult;
import com.mi.health.message.center.entity.NewMsgItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import dagger.hilt.android.EntryPointAccessors;
import java.util.LinkedHashMap;
import java.util.List;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/mi/health/message/center/net/MessageCenterRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/health/message/center/net/MessageCenterApiService;", "<init>", "()V", "getMsgList", "Lcom/mi/health/message/center/entity/GetMsgListResult;", "T", "Lcom/mi/health/message/center/entity/ExtraData;", RnReportConst.ApiReport.PARAM_MODULE, "", "nextKey", "", "count", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNewMsg", "", "Lcom/mi/health/message/center/entity/NewMsgItem;", "moduleArray", "", "beginTimeSecond", "", "([IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageCenterRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterRequest.kt\ncom/mi/health/message/center/net/MessageCenterRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,55:1\n141#2:56\n141#2:60\n31#3:57\n28#3,2:58\n31#3:61\n28#3,2:62\n*S KotlinDebug\n*F\n+ 1 MessageCenterRequest.kt\ncom/mi/health/message/center/net/MessageCenterRequest\n*L\n38#1:56\n52#1:60\n38#1:57\n38#1:58,2\n52#1:61\n52#1:62,2\n*E\n"})
public final class MessageCenterRequest extends BaseRequest<MessageCenterApiService> {

    @NotNull
    public static final String TAG = "MessageCenterRequest";

    /* JADX INFO: renamed from: com.mi.health.message.center.net.MessageCenterRequest$checkNewMsg$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.message.center.net.MessageCenterRequest", f = "MessageCenterRequest.kt", i = {}, l = {52}, m = "checkNewMsg", n = {}, s = {})
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
            return MessageCenterRequest.this.checkNewMsg(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.message.center.net.MessageCenterRequest$getMsgList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.message.center.net.MessageCenterRequest", f = "MessageCenterRequest.kt", i = {}, l = {38}, m = "getMsgList", n = {}, s = {})
    public static final class C14771<T extends ExtraData> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14771(Continuation<? super C14771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageCenterRequest.this.getMsgList(0, null, 0, this);
        }
    }

    public static /* synthetic */ Object getMsgList$default(MessageCenterRequest messageCenterRequest, int i, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 30;
        }
        return messageCenterRequest.getMsgList(i, str, i2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object checkNewMsg(@NotNull int[] iArr, long j, @NotNull Continuation<? super List<NewMsgItem>> continuation) {
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
        Object objCheckNewMsg = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckNewMsg);
            Logger.i(TAG, "checkNewMsg moduleArray:" + iArr + ",beginTimeSecond:" + j);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(RnReportConst.ApiReport.PARAM_MODULE, iArr);
            linkedHashMap.put("begin_time", Boxing.boxLong(j));
            MessageCenterApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass1.label = 1;
            objCheckNewMsg = mService.checkNewMsg(json, anonymousClass1);
            if (objCheckNewMsg == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCheckNewMsg);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCheckNewMsg);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final <T extends ExtraData> Object getMsgList(int i, @Nullable String str, int i2, @NotNull Continuation<? super GetMsgListResult<T>> continuation) {
        C14771 c14771;
        if (continuation instanceof C14771) {
            c14771 = (C14771) continuation;
            int i3 = c14771.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c14771.label = i3 - Integer.MIN_VALUE;
            } else {
                c14771 = new C14771(continuation);
            }
        } else {
            c14771 = new C14771(continuation);
        }
        Object msgList = c14771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c14771.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(msgList);
            Logger.i(TAG, "getMsgList module:" + i + ",nextKey:" + str + ",count:" + i2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(RnReportConst.ApiReport.PARAM_MODULE, Boxing.boxInt(i));
            if (str != null) {
                linkedHashMap.put(RouteRequest.KEY_NEXT_KEY, str);
            }
            linkedHashMap.put("limit", Boxing.boxInt(i2));
            MessageCenterApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14771.label = 1;
            msgList = mService.getMsgList(json, c14771);
            if (msgList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(msgList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(msgList);
    }
}
