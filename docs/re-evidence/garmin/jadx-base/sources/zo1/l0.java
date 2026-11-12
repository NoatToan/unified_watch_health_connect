package zo1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f206399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f206400b;

    public l0(e23.l lVar, List list) {
        this.f206399a = lVar;
        this.f206400b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f206399a.invoke(this.f206400b.get(num.intValue()));
    }
}
