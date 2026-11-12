package m9;

import java.lang.reflect.Method;
import java.util.function.Predicate;
import org.apache.commons.lang3.exception.DefaultExceptionContext;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f117214b;

    public /* synthetic */ a(String str, int i14) {
        this.f117213a = i14;
        this.f117214b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f117213a) {
            case 0:
                return this.f117214b.equals((String) obj);
            case 1:
                return DefaultExceptionContext.lambda$setContextValue$0(this.f117214b, (Pair) obj);
            case 2:
                return MethodUtils.lambda$getMatchingMethod$0(this.f117214b, (Method) obj);
            default:
                return MethodUtils.lambda$getMatchingMethod$1(this.f117214b, (Method) obj);
        }
    }
}
