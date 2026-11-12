package com.mi.health.message.center.export;

import android.content.Context;
import android.content.Intent;
import com.mi.health.message.center.entity.NewMsgItem;
import com.mi.health.message.center.net.MessageCenterRequest;
import com.mi.health.message.center.pref.MessageCenterPreference;
import com.mi.health.message.center.ui.MessageCenterActivity;
import com.xiaomi.fitness.common.log.Logger;
import commi.health.message.center.export.IMessageCenter;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mi/health/message/center/export/MessageCenterImpl;", "Lcommi/health/message/center/export/IMessageCenter;", "messageCenterRequest", "Lcom/mi/health/message/center/net/MessageCenterRequest;", "<init>", "(Lcom/mi/health/message/center/net/MessageCenterRequest;)V", "gotoMessageCenterActivity", "", "context", "Landroid/content/Context;", "showNewMsgDotEnable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageCenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterImpl.kt\ncom/mi/health/message/center/export/MessageCenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1863#2,2:53\n*S KotlinDebug\n*F\n+ 1 MessageCenterImpl.kt\ncom/mi/health/message/center/export/MessageCenterImpl\n*L\n38#1:53,2\n*E\n"})
public final class MessageCenterImpl implements IMessageCenter {

    @NotNull
    public static final String TAG = "MessageCenterImpl";

    @NotNull
    private final MessageCenterRequest messageCenterRequest;

    /* JADX INFO: renamed from: com.mi.health.message.center.export.MessageCenterImpl$showNewMsgDotEnable$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.message.center.export.MessageCenterImpl", f = "MessageCenterImpl.kt", i = {}, l = {30}, m = "showNewMsgDotEnable", n = {}, s = {})
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
            return MessageCenterImpl.this.showNewMsgDotEnable(this);
        }
    }

    public MessageCenterImpl(@NotNull MessageCenterRequest messageCenterRequest) {
        Intrinsics.checkNotNullParameter(messageCenterRequest, "messageCenterRequest");
        this.messageCenterRequest = messageCenterRequest;
    }

    @Override // commi.health.message.center.export.IMessageCenter
    public void gotoMessageCenterActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) MessageCenterActivity.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // commi.health.message.center.export.IMessageCenter
    @Nullable
    public Object showNewMsgDotEnable(@NotNull Continuation<? super Boolean> continuation) {
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
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckNewMsg);
                long msgLatestTime = MessageCenterPreference.INSTANCE.getMsgLatestTime();
                anonymousClass1.label = 1;
                objCheckNewMsg = this.messageCenterRequest.checkNewMsg(new int[]{1}, msgLatestTime, anonymousClass1);
                if (objCheckNewMsg == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckNewMsg);
            }
            List list = (List) objCheckNewMsg;
            Logger.i(TAG, "checkNewMsg request result " + list);
            if (list.isEmpty()) {
                return Boxing.boxBoolean(false);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((NewMsgItem) it.next()).getHasNew()) {
                    return Boxing.boxBoolean(true);
                }
            }
            return Boxing.boxBoolean(false);
        } catch (Exception e) {
            Logger.e(TAG, "checkNewMsg exception " + e);
        }
    }
}
