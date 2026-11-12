package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ezo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f17233b;
    public int c;
    public int d;
    public olq e = olq.a();

    public int a(int i) {
        return i + this.f17233b.getInt(i);
    }

    public int b(int i) {
        if (i < this.d) {
            return this.f17233b.getShort(this.c + i);
        }
        return 0;
    }

    public void c(int i, ByteBuffer byteBuffer) {
        this.f17233b = byteBuffer;
        if (byteBuffer == null) {
            this.f17232a = 0;
            this.c = 0;
            this.d = 0;
        } else {
            this.f17232a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            this.d = this.f17233b.getShort(i2);
        }
    }

    public int d(int i) {
        int i2 = i + this.f17232a;
        return i2 + this.f17233b.getInt(i2) + 4;
    }

    public int e(int i) {
        int i2 = i + this.f17232a;
        return this.f17233b.getInt(i2 + this.f17233b.getInt(i2));
    }
}
