package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a00 implements sl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f457a;

    public a00(float f) {
        this.f457a = f;
    }

    @Override // defpackage.sl4
    public float a(RectF rectF) {
        return this.f457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a00) && this.f457a == ((a00) obj).f457a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f457a)});
    }
}
