package defpackage;

import androidx.media3.datasource.cache.CacheDataSink;

/* JADX INFO: loaded from: classes15.dex */
public class qht {
    private int e = 1;
    private int g = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46250a = 170;
    private int d = CacheDataSink.DEFAULT_BUFFER_SIZE;
    private int h = 110;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46251b = 720;
    private int j = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46252c = 20;

    public boolean d(int i, int i2, int i3) {
        if (i < 0 || i > 2 || i2 < 30 || i2 > 200 || i3 < 100 || i3 > 300) {
            return false;
        }
        this.e = i;
        this.g = i2;
        this.f46250a = i3;
        return true;
    }

    public boolean d(int[] iArr) {
        if (iArr == null || iArr.length != 5) {
            return false;
        }
        for (int i : iArr) {
            if (i <= 0) {
                return false;
            }
        }
        this.d = iArr[0];
        this.h = iArr[1];
        this.f46251b = iArr[2];
        this.j = iArr[3];
        this.f46252c = iArr[4];
        return true;
    }

    public int[] d() {
        return new int[]{this.e, this.g, this.f46250a, this.d, this.h, this.f46251b, this.j, this.f46252c};
    }
}
