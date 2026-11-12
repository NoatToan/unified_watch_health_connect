package o53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f129330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f129331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129332c;

    public e(t13.d<? super e> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129331b = obj;
        this.f129332c |= Integer.MIN_VALUE;
        return g8.i.Q(null, this);
    }
}
