package bs2;

import com.google.mlkit.common.MlKitException;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class yc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20687e;

    static {
        bk bkVar = new bk("field_description", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
        f20687e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("developer_data_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("field_definition_number", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fit_base_type_id", 2, 2, 1.0d, 0.0d, "", false, zn.FIT_BASE_TYPE));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("field_name", 3, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("array", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("components", 5, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("scale", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 7, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("units", 8, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bits", 9, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accumulate", 10, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("fit_base_unit_id", 13, 132, 1.0d, 0.0d, "", false, zn.FIT_BASE_UNIT));
        bkVar.e(new rc("native_mesg_num", 14, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("native_field_num", 15, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public yc() {
        super(wb.b(MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR));
    }

    public final Byte r() {
        pw pwVarH;
        Object objJ;
        rc rcVarG = g(7);
        if (rcVarG != null && (((pwVarH = rcVarG.h(65535)) == null || pwVarH.c(this)) && (objJ = rcVarG.j(rcVarG.h(65535))) != null)) {
            return Byte.valueOf(((Number) objJ).byteValue());
        }
        return null;
    }

    public yc(bk bkVar) {
        super(bkVar);
    }
}
