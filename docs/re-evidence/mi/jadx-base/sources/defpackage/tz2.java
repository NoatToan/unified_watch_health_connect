package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class tz2 {
    public static final tz2 d = new tz2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("repeat")
    private int f35199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dayRemindCount")
    private int f35200b;

    @SerializedName("remindTimes")
    private int[] c;

    public tz2() {
    }

    public static tz2 a() {
        return d;
    }

    public int b() {
        return this.f35200b;
    }

    public int[] c() {
        return this.c;
    }

    public int d() {
        return this.f35199a;
    }

    public void e(int i) {
        this.f35200b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tz2 tz2Var = (tz2) obj;
        return this.f35200b == tz2Var.f35200b && this.f35199a == tz2Var.f35199a && Arrays.equals(this.c, tz2Var.c);
    }

    public void f(int[] iArr) {
        this.c = iArr;
    }

    public void g(int i) {
        this.f35199a = i;
    }

    public int hashCode() {
        return (Objects.hash(Integer.valueOf(this.f35199a), Integer.valueOf(this.f35200b)) * 31) + Arrays.hashCode(this.c);
    }

    public String toString() {
        return "BloodPressureMeasureRemindData{repeat=" + this.f35199a + ", dayRemindCount=" + this.f35200b + ", remindTimes=" + Arrays.toString(this.c) + AbstractJsonLexerKt.END_OBJ;
    }

    public tz2(tz2 tz2Var) {
        this(tz2Var.d(), tz2Var.b(), tz2Var.c());
    }

    public tz2(int i, int i2, int[] iArr) {
        this.f35199a = i;
        this.f35200b = i2;
        this.c = iArr;
    }
}
