package a43;

/* JADX INFO: loaded from: classes3.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(true, false, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1102b;

    /* synthetic */ a(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    a(boolean z14, boolean z15) {
        this.f1101a = z14;
        this.f1102b = z15;
    }
}
