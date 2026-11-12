package com.smarthome.core.modelconfig;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class PluginDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<PluginDeviceInfo> CREATOR = new a();
    public static final String FBLUETOOTHPAIR = "f";
    public static final String FDESC = "b";
    public static final String FICONOFF = "d";
    public static final String FICONOFFLINE = "e";
    public static final String FICONON = "c";
    public static final String FIELDS = "a, b, c, d,e, f, g";
    public static final String FLOCALIZATIONS = "g";
    public static final String FMODEL = "a";
    public static final int GATEWAY_BT = 1;
    public static final int GATEWAY_INFRARED = 16;
    public static final int GATEWAY_MESH = 2;
    public static final int GATEWAY_ZIGBEE12 = 4;
    public static final int GATEWAY_ZIGBEE30 = 8;
    public static final int MORE_CONFIG_TYPE_CELLULAR = 2;
    public static final int MORE_CONFIG_TYPE_ETH = 1;
    public static final int OFFLINE_ENTER_TIPS_AND_MASK = 0;
    public static final int OFFLINE_ENTER_TIPS_NO_MASK = 1;
    public static final int OFFLINE_ENTER_WITHOUT_TIPS_AND_MASK = 2;
    public static final int SC_AP = 0;
    public static final int SC_APPSECURE_PROXY = 17;
    public static final int SC_APSECURE = 16;
    public static final int SC_BLUETOOTH = 2;
    public static final int SC_COMBO = 3;
    public static final int SC_COMBO_ONLY_BLE = 25;
    public static final int SC_COMBO_WITH_LOGIN = 20;
    public static final int SC_DIRECT_AP = 6;
    public static final int SC_GENERAL_AP = 7;
    public static final int SC_HUALAI_ROUTER = 22;
    public static final int SC_LOCK_WIFI = 18;
    public static final int SC_MESH = 11;
    public static final int SC_MULTICAST = 1;
    public static final int SC_NBIOT = 15;
    public static final int SC_PLC_GATEWAY = 26;
    public static final int SC_PLC_SUB_DEVICE = 27;
    public static final int SC_PLUGIN_AP = 9;
    public static final int SC_QRCODE = 5;
    public static final int SC_QRCODE_CAMERA = 4;
    public static final int SC_ROUTER = 19;
    public static final int SC_STATION_ROUTER = 24;
    public static final int SC_STATION_SUB_DEVICE = 23;
    public static final int SC_SWCODE = 12;
    public static final int SC_ZIGBEE1_2 = 13;
    public static final int SC_ZIGBEE3_0 = 14;
    public static final String TABLENAME = "OtherConfig";
    public static final int UWB_BUILD_IN = 65536;
    public static final int UWB_GENERAL = 256;
    public static final int WIFI_SEND_AP = 0;
    public static final int WIFI_SEND_BLE = 1;
    public static final int WIFI_SEND_QRCODE = 2;
    public int A;
    public long B;
    public List<Integer> C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public int H;
    public List<Integer> I;
    public int J;
    public List<Integer> K;
    public int L;
    public boolean M;
    public List<String> N;
    public int O;
    public int P;
    public int Q;
    public String R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10608b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10609k;
    public int l;
    public int m;
    public String n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10610r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public byte z;

    public class a implements Parcelable.Creator<PluginDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PluginDeviceInfo createFromParcel(Parcel parcel) {
            return new PluginDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PluginDeviceInfo[] newArray(int i) {
            return new PluginDeviceInfo[i];
        }
    }

    public PluginDeviceInfo() {
        this.F = true;
        this.L = 0;
    }

    public synchronized void A(int i) {
        this.x = i;
    }

    public synchronized void A0(int i) {
        this.G = i;
    }

    public synchronized void B(int i) {
        this.f10610r = i;
    }

    public synchronized void B0(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        arrayList.addAll(list);
    }

    public synchronized void C(int i) {
        this.s = i;
    }

    public synchronized void C0(int i) {
        this.m = i;
    }

    public synchronized void D0(boolean z) {
        this.M = z;
    }

    public synchronized void E(int i) {
        this.w = i;
    }

    public synchronized void E0(int i) {
        this.v = i;
    }

    public void F(int i) {
        this.D = i;
    }

    public synchronized void F0(int i) {
        this.q = i;
    }

    public synchronized void G(String str) {
        this.n = str;
    }

    public synchronized void G0(int i) {
        this.u = i;
    }

    public synchronized void H(int i) {
        this.J = i;
    }

    public void H0(long j) {
        this.B = j;
    }

    public synchronized void I(String str) {
        this.f10609k = str;
    }

    public synchronized void I0(List<Integer> list) {
        this.K = list;
    }

    public void J0(int i) {
        this.P = i;
    }

    public void K0(int i) {
        this.O = i;
    }

    public void L(List<Integer> list) {
        this.C = list;
    }

    public void L0(int i) {
        this.A = i;
    }

    public synchronized String M0() {
        return "PluginDeviceInfo[model:" + this.f10607a + " productId:" + this.f10608b + " minAppVersion:" + this.c + " name:" + this.d + " desc:" + this.f10609k + " iconOn:" + this.e + " iconOff:" + this.f + " iconOffline:" + this.g + " modelRegex:" + this.j + " categoryName:" + this.n + " iconBluetoothPair:" + this.h + " brandId:" + this.D + " isNeedSSID:" + this.F + " ]";
    }

    public void N0(Parcel parcel) {
        parcel.writeString(this.f10607a);
        parcel.writeInt(this.f10608b);
        parcel.writeInt(this.c);
        parcel.writeString(this.j);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.f10610r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        ParcelUtils.writeIntList(parcel, this.I);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        ParcelUtils.writeIntList(parcel, this.K);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A);
        ParcelUtils.writeStringList(parcel, this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.y);
        parcel.writeByte(this.z);
        parcel.writeInt(this.Q);
        parcel.writeString(this.d);
        parcel.writeString(this.i);
        parcel.writeString(this.n);
        parcel.writeLong(this.B);
        ParcelUtils.writeIntList(parcel, this.C);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.L);
        parcel.writeInt(this.J);
        parcel.writeInt(this.F ? 1 : 0);
    }

    public void P(int i) {
        this.L = i;
    }

    public void R(int i) {
        this.Q = i;
    }

    public synchronized void V(String str) {
        this.h = str;
    }

    public synchronized void W(String str) {
        this.f = str;
    }

    public synchronized void X(String str) {
        this.g = str;
    }

    public synchronized void Y(String str) {
        this.e = str;
    }

    public synchronized int a() {
        return this.s;
    }

    public synchronized void a0(String str) {
        this.i = str;
    }

    public synchronized String c() {
        return this.n;
    }

    public synchronized String d() {
        try {
            if (this.f10609k == null) {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10609k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized String e() {
        try {
            if (this.h == null) {
                w();
            }
            if (TextUtils.isEmpty(this.h)) {
                return "";
            }
            return this.h;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e0(String str) {
        this.R = str;
    }

    public synchronized String f() {
        try {
            if (this.f == null) {
                w();
            }
            if (TextUtils.isEmpty(this.f)) {
                return "";
            }
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String g() {
        try {
            if (this.g == null) {
                w();
            }
            if (TextUtils.isEmpty(this.g)) {
                return "";
            }
            return this.g;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String h() {
        try {
            if (this.e == null) {
                w();
            }
            if (TextUtils.isEmpty(this.e)) {
                return "";
            }
            return this.e;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void h0(byte b2) {
        this.z = b2;
    }

    public synchronized String i() {
        if (TextUtils.isEmpty(this.i)) {
            return "";
        }
        return this.i;
    }

    public synchronized List<String> j() {
        if (this.R == null) {
            w();
        }
        try {
            if (!TextUtils.isEmpty(this.R)) {
                JSONArray jSONArray = new JSONArray(this.R);
                if (jSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    return arrayList;
                }
            }
            return Collections.emptyList();
        } catch (JSONException unused) {
            return Collections.emptyList();
        }
    }

    public synchronized void j0(int i) {
        this.y = i;
    }

    public synchronized int k() {
        return this.c;
    }

    public synchronized void k0(int i) {
        this.c = i;
    }

    public synchronized String l() {
        if (TextUtils.isEmpty(this.f10607a)) {
            return "";
        }
        return this.f10607a;
    }

    public synchronized void l0(String str) {
        this.f10607a = str;
    }

    public synchronized String m() {
        return this.j;
    }

    public synchronized String o() {
        if (TextUtils.isEmpty(this.d)) {
            return "";
        }
        return this.d;
    }

    public synchronized void o0(String str) {
        this.j = str;
    }

    public synchronized void p0(String str) {
        this.d = str;
    }

    public synchronized int q() {
        return this.f10608b;
    }

    public synchronized void q0(int i) {
        this.p = i;
    }

    public synchronized int r() {
        return this.G;
    }

    public synchronized PluginDeviceInfoStatus t() {
        return PluginDeviceInfoStatus.valueOf(this.m);
    }

    public int u() {
        return this.A;
    }

    public synchronized void u0(int i) {
        this.l = i;
    }

    public synchronized void v(boolean z) {
        this.F = z;
    }

    public synchronized void v0(String str) {
        this.E = str;
    }

    public final void w() {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginDeviceManager", "loadOther mModel:" + this.f10607a);
        PluginDeviceManager.getInstance().readDeviceOtherfInternal(this);
    }

    public synchronized void w0(int i) {
        this.f10608b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10607a);
        parcel.writeInt(this.f10608b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f10609k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.f10610r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeList(this.I);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeList(this.K);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A);
        parcel.writeList(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.y);
        parcel.writeByte(this.z);
        parcel.writeInt(this.Q);
        parcel.writeLong(this.B);
        parcel.writeList(this.C);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.L);
        parcel.writeInt(this.J);
        parcel.writeInt(this.F ? 1 : 0);
    }

    public PluginDeviceInfo x(Parcel parcel) {
        this.f10607a = parcel.readString();
        this.f10608b = parcel.readInt();
        this.c = parcel.readInt();
        this.j = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.f10610r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = ParcelUtils.readIntList(parcel);
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.K = ParcelUtils.readIntList(parcel);
        this.M = parcel.readInt() != 0;
        this.A = parcel.readInt();
        this.N = ParcelUtils.readStringList(parcel);
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readByte();
        this.Q = parcel.readInt();
        this.d = parcel.readString();
        this.i = parcel.readString();
        this.n = parcel.readString();
        this.B = parcel.readLong();
        this.C = ParcelUtils.readIntList(parcel);
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.L = parcel.readInt();
        this.J = parcel.readInt();
        this.F = parcel.readInt() == 1;
        return this;
    }

    public synchronized void x0(List<String> list) {
        this.N = list;
    }

    public synchronized void y0(int i) {
        this.t = i;
    }

    public synchronized void z(int i) {
        this.o = i;
    }

    public synchronized void z0(int i) {
        this.H = i;
    }

    public PluginDeviceInfo(Parcel parcel) {
        this.F = true;
        this.L = 0;
        this.f10607a = parcel.readString();
        this.f10608b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.f10609k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.f10610r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readArrayList(ClassLoader.getSystemClassLoader());
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.K = parcel.readArrayList(ClassLoader.getSystemClassLoader());
        this.M = parcel.readInt() != 0;
        this.A = parcel.readInt();
        this.N = parcel.readArrayList(ClassLoader.getSystemClassLoader());
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readByte();
        this.Q = parcel.readInt();
        this.B = parcel.readLong();
        this.C = parcel.readArrayList(ClassLoader.getSystemClassLoader());
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.L = parcel.readInt();
        this.J = parcel.readInt();
        this.F = parcel.readInt() == 1;
    }
}
