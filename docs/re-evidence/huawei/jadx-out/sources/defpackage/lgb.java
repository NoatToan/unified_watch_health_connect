package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.store.interfaces.IDataRead;
import com.huawei.hihealthservice.store.stat.HiTrackStat;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class lgb implements IDataRead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f40074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, int[]> f40075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f40076c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static Context n;
    private kyj k;
    private boolean l;
    private kyn m;
    private lge o;

    private boolean b(int i2) {
        return i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
    }

    private boolean c(int i2) {
        switch (i2) {
            case 2034:
            case 2035:
            case 2036:
            case 2037:
                return true;
            default:
                return false;
        }
    }

    private boolean d(int i2) {
        switch (i2) {
            case 22000:
            case 22001:
            case 22002:
            case 22003:
                return true;
            default:
                switch (i2) {
                    case 22100:
                    case 22101:
                    case 22102:
                    case 22103:
                    case 22104:
                    case 22105:
                    case 22106:
                    case 22107:
                        return true;
                    default:
                        return false;
                }
        }
    }

    private boolean e(int i2) {
        return i2 == 2002 || i2 == 2018 || i2 == 2105;
    }

    static {
        HashMap map = new HashMap(16);
        f40075b = map;
        HashMap map2 = new HashMap(16);
        f40076c = map2;
        int[] iArr = {42051, 42052, 42053, 42054, 42055, 42056, 42057, 42058, 42059, 42060, 42061};
        j = iArr;
        int[] iArr2 = {42101, 42102, 42103, 42104, 42105, 42106, 42107, 42108, 42109, 42110, 42111};
        h = iArr2;
        int[] iArr3 = {42151, 42152, 42153, 42154, 42155, 42156, 42157, 42158, 42159, 42160, 42161};
        d = iArr3;
        int[] iArr4 = {42201, 42202, 42203, 42204, 42205, 42206, 42207, 42208, 42209, 42210, 42211};
        f = iArr4;
        int[] iArr5 = {42251, 42252, 42253, 42254, 42255, 42256, 42257, 42258, 42259, 42260, 42261};
        g = iArr5;
        int[] iArr6 = {42351, 42352, 42353, 42354, 42355, 42356, 42357, 42358, 42359, 42360, 42361, 42362};
        i = iArr6;
        int[] iArr7 = {42401, 42402, 42403, 42404, 42405, 42406, 42407, 42408, 42409, 42410, 42411};
        f40074a = iArr7;
        int[] iArr8 = {42310, 42301, 42302, 42303, 42304, 42311, 42305, 42306, 42307, 42308, 42309, 12, 42305, 42306};
        e = iArr8;
        map.put(BleConstants.SPORT_TYPE_WALK, iArr);
        map.put(BleConstants.SPORT_TYPE_RUN, iArr2);
        map.put(BleConstants.SPORT_TYPE_BIKE, iArr3);
        map.put("262", iArr4);
        map.put("512", iArr5);
        map.put("217", iArr6);
        map.put("220", iArr7);
        map.put("271", iArr8);
        map2.put(22000, 44004);
        map2.put(2105, 46020);
        map2.put(2018, 46018);
        map2.put(2002, 46016);
        map2.put(2034, 44305);
        map2.put(7, 47101);
        map2.put(2103, 47201);
    }

    private lgb() {
        d();
    }

    static class b {
        private static final lgb e = new lgb();
    }

    public static lgb a(Context context) {
        if (context != null) {
            n = context.getApplicationContext();
        }
        return b.e;
    }

    private void d() {
        this.m = kyn.d(n);
        this.k = kyj.c();
        this.o = lge.b(n);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataRead
    public List<HiHealthData> readAggregateData(kym kymVar, HiAggregateOption hiAggregateOption, kth kthVar) {
        if (kymVar == null || hiAggregateOption == null) {
            return null;
        }
        int alignType = hiAggregateOption.getAlignType();
        int readType = hiAggregateOption.getReadType();
        int i2 = kymVar.i();
        List<Integer> listD = d(readType, i2, kymVar.b(), hiAggregateOption.getDeviceUuid());
        String deviceUuid = hiAggregateOption.getDeviceUuid();
        int[] type = hiAggregateOption.getType();
        HiHealthDataType.Category categoryD = HiHealthDataType.d(type[0]);
        List<HiHealthData> listD2 = d(categoryD, new int[]{alignType, readType, i2}, kymVar, hiAggregateOption, deviceUuid, kthVar);
        this.l = false;
        if (HiCommonUtil.b(listD2)) {
            d(i2, type[0], hiAggregateOption.getStartTime(), hiAggregateOption.getEndTime(), b(readType, i2, kymVar.b(), hiAggregateOption.getDeviceUuid()), false, listD);
        }
        if (listD2 != null) {
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "readAggregateData types = ", Arrays.toString(type), " ret hiHealthDatas size = ", Integer.valueOf(listD2.size()));
        }
        return this.l ? d(categoryD, new int[]{alignType, readType, i2}, kymVar, hiAggregateOption, deviceUuid, kthVar) : listD2;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataRead
    public List<HiHealthData> readSportStatAggregateData(kym kymVar, HiSportStatDataAggregateOption hiSportStatDataAggregateOption) {
        if (kymVar == null || hiSportStatDataAggregateOption == null) {
            return null;
        }
        b(hiSportStatDataAggregateOption);
        int alignType = hiSportStatDataAggregateOption.getAlignType();
        int readType = hiSportStatDataAggregateOption.getReadType();
        int i2 = kymVar.i();
        List<Integer> listD = d(readType, i2, kymVar.b(), hiSportStatDataAggregateOption.getDeviceUuid());
        String deviceUuid = hiSportStatDataAggregateOption.getDeviceUuid();
        List<HiHealthData> listE = e(new int[]{alignType, readType, i2}, kymVar, hiSportStatDataAggregateOption, deviceUuid);
        this.l = false;
        int[] type = hiSportStatDataAggregateOption.getType();
        if (HiCommonUtil.b(listE)) {
            d(i2, type[0], hiSportStatDataAggregateOption.getStartTime(), hiSportStatDataAggregateOption.getEndTime(), b(readType, i2, kymVar.b(), hiSportStatDataAggregateOption.getDeviceUuid()), false, listD);
        }
        if (listE != null) {
            LogUtil.a("HiH_HiHlhDataRds", "readAggregateData types = ", Arrays.toString(type), " ret hiHealthData size = ", Integer.valueOf(listE.size()));
        }
        return this.l ? e(new int[]{alignType, readType, i2}, kymVar, hiSportStatDataAggregateOption, deviceUuid) : listE;
    }

    private List<HiHealthData> d(HiHealthDataType.Category category, int[] iArr, kym kymVar, HiAggregateOption hiAggregateOption, String str, kth kthVar) {
        List<HiHealthData> listE;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        kxo kxoVarE = ljq.e(n, hiAggregateOption.getType()[0]);
        if (AnonymousClass1.e[category.ordinal()] == 1) {
            int iB = b(i3, i4, kymVar.b(), str);
            LogUtil.d("HiH_HiHlhDataRds", "readAggregateData statClient is ", Integer.valueOf(iB), "hiContext is ", kymVar);
            if (iB <= 0) {
                LogUtil.j("HiH_HiHlhDataRds", "readAggregateData() stat  statClient <= 0 hiContext = ", kymVar);
                return null;
            }
            listE = e(kymVar, hiAggregateOption, str, iArr, iB, kthVar);
        } else {
            List<Integer> listD = d(i3, i4, kymVar.b(), str);
            if (listD == null || listD.isEmpty()) {
                LogUtil.j("HiH_HiHlhDataRds", "readAggregateData()  default clients is null hiContext = ", kymVar);
                return null;
            }
            if (i2 <= 0) {
                if (i3 == 0) {
                    listE = kxoVarE.d(listD, hiAggregateOption, kthVar);
                } else {
                    listE = kxoVarE.e(listD, hiAggregateOption, kthVar);
                }
            } else if (i3 == 0) {
                listE = kxoVarE.b(listD, hiAggregateOption);
            } else {
                listE = kxoVarE.d(listD, hiAggregateOption);
            }
        }
        if (listE != null) {
            Iterator<HiHealthData> it = listE.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
        return listE;
    }

    private List<HiHealthData> e(int[] iArr, kym kymVar, HiSportStatDataAggregateOption hiSportStatDataAggregateOption, String str) {
        int iB = b(iArr[1], iArr[2], kymVar.b(), str);
        LogUtil.d("HiH_HiHlhDataRds", "getSportStatAggregateData statClient is ", Integer.valueOf(iB), "hiContext is ", kymVar);
        if (iB <= 0) {
            LogUtil.j("HiH_HiHlhDataRds", "getSportStatAggregateData() stat  statClient <= 0 hiContext = ", kymVar);
            return null;
        }
        List<HiHealthData> listC = c(kymVar, hiSportStatDataAggregateOption, str, iArr, iB);
        if (listC != null) {
            Iterator<HiHealthData> it = listC.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
        return listC;
    }

    private List<HiHealthData> e(kym kymVar, HiAggregateOption hiAggregateOption, String str, int[] iArr, int i2, kth kthVar) {
        kxo kxoVarE = ljq.e(n, hiAggregateOption.getType()[0]);
        int i3 = iArr[1];
        int i4 = iArr[2];
        List<HiHealthData> listB = kxoVarE.b(i2, hiAggregateOption, kthVar);
        if (listB == null || listB.isEmpty()) {
            List<Integer> listD = d(i3, i4, kymVar.b(), str);
            if (listD == null || listD.isEmpty()) {
                LogUtil.j("HiH_HiHlhDataRds", "readAggregateData()  default clients is null hiContext = ", kymVar);
                return listB;
            }
            if (d(hiAggregateOption, listD, i4)) {
                return kxoVarE.b(i2, hiAggregateOption, kthVar);
            }
        }
        return listB;
    }

    private List<HiHealthData> c(kym kymVar, HiSportStatDataAggregateOption hiSportStatDataAggregateOption, String str, int[] iArr, int i2) {
        b(hiSportStatDataAggregateOption);
        kxo kxoVarE = ljq.e(n, hiSportStatDataAggregateOption.getType()[0]);
        int i3 = iArr[1];
        final int i4 = iArr[2];
        List<HiHealthData> listD = kxoVarE.d(i2, hiSportStatDataAggregateOption);
        if (listD != null && !listD.isEmpty()) {
            return listD;
        }
        LogUtil.j("HiH_HiHlhDataRds", "getSportStatData() result is null");
        final List<Integer> listD2 = d(i3, i4, kymVar.b(), str);
        if (listD2 == null || listD2.isEmpty()) {
            LogUtil.j("HiH_HiHlhDataRds", "getSportStatData() default clients is null hiContext = ", kymVar);
            return listD;
        }
        final HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setEndTime(hiSportStatDataAggregateOption.getEndTime());
        hiAggregateOption.setSortOrder(hiSportStatDataAggregateOption.getSortOrder());
        hiAggregateOption.setAnchor(hiSportStatDataAggregateOption.getAnchor());
        hiAggregateOption.setCount(hiSportStatDataAggregateOption.getCount());
        hiAggregateOption.setType(hiSportStatDataAggregateOption.getType());
        ThreadPoolManager.c().execute(new Runnable() { // from class: lgb.5
            @Override // java.lang.Runnable
            public void run() {
                lgb.this.d(hiAggregateOption, listD2, i4);
            }
        });
        return listD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(HiAggregateOption hiAggregateOption, List<Integer> list, int i2) {
        long j2;
        int i3;
        int[] type = hiAggregateOption.getType();
        hiAggregateOption.getStartTime();
        switch (type[0]) {
            case 42301:
            case 42302:
            case 42303:
            case 42304:
            case 42305:
            case 42306:
            case 42307:
            case 42308:
            case 42309:
            case 42310:
            case 42311:
                j2 = 1559318400000L;
                i3 = 30023;
                break;
            default:
                j2 = 0;
                i3 = 0;
                break;
        }
        long j3 = j2;
        if (ljz.e(n, i2, i3)) {
            return false;
        }
        ljz.c(n, i2, i3, true);
        LogUtil.a("HiH_HiHlhDataRds", "First stat basketball data begin!");
        List<HiHealthData> listD = d(hiAggregateOption, j3, i3, list);
        if (njy.e(listD)) {
            LogUtil.j("HiH_HiHlhDataRds", "getNewTrackStat basketball data is null!");
            return false;
        }
        HiTrackStat hiTrackStat = new HiTrackStat(n);
        for (HiHealthData hiHealthData : listD) {
            hiHealthData.setUserId(i2);
            hiTrackStat.stat(hiHealthData);
        }
        LogUtil.a("HiH_HiHlhDataRds", "First stat basketball data end");
        return true;
    }

    private List<HiHealthData> d(HiAggregateOption hiAggregateOption, long j2, int i2, List<Integer> list) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j2);
        hiDataReadOption.setEndTime(hiAggregateOption.getEndTime());
        hiDataReadOption.setSortOrder(hiAggregateOption.getSortOrder());
        hiDataReadOption.setAnchor(hiAggregateOption.getAnchor());
        hiDataReadOption.setCount(hiAggregateOption.getCount());
        LogUtil.a("HiH_HiHlhDataRds", "getSequenceHealthDatas() sequenceType = ", Integer.valueOf(i2), " hiDataReadOption = ", hiDataReadOption.toString());
        List<HiHealthData> listA = lgf.a(kws.e(n).a(list, hiDataReadOption, 30001), i2);
        if (!njy.e(listA)) {
            LogUtil.a("HiH_HiHlhDataRds", "getSequenceHealthDatas() sequenceType = ", Integer.valueOf(i2), " sequenceHealthDatas.size = ", Integer.valueOf(listA.size()));
        }
        return listA;
    }

    private void d(HiHealthData hiHealthData) {
        kyh kyhVarD = kyh.d(n);
        hiHealthData.putInt("trackdata_deviceType", kyhVarD.b(hiHealthData.getClientId()));
        HiDeviceInfo hiDeviceInfoD = kyhVarD.d(hiHealthData.getClientId());
        String strB = kyhVarD.b(hiDeviceInfoD);
        String strE = kyhVarD.e(hiDeviceInfoD);
        String strA = kyhVarD.a(hiDeviceInfoD);
        String strC = kyhVarD.c(hiDeviceInfoD);
        String strD = kyhVarD.d(hiDeviceInfoD);
        hiHealthData.putString("device_model", strE);
        hiHealthData.putString("device_name", strB);
        hiHealthData.putString("device_uniquecode", strA);
        hiHealthData.putString("device_prodid", strC);
        hiHealthData.putString("device_subprodid", strD);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataRead
    public void readDataByAlignType(int i2, kym kymVar, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        List<HiHealthData> listA;
        List<HiHealthData> listA2;
        if (kymVar == null || hiDataReadOption == null || iDataReadResultListener == null) {
            return;
        }
        int readType = hiDataReadOption.getReadType();
        List<Integer> listD = d(readType, kymVar.i(), kymVar.b(), hiDataReadOption.getDeviceUuid());
        if (listD == null || listD.isEmpty()) {
            iDataReadResultListener.onResult(new ArrayList(), 0, 1);
            LogUtil.j("HiH_HiHlhDataRds", "readDataByAlignType()  clients is null hiContext = ", kymVar);
            return;
        }
        if (i2 == 20001) {
            int[] iArrA = ljq.a(n, hiDataReadOption.getType());
            if (iArrA.length > 0 && !c("hihealth_sensitive.db")) {
                throw new RuntimeException("can not open sensitive db");
            }
            int[] iArrE = ljq.e(n, hiDataReadOption.getType());
            if (readType == 0) {
                hiDataReadOption.setType(iArrA);
                listA = e(listD, hiDataReadOption);
                hiDataReadOption.setType(iArrE);
                listA2 = e(listD, hiDataReadOption);
            } else {
                hiDataReadOption.setType(iArrA);
                listA = a(listD, hiDataReadOption);
                hiDataReadOption.setType(iArrE);
                listA2 = a(listD, hiDataReadOption);
            }
            ArrayList arrayList = new ArrayList();
            if (njy.b(listA)) {
                arrayList.addAll(listA);
            }
            if (njy.b(listA2)) {
                arrayList.addAll(listA2);
            }
            HiDivideUtil.d(i2, arrayList, iDataReadResultListener);
            return;
        }
        iDataReadResultListener.onResult(null, i2, 1);
    }

    private boolean c(String str) {
        if (HiHealthDBHelper.e(str).getWritableDatabase() != null) {
            return true;
        }
        LogUtil.e("HiH_HiHlhDataRds", "Can not open db ", str);
        return false;
    }

    private List<HiHealthData> e(List<Integer> list, HiDataReadOption hiDataReadOption) {
        if (hiDataReadOption.getType() == null || hiDataReadOption.getType().length == 0) {
            return null;
        }
        return ljq.e(n, hiDataReadOption.getType()[0]).d(list, hiDataReadOption);
    }

    private List<HiHealthData> a(List<Integer> list, HiDataReadOption hiDataReadOption) {
        if (hiDataReadOption.getType() == null || hiDataReadOption.getType().length == 0) {
            return null;
        }
        return ljq.e(n, hiDataReadOption.getType()[0]).c(list, hiDataReadOption);
    }

    private List<Integer> d(int i2, int i3, int i4, String str) {
        kym kymVarE;
        if (i2 == 0) {
            return this.k.c(i3);
        }
        if (i2 == 1) {
            return this.k.e(i4, i3);
        }
        if (i2 == 2) {
            return this.k.a(i3, str);
        }
        if (i2 != 3 || (kymVarE = this.m.e(i4, i3, str)) == null) {
            return null;
        }
        int iC = kymVarE.c();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(iC));
        return arrayList;
    }

    private int b(int i2, int i3, int i4, String str) {
        kym kymVarE;
        LogUtil.d("HiH_HiHlhDataRds", "getStatClientID() readType = ", Integer.valueOf(i2), ",who =  ", Integer.valueOf(i3), ",app = ", Integer.valueOf(i4));
        int iE = 0;
        if (i2 == 0) {
            iE = this.m.e(0, i3, 0);
        } else if (i2 == 1) {
            iE = this.m.e(i4, i3, 0);
        } else if (i2 == 2) {
            kym kymVarE2 = this.m.e(0, i3, str);
            if (kymVarE2 != null) {
                iE = kymVarE2.c();
            }
        } else if (i2 == 3 && (kymVarE = this.m.e(i4, i3, str)) != null) {
            iE = kymVarE.c();
        }
        LogUtil.d("HiH_HiHlhDataRds", "getStatClientID() statClient = ", Integer.valueOf(iE));
        return iE;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataRead
    public void readDataByType(HiDataReadOption hiDataReadOption, kym kymVar, kth kthVar, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (kymVar == null || hiDataReadOption == null || iDataReadResultListener == null) {
            return;
        }
        int readType = hiDataReadOption.getReadType();
        int i2 = kymVar.i();
        List<Integer> listD = d(readType, i2, kymVar.b(), hiDataReadOption.getDeviceUuid());
        int iB = b(readType, i2, kymVar.b(), hiDataReadOption.getDeviceUuid());
        LogUtil.d("HiH_HiHlhDataRds", "readDataByType who is ", Integer.valueOf(i2), " statClient is ", Integer.valueOf(iB));
        if (HiCommonUtil.b(listD)) {
            iDataReadResultListener.onResult(new ArrayList(), 0, 1);
            LogUtil.j("HiH_HiHlhDataRds", "readDataByType clients null or empty");
            return;
        }
        int[] type = hiDataReadOption.getType();
        if (kthVar.k()) {
            if (HiCommonUtil.d(type, 44102) != -1 || HiCommonUtil.d(type, 2004) != -1 || HiCommonUtil.d(type, DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value()) != -1) {
                b(listD, iB, i2, hiDataReadOption, iDataReadResultListener, type);
                return;
            }
            List<HiHealthData> listB = b(hiDataReadOption, iB, listD);
            if (HiCommonUtil.b(listB)) {
                iDataReadResultListener.onResult(new ArrayList(10), type[0], 1);
                return;
            }
            for (HiHealthData hiHealthData : listB) {
                hiDataReadOption.setStartTime(HiDateUtil.p(hiHealthData.getStartTime()));
                hiDataReadOption.setEndTime(HiDateUtil.g(hiHealthData.getStartTime()));
                if (!HiCommonUtil.b(b(hiDataReadOption, kthVar, iDataReadResultListener, kymVar, listD, new int[]{iB, readType, i2}))) {
                    return;
                }
            }
            return;
        }
        b(hiDataReadOption, kthVar, iDataReadResultListener, kymVar, listD, new int[]{iB, readType, i2});
    }

    private List<HiHealthData> b(HiDataReadOption hiDataReadOption, kth kthVar, IDataReadResultListener iDataReadResultListener, kym kymVar, List<Integer> list, int[] iArr) throws RemoteException {
        boolean z = false;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int[] type = hiDataReadOption.getType();
        ArrayList arrayList = new ArrayList(10);
        int length = type.length;
        List<Integer> list2 = list;
        int i5 = 0;
        while (i5 < length) {
            int i6 = type[i5];
            this.l = z;
            List<HiHealthData> listE = e(hiDataReadOption, iDataReadResultListener, kthVar, list2, new int[]{i2, i6, i4});
            if (HiCommonUtil.b(listE)) {
                d(i4, i6, hiDataReadOption.getStartTime(), hiDataReadOption.getEndTime(), i2, true, list2);
            }
            if (this.l) {
                List<Integer> listD = d(i3, i4, kymVar.b(), hiDataReadOption.getDeviceUuid());
                listE = e(hiDataReadOption, iDataReadResultListener, kthVar, listD, new int[]{i2, i6, i4});
                list2 = listD;
            }
            List<HiHealthData> list3 = listE;
            if (!HiCommonUtil.b(list3)) {
                arrayList.addAll(list3);
            }
            i5++;
            arrayList = arrayList;
            length = length;
            type = type;
            z = false;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 0 && 2 == hiDataReadOption.getReadType()) {
            LogUtil.a("HiH_HiHlhDataRds", "clients=" + HiJsonUtil.d(list2));
        }
        return arrayList2;
    }

    private void b(List<Integer> list, int i2, int i3, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, int[] iArr) throws RemoteException {
        if (HiCommonUtil.d(iArr, 44102) != -1) {
            HiDivideUtil.d(44102, ljq.d(n, 44102).d(hiDataReadOption, hiDataReadOption.getType(), i2), iDataReadResultListener);
        }
        if (HiCommonUtil.d(iArr, 2004) != -1) {
            HiDivideUtil.d(2004, ljq.a(n, 2004).b(hiDataReadOption, hiDataReadOption.getType(), list, kxq.c().d(i3)), iDataReadResultListener);
        }
        if (HiCommonUtil.d(iArr, DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value()) != -1) {
            HiDivideUtil.d(DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value(), ljq.a(n, DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value()).b(hiDataReadOption, hiDataReadOption.getType(), list), iDataReadResultListener);
        }
    }

    private List<HiHealthData> b(HiDataReadOption hiDataReadOption, int i2, List<Integer> list) {
        HiDataReadOption hiDataReadOption2 = new HiDataReadOption();
        hiDataReadOption2.setTimeInterval(hiDataReadOption.getStartTime(), hiDataReadOption.getEndTime());
        hiDataReadOption2.setSortOrder(1);
        int i3 = hiDataReadOption.getType()[0];
        hiDataReadOption2.setCount(1);
        if (i3 == 2002) {
            hiDataReadOption2.setType(new int[]{46019});
            return this.o.a(46019, i2, hiDataReadOption2, (kth) null);
        }
        if (i3 == 2034) {
            hiDataReadOption2.setType(new int[]{44307});
            return this.o.a(44307, i2, hiDataReadOption2, (kth) null);
        }
        if (i3 == 2103 || i3 == 2107) {
            int[] iArr = {2103};
            hiDataReadOption2.setType(iArr);
            return ljq.a(n, 2103).b(hiDataReadOption2, iArr, list);
        }
        int[] iArrE = HiHealthDataType.e(10001);
        int[] iArrCopyOf = Arrays.copyOf(iArrE, iArrE.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = 2108;
        if (HiCommonUtil.d(iArrCopyOf, i3) == -1 && i3 != 10001) {
            return null;
        }
        hiDataReadOption2.setType(iArrCopyOf);
        return ljq.a(n, i3).b(hiDataReadOption2, iArrCopyOf, list);
    }

    private List<HiHealthData> e(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, kth kthVar, List<Integer> list, int[] iArr) throws RemoteException {
        List<HiHealthData> listA;
        boolean z = false;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        HiHealthDataType.Category categoryD = HiHealthDataType.d(i3);
        LogUtil.d("HiH_HiHlhDataRds", "readHiHealthData() sampleType = ", Integer.valueOf(i3), ", category = ", categoryD);
        switch (AnonymousClass1.e[categoryD.ordinal()]) {
            case 1:
                listA = this.o.a(i3, i2, hiDataReadOption, kthVar);
                z = true;
                break;
            case 2:
                listA = this.o.a(i3, list, hiDataReadOption);
                if (listA != null) {
                    for (HiHealthData hiHealthData : listA) {
                        hiHealthData.putInt("trackdata_deviceType", kyh.d(n).b(hiHealthData.getClientId()));
                    }
                }
                z = true;
                break;
            case 3:
                listA = this.o.a(i3, list, hiDataReadOption, kthVar);
                if (listA != null) {
                    for (HiHealthData hiHealthData2 : listA) {
                        hiHealthData2.putInt("trackdata_deviceType", kyh.d(n).b(hiHealthData2.getClientId()));
                    }
                }
                z = true;
                break;
            case 4:
                this.o.e(i3, list, hiDataReadOption, kthVar, iDataReadResultListener);
                listA = null;
                break;
            case 5:
                listA = this.o.a(i4, hiDataReadOption);
                z = true;
                break;
            case 6:
                listA = this.o.c(i3, i4, hiDataReadOption);
                z = true;
                break;
            default:
                listA = a(categoryD, hiDataReadOption, list, i2, i3, kthVar);
                z = true;
                break;
        }
        if (listA != null) {
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "rDataByTp sTp=", Integer.valueOf(i3), " rDtSize=", Integer.valueOf(listA.size()));
            Iterator<HiHealthData> it = listA.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
        if (z) {
            HiDivideUtil.d(i3, listA, iDataReadResultListener);
        }
        return listA;
    }

    public List<HiHealthData> b(int i2, long j2, long j3, List<Integer> list) {
        if (AnonymousClass1.e[HiHealthDataType.d(i2).ordinal()] != 4) {
            return null;
        }
        return kws.e(n).a(list, j2, j3, i2);
    }

    public List<HiHealthData> b(int i2, List<Integer> list) {
        if (AnonymousClass1.e[HiHealthDataType.d(i2).ordinal()] != 4) {
            return null;
        }
        return kws.e(n).b(list);
    }

    private List<HiHealthData> a(HiHealthDataType.Category category, HiDataReadOption hiDataReadOption, List<Integer> list, int i2, int i3, kth kthVar) {
        switch (category) {
            case SET:
                List<HiHealthData> listC = this.o.c(i3, list, hiDataReadOption, kthVar);
                if (listC != null) {
                    for (HiHealthData hiHealthData : listC) {
                        hiHealthData.putInt("trackdata_deviceType", kyh.d(n).b(hiHealthData.getClientId()));
                    }
                }
                return listC;
            case REALTIME:
                return this.o.e(i3, list, hiDataReadOption.getDeviceUuid());
            case CONFIG:
                return this.o.b(i3, list, hiDataReadOption);
            case CONFIGSTAT:
                return this.o.b(i3, i2, hiDataReadOption);
            default:
                return null;
        }
    }

    private boolean a(HiDataReadOption hiDataReadOption, int i2) {
        return !HiCommonUtil.b(kww.c(n).d(hiDataReadOption, new int[]{44105, 44109, 44108}, i2));
    }

    private void d(int i2, int i3, long j2, long j3, int i4, boolean z, List<Integer> list) {
        int i5;
        int i6;
        LogUtil.a("HiH_HiHlhDataRds", "startBackInsert  types[0]=" + i3 + " readStartTime = " + j2 + " readEndTime = " + j3);
        long j4 = j3 - j2;
        if (j4 > 86400000 || j4 < 3600000) {
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "interval > 1day or < 1hour, type=", Integer.valueOf(i3));
            return;
        }
        boolean zB = PowerKitManager.a().b();
        if (zB || !CommonUtil.ab(n)) {
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "network is disconnected, isUserSleeping=", Boolean.valueOf(zB));
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j2);
        hiDataReadOption.setEndTime(j3);
        HiDataReadOption hiDataReadOption2 = new HiDataReadOption();
        hiDataReadOption2.setStartTime(HiDateUtil.p(j2));
        hiDataReadOption2.setEndTime(HiDateUtil.g(j3));
        if (b(i3)) {
            i5 = PrebakedEffectId.RT_CALENDAR_DATE;
            i6 = 10011;
        } else if (d(i3)) {
            hiDataReadOption.setStartTime(j3);
            if (i3 == 22100 && !a(hiDataReadOption, i4)) {
                ReleaseLogUtil.d("HiH_HiHlhDataRds", "DATA_SESSION_CORE_SLEEP StatData null");
                return;
            }
            if (d(i3, i4, hiDataReadOption, 22000)) {
                return;
            }
            hiDataReadOption2.setTimeInterval(HiDateUtil.o(j2), HiDateUtil.m(j3));
            if (this.o.c(i3, list, hiDataReadOption2)) {
                ReleaseLogUtil.d("HiH_HiHlhDataRds", "readSleepAllData have data");
                return;
            } else {
                i5 = 10016;
                i6 = 10012;
            }
        } else if (e(i3)) {
            if (d(i3, i4, hiDataReadOption, 2105) || d(i3, i4, hiDataReadOption, 2018) || d(i3, i4, hiDataReadOption, 2002)) {
                return;
            }
            i5 = 10017;
            i6 = 10013;
        } else if (c(i3)) {
            if (d(i3, i4, hiDataReadOption, 2034)) {
                return;
            }
            i5 = 10020;
            i6 = 10019;
        } else if (i3 == 7) {
            if (d(i3, i4, hiDataReadOption, 7)) {
                return;
            }
            i5 = 10022;
            i6 = 10021;
        } else if (i3 == 2103) {
            if (d(i3, i4, hiDataReadOption, 2103)) {
                return;
            }
            i5 = 10024;
            i6 = 10023;
        } else {
            a(i3, i4, hiDataReadOption);
            return;
        }
        int i7 = i6;
        if (!d(i3) && !e(i3) && !HiCommonUtil.b(this.o.a(i3, list, hiDataReadOption2, (kth) null))) {
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "other type readPointData null");
            return;
        }
        if (e(i3)) {
            HashSet hashSet = new HashSet();
            String strE = SharedPreferenceManager.e(n, "huawei_hihealth", "heartRate_" + i2);
            if (!TextUtils.isEmpty(strE)) {
                hashSet.addAll((Collection) HiJsonUtil.d(strE, new TypeToken<Set<Integer>>() { // from class: com.huawei.hihealthservice.store.HiHealthDataReadStore$2
                }.getType()));
            }
            if (njy.b(hashSet) && hashSet.contains(Integer.valueOf(HiDateUtil.d(j2)))) {
                ReleaseLogUtil.d("HiH_HiHlhDataRds", "heartRateDay already download-", Long.valueOf(j2));
                return;
            }
        }
        int iA = liq.a(n, i2, i5);
        if (d(i5, iA)) {
            return;
        }
        try {
            long startTime = hiDataReadOption2.getStartTime();
            int iD = HiDateUtil.d(startTime);
            int iD2 = HiDateUtil.d(iA, iD, "yyyyMMdd");
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "startDownload Day=", Integer.valueOf(iA), ", sTm=", Integer.valueOf(iD));
            if (!z && iD2 > 0 && iD2 <= 7) {
                b(startTime, i7, iA);
            }
            if (z || iA > iD) {
                c(startTime, hiDataReadOption2.getEndTime(), i7, iA, i3);
            }
        } catch (ParseException e2) {
            ReleaseLogUtil.a("HiH_HiHlhDataRds", "startBackInsert parseException e=", e2.getMessage());
        }
    }

    private void a(int i2, int i3, HiDataReadOption hiDataReadOption) {
        long jP = HiDateUtil.p(hiDataReadOption.getStartTime());
        long jG = HiDateUtil.g(hiDataReadOption.getEndTime());
        HiHealthDictType hiHealthDictTypeI = HiHealthDictManager.a((Context) null).i(i2);
        if (hiHealthDictTypeI != null) {
            i2 = hiHealthDictTypeI.l();
        }
        int i4 = i2;
        if (i4 == DicDataTypeUtil.DataType.ALTITUDE_TYPE_SET.value()) {
            List<SyncKey> listC = lhp.b(n).c(i4);
            if (HiCommonUtil.b(listC) || listC.get(0).getVersion().longValue() == 0) {
                ReleaseLogUtil.e("HiH_HiHlhDataRds", "data not exist in cloud");
                return;
            } else {
                c(jP, jG, i4, 0, i4);
                return;
            }
        }
        if (liq.e.containsKey(Integer.valueOf(i4))) {
            if (HiCommonUtil.b(this.o.a((int) liq.e.get(Integer.valueOf(i4)).c(), i3, hiDataReadOption, (kth) null))) {
                return;
            }
            c(jP, jG, i4, 0, i4);
        }
    }

    private boolean d(int i2, int i3, HiDataReadOption hiDataReadOption, int i4) {
        Map<Integer, Integer> map = f40076c;
        int iIntValue = map.containsKey(Integer.valueOf(i4)) ? map.get(Integer.valueOf(i4)).intValue() : 0;
        if (iIntValue == 0) {
            ReleaseLogUtil.d("HiH_HiHlhDataRds", "no match statType");
            return false;
        }
        if (i2 != i4 || !HiCommonUtil.b(this.o.a(iIntValue, i3, hiDataReadOption, (kth) null))) {
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHlhDataRds", Integer.valueOf(i2), " Stat null");
        return true;
    }

    private boolean d(int i2, int i3) {
        if (i3 != 0) {
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHlhDataRds", "download detailDay=0, No download again!,syncTp=", Integer.valueOf(i2));
        return true;
    }

    private void b(long j2, int i2, int i3) {
        LogUtil.a("HiH_HiHlhDataRds", "startBackInsert seven Day download  syncDay  is ", Integer.valueOf(i3), "startTime is ", Integer.valueOf(HiDateUtil.d(j2)));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(i2);
        hiSyncOption.setSyncStartTime(j2);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        lgp.f().e(hiSyncOption, kwi.b().b(n.getPackageName()));
    }

    private void c(long j2, long j3, int i2, int i3, int i4) {
        LogUtil.a("HiH_HiHlhDataRds", "buildDaySyncOption single Day download  syncDay  is ", Integer.valueOf(i3), "startTime is ", Integer.valueOf(HiDateUtil.d(j2)));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncStartTime(j2);
        hiSyncOption.setSyncEndTime(j3);
        hiSyncOption.setSyncDataType(i2);
        hiSyncOption.setSyncType(i4);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        lgp.f().b(hiSyncOption, kwi.b().b(n.getPackageName()));
        this.l = true;
    }

    private void b(HiSportStatDataAggregateOption hiSportStatDataAggregateOption) {
        int[] hiHealthTypes = hiSportStatDataAggregateOption.getHiHealthTypes();
        if (hiHealthTypes == null || hiHealthTypes.length != 1) {
            return;
        }
        int i2 = hiHealthTypes[0];
        Map<String, int[]> map = f40075b;
        if (map.get(String.valueOf(i2)) != null) {
            int[] iArr = map.get(String.valueOf(i2));
            int[] type = hiSportStatDataAggregateOption.getType();
            for (int i3 = 0; i3 < type.length; i3++) {
                LogUtil.d("HiH_HiHlhDataRds", "type is ", Integer.valueOf(type[i3]));
                int i4 = iArr[type[i3] - 1];
                type[i3] = i4;
                LogUtil.d("HiH_HiHlhDataRds", "old type is ", Integer.valueOf(i4));
            }
            hiSportStatDataAggregateOption.setType(type);
            hiSportStatDataAggregateOption.setHiHealthTypes(null);
            hiSportStatDataAggregateOption.setFilter(String.valueOf(i2));
        }
    }
}
