package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.HiCommonUtil;
import java.security.InvalidParameterException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwb {
    public static boolean b(long j) {
        return j > 0;
    }

    public static String a(HiDataReadOption hiDataReadOption, List<Integer> list, String[] strArr, int i, boolean z) {
        return kwh.c(hiDataReadOption, list, strArr, i, z);
    }

    public static String a(int[] iArr, String[] strArr, int i, String[] strArr2, int i2) {
        return kwh.e(iArr, strArr, i, strArr2, i2);
    }

    public static String e(int[] iArr, String[] strArr, String[] strArr2, int i) {
        return kwh.e(iArr, strArr, strArr2, i);
    }

    public static String b(List<Integer> list, int[] iArr, String[] strArr, int i, String[] strArr2, int i2) {
        return kwj.a(list, iArr, strArr, i, strArr2, i2);
    }

    public static String d(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        return kwh.d(list, strArr, i, hiAggregateOption, z);
    }

    public static String c(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, int i2, String str, boolean z) {
        return kwh.a(list, strArr, i, hiAggregateOption, i2, str, z);
    }

    public static String d(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, int i2, String str, boolean z) {
        if (TextUtils.equals(hiAggregateOption.getFilter(), "GET_SESSION_SLEEP_DATA")) {
            return kwh.e(list, strArr, hiAggregateOption, i2, str);
        }
        return kwh.b(list, strArr, i, hiAggregateOption, i2, str, z);
    }

    public static String b(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, int i2, String str, boolean z) {
        if (TextUtils.equals(hiAggregateOption.getFilter(), "GET_SESSION_SLEEP_DATA")) {
            return kwh.e(list, strArr, hiAggregateOption, i2, str);
        }
        return kwh.c(list, strArr, i, hiAggregateOption, i2, str, z);
    }

    public static String e(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select sample_sequence.start_time,sample_sequence.end_time,sample_sequence.type_id, count (sample_sequence.type_id) as ");
        stringBuffer.append(hiAggregateOption.getConstantsKey()[0]);
        stringBuffer.append(" from sample_sequence where sample_sequence.start_time >=? and sample_sequence.start_time <=? and sample_sequence.type_id =? ");
        if (z) {
            stringBuffer.append(" and sample_sequence.merged =? ");
        }
        e("sample_sequence.client_id", list, stringBuffer, strArr, i);
        kwe.c(stringBuffer, "sample_sequence", "start_time", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String c(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        return kwj.d(list, strArr, i, hiAggregateOption, z);
    }

    public static String a(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z, String str, kth kthVar) {
        return kwj.a(list, strArr, i, hiAggregateOption, z, str, kthVar);
    }

    public static String c(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption) {
        return a(list, strArr, i, hiAggregateOption);
    }

    private static String a(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption) {
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        StringBuffer stringBuffer = new StringBuffer(1024);
        stringBuffer.append(" select hihealth_stat_day.date,hihealth_stat_day.stat_type,hihealth_stat_day.client_id,hihealth_stat_day.timeZone, max (hihealth_stat_day.modified_time) as modified_time , ");
        stringBuffer.append(kwe.e(groupUnitType));
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int[] type = hiAggregateOption.getType();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.e(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from hihealth_stat_day where hihealth_stat_day.date >=? and hihealth_stat_day.date <=? and sync_status !=? ");
        kwe.a("hihealth_stat_day.stat_type", type, stringBuffer, strArr, i);
        kwe.e("hihealth_stat_day.client_id", list, stringBuffer, strArr, i + type.length);
        if (groupUnitType == 0) {
            kwe.c(stringBuffer, "hihealth_stat_day", "date");
        } else if (groupUnitType == 8) {
            kwe.c(stringBuffer, "hihealth_stat_day", "client_id");
        } else {
            kwe.b(stringBuffer, "unit_index");
        }
        kwe.a(stringBuffer, hiAggregateOption.getFilter());
        kwe.c(stringBuffer, "hihealth_stat_day", hiAggregateOption.getSortName() != null ? "modified_time" : "date", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String b(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z, kth kthVar) {
        return kwj.b(list, strArr, i, hiAggregateOption, z, kthVar);
    }

    public static String a(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        return kwj.e(list, strArr, i, hiAggregateOption, z);
    }

    public static String d(List<Integer> list, String[] strArr, int i, int i2, int i3, String[] strArr2, int[] iArr, int i4) {
        return kwj.e(list, strArr, i, i2, i3, strArr2, iArr, i4);
    }

    public static String a(List<Integer> list, String[] strArr, int i, int i2, int i3, String[] strArr2, int[] iArr, int i4) {
        return kwj.d(list, strArr, i, i2, i3, strArr2, iArr, i4);
    }

    public static String b(List<Integer> list, String[] strArr, int i, HiAggregateOption hiAggregateOption, boolean z) {
        return kwj.a(list, strArr, i, hiAggregateOption, z);
    }

    public static String d(HiAggregateOption hiAggregateOption, String[] strArr, int i, kth kthVar) {
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
        if (hiDataFilter != null) {
            return e(hiAggregateOption, strArr, i, hiDataFilter);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select hihealth_stat_day.date,hihealth_stat_day.stat_type,hihealth_stat_day.timeZone,");
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.e(groupUnitType));
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int length = type.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.e(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from hihealth_stat_day where hihealth_stat_day.date >=? and hihealth_stat_day.date <=? and hihealth_stat_day.client_id =? and hihealth_stat_day.sync_status !=? ");
        d("hihealth_stat_day.stat_type", type, stringBuffer, strArr, i);
        if (groupUnitType != 0) {
            b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "hihealth_stat_day", "date");
        }
        kwe.c(stringBuffer, "hihealth_stat_day", "date", hiAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    private static String e(HiAggregateOption hiAggregateOption, String[] strArr, int i, HiDataFilter hiDataFilter) {
        StringBuffer stringBuffer = new StringBuffer();
        int groupUnitType = hiAggregateOption.getGroupUnitType();
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int length = type.length;
        if (hiDataFilter.getFilterType() == 1) {
            stringBuffer.append(" select date,stat_type,timeZone,").append(kwe.e(groupUnitType));
            for (int i2 = 0; i2 < length; i2++) {
                stringBuffer.append(kwe.e(hiAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
                if (i2 < length - 1) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append(" from (");
        }
        stringBuffer.append(" select hihealth_stat_day.date,hihealth_stat_day.stat_type,hihealth_stat_day.timeZone,");
        if (hiDataFilter.getFilterType() != 1) {
            stringBuffer.append(kwe.e(groupUnitType));
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (hiDataFilter.getFilterType() == 1) {
                hiDataFilter.getFilterOptions().get(i3).setConstantsKey("hihealth_type" + hiDataFilter.getFilterOptions().get(i3).getDataType());
                stringBuffer.append(kwe.e(1, type[i3], hiDataFilter.getFilterOptions().get(i3).getConstantsKey()));
            } else {
                stringBuffer.append(kwe.e(hiAggregateOption.getAggregateType(), type[i3], constantsKey[i3]));
            }
            if (i3 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from hihealth_stat_day where hihealth_stat_day.date >=? and hihealth_stat_day.date <=? and hihealth_stat_day.client_id =? and hihealth_stat_day.sync_status !=? ");
        d("hihealth_stat_day.stat_type", type, stringBuffer, strArr, i);
        if (hiDataFilter.getFilterType() == 1) {
            kwe.c(stringBuffer, "hihealth_stat_day", "date");
            stringBuffer.append(" having ").append(d(hiDataFilter)).append(Constants.RIGHT_BRACKET_ONLY);
        }
        if (groupUnitType != 0) {
            b(stringBuffer, "unit_index");
        } else {
            kwe.c(stringBuffer, "hihealth_stat_day", "date");
        }
        if (hiDataFilter.getFilterType() == 0) {
            stringBuffer.append(" having ").append(d(hiDataFilter));
        }
        if (hiDataFilter.getFilterType() == 1) {
            kwe.a(stringBuffer, "date", hiAggregateOption.getSortOrder());
        } else {
            kwe.c(stringBuffer, "hihealth_stat_day", "date", hiAggregateOption.getSortOrder());
        }
        kwe.b(stringBuffer, hiAggregateOption.getAnchor(), hiAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String c(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, String[] strArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select hihealth_stat_day.date,hihealth_stat_day.stat_type,hihealth_stat_day.timeZone,hihealth_stat_day.hihealth_type,hihealth_stat_day.modified_time,");
        int groupUnitType = hiSportStatDataAggregateOption.getGroupUnitType();
        stringBuffer.append(kwe.e(groupUnitType));
        int[] type = hiSportStatDataAggregateOption.getType();
        String[] constantsKey = hiSportStatDataAggregateOption.getConstantsKey();
        int length = type.length;
        int length2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(kwe.e(hiSportStatDataAggregateOption.getAggregateType(), type[i2], constantsKey[i2]));
            if (i2 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from hihealth_stat_day where hihealth_stat_day.date >=? and hihealth_stat_day.date <=? and hihealth_stat_day.client_id =? and hihealth_stat_day.sync_status != 2");
        int[] hiHealthTypes = hiSportStatDataAggregateOption.getHiHealthTypes();
        if (hiHealthTypes != null && hiHealthTypes.length > 0) {
            length2 = hiHealthTypes.length;
            d("hihealth_stat_day.hihealth_type", hiHealthTypes, stringBuffer, strArr, i);
        }
        d("hihealth_stat_day.stat_type", type, stringBuffer, strArr, i + length2);
        if (groupUnitType != 0) {
            c(stringBuffer, "unit_index", "hihealth_type");
        } else {
            c(stringBuffer, "date", "hihealth_type");
        }
        kwe.c(stringBuffer, "hihealth_stat_day", "date", hiSportStatDataAggregateOption.getSortOrder());
        kwe.b(stringBuffer, hiSportStatDataAggregateOption.getAnchor(), hiSportStatDataAggregateOption.getCount());
        return stringBuffer.toString();
    }

    public static String a(int i, int[] iArr, String[] strArr, List<Integer> list, String[] strArr2, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select * ,  max (modified_time) as modified_time , ");
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            stringBuffer.append(kwe.e(4, iArr[i4], strArr[i4]));
            if (i4 < length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(" from hihealth_stat_day where hihealth_stat_day.client_id =?  and hihealth_stat_day.sync_status != 2");
        d("hihealth_stat_day.stat_type", iArr, stringBuffer, strArr2, i3);
        e("hihealth_stat_day.date", list, stringBuffer, strArr2, i3 + iArr.length);
        stringBuffer.append(" group by ").append("hihealth_stat_day").append(".").append("date");
        kwe.c(stringBuffer, "hihealth_stat_day", "date", i2);
        kwe.b(stringBuffer, 0, i);
        return stringBuffer.toString();
    }

    public static String c(String str, List<Integer> list, String[] strArr, int i, boolean z) {
        return kwk.c(str, list, strArr, i, z);
    }

    public static String e(String str, List<Integer> list, String[] strArr, int i, boolean z) {
        return kwk.d(str, list, strArr, i, z);
    }

    public static String b(String str, List<Integer> list, String[] strArr, int i, boolean z) {
        return kwk.b(str, list, strArr, i, z);
    }

    public static String d(int[] iArr, List<Integer> list, String[] strArr, int i) {
        return d("sample_point", iArr, list, strArr, i);
    }

    public static String a(int[] iArr, List<Integer> list, String[] strArr, int i) {
        return d("sample_point_health", iArr, list, strArr, i);
    }

    private static String d(String str, int[] iArr, List<Integer> list, String[] strArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" INSERT INTO ").append(str).append("(start_time,end_time,type_id,value,metadata,unit_id,client_id,merged,sync_status,timeZone,modified_time) select start_time,end_time,type_id,value,metadata,unit_id,?,merged,?,timeZone,? from sample_point where start_time >=? and start_time <=? and merged =? ");
        d("type_id", iArr, stringBuffer, strArr, i);
        e("client_id", list, stringBuffer, strArr, i + iArr.length);
        return stringBuffer.toString();
    }

    public static String c(List<Integer> list, String[] strArr, int i) {
        return kwh.e(list, strArr, i);
    }

    public static String e() {
        return " INSERT INTO hihealth_stat_day(date,hihealth_type,stat_type,value,unit_id,user_id,client_id,sync_status,timeZone,modified_time) select date,hihealth_type,stat_type,value,unit_id,?,?,?,timeZone,? from hihealth_stat_day where date >=? and date <=? and stat_type >=? and stat_type <=? and client_id =? ";
    }

    public static String a() {
        return " select *  from hihealth_authorization INNER JOIN hihealth_permission ON hihealth_authorization.permission_id = hihealth_permission._id where hihealth_authorization.app_id =? and hihealth_authorization.user_id =? and hihealth_authorization.granted =? ";
    }

    public static void e(String str, List<Integer> list, StringBuffer stringBuffer, String[] strArr, int i) {
        kwe.e(str, list, stringBuffer, strArr, i);
    }

    public static void d(String str, int[] iArr, StringBuffer stringBuffer, String[] strArr, int i) {
        kwe.a(str, iArr, stringBuffer, strArr, i);
    }

    public static String a(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer("INSERT INTO hihealth_temp ( tempKey, tempValue )  VALUES  ( ");
        stringBuffer.append(i).append(", ");
        stringBuffer.append(i2);
        stringBuffer.append(" ) ");
        return stringBuffer.toString();
    }

    public static String e(int i) {
        StringBuffer stringBuffer = new StringBuffer("DELETE FROM sync_cache where _id in  (  select tempValue from hihealth_temp where tempKey = ");
        stringBuffer.append(i);
        stringBuffer.append(" ) ");
        return stringBuffer.toString();
    }

    public static String c(int i) {
        StringBuffer stringBuffer = new StringBuffer("DELETE FROM hihealth_temp where tempKey = ");
        stringBuffer.append(i);
        return stringBuffer.toString();
    }

    public static void b(StringBuffer stringBuffer, String str) {
        stringBuffer.append(" group by ").append(str);
    }

    public static void c(StringBuffer stringBuffer, String str, String str2) {
        stringBuffer.append(" group by ").append(str).append(",").append(str2);
    }

    public static String c(String str, int i, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i == 0) {
            stringBuffer.append(str).append(" ASC ");
        } else if (i == 1) {
            stringBuffer.append(str).append(" DESC ");
        }
        kwe.b(stringBuffer, i2, i3);
        return stringBuffer.toString();
    }

    public static String a(String str) {
        try {
            HiDataFilter hiDataFilter = (HiDataFilter) HiJsonUtil.d(str, HiDataFilter.class);
            if (hiDataFilter == null || HiCommonUtil.b(hiDataFilter.getFilterOptions())) {
                throw new InvalidParameterException("transForAggregateSql param error");
            }
            StringBuilder sb = new StringBuilder(" and ((type_id=");
            sb.append(hiDataFilter.getFilterOptions().get(0).getDataType());
            sb.append(" and value");
            sb.append(hiDataFilter.getFilterOptions().get(0).getCompareSymbols());
            sb.append(hiDataFilter.getFilterOptions().get(0).getValue());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            if (hiDataFilter.getFilterOptions().size() == 1) {
                sb.append(Constants.RIGHT_BRACKET_ONLY);
                return sb.toString();
            }
            for (int i = 1; i < hiDataFilter.getFilterOptions().size(); i++) {
                int i2 = i - 1;
                if (hiDataFilter.getOperators().get(i2).intValue() == 0) {
                    sb.append(" and ");
                } else if (hiDataFilter.getOperators().get(i2).intValue() == 1) {
                    sb.append(" or ");
                } else {
                    return sb.toString();
                }
                sb.append("(type_id=");
                sb.append(hiDataFilter.getFilterOptions().get(i).getDataType());
                sb.append(" and value");
                sb.append(hiDataFilter.getFilterOptions().get(i).getCompareSymbols());
                sb.append(hiDataFilter.getFilterOptions().get(i).getValue());
                sb.append(Constants.RIGHT_BRACKET_ONLY);
            }
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            return sb.toString();
        } catch (JsonSyntaxException unused) {
            throw new JsonSyntaxException("not HiDataFilter param");
        }
    }

    public static String c(String str) {
        try {
            HiDataFilter hiDataFilter = (HiDataFilter) HiJsonUtil.d(str, HiDataFilter.class);
            if (hiDataFilter == null || HiCommonUtil.b(hiDataFilter.getFilterOptions())) {
                throw new InvalidParameterException("transForAggregateSql param error");
            }
            StringBuilder sb = new StringBuilder(" and ((stat_type=");
            sb.append(hiDataFilter.getFilterOptions().get(0).getDataType());
            sb.append(" and value");
            sb.append(hiDataFilter.getFilterOptions().get(0).getCompareSymbols());
            sb.append(hiDataFilter.getFilterOptions().get(0).getValue());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            if (hiDataFilter.getFilterOptions().size() == 1) {
                sb.append(Constants.RIGHT_BRACKET_ONLY);
                return sb.toString();
            }
            for (int i = 1; i < hiDataFilter.getFilterOptions().size(); i++) {
                int i2 = i - 1;
                if (hiDataFilter.getOperators().get(i2).intValue() == 0) {
                    sb.append(" and ");
                } else if (hiDataFilter.getOperators().get(i2).intValue() == 1) {
                    sb.append(" or ");
                } else {
                    return sb.toString();
                }
                sb.append("(stat_type=");
                sb.append(hiDataFilter.getFilterOptions().get(i).getDataType());
                sb.append(" and value");
                sb.append(hiDataFilter.getFilterOptions().get(i).getCompareSymbols());
                sb.append(hiDataFilter.getFilterOptions().get(i).getValue());
                sb.append(Constants.RIGHT_BRACKET_ONLY);
            }
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            return sb.toString();
        } catch (JsonSyntaxException unused) {
            throw new JsonSyntaxException("not HiDataFilter param");
        }
    }

    public static String d(HiDataFilter hiDataFilter) {
        if (hiDataFilter == null || HiCommonUtil.b(hiDataFilter.getFilterOptions())) {
            throw new InvalidParameterException("transForAggregateSql param error");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hiDataFilter.getFilterOptions().get(0).getConstantsKey());
        sb.append(hiDataFilter.getFilterOptions().get(0).getCompareSymbols());
        sb.append(hiDataFilter.getFilterOptions().get(0).getValue());
        if (hiDataFilter.getFilterOptions().size() == 1) {
            return sb.toString();
        }
        for (int i = 1; i < hiDataFilter.getFilterOptions().size(); i++) {
            int i2 = i - 1;
            if (hiDataFilter.getOperators().get(i2).intValue() == 0) {
                sb.append(" and ");
            } else if (hiDataFilter.getOperators().get(i2).intValue() == 1) {
                sb.append(" or ");
            } else {
                return sb.toString();
            }
            sb.append(hiDataFilter.getFilterOptions().get(i).getConstantsKey());
            sb.append(hiDataFilter.getFilterOptions().get(i).getCompareSymbols());
            sb.append(hiDataFilter.getFilterOptions().get(i).getValue());
        }
        return sb.toString();
    }
}
