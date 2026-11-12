package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ab3 extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public ab3(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
