package ut0;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f172564a;

    public d(List list) {
        this.f172564a = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        this.f172564a.get(num.intValue());
        return null;
    }
}
