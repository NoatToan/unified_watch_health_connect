package defpackage;

import androidx.health.connect.client.records.MealType;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class iuv implements Serializable {
    private static final long serialVersionUID = 7505480085796770578L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(MealType.LUNCH)
    private int f38054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(MealType.DINNER)
    private int f38055b;

    @SerializedName(MealType.BREAKFAST)
    private int e;

    public int e() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public int c() {
        return this.f38054a;
    }

    public void d(int i) {
        this.f38054a = i;
    }

    public int b() {
        return this.f38055b;
    }

    public void e(int i) {
        this.f38055b = i;
    }

    public String toString() {
        return "OnePointFull{breakfast=" + this.e + ", lunch=" + this.f38054a + ", dinner=" + this.f38055b + '}';
    }
}
