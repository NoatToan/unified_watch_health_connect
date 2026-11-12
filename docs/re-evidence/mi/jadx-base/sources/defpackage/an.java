package defpackage;

import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lan;", "", "Lzm;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lhn;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lhn;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class an extends zm {
    public final int e;

    @NotNull
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(@NotNull NotificationModule module, @NotNull NotificationVersion version) {
        super(module, version);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(version, "version");
        this.e = 1;
        this.f = "NotificationApiImplV4";
    }
}
