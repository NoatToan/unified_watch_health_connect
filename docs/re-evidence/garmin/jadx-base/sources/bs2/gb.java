package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class gb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20157e;

    static {
        bk bkVar = new bk("exd_data_concept_configuration", 202);
        f20157e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("screen_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BYTE;
        bkVar.e(new rc("concept_field", 1, 13, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(2).f20459h.add(new vc(2, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(2).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.e(new rc("field_id", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("concept_index", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("data_page", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("concept_key", 5, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("scaling", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("data_units", 8, 0, 1.0d, 0.0d, "", false, zn.EXD_DATA_UNITS));
        bkVar.e(new rc("qualifier", 9, 0, 1.0d, 0.0d, "", false, zn.EXD_QUALIFIERS));
        bkVar.e(new rc("descriptor", 10, 0, 1.0d, 0.0d, "", false, zn.EXD_DESCRIPTORS));
        bkVar.e(new rc("is_signed", 11, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar2));
    }

    public gb() {
        super(wb.b(202));
    }

    public gb(bk bkVar) {
        super(bkVar);
    }
}
