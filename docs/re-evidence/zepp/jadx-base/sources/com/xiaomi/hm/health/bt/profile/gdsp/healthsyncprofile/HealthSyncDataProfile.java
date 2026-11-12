package com.xiaomi.hm.health.bt.profile.gdsp.healthsyncprofile;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.ecg.EcgData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes18.dex */
public class HealthSyncDataProfile extends HMHealthDataBaseProfile {
    public static final byte DATA_TYPE_PPG_QINLING = 5;
    public static final int JHM_STRIP = 4;
    public static final int MILI_STRIP = 2;

    public HealthSyncDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    private synchronized void N(int rawSize, int lodSize, int extSize, int strip, List<Byte> input, List<Integer> lodDatas, List<Float> dataList, List<Byte> extDatas, Map<Integer, Integer> deviceLodMap) {
        int i = rawSize;
        synchronized (this) {
            int size = input.size();
            int i2 = size - extSize;
            Debug.fi(HMBaseProfile.TAG, "rawSize:" + i + ",lodSize:" + lodSize + ",extSize:" + extSize + ",length:" + size);
            int i3 = 0;
            if (strip == 2) {
                while (i3 < i) {
                    int i4 = i3 + 1;
                    dataList.add(Float.valueOf(((input.get(i4).byteValue() << 8) | (input.get(i3).byteValue() & 255)) & 32767));
                    if ((input.get(i4).byteValue() & 128) > 0) {
                        int size2 = dataList.size() - 1;
                        Integer numRemove = deviceLodMap.remove(Integer.valueOf(size2 - 1));
                        Integer numValueOf = Integer.valueOf(size2);
                        if (numRemove != null) {
                            size2 = numRemove.intValue();
                        }
                        deviceLodMap.put(numValueOf, Integer.valueOf(size2));
                    }
                    i3 += strip;
                }
            } else if (strip == 4) {
                while (i3 < i) {
                    double dByteValue = (input.get(i3).byteValue() & 255) | ((input.get(i3 + 1).byteValue() & 255) << 8) | ((input.get(i3 + 2).byteValue() & 255) << 16) | ((input.get(i3 + 3).byteValue() & 255) << 24);
                    float f = (float) dByteValue;
                    dataList.add(Float.valueOf(f));
                    if (f == 1.0f && dByteValue == -1.0d) {
                        int size3 = dataList.size() - 1;
                        Integer numRemove2 = deviceLodMap.remove(Integer.valueOf(size3 - 1));
                        Integer numValueOf2 = Integer.valueOf(size3);
                        if (numRemove2 != null) {
                            size3 = numRemove2.intValue();
                        }
                        deviceLodMap.put(numValueOf2, Integer.valueOf(size3));
                    }
                    i3 += strip;
                }
            }
            if (lodSize > 0) {
                while (i < i2) {
                    lodDatas.add(Integer.valueOf((input.get(i).byteValue() & 255) | ((input.get(i + 1).byteValue() & 255) << 8)));
                    i += 2;
                }
            }
            if (extSize > 0) {
                byte[] bArr = new byte[size];
                for (int i5 = i2; i5 < size; i5++) {
                    extDatas.add(input.get(i5));
                    bArr[i5 - i2] = input.get(i5).byteValue();
                }
                Debug.fi(HMBaseProfile.TAG, "ext:" + GattUtils.bytesToHexString(bArr));
            }
        }
    }

    public int getExtSize(DataHeader header) {
        byte[] bArr = header.expansionData;
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        return bArr[3] & 255;
    }

    public int getLodSize(DataHeader header) {
        byte[] bArr = header.expansionData;
        if (bArr == null || bArr.length < 3) {
            return 0;
        }
        return bArr[2] & 255;
    }

    public int getRRCrc16(DataHeader header) {
        byte[] bArr = header.expansionData;
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        return ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    public void parseECGRaw(final DataHeader header, List<Byte> inputData, EcgData currentDataFragment, int strip) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        int lodSize = getLodSize(header);
        int extSize = getExtSize(header);
        N((header.size - lodSize) - extSize, lodSize, extSize, strip, inputData, arrayList2, arrayList, arrayList3, treeMap);
        currentDataFragment.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            currentDataFragment.setLodData(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            currentDataFragment.setExtRawData(arrayList3);
        }
        if (!treeMap.isEmpty()) {
            currentDataFragment.setDeviceLodData(new ArrayList());
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                currentDataFragment.getDeviceLodData().add(new int[]{entry.getValue().intValue(), entry.getKey().intValue()});
            }
        }
        Debug.fi(HMBaseProfile.TAG, header.toString() + ",received:" + inputData.size() + ",lod:" + arrayList2.size() + ",ext:" + arrayList3.size());
    }

    public List<Float> parsePPGData(List<Byte> raw) {
        ArrayList arrayList = new ArrayList();
        int size = raw.size();
        for (int i = 0; i < size; i += 2) {
            arrayList.add(Float.valueOf((raw.get(i).byteValue() & 255) | ((raw.get(i + 1).byteValue() & 255) << 8)));
        }
        return arrayList;
    }
}
