package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B7\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rBO\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0004\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0004\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k;", "Landroid/os/Parcelable;", "", "ssid", "<init>", "(Ljava/lang/String;)V", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;", "securityType", "password", "", "isPasswordHex", "", "discoveryOrigin", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;Ljava/lang/String;ZI)V", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$d;", "statusType", "connectionStatus", "", "macAddress", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$d;Ljava/lang/String;ZIZ[B)V", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "stored", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;)V", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "scanned", "(Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;)V", "c", "d", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f43321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f43322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f43326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f43319i = new b(null);
    public static final Parcelable.Creator<k> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/k$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            boolean z14;
            parcel.getClass();
            String string = parcel.readString();
            c.a aVar = c.f43331b;
            int i14 = parcel.readInt();
            aVar.getClass();
            c cVar = c.f43332c.get(i14);
            cVar.getClass();
            c cVar2 = cVar;
            d.a aVar2 = d.f43341b;
            int i15 = parcel.readInt();
            aVar2.getClass();
            d dVar = d.f43342c.get(i15);
            dVar.getClass();
            d dVar2 = dVar;
            String string2 = parcel.readString();
            boolean z15 = false;
            if (parcel.readByte() == 1) {
                z15 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            int i16 = parcel.readInt();
            if (parcel.readInt() != z14) {
                z14 = false;
            }
            byte[] bArr = new byte[6];
            parcel.readByteArray(bArr);
            return new k(string, cVar2, dVar2, string2, z15, i16, z14, bArr);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(WifiSetup.StoredAccessPoint storedAccessPoint) {
        storedAccessPoint.getClass();
        d dVar = d.UNKNOWN;
        this.f43322c = dVar;
        this.f43327h = -1;
        this.f43320a = storedAccessPoint.getSsid();
        WifiSetup.SecurityType securityType = storedAccessPoint.getSecurityType();
        securityType.getClass();
        b bVar = f43319i;
        bVar.getClass();
        this.f43321b = b.a(securityType);
        WifiSetup.StatusType statusType = storedAccessPoint.getStatusType();
        statusType.getClass();
        bVar.getClass();
        int i14 = b.a.f43330c[statusType.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                dVar = d.CONNECTION_SUCCESS;
            } else if (i14 == 3) {
                dVar = d.INVALID_CREDENTIALS;
            } else if (i14 == 4) {
                dVar = d.NOT_FOUND;
            }
        }
        this.f43322c = dVar;
        if (storedAccessPoint.hasPassword()) {
            String string = storedAccessPoint.getPassword().toString();
            boolean passwordIsHex = storedAccessPoint.getPasswordIsHex();
            this.f43323d = string;
            this.f43324e = passwordIsHex;
        }
        this.f43327h = 0;
        this.f43325f = storedAccessPoint.getStatusType() == WifiSetup.StatusType.ConnectionSuccess;
        if (storedAccessPoint.hasMacAddress()) {
            this.f43326g = storedAccessPoint.getMacAddress().toByteArray();
        } else {
            this.f43326g = new byte[0];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k)) {
            if (obj == this) {
                return true;
            }
            k kVar = (k) obj;
            if (s.g(kVar.f43320a, this.f43320a) && kVar.f43321b == this.f43321b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43320a, this.f43321b);
    }

    public final String toString() {
        return this.f43320a + "/" + this.f43321b + "/" + this.f43327h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f43320a);
        c cVar = this.f43321b;
        cVar.getClass();
        parcel.writeInt(cVar.f43340a);
        parcel.writeInt(this.f43322c.f43348a);
        parcel.writeString(this.f43323d);
        parcel.writeByte(this.f43324e ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f43327h);
        parcel.writeInt(this.f43325f ? 1 : 0);
        byte[] bArr = this.f43326g;
        if (bArr == null) {
            bArr = new byte[0];
        }
        parcel.writeByteArray(bArr);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.settings.devices.wifi.k$c[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.settings.devices.wifi.k$c[]) from 0x0049: CONSTRUCTOR (r1v2 w13.c) = (r0v1 com.garmin.android.apps.connectmobile.settings.devices.wifi.k$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m)] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        OPEN(R.string.wifi_security_none),
        WEP(R.string.wifi_security_wep),
        WPA(R.string.wifi_security_wpa),
        WPA2(R.string.wifi_security_wpa2),
        WPA3(R.string.wifi_security_wpa3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f43331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SparseArray<c> f43332c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ w13.c f43339j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43340a;

        static {
            w13.c cVar = new w13.c(cVarArr);
            f43339j = cVar;
            f43331b = new a(null);
            f43332c = new SparseArray<>(cVar.getF91800d());
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                c cVar2 = (c) bVar.next();
                f43332c.put(cVar2.f43340a, cVar2);
            }
        }

        private c(int i14) {
            super(str, i);
            this.f43340a = i14;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f43338i.clone();
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;", "lookupByValue", "Landroid/util/SparseArray;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.settings.devices.wifi.k$d[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.settings.devices.wifi.k$d[]) from 0x0030: CONSTRUCTOR (r1v2 w13.c) = (r0v1 com.garmin.android.apps.connectmobile.settings.devices.wifi.k$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m)] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$d;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        UNKNOWN(0),
        CONNECTION_SUCCESS(1),
        INVALID_CREDENTIALS(2),
        NOT_FOUND(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f43341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SparseArray<d> f43342c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43348a;

        static {
            w13.c cVar = new w13.c(dVarArr);
            f43341b = new a(null);
            f43342c = new SparseArray<>(cVar.getF91800d());
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                d dVar = (d) bVar.next();
                f43342c.put(dVar.f43348a, dVar);
            }
        }

        private d(int i14) {
            super(str, i);
            this.f43348a = i14;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f43347h.clone();
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$d$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$d;", "lookupByValue", "Landroid/util/SparseArray;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$b;", "", "<init>", "()V", "", "DISCOVERY_ORIGIN_STORED", "I", "DISCOVERY_ORIGIN_SCANNED", "DISCOVERY_ORIGIN_MANUALLY_ADDED", "DISCOVERY_ORIGIN_INVALID", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f43329b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f43330c;

            static {
                int[] iArr = new int[WifiSetup.SecurityType.values().length];
                try {
                    iArr[WifiSetup.SecurityType.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WifiSetup.SecurityType.WEP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WifiSetup.SecurityType.WPA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[WifiSetup.SecurityType.WPA2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[WifiSetup.SecurityType.WPA3.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f43328a = iArr;
                int[] iArr2 = new int[c.values().length];
                try {
                    iArr2[c.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[c.WEP.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[c.WPA.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[c.WPA2.ordinal()] = 4;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[c.WPA3.ordinal()] = 5;
                } catch (NoSuchFieldError unused10) {
                }
                f43329b = iArr2;
                int[] iArr3 = new int[WifiSetup.StatusType.values().length];
                try {
                    iArr3[WifiSetup.StatusType.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[WifiSetup.StatusType.ConnectionSuccess.ordinal()] = 2;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[WifiSetup.StatusType.InvalidCredentials.ordinal()] = 3;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[WifiSetup.StatusType.NotFound.ordinal()] = 4;
                } catch (NoSuchFieldError unused14) {
                }
                f43330c = iArr3;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(WifiSetup.SecurityType securityType) {
            int i14 = securityType == null ? -1 : a.f43328a[securityType.ordinal()];
            if (i14 == 1) {
                return c.OPEN;
            }
            if (i14 == 2) {
                return c.WEP;
            }
            if (i14 == 3) {
                return c.WPA;
            }
            if (i14 != 4) {
                return i14 != 5 ? c.OPEN : c.WPA3;
            }
            return c.WPA2;
        }

        public static WifiSetup.SecurityType b(c cVar) {
            int i14 = cVar == null ? -1 : a.f43329b[cVar.ordinal()];
            if (i14 == 1) {
                return WifiSetup.SecurityType.OPEN;
            }
            if (i14 == 2) {
                return WifiSetup.SecurityType.WEP;
            }
            if (i14 == 3) {
                return WifiSetup.SecurityType.WPA;
            }
            if (i14 != 4) {
                return i14 != 5 ? WifiSetup.SecurityType.OPEN : WifiSetup.SecurityType.WPA3;
            }
            return WifiSetup.SecurityType.WPA2;
        }

        private b() {
        }
    }

    public k(String str, c cVar, String str2, boolean z14, int i14) {
        this(str, cVar, d.UNKNOWN, str2, z14, i14, false, new byte[0]);
    }

    public k(String str, c cVar, d dVar, String str2, boolean z14, int i14, boolean z15, byte[] bArr) {
        dVar.getClass();
        bArr.getClass();
        d.a aVar = d.f43341b;
        this.f43320a = str;
        this.f43321b = cVar;
        this.f43322c = dVar;
        this.f43323d = str2;
        this.f43324e = z14;
        this.f43327h = i14;
        this.f43325f = z15;
        this.f43326g = bArr;
    }

    public k(String str) {
        this.f43322c = d.UNKNOWN;
        this.f43327h = -1;
        this.f43320a = str;
    }

    public k(WifiSetup.ScannedAccessPoint scannedAccessPoint) {
        scannedAccessPoint.getClass();
        d dVar = d.UNKNOWN;
        this.f43322c = dVar;
        this.f43327h = -1;
        if (scannedAccessPoint.hasMacAddress()) {
            this.f43326g = scannedAccessPoint.getMacAddress().toByteArray();
        } else {
            this.f43326g = new byte[0];
        }
        this.f43320a = scannedAccessPoint.getSsid();
        WifiSetup.SecurityType securityType = scannedAccessPoint.getSecurityType();
        securityType.getClass();
        f43319i.getClass();
        this.f43321b = b.a(securityType);
        this.f43327h = 1;
        this.f43325f = false;
        this.f43322c = dVar;
    }
}
