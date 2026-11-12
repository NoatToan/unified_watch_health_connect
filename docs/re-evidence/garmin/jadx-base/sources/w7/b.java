package w7;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f183425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f183426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a<Object> f183427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f183428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a<Object> aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f183427c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183426b = obj;
        this.f183428d |= Integer.MIN_VALUE;
        return this.f183427c.a(null, this);
    }
}
