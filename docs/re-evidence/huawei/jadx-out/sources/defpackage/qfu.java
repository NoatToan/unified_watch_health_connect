package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qfu extends qgb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("subTasks")
    private List<qgb> f46136c;

    @SerializedName(TypedValues.Custom.S_DIMENSION)
    private String e;

    public List<qgb> n() {
        return this.f46136c;
    }

    public void d(List<qgb> list) {
        this.f46136c = list;
    }

    public String o() {
        return this.e;
    }

    public void h(String str) {
        this.e = str;
    }

    @Override // defpackage.qgb, defpackage.qfx
    public String toString() {
        return "CreateTasks{" + super.toString() + ",subTasks=" + this.f46136c + ", dimension='" + this.e + '}';
    }
}
