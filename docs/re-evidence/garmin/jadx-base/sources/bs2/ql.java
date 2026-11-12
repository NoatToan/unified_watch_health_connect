package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ql extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20436e;

    static {
        bk bkVar = new bk("music_user_behavior", 292);
        f20436e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("music_event", 0, 140, 1.0d, 0.0d, "", false, zn.MUSIC_EVENT));
        bkVar.e(new rc("music_popup", 1, 0, 1.0d, 0.0d, "", false, zn.MUSIC_POPUP));
        bkVar.e(new rc("music_source", 2, 0, 1.0d, 0.0d, "", false, zn.MUSIC_SOURCE));
        bkVar.e(new rc("music_entry_point", 3, 0, 1.0d, 0.0d, "", false, zn.MUSIC_ENTRY_POINT));
        bkVar.e(new rc("headphone_pairing_entry_point", 4, 0, 1.0d, 0.0d, "", false, zn.HEADPHONE_PAIRING_ENTRY_POINT));
        bkVar.e(new rc("music_category", 5, 0, 1.0d, 0.0d, "", false, zn.MUSIC_CATEGORY));
        zn znVar = zn.STRING;
        bkVar.e(new rc("music_provider", 6, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("ciq_app_id", 7, 2, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("num_songs", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("hp_name", 9, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("address", 10, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("music_option_entry_point", 11, 0, 1.0d, 0.0d, "", false, zn.MUSIC_OPTION_ENTRY_POINT));
        bkVar.e(new rc("music_source_entry_point", 12, 0, 1.0d, 0.0d, "", false, zn.MUSIC_SOURCE_ENTRY_POINT));
        bkVar.e(new rc("music_storage", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ql() {
        super(wb.b(292));
    }

    public ql(bk bkVar) {
        super(bkVar);
    }
}
