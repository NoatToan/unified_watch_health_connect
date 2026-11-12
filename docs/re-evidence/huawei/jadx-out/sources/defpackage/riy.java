package defpackage;

import java.util.Optional;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class riy implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
