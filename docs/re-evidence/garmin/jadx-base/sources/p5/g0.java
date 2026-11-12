package p5;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class g0 extends p005kotlin.jvm.internal.w implements e23.l<List<Float>, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Float> f136015a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e23.a<Float> aVar) {
        super(1);
        this.f136015a = aVar;
    }

    @Override // e23.l
    public final Boolean invoke(List<Float> list) {
        boolean z14;
        List<Float> list2 = list;
        Float fInvoke = this.f136015a.invoke();
        if (fInvoke == null) {
            z14 = false;
        } else {
            list2.add(fInvoke);
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }
}
