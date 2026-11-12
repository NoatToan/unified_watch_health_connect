package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf5/v1$a;", "", "defaultValue", "invoke", "(Lf5/v1$a;F)Ljava/lang/Float;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class q extends p005kotlin.jvm.internal.w implements e23.p<v1.a, Float, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s[] f69022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s[] sVarArr) {
        super(2);
        this.f69022a = sVarArr;
    }

    @Override // e23.p
    public final Float invoke(v1.a aVar, Float f14) {
        return Float.valueOf(d2.a(aVar, true, this.f69022a, f14.floatValue()));
    }
}
