package io.sentry.protocol;

import defpackage.a5n;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.qkp;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class w extends io.sentry.o implements cud {

    @Nullable
    public String p;

    @NotNull
    public Double q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Double f21821r;

    @NotNull
    public final List<s> s;

    @NotNull
    public final String t;

    @NotNull
    public final Map<String, f> u;

    @Nullable
    public Map<String, List<i>> v;

    @NotNull
    public x w;

    @Nullable
    public Map<String, Object> x;

    public static final class a implements fsd<w> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            w wVar = new w("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), null, new x(TransactionNameSource.CUSTOM.apiName()));
            io.sentry.o.a aVar = new io.sentry.o.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "start_timestamp":
                        try {
                            Double dW = f4hVar.W();
                            if (dW != null) {
                                wVar.q = dW;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateR = f4hVar.r(iLogger);
                            if (dateR != null) {
                                wVar.q = Double.valueOf(yq5.b(dateR));
                            }
                            break;
                        }
                        break;
                    case "_metrics_summary":
                        wVar.v = f4hVar.e0(iLogger, new i.a());
                        break;
                    case "measurements":
                        Map mapV = f4hVar.v(iLogger, new f.a());
                        if (mapV != null) {
                            wVar.u.putAll(mapV);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        f4hVar.nextString();
                        break;
                    case "timestamp":
                        try {
                            Double dW2 = f4hVar.W();
                            if (dW2 != null) {
                                wVar.f21821r = dW2;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateR2 = f4hVar.r(iLogger);
                            if (dateR2 != null) {
                                wVar.f21821r = Double.valueOf(yq5.b(dateR2));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listC = f4hVar.C(iLogger, new s.a());
                        if (listC != null) {
                            wVar.s.addAll(listC);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        wVar.w = new x.a().a(f4hVar, iLogger);
                        break;
                    case "transaction":
                        wVar.p = f4hVar.B();
                        break;
                    default:
                        if (aVar.a(wVar, strNextName, f4hVar, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                            break;
                        }
                        break;
                }
            }
            wVar.t0(concurrentHashMap);
            f4hVar.endObject();
            return wVar;
        }
    }

    public w(@NotNull io.sentry.u uVar) {
        super(uVar.i());
        this.s = new ArrayList();
        this.t = "transaction";
        this.u = new HashMap();
        io.sentry.util.p.c(uVar, "sentryTracer is required");
        this.q = Double.valueOf(yq5.l(uVar.r().h()));
        this.f21821r = Double.valueOf(yq5.l(uVar.r().e(uVar.q())));
        this.p = uVar.getName();
        for (a5n a5nVar : uVar.E()) {
            if (Boolean.TRUE.equals(a5nVar.G())) {
                this.s.add(new s(a5nVar));
            }
        }
        Contexts contextsC = C();
        contextsC.putAll(uVar.F());
        io.sentry.v vVarD = uVar.d();
        contextsC.setTrace(new io.sentry.v(vVarD.k(), vVarD.h(), vVarD.d(), vVarD.b(), vVarD.a(), vVarD.g(), vVarD.i(), vVarD.c()));
        for (Map.Entry<String, String> entry : vVarD.j().entrySet()) {
            d0(entry.getKey(), entry.getValue());
        }
        Map<String, Object> mapG = uVar.G();
        if (mapG != null) {
            for (Map.Entry<String, Object> entry2 : mapG.entrySet()) {
                W(entry2.getKey(), entry2.getValue());
            }
        }
        this.w = new x(uVar.k().apiName());
        io.sentry.metrics.d dVarH = uVar.H();
        if (dVarH != null) {
            this.v = dVarH.a();
        } else {
            this.v = null;
        }
    }

    @NotNull
    private BigDecimal n0(@NotNull Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @NotNull
    public Map<String, f> o0() {
        return this.u;
    }

    @Nullable
    public qkp p0() {
        io.sentry.v trace = C().getTrace();
        if (trace == null) {
            return null;
        }
        return trace.g();
    }

    @NotNull
    public List<s> q0() {
        return this.s;
    }

    public boolean r0() {
        return this.f21821r != null;
    }

    public boolean s0() {
        qkp qkpVarP0 = p0();
        if (qkpVarP0 == null) {
            return false;
        }
        return qkpVarP0.d().booleanValue();
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.p != null) {
            h4hVar.g("transaction").c(this.p);
        }
        h4hVar.g("start_timestamp").j(iLogger, n0(this.q));
        if (this.f21821r != null) {
            h4hVar.g("timestamp").j(iLogger, n0(this.f21821r));
        }
        if (!this.s.isEmpty()) {
            h4hVar.g("spans").j(iLogger, this.s);
        }
        h4hVar.g("type").c("transaction");
        if (!this.u.isEmpty()) {
            h4hVar.g("measurements").j(iLogger, this.u);
        }
        Map<String, List<i>> map = this.v;
        if (map != null && !map.isEmpty()) {
            h4hVar.g("_metrics_summary").j(iLogger, this.v);
        }
        h4hVar.g("transaction_info").j(iLogger, this.w);
        new io.sentry.o.b().a(this, h4hVar, iLogger);
        Map<String, Object> map2 = this.x;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.x.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void t0(@Nullable Map<String, Object> map) {
        this.x = map;
    }

    @ApiStatus.Internal
    public w(@Nullable String str, @NotNull Double d, @Nullable Double d2, @NotNull List<s> list, @NotNull Map<String, f> map, @Nullable Map<String, List<i>> map2, @NotNull x xVar) {
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        this.t = "transaction";
        HashMap map3 = new HashMap();
        this.u = map3;
        this.p = str;
        this.q = d;
        this.f21821r = d2;
        arrayList.addAll(list);
        map3.putAll(map);
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            this.u.putAll(it.next().c());
        }
        this.w = xVar;
        this.v = map2;
    }
}
