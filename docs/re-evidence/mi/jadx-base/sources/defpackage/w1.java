package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J#\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000fJ\u0010\u0010\n\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0011H\u0016R.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lw1;", "Lq3;", "Li4;", PluginDeviceInfo.FDESC, "Lo4;", PluginDeviceInfo.FICONON, "Lkotlin/Function1;", "", "", "callback", PluginDeviceInfo.FMODEL, "bytes", "Lrq;", "responseRequire", "Lc6;", "([BLrq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "dataCallback", "Lkotlin/jvm/functions/Function1;", PluginDeviceInfo.FICONOFF, "()Lkotlin/jvm/functions/Function1;", "setDataCallback", "(Lkotlin/jvm/functions/Function1;)V", "Ln2;", "downLinkCharacteristic$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FICONOFFLINE, "()Ln2;", "downLinkCharacteristic", "upLinkCharacteristic$delegate", PluginDeviceInfo.FBLUETOOTHPAIR, "upLinkCharacteristic", "Ly1;", "bleChannelLink", "<init>", "(Ly1;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class w1 implements q3 {

    @NotNull
    public static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BleChannelLink f37428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Function1<? super byte[], Unit> f37429b;

    @NotNull
    public ChannelOptions c;

    @NotNull
    public final hq d;

    @NotNull
    public final Lazy e;

    @NotNull
    public final Lazy f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lw1$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln2;", PluginDeviceInfo.FMODEL, "()Ln2;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<n2> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2 invoke() {
            return w1.this.f37428a.getGattPeripheral().a(n4.v);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"w1$d", "Lw5;", "", "data", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements w5 {
        public d() {
        }

        @Override // defpackage.w5
        public void a(@NotNull byte[] data) {
            Object objM886constructorimpl;
            Intrinsics.checkNotNullParameter(data, "data");
            w1 w1Var = w1.this;
            try {
                Result.Companion companion = Result.Companion;
                t5t.d("BleChannelImpl", "notify");
                w1Var.d().invoke2(data);
                objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d("BleChannelImpl", "handle data failed:" + thM889exceptionOrNullimpl);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln2;", PluginDeviceInfo.FMODEL, "()Ln2;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<n2> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2 invoke() {
            return w1.this.f37428a.getGattPeripheral().a(n4.w);
        }
    }

    public w1(@NotNull BleChannelLink bleChannelLink) {
        Intrinsics.checkNotNullParameter(bleChannelLink, "bleChannelLink");
        this.f37428a = bleChannelLink;
        this.f37429b = b.t;
        this.c = new ChannelOptions(bleChannelLink.getGattPeripheral().a());
        this.d = new hq();
        this.e = LazyKt__LazyJVMKt.lazy(new c());
        this.f = LazyKt__LazyJVMKt.lazy(new e());
        try {
            t5t.d("BleChannelImpl", "Init channel profile result: " + bleChannelLink.getGattPeripheral().a(f(), new d()) + ", device mtu: " + this.c.getMtu().d());
        } catch (Exception e2) {
            t5t.d("BleChannelImpl", "Init exception:" + e2);
        }
    }

    @Override // defpackage.q3
    @Nullable
    public Object a(@NotNull byte[] bArr, @NotNull ResponseRequire responseRequire, @NotNull Continuation<? super c6> continuation) {
        return a(this, bArr, responseRequire, continuation);
    }

    @Override // defpackage.q3
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public ChannelOptions getC() {
        return this.c;
    }

    @Override // defpackage.q3
    @NotNull
    public ChannelVersion c() {
        return this.f37428a.c();
    }

    @NotNull
    public final Function1<byte[], Unit> d() {
        return this.f37429b;
    }

    @NotNull
    public final n2 e() {
        return (n2) this.e.getValue();
    }

    @NotNull
    public final n2 f() {
        return (n2) this.f.getValue();
    }

    @Override // defpackage.q3
    public void a(@NotNull Function1<? super byte[], Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f37429b = callback;
    }

    public static /* synthetic */ Object a(w1 w1Var, byte[] bArr, ResponseRequire responseRequire, Continuation<? super c6> continuation) {
        if (responseRequire.getWithResponse()) {
            qe qeVarA = w1Var.f37428a.getGattPeripheral().a(w1Var.e(), bArr);
            if (qeVarA != null && qeVarA.j() != null) {
                hq hqVar = w1Var.d;
                byte[] bArrJ = qeVarA.j();
                Intrinsics.checkNotNullExpressionValue(bArrJ, "response.originResponseData");
                return new c6(true, hqVar.a(bArrJ));
            }
            return new c6(false, null, 2, null);
        }
        return new c6(w1Var.f37428a.getGattPeripheral().b(w1Var.e(), bArr), null, 2, null);
    }

    @Override // defpackage.q3
    public boolean a(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return this.f37428a.getGattPeripheral().b(f(), bytes);
    }

    @Override // defpackage.q3
    @NotNull
    public String a() {
        return this.f37428a.getAddress();
    }
}
