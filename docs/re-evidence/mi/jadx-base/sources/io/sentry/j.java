package io.sentry;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.hvg;
import defpackage.wzc;
import defpackage.yq5;
import io.sentry.j;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class j implements cud {

    @NotNull
    public final Map<String, io.sentry.profilemeasurements.a> A;

    @Nullable
    public String B;

    @Nullable
    public Map<String, Object> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f21728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Callable<List<Integer>> f21729b;
    public int c;

    @NotNull
    public String d;

    @NotNull
    public String e;

    @NotNull
    public String f;

    @NotNull
    public String g;

    @NotNull
    public String h;

    @NotNull
    public String i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f21730k;

    @NotNull
    public List<Integer> l;

    @NotNull
    public String m;

    @NotNull
    public String n;

    @NotNull
    public String o;

    @NotNull
    public List<k> p;

    @NotNull
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f21731r;

    @NotNull
    public String s;

    @NotNull
    public String t;

    @NotNull
    public String u;

    @NotNull
    public String v;

    @NotNull
    public String w;

    @NotNull
    public String x;

    @NotNull
    public String y;

    @NotNull
    public Date z;

    public static final class b implements fsd<j> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            j jVar = new j();
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                byte b2 = -1;
                switch (strNextName.hashCode()) {
                    case -2133529830:
                        if (strNextName.equals("device_manufacturer")) {
                            b2 = 0;
                        }
                        break;
                    case -1981468849:
                        if (strNextName.equals("android_api_level")) {
                            b2 = 1;
                        }
                        break;
                    case -1430655860:
                        if (strNextName.equals("build_id")) {
                            b2 = 2;
                        }
                        break;
                    case -1172160413:
                        if (strNextName.equals("device_locale")) {
                            b2 = 3;
                        }
                        break;
                    case -1102636175:
                        if (strNextName.equals("profile_id")) {
                            b2 = 4;
                        }
                        break;
                    case -716656436:
                        if (strNextName.equals("device_os_build_number")) {
                            b2 = 5;
                        }
                        break;
                    case -591076352:
                        if (strNextName.equals("device_model")) {
                            b2 = 6;
                        }
                        break;
                    case -512511455:
                        if (strNextName.equals("device_is_emulator")) {
                            b2 = 7;
                        }
                        break;
                    case -478065584:
                        if (strNextName.equals("duration_ns")) {
                            b2 = 8;
                        }
                        break;
                    case -362243017:
                        if (strNextName.equals("measurements")) {
                            b2 = 9;
                        }
                        break;
                    case -332426004:
                        if (strNextName.equals("device_physical_memory_bytes")) {
                            b2 = 10;
                        }
                        break;
                    case -212264198:
                        if (strNextName.equals("device_cpu_frequencies")) {
                            b2 = 11;
                        }
                        break;
                    case -102985484:
                        if (strNextName.equals("version_code")) {
                            b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        }
                        break;
                    case -102670958:
                        if (strNextName.equals("version_name")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                        }
                        break;
                    case -85904877:
                        if (strNextName.equals("environment")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                        }
                        break;
                    case 55126294:
                        if (strNextName.equals("timestamp")) {
                            b2 = 15;
                        }
                        break;
                    case 508853068:
                        if (strNextName.equals("transaction_name")) {
                            b2 = 16;
                        }
                        break;
                    case 796476189:
                        if (strNextName.equals("device_os_name")) {
                            b2 = 17;
                        }
                        break;
                    case 839674195:
                        if (strNextName.equals("architecture")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                        }
                        break;
                    case 1010584092:
                        if (strNextName.equals("transaction_id")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                        }
                        break;
                    case 1052553990:
                        if (strNextName.equals("device_os_version")) {
                            b2 = 20;
                        }
                        break;
                    case 1163928186:
                        if (strNextName.equals("truncation_reason")) {
                            b2 = 21;
                        }
                        break;
                    case 1270300245:
                        if (strNextName.equals("trace_id")) {
                            b2 = 22;
                        }
                        break;
                    case 1874684019:
                        if (strNextName.equals("platform")) {
                            b2 = 23;
                        }
                        break;
                    case 1953158756:
                        if (strNextName.equals("sampled_profile")) {
                            b2 = 24;
                        }
                        break;
                    case 1954122069:
                        if (strNextName.equals("transactions")) {
                            b2 = 25;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        String strB = f4hVar.B();
                        if (strB != null) {
                            jVar.e = strB;
                        }
                        break;
                    case 1:
                        Integer numH0 = f4hVar.h0();
                        if (numH0 != null) {
                            jVar.c = numH0.intValue();
                        }
                        break;
                    case 2:
                        String strB2 = f4hVar.B();
                        if (strB2 != null) {
                            jVar.o = strB2;
                        }
                        break;
                    case 3:
                        String strB3 = f4hVar.B();
                        if (strB3 != null) {
                            jVar.d = strB3;
                        }
                        break;
                    case 4:
                        String strB4 = f4hVar.B();
                        if (strB4 != null) {
                            jVar.w = strB4;
                        }
                        break;
                    case 5:
                        String strB5 = f4hVar.B();
                        if (strB5 != null) {
                            jVar.g = strB5;
                        }
                        break;
                    case 6:
                        String strB6 = f4hVar.B();
                        if (strB6 != null) {
                            jVar.f = strB6;
                        }
                        break;
                    case 7:
                        Boolean boolT = f4hVar.t();
                        if (boolT != null) {
                            jVar.j = boolT.booleanValue();
                        }
                        break;
                    case 8:
                        String strB7 = f4hVar.B();
                        if (strB7 != null) {
                            jVar.f21731r = strB7;
                        }
                        break;
                    case 9:
                        Map mapV = f4hVar.v(iLogger, new io.sentry.profilemeasurements.a.C0969a());
                        if (mapV != null) {
                            jVar.A.putAll(mapV);
                        }
                        break;
                    case 10:
                        String strB8 = f4hVar.B();
                        if (strB8 != null) {
                            jVar.m = strB8;
                        }
                        break;
                    case 11:
                        List list = (List) f4hVar.q0();
                        if (list != null) {
                            jVar.l = list;
                        }
                        break;
                    case 12:
                        String strB9 = f4hVar.B();
                        if (strB9 != null) {
                            jVar.s = strB9;
                        }
                        break;
                    case 13:
                        String strB10 = f4hVar.B();
                        if (strB10 != null) {
                            jVar.t = strB10;
                        }
                        break;
                    case 14:
                        String strB11 = f4hVar.B();
                        if (strB11 != null) {
                            jVar.x = strB11;
                        }
                        break;
                    case 15:
                        Date dateR = f4hVar.r(iLogger);
                        if (dateR != null) {
                            jVar.z = dateR;
                        }
                        break;
                    case 16:
                        String strB12 = f4hVar.B();
                        if (strB12 != null) {
                            jVar.q = strB12;
                        }
                        break;
                    case 17:
                        String strB13 = f4hVar.B();
                        if (strB13 != null) {
                            jVar.h = strB13;
                        }
                        break;
                    case 18:
                        String strB14 = f4hVar.B();
                        if (strB14 != null) {
                            jVar.f21730k = strB14;
                        }
                        break;
                    case 19:
                        String strB15 = f4hVar.B();
                        if (strB15 != null) {
                            jVar.u = strB15;
                        }
                        break;
                    case 20:
                        String strB16 = f4hVar.B();
                        if (strB16 != null) {
                            jVar.i = strB16;
                        }
                        break;
                    case 21:
                        String strB17 = f4hVar.B();
                        if (strB17 != null) {
                            jVar.y = strB17;
                        }
                        break;
                    case 22:
                        String strB18 = f4hVar.B();
                        if (strB18 != null) {
                            jVar.v = strB18;
                        }
                        break;
                    case 23:
                        String strB19 = f4hVar.B();
                        if (strB19 != null) {
                            jVar.n = strB19;
                        }
                        break;
                    case 24:
                        String strB20 = f4hVar.B();
                        if (strB20 != null) {
                            jVar.B = strB20;
                        }
                        break;
                    case 25:
                        List listC = f4hVar.C(iLogger, new k.a());
                        if (listC != null) {
                            jVar.p.addAll(listC);
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            jVar.H(concurrentHashMap);
            f4hVar.endObject();
            return jVar;
        }
    }

    public j(@NotNull File file, @NotNull wzc wzcVar) {
        this(file, yq5.c(), new ArrayList(), wzcVar.getName(), wzcVar.i().toString(), wzcVar.d().k().toString(), "0", 0, "", new Callable() { // from class: zbi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j.E();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public static /* synthetic */ List E() throws Exception {
        return new ArrayList();
    }

    @NotNull
    public String B() {
        return this.w;
    }

    @NotNull
    public File C() {
        return this.f21728a;
    }

    public final boolean D() {
        return this.y.equals("normal") || this.y.equals("timeout") || this.y.equals("backgrounded");
    }

    public void F() {
        try {
            this.l = this.f21729b.call();
        } catch (Throwable unused) {
        }
    }

    public void G(@Nullable String str) {
        this.B = str;
    }

    public void H(@Nullable Map<String, Object> map) {
        this.C = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("android_api_level").j(iLogger, Integer.valueOf(this.c));
        h4hVar.g("device_locale").j(iLogger, this.d);
        h4hVar.g("device_manufacturer").c(this.e);
        h4hVar.g("device_model").c(this.f);
        h4hVar.g("device_os_build_number").c(this.g);
        h4hVar.g("device_os_name").c(this.h);
        h4hVar.g("device_os_version").c(this.i);
        h4hVar.g("device_is_emulator").f(this.j);
        h4hVar.g("architecture").j(iLogger, this.f21730k);
        h4hVar.g("device_cpu_frequencies").j(iLogger, this.l);
        h4hVar.g("device_physical_memory_bytes").c(this.m);
        h4hVar.g("platform").c(this.n);
        h4hVar.g("build_id").c(this.o);
        h4hVar.g("transaction_name").c(this.q);
        h4hVar.g("duration_ns").c(this.f21731r);
        h4hVar.g("version_name").c(this.t);
        h4hVar.g("version_code").c(this.s);
        if (!this.p.isEmpty()) {
            h4hVar.g("transactions").j(iLogger, this.p);
        }
        h4hVar.g("transaction_id").c(this.u);
        h4hVar.g("trace_id").c(this.v);
        h4hVar.g("profile_id").c(this.w);
        h4hVar.g("environment").c(this.x);
        h4hVar.g("truncation_reason").c(this.y);
        if (this.B != null) {
            h4hVar.g("sampled_profile").c(this.B);
        }
        h4hVar.g("measurements").j(iLogger, this.A);
        h4hVar.g("timestamp").j(iLogger, this.z);
        Map<String, Object> map = this.C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.C.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public j() {
        this(new File("dummy"), hvg.s());
    }

    public j(@NotNull File file, @NotNull Date date, @NotNull List<k> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull Callable<List<Integer>> callable, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @NotNull String str13, @NotNull Map<String, io.sentry.profilemeasurements.a> map) {
        this.l = new ArrayList();
        this.B = null;
        this.f21728a = file;
        this.z = date;
        this.f21730k = str5;
        this.f21729b = callable;
        this.c = i;
        this.d = Locale.getDefault().toString();
        this.e = str6 != null ? str6 : "";
        this.f = str7 != null ? str7 : "";
        this.i = str8 != null ? str8 : "";
        this.j = bool != null ? bool.booleanValue() : false;
        this.m = str9 != null ? str9 : "0";
        this.g = "";
        this.h = PluginPackageConstant.RN_DIR_A;
        this.n = PluginPackageConstant.RN_DIR_A;
        this.o = str10 != null ? str10 : "";
        this.p = list;
        this.q = str.isEmpty() ? "unknown" : str;
        this.f21731r = str4;
        this.s = "";
        this.t = str11 != null ? str11 : "";
        this.u = str2;
        this.v = str3;
        this.w = UUID.randomUUID().toString();
        this.x = str12 != null ? str12 : "production";
        this.y = str13;
        if (!D()) {
            this.y = "normal";
        }
        this.A = map;
    }
}
