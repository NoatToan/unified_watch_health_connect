package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class t2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f34238a;

    @RequiresApi(24)
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        public static PointerIcon b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        public static PointerIcon c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public t2i(PointerIcon pointerIcon) {
        this.f34238a = pointerIcon;
    }

    public static t2i b(Context context, int i) {
        return new t2i(a.b(context, i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Object a() {
        return this.f34238a;
    }
}
