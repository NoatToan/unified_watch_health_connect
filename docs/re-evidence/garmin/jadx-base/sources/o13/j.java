package o13;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lo13/j;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements Comparable<j> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f128583e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f128587d;

    static {
        new a(null);
        int i14 = k.f128588a;
        f128583e = new j(2, 3, 21);
    }

    public j(int i14, int i15, int i16) {
        this.f128584a = i14;
        this.f128585b = i15;
        this.f128586c = i16;
        if (i14 >= 0 && i14 < 256 && i15 >= 0 && i15 < 256 && i16 >= 0 && i16 < 256) {
            this.f128587d = (i14 << 16) + (i15 << 8) + i16;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i14 + '.' + i15 + '.' + i16).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j jVar2 = jVar;
        jVar2.getClass();
        return this.f128587d - jVar2.f128587d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j jVar = obj instanceof j ? (j) obj : null;
        return jVar != null && this.f128587d == jVar.f128587d;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF128587d() {
        return this.f128587d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f128584a);
        sb3.append('.');
        sb3.append(this.f128585b);
        sb3.append('.');
        sb3.append(this.f128586c);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo13/j$a;", "", "<init>", "()V", "", "MAX_COMPONENT_VALUE", "I", "Lo13/j;", "CURRENT", "Lo13/j;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j(int i14, int i15) {
        this(i14, i15, 0);
    }
}
