package com.xiaomi.fitness.statistics;

import com.example.statistics.export.AccountType;
import com.example.statistics.export.BleLogUploadProgressListener;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackStatBean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.page.AutoTrackPageManager;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J)\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J4\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\u0011H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/statistics/OnetrackImpl;", "Lcom/example/statistics/export/IOnetrack;", "<init>", "()V", "mChangeListeners", "Ljava/util/HashSet;", "Lcom/example/statistics/export/BleLogUploadProgressListener;", "init", "", "reportData", "bean", "Lcom/example/statistics/export/OneTrackStatBean;", "args", "", "", "(Lcom/example/statistics/export/OneTrackStatBean;[Ljava/lang/Object;)V", i.d, "", "params", "", "setPrivacyExperienceAccepted", "accepted", "", "login", "userId", "accountType", "Lcom/example/statistics/export/AccountType;", "skipLoginEvent", TrackConstants.LOGOUT, "addListenerBleLogLoadProgress", "bleLogUploadProgressListener", "removeListenerBleLogLoadProgress", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "notifyListenerBleLogLoadProgressChanged", "success", "setCommonProperty", "getInstanceID", "getAutoPageTrackCurrentFragmentName", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnetrackImpl implements IOnetrack {

    @NotNull
    private final HashSet<BleLogUploadProgressListener> mChangeListeners = new HashSet<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.statistics.OnetrackImpl$addListenerBleLogLoadProgress$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.statistics.OnetrackImpl$addListenerBleLogLoadProgress$1", f = "OnetrackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BleLogUploadProgressListener $bleLogUploadProgressListener;
        int label;
        final /* synthetic */ OnetrackImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BleLogUploadProgressListener bleLogUploadProgressListener, OnetrackImpl onetrackImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bleLogUploadProgressListener = bleLogUploadProgressListener;
            this.this$0 = onetrackImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bleLogUploadProgressListener, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i("OnetrackImpl", "bleLogUploadProgressListener: " + this.$bleLogUploadProgressListener);
            this.this$0.mChangeListeners.add(this.$bleLogUploadProgressListener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.statistics.OnetrackImpl$notifyListenerBleLogLoadProgressChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.statistics.OnetrackImpl$notifyListenerBleLogLoadProgressChanged$1", f = "OnetrackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnetrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnetrackImpl.kt\ncom/xiaomi/fitness/statistics/OnetrackImpl$notifyListenerBleLogLoadProgressChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1863#2,2:83\n*S KotlinDebug\n*F\n+ 1 OnetrackImpl.kt\ncom/xiaomi/fitness/statistics/OnetrackImpl$notifyListenerBleLogLoadProgressChanged$1\n*L\n67#1:83,2\n*E\n"})
    public static final class C32211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32211(boolean z, Continuation<? super C32211> continuation) {
            super(2, continuation);
            this.$success = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnetrackImpl.this.new C32211(this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i("OnetrackImpl", "notifyUserGoalChanged: " + OnetrackImpl.this.mChangeListeners);
            HashSet hashSet = OnetrackImpl.this.mChangeListeners;
            boolean z = this.$success;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((BleLogUploadProgressListener) it.next()).uploadLogResult(z);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.statistics.OnetrackImpl$removeListenerBleLogLoadProgress$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.statistics.OnetrackImpl$removeListenerBleLogLoadProgress$1", f = "OnetrackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BleLogUploadProgressListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32221(BleLogUploadProgressListener bleLogUploadProgressListener, Continuation<? super C32221> continuation) {
            super(2, continuation);
            this.$listener = bleLogUploadProgressListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnetrackImpl.this.new C32221(this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OnetrackImpl.this.mChangeListeners.remove(this.$listener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.example.statistics.export.IOnetrack
    public void addListenerBleLogLoadProgress(@NotNull BleLogUploadProgressListener bleLogUploadProgressListener) {
        Intrinsics.checkNotNullParameter(bleLogUploadProgressListener, "bleLogUploadProgressListener");
        AnyExtKt.main$default(null, new AnonymousClass1(bleLogUploadProgressListener, this, null), 1, null);
    }

    @Override // com.example.statistics.export.IOnetrack
    @Nullable
    public String getAutoPageTrackCurrentFragmentName() {
        return AutoTrackPageManager.INSTANCE.getCurrentFragmentName();
    }

    @Override // com.example.statistics.export.IOnetrack
    @NotNull
    public String getInstanceID() {
        return OneTrackAnalytics.INSTANCE.getInstanceID();
    }

    @Override // com.example.statistics.export.IOnetrack
    public void init() {
        OneTrackAnalytics.INSTANCE.init(ApplicationExtKt.getApplication());
    }

    @Override // com.example.statistics.export.IOnetrack
    public void login(@NotNull String userId, @NotNull AccountType accountType, @NotNull Map<String, ? extends Object> params, boolean skipLoginEvent) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(params, "params");
        OneTrackAnalytics.INSTANCE.login(userId, accountType, params, skipLoginEvent);
    }

    @Override // com.example.statistics.export.IOnetrack
    public void logout() {
        OneTrackAnalytics.INSTANCE.logout();
    }

    @Override // com.example.statistics.export.IOnetrack
    public void notifyListenerBleLogLoadProgressChanged(boolean success) {
        AnyExtKt.main$default(null, new C32211(success, null), 1, null);
    }

    @Override // com.example.statistics.export.IOnetrack
    public void removeListenerBleLogLoadProgress(@NotNull BleLogUploadProgressListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnyExtKt.main$default(null, new C32221(listener, null), 1, null);
    }

    @Override // com.example.statistics.export.IOnetrack
    public void reportData(@NotNull OneTrackStatBean bean, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(args, "args");
        OneTrackAnalytics.INSTANCE.track(bean, Arrays.copyOf(args, args.length));
    }

    @Override // com.example.statistics.export.IOnetrack
    public void setCommonProperty() {
        OneTrackAnalytics.INSTANCE.setCommonProperty();
    }

    @Override // com.example.statistics.export.IOnetrack
    public void setPrivacyExperienceAccepted(boolean accepted) {
        OneTrackAnalytics.INSTANCE.setCustomPrivacyPolicyAccepted(accepted);
    }

    @Override // com.example.statistics.export.IOnetrack
    public void reportData(@NotNull String eventName, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        OneTrackAnalytics.INSTANCE.track(eventName, params);
    }
}
