package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\t\u0010\u000e\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/text/LinesIterator;", "", "", "string", "", "<init>", "(Ljava/lang/CharSequence;)V", "state", "", "tokenStartIndex", "delimiterStartIndex", "delimiterLength", "hasNext", "", "next", "State", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zeo implements Iterator<String>, KMappedMarker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f54037c = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f54038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54039b;
    private int d;
    private final CharSequence e;
    private int j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/text/LinesIterator$State;", "", "<init>", "()V", "UNKNOWN", "", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class e {
        private e() {
        }

        public /* synthetic */ e(zcm zcmVar) {
            this();
        }
    }

    public zeo(CharSequence charSequence) {
        zcp.c(charSequence, "");
        this.e = charSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2;
        int i3 = this.d;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f54039b < 0) {
            this.d = 2;
            return false;
        }
        int length = this.e.length();
        int length2 = this.e.length();
        for (int i4 = this.j; i4 < length2; i4++) {
            char cCharAt = this.e.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < this.e.length() && this.e.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.d = 1;
                this.f54039b = i;
                this.f54038a = length;
                return true;
            }
        }
        i = -1;
        this.d = 1;
        this.f54039b = i;
        this.f54038a = length;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d = 0;
        int i = this.f54038a;
        int i2 = this.j;
        this.j = this.f54039b + i;
        return this.e.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
