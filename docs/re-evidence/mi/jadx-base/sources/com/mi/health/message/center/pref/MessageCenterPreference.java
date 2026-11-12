package com.mi.health.message.center.pref;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/mi/health/message/center/pref/MessageCenterPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "LATEST_MESSAGE_TIME", "getLATEST_MESSAGE_TIME", "()J", "setLATEST_MESSAGE_TIME", "(J)V", "LATEST_MESSAGE_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "LATEST_PRE_MESSAGE_TIME", "getLATEST_PRE_MESSAGE_TIME", "setLATEST_PRE_MESSAGE_TIME", "LATEST_PRE_MESSAGE_TIME$delegate", "updateMsgLatestTime", "", "secondTime", "getMsgLatestTime", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageCenterPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterPreference.kt\ncom/mi/health/message/center/pref/MessageCenterPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,30:1\n135#2,6:31\n135#2,6:37\n*S KotlinDebug\n*F\n+ 1 MessageCenterPreference.kt\ncom/mi/health/message/center/pref/MessageCenterPreference\n*L\n14#1:31,6\n16#1:37,6\n*E\n"})
public final class MessageCenterPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MessageCenterPreference.class, "LATEST_MESSAGE_TIME", "getLATEST_MESSAGE_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MessageCenterPreference.class, "LATEST_PRE_MESSAGE_TIME", "getLATEST_PRE_MESSAGE_TIME()J", 0))};

    @NotNull
    public static final MessageCenterPreference INSTANCE;

    /* JADX INFO: renamed from: LATEST_MESSAGE_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LATEST_MESSAGE_TIME;

    /* JADX INFO: renamed from: LATEST_PRE_MESSAGE_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LATEST_PRE_MESSAGE_TIME;

    @NotNull
    private static final String TAG = "MessageCenterPreference";

    /* JADX INFO: renamed from: com.mi.health.message.center.pref.MessageCenterPreference$updateMsgLatestTime$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.message.center.pref.MessageCenterPreference$updateMsgLatestTime$1", f = "MessageCenterPreference.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $secondTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$secondTime = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$secondTime, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i(MessageCenterPreference.TAG, "updateMsgLatestTime second " + this.$secondTime);
            MessageCenterPreference.INSTANCE.setLATEST_MESSAGE_TIME(this.$secondTime);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        MessageCenterPreference messageCenterPreference = new MessageCenterPreference();
        INSTANCE = messageCenterPreference;
        LATEST_MESSAGE_TIME = messageCenterPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.mi.health.message.center.pref.MessageCenterPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, false);
        LATEST_PRE_MESSAGE_TIME = messageCenterPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.mi.health.message.center.pref.MessageCenterPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
    }

    private MessageCenterPreference() {
    }

    private final long getLATEST_MESSAGE_TIME() {
        return ((Number) LATEST_MESSAGE_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLATEST_MESSAGE_TIME(long j) {
        LATEST_MESSAGE_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final long getLATEST_PRE_MESSAGE_TIME() {
        return ((Number) LATEST_PRE_MESSAGE_TIME.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getMsgLatestTime() {
        long latest_message_time = getLATEST_MESSAGE_TIME();
        Logger.i(TAG, "getMsgLatestTime second " + latest_message_time);
        return latest_message_time;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "message_center";
    }

    public final void setLATEST_PRE_MESSAGE_TIME(long j) {
        LATEST_PRE_MESSAGE_TIME.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void updateMsgLatestTime(long secondTime) {
        AnyExtKt.io$default(null, new AnonymousClass1(secondTime, null), 1, null);
    }
}
