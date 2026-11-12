package b53;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb53/v;", "Lb53/a;", "Lkotlin/jvm/internal/t;", "Lk23/e;", "classifier", "", "Lk23/r;", "arguments", "", "isMarkedNullable", "", "annotations", "Lk23/p;", "abbreviation", "isDefinitelyNotNullType", "isNothingType", "isSuspendFunctionType", "Lk23/d;", "mutableCollectionClass", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lk23/e;Ljava/util/List;ZLjava/util/List;Lk23/p;ZZZLk23/d;Le23/a;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.e f16153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k23.r> f16154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Annotation> f16156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k23.p f16157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k23.d<?> f16161j;

    public /* synthetic */ v(k23.e eVar, List list, boolean z14, List list2, k23.p pVar, boolean z15, boolean z16, boolean z17, k23.d dVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, list, z14, list2, pVar, z15, z16, z17, dVar, (i14 & 512) != 0 ? null : aVar);
    }

    @Override // b53.a
    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getF16160i() {
        return this.f16160i;
    }

    @Override // b53.a
    public final a E() {
        return null;
    }

    @Override // b53.a
    public final a F(boolean z14) {
        return new v(this.f16153b, this.f16154c, this.f16155d && !z14, this.f16156e, this.f16157f, z14, this.f16159h, this.f16160i, this.f16161j, null, 512, null);
    }

    @Override // b53.a
    public final a G(boolean z14) {
        return new v(this.f16153b, this.f16154c, z14, this.f16156e, this.f16157f, false, this.f16159h, this.f16160i, this.f16161j, null, 512, null);
    }

    @Override // b53.a
    public final a H() {
        return null;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final k23.p getF16157f() {
        return this.f16157f;
    }

    @Override // b53.a
    public final k23.d<?> e() {
        return this.f16161j;
    }

    @Override // k23.p
    /* JADX INFO: renamed from: g, reason: from getter */
    public final k23.e getF16153b() {
        return this.f16153b;
    }

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        return this.f16156e;
    }

    @Override // k23.p
    public final List<k23.r> h() {
        return this.f16154c;
    }

    @Override // k23.p
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF16155d() {
        return this.f16155d;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF16158g() {
        return this.f16158g;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getF16159h() {
        return this.f16159h;
    }

    @Override // b53.a
    public final boolean t() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(k23.e eVar, List<k23.r> list, boolean z14, List<? extends Annotation> list2, k23.p pVar, boolean z15, boolean z16, boolean z17, k23.d<?> dVar, e23.a<? extends Type> aVar) {
        super(aVar);
        eVar.getClass();
        list.getClass();
        list2.getClass();
        this.f16153b = eVar;
        this.f16154c = list;
        this.f16155d = z14;
        this.f16156e = list2;
        this.f16157f = pVar;
        this.f16158g = z15;
        this.f16159h = z16;
        this.f16160i = z17;
        this.f16161j = dVar;
    }
}
