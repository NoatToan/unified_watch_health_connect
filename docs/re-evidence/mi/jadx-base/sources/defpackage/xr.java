package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lxr;", "Lwr;", "Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "", "data", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xr implements wr {

    @NotNull
    public static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a f39373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39374b;

    @Nullable
    public e6 c;
    public final int d;

    @NotNull
    public final List<FilterAction> e;

    @Nullable
    public Function1<? super PairStatus, Unit> f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxr$a;", "", "", "timeoutMs", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PairStatus t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PairStatus pairStatus) {
            super(0);
            this.t = pairStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "notifyPairedStatusChanged changed: " + this.t;
        }
    }

    public xr(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f39373a = module;
        this.f39374b = "SettingApi";
        this.d = 11;
        this.e = new ArrayList();
    }

    @Override // defpackage.wr
    public void a(@NotNull ChannelResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        byte[] data = response.getData();
        e6 e6Var = this.c;
        if (e6Var != null) {
            e6Var.b(data);
        }
        Iterator<FilterAction> it = this.e.iterator();
        while (it.hasNext()) {
            FilterAction next = it.next();
            if (next.getTimeOut()) {
                it.remove();
            } else if (next.b().invoke2(data).booleanValue()) {
                next.a().invoke2(data);
                it.remove();
            }
        }
        if (ArraysKt___ArraysKt.first(data) == 4) {
            a(data);
        }
    }

    public final void a(byte[] data) {
        if (this.f == null) {
            return;
        }
        w2 w2Var = new w2(data, 0, 2, null);
        w2Var.c();
        PairStatus pairStatusA = lo.a(w2Var.c());
        le.c(this.f39374b, new b(pairStatusA));
        Function1<? super PairStatus, Unit> function1 = this.f;
        if (function1 != null) {
            function1.invoke2(pairStatusA);
        }
    }
}
