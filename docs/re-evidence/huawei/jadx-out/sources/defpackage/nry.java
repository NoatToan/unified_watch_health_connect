package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nry implements HiHealthProcess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f43564b = Arrays.asList("startTime", "endTime", "modifiedTime");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f43565c = new HashMap<Integer, String>() { // from class: nry.2
        {
            put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()), "customTags");
        }
    };

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HiDataReadProOption preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiHealthProcess__readData", "preProcess request is empty");
            return null;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (str.contains(nqk.f)) {
            nqt nqtVar = (nqt) peh.b(str, nqt.class);
            LogUtil.a("HiHealthProcess__readData", "Request is ", nqtVar);
            if (nqtVar == null) {
                ReleaseLogUtil.a("HiHealthProcess__readData", "samplePointReadRequest is null");
                return null;
            }
            hiDataReadOption.setType(CommonUtil.c(nqj.a().d(nqtVar.n())));
            a(nqtVar, hiDataReadOption);
        } else if (str.contains(nqk.j)) {
            nqy nqyVar = (nqy) peh.b(str, nqy.class);
            LogUtil.a("HiHealthProcess__readData", "Request is ", nqyVar);
            if (nqyVar == null) {
                ReleaseLogUtil.a("HiHealthProcess__readData", "sampleStatReadRequest is null");
                return null;
            }
            hiDataReadOption.setType(nqj.a().c(nqyVar.l().getmId(), nqyVar.o()));
            a(nqyVar, hiDataReadOption);
        } else if (str.contains(nqk.i)) {
            nrb nrbVar = (nrb) peh.b(str, nrb.class);
            LogUtil.a("HiHealthProcess__readData", "Request is ", nrbVar);
            if (nrbVar == null) {
                ReleaseLogUtil.a("HiHealthProcess__readData", "sampleStatReadRequest is null");
                return null;
            }
            hiDataReadOption.setType(nrbVar.k());
            a(nrbVar, hiDataReadOption);
            return new HiDataReadProOption.Builder().e(hiDataReadOption).a(!nrbVar.n().e() ? 1 : 0).b();
        }
        if (hiDataReadOption.getType() == null || hiDataReadOption.getType().length == 0) {
            LogUtil.d("HiHealthProcess__readData", "types is empty");
            return null;
        }
        return new HiDataReadProOption.Builder().e(hiDataReadOption).b();
    }

    private static HiDataReadOption a(nqu nquVar, HiDataReadOption hiDataReadOption) {
        if (nquVar.e() != 0) {
            hiDataReadOption.setTimeInterval(nquVar.c(), nquVar.e());
        } else {
            try {
                hiDataReadOption.setTimeInterval(DateFormatUtil.d(DateFormatUtil.d(nquVar.b(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY).getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8), DateFormatUtil.d(DateFormatUtil.d(nquVar.a(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY).getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
            } catch (ParseException unused) {
                LogUtil.c("HiHealthProcess__readData", "ParseException");
            }
        }
        if (nquVar.d() != null) {
            hiDataReadOption.setDeviceUuid(nquVar.d().b());
            hiDataReadOption.setReadType(2);
        } else {
            hiDataReadOption.setReadType(0);
        }
        hiDataReadOption.setSortOrder(nquVar.g());
        hiDataReadOption.setCount(nquVar.f());
        return hiDataReadOption;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.d("HiHealthProcess__readData", "postProcess null");
            return "[]";
        }
        if (obj2 instanceof nqt) {
            nqt nqtVar = (nqt) obj2;
            SparseArray sparseArray = (SparseArray) obj;
            ArrayList<nrh> arrayList = new ArrayList<>();
            for (Map.Entry<Integer, List<JsonObject>> entry : nqtVar.c(nqtVar.m()).entrySet()) {
                d((List<HiHealthData>) sparseArray.get(entry.getKey().intValue()), entry.getValue(), arrayList);
            }
            String strE = peh.e(arrayList, new TypeToken<ArrayList<nrh>>() { // from class: com.huawei.hwonesdk.process.ReadDataProcess$2
            }.getType());
            LogUtil.a("HiHealthProcess__readData", "postProcess property json ", strE);
            return strE;
        }
        if (obj2 instanceof nrb) {
            SparseArray sparseArray2 = (SparseArray) obj;
            ArrayList<nrh> arrayList2 = new ArrayList<>();
            for (Map.Entry entry2 : ((nqu) obj2).h().entrySet()) {
                b((List) sparseArray2.get(((Integer) entry2.getKey()).intValue()), (List) entry2.getValue(), arrayList2);
            }
            String strE2 = peh.e(arrayList2, new TypeToken<ArrayList<nrh>>() { // from class: com.huawei.hwonesdk.process.ReadDataProcess$3
            }.getType());
            LogUtil.a("HiHealthProcess__readData", "postProcess property json ", strE2);
            return strE2;
        }
        if (!(obj2 instanceof nqy)) {
            return "[]";
        }
        SparseArray sparseArray3 = (SparseArray) obj;
        ArrayList<nrh> arrayList3 = new ArrayList<>();
        for (Map.Entry<Integer, JsonObject> entry3 : ((nqy) obj2).h().entrySet()) {
            d((List<HiHealthData>) sparseArray3.get(entry3.getKey().intValue()), entry3.getValue(), arrayList3);
        }
        String strE3 = peh.e(arrayList3, new TypeToken<ArrayList<nrh>>() { // from class: com.huawei.hwonesdk.process.ReadDataProcess$4
        }.getType());
        LogUtil.a("HiHealthProcess__readData", "postProcess SampleStatReadRequest json ", strE3);
        return strE3;
    }

    private void d(List<HiHealthData> list, List<JsonObject> list2, ArrayList<nrh> arrayList) {
        if (CollectionUtils.a(list)) {
            return;
        }
        for (JsonObject jsonObject : list2) {
            for (HiHealthData hiHealthData : list) {
                nrh nrhVarD = nqk.d(arrayList, hiHealthData);
                if (nrhVarD == null) {
                    nrhVarD = new nrh(hiHealthData);
                    nrhVarD.d(new DataType(jsonObject.get(nqk.d).getAsInt(), jsonObject.get(nqk.f43453a).getAsString()));
                    arrayList.add(nrhVarD);
                }
                nrhVarD.a(hiHealthData.getString("trackdata_deviceType"));
                d(jsonObject, hiHealthData, nrhVarD);
            }
        }
    }

    private void b(List<HiHealthData> list, List<JsonObject> list2, ArrayList<nrh> arrayList) {
        if (CollectionUtils.a(list)) {
            return;
        }
        for (JsonObject jsonObject : list2) {
            for (HiHealthData hiHealthData : list) {
                nrh nrhVarD = nqk.d(arrayList, hiHealthData);
                if (nrhVarD == null) {
                    nrhVarD = new nrh(hiHealthData);
                    nrhVarD.d(new DataType(jsonObject.get(nqk.d).getAsInt(), jsonObject.get(nqk.f43453a).getAsString()));
                    arrayList.add(nrhVarD);
                }
                nrhVarD.a(hiHealthData.getString("trackdata_deviceType"));
                e(jsonObject, hiHealthData, nrhVarD);
            }
        }
    }

    private void d(JsonObject jsonObject, HiHealthData hiHealthData, nrh nrhVar) {
        String asString;
        boolean asBoolean = jsonObject.get(nqk.f43455c) != null ? jsonObject.get(nqk.f43455c).getAsBoolean() : false;
        Object objValueOf = "";
        if (!asBoolean || jsonObject.get(nqk.e) == null) {
            asString = "";
        } else {
            asString = jsonObject.get(nqk.e).getAsString();
        }
        if (TextUtils.isEmpty(asString)) {
            objValueOf = asBoolean ? hiHealthData.getMetaData() : Double.valueOf(hiHealthData.getValue());
        } else {
            JsonObject asJsonObject = JsonParser.parseString(hiHealthData.getMetaData()).getAsJsonObject();
            if (asJsonObject.has(asString)) {
                objValueOf = asJsonObject.get(asString);
                if (!qrs.d(String.valueOf(objValueOf))) {
                    objValueOf = String.valueOf(objValueOf);
                }
            }
        }
        if (!TextUtils.isEmpty(hiHealthData.getMetaData())) {
            Map<Integer, String> map = f43565c;
            if (map.containsKey(Integer.valueOf(hiHealthData.getType()))) {
                nrhVar.c(map.get(Integer.valueOf(hiHealthData.getType())), hiHealthData.getMetaData());
            }
        }
        nrhVar.c(jsonObject.get(nqk.f43453a).getAsString(), objValueOf);
    }

    private void d(List<HiHealthData> list, JsonObject jsonObject, ArrayList<nrh> arrayList) {
        if (CollectionUtils.a(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            nrh nrhVarE = nqk.e(arrayList, hiHealthData);
            if (nrhVarE == null) {
                nrhVarE = new nrh(hiHealthData);
                nrhVarE.d(new DataType(jsonObject.get(nqk.d).getAsInt(), jsonObject.get(nqk.f43453a).getAsString()));
                arrayList.add(nrhVarE);
            }
            a(jsonObject, hiHealthData, nrhVarE);
        }
    }

    private void e(JsonObject jsonObject, HiHealthData hiHealthData, nrh nrhVar) {
        if (TextUtils.isEmpty(hiHealthData.getMetaData())) {
            return;
        }
        JsonObject asJsonObject = JsonParser.parseString(hiHealthData.getMetaData()).getAsJsonObject();
        if (asJsonObject.has(jsonObject.get(nqk.f43453a).getAsString())) {
            Object objValueOf = asJsonObject.get(jsonObject.get(nqk.f43453a).getAsString());
            if (!qrs.d(String.valueOf(objValueOf))) {
                objValueOf = String.valueOf(objValueOf);
            }
            nrhVar.c(jsonObject.get(nqk.f43453a).getAsString(), objValueOf);
            nrhVar.d(jsonObject.get(nqk.f43453a).getAsString(), objValueOf);
        }
    }

    private void a(JsonObject jsonObject, HiHealthData hiHealthData, nrh nrhVar) {
        Map<String, Object> mapC = nrhVar.c();
        Map map = new HashMap();
        if (mapC.containsKey(jsonObject.get(nqk.h).getAsString())) {
            Object obj = mapC.get(jsonObject.get(nqk.h).getAsString());
            if (obj instanceof Map) {
                map = (Map) obj;
            }
        }
        map.put(jsonObject.get(nqk.f43453a).getAsString(), Double.valueOf(hiHealthData.getValue()));
        nrhVar.c(jsonObject.get(nqk.h).getAsString(), map);
    }

    public nqu a(String str) {
        if (str.contains(nqk.f)) {
            return (nqu) peh.b(str, nqt.class);
        }
        if (str.contains(nqk.j)) {
            return (nqu) peh.b(str, nqy.class);
        }
        if (str.contains(nqk.i)) {
            return (nqu) peh.b(str, nrb.class);
        }
        return null;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess__readData", "doAction callback is null");
            return;
        }
        HiDataReadProOption hiDataReadProOptionPreProcess = preProcess(str);
        LogUtil.a("HiHealthProcess__readData", "preProcess readHiHealthDataPro", hiDataReadProOptionPreProcess);
        if (hiDataReadProOptionPreProcess == null) {
            iBaseResponseCallback.a(0, "[]");
            ReleaseLogUtil.a("HiHealthProcess__readData", "doAction option is null");
        } else {
            if (b(str, iBaseResponseCallback)) {
                return;
            }
            HiHealthManager.d(BaseApplication.b()).readHiHealthDataPro(hiDataReadProOptionPreProcess, new a(this, str, iBaseResponseCallback));
        }
    }

    private boolean b(String str, final IBaseResponseCallback iBaseResponseCallback) {
        final nqu nquVarA = a(str);
        if (!(nquVarA instanceof nqt) || ((nqt) nquVarA).n()[0] != DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()) {
            return false;
        }
        LogUtil.a("HiHealthProcess__readData", "customAction enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: nsb
            @Override // java.lang.Runnable
            public final void run() {
                nqk.b(nqj.a().e(((nqt) nquVarA).n()), new Object[]{"", iBaseResponseCallback, ""});
            }
        });
        return true;
    }

    static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBaseResponseCallback f43567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nry f43568c;

        a(nry nryVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.f43568c = nryVar;
            this.f43566a = str;
            this.f43567b = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, int i, int i2) {
            LogUtil.a("HiHealthProcess__readData", "readHiHealthDataPro result, errorCode: ", Integer.valueOf(i));
            if (i != 0) {
                ReleaseLogUtil.e("HiHealthProcess__readData", "readHiHealthDataPro fail");
                this.f43567b.a(-1, Integer.valueOf(i));
                return;
            }
            if (this.f43567b == null) {
                ReleaseLogUtil.e("HiHealthProcess__readData", "onResult callback is null");
                return;
            }
            nry nryVar = this.f43568c;
            if (nryVar == null) {
                ReleaseLogUtil.e("HiHealthProcess__readData", "onResult process is null");
                this.f43567b.a(-1, "");
                return;
            }
            final nqu nquVarA = nryVar.a(this.f43566a);
            if (nquVarA == null) {
                ReleaseLogUtil.e("HiHealthProcess__readData", "onResult request is null");
                this.f43567b.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nsg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.d(obj, nquVarA);
                    }
                });
            }
        }

        /* synthetic */ void d(Object obj, nqu nquVar) {
            String strE;
            String strPostProcess = this.f43568c.postProcess(obj, nquVar);
            if (nquVar instanceof nqt) {
                strE = nqj.a().e(((nqt) nquVar).n());
            } else if (!(nquVar instanceof nrb)) {
                strE = "";
            } else {
                strE = nqj.a().e(((nrb) nquVar).k());
            }
            if (!TextUtils.isEmpty(strE)) {
                nqk.b(strE, new Object[]{strPostProcess, this.f43567b, obj});
            } else {
                this.f43567b.a(0, strPostProcess);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("HiHealthProcess__readData", "readHiHealthDataPro, data is ", obj);
            this.f43567b.a(-1, "");
        }
    }
}
