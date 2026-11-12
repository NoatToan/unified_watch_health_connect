package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/n4;", "", "Key", "Value", "Lkotlin/Function0;", "Lyc/h3;", "Lo53/z;", "dispatcher", "delegate", "<init>", "(Lo53/z;Le23/a;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n4<Key, Value> implements e23.a<h3<Key, Value>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.z f196280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<h3<Key, Value>> f196281b;

    /* JADX WARN: Multi-variable type inference failed */
    public n4(o53.z zVar, e23.a<? extends h3<Key, Value>> aVar) {
        zVar.getClass();
        aVar.getClass();
        this.f196280a = zVar;
        this.f196281b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        return this.f196281b.invoke();
    }
}
