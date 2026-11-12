package u7;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
public final class b1<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f169092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f169093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileLock f169094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f169095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f169096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f169097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f169098g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(w0 w0Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f169097f = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169096e = obj;
        this.f169098g |= Integer.MIN_VALUE;
        return this.f169097f.a(null, this);
    }
}
