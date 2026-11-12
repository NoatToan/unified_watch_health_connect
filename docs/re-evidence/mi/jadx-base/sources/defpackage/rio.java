package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rio extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32578a;

    public rio() {
        this(null);
    }

    public rio(OutputStream outputStream) {
        super(outputStream);
        this.f32578a = new Object();
    }
}
