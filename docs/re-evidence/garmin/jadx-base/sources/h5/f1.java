package h5;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final h4.r.c a(j jVar, int i14) {
        h4.r.c child = jVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i14) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & 2) != 0) {
                return null;
            }
            if ((kindSet & i14) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
