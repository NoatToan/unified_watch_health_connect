package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.battery.BatteryModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lk1;", "Li1;", "Lvvs;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, "(Lvvs;)Z", "", PluginDeviceInfo.FDESC, "(Lvvs;)V", "Lubt;", "()Lubt;", "", "byteArray", "([B)V", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryModule;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/battery/BatteryModule;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class k1 implements i1 {

    @NotNull
    public static final b v = new b(null);

    @NotNull
    public final BatteryModule t;

    @NotNull
    public final Set<vvs> u;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, k1.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((k1) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lk1$b;", "", "", "tag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<ubt> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ol<ubt> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Query battery info result(" + this.t + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"k1$d", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements qq {
        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return ArraysKt___ArraysKt.first(m1.b.f25636b.getF34884a()) == ArraysKt___ArraysKt.first(response);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvvs;", "it", "", PluginDeviceInfo.FMODEL, "(Lvvs;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function1<vvs, CharSequence> {
        public static final e t = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke2(@NotNull vvs it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(it.hashCode());
        }
    }

    public k1(@NotNull BatteryModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = module;
        module.registerNotify(new a(this));
        this.u = new LinkedHashSet();
    }

    @Override // defpackage.i1
    public void b(@NotNull vvs listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        t5t.d("BatteryApiImpl", "remove " + listener.hashCode() + " remove result:" + this.u.remove(listener) + ", size:" + this.u.size());
    }

    @Override // defpackage.i1
    public boolean a(@NotNull vvs listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        t5t.d("BatteryApiImpl", "add " + listener.hashCode() + " add result:" + this.u.add(listener) + ", size:" + this.u.size());
        return true;
    }

    public final void a(byte[] byteArray) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new l1().decode(byteArray));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        ubt ubtVar = (ubt) objM886constructorimpl;
        if (ubtVar != null) {
            if (this.u.size() > 1) {
                t5t.d("MenstruationDataParser", "WARN: more than one battery callback:" + CollectionsKt___CollectionsKt.joinToString$default(this.u, null, null, null, 0, null, e.t, 31, null));
            }
            Iterator<T> it = this.u.iterator();
            while (it.hasNext()) {
                ((vvs) it.next()).k(ubtVar);
            }
        }
    }

    @Override // defpackage.i1
    @Nullable
    public ubt a() {
        ol<ubt> olVarA = new l1().a(this.t.sendRequest(new nl(m1.c.f25637b, new d(), 0L, null, false, 28, null)));
        le.c("BatteryApiImpl", new c(olVarA));
        return (ubt) C3621pl.a(olVarA);
    }
}
