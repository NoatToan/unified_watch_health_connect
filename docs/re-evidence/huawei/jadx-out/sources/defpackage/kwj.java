package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwj {
    public static String d(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point.start_time,sample_point.end_time,sample_point.type_id,sample_point.client_id,max(sample_point.modified_time) as modified_time,");
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point"));
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int[] type = hiAggregateOption.getType();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.c(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point where sample_point.start_time >=? and sample_point.start_time <=?  and sample_point.merged");
        stringBuffer.append(z ? CommonUtil.EQUAL : " !=? ");
        if (hiAggregateOption.getModifiedEndTime() > 0) {
            kwe.d(stringBuffer, "sample_point");
        }
        b(stringBuffer, "sample_point");
        kwe.a("sample_point.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point.client_id", list, stringBuffer, strArr, i + type.length);
        if (groupUnitType == 0) {
            kwe.c(stringBuffer, "sample_point", "start_time");
        } else if (groupUnitType == 8) {
            kwe.c(stringBuffer, "sample_point", "client_id");
        } else {
            kwe.b(stringBuffer, "unit_index");
        }
        kwe.c(stringBuffer, "sample_point", "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String c(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point.start_time,sample_point.end_time,sample_point.type_id,sample_point.client_id,");
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point"));
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int[] type = hiAggregateOption.getType();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.c(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point where sample_point.start_time >=? and sample_point.start_time <=? ");
        if (z) {
            stringBuffer.append(" and sample_point.merged =? ");
        }
        kwe.a("sample_point.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point.client_id", list, stringBuffer, strArr, i + type.length);
        if (groupUnitType == 0) {
            kwe.c(stringBuffer, "sample_point", "start_time");
        } else if (groupUnitType == 8) {
            kwe.c(stringBuffer, "sample_point", "client_id");
        } else {
            kwe.b(stringBuffer, "unit_index");
        }
        kwe.c(stringBuffer, "sample_point", "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String b(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z, kth kthVar) {
        HiDataFilter hiDataFilter;
        if (kthVar == null || TextUtils.isEmpty(kthVar.b())) {
            hiDataFilter = null;
        } else {
            try {
                hiDataFilter = (HiDataFilter) HiJsonUtil.d(kthVar.b(), HiDataFilter.class);
            } catch (JsonSyntaxException unused) {
                throw new JsonSyntaxException("not HiDataFilter param");
            }
        }
        HiDataFilter hiDataFilter2 = hiDataFilter;
        if (hiDataFilter2 != null) {
            return d(list, strArr, i, hiAggregateOption, z, hiDataFilter2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point_health.start_time,sample_point_health.end_time,sample_point_health.type_id,sample_point_health.client_id,sample_point_health.metadata,sample_point_health.timeZone,max(sample_point_health.modified_time) as modified_time,");
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point_health"));
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point_health where sample_point_health.start_time >=? and sample_point_health.start_time <=?  and sample_point_health.merged");
        stringBuffer.append(z ? CommonUtil.EQUAL : " !=? ");
        if (hiAggregateOption.getModifiedEndTime() > 0) {
            kwe.d(stringBuffer, "sample_point_health");
        }
        b(stringBuffer, "sample_point_health");
        kwe.a("sample_point_health.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point_health.client_id", list, stringBuffer, strArr, type.length + i);
        if (groupUnitType != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point_health", "start_time");
        }
        kwe.c(stringBuffer, "sample_point_health", "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    private static String d(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z, HiDataFilter hiDataFilter) {
        StringBuffer stringBuffer = new StringBuffer();
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int length = type.length;
        if (hiDataFilter.getFilterType() == 1) {
            stringBuffer.append(" select start_time,end_time,type_id,client_id,metadata,timeZone,max(modified_time) as modified_time,").append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), (String) null));
            for (int i2 = 0; i2 < length; i2++) {
                stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
                if (i2 < length - 1) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append(" from (");
        }
        stringBuffer.append(" select sample_point_health.start_time,sample_point_health.end_time,sample_point_health.type_id,sample_point_health.client_id,sample_point_health.metadata,sample_point_health.timeZone,max(sample_point_health.modified_time) as modified_time,");
        if (hiDataFilter.getFilterType() != 1) {
            stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point_health"));
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (hiDataFilter.getFilterType() == 1) {
                hiDataFilter.getFilterOptions().get(i3).setConstantsKey("type_id" + hiDataFilter.getFilterOptions().get(i3).getDataType());
                stringBuffer.append(kwe.a(1, type[i3], hiDataFilter.getFilterOptions().get(i3).getConstantsKey()));
            } else {
                stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), type[i3], constantsKey[i3]));
            }
            if (i3 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point_health where sample_point_health.start_time >=? and sample_point_health.start_time <=?  and sample_point_health.merged");
        stringBuffer.append(z ? CommonUtil.EQUAL : " !=? ");
        kwe.a("sample_point_health.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point_health.client_id", list, stringBuffer, strArr, i + type.length);
        if (hiDataFilter.getFilterType() == 1) {
            kwe.c(stringBuffer, "sample_point_health", "start_time");
            stringBuffer.append(" having ").append(kwb.d(hiDataFilter)).append(Constants.RIGHT_BRACKET_ONLY);
        }
        if (groupUnitType != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point_health", "start_time");
        }
        if (hiDataFilter.getFilterType() == 0) {
            stringBuffer.append(" having ").append(kwb.d(hiDataFilter));
        }
        if (hiDataFilter.getFilterType() == 1) {
            kwe.a(stringBuffer, "start_time", hiAggregateOption.getSortOrder());
        } else {
            kwe.c(stringBuffer, "sample_point_health", "start_time", hiAggregateOption.getSortOrder());
        }
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String e(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point_health_stress.start_time,sample_point_health_stress.end_time,sample_point_health_stress.type_id,max(sample_point_health_stress.modified_time) as modified_time,");
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point_health_stress"));
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.d(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point_health_stress where sample_point_health_stress.start_time >=? and sample_point_health_stress.start_time <=?  and sample_point_health_stress.merged");
        stringBuffer.append(z ? CommonUtil.EQUAL : " !=? ");
        if (hiAggregateOption.getModifiedEndTime() > 0) {
            kwe.d(stringBuffer, "sample_point_health_stress");
        }
        b(stringBuffer, "sample_point_health_stress");
        kwe.a("sample_point_health_stress.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point_health_stress.client_id", list, stringBuffer, strArr, i + type.length);
        if (groupUnitType != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point_health_stress", "start_time");
        }
        kwe.c(stringBuffer, "sample_point_health_stress", "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String e(List<Integer> list, String[] strArr, int i, int i2, int i3, String[] strArr2, int[] iArr, int i4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point_health_stress.start_time,sample_point_health_stress.end_time,sample_point_health_stress.type_id,");
        stringBuffer.append(kwe.b(i2, 1, "sample_point_health_stress"));
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(kwe.d(iArr[i5], i3, strArr2[i5]));
            if (i5 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point_health_stress where sample_point_health_stress.start_time >=? and sample_point_health_stress.start_time <=? and sample_point_health_stress.type_id =? and sample_point_health_stress.merged =? and sync_status !=? ");
        kwe.e("sample_point_health_stress.client_id", list, stringBuffer, strArr, i);
        if (i2 != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point_health_stress", "start_time");
        }
        kwe.c(stringBuffer, "sample_point_health_stress", "start_time", i4);
        return stringBuffer.toString();
    }

    public static String d(List<Integer> list, String[] strArr, int i, int i2, int i3, String[] strArr2, int[] iArr, int i4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point_health.start_time,sample_point_health.end_time,sample_point_health.type_id,");
        stringBuffer.append(kwe.b(i2, 1, "sample_point_health"));
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(kwe.a(iArr[i5], i3, strArr2[i5]));
            if (i5 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point_health where sample_point_health.start_time >=? and sample_point_health.start_time <=? and sample_point_health.type_id =? and sample_point_health.merged =? and sync_status !=? ");
        kwe.e("sample_point_health.client_id", list, stringBuffer, strArr, i);
        if (i2 != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point_health", "start_time");
        }
        kwe.c(stringBuffer, "sample_point_health", "start_time", i4);
        return stringBuffer.toString();
    }

    public static String c(List<Integer> list, String[] strArr, int i, int i2, int i3, String[] strArr2, int[] iArr, int i4, double d) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point_health.start_time,sample_point_health.end_time,sample_point_health.type_id,");
        stringBuffer.append(kwe.b(i2, 1, "sample_point_health"));
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(kwe.a(iArr[i5], i3, strArr2[i5]));
            if (i5 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point_health where sample_point_health.start_time >=? and sample_point_health.start_time <=? and sample_point_health.type_id =? and sample_point_health.value = ");
        stringBuffer.append(d).append(" and sample_point_health.merged =? and sync_status !=? ");
        kwe.e("sample_point_health.client_id", list, stringBuffer, strArr, i);
        if (i2 != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point_health", "start_time");
        }
        kwe.c(stringBuffer, "sample_point_health", "start_time", i4);
        return stringBuffer.toString();
    }

    public static String a(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point.start_time,sample_point.end_time,sample_point.type_id,");
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point"));
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.c(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from sample_point where sample_point.start_time >=? and sample_point.start_time <=? and sample_point.sync_status =? ");
        if (z) {
            stringBuffer.append(" and sample_point.merged =? ");
        }
        kwe.a("sample_point.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point.client_id", list, stringBuffer, strArr, i + type.length);
        if (groupUnitType != 0) {
            kwe.b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "sample_point", "start_time");
        }
        kwe.c(stringBuffer, "sample_point", "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0323  */
    /* JADX WARN: Code duplicated, block: B:101:0x0327  */
    /* JADX WARN: Code duplicated, block: B:103:0x032d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0333  */
    /* JADX WARN: Code duplicated, block: B:106:0x033b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0348  */
    /* JADX WARN: Code duplicated, block: B:109:0x0350  */
    /* JADX WARN: Code duplicated, block: B:116:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1 A[LOOP:1: B:32:0x00b7->B:37:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0266  */
    /* JADX WARN: Code duplicated, block: B:90:0x026c  */
    /* JADX WARN: Code duplicated, block: B:91:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x030f  */
    public static String a(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z, String str, kth kthVar) {
        HiDataFilter hiDataFilter;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] type;
        int length;
        String[] constantsKey;
        HiDataFilter hiDataFilter2;
        boolean z5;
        int i2;
        int length2;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        int i5;
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        StringBuffer stringBuffer = new StringBuffer();
        if (kthVar != null && !TextUtils.isEmpty(kthVar.b())) {
            try {
                hiDataFilter = (HiDataFilter) HiJsonUtil.d(kthVar.b(), HiDataFilter.class);
                if (hiDataFilter.getFilterType() == 1) {
                    z2 = true;
                } else {
                    z3 = true;
                    z2 = false;
                }
                if (!TextUtils.isEmpty(hiAggregateOption.getFilterStartTime()) || TextUtils.isEmpty(hiAggregateOption.getFilterEndTime())) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                type = hiAggregateOption.getType();
                length = type.length;
                constantsKey = hiAggregateOption.getConstantsKey();
                if (z2) {
                    stringBuffer.append(" select start_time,end_time,type_id,client_id,").append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "")).append("max ( metadata) as metadata,max(modified_time) as modified_time,");
                    i5 = 0;
                    while (i5 < length) {
                        boolean z9 = z3;
                        HiDataFilter hiDataFilter3 = hiDataFilter;
                        stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), 0, constantsKey[i5]));
                        if (i5 < length - 1) {
                            stringBuffer.append(",");
                        }
                        i5++;
                        z3 = z9;
                        hiDataFilter = hiDataFilter3;
                    }
                    hiDataFilter2 = hiDataFilter;
                    z5 = z3;
                    i2 = 0;
                    stringBuffer.append(" from (");
                } else {
                    hiDataFilter2 = hiDataFilter;
                    z5 = z3;
                    i2 = 0;
                }
                stringBuffer.append(" select sample_point_health.start_time,sample_point_health.end_time,sample_point_health.type_id,sample_point_health.client_id,max(sample_point_health.modified_time) as modified_time,");
                length2 = type.length;
                i3 = i2;
                while (true) {
                    if (i3 < length2) {
                        z6 = false;
                        break;
                    }
                    if (type[i3] == 2004) {
                        z6 = true;
                        break;
                    }
                    i3++;
                }
                if (!z6 && !"-1".equals(str)) {
                    stringBuffer.append("sample_point_health.metadata,");
                }
                if (!z2) {
                    stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point_health"));
                }
                i4 = 0;
                while (i4 < length) {
                    if ("-1".equals(str)) {
                        if (type[i4] == 2089) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    } else if (type[i4] == 2004) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z6 && z8) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        kwe.e(stringBuffer2, "sample_point_health", "type_id", "metadata", type[i4], "metadata");
                        stringBuffer.append(stringBuffer2.toString());
                        stringBuffer.append(",");
                    }
                    if (z2) {
                        stringBuffer.append(kwe.a(1, type[i4], constantsKey[i4]));
                    } else {
                        stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), type[i4], constantsKey[i4]));
                    }
                    if (i4 < length - 1) {
                        stringBuffer.append(",");
                    }
                    i4++;
                    z6 = z6;
                }
                if (z4) {
                    stringBuffer.append(",strftime('%H:%M:%S', datetime(sample_point_health.start_time/ 1000, 'unixepoch', 'localtime')) as filterTime");
                }
                stringBuffer.append(" from sample_point_health where sample_point_health.start_time >=? and sample_point_health.start_time <=? ");
                if (hiAggregateOption.getModifiedEndTime() > 0) {
                    kwe.d(stringBuffer, "sample_point_health");
                }
                b(stringBuffer, "sample_point_health");
                if (z) {
                    stringBuffer.append(" and ").append("sample_point_health").append(".").append("merged").append(CommonUtil.EQUAL);
                }
                if (z4) {
                    stringBuffer.append(" and ");
                    if (hiAggregateOption.getFilterStartTime().compareTo(hiAggregateOption.getFilterEndTime()) < 0) {
                        stringBuffer.append("filterTime >= ").append("'").append(hiAggregateOption.getFilterStartTime()).append("'").append(" and ").append("filterTime < ").append("'").append(hiAggregateOption.getFilterEndTime()).append("'");
                    } else {
                        stringBuffer.append("((").append("filterTime >= '").append(hiAggregateOption.getFilterStartTime()).append("'").append(" and ").append("filterTime < '24:00:00') OR (filterTime >= '00:00:00' ").append(" and ").append("filterTime < '").append(hiAggregateOption.getFilterEndTime()).append("'))");
                    }
                }
                z7 = z2;
                if (str == null && "NULL".equals(str)) {
                    stringBuffer.append(" and ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("metadata").append(" = ").append(" 0 ").append(" OR ").append("sample_point_health").append(".").append("metadata").append(" is NULL ").append(Constants.RIGHT_BRACKET_ONLY);
                } else if ("-1".equals(str)) {
                    stringBuffer.append(" and ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("metadata").append(" = ").append("-1").append(" OR ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("type_id").append(" = ").append(2089).append(" and ").append("sample_point_health").append(".").append("value").append(" >= ").append(2).append(Constants.RIGHT_BRACKET_ONLY).append(Constants.RIGHT_BRACKET_ONLY);
                } else if (str == null && !"".equals(str)) {
                    stringBuffer.append(" and ").append("sample_point_health").append(".").append("metadata").append(CommonUtil.EQUAL);
                } else {
                    LogUtil.a("SqlUtilPointHelper", "getAggregateWeightPoint other conditions enter");
                }
                kwe.a("sample_point_health.type_id", type, stringBuffer, strArr, i);
                kwe.e("sample_point_health.client_id", list, stringBuffer, strArr, type.length + i);
                if (z7) {
                    kwe.c(stringBuffer, "sample_point_health", "start_time");
                    stringBuffer.append(" having ").append(kwb.d(hiDataFilter2)).append(Constants.RIGHT_BRACKET_ONLY);
                }
                if (groupUnitType == 0) {
                    kwe.b(stringBuffer, "start_time");
                } else if (groupUnitType == 8) {
                    kwe.b(stringBuffer, "client_id");
                } else {
                    kwe.b(stringBuffer, "unit_index");
                }
                if (z5) {
                    stringBuffer.append(" having ").append(kwb.d(hiDataFilter2));
                }
                if (z7) {
                    kwe.a(stringBuffer, "start_time", hiAggregateOption.getSortOrder());
                } else {
                    kwe.c(stringBuffer, "sample_point_health", "start_time", hiAggregateOption.getSortOrder());
                }
                kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
                return stringBuffer.toString();
            } catch (JsonSyntaxException unused) {
                throw new JsonSyntaxException("not HiDataFilter param");
            }
        }
        hiDataFilter = null;
        z2 = false;
        z3 = false;
        if (TextUtils.isEmpty(hiAggregateOption.getFilterStartTime())) {
            z4 = false;
        } else {
            z4 = false;
        }
        type = hiAggregateOption.getType();
        length = type.length;
        constantsKey = hiAggregateOption.getConstantsKey();
        if (z2) {
            stringBuffer.append(" select start_time,end_time,type_id,client_id,").append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "")).append("max ( metadata) as metadata,max(modified_time) as modified_time,");
            i5 = 0;
            while (i5 < length) {
                boolean z10 = z3;
                HiDataFilter hiDataFilter4 = hiDataFilter;
                stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), 0, constantsKey[i5]));
                if (i5 < length - 1) {
                    stringBuffer.append(",");
                }
                i5++;
                z3 = z10;
                hiDataFilter = hiDataFilter4;
            }
            hiDataFilter2 = hiDataFilter;
            z5 = z3;
            i2 = 0;
            stringBuffer.append(" from (");
        } else {
            hiDataFilter2 = hiDataFilter;
            z5 = z3;
            i2 = 0;
        }
        stringBuffer.append(" select sample_point_health.start_time,sample_point_health.end_time,sample_point_health.type_id,sample_point_health.client_id,max(sample_point_health.modified_time) as modified_time,");
        length2 = type.length;
        i3 = i2;
        while (true) {
            if (i3 < length2) {
                z6 = false;
                break;
            }
            if (type[i3] == 2004) {
                z6 = true;
                break;
            }
            i3++;
        }
        if (!z6) {
            stringBuffer.append("sample_point_health.metadata,");
        }
        if (!z2) {
            stringBuffer.append(kwe.b(groupUnitType, hiAggregateOption.getGroupUnitSize(), "sample_point_health"));
        }
        i4 = 0;
        while (i4 < length) {
            if ("-1".equals(str)) {
                if (type[i4] == 2089) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else if (type[i4] == 2004) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z6) {
                StringBuffer stringBuffer3 = new StringBuffer();
                kwe.e(stringBuffer3, "sample_point_health", "type_id", "metadata", type[i4], "metadata");
                stringBuffer.append(stringBuffer3.toString());
                stringBuffer.append(",");
            }
            if (z2) {
                stringBuffer.append(kwe.a(1, type[i4], constantsKey[i4]));
            } else {
                stringBuffer.append(kwe.a(hiAggregateOption.getAggregateType(), type[i4], constantsKey[i4]));
            }
            if (i4 < length - 1) {
                stringBuffer.append(",");
            }
            i4++;
            z6 = z6;
        }
        if (z4) {
            stringBuffer.append(",strftime('%H:%M:%S', datetime(sample_point_health.start_time/ 1000, 'unixepoch', 'localtime')) as filterTime");
        }
        stringBuffer.append(" from sample_point_health where sample_point_health.start_time >=? and sample_point_health.start_time <=? ");
        if (hiAggregateOption.getModifiedEndTime() > 0) {
            kwe.d(stringBuffer, "sample_point_health");
        }
        b(stringBuffer, "sample_point_health");
        if (z) {
            stringBuffer.append(" and ").append("sample_point_health").append(".").append("merged").append(CommonUtil.EQUAL);
        }
        if (z4) {
            stringBuffer.append(" and ");
            if (hiAggregateOption.getFilterStartTime().compareTo(hiAggregateOption.getFilterEndTime()) < 0) {
                stringBuffer.append("filterTime >= ").append("'").append(hiAggregateOption.getFilterStartTime()).append("'").append(" and ").append("filterTime < ").append("'").append(hiAggregateOption.getFilterEndTime()).append("'");
            } else {
                stringBuffer.append("((").append("filterTime >= '").append(hiAggregateOption.getFilterStartTime()).append("'").append(" and ").append("filterTime < '24:00:00') OR (filterTime >= '00:00:00' ").append(" and ").append("filterTime < '").append(hiAggregateOption.getFilterEndTime()).append("'))");
            }
        }
        z7 = z2;
        if (str == null) {
            if ("-1".equals(str)) {
                stringBuffer.append(" and ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("metadata").append(" = ").append("-1").append(" OR ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("type_id").append(" = ").append(2089).append(" and ").append("sample_point_health").append(".").append("value").append(" >= ").append(2).append(Constants.RIGHT_BRACKET_ONLY).append(Constants.RIGHT_BRACKET_ONLY);
            } else if (str == null) {
                LogUtil.a("SqlUtilPointHelper", "getAggregateWeightPoint other conditions enter");
            } else {
                LogUtil.a("SqlUtilPointHelper", "getAggregateWeightPoint other conditions enter");
            }
        } else if ("-1".equals(str)) {
            stringBuffer.append(" and ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("metadata").append(" = ").append("-1").append(" OR ").append(Constants.LEFT_BRACKET_ONLY).append("sample_point_health").append(".").append("type_id").append(" = ").append(2089).append(" and ").append("sample_point_health").append(".").append("value").append(" >= ").append(2).append(Constants.RIGHT_BRACKET_ONLY).append(Constants.RIGHT_BRACKET_ONLY);
        } else if (str == null) {
            LogUtil.a("SqlUtilPointHelper", "getAggregateWeightPoint other conditions enter");
        } else {
            LogUtil.a("SqlUtilPointHelper", "getAggregateWeightPoint other conditions enter");
        }
        kwe.a("sample_point_health.type_id", type, stringBuffer, strArr, i);
        kwe.e("sample_point_health.client_id", list, stringBuffer, strArr, type.length + i);
        if (z7) {
            kwe.c(stringBuffer, "sample_point_health", "start_time");
            stringBuffer.append(" having ").append(kwb.d(hiDataFilter2)).append(Constants.RIGHT_BRACKET_ONLY);
        }
        if (groupUnitType == 0) {
            kwe.b(stringBuffer, "start_time");
        } else if (groupUnitType == 8) {
            kwe.b(stringBuffer, "client_id");
        } else {
            kwe.b(stringBuffer, "unit_index");
        }
        if (z5) {
            stringBuffer.append(" having ").append(kwb.d(hiDataFilter2));
        }
        if (z7) {
            kwe.a(stringBuffer, "start_time", hiAggregateOption.getSortOrder());
        } else {
            kwe.c(stringBuffer, "sample_point_health", "start_time", hiAggregateOption.getSortOrder());
        }
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String a(List<Integer> list, int[] iArr, String[] strArr, int i, String[] strArr2, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_point._id,sample_point.start_time,sample_point.end_time,sample_point.type_id,sample_point.metadata,sample_point.client_id,sample_point.timeZone,sample_point.modified_time,");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            stringBuffer.append("max");
            kwe.d(stringBuffer, "sample_point", "type_id", "value", iArr[i3], strArr[i3]);
            if (i3 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from ").append("sample_point");
        stringBuffer.append(" where ").append("sample_point").append(".").append("sync_status").append(CommonUtil.EQUAL);
        kwe.a("sample_point.type_id", iArr, stringBuffer, strArr2, i2);
        kwe.e("sample_point.client_id", list, stringBuffer, strArr2, i2 + length);
        kwe.c(stringBuffer, "sample_point", "start_time");
        stringBuffer.append(", ").append("sample_point").append(".").append("client_id");
        stringBuffer.append(" ORDER BY ").append("sample_point").append(".").append("start_time").append(" DESC ");
        stringBuffer.append(" limit ").append("0,").append(i);
        return stringBuffer.toString();
    }

    private static void b(StringBuffer stringBuffer, String str) {
        stringBuffer.append(" and ").append(str).append(".").append("sync_status").append(" != ").append(2);
    }
}
