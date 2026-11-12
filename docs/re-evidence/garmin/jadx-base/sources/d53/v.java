package d53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Ld53/v;", "Lc53/j;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements c53.j<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f57702a;

    public v(CharSequence charSequence) {
        this.f57702a = charSequence;
    }

    @Override // c53.j
    public final Iterator<String> iterator() {
        return new g(this.f57702a);
    }
}
