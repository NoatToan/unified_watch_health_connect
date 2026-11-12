package gm0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import vh.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.graphql.data.datasource.GraphQLQueryDataSource", f = "GraphQLQueryDataSource.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "triggerServerCallSync", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f78005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a<s0.a, hm0.a> f78006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a<s0.a, hm0.a> aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f78006b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f78005a = obj;
        this.f78007c |= Integer.MIN_VALUE;
        int i14 = a.f77987d;
        return this.f78006b.l(null, null, this);
    }
}
