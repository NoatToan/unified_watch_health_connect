package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0002¨\u0006\u0011"}, d2 = {"Lx7;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "Landroid/graphics/Bitmap;", "bitmap", "", "targetWidth", "targetHeight", "path", "width", "height", "<init>", "(II)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class x7 implements ph {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "DialBitmap24Process";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38776b;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx7$a;", "", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public x7(int i, int i2) {
        this.f38775a = i;
        this.f38776b = i2;
    }

    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        Bitmap bitmap = BitmapFactory.decodeFile(originPath);
        String str = d;
        t5t.d(str, "width: " + bitmap.getWidth() + ", height: " + bitmap.getHeight());
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        Bitmap bitmapA = a(bitmap, this.f38775a, this.f38776b);
        t5t.d(str, "newWidth: " + bitmapA.getWidth() + ", newHeight: " + bitmapA.getHeight());
        return a(bitmapA, originPath + ".scaled" + this.f38775a + 'x' + this.f38776b);
    }

    public final Bitmap a(Bitmap bitmap, int targetWidth, int targetHeight) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(targetWidth / width, targetHeight / height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bitmap, 0, …th, height, matrix, true)");
        return bitmapCreateBitmap;
    }

    public final String a(Bitmap bitmap, String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return path;
    }
}
