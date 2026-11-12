package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class vzo extends e57 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f37401b;
    public int[] c;

    public vzo(Drawable drawable) {
        this(drawable, drawable.getState());
    }

    public static boolean b(StateListDrawable stateListDrawable, int[] iArr) {
        int iA = xco.a(stateListDrawable);
        for (int i = 0; i < iA; i++) {
            for (int i2 : xco.b(stateListDrawable, i)) {
                if (Arrays.binarySearch(iArr, i2) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] c(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr2.length + iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public boolean d(int[] iArr) {
        if (Arrays.equals(iArr, this.f37401b)) {
            return false;
        }
        this.f37401b = iArr;
        return super.setState(c(iArr, this.c));
    }

    @Override // defpackage.e57, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (Arrays.equals(iArr, this.c)) {
            return false;
        }
        this.c = iArr;
        return super.setState(c(this.f37401b, iArr));
    }

    public vzo(Drawable drawable, int[] iArr) {
        super(drawable);
        this.f37401b = new int[0];
        this.c = new int[0];
        d(iArr);
    }
}
