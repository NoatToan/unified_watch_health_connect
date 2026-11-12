package u7;

import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f169374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f169375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f169376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f169377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f169379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f169381i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m<Object> mVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f169380h = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169379g = obj;
        this.f169381i |= Integer.MIN_VALUE;
        return m.f(this.f169380h, false, this);
    }
}
