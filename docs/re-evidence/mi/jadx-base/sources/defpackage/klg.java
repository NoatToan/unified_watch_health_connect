package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class klg extends ifl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f23961a;

    public klg(ThreadFactory threadFactory) {
        this.f23961a = threadFactory;
    }

    @Override // defpackage.ifl
    public ifl.a a() {
        return new mlg(this.f23961a);
    }
}
