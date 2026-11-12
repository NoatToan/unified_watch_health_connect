package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rfe extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f32490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32491b;

    public rfe(InputStream inputStream, int i) {
        this.f32490a = inputStream;
        this.f32491b = i;
    }

    public int a() {
        return this.f32491b;
    }

    public void b(boolean z) {
        InputStream inputStream = this.f32490a;
        if (inputStream instanceof m7d) {
            ((m7d) inputStream).d(z);
        }
    }
}
