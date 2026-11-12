package p5;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp5/j;", "Ljava/util/Comparator;", "Lp5/y;", "Lkotlin/Comparator;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements Comparator<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f136021a = new j();

    private j() {
    }

    @Override // java.util.Comparator
    public final int compare(y yVar, y yVar2) {
        n4.d dVarH = yVar.h();
        n4.d dVarH2 = yVar2.h();
        int iCompare = Float.compare(dVarH.f123547a, dVarH2.f123547a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(dVarH.f123548b, dVarH2.f123548b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(dVarH.f123550d, dVarH2.f123550d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(dVarH.f123549c, dVarH2.f123549c);
    }
}
