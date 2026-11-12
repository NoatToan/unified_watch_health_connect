package s3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls3/d;", "", "", "Ls3/i;", "table", "", TtmlNode.START, TtmlNode.END, "<init>", "(Ls3/i;II)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements Iterator<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156326d;

    public d(i iVar, int i14, int i15) {
        this.f156323a = iVar;
        this.f156324b = i15;
        this.f156325c = i14;
        this.f156326d = iVar.f156355h;
        if (iVar.f156354g) {
            k.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f156325c < this.f156324b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        i iVar = this.f156323a;
        int i14 = iVar.f156355h;
        int i15 = this.f156326d;
        if (i14 != i15) {
            k.g();
        }
        int i16 = this.f156325c;
        this.f156325c = k.a(i16, iVar.f156348a) + i16;
        return new j(iVar, i16, i15);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
