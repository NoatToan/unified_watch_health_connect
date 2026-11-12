package dk2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.primitives.UnsignedBytes;
import j23.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.u;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldk2/d;", "Landroid/os/Parcelable;", "Ldk2/h;", "", "friendlyName", "macAddress", "productNumber", "Landroid/bluetooth/BluetoothDevice;", "device", "", "serviceDataOptions", "passkey", "", "antId", "unitId", "modelType", "rssi", "btcMacAddress", "discoveryTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "existingDevice", "btDevice", "(Ldk2/h;Landroid/bluetooth/BluetoothDevice;)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d implements Parcelable, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BluetoothDevice f60240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f60241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f60242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f60243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f60244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f60245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f60246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f60247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f60248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f60235m = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final androidx.browser.trusted.c f60236n = new androidx.browser.trusted.c(7);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            Integer numValueOf;
            Integer num2;
            Long lValueOf2;
            Integer num3;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            BluetoothDevice bluetoothDevice = (BluetoothDevice) parcel.readParcelable(d.class.getClassLoader());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            Long l14 = lValueOf3;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = num;
                num2 = numValueOf;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num2 = num;
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                num3 = numValueOf;
                lValueOf2 = num2;
            } else {
                Integer num4 = numValueOf;
                lValueOf2 = Long.valueOf(parcel.readLong());
                num3 = num4;
            }
            return new d(string, string2, string3, bluetoothDevice, numValueOf2, string4, l14, lValueOf, string5, num3, string6, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(h hVar, BluetoothDevice bluetoothDevice) {
        hVar.getClass();
        bluetoothDevice.getClass();
        String f60237a = hVar.getF60237a();
        String f60238b = hVar.getF60238b();
        String f60239c = hVar.getF60239c();
        String str = f60239c == null ? "" : f60239c;
        boolean z14 = hVar instanceof d;
        d dVar = z14 ? (d) hVar : null;
        Integer num = dVar != null ? dVar.f60241e : null;
        d dVar2 = z14 ? (d) hVar : null;
        String str2 = dVar2 != null ? dVar2.f60242f : null;
        d dVar3 = z14 ? (d) hVar : null;
        Long l14 = dVar3 != null ? dVar3.f60243g : null;
        Long f60244h = hVar.getF60244h();
        String f60245i = hVar.getF60245i();
        String strN = dh.b.n(hVar);
        d dVar4 = z14 ? (d) hVar : null;
        this(f60237a, f60238b, str, bluetoothDevice, num, str2, l14, f60244h, f60245i, null, strN, dVar4 != null ? dVar4.f60248l : null);
        if (s.g(hVar.getF60238b(), bluetoothDevice.getAddress())) {
            return;
        }
        vb.h.s("Mac address mismatch between DiscoveredDevice and BluetoothDevice");
        throw null;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF60246j() {
        return this.f60246j;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF60245i() {
        return this.f60245i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f60237a, dVar.f60237a) && s.g(this.f60238b, dVar.f60238b) && s.g(this.f60239c, dVar.f60239c) && s.g(this.f60240d, dVar.f60240d) && s.g(this.f60241e, dVar.f60241e) && s.g(this.f60242f, dVar.f60242f) && s.g(this.f60243g, dVar.f60243g) && s.g(this.f60244h, dVar.f60244h) && s.g(this.f60245i, dVar.f60245i) && s.g(this.f60246j, dVar.f60246j) && s.g(this.f60247k, dVar.f60247k) && s.g(this.f60248l, dVar.f60248l);
    }

    public final boolean f() {
        Integer num = this.f60241e;
        return (num != null && (num.intValue() & 1) == 1) || num == null;
    }

    public final String g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("friendlyName", this.f60237a);
        jSONObject.put("macAddress", this.f60238b);
        jSONObject.put("productNumber", this.f60239c);
        jSONObject.put("device", new JSONObject().put("mAddress", this.f60240d.getAddress()));
        Integer num = this.f60241e;
        if (num != null) {
            jSONObject.put("serviceDataOptions", num.intValue());
        }
        String str = this.f60242f;
        if (str != null) {
            jSONObject.put("passkey", str);
        }
        Long l14 = this.f60243g;
        if (l14 != null) {
            jSONObject.put("antId", l14.longValue());
        }
        Long l15 = this.f60244h;
        if (l15 != null) {
            jSONObject.put("unitId", l15.longValue());
        }
        String str2 = this.f60245i;
        if (str2 != null) {
            jSONObject.put("modelType", str2);
        }
        Integer num2 = this.f60246j;
        if (num2 != null) {
            jSONObject.put("rssi", num2.intValue());
        }
        String str3 = this.f60247k;
        if (str3 != null) {
            jSONObject.put("btcAddress", str3);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: getDevice, reason: from getter */
    public final BluetoothDevice getF60240d() {
        return this.f60240d;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: getFriendlyName, reason: from getter */
    public final String getF60237a() {
        return this.f60237a;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: getMacAddress, reason: from getter */
    public final String getF60238b() {
        return this.f60238b;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: getProductNumber, reason: from getter */
    public final String getF60239c() {
        return this.f60239c;
    }

    @Override // dk2.h
    /* JADX INFO: renamed from: getUnitId, reason: from getter */
    public final Long getF60244h() {
        return this.f60244h;
    }

    public final int hashCode() {
        int iHashCode = (this.f60240d.hashCode() + wr.g.j(wr.g.j(this.f60237a.hashCode() * 31, 31, this.f60238b), 31, this.f60239c)) * 31;
        Integer num = this.f60241e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f60242f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f60243g;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f60244h;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.f60245i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f60246j;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f60247k;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l16 = this.f60248l;
        return iHashCode8 + (l16 != null ? l16.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f60247k;
        StringBuilder sbI = p6.b.i("DiscoveredDevice(friendlyName=", this.f60237a, ", macAddress=", this.f60238b, ", productNumber=");
        sbI.append(this.f60239c);
        sbI.append(", device=");
        sbI.append(this.f60240d);
        sbI.append(", serviceDataOptions=");
        p6.b.l(this.f60241e, ", passkey=", this.f60242f, ", antId=", sbI);
        kg.f.s(sbI, this.f60243g, ", unitId=", this.f60244h, ", modelType=");
        fb1.c.u(this.f60246j, this.f60245i, ", rssi=", ", btcMacAddress=", sbI);
        sbI.append(str);
        sbI.append(", discoveryTime=");
        sbI.append(this.f60248l);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f60237a);
        parcel.writeString(this.f60238b);
        parcel.writeString(this.f60239c);
        parcel.writeParcelable(this.f60240d, i14);
        Integer num = this.f60241e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f60242f);
        Long l14 = this.f60243g;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f60244h;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.f60245i);
        Integer num2 = this.f60246j;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.f60247k);
        Long l16 = this.f60248l;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Ldk2/d$a;", "", "<init>", "()V", "", "KEY_FRIENDLY_NAME", "Ljava/lang/String;", "KEY_MAC_ADDRESS", "KEY_PRODUCT_NUMBER", "KEY_DEVICE", "KEY_DEVICE_ADDRESS", "KEY_SERVICE_DATA_OPTIONS", "KEY_PASSKEY", "KEY_ANT_ID", "KEY_UNIT_ID", "KEY_MODEL_TYPE", "KEY_RSSI", "KEY_BTC_ADDRESS", "KEY_DISCOVERY_TIME_MILLIS", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:103:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:104:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:107:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:111:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:112:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:114:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:119:0x0200 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:120:0x0202  */
        /* JADX WARN: Code duplicated, block: B:129:0x0241  */
        /* JADX WARN: Code duplicated, block: B:140:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:23:0x0042 A[PHI: r0
          0x0042: PHI (r0v61 byte[] A[IMMUTABLE_TYPE]) = (r0v6 byte[]), (r0v3 byte[]) binds: [B:21:0x003f, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:99:0x01b6 A[DONT_INVERT] */
        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"MissingPermission"})
        public static d a(ScanResult scanResult, gm2.a aVar) {
            ScanRecord scanRecord;
            Integer numValueOf;
            char c14;
            char c15;
            d dVar;
            char c16;
            long j8;
            int i14;
            ik2.c cVar;
            String str;
            String str2;
            SparseArray<byte[]> manufacturerSpecificData;
            byte[] bArr;
            Map<ParcelUuid, byte[]> serviceData;
            byte[] bArr2;
            Long lValueOf;
            byte[] bArrW;
            String deviceName;
            byte[] bArr3;
            String str3;
            int i15;
            if (scanResult != null && (scanRecord = scanResult.getScanRecord()) != null) {
                ParcelUuid parcelUuid = ik2.e.f93935a;
                SparseArray<byte[]> manufacturerSpecificData2 = scanRecord.getManufacturerSpecificData();
                byte[] bArr4 = manufacturerSpecificData2 != null ? manufacturerSpecificData2.get(TsExtractor.TS_STREAM_TYPE_E_AC3) : null;
                byte b14 = 2;
                if (bArr4 == null || bArr4.length < 2) {
                    SparseArray<byte[]> manufacturerSpecificData3 = scanRecord.getManufacturerSpecificData();
                    bArr4 = manufacturerSpecificData3 != null ? manufacturerSpecificData3.get(34560) : null;
                    if (bArr4 == null || bArr4.length < 2) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf((bArr4[1] & UnsignedBytes.MAX_VALUE) | ((bArr4[0] & UnsignedBytes.MAX_VALUE) << 8));
                    }
                } else {
                    numValueOf = Integer.valueOf((bArr4[1] & UnsignedBytes.MAX_VALUE) | ((bArr4[0] & UnsignedBytes.MAX_VALUE) << 8));
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    ik2.c.f93927d.getClass();
                    Map<ParcelUuid, byte[]> serviceData2 = scanRecord.getServiceData();
                    byte[] bArr5 = serviceData2 != null ? serviceData2.get(ik2.c.f93928e) : null;
                    long j14 = 255;
                    long j15 = 0;
                    if (bArr5 == null) {
                        c14 = '\b';
                        c15 = 16;
                        Map<ParcelUuid, byte[]> serviceData3 = scanRecord.getServiceData();
                        byte[] bArr6 = serviceData3 != null ? serviceData3.get(ik2.c.f93929f) : null;
                        if (bArr6 == null) {
                            Map<ParcelUuid, byte[]> serviceData4 = scanRecord.getServiceData();
                            byte[] bArr7 = serviceData4 != null ? serviceData4.get(ik2.c.f93930g) : null;
                            if (bArr7 != null && bArr7.length != 0 && bArr7[0] == 0) {
                                bArr6 = bArr7;
                            }
                        }
                        if (bArr6 == null) {
                            cVar = new ik2.c(null, 0, 0L);
                        } else {
                            String str4 = null;
                            dVar = null;
                            short s8 = 0;
                            int length = 0;
                            c16 = 0;
                            while (length < bArr6.length) {
                                try {
                                    byte b15 = bArr6[length];
                                    if (b15 == 0) {
                                        s8 = ByteBuffer.wrap(bArr6, length + 1, b14).order(ByteOrder.LITTLE_ENDIAN).getShort();
                                        length += 3;
                                    } else {
                                        if (b15 == 1) {
                                            try {
                                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr6, length + 1, b14).order(ByteOrder.LITTLE_ENDIAN);
                                                x0 x0Var = x0.f105818a;
                                                j8 = j14;
                                                try {
                                                    str4 = String.format(Locale.US, "%04d", Arrays.copyOf(new Object[]{Short.valueOf(byteBufferOrder.getShort())}, 1));
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i14 = iIntValue;
                                                    ((k) ik2.c.f93931h.getValue()).error("Failed to parse generic service data", e);
                                                    cVar = null;
                                                    if (cVar == null) {
                                                        return dVar;
                                                    }
                                                    if (aVar != null) {
                                                        try {
                                                            str = (String) aVar.invoke(String.valueOf(i14));
                                                            if (str == null) {
                                                                return dVar;
                                                            }
                                                            str2 = str;
                                                        } catch (Exception unused) {
                                                            str2 = dVar;
                                                        }
                                                    } else {
                                                        str2 = dVar;
                                                    }
                                                    manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                                                    if (manufacturerSpecificData != null) {
                                                        bArr = manufacturerSpecificData.get(TsExtractor.TS_STREAM_TYPE_E_AC3);
                                                    } else {
                                                        bArr = dVar;
                                                    }
                                                    serviceData = scanRecord.getServiceData();
                                                    if (serviceData != null) {
                                                        bArr3 = serviceData.get(ik2.e.f93935a);
                                                    } else {
                                                        bArr2 = dVar;
                                                    }
                                                    if (bArr != 0) {
                                                        if (bArr2 == 0) {
                                                        }
                                                        lValueOf = dVar;
                                                    } else {
                                                        if (bArr2 == 0) {
                                                        }
                                                        lValueOf = dVar;
                                                    }
                                                    deviceName = scanRecord.getDeviceName();
                                                    if (deviceName != null) {
                                                    }
                                                    String str5 = deviceName;
                                                    String address = scanResult.getDevice().getAddress();
                                                    address.getClass();
                                                    String strValueOf = String.valueOf(i14);
                                                    BluetoothDevice device = scanResult.getDevice();
                                                    device.getClass();
                                                    return new d(str5, address, strValueOf, device, Integer.valueOf(cVar.f93933b), cVar.f93932a, Long.valueOf(cVar.f93934c), lValueOf, str2, Integer.valueOf(scanResult.getRssi()), null, Long.valueOf(System.currentTimeMillis()), 1024, null);
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                j8 = j14;
                                            }
                                        } else {
                                            j8 = j14;
                                            if (b15 == b14) {
                                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr6, length + 1, b14).order(ByteOrder.LITTLE_ENDIAN);
                                                x0 x0Var2 = x0.f105818a;
                                                str4 = String.format("%04X", Arrays.copyOf(new Object[]{Short.valueOf(byteBufferOrder2.getShort())}, 1));
                                            } else if (b15 == 3) {
                                                length += 6;
                                            } else {
                                                if (b15 == 4) {
                                                    int i16 = length + 3;
                                                    if (bArr6.length >= i16) {
                                                        b14 = b14;
                                                        i14 = iIntValue;
                                                        try {
                                                            j15 = ((((long) bArr6[length + 2]) & j8) << 8) | (((long) bArr6[length + 1]) & j8) | ((((long) bArr6[i16]) & j8) << 16);
                                                            length = i16;
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            ((k) ik2.c.f93931h.getValue()).error("Failed to parse generic service data", e);
                                                            cVar = null;
                                                            if (cVar == null) {
                                                                return dVar;
                                                            }
                                                            if (aVar != null) {
                                                                str = (String) aVar.invoke(String.valueOf(i14));
                                                                if (str == null) {
                                                                    return dVar;
                                                                }
                                                                str2 = str;
                                                            } else {
                                                                str2 = dVar;
                                                            }
                                                            manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                                                            if (manufacturerSpecificData != null) {
                                                                bArr = manufacturerSpecificData.get(TsExtractor.TS_STREAM_TYPE_E_AC3);
                                                            } else {
                                                                bArr = dVar;
                                                            }
                                                            serviceData = scanRecord.getServiceData();
                                                            if (serviceData != null) {
                                                                bArr3 = serviceData.get(ik2.e.f93935a);
                                                            } else {
                                                                bArr2 = dVar;
                                                            }
                                                            if (bArr != 0) {
                                                                if (bArr2 == 0) {
                                                                }
                                                                lValueOf = dVar;
                                                            } else {
                                                                if (bArr2 == 0) {
                                                                }
                                                                lValueOf = dVar;
                                                            }
                                                            deviceName = scanRecord.getDeviceName();
                                                            if (deviceName != null) {
                                                            }
                                                            String str6 = deviceName;
                                                            String address2 = scanResult.getDevice().getAddress();
                                                            address2.getClass();
                                                            String strValueOf2 = String.valueOf(i14);
                                                            BluetoothDevice device2 = scanResult.getDevice();
                                                            device2.getClass();
                                                            return new d(str6, address2, strValueOf2, device2, Integer.valueOf(cVar.f93933b), cVar.f93932a, Long.valueOf(cVar.f93934c), lValueOf, str2, Integer.valueOf(scanResult.getRssi()), null, Long.valueOf(System.currentTimeMillis()), 1024, null);
                                                        }
                                                    } else {
                                                        b14 = b14;
                                                        i14 = iIntValue;
                                                    }
                                                    length += 3;
                                                } else {
                                                    b14 = b14;
                                                    i14 = iIntValue;
                                                    length += bArr6.length;
                                                }
                                                b14 = b14;
                                                iIntValue = i14;
                                            }
                                            j14 = j8;
                                        }
                                        length += 3;
                                        j14 = j8;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    j8 = j14;
                                }
                            }
                            b14 = b14;
                            j8 = j14;
                            i14 = iIntValue;
                            cVar = new ik2.c(str4, s8, j15);
                        }
                        if (cVar == null) {
                            return dVar;
                        }
                        if (aVar != null) {
                            str = (String) aVar.invoke(String.valueOf(i14));
                            if (str == null) {
                                return dVar;
                            }
                            str2 = str;
                        } else {
                            str2 = dVar;
                        }
                        manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                        if (manufacturerSpecificData != null) {
                            bArr = manufacturerSpecificData.get(TsExtractor.TS_STREAM_TYPE_E_AC3);
                        } else {
                            bArr = dVar;
                        }
                        serviceData = scanRecord.getServiceData();
                        if (serviceData != null) {
                            bArr3 = serviceData.get(ik2.e.f93935a);
                        } else {
                            bArr2 = dVar;
                        }
                        if (bArr != 0 || bArr.length < 7 || bArr[b14] != 1) {
                            if (bArr2 == 0 && bArr2.length >= 5 && bArr2[c16] == 1) {
                                bArrW = u.W(bArr2, new l(1, 4));
                            } else {
                                lValueOf = dVar;
                            }
                            deviceName = scanRecord.getDeviceName();
                            if (deviceName != null && (deviceName = scanResult.getDevice().getName()) == null) {
                                return dVar;
                            }
                            String str7 = deviceName;
                            String address3 = scanResult.getDevice().getAddress();
                            address3.getClass();
                            String strValueOf3 = String.valueOf(i14);
                            BluetoothDevice device3 = scanResult.getDevice();
                            device3.getClass();
                            return new d(str7, address3, strValueOf3, device3, Integer.valueOf(cVar.f93933b), cVar.f93932a, Long.valueOf(cVar.f93934c), lValueOf, str2, Integer.valueOf(scanResult.getRssi()), null, Long.valueOf(System.currentTimeMillis()), 1024, null);
                        }
                        bArr2 = bArr3;
                        bArrW = u.W(bArr, new l(3, 6));
                        lValueOf = Long.valueOf((((long) bArrW[c16]) & j8) | ((((long) bArrW[1]) & j8) << c14) | ((((long) bArrW[b14]) & j8) << c15) | ((((long) bArrW[3]) & j8) << 24));
                        deviceName = scanRecord.getDeviceName();
                        if (deviceName != null) {
                        }
                        String str8 = deviceName;
                        String address4 = scanResult.getDevice().getAddress();
                        address4.getClass();
                        String strValueOf4 = String.valueOf(i14);
                        BluetoothDevice device4 = scanResult.getDevice();
                        device4.getClass();
                        return new d(str8, address4, strValueOf4, device4, Integer.valueOf(cVar.f93933b), cVar.f93932a, Long.valueOf(cVar.f93934c), lValueOf, str2, Integer.valueOf(scanResult.getRssi()), null, Long.valueOf(System.currentTimeMillis()), 1024, null);
                    }
                    c14 = '\b';
                    if (bArr5.length > 0) {
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        c15 = 16;
                        str3 = new String(bArr5, charset);
                        i15 = 3;
                    } else {
                        c15 = 16;
                        str3 = null;
                        i15 = 2;
                    }
                    cVar = new ik2.c(str3, i15, 0L);
                    dVar = null;
                    c16 = 0;
                    b14 = 2;
                    j8 = 255;
                    i14 = iIntValue;
                    if (cVar == null) {
                        return dVar;
                    }
                    if (aVar != null) {
                        str = (String) aVar.invoke(String.valueOf(i14));
                        if (str == null) {
                            return dVar;
                        }
                        str2 = str;
                    } else {
                        str2 = dVar;
                    }
                    manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                    if (manufacturerSpecificData != null) {
                        bArr = manufacturerSpecificData.get(TsExtractor.TS_STREAM_TYPE_E_AC3);
                    } else {
                        bArr = dVar;
                    }
                    serviceData = scanRecord.getServiceData();
                    if (serviceData != null) {
                        bArr3 = serviceData.get(ik2.e.f93935a);
                    } else {
                        bArr2 = dVar;
                    }
                    if (bArr != 0) {
                        if (bArr2 == 0) {
                        }
                        lValueOf = dVar;
                    } else {
                        if (bArr2 == 0) {
                        }
                        lValueOf = dVar;
                    }
                    deviceName = scanRecord.getDeviceName();
                    if (deviceName != null) {
                    }
                    String str9 = deviceName;
                    String address5 = scanResult.getDevice().getAddress();
                    address5.getClass();
                    String strValueOf5 = String.valueOf(i14);
                    BluetoothDevice device5 = scanResult.getDevice();
                    device5.getClass();
                    return new d(str9, address5, strValueOf5, device5, Integer.valueOf(cVar.f93933b), cVar.f93932a, Long.valueOf(cVar.f93934c), lValueOf, str2, Integer.valueOf(scanResult.getRssi()), null, Long.valueOf(System.currentTimeMillis()), 1024, null);
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num) {
        this(str, str2, str3, bluetoothDevice, num, null, null, null, null, null, null, null, 4064, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4) {
        this(str, str2, str3, bluetoothDevice, num, str4, null, null, null, null, null, null, 4032, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14) {
        this(str, str2, str3, bluetoothDevice, num, str4, l14, null, null, null, null, null, 3968, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14, Long l15) {
        this(str, str2, str3, bluetoothDevice, num, str4, l14, l15, null, null, null, null, 3840, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14, Long l15, String str5) {
        this(str, str2, str3, bluetoothDevice, num, str4, l14, l15, str5, null, null, null, 3584, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14, Long l15, String str5, Integer num2) {
        this(str, str2, str3, bluetoothDevice, num, str4, l14, l15, str5, num2, null, null, 3072, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14, Long l15, String str5, Integer num2, String str6) {
        this(str, str2, str3, bluetoothDevice, num, str4, l14, l15, str5, num2, str6, null, 2048, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }

    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14, Long l15, String str5, Integer num2, String str6, Long l16) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
        this.f60237a = str;
        this.f60238b = str2;
        this.f60239c = str3;
        this.f60240d = bluetoothDevice;
        this.f60241e = num;
        this.f60242f = str4;
        this.f60243g = l14;
        this.f60244h = l15;
        this.f60245i = str5;
        this.f60246j = num2;
        this.f60247k = str6;
        this.f60248l = l16;
    }

    public /* synthetic */ d(String str, String str2, String str3, BluetoothDevice bluetoothDevice, Integer num, String str4, Long l14, Long l15, String str5, Integer num2, String str6, Long l16, int i14, j jVar) {
        this(str, str2, str3, bluetoothDevice, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : l14, (i14 & 128) != 0 ? null : l15, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : num2, (i14 & 1024) != 0 ? null : str6, (i14 & 2048) != 0 ? null : l16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, BluetoothDevice bluetoothDevice) {
        this(str, str2, str3, bluetoothDevice, null, null, null, null, null, null, null, null, 4080, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        bluetoothDevice.getClass();
    }
}
