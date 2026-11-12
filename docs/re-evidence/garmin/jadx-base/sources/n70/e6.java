package n70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e6 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ww1.t> f124186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<xw1.p> f124187b;

    public e6(List<ww1.t> list, List<xw1.p> list2) {
        this.f124186a = list;
        this.f124187b = list2;
    }

    @Override // e23.a
    public final Boolean invoke() {
        return Boolean.valueOf((this.f124186a.isEmpty() || this.f124187b.isEmpty()) ? false : true);
    }
}
