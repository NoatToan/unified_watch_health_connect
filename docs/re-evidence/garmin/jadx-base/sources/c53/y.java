package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class y extends p005kotlin.jvm.internal.q implements e23.l<Iterable<Object>, Iterator<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f24588a = new y();

    public y() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // e23.l
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        iterable2.getClass();
        return iterable2.iterator();
    }
}
