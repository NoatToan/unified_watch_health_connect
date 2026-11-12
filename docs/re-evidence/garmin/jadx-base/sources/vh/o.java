package vh;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lvh/o;", "", "", "name", "value", "", "isKey", "isPagination", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZ)V", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f178359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f178361d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/o$a;", "", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f178363b;

        public a(String str, Object obj) {
            str.getClass();
            this.f178362a = str;
            this.f178363b = obj;
        }

        public final o a() {
            return new o(this.f178362a, this.f178363b, false, false, (p005kotlin.jvm.internal.j) null);
        }
    }

    public /* synthetic */ o(String str, Object obj, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, obj, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
    }

    private o(String str, Object obj, boolean z14, boolean z15) {
        this.f178358a = str;
        this.f178359b = obj;
        this.f178360c = z14;
        this.f178361d = z15;
    }

    public /* synthetic */ o(String str, Object obj, boolean z14, boolean z15, p005kotlin.jvm.internal.j jVar) {
        this(str, obj, z14, z15);
    }

    public /* synthetic */ o(String str, Object obj, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, obj, (i14 & 4) != 0 ? false : z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public o(String str, Object obj, boolean z14) {
        this(str, obj, z14, false);
        str.getClass();
    }
}
