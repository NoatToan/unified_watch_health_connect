package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zyz extends Exception {
    private static final long serialVersionUID = 1;

    public zyz() {
    }

    public zyz(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        return message == null ? getClass().getSimpleName() : message;
    }
}
