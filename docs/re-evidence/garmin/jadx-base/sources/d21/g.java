package d21;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g implements l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f57296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f57297b;

    public g(l lVar, List list) {
        this.f57296a = lVar;
        this.f57297b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f57296a.invoke(this.f57297b.get(num.intValue()));
    }
}
