package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.sync.dataswitch.HiHealthDataBuildService;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lgo {
    public static HiHealthDataBuildService c(SamplePoint samplePoint) {
        String value = samplePoint.getValue();
        String fieldsMetadata = samplePoint.getFieldsMetadata();
        String fieldsModifyTime = samplePoint.getFieldsModifyTime();
        LogUtil.d("HiH_HiHealthDataBuildFactory", "value = ", value, ", metadata = ", fieldsMetadata, ", modifyTime = ", fieldsModifyTime);
        if (TextUtils.isEmpty(value) && TextUtils.isEmpty(fieldsMetadata)) {
            return new b();
        }
        if (TextUtils.isEmpty(value) && !TextUtils.isEmpty(fieldsMetadata)) {
            return new c(fieldsMetadata, fieldsModifyTime);
        }
        if (!TextUtils.isEmpty(value) && TextUtils.isEmpty(fieldsMetadata)) {
            return new d(value, fieldsModifyTime);
        }
        if (!TextUtils.isEmpty(value) && !TextUtils.isEmpty(fieldsMetadata)) {
            return new a(value, fieldsMetadata, fieldsModifyTime);
        }
        return new e();
    }

    static class b implements HiHealthDataBuildService {
        private b() {
        }

        @Override // com.huawei.hihealthservice.sync.dataswitch.HiHealthDataBuildService
        public List<HiHealthData> build(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail) {
            return new ArrayList();
        }
    }

    static class c implements HiHealthDataBuildService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40094a;
        private String d;

        c(String str, String str2) {
            this.d = str;
            this.f40094a = str2;
        }

        @Override // com.huawei.hihealthservice.sync.dataswitch.HiHealthDataBuildService
        public List<HiHealthData> build(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail) {
            ArrayList arrayList;
            try {
                JSONObject jSONObject = new JSONObject(this.d);
                int length = jSONObject.length();
                arrayList = new ArrayList(length);
                try {
                    HashMap map = new HashMap(length);
                    c(samplePoint, kymVar, healthDetail, jSONObject, arrayList, map);
                    if (!TextUtils.isEmpty(this.f40094a)) {
                        e(samplePoint, kymVar, healthDetail, new JSONObject(this.f40094a), arrayList, map);
                    }
                } catch (JSONException e) {
                    e = e;
                    ReleaseLogUtil.e("HiH_HiHealthDataBuildFactory", getClass().getName(), " exception ", e.getMessage());
                }
            } catch (JSONException e2) {
                e = e2;
                arrayList = null;
            }
            return arrayList != null ? arrayList : new ArrayList();
        }

        private void c(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(hiHealthDictFieldE.e());
                            hiHealthData.setMetaData(jSONObject.getString(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setMetaData(jSONObject.getString(next));
                    }
                }
            }
        }

        private void e(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            int iE = hiHealthDictFieldE.e();
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(iE);
                            hiHealthData.setModifiedTime(jSONObject.getLong(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setModifiedTime(jSONObject.getLong(next));
                    }
                }
            }
        }
    }

    static class d implements HiHealthDataBuildService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40096c;

        d(String str, String str2) {
            this.f40095b = str;
            this.f40096c = str2;
        }

        @Override // com.huawei.hihealthservice.sync.dataswitch.HiHealthDataBuildService
        public List<HiHealthData> build(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail) {
            ArrayList arrayList;
            if ("WEIGHT_BODYFAT".equals(samplePoint.getKey())) {
                ArrayList arrayList2 = new ArrayList(1);
                try {
                    Double dValueOf = Double.valueOf(samplePoint.getValue());
                    HiHealthData hiHealthData = new HiHealthData();
                    hiHealthData.setType(DicDataTypeUtil.DataType.BODY_FAT_RATE.value());
                    hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                    hiHealthData.setTimeZone(healthDetail.getTimeZone());
                    hiHealthData.setValue(dValueOf.doubleValue());
                    kym.e(hiHealthData, kymVar);
                    arrayList2.add(hiHealthData);
                    return arrayList2;
                } catch (NumberFormatException unused) {
                    ReleaseLogUtil.d("HiH_HiHealthDataBuildFactory", "WEIGHT_BODYFAT samplePoint.getValue() exception");
                    return arrayList2;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f40095b);
                int length = jSONObject.length();
                arrayList = new ArrayList(length);
                try {
                    HashMap map = new HashMap(length);
                    e(samplePoint, kymVar, healthDetail, jSONObject, arrayList, map);
                    if (!TextUtils.isEmpty(this.f40096c)) {
                        d(samplePoint, kymVar, healthDetail, new JSONObject(this.f40096c), arrayList, map);
                    }
                } catch (JSONException e) {
                    e = e;
                    ReleaseLogUtil.e("HiH_HiHealthDataBuildFactory", getClass().getName(), " exception ", e.getMessage());
                }
            } catch (JSONException e2) {
                e = e2;
                arrayList = null;
            }
            return arrayList != null ? arrayList : new ArrayList();
        }

        private void e(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            String string = (healthDetail.getType().intValue() != DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value() || jSONObject.isNull("extendAttribute")) ? null : jSONObject.getString("extendAttribute");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            int iE = hiHealthDictFieldE.e();
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(iE);
                            hiHealthData.setMetaData(string);
                            hiHealthData.setValue(jSONObject.getDouble(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            if ("conflictFlag".equals(next)) {
                                if (jSONObject.isNull("conflictUserInfo")) {
                                    ReleaseLogUtil.d("HiH_HiHealthDataBuildFactory", "conflictUserInfo is null");
                                } else {
                                    hiHealthData.setMetaData(jSONObject.getString("conflictUserInfo"));
                                }
                            }
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setValue(jSONObject.getDouble(next));
                    }
                }
            }
        }

        private void d(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            int iE = hiHealthDictFieldE.e();
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(iE);
                            hiHealthData.setModifiedTime(jSONObject.getLong(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setModifiedTime(jSONObject.getLong(next));
                    }
                }
            }
        }
    }

    static class a implements HiHealthDataBuildService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40093c;
        private String e;

        a(String str, String str2, String str3) {
            this.f40092b = str;
            this.e = str2;
            this.f40093c = str3;
        }

        @Override // com.huawei.hihealthservice.sync.dataswitch.HiHealthDataBuildService
        public List<HiHealthData> build(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail) {
            ArrayList arrayList;
            try {
                JSONObject jSONObject = new JSONObject(this.f40092b);
                JSONObject jSONObject2 = new JSONObject(this.e);
                int length = jSONObject.length() + jSONObject2.length();
                arrayList = new ArrayList(length);
                try {
                    HashMap map = new HashMap(length);
                    b(samplePoint, kymVar, healthDetail, jSONObject, arrayList, map);
                    a(samplePoint, kymVar, healthDetail, jSONObject2, arrayList, map);
                    if (!TextUtils.isEmpty(this.f40093c)) {
                        e(samplePoint, kymVar, healthDetail, new JSONObject(this.f40093c), arrayList, map);
                    }
                } catch (JSONException e) {
                    e = e;
                    ReleaseLogUtil.e("HiH_HiHealthDataBuildFactory", getClass().getName(), " exception ", e.getMessage());
                }
            } catch (JSONException e2) {
                e = e2;
                arrayList = null;
            }
            return arrayList != null ? arrayList : new ArrayList();
        }

        private void a(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(hiHealthDictFieldE.e());
                            hiHealthData.setMetaData(jSONObject.getString(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setMetaData(jSONObject.getString(next));
                    }
                }
            }
        }

        private void b(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            int iE = hiHealthDictFieldE.e();
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(iE);
                            hiHealthData.setValue(jSONObject.getDouble(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setValue(jSONObject.getDouble(next));
                    }
                }
            }
        }

        private void e(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail, JSONObject jSONObject, List<HiHealthData> list, Map<String, HiHealthData> map) throws JSONException {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.isNull(next)) {
                    if (!map.containsKey(next)) {
                        HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(healthDetail.getType().intValue(), next);
                        if (hiHealthDictFieldE == null) {
                            if (!"extendAttribute".equals(next)) {
                                LogUtil.e("HiH_HiHealthDataBuildFactory", "cloudType = ", healthDetail.getType(), ", key = ", next, " exception happen");
                            }
                        } else {
                            int iE = hiHealthDictFieldE.e();
                            HiHealthData hiHealthData = new HiHealthData();
                            hiHealthData.setType(iE);
                            hiHealthData.setModifiedTime(jSONObject.getLong(next));
                            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                            hiHealthData.setTimeZone(healthDetail.getTimeZone());
                            kym.e(hiHealthData, kymVar);
                            list.add(hiHealthData);
                            map.put(next, hiHealthData);
                        }
                    } else {
                        map.get(next).setModifiedTime(jSONObject.getLong(next));
                    }
                }
            }
        }
    }

    static class e implements HiHealthDataBuildService {
        private e() {
        }

        @Override // com.huawei.hihealthservice.sync.dataswitch.HiHealthDataBuildService
        public List<HiHealthData> build(SamplePoint samplePoint, kym kymVar, HealthDetail healthDetail) {
            return new ArrayList();
        }
    }
}
