package io.sentry.protocol;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Device implements cud {

    @Nullable
    public String A;

    @Deprecated
    @Nullable
    public String B;

    @Nullable
    public String C;

    @Nullable
    public String D;

    @Nullable
    public Float E;

    @Nullable
    public Integer F;

    @Nullable
    public Double G;

    @Nullable
    public String H;

    @Nullable
    public Map<String, Object> I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21765b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String f;

    @Nullable
    public String[] g;

    @Nullable
    public Float h;

    @Nullable
    public Boolean i;

    @Nullable
    public Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public DeviceOrientation f21766k;

    @Nullable
    public Boolean l;

    @Nullable
    public Long m;

    @Nullable
    public Long n;

    @Nullable
    public Long o;

    @Nullable
    public Boolean p;

    @Nullable
    public Long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Long f21767r;

    @Nullable
    public Long s;

    @Nullable
    public Long t;

    @Nullable
    public Integer u;

    @Nullable
    public Integer v;

    @Nullable
    public Float w;

    @Nullable
    public Integer x;

    @Nullable
    public Date y;

    @Nullable
    public TimeZone z;

    public enum DeviceOrientation implements cud {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements fsd<DeviceOrientation> {
            @Override // defpackage.fsd
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public DeviceOrientation a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
                return DeviceOrientation.valueOf(f4hVar.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // defpackage.cud
        public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.c(toString().toLowerCase(Locale.ROOT));
        }
    }

    public static final class a implements fsd<Device> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Device a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            Device device = new Device();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                byte b2 = -1;
                switch (strNextName.hashCode()) {
                    case -2076227591:
                        if (strNextName.equals("timezone")) {
                            b2 = 0;
                        }
                        break;
                    case -2012489734:
                        if (strNextName.equals("boot_time")) {
                            b2 = 1;
                        }
                        break;
                    case -1981332476:
                        if (strNextName.equals("simulator")) {
                            b2 = 2;
                        }
                        break;
                    case -1969347631:
                        if (strNextName.equals("manufacturer")) {
                            b2 = 3;
                        }
                        break;
                    case -1613589672:
                        if (strNextName.equals("language")) {
                            b2 = 4;
                        }
                        break;
                    case -1608004830:
                        if (strNextName.equals("processor_count")) {
                            b2 = 5;
                        }
                        break;
                    case -1439500848:
                        if (strNextName.equals("orientation")) {
                            b2 = 6;
                        }
                        break;
                    case -1410521534:
                        if (strNextName.equals("battery_temperature")) {
                            b2 = 7;
                        }
                        break;
                    case -1281860764:
                        if (strNextName.equals("family")) {
                            b2 = 8;
                        }
                        break;
                    case -1097462182:
                        if (strNextName.equals("locale")) {
                            b2 = 9;
                        }
                        break;
                    case -1012222381:
                        if (strNextName.equals("online")) {
                            b2 = 10;
                        }
                        break;
                    case -877252910:
                        if (strNextName.equals("battery_level")) {
                            b2 = 11;
                        }
                        break;
                    case -619038223:
                        if (strNextName.equals("model_id")) {
                            b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        }
                        break;
                    case -568274923:
                        if (strNextName.equals("screen_density")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                        }
                        break;
                    case -417046774:
                        if (strNextName.equals("screen_dpi")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                        }
                        break;
                    case -136523212:
                        if (strNextName.equals("free_memory")) {
                            b2 = 15;
                        }
                        break;
                    case 3355:
                        if (strNextName.equals("id")) {
                            b2 = 16;
                        }
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            b2 = 17;
                        }
                        break;
                    case 59142220:
                        if (strNextName.equals("low_memory")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                        }
                        break;
                    case 93076189:
                        if (strNextName.equals("archs")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                        }
                        break;
                    case 93997959:
                        if (strNextName.equals(CommonConstants.KEY_BRAND)) {
                            b2 = 20;
                        }
                        break;
                    case 104069929:
                        if (strNextName.equals("model")) {
                            b2 = 21;
                        }
                        break;
                    case 115746789:
                        if (strNextName.equals("cpu_description")) {
                            b2 = 22;
                        }
                        break;
                    case 244497903:
                        if (strNextName.equals("processor_frequency")) {
                            b2 = 23;
                        }
                        break;
                    case 731866107:
                        if (strNextName.equals("connection_type")) {
                            b2 = 24;
                        }
                        break;
                    case 817830969:
                        if (strNextName.equals("screen_width_pixels")) {
                            b2 = 25;
                        }
                        break;
                    case 823882553:
                        if (strNextName.equals("external_storage_size")) {
                            b2 = 26;
                        }
                        break;
                    case 897428293:
                        if (strNextName.equals("storage_size")) {
                            b2 = 27;
                        }
                        break;
                    case 1331465768:
                        if (strNextName.equals("usable_memory")) {
                            b2 = 28;
                        }
                        break;
                    case 1418777727:
                        if (strNextName.equals("memory_size")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR;
                        }
                        break;
                    case 1436115569:
                        if (strNextName.equals("charging")) {
                            b2 = HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC;
                        }
                        break;
                    case 1450613660:
                        if (strNextName.equals("external_free_storage")) {
                            b2 = 31;
                        }
                        break;
                    case 1524159400:
                        if (strNextName.equals("free_storage")) {
                            b2 = 32;
                        }
                        break;
                    case 1556284978:
                        if (strNextName.equals("screen_height_pixels")) {
                            b2 = SettingsModule.VALUE_TYPE_STRING_ENUM;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        device.z = f4hVar.V(iLogger);
                        break;
                    case 1:
                        if (f4hVar.peek() == JsonToken.STRING) {
                            device.y = f4hVar.r(iLogger);
                        }
                        break;
                    case 2:
                        device.l = f4hVar.t();
                        break;
                    case 3:
                        device.f21765b = f4hVar.B();
                        break;
                    case 4:
                        device.B = f4hVar.B();
                        break;
                    case 5:
                        device.F = f4hVar.h0();
                        break;
                    case 6:
                        device.f21766k = (DeviceOrientation) f4hVar.A(iLogger, new DeviceOrientation.a());
                        break;
                    case 7:
                        device.E = f4hVar.I();
                        break;
                    case 8:
                        device.d = f4hVar.B();
                        break;
                    case 9:
                        device.C = f4hVar.B();
                        break;
                    case 10:
                        device.j = f4hVar.t();
                        break;
                    case 11:
                        device.h = f4hVar.I();
                        break;
                    case 12:
                        device.f = f4hVar.B();
                        break;
                    case 13:
                        device.w = f4hVar.I();
                        break;
                    case 14:
                        device.x = f4hVar.h0();
                        break;
                    case 15:
                        device.n = f4hVar.j0();
                        break;
                    case 16:
                        device.A = f4hVar.B();
                        break;
                    case 17:
                        device.f21764a = f4hVar.B();
                        break;
                    case 18:
                        device.p = f4hVar.t();
                        break;
                    case 19:
                        List list = (List) f4hVar.q0();
                        if (list != null) {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            device.g = strArr;
                        }
                        break;
                    case 20:
                        device.c = f4hVar.B();
                        break;
                    case 21:
                        device.e = f4hVar.B();
                        break;
                    case 22:
                        device.H = f4hVar.B();
                        break;
                    case 23:
                        device.G = f4hVar.W();
                        break;
                    case 24:
                        device.D = f4hVar.B();
                        break;
                    case 25:
                        device.u = f4hVar.h0();
                        break;
                    case 26:
                        device.s = f4hVar.j0();
                        break;
                    case 27:
                        device.q = f4hVar.j0();
                        break;
                    case 28:
                        device.o = f4hVar.j0();
                        break;
                    case 29:
                        device.m = f4hVar.j0();
                        break;
                    case 30:
                        device.i = f4hVar.t();
                        break;
                    case 31:
                        device.t = f4hVar.j0();
                        break;
                    case 32:
                        device.f21767r = f4hVar.j0();
                        break;
                    case 33:
                        device.v = f4hVar.h0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            device.s0(concurrentHashMap);
            f4hVar.endObject();
            return device;
        }
    }

    public Device() {
    }

    public Device(@NotNull Device device) {
        this.f21764a = device.f21764a;
        this.f21765b = device.f21765b;
        this.c = device.c;
        this.d = device.d;
        this.e = device.e;
        this.f = device.f;
        this.i = device.i;
        this.j = device.j;
        this.f21766k = device.f21766k;
        this.l = device.l;
        this.m = device.m;
        this.n = device.n;
        this.o = device.o;
        this.p = device.p;
        this.q = device.q;
        this.f21767r = device.f21767r;
        this.s = device.s;
        this.t = device.t;
        this.u = device.u;
        this.v = device.v;
        this.w = device.w;
        this.x = device.x;
        this.y = device.y;
        this.A = device.A;
        this.B = device.B;
        this.D = device.D;
        this.E = device.E;
        this.h = device.h;
        String[] strArr = device.g;
        this.g = strArr != null ? (String[]) strArr.clone() : null;
        this.C = device.C;
        TimeZone timeZone = device.z;
        this.z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.F = device.F;
        this.G = device.G;
        this.H = device.H;
        this.I = io.sentry.util.b.c(device.I);
    }

    @Nullable
    public String I() {
        return this.D;
    }

    @Nullable
    public String J() {
        return this.A;
    }

    @Nullable
    public String K() {
        return this.B;
    }

    @Nullable
    public String L() {
        return this.C;
    }

    public void M(@Nullable String[] strArr) {
        this.g = strArr;
    }

    public void N(@Nullable Float f) {
        this.h = f;
    }

    public void O(@Nullable Float f) {
        this.E = f;
    }

    public void P(@Nullable Date date) {
        this.y = date;
    }

    public void Q(@Nullable String str) {
        this.c = str;
    }

    public void R(@Nullable Boolean bool) {
        this.i = bool;
    }

    public void S(@Nullable String str) {
        this.D = str;
    }

    public void T(@Nullable Long l) {
        this.t = l;
    }

    public void U(@Nullable Long l) {
        this.s = l;
    }

    public void V(@Nullable String str) {
        this.d = str;
    }

    public void W(@Nullable Long l) {
        this.n = l;
    }

    public void X(@Nullable Long l) {
        this.f21767r = l;
    }

    public void Y(@Nullable String str) {
        this.A = str;
    }

    public void Z(@Nullable String str) {
        this.B = str;
    }

    public void a0(@Nullable String str) {
        this.C = str;
    }

    public void b0(@Nullable Boolean bool) {
        this.p = bool;
    }

    public void c0(@Nullable String str) {
        this.f21765b = str;
    }

    public void d0(@Nullable Long l) {
        this.m = l;
    }

    public void e0(@Nullable String str) {
        this.e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Device.class != obj.getClass()) {
            return false;
        }
        Device device = (Device) obj;
        return io.sentry.util.p.a(this.f21764a, device.f21764a) && io.sentry.util.p.a(this.f21765b, device.f21765b) && io.sentry.util.p.a(this.c, device.c) && io.sentry.util.p.a(this.d, device.d) && io.sentry.util.p.a(this.e, device.e) && io.sentry.util.p.a(this.f, device.f) && Arrays.equals(this.g, device.g) && io.sentry.util.p.a(this.h, device.h) && io.sentry.util.p.a(this.i, device.i) && io.sentry.util.p.a(this.j, device.j) && this.f21766k == device.f21766k && io.sentry.util.p.a(this.l, device.l) && io.sentry.util.p.a(this.m, device.m) && io.sentry.util.p.a(this.n, device.n) && io.sentry.util.p.a(this.o, device.o) && io.sentry.util.p.a(this.p, device.p) && io.sentry.util.p.a(this.q, device.q) && io.sentry.util.p.a(this.f21767r, device.f21767r) && io.sentry.util.p.a(this.s, device.s) && io.sentry.util.p.a(this.t, device.t) && io.sentry.util.p.a(this.u, device.u) && io.sentry.util.p.a(this.v, device.v) && io.sentry.util.p.a(this.w, device.w) && io.sentry.util.p.a(this.x, device.x) && io.sentry.util.p.a(this.y, device.y) && io.sentry.util.p.a(this.A, device.A) && io.sentry.util.p.a(this.B, device.B) && io.sentry.util.p.a(this.C, device.C) && io.sentry.util.p.a(this.D, device.D) && io.sentry.util.p.a(this.E, device.E) && io.sentry.util.p.a(this.F, device.F) && io.sentry.util.p.a(this.G, device.G) && io.sentry.util.p.a(this.H, device.H);
    }

    public void f0(@Nullable String str) {
        this.f = str;
    }

    public void g0(@Nullable String str) {
        this.f21764a = str;
    }

    public void h0(@Nullable Boolean bool) {
        this.j = bool;
    }

    public int hashCode() {
        return (io.sentry.util.p.b(this.f21764a, this.f21765b, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.f21766k, this.l, this.m, this.n, this.o, this.p, this.q, this.f21767r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H) * 31) + Arrays.hashCode(this.g);
    }

    public void i0(@Nullable DeviceOrientation deviceOrientation) {
        this.f21766k = deviceOrientation;
    }

    public void j0(@Nullable Integer num) {
        this.F = num;
    }

    public void k0(@Nullable Double d) {
        this.G = d;
    }

    public void l0(@Nullable Float f) {
        this.w = f;
    }

    public void m0(@Nullable Integer num) {
        this.x = num;
    }

    public void n0(@Nullable Integer num) {
        this.v = num;
    }

    public void o0(@Nullable Integer num) {
        this.u = num;
    }

    public void p0(@Nullable Boolean bool) {
        this.l = bool;
    }

    public void q0(@Nullable Long l) {
        this.q = l;
    }

    public void r0(@Nullable TimeZone timeZone) {
        this.z = timeZone;
    }

    public void s0(@Nullable Map<String, Object> map) {
        this.I = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21764a != null) {
            h4hVar.g("name").c(this.f21764a);
        }
        if (this.f21765b != null) {
            h4hVar.g("manufacturer").c(this.f21765b);
        }
        if (this.c != null) {
            h4hVar.g(CommonConstants.KEY_BRAND).c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("family").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("model").c(this.e);
        }
        if (this.f != null) {
            h4hVar.g("model_id").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("archs").j(iLogger, this.g);
        }
        if (this.h != null) {
            h4hVar.g("battery_level").i(this.h);
        }
        if (this.i != null) {
            h4hVar.g("charging").k(this.i);
        }
        if (this.j != null) {
            h4hVar.g("online").k(this.j);
        }
        if (this.f21766k != null) {
            h4hVar.g("orientation").j(iLogger, this.f21766k);
        }
        if (this.l != null) {
            h4hVar.g("simulator").k(this.l);
        }
        if (this.m != null) {
            h4hVar.g("memory_size").i(this.m);
        }
        if (this.n != null) {
            h4hVar.g("free_memory").i(this.n);
        }
        if (this.o != null) {
            h4hVar.g("usable_memory").i(this.o);
        }
        if (this.p != null) {
            h4hVar.g("low_memory").k(this.p);
        }
        if (this.q != null) {
            h4hVar.g("storage_size").i(this.q);
        }
        if (this.f21767r != null) {
            h4hVar.g("free_storage").i(this.f21767r);
        }
        if (this.s != null) {
            h4hVar.g("external_storage_size").i(this.s);
        }
        if (this.t != null) {
            h4hVar.g("external_free_storage").i(this.t);
        }
        if (this.u != null) {
            h4hVar.g("screen_width_pixels").i(this.u);
        }
        if (this.v != null) {
            h4hVar.g("screen_height_pixels").i(this.v);
        }
        if (this.w != null) {
            h4hVar.g("screen_density").i(this.w);
        }
        if (this.x != null) {
            h4hVar.g("screen_dpi").i(this.x);
        }
        if (this.y != null) {
            h4hVar.g("boot_time").j(iLogger, this.y);
        }
        if (this.z != null) {
            h4hVar.g("timezone").j(iLogger, this.z);
        }
        if (this.A != null) {
            h4hVar.g("id").c(this.A);
        }
        if (this.B != null) {
            h4hVar.g("language").c(this.B);
        }
        if (this.D != null) {
            h4hVar.g("connection_type").c(this.D);
        }
        if (this.E != null) {
            h4hVar.g("battery_temperature").i(this.E);
        }
        if (this.C != null) {
            h4hVar.g("locale").c(this.C);
        }
        if (this.F != null) {
            h4hVar.g("processor_count").i(this.F);
        }
        if (this.G != null) {
            h4hVar.g("processor_frequency").i(this.G);
        }
        if (this.H != null) {
            h4hVar.g("cpu_description").c(this.H);
        }
        Map<String, Object> map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.I.get(str));
            }
        }
        h4hVar.endObject();
    }
}
