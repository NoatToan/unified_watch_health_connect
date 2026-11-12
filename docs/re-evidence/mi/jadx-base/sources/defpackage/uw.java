package defpackage;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Luw;", "", "", "path", "", PluginDeviceInfo.FMODEL, "Ljava/io/File;", "file", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class uw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final uw f36202a = new uw();

    public final void a(@Nullable String path) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            a(file);
        }
    }

    public final void a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File childFile : fileArrListFiles) {
                        Intrinsics.checkNotNullExpressionValue(childFile, "childFile");
                        a(childFile);
                    }
                    file.delete();
                    return;
                }
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
