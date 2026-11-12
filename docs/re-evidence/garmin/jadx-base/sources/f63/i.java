package f63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf63/i;", "T", "Lf63/e;", "formatter", "", "padding", "<init>", "(Lf63/e;I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f69391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69392b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(e<? super T> eVar, int i14) {
        eVar.getClass();
        this.f69391a = eVar;
        this.f69392b = i14;
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        StringBuilder sb4 = new StringBuilder();
        this.f69391a.a(obj, sb4, z14);
        String string = sb4.toString();
        int length = this.f69392b - string.length();
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(' ');
        }
        sb3.append((CharSequence) string);
    }
}
