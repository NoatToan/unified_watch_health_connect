package kotlin;

import e23.a;
import nd.c;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class x1 extends w implements a<p005kotlin.Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f91642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f91643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(boolean z14, c cVar, String str) {
        super(0);
        this.f91642a = z14;
        this.f91643b = cVar;
        this.f91644c = str;
    }

    @Override // e23.a
    public final p005kotlin.Unit invoke() {
        if (this.f91642a) {
            c cVar = this.f91643b;
            String str = this.f91644c;
            cVar.getClass();
            str.getClass();
            qd.a aVar = cVar.f125383a;
            synchronized (aVar.f144456c) {
            }
        }
        return p005kotlin.Unit.INSTANCE;
    }
}
