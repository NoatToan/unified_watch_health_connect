package tn2;

import java.util.concurrent.Callable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a1<V> implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.i f165524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f165525b;

    public a1(rn2.i iVar, boolean z14) {
        this.f165524a = iVar;
        this.f165525b = z14;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return q03.r.f(new y0.c(this.f165524a, this.f165525b, y0.a.NEED_DELETION_AND_CALL_CENTER));
    }
}
