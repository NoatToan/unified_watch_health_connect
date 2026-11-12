package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¨\u0006\u0011"}, d2 = {"Lw3;", "", "", "mode", "", "isOneTime", "Lkotlin/Function1;", "Lm4;", "", "callback", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONON, RnReportConst.ApiReport.PARAM_MODULE, b.I, PluginDeviceInfo.FDESC, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class w3 {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Function1<ChannelResponse, Unit>> f37497a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Map<Integer, Function1<ChannelResponse, Unit>> f37498b = new LinkedHashMap();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lw3$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a(int mode, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isOneTime) {
            this.f37498b.put(Integer.valueOf(mode), callback);
        } else {
            this.f37497a.put(Integer.valueOf(mode), callback);
        }
    }

    public final void b(int module) {
        if (this.f37498b.containsKey(Integer.valueOf(module))) {
            this.f37498b.remove(Integer.valueOf(module));
        }
    }

    public final void c(int mode) {
        this.f37497a.remove(Integer.valueOf(mode));
        if (this.f37497a.containsKey(Integer.valueOf(mode))) {
            this.f37497a.remove(Integer.valueOf(mode));
        } else if (this.f37498b.containsKey(Integer.valueOf(mode))) {
            this.f37498b.remove(Integer.valueOf(mode));
        }
    }

    public final boolean a(int module) {
        return this.f37497a.containsKey(Integer.valueOf(module)) || this.f37498b.containsKey(Integer.valueOf(module));
    }

    public final void a(int mode, @NotNull ChannelResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Function1<ChannelResponse, Unit> function1 = this.f37497a.get(Integer.valueOf(mode));
        if (function1 == null) {
            function1 = this.f37498b.get(Integer.valueOf(mode));
        }
        if (function1 == null) {
            t5t.d("ChannelCallbackHolder", "No mode(" + mode + ") callback, data dropped");
            return;
        }
        b(mode);
        function1.invoke2(response);
    }
}
