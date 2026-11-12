package u7;

import java.io.FileInputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
public final class i0<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f169160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0<T> f169162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0<T> j0Var, t13.d<? super i0> dVar) {
        super(dVar);
        this.f169162d = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169161c = obj;
        this.f169163e |= Integer.MIN_VALUE;
        return j0.f(this.f169162d, this);
    }
}
