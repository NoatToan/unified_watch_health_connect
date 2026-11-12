package defpackage;

import androidx.health.connect.client.records.MealType;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(MealType.DINNER)
    private List<hdc> f36452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("breakfastAddition")
    private List<hdc> f36453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dinnerAddition")
    private List<hdc> f36454c;

    @SerializedName(MealType.LUNCH)
    private List<hdc> d;

    @SerializedName(MealType.BREAKFAST)
    private List<hdc> e;

    @SerializedName("lunchAddition")
    private List<hdc> h;

    public String toString() {
        return new Gson().toJson(this);
    }

    public void d(List<hdc> list) {
        this.e = list;
    }

    public List<hdc> a() {
        return this.d;
    }

    public void b(List<hdc> list) {
        this.d = list;
    }

    public List<hdc> b() {
        return this.f36452a;
    }

    public void a(List<hdc> list) {
        this.f36452a = list;
    }

    public List<hdc> c() {
        return this.e;
    }
}
