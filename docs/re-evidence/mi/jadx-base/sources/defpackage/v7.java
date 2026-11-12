package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\u0011"}, d2 = {"Lv7;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "Landroid/graphics/Bitmap;", "bitmap", "path", "", "processor", "", "isFromTopToBottom", "withPadding", "<init>", "(Lph;ZZ)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class v7 implements ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ph f36574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36575b;
    public final boolean c;

    public v7(@NotNull ph processor, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f36574a = processor;
        this.f36575b = z;
        this.c = z2;
    }

    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        String strA = this.f36574a.a(context, originPath);
        Bitmap bitmap = BitmapFactory.decodeFile(strA);
        String str = strA + ".bmp";
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        a(bitmap, str);
        new File(strA).delete();
        return str;
    }

    public /* synthetic */ v7(ph phVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(phVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }

    public final void a(Bitmap bitmap, String path) {
        ggt.b(bitmap, path, this.f36575b, this.c);
    }
}
