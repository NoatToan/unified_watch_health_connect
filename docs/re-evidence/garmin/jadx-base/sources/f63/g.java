package f63;

import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf63/g;", "T", "Lf63/e;", "formatter", "Lkotlin/Function1;", "", "allSubFormatsNegative", "alwaysOutputSign", "<init>", "(Lf63/e;Le23/l;Z)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f69385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<T, Boolean> f69386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69387c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(e<? super T> eVar, l<? super T, Boolean> lVar, boolean z14) {
        eVar.getClass();
        lVar.getClass();
        this.f69385a = eVar;
        this.f69386b = lVar;
        this.f69387c = z14;
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        Character ch3;
        if (z14 || !this.f69386b.invoke(obj).booleanValue()) {
            ch3 = this.f69387c ? '+' : null;
        } else {
            ch3 = '-';
        }
        if (ch3 != null) {
            sb3.append(ch3.charValue());
        }
        this.f69385a.a(obj, sb3, z14 || (ch3 != null && ch3.charValue() == '-'));
    }
}
