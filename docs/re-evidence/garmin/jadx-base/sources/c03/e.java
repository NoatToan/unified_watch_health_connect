package c03;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc03/g;", "<anonymous>", "()Lc03/g;"}, k = 3, mv = {1, 5, 1})
public final class e extends w implements e23.a<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, String str) {
        super(0);
        this.f22431a = dVar;
        this.f22432b = str;
    }

    @Override // e23.a
    public final g invoke() {
        return new b(this.f22431a.c().C1(this.f22432b));
    }
}
