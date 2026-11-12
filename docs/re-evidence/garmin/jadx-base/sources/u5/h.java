package u5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu5/h;", "Lu5/f;", "", "text", "Lu5/g;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;Lu5/g;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f168640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f168641b;

    public h(CharSequence charSequence, g gVar) {
        this.f168640a = charSequence;
        this.f168641b = gVar;
    }

    @Override // u5.f
    public final int a(int i14) {
        do {
            i14 = this.f168641b.i(i14);
            if (i14 == -1 || i14 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f168640a.charAt(i14 - 1)));
        return i14;
    }

    @Override // u5.f
    public final int b(int i14) {
        CharSequence charSequence;
        do {
            i14 = this.f168641b.h(i14);
            if (i14 != -1) {
                charSequence = this.f168640a;
                if (i14 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i14)));
        return i14;
    }

    @Override // u5.f
    public final int c(int i14) {
        do {
            i14 = this.f168641b.i(i14);
            if (i14 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f168640a.charAt(i14)));
        return i14;
    }

    @Override // u5.f
    public final int d(int i14) {
        do {
            i14 = this.f168641b.h(i14);
            if (i14 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f168640a.charAt(i14 - 1)));
        return i14;
    }
}
