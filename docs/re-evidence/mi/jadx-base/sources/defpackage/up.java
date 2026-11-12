package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lup;", "Laft;", "Le0;", "version", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Le0;Lcom/huami/bluetooth/profile/channel/module/a;)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class up implements aft {

    @NotNull
    public static final c d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AssistantVersion f35983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a f35984b;

    @NotNull
    public final HashMap<Byte, b> c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.xiaomi.onetrack.api.b.I, "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$1", f = "QuickCardApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
        public int t;
        public /* synthetic */ Object u;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull byte[] bArr, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(bArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = up.this.new a(continuation);
            aVar.u = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = (byte[]) this.u;
            if (bArr.length == 0) {
                return Unit.INSTANCE;
            }
            b bVar = (b) up.this.c.get(Boxing.boxByte(ArraysKt___ArraysKt.first(bArr)));
            if (bVar != null) {
                bVar.a(bArr);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lup$b;", "", "", "it", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        void a(@NotNull byte[] it);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lup$c;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public up(@NotNull AssistantVersion version, @NotNull com.huami.bluetooth.profile.channel.module.a module) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f35983a = version;
        this.f35984b = module;
        this.c = new HashMap<>();
        module.registerMessageCallback(new a(null));
    }
}
