package com.xmlywind.volley;

/* JADX INFO: loaded from: classes22.dex */
public class c implements p {
    private final int a;
    private final float b;
    private final int c;
    private int d;
    private int e;

    public c() {
        this(10000, 2, 0.0f);
    }

    public c(int i, int i2, float f) {
        this.c = i;
        this.d = i;
        this.a = i2;
        this.b = f;
    }

    public c(int i, int i2, int i3, float f) {
        this.c = i;
        this.d = i2;
        this.a = i3;
        this.b = f;
    }

    @Override // com.xmlywind.volley.p
    public int a() {
        return this.d;
    }

    @Override // com.xmlywind.volley.p
    public void a(s sVar) throws s {
        this.e++;
        int i = this.d;
        this.d = i + ((int) (i * this.b));
        if (!d()) {
            throw sVar;
        }
    }

    @Override // com.xmlywind.volley.p
    public int b() {
        return this.e;
    }

    @Override // com.xmlywind.volley.p
    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.e <= this.a;
    }
}
