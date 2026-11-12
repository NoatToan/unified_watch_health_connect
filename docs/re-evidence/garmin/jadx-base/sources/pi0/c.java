package pi0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\f\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpi0/c;", "", "", "", "flags", "", "addBaseFlags", "<init>", "([IZ)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f137840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137841b;

    public /* synthetic */ c(int[] iArr, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? new int[0] : iArr, (i14 & 2) != 0 ? true : z14);
    }

    public c(int[] iArr, boolean z14) {
        iArr.getClass();
        this.f137840a = iArr;
        this.f137841b = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
