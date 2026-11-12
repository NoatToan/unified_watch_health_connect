package com.huami.bluetooth.profile.channel.module.battery;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.C3621pl;
import defpackage.d4;
import defpackage.g7;
import defpackage.lw;
import defpackage.m1;
import defpackage.mj;
import defpackage.nl;
import defpackage.nq;
import defpackage.r0;
import defpackage.r3;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\nR\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "data", "", "onNotify", "init", "", "queryVersion", "()Ljava/lang/Integer;", "Lkotlin/Function1;", "notify", "registerNotify", "Lkotlin/jvm/functions/Function1;", "version$delegate", "Lkotlin/Lazy;", "getVersion", "version", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 41)
public final class BatteryModule extends a {

    @NotNull
    private static final String tag = "BatteryModule";

    @NotNull
    private final g7 deviceRequestHandler;

    @NotNull
    private Function1<? super byte[], Unit> notify;

    /* JADX INFO: renamed from: version$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public b(Object obj) {
            super(1, obj, BatteryModule.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BatteryModule) this.receiver).onNotify(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/battery/BatteryModule$c", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return r0.a(ArraysKt___ArraysKt.first(byteArray)) == m1.a.f25635b.getF25634a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function1<byte[], Unit> {
        public static final d t = new d();

        public d() {
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return BatteryModule.this.queryVersion();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.notify = d.t;
        this.deviceRequestHandler = new g7(new b(this), new c());
        this.version = LazyKt__LazyJVMKt.lazy(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotify(byte[] data) {
        this.notify.invoke2(data);
    }

    @Nullable
    public final Integer getVersion() {
        return (Integer) this.version.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        unregisterDeviceRequestHandler(this.deviceRequestHandler);
        registerDeviceRequestHandler(this.deviceRequestHandler);
    }

    @Nullable
    public final Integer queryVersion() {
        return (Integer) C3621pl.a(new lw().a(sendRequest(new nl(m1.d.f25638b, mj.t, 0L, null, false, 28, null))));
    }

    public final void registerNotify(@NotNull Function1<? super byte[], Unit> notify) {
        Intrinsics.checkNotNullParameter(notify, "notify");
        this.notify = notify;
    }
}
