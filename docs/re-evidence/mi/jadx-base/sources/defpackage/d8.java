package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Ld8;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class d8 implements ph {
    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        return originPath;
    }
}
