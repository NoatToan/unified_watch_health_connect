package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lp8;", "Lqh;", "", "Lews;", "items", "", PluginDeviceInfo.FMODEL, "(Ljava/util/List;)Z", "Lkd;", "device", "<init>", "(Lkd;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class p8 implements qh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f30104b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kd f30105a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lp8$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public p8(@NotNull kd device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f30105a = device;
    }

    @Override // defpackage.qh
    public boolean a(@NotNull List<? extends ews> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        kd kdVar = this.f30105a;
        if (kdVar instanceof ne) {
            return ((ne) kdVar).c4(items);
        }
        t5t.d("DisplaySettingImpl", "设备不支持设置应用排序");
        return false;
    }
}
