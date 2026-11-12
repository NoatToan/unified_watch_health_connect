package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J#\u0010\u0005\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0005\u0010\u0011¨\u0006\u0016"}, d2 = {"Lyl;", "Lwl;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl;", "control", "", PluginDeviceInfo.FMODEL, "Lzl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FDESC, "", "byteArray", "", "cmd", "", "value", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "(BLjava/lang/Integer;)Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class yl implements wl {

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a t;

    @NotNull
    public final g7 u;

    @NotNull
    public final zl v;

    @NotNull
    public zl w;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lyl$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40279a;

        static {
            int[] iArr = new int[HMMusicControl.AppException.values().length];
            try {
                iArr[HMMusicControl.AppException.APP_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMMusicControl.AppException.NO_MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMMusicControl.AppException.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40279a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"yl$c", "Lzl;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "cmd", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements zl {
        @Override // defpackage.zl
        public void a(@NotNull HMMusicControl.DeviceCommand cmd) {
            Intrinsics.checkNotNullParameter(cmd, "cmd");
            t5t.d("MusicControllerApiImpl", "如果没有人监听音乐控制设备只能自嗨");
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public d(Object obj) {
            super(1, obj, yl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((yl) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"yl$e", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(am.b.f1190b.getF34884a()) || ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(am.c.f1191b.getF34884a());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.amc.impl.MusicControllerApiImpl$sendMusicControl$1", f = "MusicControllerApiImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ HMMusicControl v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMMusicControl hMMusicControl, Continuation<? super f> continuation) {
            super(2, continuation);
            this.v = hMMusicControl;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return yl.this.new f(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.huami.bluetooth.profile.channel.module.a aVar = yl.this.t;
                am.a aVar2 = am.a.f1189b;
                byte[] bleBytes = this.v.toBleBytes();
                Intrinsics.checkNotNullExpressionValue(bleBytes, "control.toBleBytes()");
                byte[] f34884a = aVar2.withBytes(bleBytes).getF34884a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(aVar, f34884a, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public yl(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = module;
        this.u = new g7(new d(this), new e());
        c cVar = new c();
        this.v = cVar;
        this.w = cVar;
    }

    @Override // defpackage.wl
    public void b(@NotNull zl listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.w = listener;
        this.t.registerDeviceRequestHandler(this.u);
    }

    public final void a(byte[] byteArray) {
        HMMusicControl.DeviceCommand deviceCommandA = a(ArraysKt___ArraysKt.first(byteArray), r0.a(byteArray));
        if (deviceCommandA == null) {
            return;
        }
        this.w.a(deviceCommandA);
    }

    public final HMMusicControl.DeviceCommand a(byte cmd, Integer value) {
        if (value == null) {
            return null;
        }
        if (cmd != ArraysKt___ArraysKt.first(am.b.f1190b.getF34884a())) {
            if (cmd != ArraysKt___ArraysKt.first(am.c.f1191b.getF34884a())) {
                return null;
            }
            int iIntValue = value.intValue();
            if (iIntValue == 1) {
                return HMMusicControl.DeviceCommand.START;
            }
            if (iIntValue != 2) {
                return null;
            }
            return HMMusicControl.DeviceCommand.STOP;
        }
        return HMMusicControl.DeviceCommand.from((byte) value.intValue());
    }

    @Override // defpackage.wl
    public boolean a(@NotNull HMMusicControl control) {
        HMMusicControl.AppException appException;
        Intrinsics.checkNotNullParameter(control, "control");
        HMMusicControl.AppException exception = control.getException();
        int i = exception == null ? -1 : b.f40279a[exception.ordinal()];
        if (i == 1) {
            appException = HMMusicControl.AppException.APP_READY;
        } else if (i == 2) {
            appException = HMMusicControl.AppException.APP_NONE;
        } else if (i != 3) {
            appException = HMMusicControl.AppException.UNKNOWN;
        } else {
            appException = HMMusicControl.AppException.NO_MUSIC;
        }
        control.setException(appException);
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new f(control, null), 1, null)).booleanValue();
    }

    @Override // defpackage.wl
    public void a(@NotNull zl listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.w = this.v;
        this.t.unregisterDeviceRequestHandler(this.u);
    }
}
