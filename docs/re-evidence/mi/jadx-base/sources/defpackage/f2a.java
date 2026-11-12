package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes10.dex */
public class f2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Long> f17328a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Float> f17329b = new ArrayList();
    public boolean c = true;

    public boolean a() {
        this.f17328a.add(Long.valueOf(System.currentTimeMillis()));
        if (this.f17328a.size() < 60.0f) {
            return this.c;
        }
        float fPow = 0.0f;
        if (this.f17328a.size() % 31.0f == 0.0f) {
            List<Long> list = this.f17328a;
            long jLongValue = list.get(list.size() - 1).longValue();
            List<Long> list2 = this.f17328a;
            float fLongValue = 30.0f / ((jLongValue - list2.get(list2.size() - 31).longValue()) / 1000.0f);
            if (fLongValue > 20.0f) {
                this.f17329b.add(Float.valueOf(fLongValue));
                if (this.f17329b.size() >= 5) {
                    float fB = b();
                    Iterator<Float> it = this.f17329b.iterator();
                    while (it.hasNext()) {
                        fPow = (float) (((double) fPow) + Math.pow(Math.abs(it.next().floatValue() - fB), 2.0d));
                    }
                    if (fPow / this.f17329b.size() > 10.0f) {
                        this.c = false;
                    }
                }
            } else {
                this.c = false;
            }
        }
        return this.c;
    }

    public float b() {
        if (this.f17329b.size() == 0) {
            return 30.0f;
        }
        return (float) this.f17329b.stream().mapToDouble(new ToDoubleFunction() { // from class: e2a
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                return ((Float) obj).doubleValue();
            }
        }).average().getAsDouble();
    }
}
