package zn2;

import com.garmin.garminpay.wallet.GetAvailableSpaceException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s3<T> implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Integer> f205813a;

    /* JADX WARN: Multi-variable type inference failed */
    public s3(o53.j<? super Integer> jVar) {
        this.f205813a = jVar;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        Integer num = (Integer) obj;
        o53.j<Integer> jVar = this.f205813a;
        if (num == null) {
            int i14 = o13.q.f128596b;
            jVar.resumeWith(new o13.q.b(new GetAvailableSpaceException()));
        } else {
            int i15 = o13.q.f128596b;
            jVar.resumeWith(num);
        }
    }
}
