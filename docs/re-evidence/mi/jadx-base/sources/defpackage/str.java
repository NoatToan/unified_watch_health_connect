package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class str<T extends RecyclerBarEntry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f33985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f33986b;
    public List<T> c;

    public str() {
    }

    public str(float f, float f2, List<T> list) {
        this.f33985a = f;
        this.f33986b = f2;
        this.c = list;
    }

    public void a(str strVar) {
        this.f33985a = strVar.f33985a;
        List<T> list = this.c;
        if (list == null) {
            this.c = new ArrayList();
        } else {
            list.clear();
        }
        this.c.addAll(strVar.c);
    }
}
