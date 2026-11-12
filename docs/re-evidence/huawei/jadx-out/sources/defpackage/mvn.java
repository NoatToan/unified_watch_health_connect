package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mvn implements DictionarySequenceInterface {
    private boolean c(long j) {
        return j >= 32;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface
    public void readHiHealthData(int i, DeviceInfo deviceInfo, HiDataReadResultListener hiDataReadResultListener) {
        HiDataReadOption hiDataReadOptionC = c(new int[]{i}, deviceInfo, 0L, System.currentTimeMillis(), 1);
        LogUtil.a("DictionarySequenceImpl", "readHiHealthData ", hiDataReadOptionC);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOptionC, hiDataReadResultListener);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface
    public void insertToHiHealth(mvg mvgVar, HiDataOperateListener hiDataOperateListener) {
        if (mvgVar == null || hiDataOperateListener == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("DictionarySequenceImpl", "insertToHiHealth sampleSequenceFileData: ", mvgVar.toString());
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        e(hiDataInsertOption, arrayList, mvgVar);
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, hiDataOperateListener);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface
    public mvf genCacheDicInfo(int i, int i2, int i3) {
        mvf mvfVar = new mvf();
        mvfVar.e(i);
        mvfVar.d(i2);
        mvfVar.b(i3);
        return mvfVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface
    public mvg parseSequenceData(String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStreamOpenInputStream;
        mvg mvgVar;
        FileInputStream fileInputStream = null;
        mvg mvgVar2 = null;
        try {
            try {
                LogUtil.j("DictionarySequenceImpl", "parseSequenceData path:", str);
                File file = new File(str);
                if (!CommonUtil.e(file)) {
                    LogUtil.j("DictionarySequenceImpl", "Invalid file path");
                    IoUtils.c(null);
                    return null;
                }
                long length = file.length();
                if (!c(length)) {
                    LogUtil.j("DictionarySequenceImpl", "Sequence file is wrong. check file header wrong.:", Long.valueOf(length));
                    IoUtils.c(null);
                    return null;
                }
                fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
                try {
                    try {
                        mvg mvgVar3 = new mvg();
                        try {
                            byte[] bArr = new byte[32];
                            if (fileInputStreamOpenInputStream.read(bArr) != 32) {
                                LogUtil.j("DictionarySequenceImpl", "Unable to read header data");
                                IoUtils.c(fileInputStreamOpenInputStream);
                                return mvgVar3;
                            }
                            a(bArr, mvgVar3);
                            e(fileInputStreamOpenInputStream, mvgVar3);
                            IoUtils.c(fileInputStreamOpenInputStream);
                            LogUtil.a("DictionarySequenceImpl", "parseSequenceData sequenceFileData:", mvgVar3);
                            return mvgVar3;
                        } catch (IOException unused) {
                            mvgVar2 = mvgVar3;
                            mvg mvgVar4 = mvgVar2;
                            fileInputStream = fileInputStreamOpenInputStream;
                            mvgVar = mvgVar4;
                            LogUtil.e("DictionarySequenceImpl", "File processing IOException");
                            IoUtils.c(fileInputStream);
                            mvgVar3 = mvgVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        IoUtils.c(fileInputStreamOpenInputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            } catch (IOException unused3) {
                mvgVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamOpenInputStream = null;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface
    public boolean syncNextInfo(mvg mvgVar, mvf mvfVar) {
        int size;
        mvj mvjVar;
        if (mvgVar != null && mvfVar != null) {
            if (mvgVar.d() != mvfVar.b()) {
                LogUtil.j("DictionarySequenceImpl", "syncNextInfo dictionaryInfo:", Integer.valueOf(mvgVar.d()), ",cache id:", Integer.valueOf(mvfVar.b()));
                return true;
            }
            if (mvgVar.b() == null || (size = mvgVar.b().size()) <= 0 || (mvjVar = mvgVar.b().get(size - 1)) == null) {
                return false;
            }
            int iE = mvjVar.e();
            int iC = mvjVar.c();
            if (iC != 0) {
                iE = iC;
            }
            int iE2 = mvfVar.e();
            LogUtil.a("DictionarySequenceImpl", "endTime:", Integer.valueOf(iE), ",request endTime:", Integer.valueOf(iE2));
            if (iE >= iE2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface
    public RequestFileInfo buildSendMessage(mvf mvfVar) {
        RequestFileInfo requestFileInfo = new RequestFileInfo();
        if (mvfVar == null) {
            return requestFileInfo;
        }
        int[] iArr = {mvfVar.a(), mvfVar.e()};
        requestFileInfo.setFileType(22);
        requestFileInfo.setNeedVerify(false);
        requestFileInfo.setTimes(iArr);
        requestFileInfo.setKit(false);
        return requestFileInfo;
    }

    private void e(HiDataInsertOption hiDataInsertOption, List<HiHealthData> list, mvg mvgVar) {
        if (mvgVar == null || mvgVar.b() == null) {
            return;
        }
        String strE = mvs.e(mvgVar.a());
        LogUtil.a("DictionarySequenceImpl", "setDictionaryToList:", CommonUtil.n(strE));
        int iD = mvgVar.d();
        int iE = mvgVar.e();
        if (iE == 2) {
            b(strE, list, mvgVar);
        } else if (iE == 1) {
            a(strE, iD, hiDataInsertOption, list, mvgVar);
        } else {
            LogUtil.j("DictionarySequenceImpl", "setDictionaryToList healthData fileType error");
        }
    }

    private void b(String str, List<HiHealthData> list, mvg mvgVar) {
        for (mvj mvjVar : mvgVar.b()) {
            HiHealthData hiHealthDataD = d(mvgVar.d(), mvjVar.e(), mvjVar.c(), str);
            hiHealthDataD.setFieldsValue(mvjVar.g());
            list.add(hiHealthDataD);
        }
    }

    private void a(String str, int i, HiDataInsertOption hiDataInsertOption, List<HiHealthData> list, mvg mvgVar) {
        SampleSequenceAfterProcess sampleSequenceAfterProcessD = eda.d(i);
        for (mvj mvjVar : mvgVar.b()) {
            HiHealthData hiHealthDataD = d(mvgVar.d(), mvjVar.e(), mvjVar.c(), str);
            hiHealthDataD.setSequenceData(mvjVar.d());
            hiHealthDataD.setMetaData(mvjVar.g());
            if (sampleSequenceAfterProcessD != null) {
                hiHealthDataD = sampleSequenceAfterProcessD.onSampleSequenceAfterProcess(hiDataInsertOption, hiHealthDataD, mvjVar.b());
            }
            LogUtil.a("DictionarySequenceImpl", "setDictionaryToList healthData:", hiHealthDataD.getMetaData());
            list.add(hiHealthDataD);
        }
    }

    private HiHealthData d(int i, int i2, int i3, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(i);
        hiHealthData.setDeviceUuid(str);
        long j = ((long) i2) * 1000;
        long j2 = ((long) i3) * 1000;
        LogUtil.a("DictionarySequenceImpl", " set HiHealthData hiHealthStartTime:", Long.valueOf(j), ",hiHealthEndTime:", Long.valueOf(j2));
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        return hiHealthData;
    }

    private HiDataReadOption c(int[] iArr, DeviceInfo deviceInfo, long j, long j2, int i) {
        String strE = mvs.e(deviceInfo);
        LogUtil.a("DictionarySequenceImpl", "read getHiDataReadOption:", CommonUtil.n(strE));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setDeviceUuid(strE);
        hiDataReadOption.setSortOrder(i);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setReadType(2);
        return hiDataReadOption;
    }

    private void a(byte[] bArr, mvg mvgVar) {
        LogUtil.a("DictionarySequenceImpl", "parseHeaderCommon enter");
        if (bArr == null) {
            LogUtil.j("DictionarySequenceImpl", "Header is null");
            return;
        }
        cpl.d("DictionarySequenceImpl", bArr, "sequence fileHead: ");
        if (bArr.length != 32) {
            LogUtil.j("DictionarySequenceImpl", "Wrong length of file header");
            return;
        }
        mvgVar.e(CommonUtil.x(e(bArr, 0, 4)));
        mvgVar.a(CommonUtil.v(e(bArr, 4, 8)));
        String strE = e(bArr, 8, 10);
        LogUtil.a("DictionarySequenceImpl", "fileTypeString :", strE);
        mvgVar.c(CommonUtil.v(strE));
        String strE2 = e(bArr, 10, 12);
        LogUtil.a("DictionarySequenceImpl", "fileVersionString :", strE2);
        mvgVar.d(CommonUtil.v(strE2));
        mvgVar.b(eeq.d(e(bArr, 12, 32)));
    }

    private void e(FileInputStream fileInputStream, mvg mvgVar) throws IOException {
        while (true) {
            byte[] bArr = new byte[32];
            int i = fileInputStream.read(bArr);
            if (i != 32) {
                if (i == -1) {
                    LogUtil.j("DictionarySequenceImpl", "End of parsing data");
                    return;
                } else {
                    LogUtil.j("DictionarySequenceImpl", "Profile data length mismatch: ", Integer.valueOf(i));
                    return;
                }
            }
            mvj mvjVarA = a(bArr, 32);
            if (mvjVarA == null) {
                LogUtil.j("DictionarySequenceImpl", "sequenceData is null");
                return;
            }
            c(mvgVar, mvjVarA, fileInputStream);
            a(mvjVarA, fileInputStream);
            if (mvgVar.b() != null) {
                mvgVar.b().add(mvjVarA);
            }
            LogUtil.a("DictionarySequenceImpl", "start parsing next");
        }
    }

    private mvj a(byte[] bArr, int i) {
        if (!b(bArr, i)) {
            return null;
        }
        mvj mvjVar = new mvj();
        LogUtil.a("DictionarySequenceImpl", "sequence dataHead:", eeq.e(bArr));
        mvjVar.b(CommonUtil.v(e(bArr, 0, 4)));
        mvjVar.c(CommonUtil.v(e(bArr, 4, 8)));
        mvjVar.d(CommonUtil.v(e(bArr, 8, 9)));
        mvjVar.a(CommonUtil.v(e(bArr, 9, 10)));
        mvjVar.i(CommonUtil.v(e(bArr, 10, 12)));
        mvjVar.e(b(e(bArr, 12, 16)));
        e(bArr, 16, mvjVar);
        LogUtil.a("DictionarySequenceImpl", "parseDataHeadInfo: ", mvjVar.toString());
        return mvjVar;
    }

    private void e(byte[] bArr, int i, mvj mvjVar) {
        mvjVar.b(eeq.d(e(bArr, i, i + 16)));
    }

    private boolean b(byte[] bArr, int i) {
        if (bArr != null && bArr.length == i) {
            return true;
        }
        LogUtil.j("DictionarySequenceImpl", "bytes is error argument");
        return false;
    }

    private void c(mvg mvgVar, mvj mvjVar, FileInputStream fileInputStream) throws IOException {
        if (mvjVar != null && mvjVar.j() == 1) {
            int i = mvjVar.i();
            byte[] bArr = new byte[i];
            int i2 = fileInputStream.read(bArr);
            if (i2 != mvjVar.i()) {
                LogUtil.j("DictionarySequenceImpl", "summary data length mismatch SummaryLength:", Integer.valueOf(i2));
                return;
            }
            String strE = e(bArr, 0, i);
            LogUtil.a("DictionarySequenceImpl", "parseSummaryData format:", Integer.valueOf(mvjVar.f()), ",summaryDataString:", strE);
            if (mvjVar.f() == 1) {
                mvjVar.a(eeq.d(strE));
            } else if (mvjVar.f() == 2) {
                mvjVar.a(e(mvgVar, strE));
            } else if (mvjVar.f() == 3) {
                mvjVar.a(strE);
            } else {
                LogUtil.j("DictionarySequenceImpl", "parseSummaryData format exception");
            }
            LogUtil.j("DictionarySequenceImpl", "parseSummaryData summaryData: ", mvjVar.g());
        }
    }

    private String e(mvg mvgVar, String str) {
        ees eesVarB;
        String strD;
        try {
            eesVarB = new eet().b(str);
        } catch (eeu unused) {
            LogUtil.e("DictionarySequenceImpl", "parseSummaryData TlvException");
            eesVarB = null;
        }
        if (eesVarB == null) {
            LogUtil.j("DictionarySequenceImpl", "parseSummaryData tlv tlvFather is null");
            return "";
        }
        List<ees> listB = eesVarB.b();
        if (listB == null) {
            LogUtil.j("DictionarySequenceImpl", "parseSummaryData tlv metaDataTlvs is null");
            return "";
        }
        HashMap map = new HashMap(0);
        HashMap<String, Object> map2 = new HashMap<>(0);
        LogUtil.a("DictionarySequenceImpl", "processTlv tlv FileType:", Integer.valueOf(mvgVar.e()));
        if (mvgVar.e() == 2) {
            strD = HiJsonUtil.d(map);
        } else {
            c(listB, map2);
            strD = HiJsonUtil.d(map2);
        }
        LogUtil.a("DictionarySequenceImpl", "processTlv tlv data:", strD);
        return strD;
    }

    private void c(List<ees> list, HashMap<String, Object> map) {
        List<ees> listB;
        if (list == null) {
            return;
        }
        Iterator<ees> it = list.iterator();
        while (it.hasNext() && (listB = it.next().b()) != null) {
            a(listB, map);
        }
    }

    private void a(List<ees> list, HashMap<String, Object> map) {
        List<eew> listE;
        Iterator<ees> it = list.iterator();
        while (it.hasNext() && (listE = it.next().e()) != null) {
            LogUtil.a("DictionarySequenceImpl", "processSequenceSummaryFieldData headList.size:", Integer.valueOf(listE.size()));
            b(listE, map);
        }
    }

    private void b(List<eew> list, HashMap<String, Object> map) {
        String strA = null;
        int iV = 0;
        for (eew eewVar : list) {
            int iV2 = CommonUtil.v(eewVar.e());
            String strB = eewVar.b();
            LogUtil.a("DictionarySequenceImpl", "processSequenceSummaryFieldValue metaDataTlvs-getTag:", Integer.valueOf(iV2), "metaDataTlvs-getValue:", strB);
            if (iV2 == 3) {
                strA = a(CommonUtil.v(strB));
                LogUtil.a("DictionarySequenceImpl", "parseSequenceSummaryKeyTlv:", strA);
            } else if (iV2 == 4) {
                LogUtil.a("DictionarySequenceImpl", "parseSequenceSummaryKeyTlv value format:", strA);
                iV = CommonUtil.v(strB);
            } else if (iV2 == 5) {
                e(iV, strA, strB, map);
            } else {
                LogUtil.a("DictionarySequenceImpl", "no recognize getTag:", Integer.valueOf(iV2), "metaDataTlvs-getValue:", strB);
            }
        }
    }

    private void e(int i, String str, String str2, HashMap<String, Object> map) {
        if (i == 1 || i == 2 || i == 4) {
            map.put(str, Integer.valueOf(c(str2)));
            return;
        }
        if (i == 3) {
            map.put(str, Long.valueOf(a(str2)));
            return;
        }
        if (i == 5) {
            map.put(str, eeq.d(str2));
        } else if (i == 6) {
            map.put(str, Double.valueOf(Double.longBitsToDouble(a(str2))));
        } else {
            LogUtil.a("DictionarySequenceImpl", "parseSequenceSummaryKeyTlv value array");
            map.put(str, str2);
        }
    }

    private int c(String str) {
        int unsignedInt = -1;
        if (!TextUtils.isEmpty(str) && str.equals("BF800000")) {
            return -1;
        }
        if (CommonUtil.bu()) {
            try {
                unsignedInt = Integer.parseUnsignedInt(str, 16);
            } catch (NumberFormatException unused) {
                LogUtil.e("DictionarySequenceImpl", "processIntUnsigned NumberFormatException: ", str);
            }
        } else {
            unsignedInt = Integer.parseUnsignedInt(str, 16);
        }
        LogUtil.a("DictionarySequenceImpl", "processIntUnsigned result:", Integer.valueOf(unsignedInt));
        return unsignedInt;
    }

    private long a(String str) {
        long unsignedLong;
        if (CommonUtil.bu()) {
            try {
                unsignedLong = Long.parseUnsignedLong(str, 16);
            } catch (NumberFormatException unused) {
                LogUtil.e("DictionarySequenceImpl", "processLongUnsigned NumberFormatException: ", str);
                unsignedLong = -1;
            }
        } else {
            unsignedLong = Long.parseUnsignedLong(str, 16);
        }
        LogUtil.a("DictionarySequenceImpl", "processLongUnsigned result:", Long.valueOf(unsignedLong));
        return unsignedLong;
    }

    private static String a(int i) {
        HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(BaseApplication.getContext()).c(i);
        if (hiHealthDictFieldC == null) {
            LogUtil.a("DictionarySequenceImpl", "getKeyStrFromHiHealth dictField is null");
            return "";
        }
        return hiHealthDictFieldC.c();
    }

    private void a(mvj mvjVar, FileInputStream fileInputStream) throws IOException {
        if (mvjVar == null) {
            return;
        }
        if (mvjVar.a() <= 0) {
            LogUtil.j("DictionarySequenceImpl", "parseDetailData detailLength is 0 or Less than 0");
            return;
        }
        try {
            int iA = mvjVar.a();
            byte[] bArr = new byte[iA];
            int i = fileInputStream.read(bArr);
            if (i != mvjVar.a()) {
                LogUtil.j("DictionarySequenceImpl", "Raw data length mismatch rawDataLength:", Integer.valueOf(i));
            }
            LogUtil.a("DictionarySequenceImpl", "parseDetailData");
            String strE = e(bArr, 0, iA);
            LogUtil.a("DictionarySequenceImpl", "parseDetailData dataString: ", strE);
            mvjVar.d(strE);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("DictionarySequenceImpl", "parseDetailData OutOfMemoryError detailLength:", Integer.valueOf(mvjVar.a()));
        }
    }

    private static int b(String str) {
        int iV = CommonUtil.v(str);
        if (iV >= Integer.MAX_VALUE || iV <= 0) {
            LogUtil.j("DictionarySequenceImpl", "rawDataLength is invalid:", Integer.valueOf(iV));
            return iV;
        }
        if (iV <= 52428800) {
            return iV;
        }
        LogUtil.j("DictionarySequenceImpl", "rawDataLength is too large:", 0);
        return 0;
    }

    private String e(byte[] bArr, int i, int i2) {
        if (bArr == null || i > i2) {
            LogUtil.j("DictionarySequenceImpl", "byteToString bytes is null");
            return "";
        }
        if (i < 0) {
            LogUtil.j("DictionarySequenceImpl", "Start less than zero");
            return "";
        }
        if (i2 > bArr.length) {
            LogUtil.j("DictionarySequenceImpl", "End is too large");
            return "";
        }
        int i3 = i2 - i;
        try {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return eeq.e(bArr2);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("DictionarySequenceImpl", "byteToString OutOfMemoryError Length:", Integer.valueOf(i3));
            return "";
        }
    }
}
