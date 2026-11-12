package com.xiaomi.wearable;

import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.util.SparseBooleanArray;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.sdk.ILFEventCallback;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.HuamiDataWrapperKt;
import com.xiaomi.wearable.hm.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0014J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u0010\u0014R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/xiaomi/wearable/LFEventCallbackImpl;", "Lcom/xiaomi/hm/health/bt/sdk/ILFEventCallback;", "Lcom/xiaomi/wearable/hm/s;", "callback", "", "addLFEventCallback", "(Lcom/xiaomi/wearable/hm/s;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "p0", "onAlarmChange", "(Ljava/util/ArrayList;)V", "Landroid/util/SparseBooleanArray;", "onSettingsChange", "(Landroid/util/SparseBooleanArray;)V", "", "var1", "onSportStart", "(Z)V", "onSportStop", "()V", "endCall", "ignoreCall", "phoneMuteMode", "phoneNormalMode", "illegalBind", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "onReminderChange", "onFindPhone", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "onMusicControl", "(Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;)V", "onHrOpen", "", "onNotificationDelete", "(I)V", "onHrDetectionInterval", "phoneMuteState", "()Ljava/lang/Boolean;", "onAllDayPressureChange", "onAtrialFibChanged", "onAlarmDelay", "onAlarmCancel", "Landroid/content/Context;", "context", "isNotificationPolicyAccessGranted", "(Landroid/content/Context;)Z", CervicalMucusRecord.Appearance.CLEAR, "Landroid/os/RemoteCallbackList;", "mLFEventCallbacks", "Landroid/os/RemoteCallbackList;", "<init>", "huami_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n90#2,19:210\n90#2,19:229\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl\n*L\n36#1:191,19\n166#1:210,19\n172#1:229,19\n*E\n"})
public final class LFEventCallbackImpl implements ILFEventCallback {

    @NotNull
    private final RemoteCallbackList<s> mLFEventCallbacks = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$endCall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$endCall$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$endCall$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$endCall$1\n*L\n67#1:191,19\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).endCall();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$ignoreCall$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$ignoreCall$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$ignoreCall$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$ignoreCall$1\n*L\n75#1:191,19\n*E\n"})
    public static final class C34611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34611(Continuation<? super C34611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34611(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).ignoreCall();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$illegalBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$illegalBind$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$illegalBind$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$illegalBind$1\n*L\n99#1:191,19\n*E\n"})
    public static final class C34621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34621(Continuation<? super C34621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34621(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).illegalBind();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onFindPhone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onFindPhone$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onFindPhone$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onFindPhone$1\n*L\n116#1:191,19\n*E\n"})
    public static final class C34631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $var1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34631(boolean z, Continuation<? super C34631> continuation) {
            super(2, continuation);
            this.$var1 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34631(this.$var1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            boolean z = this.$var1;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onFindPhone(z);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onHrOpen$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onHrOpen$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onHrOpen$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onHrOpen$1\n*L\n133#1:191,19\n*E\n"})
    public static final class C34641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34641(Continuation<? super C34641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34641(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onHrOpen();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onMusicControl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onMusicControl$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onMusicControl$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onMusicControl$1\n*L\n125#1:191,19\n*E\n"})
    public static final class C34651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HMMusicControl.DeviceCommand $p0;
        int label;
        final /* synthetic */ LFEventCallbackImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34651(HMMusicControl.DeviceCommand deviceCommand, LFEventCallbackImpl lFEventCallbackImpl, Continuation<? super C34651> continuation) {
            super(2, continuation);
            this.$p0 = deviceCommand;
            this.this$0 = lFEventCallbackImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34651(this.$p0, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiDataWrapper huamiDataWrapperWrap = HuamiDataWrapperKt.wrap(this.$p0);
            RemoteCallbackList remoteCallbackList = this.this$0.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onMusicControlInternal(huamiDataWrapperWrap);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred when finishBroadcast", e2);
                    }
                } catch (Exception e3) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                    remoteCallbackList.finishBroadcast();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e4) {
                    Logger.e("An exception occurred when finishBroadcast", e4);
                }
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onNotificationDelete$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onNotificationDelete$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onNotificationDelete$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onNotificationDelete$1\n*L\n141#1:191,19\n*E\n"})
    public static final class C34661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $var1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34661(int i, Continuation<? super C34661> continuation) {
            super(2, continuation);
            this.$var1 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34661(this.$var1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            int i = this.$var1;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i2);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onNotificationDelete(i);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i2) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onReminderChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onReminderChange$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onReminderChange$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onReminderChange$1\n*L\n108#1:191,19\n*E\n"})
    public static final class C34671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<HMReminderInfo> $p0;
        int label;
        final /* synthetic */ LFEventCallbackImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34671(ArrayList<HMReminderInfo> arrayList, LFEventCallbackImpl lFEventCallbackImpl, Continuation<? super C34671> continuation) {
            super(2, continuation);
            this.$p0 = arrayList;
            this.this$0 = lFEventCallbackImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34671(this.$p0, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList<HMReminderInfo> arrayList = this.$p0;
            List<HuamiDataWrapper> listWrapList = HuamiDataWrapperKt.wrapList(arrayList != null ? CollectionsKt___CollectionsKt.toList(arrayList) : null);
            RemoteCallbackList remoteCallbackList = this.this$0.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onReminderChangeInternal(listWrapList);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred when finishBroadcast", e2);
                    }
                } catch (Exception e3) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                    remoteCallbackList.finishBroadcast();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e4) {
                    Logger.e("An exception occurred when finishBroadcast", e4);
                }
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onSettingsChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onSettingsChange$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onSettingsChange$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onSettingsChange$1\n*L\n43#1:191,19\n*E\n"})
    public static final class C34681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SparseBooleanArray $p0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34681(SparseBooleanArray sparseBooleanArray, Continuation<? super C34681> continuation) {
            super(2, continuation);
            this.$p0 = sparseBooleanArray;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34681(this.$p0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            SparseBooleanArray sparseBooleanArray = this.$p0;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onSettingsChange(sparseBooleanArray == null);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Throwable th) {
                        try {
                            remoteCallbackList.finishBroadcast();
                        } catch (Exception e2) {
                            Logger.e("An exception occurred when finishBroadcast", e2);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onSportStart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onSportStart$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onSportStart$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onSportStart$1\n*L\n51#1:191,19\n*E\n"})
    public static final class C34691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $var1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34691(boolean z, Continuation<? super C34691> continuation) {
            super(2, continuation);
            this.$var1 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34691(this.$var1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            boolean z = this.$var1;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onSportStart(z);
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$onSportStop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$onSportStop$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onSportStop$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$onSportStop$1\n*L\n59#1:191,19\n*E\n"})
    public static final class C34701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34701(Continuation<? super C34701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34701(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).onSportStop();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$phoneMuteMode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$phoneMuteMode$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$phoneMuteMode$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$phoneMuteMode$1\n*L\n83#1:191,19\n*E\n"})
    public static final class C34711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34711(Continuation<? super C34711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34711(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).phoneMuteMode();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.LFEventCallbackImpl$phoneNormalMode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.LFEventCallbackImpl$phoneNormalMode$1", f = "LFEventCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLFEventCallbackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$phoneNormalMode$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,190:1\n90#2,19:191\n*S KotlinDebug\n*F\n+ 1 LFEventCallbackImpl.kt\ncom/xiaomi/wearable/LFEventCallbackImpl$phoneNormalMode$1\n*L\n91#1:191,19\n*E\n"})
    public static final class C34721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34721(Continuation<? super C34721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LFEventCallbackImpl.this.new C34721(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteCallbackList remoteCallbackList = LFEventCallbackImpl.this.mLFEventCallbacks;
            try {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                ((s) broadcastItem).phoneNormalMode();
                            } catch (Exception e) {
                                Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                            }
                        }
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                        remoteCallbackList.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred when finishBroadcast", e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void addLFEventCallback(@NotNull s callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mLFEventCallbacks.register(callback);
    }

    public final void clear() {
        this.mLFEventCallbacks.kill();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void endCall() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void ignoreCall() {
        AnyExtKt.main$default(null, new C34611(null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void illegalBind() {
        AnyExtKt.main$default(null, new C34621(null), 1, null);
    }

    public final boolean isNotificationPolicyAccessGranted(@Nullable Context context) {
        Object systemService = context != null ? context.getSystemService("notification") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).isNotificationPolicyAccessGranted();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onAlarmCancel() {
        RemoteCallbackList<s> remoteCallbackList = this.mLFEventCallbacks;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((s) broadcastItem).onAlarmCancel();
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onAlarmChange(@Nullable ArrayList<AlarmClockExt> p0) {
        List<HuamiDataWrapper> listWrapList = HuamiDataWrapperKt.wrapList(p0 != null ? CollectionsKt___CollectionsKt.toList(p0) : null);
        RemoteCallbackList<s> remoteCallbackList = this.mLFEventCallbacks;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((s) broadcastItem).onAlarmChangeInternal(listWrapList);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onAlarmDelay() {
        RemoteCallbackList<s> remoteCallbackList = this.mLFEventCallbacks;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((s) broadcastItem).onAlarmDelay();
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onAllDayPressureChange(boolean p0) {
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onAtrialFibChanged(boolean p0) {
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onFindPhone(boolean var1) {
        AnyExtKt.main$default(null, new C34631(var1, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onHrDetectionInterval(int p0) {
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onHrOpen() {
        AnyExtKt.main$default(null, new C34641(null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onMusicControl(@Nullable HMMusicControl.DeviceCommand p0) {
        AnyExtKt.main$default(null, new C34651(p0, this, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onNotificationDelete(int var1) {
        AnyExtKt.main$default(null, new C34661(var1, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onReminderChange(@Nullable ArrayList<HMReminderInfo> p0) {
        AnyExtKt.main$default(null, new C34671(p0, this, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onSettingsChange(@Nullable SparseBooleanArray p0) {
        AnyExtKt.main$default(null, new C34681(p0, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onSportStart(boolean var1) {
        AnyExtKt.main$default(null, new C34691(var1, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void onSportStop() {
        AnyExtKt.main$default(null, new C34701(null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void phoneMuteMode() {
        AnyExtKt.main$default(null, new C34711(null), 1, null);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    @Nullable
    public Boolean phoneMuteState() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (isNotificationPolicyAccessGranted(ApplicationExtKt.getApplication())) {
            return Boolean.valueOf(audioManager.getRingerMode() == 0);
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ILFEventCallback
    public void phoneNormalMode() {
        AnyExtKt.main$default(null, new C34721(null), 1, null);
    }
}
