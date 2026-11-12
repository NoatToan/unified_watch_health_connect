package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.Transformer;

/* JADX INFO: loaded from: classes16.dex */
public class qod {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Entry f46554b;
    private float i;
    private float j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46555c = false;
    private boolean e = false;
    private boolean f = false;
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f46553a = null;

    public qod(float f, float f2, Entry entry) {
        a(f, f2, entry);
    }

    public qod(Entry entry) {
        b(entry);
    }

    public qod() {
    }

    public void d(float f, float f2, Entry entry) {
        a(f, f2, entry);
    }

    private void b(Entry entry) {
        this.j = entry.getX();
        this.i = entry.getY();
        this.f46554b = entry;
    }

    private void a(float f, float f2, Entry entry) {
        this.j = f;
        this.i = f2;
        this.f46554b = entry;
    }

    public float c() {
        return this.j;
    }

    public float b() {
        return this.i;
    }

    public void a(float f) {
        this.i = f;
    }

    public Object e() {
        return this.f46553a;
    }

    public void c(Object obj) {
        this.f46553a = obj;
    }

    public void e(boolean z) {
        this.f46555c = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean h() {
        return this.f46555c;
    }

    public boolean j() {
        return this.e;
    }

    public boolean g() {
        return (this.f46555c || this.e) ? false : true;
    }

    public qod c(Transformer transformer) {
        float[] fArr = {c(), b()};
        transformer.pointValuesToPixel(fArr);
        qod qodVar = new qod(fArr[0], fArr[1], this.f46554b);
        qodVar.a(this.f);
        qodVar.d(this.d);
        return qodVar;
    }

    public Entry a() {
        return this.f46554b;
    }

    public boolean i() {
        return this.f;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean d() {
        return this.d;
    }

    public void d(boolean z) {
        this.d = z;
    }
}
