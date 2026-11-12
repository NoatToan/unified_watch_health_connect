package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Le8;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "processor", "<init>", "(Lph;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class e8 implements ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ph f16370a;

    public e8(@NotNull ph processor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f16370a = processor;
    }

    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        String strA = this.f16370a.a(context, originPath);
        Bitmap bitmap = BitmapFactory.decodeFile(strA);
        bitmap.setHasAlpha(true);
        String str = strA + ".png";
        t1 t1Var = t1.f34187a;
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return t1Var.a(bitmap, str);
    }
}
