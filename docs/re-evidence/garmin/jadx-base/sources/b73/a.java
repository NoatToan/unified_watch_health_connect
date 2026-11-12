package b73;

import java.util.List;
import java.util.function.BinaryOperator;
import org.apache.commons.lang3.stream.Streams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16371a;

    public /* synthetic */ a(int i14) {
        this.f16371a = i14;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        switch (this.f16371a) {
            case 0:
                return Streams.ArrayCollector.lambda$combiner$0(list, list2);
            default:
                return org.apache.commons.lang3.Streams.ArrayCollector.lambda$combiner$0(list, list2);
        }
    }
}
