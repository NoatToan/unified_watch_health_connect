package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qgb extends qfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("schedules")
    private List<qff> f46154a;

    public List<qff> t() {
        return this.f46154a;
    }

    public void a(List<qff> list) {
        this.f46154a = list;
    }

    @Override // defpackage.qfx
    public String toString() {
        return "SubTaskCreate{" + super.toString() + ",schedules=" + this.f46154a + '}';
    }
}
