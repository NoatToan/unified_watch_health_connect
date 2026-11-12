package kotlin;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import q3.c;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li5/g4;", "T", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Reference<T>> f91195a = new c<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<T> f91196b = new ReferenceQueue<>();
}
