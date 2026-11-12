package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0018\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\rH\u0014J\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\r*\u00020\u0011H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002R\u001a\u0010\u0013\u001a\u00020\u00128\u0014X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lns;", "Lls;", "Lc1;", "Lx4;", "Lyv;", "getVersion", "Ld5;", PluginDeviceInfo.FMODEL, "Lnx;", PluginDeviceInfo.FICONON, "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "data", "", "", "rawData", "cmd", "", "", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Ljava/util/Vector;", "Lps;", "sleepPlanListeners$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FICONOFF, "()Ljava/util/Vector;", "sleepPlanListeners", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ns extends c1<x4> implements ls {

    @NotNull
    public final Lazy t;

    @NotNull
    public final String u;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ x4 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x4 x4Var) {
            super(0);
            this.t = x4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unsupported decode(" + this.t + ")!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(0);
            this.t = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unsupported encode(" + this.t.getClass().getSimpleName() + ")!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ x4 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x4 x4Var) {
            super(0);
            this.t = x4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Skipped command: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/Vector;", "Lps;", PluginDeviceInfo.FMODEL, "()Ljava/util/Vector;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<Vector<ps>> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vector<ps> invoke() {
            return new Vector<>();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ x4 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x4 x4Var) {
            super(0);
            this.t = x4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unsupported request command(" + this.t + ")!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f t = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Write data exception!";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        super(module);
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = LazyKt__LazyJVMKt.lazy(d.t);
        this.u = "SleepDataImpl";
    }

    @Override // defpackage.ls
    @Nullable
    public Config a() {
        Response responseSendRequest$default = c1.sendRequest$default(this, x4.e.f38663b, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            return (Config) ((Success) responseSendRequest$default).getData();
        }
        return null;
    }

    @Override // defpackage.ls
    @Nullable
    public WriteDataHistory c() {
        Response responseSendRequest$default = c1.sendRequest$default(this, x4.f.f38664b, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            return (WriteDataHistory) ((Success) responseSendRequest$default).getData();
        }
        return null;
    }

    public final Vector<ps> d() {
        return (Vector) this.t.getValue();
    }

    @Override // defpackage.c1
    @NotNull
    /* JADX INFO: renamed from: getTag, reason: from getter */
    public String getU() {
        return this.u;
    }

    @Override // defpackage.ls
    @Nullable
    public Version getVersion() {
        Response responseSendRequest$default = c1.sendRequest$default(this, x4.g.f38665b, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            return (Version) ((Success) responseSendRequest$default).getData();
        }
        return null;
    }

    @Override // defpackage.ls
    public boolean a(@NotNull SleepData data) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.Companion;
            Response responseSendRequest$default = c1.sendRequest$default(this, x4.i.f38667b, a((Object) data), 0L, 4, null);
            objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf((responseSendRequest$default instanceof Success) && ((Boolean) ((Success) responseSendRequest$default).getData()).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            le.a(getU(), null, thM889exceptionOrNullimpl, f.t, 2, null);
            objM886constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM886constructorimpl).booleanValue();
    }

    @Override // defpackage.c1
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x4 parseCommand(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return x4.f38659a.a(rawData);
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleCommand(@NotNull x4 cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(cmd, x4.h.f38666b) || Intrinsics.areEqual(cmd, x4.b.f38660b) || Intrinsics.areEqual(cmd, x4.c.f38661b) || Intrinsics.areEqual(cmd, x4.j.f38668b) || Intrinsics.areEqual(cmd, x4.l.f38670b)) {
            Object objA = a(data, cmd);
            if (objA != null) {
                dispatchResponse(a(cmd), objA);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(cmd, x4.d.f38662b)) {
            Object objA2 = a(data, cmd);
            if (objA2 != null) {
                Object obj = objA2 instanceof PlanStruct ? objA2 : null;
                if (obj != null) {
                    Iterator<T> it = d().iterator();
                    while (it.hasNext()) {
                        ((ps) it.next()).a((PlanStruct) obj);
                    }
                    return;
                }
                return;
            }
            return;
        }
        le.a(getU(), (Throwable) null, new c(cmd), 2, (Object) null);
    }

    public final x4 a(x4 x4Var) {
        if (Intrinsics.areEqual(x4Var, x4.h.f38666b)) {
            return x4.g.f38665b;
        }
        if (Intrinsics.areEqual(x4Var, x4.b.f38660b)) {
            return x4.e.f38663b;
        }
        if (Intrinsics.areEqual(x4Var, x4.c.f38661b)) {
            return x4.f.f38664b;
        }
        if (Intrinsics.areEqual(x4Var, x4.j.f38668b)) {
            return x4.i.f38667b;
        }
        if (Intrinsics.areEqual(x4Var, x4.l.f38670b)) {
            return x4.k.f38669b;
        }
        le.a(getU(), (Throwable) null, new e(x4Var), 2, (Object) null);
        return x4Var;
    }

    public final byte[] a(Object obj) {
        if (obj instanceof SleepData) {
            return new ms().encode((SleepData) obj);
        }
        if (obj instanceof PlanStruct) {
            return new os().a(CollectionsKt__CollectionsKt.mutableListOf((PlanStruct) obj));
        }
        le.a(getU(), (Throwable) null, new b(obj), 2, (Object) null);
        return new byte[0];
    }

    public final Object a(byte[] bArr, x4 x4Var) {
        if (Intrinsics.areEqual(x4Var, x4.h.f38666b)) {
            return new jw().decode(bArr);
        }
        if (Intrinsics.areEqual(x4Var, x4.b.f38660b)) {
            return new e5().decode(bArr);
        }
        if (Intrinsics.areEqual(x4Var, x4.c.f38661b)) {
            return new ox().decode(bArr);
        }
        if (Intrinsics.areEqual(x4Var, x4.j.f38668b) || Intrinsics.areEqual(x4Var, x4.l.f38670b)) {
            return new vq().decode(bArr);
        }
        if (Intrinsics.areEqual(x4Var, x4.d.f38662b)) {
            return CollectionsKt___CollectionsKt.first((List) new os().decode(bArr));
        }
        le.a(getU(), (Throwable) null, new a(x4Var), 2, (Object) null);
        return null;
    }
}
