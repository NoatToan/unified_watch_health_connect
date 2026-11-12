package y12;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f194034a;

    public d(List list) {
        this.f194034a = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        this.f194034a.get(num.intValue());
        return null;
    }
}
