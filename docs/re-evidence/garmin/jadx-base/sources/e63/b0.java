package e63;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le63/b0;", "Target", "Le63/a;", "", "Le63/b;", "accessor", "minValue", "maxValue", "", "name", "defaultValue", "Le63/m;", "sign", "<init>", "(Le63/b;IILjava/lang/String;Ljava/lang/Integer;Le63/m;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0<Target> extends a<Target, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<Target, Integer> f63229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f63232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f63233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m<Target> f63234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63235g;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(b<? super Target, Integer> bVar, int i14, int i15, String str, Integer num, m<? super Target> mVar) {
        int i16;
        bVar.getClass();
        str.getClass();
        this.f63229a = bVar;
        this.f63230b = i14;
        this.f63231c = i15;
        this.f63232d = str;
        this.f63233e = num;
        this.f63234f = mVar;
        if (i15 < 10) {
            i16 = 1;
        } else if (i15 < 100) {
            i16 = 2;
        } else {
            if (i15 >= 1000) {
                vb.h.s(e0.f(i15, "Max value ", " is too large"));
                throw null;
            }
            i16 = 3;
        }
        this.f63235g = i16;
    }

    @Override // e63.n
    public final b<Target, Integer> a() {
        return this.f63229a;
    }

    @Override // e63.n
    public final m<Target> b() {
        return this.f63234f;
    }

    @Override // e63.n
    public final Object getDefaultValue() {
        return this.f63233e;
    }

    @Override // e63.n
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF63232d() {
        return this.f63232d;
    }

    public /* synthetic */ b0(b bVar, int i14, int i15, String str, Integer num, m mVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this(bVar, i14, i15, (i16 & 8) != 0 ? bVar.getF63275b() : str, (i16 & 16) != 0 ? null : num, (i16 & 32) != 0 ? null : mVar);
    }
}
