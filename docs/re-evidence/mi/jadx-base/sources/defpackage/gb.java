package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"", "buildTime", "", "changeLog", "Landroid/content/Context;", "ctx", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class gb {
    @Nullable
    public static final String a(int i, @Nullable String str, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String str2 = FileUtils.getAppCacheDir(ctx).getAbsolutePath() + File.separator + "change_log_" + System.currentTimeMillis();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2, true);
            fileOutputStream.write(tet.p(i));
            if (str != null && str.length() > 0) {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
            }
            fileOutputStream.close();
            return str2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
