package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0014X\u0094D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0011\u0010\"R'\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0012\u0010\"¨\u0006*"}, d2 = {"Lgk;", "Lc1;", "Lhk;", "Lhts;", "", "rawData", PluginDeviceInfo.FBLUETOOTHPAIR, "([B)Lhk;", "cmd", "data", "", PluginDeviceInfo.FMODEL, "(Lhk;[B)V", PluginDeviceInfo.FICONON, "([B)V", PluginDeviceInfo.FDESC, "()V", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FICONOFF, "Lok;", "logStream", "(Lok;)V", "", "code", "(I)V", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Lu4;", "Law;", "versionCodec$delegate", "Lkotlin/Lazy;", "()Lu4;", "versionCodec", "logCodec$delegate", "logCodec", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class gk extends c1<hk> implements hts {

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public final String t;

    @NotNull
    public final CopyOnWriteArrayList<mk> u;

    @NotNull
    public final Lazy v;

    @NotNull
    public final Lazy w;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lgk$a;", "", "", "ERROR_CODE_BYTES", "I", "STREAM_ID_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpk;", PluginDeviceInfo.FMODEL, "()Lpk;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<pk> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pk invoke() {
            return new pk();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgw;", PluginDeviceInfo.FMODEL, "()Lgw;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<gw> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke() {
            return new gw();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        super(module);
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = "LaumberjackApiImpl";
        this.u = new CopyOnWriteArrayList<>();
        this.v = LazyKt__LazyJVMKt.lazy(c.t);
        this.w = LazyKt__LazyJVMKt.lazy(b.t);
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleCommand(@NotNull hk cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(cmd, hk.k.f20153b)) {
            c(data);
            return;
        }
        if (Intrinsics.areEqual(cmd, hk.g.f20149b)) {
            b(data);
            return;
        }
        if (Intrinsics.areEqual(cmd, hk.b.f20145b)) {
            a(data);
            return;
        }
        if (Intrinsics.areEqual(cmd, hk.e.f20147b)) {
            e(data);
        } else if (Intrinsics.areEqual(cmd, hk.h.f20150b)) {
            f();
        } else {
            if (!Intrinsics.areEqual(cmd, hk.d.f20146b)) {
                throw new RuntimeException("Invalid device command！");
            }
            d(data);
        }
    }

    public final void b(byte[] data) {
        int iA = c3.a(data, 1, 0, 2, null);
        if (iA == 1) {
            dispatchResponse(hk.f.f20148b, Integer.valueOf(c3.a(data, 1, 1)));
        } else {
            c1.dispatchError$default(this, hk.f.f20148b, iA, null, 4, null);
        }
    }

    public final void c(byte[] data) {
        dispatchResponse(hk.j.f20152b, e().decode(data));
    }

    public final u4<LogStream, byte[]> d() {
        return (u4) this.w.getValue();
    }

    public final u4<Version, byte[]> e() {
        return (u4) this.v.getValue();
    }

    @Override // defpackage.c1
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public hk parseCommand(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return hk.f20143a.a(rawData);
    }

    @Override // defpackage.c1
    @NotNull
    /* JADX INFO: renamed from: getTag, reason: from getter */
    public String getT() {
        return this.t;
    }

    public final void d(byte[] data) {
        if (data.length < 1) {
            throw new RuntimeException("No error Code!");
        }
        a(c3.a(data, 1, 0, 2, null));
    }

    public final void e(byte[] data) {
        a(d().decode(data));
    }

    public final void f() {
        c1.sendRequestNoResponse$default(this, hk.i.f20151b, null, 0L, 6, null);
    }

    public final void a(byte[] data) {
        int iA = c3.a(data, 1, 0, 2, null);
        if (iA == 1) {
            dispatchResponse(hk.a.f20144b, Boolean.TRUE);
        } else {
            c1.dispatchError$default(this, hk.a.f20144b, iA, null, 4, null);
        }
    }

    public final void a(LogStream logStream) {
        Iterator<mk> it = this.u.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "logCallback.iterator()");
        while (it.hasNext()) {
            it.next().a(logStream);
        }
    }

    public final void a(int code) {
        Iterator<mk> it = this.u.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "logCallback.iterator()");
        while (it.hasNext()) {
            it.next().onError(code);
        }
    }
}
