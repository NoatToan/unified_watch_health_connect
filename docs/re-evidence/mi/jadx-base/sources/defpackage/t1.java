package defpackage;

import android.graphics.Bitmap;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lt1;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "path", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t1 f34187a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34188b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 15;
    public static final int g = 3;
    public static final int h = 12;
    public static final int i = 5;
    public static final int j = 10;

    @NotNull
    public final String a(@NotNull Bitmap bitmap, @NotNull String path) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(path, "path");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return path;
    }
}
