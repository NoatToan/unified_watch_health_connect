package com.huawei.hms.scankit.p;

import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.utils.FileUtil;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.wearengine.sensor.DataResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes34.dex */
public final class w3 extends u3 {
    private volatile String h;
    private volatile String i;
    private boolean j;
    private volatile long k;
    public d l;

    public w3(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext().getApplicationContext());
        this.j = false;
        this.l = new d();
        this.f16351b.put("apiName", str);
        if (DetailRect.PHOTO_MODE.equals(str)) {
            this.j = true;
        }
    }

    public c a(boolean z, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.j) {
                return new c(jCurrentTimeMillis, new a("yyyyMMddHHmmss.SSS").format(Long.valueOf(jCurrentTimeMillis)), UUID.randomUUID().toString(), z, i, 0, null);
            }
            if (jCurrentTimeMillis - this.k > ProfileExtendConstants.TIME_OUT) {
                String str = new b("yyyyMMddHHmmss.SSS").format(Long.valueOf(jCurrentTimeMillis));
                String string = UUID.randomUUID().toString();
                if (jCurrentTimeMillis - this.k > ProfileExtendConstants.TIME_OUT) {
                    this.h = str;
                    this.i = string;
                    this.k = jCurrentTimeMillis;
                }
            }
            return new c(jCurrentTimeMillis, this.h, this.i, z, i, 0, null);
        } catch (Exception unused) {
            o4.b("HaLog6001", "exception happens");
            return new c(jCurrentTimeMillis, this.h, this.i, z, i, 0, null);
        }
    }

    class a extends SimpleDateFormat {
        a(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        }
    }

    class b extends SimpleDateFormat {
        b(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        }
    }

    public void a(HmsScan[] hmsScanArr, c cVar) {
        try {
            String str = u3.d;
            String strB = u3.e;
            if (a()) {
                boolean z = false;
                int i = 0;
                z = false;
                if (hmsScanArr != null && hmsScanArr.length > 0) {
                    int length = hmsScanArr.length;
                    while (i < length) {
                        HmsScan hmsScan = hmsScanArr[i];
                        String strA = u3.a(hmsScan.scanType);
                        i++;
                        strB = u3.b(hmsScan.scanTypeForm);
                        str = strA;
                    }
                    z = true;
                }
                this.l.a(cVar.a(System.currentTimeMillis()).a(z).a(str).b(strB));
                this.k = cVar.e;
            }
        } catch (NullPointerException unused) {
            o4.b("HaLog60001", "nullPoint");
        } catch (Exception unused2) {
            o4.b("HaLog60001", "logEnd Exception");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f16384c;
        private long d;
        private long e;
        private String f;
        private String g;
        private boolean h;
        private int i;
        private boolean j;

        private c(long j, String str, String str2, boolean z, int i, int i2) {
            this.d = j;
            this.f16383b = str;
            this.f16384c = str2;
            this.h = z;
            this.i = i;
            this.f16382a = i2;
        }

        /* synthetic */ c(long j, String str, String str2, boolean z, int i, int i2, a aVar) {
            this(j, str, str2, z, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c b(String str) {
            this.g = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(long j) {
            this.e = j;
            return this;
        }

        public c a(int i) {
            this.f16382a = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(boolean z) {
            this.j = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(String str) {
            this.f = str;
            return this;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f16385a = d.class.getSimpleName();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Timer f16386b = new Timer();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f16387c = true;
        private List d = new ArrayList(10);
        private List e = new ArrayList(10);

        public d() {
        }

        class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    d.this.f16387c = true;
                    d.this.a();
                } catch (Exception unused) {
                    o4.b(d.this.f16385a, "onLog Exception");
                }
            }
        }

        class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private StringBuilder f16389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private AtomicInteger[] f16390b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String[] f16391c;
            private long[] d;

            private b() {
                this.f16389a = new StringBuilder(100);
                this.f16390b = new AtomicInteger[]{new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger()};
                this.f16391c = new String[]{"lt10K:", "lt100K:", "lt1M:", "lt3M:", "lt10M:", "lt40M:", "gt40M:"};
                this.d = new long[]{FileUtil.LOCAL_REPORT_FILE_MAX_SIZE, 102400, 1048576, 3145728, 10485760, 41943040, Long.MAX_VALUE};
            }

            /* synthetic */ b(d dVar, a aVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i) {
                int i2 = 0;
                while (true) {
                    AtomicInteger[] atomicIntegerArr = this.f16390b;
                    if (i2 >= atomicIntegerArr.length) {
                        return;
                    }
                    if (i <= this.d[i2]) {
                        atomicIntegerArr[i2].addAndGet(1);
                        return;
                    }
                    i2++;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String a() {
                StringBuilder sb = this.f16389a;
                sb.delete(0, sb.length());
                this.f16389a.append("{");
                for (int i = 0; i < this.f16390b.length; i++) {
                    this.f16389a.append(this.f16391c[i]);
                    this.f16389a.append(this.f16390b[i]);
                    this.f16389a.append(",");
                }
                StringBuilder sb2 = this.f16389a;
                sb2.replace(sb2.length() - 1, this.f16389a.length(), "}");
                return this.f16389a.toString();
            }
        }

        class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private StringBuilder f16392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private SparseArray f16393b;

            private c() {
                this.f16392a = new StringBuilder(60);
                this.f16393b = new a();
            }

            class a extends SparseArray {
                a() {
                    put(0, new AtomicInteger());
                }
            }

            class b extends AtomicInteger {
                b() {
                    addAndGet(1);
                }
            }

            /* synthetic */ c(d dVar, a aVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i) {
                if (this.f16393b.get(i) == null) {
                    this.f16393b.put(i, new b());
                } else {
                    ((AtomicInteger) this.f16393b.get(i)).addAndGet(1);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String a() {
                StringBuilder sb = this.f16392a;
                sb.delete(0, sb.length());
                this.f16392a.append("{");
                for (int i = 0; i < this.f16393b.size(); i++) {
                    this.f16392a.append(this.f16393b.keyAt(i));
                    this.f16392a.append(":");
                    this.f16392a.append(this.f16393b.valueAt(i));
                    this.f16392a.append(",");
                }
                StringBuilder sb2 = this.f16392a;
                sb2.replace(sb2.length() - 1, this.f16392a.length(), "}");
                return this.f16392a.toString();
            }
        }

        public void b() {
            Timer timer = this.f16386b;
            if (timer != null) {
                timer.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            if (this.d.size() > 100) {
                return;
            }
            synchronized (this) {
                this.d.add(cVar);
                if (this.f16387c) {
                    this.f16387c = false;
                    this.f16386b.schedule(new a(), 1000L);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void a(List list) {
            HashSet<String> hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((c) it.next()).f16384c);
            }
            for (String str : hashSet) {
                Boolean boolValueOf = null;
                c cVar = new c(this, 0 == true ? 1 : 0);
                b bVar = new b(this, 0 == true ? 1 : 0);
                Iterator it2 = list.iterator();
                String str2 = "";
                long j = Long.MAX_VALUE;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = Long.MIN_VALUE;
                String str3 = "";
                String str4 = str3;
                while (it2.hasNext()) {
                    c cVar2 = (c) it2.next();
                    str2 = cVar2.f16383b;
                    str3 = cVar2.f;
                    str4 = cVar2.g;
                    boolean z = cVar2.h;
                    j2 += cVar2.e - cVar2.d;
                    cVar.a(cVar2.f16382a);
                    bVar.a(cVar2.i);
                    j3++;
                    if (cVar2.j) {
                        j4++;
                    }
                    if (cVar2.f16382a != 0) {
                        j5++;
                    }
                    if (cVar2.e - cVar2.d < j) {
                        j = cVar2.e - cVar2.d;
                    }
                    if (cVar2.e - cVar2.d > j6) {
                        j6 = cVar2.e - cVar2.d;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                w3.this.g();
                linkedHashMap.putAll(w3.this.f16351b);
                linkedHashMap.put("result", cVar.a());
                linkedHashMap.put("imgSizeHistogram", bVar.a());
                linkedHashMap.put("callTime", str2);
                linkedHashMap.put("transId", str);
                if (j3 != 0) {
                    j2 /= j3;
                }
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(j2));
                linkedHashMap.put("allCnt", String.valueOf(j3));
                linkedHashMap.put("failCnt", String.valueOf(j5));
                linkedHashMap.put("codeCnt", String.valueOf(j4));
                linkedHashMap.put("scanType", str3);
                linkedHashMap.put("sceneType", str4);
                linkedHashMap.put("min", String.valueOf(j));
                linkedHashMap.put("max", String.valueOf(j6));
                linkedHashMap.put("algPhotoMode", String.valueOf(boolValueOf));
                a4.b().b("60001", linkedHashMap);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.d.size() > 0) {
                synchronized (this) {
                    List list = this.d;
                    List list2 = this.e;
                    this.d = list2;
                    this.e = list;
                    list2.clear();
                }
                a(this.e);
            }
        }
    }

    public void a(String str) {
        this.f16351b.put("algapi", str);
    }
}
