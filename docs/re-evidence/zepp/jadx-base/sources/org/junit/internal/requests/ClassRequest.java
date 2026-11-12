package org.junit.internal.requests;

import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Request;
import org.junit.runner.Runner;

/* JADX INFO: loaded from: classes23.dex */
public class ClassRequest extends Request {
    private final Object a;
    private final Class<?> b;
    private final boolean c;
    private volatile Runner d;

    public ClassRequest(Class<?> cls, boolean z) {
        this.a = new Object();
        this.b = cls;
        this.c = z;
    }

    @Override // org.junit.runner.Request
    public Runner getRunner() {
        if (this.d == null) {
            synchronized (this.a) {
                if (this.d == null) {
                    this.d = new AllDefaultPossibilitiesBuilder(this.c).safeRunnerForClass(this.b);
                }
            }
        }
        return this.d;
    }

    public ClassRequest(Class<?> cls) {
        this(cls, true);
    }
}
