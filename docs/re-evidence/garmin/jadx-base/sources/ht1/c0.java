package ht1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c0 implements e23.l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f85543a;

    public c0(List list) {
        this.f85543a = list;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        this.f85543a.get(num.intValue());
        return null;
    }
}
