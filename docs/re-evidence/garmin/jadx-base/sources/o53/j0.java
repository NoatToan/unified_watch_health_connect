package o53;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo53/j0;", "T", "Lo53/a;", "Lo53/i0;", "Lt13/g;", "parentContext", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lt13/g;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j0<T> extends a<T> implements i0<T> {
    public j0(t13.g gVar, boolean z14) {
        super(gVar, true, z14);
    }

    @Override // o53.i0
    public final Object await(t13.d<? super T> dVar) {
        Object objC = C(dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objC;
    }
}
