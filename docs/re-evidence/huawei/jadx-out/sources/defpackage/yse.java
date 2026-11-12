package defpackage;

import com.iabtcf.utils.IntIterable;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes46.dex */
public final /* synthetic */ class yse implements IntPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntIterable f53803a;

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return this.f53803a.contains(i);
    }
}
