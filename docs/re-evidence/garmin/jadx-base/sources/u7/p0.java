package u7;

import java.io.FileOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f169284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileOutputStream f169285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0<Object> f169287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0<Object> q0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f169287d = q0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169286c = obj;
        this.f169288e |= Integer.MIN_VALUE;
        return this.f169287d.b(null, this);
    }
}
