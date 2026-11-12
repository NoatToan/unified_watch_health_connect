package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lac;", "Lci;", "Lf4s;", "dataHeader", "Ljava/util/Calendar;", "startTime", "Lmb;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/util/Calendar;)Lmb;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ac implements ci {
    @Override // defpackage.ci
    @NotNull
    public mb a(@NotNull f4s dataHeader, @NotNull Calendar startTime) {
        Intrinsics.checkNotNullParameter(dataHeader, "dataHeader");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return (!dataHeader.d() || dataHeader.f17407b <= 129600) ? mb.v.a(dataHeader.b()) : mb.INVALID_STATE;
    }
}
