package d53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ld53/g;", "", "", "", "string", "<init>", "(Ljava/lang/CharSequence;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements Iterator<String>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f57683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57687e;

    static {
        new a(null);
    }

    public g(CharSequence charSequence) {
        charSequence.getClass();
        this.f57683a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i14;
        int i15;
        int i16 = this.f57684b;
        if (i16 != 0) {
            return i16 == 1;
        }
        if (this.f57687e < 0) {
            this.f57684b = 2;
            return false;
        }
        CharSequence charSequence = this.f57683a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i17 = this.f57685c; i17 < length2; i17++) {
            char cCharAt = charSequence.charAt(i17);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i14 = (cCharAt == '\r' && (i15 = i17 + 1) < charSequence.length() && charSequence.charAt(i15) == '\n') ? 2 : 1;
                length = i17;
                this.f57684b = 1;
                this.f57687e = i14;
                this.f57686d = length;
                return true;
            }
        }
        i14 = -1;
        this.f57684b = 1;
        this.f57687e = i14;
        this.f57686d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            c22.t.g();
            return null;
        }
        this.f57684b = 0;
        int i14 = this.f57686d;
        int i15 = this.f57685c;
        this.f57685c = this.f57687e + i14;
        return this.f57683a.subSequence(i15, i14).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ld53/g$a;", "", "<init>", "()V", "", "UNKNOWN", "I", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
