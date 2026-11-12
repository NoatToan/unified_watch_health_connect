package y80;

import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly80/r0;", "", "", "Landroid/graphics/drawable/Drawable;", "frontDrawables", "", "textDescriptions", "", "timestamps", "<init>", "([Landroid/graphics/drawable/Drawable;[Ljava/lang/String;[I)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable[] f195211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f195212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f195213c;

    public r0(Drawable[] drawableArr, String[] strArr, int[] iArr) {
        drawableArr.getClass();
        strArr.getClass();
        iArr.getClass();
        this.f195211a = drawableArr;
        this.f195212b = strArr;
        this.f195213c = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r0 r0Var = (r0) obj;
        return Arrays.equals(this.f195211a, r0Var.f195211a) && Arrays.equals(this.f195212b, r0Var.f195212b) && Arrays.equals(this.f195213c, r0Var.f195213c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f195213c) + (((Arrays.hashCode(this.f195211a) * 31) + Arrays.hashCode(this.f195212b)) * 31);
    }

    public final String toString() {
        return am.j.o(Arrays.toString(this.f195213c), ")", p6.b.i("Tutorial(frontDrawables=", Arrays.toString(this.f195211a), ", textDescriptions=", Arrays.toString(this.f195212b), ", timestamps="));
    }
}
