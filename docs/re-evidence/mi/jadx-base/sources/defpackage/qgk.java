package defpackage;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class qgk implements sl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31506a;

    public qgk(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f31506a = f;
    }

    @Override // defpackage.sl4
    public float a(RectF rectF) {
        return this.f31506a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgk) && this.f31506a == ((qgk) obj).f31506a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f31506a)});
    }
}
