package yg1;

/* JADX INFO: loaded from: classes10.dex */
public class i extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f196932b;

    private i() {
    }

    public static synchronized i M() {
        try {
            if (f196932b == null) {
                f196932b = new i();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f196932b;
    }
}
