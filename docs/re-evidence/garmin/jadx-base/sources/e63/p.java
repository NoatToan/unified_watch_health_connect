package e63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le63/p;", "Target", "Type", "Le63/a;", "Le63/b;", "accessor", "", "name", "defaultValue", "Le63/m;", "sign", "<init>", "(Le63/b;Ljava/lang/String;Ljava/lang/Object;Le63/m;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p<Target, Type> extends a<Target, Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<Target, Type> f63255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f63257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m<Target> f63258d;

    public /* synthetic */ p(b bVar, String str, Object obj, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? bVar.getF63275b() : str, (i14 & 4) != 0 ? null : obj, (i14 & 8) != 0 ? null : mVar);
    }

    @Override // e63.n
    public final b<Target, Type> a() {
        return this.f63255a;
    }

    @Override // e63.n
    public final m<Target> b() {
        return this.f63258d;
    }

    @Override // e63.n
    public final Type getDefaultValue() {
        return this.f63257c;
    }

    @Override // e63.n
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF63256b() {
        return this.f63256b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(b<? super Target, Type> bVar, String str, Type type, m<? super Target> mVar) {
        bVar.getClass();
        str.getClass();
        this.f63255a = bVar;
        this.f63256b = str;
        this.f63257c = type;
        this.f63258d = mVar;
    }
}
