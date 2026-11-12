package h5;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f81927a = new a();

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"h5/o$a", "Ljava/util/Comparator;", "Lh5/e0;", "Lkotlin/Comparator;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Comparator<e0> {
        @Override // java.util.Comparator
        public final int compare(e0 e0Var, e0 e0Var2) {
            e0 e0Var3 = e0Var;
            e0 e0Var4 = e0Var2;
            int iH = p005kotlin.jvm.internal.s.h(e0Var3.f81776p, e0Var4.f81776p);
            return iH != 0 ? iH : p005kotlin.jvm.internal.s.h(e0Var3.hashCode(), e0Var4.hashCode());
        }
    }
}
