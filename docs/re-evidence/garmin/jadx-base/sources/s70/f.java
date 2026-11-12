package s70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f157691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f157692b;

    public f(e23.l lVar, List list) {
        this.f157691a = lVar;
        this.f157692b = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        return this.f157691a.invoke(this.f157692b.get(num.intValue()));
    }
}
