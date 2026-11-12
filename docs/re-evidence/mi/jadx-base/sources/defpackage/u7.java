package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"Lu7;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "targetPath", "", "processor", "<init>", "(Lph;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class u7 implements ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ph f35481a;

    public u7(@NotNull ph processor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f35481a = processor;
    }

    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        String strA = this.f35481a.a(context, originPath);
        String str = strA + ".565";
        a(strA, str);
        new File(strA).delete();
        return str;
    }

    public final void a(String originPath, String targetPath) throws IOException {
        File file = new File(targetPath);
        if (file.exists()) {
            file.delete();
        }
        edt.a(originPath, targetPath);
    }
}
