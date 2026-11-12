package v50;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h implements l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f175752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f175753b;

    public h(l lVar, List list) {
        this.f175752a = lVar;
        this.f175753b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f175752a.invoke(this.f175753b.get(num.intValue()));
    }
}
