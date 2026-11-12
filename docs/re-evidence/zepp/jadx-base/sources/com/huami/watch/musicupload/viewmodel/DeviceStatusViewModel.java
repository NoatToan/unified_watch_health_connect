package com.huami.watch.musicupload.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.DeviceStatus;
import com.huami.watch.musicupload.fragment.MusicConstantKt;
import com.xiaomi.hm.health.bt.device.Status;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 %2\u00020\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0017\u001a\u00060\u0014R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "", "transfer", "b", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "musicTransmitter", "setMusicTransform", Status.PRE_CONNECT_STATE_CONNECTED, "setDeviceConnected", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/watch/musicupload/DeviceStatus;", "Landroidx/lifecycle/MutableLiveData;", "getStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "statusLiveData", "Lcom/huami/watch/musicupload/DeviceStatus;", "status", "Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel$b;", "c", "Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel$b;", "taskCompleteListener", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "e", "getFinishLiveData", "finishLiveData", "f", "getRetryCloseLiveData", "retryCloseLiveData", "g", "Z", "needRetryClose", "<init>", "()V", "i", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class DeviceStatusViewModel extends ViewModel {
    private static final String h = "DeviceStatusViewModel";

    @NotNull
    private static final a i = new a(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MusicTransmitter musicTransmitter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean needRetryClose;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DeviceStatus> statusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DeviceStatus status = DeviceStatus.ConnectedIdle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b taskCompleteListener = new b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> finishLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> retryCloseLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/viewmodel/DeviceStatusViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"com/huami/watch/musicupload/viewmodel/DeviceStatusViewModel$b", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCompleteListener;", "", "onStart", "onComplete", "", "a", "Z", "()Z", "b", "(Z)V", "transfer", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements MusicTransmitter.ITransformCompleteListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean transfer;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "on transfer complete";
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.DeviceStatusViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.DeviceStatusViewModel$TaskCompleteListener$onComplete$2", f = "DeviceStatusViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0669b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public C0669b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return b.this.new C0669b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0669b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MusicConstantKt.put(DeviceStatusViewModel.this.getFinishLiveData(), Boxing.boxBoolean(true));
                    this.a = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MusicConstantKt.put(DeviceStatusViewModel.this.getFinishLiveData(), Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "on transfer start";
            }
        }

        public b() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getTransfer() {
            return this.transfer;
        }

        public final void b(boolean z) {
            this.transfer = z;
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCompleteListener
        public void onComplete() {
            a unused = DeviceStatusViewModel.i;
            HMLog.info(DeviceStatusViewModel.h, a.a);
            this.transfer = false;
            DeviceStatusViewModel.this.b(false);
            e.f(ViewModelKt.getViewModelScope(DeviceStatusViewModel.this), Dispatchers.getIO(), null, new C0669b(null), 2, null);
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.ITransformCompleteListener
        public void onStart() {
            a unused = DeviceStatusViewModel.i;
            HMLog.info(DeviceStatusViewModel.h, c.a);
            this.transfer = true;
            DeviceStatusViewModel.this.b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceStatus b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeviceStatus deviceStatus, boolean z) {
            super(0);
            this.b = deviceStatus;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setDeviceConnected from status to status: from: " + DeviceStatusViewModel.this.status + ", to: " + this.b + ", connected: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceStatus b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DeviceStatus deviceStatus, boolean z) {
            super(0);
            this.b = deviceStatus;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setTransferring from status to status: from: " + DeviceStatusViewModel.this.status + ", to: " + this.b + ", transfer: " + this.c;
        }
    }

    private final void a() {
        if (this.needRetryClose && this.status == DeviceStatus.ConnectedIdle) {
            MusicConstantKt.put(this.retryCloseLiveData, Boolean.TRUE);
            this.needRetryClose = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean transfer) {
        DeviceStatus deviceStatusNextStateForTransfer = this.status.nextStateForTransfer(transfer);
        HMLog.info(h, new d(deviceStatusNextStateForTransfer, transfer));
        if (deviceStatusNextStateForTransfer == this.status) {
            return;
        }
        this.status = deviceStatusNextStateForTransfer;
        MusicConstantKt.put(this.statusLiveData, deviceStatusNextStateForTransfer);
        a();
    }

    @NotNull
    public final MutableLiveData<Boolean> getFinishLiveData() {
        return this.finishLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRetryCloseLiveData() {
        return this.retryCloseLiveData;
    }

    @NotNull
    public final MutableLiveData<DeviceStatus> getStatusLiveData() {
        return this.statusLiveData;
    }

    public final void setDeviceConnected(boolean connected) {
        DeviceStatus deviceStatusNextStateForConnect = this.status.nextStateForConnect(connected);
        HMLog.info(h, new c(deviceStatusNextStateForConnect, connected));
        if (deviceStatusNextStateForConnect == this.status) {
            return;
        }
        if (deviceStatusNextStateForConnect == DeviceStatus.DisconnectedTransfer) {
            this.needRetryClose = true;
        }
        this.status = deviceStatusNextStateForConnect;
        MusicConstantKt.put(this.statusLiveData, deviceStatusNextStateForConnect);
        a();
    }

    public final void setMusicTransform(@Nullable MusicTransmitter musicTransmitter) {
        this.musicTransmitter = musicTransmitter;
        if (musicTransmitter != null) {
            musicTransmitter.setTransformCompleteListener(this.taskCompleteListener);
        }
    }
}
