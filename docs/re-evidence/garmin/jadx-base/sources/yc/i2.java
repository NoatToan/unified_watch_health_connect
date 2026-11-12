package yc;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"Lyc/i2;", "Lyc/h2$a;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i2 extends h2.a<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<x.a<Object>> f196059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f196060b;

    /* JADX WARN: Multi-variable type inference failed */
    public i2(o53.j<? super x.a<Object>> jVar, boolean z14) {
        this.f196059a = jVar;
        this.f196060b = z14;
    }

    @Override // yc.h2.a
    public final void a(Object obj, List list) {
        list.getClass();
        int i14 = o13.q.f128596b;
        boolean z14 = this.f196060b;
        this.f196059a.resumeWith(new x.a(list, z14 ? null : obj, z14 ? obj : null, 0, 0, 24, null));
    }
}
