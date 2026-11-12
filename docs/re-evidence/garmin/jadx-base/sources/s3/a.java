package s3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls3/a;", "Ls3/n;", "", "group", "<init>", "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156317a;

    public a(int i14) {
        super(null);
        this.f156317a = i14;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f156317a == this.f156317a;
    }

    public final int hashCode() {
        return this.f156317a * 31;
    }
}
