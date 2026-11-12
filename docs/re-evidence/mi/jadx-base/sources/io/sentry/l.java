package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f21734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<? extends io.sentry.rrweb.b> f21735b;

    @Nullable
    public Map<String, Object> c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f21737b;

        static {
            int[] iArr = new int[RRWebEventType.values().length];
            f21737b = iArr;
            try {
                iArr[RRWebEventType.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21737b[RRWebEventType.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21737b[RRWebEventType.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RRWebIncrementalSnapshotEvent.IncrementalSource.values().length];
            f21736a = iArr2;
            try {
                iArr2[RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21736a[RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b implements fsd<l> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            l lVar = new l();
            f4hVar.beginObject();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numH0 = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("segment_id")) {
                    numH0 = f4hVar.h0();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            f4hVar.endObject();
            f4hVar.setLenient(true);
            List list = (List) f4hVar.q0();
            f4hVar.setLenient(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.o oVar = new io.sentry.util.o(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                RRWebEventType rRWebEventType = RRWebEventType.values()[((Integer) value).intValue()];
                                int i = a.f21737b[rRWebEventType.ordinal()];
                                if (i == 1) {
                                    Map mapEmptyMap = (Map) map2.get("data");
                                    if (mapEmptyMap == null) {
                                        mapEmptyMap = Collections.emptyMap();
                                    }
                                    Integer num = (Integer) mapEmptyMap.get("source");
                                    if (num != null) {
                                        RRWebIncrementalSnapshotEvent.IncrementalSource incrementalSource = RRWebIncrementalSnapshotEvent.IncrementalSource.values()[num.intValue()];
                                        int i2 = a.f21736a[incrementalSource.ordinal()];
                                        if (i2 == 1) {
                                            arrayList.add(new RRWebInteractionEvent.a().a(oVar, iLogger));
                                        } else if (i2 != 2) {
                                            iLogger.c(SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", incrementalSource);
                                        } else {
                                            arrayList.add(new io.sentry.rrweb.c.a().a(oVar, iLogger));
                                        }
                                    }
                                } else if (i == 2) {
                                    arrayList.add(new io.sentry.rrweb.d.a().a(oVar, iLogger));
                                } else if (i != 3) {
                                    iLogger.c(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                } else {
                                    Map mapEmptyMap2 = (Map) map2.get("data");
                                    if (mapEmptyMap2 == null) {
                                        mapEmptyMap2 = Collections.emptyMap();
                                    }
                                    String str2 = (String) mapEmptyMap2.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new io.sentry.rrweb.e.a().a(oVar, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(new io.sentry.rrweb.f.a().a(oVar, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new io.sentry.rrweb.a.C0971a().a(oVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            lVar.c(numH0);
            lVar.b(arrayList);
            lVar.d(map);
            return lVar;
        }
    }

    @Nullable
    public List<? extends io.sentry.rrweb.b> a() {
        return this.f21735b;
    }

    public void b(@Nullable List<? extends io.sentry.rrweb.b> list) {
        this.f21735b = list;
    }

    public void c(@Nullable Integer num) {
        this.f21734a = num;
    }

    public void d(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return io.sentry.util.p.a(this.f21734a, lVar.f21734a) && io.sentry.util.p.a(this.f21735b, lVar.f21735b);
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21734a, this.f21735b);
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21734a != null) {
            h4hVar.g("segment_id").i(this.f21734a);
        }
        Map<String, Object> map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.c.get(str));
            }
        }
        h4hVar.endObject();
        h4hVar.setLenient(true);
        if (this.f21734a != null) {
            h4hVar.h("\n");
        }
        List<? extends io.sentry.rrweb.b> list = this.f21735b;
        if (list != null) {
            h4hVar.j(iLogger, list);
        }
        h4hVar.setLenient(false);
    }
}
