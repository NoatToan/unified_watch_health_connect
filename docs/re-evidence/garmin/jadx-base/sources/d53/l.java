package d53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld53/l;", "Ld53/e;", "", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum l implements e {
    IGNORE_CASE(2, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57701a;

    /* synthetic */ l(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i16 & 2) != 0 ? i14 : i15);
    }

    @Override // d53.e
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final int getF57701a() {
        return this.f57701a;
    }

    l(int i14, int i15) {
        this.f57701a = i14;
    }
}
