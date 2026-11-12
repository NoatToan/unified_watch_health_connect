package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class s10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20473e;

    static {
        bk bkVar = new bk("voice_assistant_settings", 466);
        f20473e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("local_assistant_enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("phone_assistant_enabled", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gesture_enabled", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("language_locale", 3, 0, 1.0d, 0.0d, "", false, zn.LANGUAGE_DIALECT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public s10() {
        super(wb.b(466));
    }

    public s10(bk bkVar) {
        super(bkVar);
    }
}
