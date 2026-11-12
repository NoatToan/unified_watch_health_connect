package defpackage;

import com.huami.wallet.lib.entity.Resource;
import io.reactivex.functions.Predicate;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class oe0 implements Predicate {
    public static final /* synthetic */ oe0 a = new oe0();

    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        return ((Resource) obj).isCompleted();
    }
}
