package io.sentry.protocol;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21813b;

    @Nullable
    public String c;

    @Nullable
    public Integer d;

    @Nullable
    public Integer e;

    @Nullable
    public String f;

    @Nullable
    public String g;

    @Nullable
    public Boolean h;

    @Nullable
    public String i;

    @Nullable
    public Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f21814k;

    @Nullable
    public String l;

    @Nullable
    public String m;

    @Nullable
    public String n;

    @Nullable
    public String o;

    @Nullable
    public Map<String, Object> p;

    @Nullable
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public io.sentry.t f21815r;

    public static final class a implements fsd<t> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            t tVar = new t();
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                byte b2 = -1;
                switch (strNextName.hashCode()) {
                    case -1443345323:
                        if (strNextName.equals("image_addr")) {
                            b2 = 0;
                        }
                        break;
                    case -1184392185:
                        if (strNextName.equals("in_app")) {
                            b2 = 1;
                        }
                        break;
                    case -1113875953:
                        if (strNextName.equals("raw_function")) {
                            b2 = 2;
                        }
                        break;
                    case -1102671691:
                        if (strNextName.equals("lineno")) {
                            b2 = 3;
                        }
                        break;
                    case -1068784020:
                        if (strNextName.equals(RnReportConst.ApiReport.PARAM_MODULE)) {
                            b2 = 4;
                        }
                        break;
                    case -1052618729:
                        if (strNextName.equals("native")) {
                            b2 = 5;
                        }
                        break;
                    case -887523944:
                        if (strNextName.equals("symbol")) {
                            b2 = 6;
                        }
                        break;
                    case -807062458:
                        if (strNextName.equals("package")) {
                            b2 = 7;
                        }
                        break;
                    case -734768633:
                        if (strNextName.equals("filename")) {
                            b2 = 8;
                        }
                        break;
                    case -330260936:
                        if (strNextName.equals("symbol_addr")) {
                            b2 = 9;
                        }
                        break;
                    case 3327275:
                        if (strNextName.equals("lock")) {
                            b2 = 10;
                        }
                        break;
                    case 94842689:
                        if (strNextName.equals("colno")) {
                            b2 = 11;
                        }
                        break;
                    case 410194178:
                        if (strNextName.equals("instruction_addr")) {
                            b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        }
                        break;
                    case 1116694660:
                        if (strNextName.equals("context_line")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                        }
                        break;
                    case 1380938712:
                        if (strNextName.equals("function")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                        }
                        break;
                    case 1713445842:
                        if (strNextName.equals("abs_path")) {
                            b2 = 15;
                        }
                        break;
                    case 1874684019:
                        if (strNextName.equals("platform")) {
                            b2 = 16;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        tVar.l = f4hVar.B();
                        break;
                    case 1:
                        tVar.h = f4hVar.t();
                        break;
                    case 2:
                        tVar.q = f4hVar.B();
                        break;
                    case 3:
                        tVar.d = f4hVar.h0();
                        break;
                    case 4:
                        tVar.c = f4hVar.B();
                        break;
                    case 5:
                        tVar.j = f4hVar.t();
                        break;
                    case 6:
                        tVar.o = f4hVar.B();
                        break;
                    case 7:
                        tVar.i = f4hVar.B();
                        break;
                    case 8:
                        tVar.f21812a = f4hVar.B();
                        break;
                    case 9:
                        tVar.m = f4hVar.B();
                        break;
                    case 10:
                        tVar.f21815r = (io.sentry.t) f4hVar.A(iLogger, new io.sentry.t.a());
                        break;
                    case 11:
                        tVar.e = f4hVar.h0();
                        break;
                    case 12:
                        tVar.n = f4hVar.B();
                        break;
                    case 13:
                        tVar.g = f4hVar.B();
                        break;
                    case 14:
                        tVar.f21813b = f4hVar.B();
                        break;
                    case 15:
                        tVar.f = f4hVar.B();
                        break;
                    case 16:
                        tVar.f21814k = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            tVar.A(concurrentHashMap);
            f4hVar.endObject();
            return tVar;
        }
    }

    public void A(@Nullable Map<String, Object> map) {
        this.p = map;
    }

    @Nullable
    public String r() {
        return this.c;
    }

    public void s(@Nullable String str) {
        this.f21812a = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21812a != null) {
            h4hVar.g("filename").c(this.f21812a);
        }
        if (this.f21813b != null) {
            h4hVar.g("function").c(this.f21813b);
        }
        if (this.c != null) {
            h4hVar.g(RnReportConst.ApiReport.PARAM_MODULE).c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("lineno").i(this.d);
        }
        if (this.e != null) {
            h4hVar.g("colno").i(this.e);
        }
        if (this.f != null) {
            h4hVar.g("abs_path").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("context_line").c(this.g);
        }
        if (this.h != null) {
            h4hVar.g("in_app").k(this.h);
        }
        if (this.i != null) {
            h4hVar.g("package").c(this.i);
        }
        if (this.j != null) {
            h4hVar.g("native").k(this.j);
        }
        if (this.f21814k != null) {
            h4hVar.g("platform").c(this.f21814k);
        }
        if (this.l != null) {
            h4hVar.g("image_addr").c(this.l);
        }
        if (this.m != null) {
            h4hVar.g("symbol_addr").c(this.m);
        }
        if (this.n != null) {
            h4hVar.g("instruction_addr").c(this.n);
        }
        if (this.q != null) {
            h4hVar.g("raw_function").c(this.q);
        }
        if (this.o != null) {
            h4hVar.g("symbol").c(this.o);
        }
        if (this.f21815r != null) {
            h4hVar.g("lock").j(iLogger, this.f21815r);
        }
        Map<String, Object> map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.p.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void t(@Nullable String str) {
        this.f21813b = str;
    }

    public void u(@Nullable Boolean bool) {
        this.h = bool;
    }

    public void v(@Nullable Integer num) {
        this.d = num;
    }

    public void w(@Nullable io.sentry.t tVar) {
        this.f21815r = tVar;
    }

    public void x(@Nullable String str) {
        this.c = str;
    }

    public void y(@Nullable Boolean bool) {
        this.j = bool;
    }

    public void z(@Nullable String str) {
        this.i = str;
    }
}
