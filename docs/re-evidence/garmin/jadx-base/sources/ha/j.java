package ha;

import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82611a;

    public /* synthetic */ j(int i14) {
        this.f82611a = i14;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f82611a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            default:
                return true;
        }
    }
}
