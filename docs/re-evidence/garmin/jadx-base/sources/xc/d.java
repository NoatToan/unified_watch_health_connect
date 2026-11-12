package xc;

import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxc/d;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f189889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f189890b;

    public d(a aVar, e eVar) {
        this.f189889a = aVar;
        this.f189890b = eVar;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f189889a.h();
        this.f189890b.f189895e = null;
    }
}
