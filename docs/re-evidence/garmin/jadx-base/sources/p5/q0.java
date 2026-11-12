package p5;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp5/q0;", "Ljava/util/Comparator;", "Lo13/p;", "Ln4/d;", "", "Lp5/y;", "Lkotlin/Comparator;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 implements Comparator<o13.p<? extends n4.d, ? extends List<y>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f136090a = new q0();

    private q0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(o13.p<? extends n4.d, ? extends List<y>> pVar, o13.p<? extends n4.d, ? extends List<y>> pVar2) {
        o13.p<? extends n4.d, ? extends List<y>> pVar3 = pVar;
        o13.p<? extends n4.d, ? extends List<y>> pVar4 = pVar2;
        int iCompare = Float.compare(((n4.d) pVar3.f128594a).f123548b, ((n4.d) pVar4.f128594a).f123548b);
        return iCompare != 0 ? iCompare : Float.compare(((n4.d) pVar3.f128594a).f123550d, ((n4.d) pVar4.f128594a).f123550d);
    }
}
