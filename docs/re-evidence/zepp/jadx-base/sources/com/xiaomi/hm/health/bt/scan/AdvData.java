package com.xiaomi.hm.health.bt.scan;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.weight.WeightBfsProfile;
import com.xiaomi.hm.health.bt.profile.weight.WeightProfile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
public class AdvData {
    public static final String TAG_ADV = "printUUIDs";
    private static final String b = "AdvData";
    private static final byte c = 1;
    private static final byte d = 2;
    private static final byte e = 3;
    private static final byte f = 6;
    private static final byte g = 7;
    private static final byte h = 8;
    private static final byte i = 9;
    private static final byte j = 10;
    private static final byte k = 20;
    private static final byte l = 21;
    private static final byte m = 22;
    private static final byte n = -1;
    private byte[] a;
    public BluetoothDevice device;
    public HMDeviceSource deviceSource;
    public byte flag;
    public ArrayList<String> inServ128;
    public ArrayList<String> inServ16;
    public String localName;
    public String manufact;
    public String other;
    public int rssi;
    public ArrayList<String> serv128;
    public ArrayList<String> serv16;
    public String shortLocalName;
    public String solicit128;
    public String solicit16;
    public String txLevel;
    public WeightAdvData weightData;

    public AdvData() {
        this.device = null;
        this.rssi = 0;
        this.flag = (byte) 0;
        this.serv16 = new ArrayList<>();
        this.inServ16 = new ArrayList<>();
        this.serv128 = new ArrayList<>();
        this.inServ128 = new ArrayList<>();
        this.solicit16 = "";
        this.solicit128 = "";
        this.localName = null;
        this.shortLocalName = "";
        this.txLevel = "";
        this.manufact = "";
        this.weightData = null;
        this.other = "";
        this.deviceSource = HMDeviceSource.VDEVICE;
        this.a = null;
    }

    public static AdvData parse(byte[] scanRecord) {
        int length = scanRecord.length;
        AdvData advData = new AdvData(scanRecord);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = scanRecord[i2] & 255;
            if (i4 == 0 || i4 + i3 > length) {
                return advData;
            }
            int i5 = i3 + 1;
            byte b2 = scanRecord[i3];
            if (b2 == -1) {
                int i6 = i4 - 1;
                byte[] bArr = new byte[i6];
                int i7 = 0;
                while (i7 < i6) {
                    bArr[i7] = scanRecord[i5];
                    i7++;
                    i5++;
                }
                String strBytesToHexString = GattUtils.bytesToHexString(bArr);
                advData.manufact = strBytesToHexString;
                if (Debug.isEnabled()) {
                    Debug.i(b, "    manufact: " + strBytesToHexString);
                }
            } else if (b2 != 1) {
                char c2 = 2;
                if (b2 == 2) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    while (true) {
                        i8 += 2;
                        if (i8 <= i4) {
                            byte[] bArr2 = new byte[2];
                            int i9 = 0;
                            while (i9 < 2) {
                                bArr2[i9] = scanRecord[i5];
                                i9++;
                                i5++;
                            }
                            advData.inServ16.add(String.format("%02x%02x", Byte.valueOf(bArr2[1]), Byte.valueOf(bArr2[0])));
                            sb.append(GattUtils.bytesToHexString(bArr2));
                            sb.append("; ");
                        } else if (Debug.isEnabled()) {
                            Debug.i(b, "   (*)serv16: " + sb.toString());
                        }
                    }
                } else if (b2 != 3) {
                    int i10 = 16;
                    switch (b2) {
                        case 6:
                            StringBuilder sb2 = new StringBuilder();
                            int i11 = 0;
                            while (true) {
                                i11 += i10;
                                if (i11 <= i4) {
                                    byte[] bArr3 = new byte[i10];
                                    int i12 = 0;
                                    while (i12 < i10) {
                                        bArr3[i12] = scanRecord[i5];
                                        i12++;
                                        i5++;
                                    }
                                    ArrayList<String> arrayList = advData.inServ128;
                                    Object[] objArr = new Object[i10];
                                    objArr[0] = Byte.valueOf(bArr3[15]);
                                    objArr[1] = Byte.valueOf(bArr3[14]);
                                    objArr[2] = Byte.valueOf(bArr3[13]);
                                    objArr[3] = Byte.valueOf(bArr3[12]);
                                    objArr[4] = Byte.valueOf(bArr3[11]);
                                    objArr[5] = Byte.valueOf(bArr3[10]);
                                    objArr[6] = Byte.valueOf(bArr3[9]);
                                    objArr[7] = Byte.valueOf(bArr3[8]);
                                    objArr[8] = Byte.valueOf(bArr3[7]);
                                    objArr[9] = Byte.valueOf(bArr3[6]);
                                    objArr[10] = Byte.valueOf(bArr3[5]);
                                    objArr[11] = Byte.valueOf(bArr3[4]);
                                    objArr[12] = Byte.valueOf(bArr3[3]);
                                    objArr[13] = Byte.valueOf(bArr3[2]);
                                    objArr[14] = Byte.valueOf(bArr3[1]);
                                    objArr[15] = Byte.valueOf(bArr3[0]);
                                    arrayList.add(String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", objArr));
                                    sb2.append(GattUtils.bytesToHexString(bArr3));
                                    sb2.append("; ");
                                    i10 = 16;
                                } else if (Debug.isEnabled()) {
                                    Debug.i(b, "  (*)serv128: " + sb2.toString());
                                }
                                break;
                            }
                            break;
                        case 7:
                            StringBuilder sb3 = new StringBuilder();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 16;
                                if (i14 <= i4) {
                                    byte[] bArr4 = new byte[16];
                                    int i15 = 0;
                                    while (i15 < 16) {
                                        bArr4[i15] = scanRecord[i5];
                                        i15++;
                                        i5++;
                                    }
                                    ArrayList<String> arrayList2 = advData.serv128;
                                    Object[] objArr2 = new Object[16];
                                    objArr2[0] = Byte.valueOf(bArr4[15]);
                                    objArr2[1] = Byte.valueOf(bArr4[14]);
                                    objArr2[c2] = Byte.valueOf(bArr4[13]);
                                    objArr2[3] = Byte.valueOf(bArr4[12]);
                                    objArr2[4] = Byte.valueOf(bArr4[11]);
                                    objArr2[5] = Byte.valueOf(bArr4[10]);
                                    objArr2[6] = Byte.valueOf(bArr4[9]);
                                    objArr2[7] = Byte.valueOf(bArr4[8]);
                                    objArr2[8] = Byte.valueOf(bArr4[7]);
                                    objArr2[9] = Byte.valueOf(bArr4[6]);
                                    objArr2[10] = Byte.valueOf(bArr4[5]);
                                    objArr2[11] = Byte.valueOf(bArr4[4]);
                                    objArr2[12] = Byte.valueOf(bArr4[3]);
                                    objArr2[13] = Byte.valueOf(bArr4[c2]);
                                    objArr2[14] = Byte.valueOf(bArr4[1]);
                                    objArr2[15] = Byte.valueOf(bArr4[0]);
                                    arrayList2.add(String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", objArr2));
                                    sb3.append(GattUtils.bytesToHexString(bArr4));
                                    sb3.append("; ");
                                    i13 = i14;
                                    c2 = 2;
                                } else if (Debug.isEnabled()) {
                                    Debug.i(b, "     serv128: " + sb3.toString());
                                }
                                break;
                            }
                            break;
                        case 8:
                            int i16 = i4 - 1;
                            byte[] bArr5 = new byte[i16];
                            int i17 = 0;
                            while (i17 < i16) {
                                bArr5[i17] = scanRecord[i5];
                                i17++;
                                i5++;
                            }
                            String str = new String(bArr5, Charset.defaultCharset());
                            advData.shortLocalName = str;
                            if (Debug.isEnabled()) {
                                Debug.i(b, "     (*)name: " + str);
                            }
                            break;
                        case 9:
                            int i18 = i4 - 1;
                            byte[] bArr6 = new byte[i18];
                            int i19 = 0;
                            while (i19 < i18) {
                                bArr6[i19] = scanRecord[i5];
                                i19++;
                                i5++;
                            }
                            String str2 = new String(bArr6, Charset.defaultCharset());
                            advData.localName = str2;
                            if (Debug.isEnabled()) {
                                Debug.i(b, "        name: " + str2);
                            }
                            break;
                        case 10:
                            int i20 = i4 - 1;
                            byte[] bArr7 = new byte[i20];
                            int i21 = 0;
                            while (i21 < i20) {
                                bArr7[i21] = scanRecord[i5];
                                i21++;
                                i5++;
                            }
                            String strBytesToHexString2 = GattUtils.bytesToHexString(bArr7);
                            advData.txLevel = strBytesToHexString2;
                            if (Debug.isEnabled()) {
                                Debug.i(b, "    tx level: " + strBytesToHexString2);
                            }
                            break;
                        default:
                            switch (b2) {
                                case 20:
                                    StringBuilder sb4 = new StringBuilder();
                                    int i22 = 0;
                                    while (true) {
                                        i22 += 2;
                                        if (i22 > i4) {
                                            advData.solicit16 = sb4.toString();
                                            if (Debug.isEnabled()) {
                                                Debug.i(b, "   solicit16: " + sb4.toString());
                                            }
                                        } else {
                                            byte[] bArr8 = new byte[2];
                                            int i23 = 0;
                                            while (i23 < 2) {
                                                bArr8[i23] = scanRecord[i5];
                                                i23++;
                                                i5++;
                                            }
                                            sb4.append(GattUtils.bytesToHexString(bArr8));
                                            sb4.append("; ");
                                        }
                                        break;
                                    }
                                    break;
                                case 21:
                                    StringBuilder sb5 = new StringBuilder();
                                    int i24 = 0;
                                    while (true) {
                                        i24 += 16;
                                        if (i24 > i4) {
                                            advData.solicit128 = sb5.toString();
                                            if (Debug.isEnabled()) {
                                                Debug.i(b, "  solicit128: " + sb5.toString());
                                            }
                                        } else {
                                            byte[] bArr9 = new byte[16];
                                            int i25 = 0;
                                            while (i25 < 16) {
                                                bArr9[i25] = scanRecord[i5];
                                                i25++;
                                                i5++;
                                            }
                                            sb5.append(GattUtils.bytesToHexString(bArr9));
                                            sb5.append("; ");
                                        }
                                        break;
                                    }
                                    break;
                                case 22:
                                    int i26 = i4 - 1;
                                    byte[] bArr10 = new byte[i26];
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        bArr10[i27] = scanRecord[i5];
                                        i27++;
                                        i5++;
                                    }
                                    if (i26 >= 3) {
                                        UUID uuidUuid16 = GattUtils.uuid16(String.format("%02X%02X", Byte.valueOf(bArr10[1]), Byte.valueOf(bArr10[0])));
                                        if (WeightBfsProfile.UUID_SERVICE_BODY_COMPOSITION_SERVICE.equals(uuidUuid16)) {
                                            int i28 = i26 - 2;
                                            byte[] bArr11 = new byte[i28];
                                            System.arraycopy(bArr10, 2, bArr11, 0, i28);
                                            advData.weightData = ProfileUtils.parseBfsCategoryData(bArr11, false, false);
                                        } else if (WeightBfsProfile.UUID_SERVICE_AMAZFIT_BODY_COMPOSITION_SERVICE.equals(uuidUuid16)) {
                                            int i29 = i26 - 2;
                                            byte[] bArr12 = new byte[i29];
                                            System.arraycopy(bArr10, 2, bArr12, 0, i29);
                                            advData.weightData = ProfileUtils.parseWeightDataWithState(bArr12, false, false);
                                        } else if (i26 != 12) {
                                            advData.weightData = ProfileUtils.parseWeightData(bArr10, false, false);
                                        } else if (!WeightProfile.UUID_SERVICE_WEIGHT_SCALE_SERVICE.equals(uuidUuid16)) {
                                            Debug.fi(b, "UUID is not UUID_SERVICE_WEIGHT_SCALE_SERVICE<181D>!!!");
                                        } else {
                                            int i30 = i26 - 2;
                                            byte[] bArr13 = new byte[i30];
                                            System.arraycopy(bArr10, 2, bArr13, 0, i30);
                                            advData.weightData = ProfileUtils.parseWeightData(bArr13, false, false);
                                        }
                                    }
                                    break;
                                default:
                                    int i31 = i4 - 1;
                                    byte[] bArr14 = new byte[i31];
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        bArr14[i32] = scanRecord[i5];
                                        i32++;
                                        i5++;
                                    }
                                    advData.other = String.format("[0x%02x]", Byte.valueOf(b2)) + ": " + GattUtils.bytesToHexString(bArr14);
                                    if (Debug.isEnabled()) {
                                        Debug.i(b, "      " + String.format("[0x%02x]", Byte.valueOf(b2)) + ": " + GattUtils.bytesToHexString(bArr14));
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    int i33 = 0;
                    while (true) {
                        i33 += 2;
                        if (i33 <= i4) {
                            byte[] bArr15 = new byte[2];
                            int i34 = 0;
                            while (i34 < 2) {
                                bArr15[i34] = scanRecord[i5];
                                i34++;
                                i5++;
                            }
                            advData.serv16.add(String.format("%02x%02x", Byte.valueOf(bArr15[1]), Byte.valueOf(bArr15[0])));
                            sb6.append(GattUtils.bytesToHexString(bArr15));
                            sb6.append("; ");
                        } else if (Debug.isEnabled()) {
                            Debug.i(b, "      serv16: " + sb6.toString());
                        }
                    }
                }
            } else {
                i2 = i5 + 1;
                byte b3 = scanRecord[i5];
                advData.flag = b3;
                if (Debug.isEnabled()) {
                    Debug.i(b, "        flag: " + String.format("%02x", Byte.valueOf(b3)));
                }
            }
            i2 = i5;
        }
        return advData;
    }

    public String getDeviceName() {
        String bluetoothDeviceName = GattUtils.getBluetoothDeviceName(this.device);
        return !TextUtils.isEmpty(bluetoothDeviceName) ? bluetoothDeviceName : this.localName;
    }

    public byte[] getRawData() {
        return this.a;
    }

    public boolean isBREDRNotSupported() {
        return ((this.flag >> 2) & 1) == 1;
    }

    public boolean isGeneralDiscoverableMode() {
        return ((this.flag >> 1) & 1) == 1;
    }

    public boolean isLimitedDiscoverableMode() {
        return (this.flag & 1) == 1;
    }

    public boolean isMatchUUID(UUID uuid) {
        Iterator<String> it2 = this.serv16.iterator();
        while (it2.hasNext()) {
            if (GattUtils.uuid16(it2.next()).equals(uuid)) {
                return true;
            }
        }
        Iterator<String> it3 = this.inServ16.iterator();
        while (it3.hasNext()) {
            if (GattUtils.uuid16(it3.next()).equals(uuid)) {
                return true;
            }
        }
        Iterator<String> it4 = this.serv128.iterator();
        while (it4.hasNext()) {
            if (GattUtils.uuid128(it4.next()).equals(uuid)) {
                return true;
            }
        }
        Iterator<String> it5 = this.inServ128.iterator();
        while (it5.hasNext()) {
            if (GattUtils.uuid128(it5.next()).equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public void printUUIDs() {
        Debug.fi(TAG_ADV, "serv16: " + this.serv16.toString());
        Debug.fi(TAG_ADV, "inServ16: " + this.inServ16.toString());
        Debug.fi(TAG_ADV, "serv128: " + this.serv128.toString());
        Debug.fi(TAG_ADV, "inServ128: " + this.inServ128.toString());
    }

    public String toString() {
        return "\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n[" + GattUtils.getBluetoothDeviceName(this.device) + "," + GattUtils.getMacAddress(this.device) + "," + this.rssi + "]\nflag:" + ((int) this.flag) + "\nserv16:" + this.serv16 + "\ninServ16:" + this.inServ16 + "\nserv128:" + this.serv128 + "\ninServ128:" + this.inServ128 + "\nsolicit16:" + this.solicit16 + "\nsolicit128:" + this.solicit128 + "\nlocalName:" + this.localName + "\nshortLocalName:" + this.shortLocalName + "\ntxLevel:" + this.txLevel + "\nmanufact:" + this.manufact + "\nweightData:" + this.weightData + "\nother:" + this.other + "\ndeviceSource:" + this.deviceSource + "\nrawData:" + GattUtils.bytesToHexString(this.a) + "\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
    }

    public AdvData(BluetoothDevice device) {
        this.device = null;
        this.rssi = 0;
        this.flag = (byte) 0;
        this.serv16 = new ArrayList<>();
        this.inServ16 = new ArrayList<>();
        this.serv128 = new ArrayList<>();
        this.inServ128 = new ArrayList<>();
        this.solicit16 = "";
        this.solicit128 = "";
        this.localName = null;
        this.shortLocalName = "";
        this.txLevel = "";
        this.manufact = "";
        this.weightData = null;
        this.other = "";
        this.deviceSource = HMDeviceSource.VDEVICE;
        this.a = null;
        this.device = device;
    }

    public AdvData(byte[] raw) {
        this.device = null;
        this.rssi = 0;
        this.flag = (byte) 0;
        this.serv16 = new ArrayList<>();
        this.inServ16 = new ArrayList<>();
        this.serv128 = new ArrayList<>();
        this.inServ128 = new ArrayList<>();
        this.solicit16 = "";
        this.solicit128 = "";
        this.localName = null;
        this.shortLocalName = "";
        this.txLevel = "";
        this.manufact = "";
        this.weightData = null;
        this.other = "";
        this.deviceSource = HMDeviceSource.VDEVICE;
        this.a = null;
        if (raw == null || raw.length <= 0) {
            return;
        }
        byte[] bArr = new byte[raw.length];
        this.a = bArr;
        System.arraycopy(raw, 0, bArr, 0, raw.length);
    }

    public AdvData(BluetoothDevice device, byte[] rawData) {
        this.device = null;
        this.rssi = 0;
        this.flag = (byte) 0;
        this.serv16 = new ArrayList<>();
        this.inServ16 = new ArrayList<>();
        this.serv128 = new ArrayList<>();
        this.inServ128 = new ArrayList<>();
        this.solicit16 = "";
        this.solicit128 = "";
        this.localName = null;
        this.shortLocalName = "";
        this.txLevel = "";
        this.manufact = "";
        this.weightData = null;
        this.other = "";
        this.deviceSource = HMDeviceSource.VDEVICE;
        this.a = null;
        this.device = device;
        this.a = rawData;
    }
}
