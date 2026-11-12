package defpackage;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ru0 implements sl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sl4 f32900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32901b;

    public ru0(float f, sl4 sl4Var) {
        while (sl4Var instanceof ru0) {
            sl4Var = ((ru0) sl4Var).f32900a;
            f += ((ru0) sl4Var).f32901b;
        }
        this.f32900a = sl4Var;
        this.f32901b = f;
    }

    @Override // defpackage.sl4
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f32900a.a(rectF) + this.f32901b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return this.f32900a.equals(ru0Var.f32900a) && this.f32901b == ru0Var.f32901b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32900a, Float.valueOf(this.f32901b)});
    }
}
