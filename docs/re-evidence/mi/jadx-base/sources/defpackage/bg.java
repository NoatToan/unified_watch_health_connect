package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbg;", "Lmht;", "Lsf;", "hearingAidApiV2", "Lxf;", "roleApi", "<init>", "(Lsf;Lxf;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class bg implements mht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sf f4165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final xf f4166b;

    @Nullable
    public volatile List<BatteryInfo> c;

    @Nullable
    public Function2<? super gg, ? super List<BatteryInfo>, Unit> d;

    @NotNull
    public final a e;

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"bg$a", "Leg;", "", "Ln1;", "list", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements eg {
        public a() {
        }

        @Override // defpackage.eg
        public void a(@Nullable List<BatteryInfo> list) {
            gg f40115b = bg.this.f4166b.getF40115b();
            if (Intrinsics.areEqual(f40115b, gg.e.c)) {
                f40115b = bg.this.f4166b.a();
            }
            if (list != null) {
                bg.this.c = list;
            }
            Function2 function2 = bg.this.d;
            if (function2 != null) {
                function2.invoke(f40115b, list);
            }
        }
    }

    public bg(@NotNull sf hearingAidApiV2, @NotNull xf roleApi) {
        Intrinsics.checkNotNullParameter(hearingAidApiV2, "hearingAidApiV2");
        Intrinsics.checkNotNullParameter(roleApi, "roleApi");
        this.f4165a = hearingAidApiV2;
        this.f4166b = roleApi;
        a aVar = new a();
        this.e = aVar;
        hearingAidApiV2.a(aVar);
    }
}
