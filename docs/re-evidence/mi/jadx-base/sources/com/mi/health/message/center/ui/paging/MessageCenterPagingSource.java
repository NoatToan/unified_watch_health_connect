package com.mi.health.message.center.ui.paging;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.google.gson.Gson;
import com.mi.health.message.center.entity.ExtraData;
import com.mi.health.message.center.entity.GetMsgListResult;
import com.mi.health.message.center.entity.MessageData;
import com.mi.health.message.center.net.MessageCenterRequest;
import com.mi.health.message.center.pref.MessageCenterPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u001a*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0003:\u0001\u001aB%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0010H\u0016J.\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0096@¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u00020\u0017\"\b\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mi/health/message/center/ui/paging/MessageCenterPagingSource;", "T", "Lcom/mi/health/message/center/entity/ExtraData;", "Landroidx/paging/PagingSource;", "", "Lcom/mi/health/message/center/entity/MessageData;", RnReportConst.ApiReport.PARAM_MODULE, "", "request", "Lcom/mi/health/message/center/net/MessageCenterRequest;", "clazz", "Ljava/lang/Class;", "<init>", "(ILcom/mi/health/message/center/net/MessageCenterRequest;Ljava/lang/Class;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonExtraDataByType", "", "messageList", "", "Companion", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageCenterPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterPagingSource.kt\ncom/mi/health/message/center/ui/paging/MessageCenterPagingSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1863#2,2:69\n*S KotlinDebug\n*F\n+ 1 MessageCenterPagingSource.kt\ncom/mi/health/message/center/ui/paging/MessageCenterPagingSource\n*L\n61#1:69,2\n*E\n"})
public final class MessageCenterPagingSource<T extends ExtraData> extends PagingSource<String, MessageData<T>> {

    @NotNull
    public static final String TAG = "MessageCenterPagingSource";

    @NotNull
    private final Class<T> clazz;
    private final int module;

    @NotNull
    private final MessageCenterRequest request;

    /* JADX INFO: renamed from: com.mi.health.message.center.ui.paging.MessageCenterPagingSource$load$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.message.center.ui.paging.MessageCenterPagingSource", f = "MessageCenterPagingSource.kt", i = {0, 0}, l = {33}, m = "load", n = {"this", "params"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MessageCenterPagingSource<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessageCenterPagingSource<T> messageCenterPagingSource, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = messageCenterPagingSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.load(null, this);
        }
    }

    public MessageCenterPagingSource(int i, @NotNull MessageCenterRequest request, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.module = i;
        this.request = request;
        this.clazz = clazz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ExtraData> void jsonExtraDataByType(List<MessageData<T>> messageList) {
        Iterator<T> it = messageList.iterator();
        while (it.hasNext()) {
            MessageData messageData = (MessageData) it.next();
            String extraData = messageData.getExtraData();
            if (extraData != null) {
                messageData.setExtraEntity((ExtraData) new Gson().fromJson(extraData, (Type) this.clazz));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull PagingSource.LoadParams<String> loadParams, @NotNull Continuation<? super PagingSource.LoadResult<String, MessageData<T>>> continuation) {
        AnonymousClass1 anonymousClass1;
        MessageCenterPagingSource<T> messageCenterPagingSource;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object msgList$default = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(msgList$default);
                Logger.i(TAG, "load params " + ((Object) loadParams.getKey()) + " is append " + (loadParams instanceof PagingSource.LoadParams.Append));
                MessageCenterRequest messageCenterRequest = this.request;
                int i3 = this.module;
                String str = loadParams instanceof PagingSource.LoadParams.Append ? (String) ((PagingSource.LoadParams.Append) loadParams).getKey() : null;
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = loadParams;
                anonymousClass2.label = 1;
                msgList$default = MessageCenterRequest.getMsgList$default(messageCenterRequest, i3, str, 0, anonymousClass2, 4, null);
                if (msgList$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                messageCenterPagingSource = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                loadParams = (PagingSource.LoadParams) anonymousClass2.L$1;
                messageCenterPagingSource = (MessageCenterPagingSource) anonymousClass2.L$0;
                ResultKt.throwOnFailure(msgList$default);
            }
            GetMsgListResult getMsgListResult = (GetMsgListResult) msgList$default;
            List<MessageData<T>> messageList = getMsgListResult.getMessageList();
            if (messageList == null) {
                messageList = CollectionsKt__CollectionsKt.emptyList();
            }
            boolean zIsEmpty = messageList.isEmpty();
            if (loadParams.getKey() == null && !zIsEmpty) {
                MessageCenterPreference messageCenterPreference = MessageCenterPreference.INSTANCE;
                messageCenterPreference.setLATEST_PRE_MESSAGE_TIME(messageCenterPreference.getMsgLatestTime());
                messageCenterPreference.updateMsgLatestTime(System.currentTimeMillis() / ((long) 1000));
            }
            messageCenterPagingSource.jsonExtraDataByType(messageList);
            Logger.i(TAG, "msgListResult size " + messageList.size() + " result " + getMsgListResult);
            String nextKey = getMsgListResult.getNextKey();
            return new PagingSource.LoadResult.Page(messageList, null, (nextKey == null || StringsKt__StringsKt.isBlank(nextKey)) ? null : getMsgListResult.getNextKey());
        } catch (Exception e) {
            Logger.e(TAG, "source load exception " + e);
            return Intrinsics.areEqual(e, ApiException.INSTANCE.getEMPTY()) ? new PagingSource.LoadResult.Page(CollectionsKt__CollectionsKt.emptyList(), null, null) : new PagingSource.LoadResult.Error(e);
        }
    }

    @Override // androidx.paging.PagingSource
    @Nullable
    public String getRefreshKey(@NotNull PagingState<String, MessageData<T>> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Logger.i(TAG, "getRefreshKey state " + state);
        return null;
    }
}
