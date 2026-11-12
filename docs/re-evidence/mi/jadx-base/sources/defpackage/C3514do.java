package defpackage;

import com.huami.bluetooth.profile.channel.module.sport.PHNModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldo;", "Llhs;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;", RnReportConst.ApiReport.PARAM_MODULE, "", "algorithmVersion", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class C3514do implements lhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PHNModule f15731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f15732b;

    @NotNull
    public final Json c;

    /* JADX INFO: renamed from: do$a */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", PluginDeviceInfo.FMODEL, "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a t = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    public C3514do(@NotNull PHNModule module, @NotNull String algorithmVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(algorithmVersion, "algorithmVersion");
        this.f15731a = module;
        this.f15732b = algorithmVersion;
        this.c = JsonKt.Json$default(null, a.t, 1, null);
    }
}
