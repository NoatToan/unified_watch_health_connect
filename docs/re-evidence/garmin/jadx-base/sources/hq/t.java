package hq;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f85149a;

    public t(List list) {
        this.f85149a = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        this.f85149a.get(num.intValue());
        return null;
    }
}
