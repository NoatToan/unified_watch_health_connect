package yt2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lad2/d;", "invoke", "()Lad2/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class b extends w implements e23.a<ad2.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<zi2.a> f199656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.a<? extends zi2.a> aVar) {
        super(0);
        this.f199656a = aVar;
    }

    @Override // e23.a
    public final ad2.d invoke() {
        return ad2.e.a(ve2.f.e(this.f199656a.invoke()));
    }
}
