package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ol extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20383e;

    static {
        bk bkVar = new bk("music_player_settings", 242);
        f20383e = bkVar;
        bkVar.e(new rc("music_source", 0, 0, 1.0d, 0.0d, "", false, zn.MUSIC_SOURCE));
        bkVar.e(new rc("music_source_data", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("channel_type", 2, 0, 1.0d, 0.0d, "", false, zn.MUSIC_CHANNELS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ol() {
        super(wb.b(242));
    }

    public ol(bk bkVar) {
        super(bkVar);
    }
}
