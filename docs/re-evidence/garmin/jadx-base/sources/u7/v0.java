package u7;

import java.io.FileOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock")
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f169331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f169332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.a f169334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0.a aVar, t13.d<? super v0> dVar) {
        super(dVar);
        this.f169334d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169333c = obj;
        this.f169335e |= Integer.MIN_VALUE;
        return w0.a.a(this.f169334d, null, this);
    }
}
