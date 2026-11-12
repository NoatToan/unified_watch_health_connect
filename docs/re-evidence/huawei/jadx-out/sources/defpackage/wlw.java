package defpackage;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wlw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f52161b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f52162c;
    private float d;
    private float e;

    public wlw(float f, float f2, int i, List<c> list, float[] fArr) {
        this.f52162c = null;
        this.d = f;
        this.e = f2;
        this.f52160a = i;
        if (fArr != null) {
            this.f52162c = (float[]) fArr.clone();
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f52161b.addAll(list);
    }

    public boolean j() {
        List<c> list = this.f52161b;
        return (list == null || list.size() == 0) ? false : true;
    }

    public float c() {
        return this.d;
    }

    public float b() {
        return this.e;
    }

    public int a() {
        return this.f52160a;
    }

    public List<c> e() {
        return this.f52161b;
    }

    public float[] d() {
        float[] fArr = this.f52162c;
        if (fArr == null) {
            return new float[0];
        }
        return (float[]) fArr.clone();
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f52163b;
        private float d;
        private int e;

        public c(float f, float f2, int i) {
            this.d = f;
            this.f52163b = f2;
            this.e = i;
        }

        public float b() {
            return this.d;
        }

        public float c() {
            return this.f52163b;
        }

        public int e() {
            return this.e;
        }
    }
}
