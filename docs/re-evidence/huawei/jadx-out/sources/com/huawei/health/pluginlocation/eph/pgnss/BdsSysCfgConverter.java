package com.huawei.health.pluginlocation.eph.pgnss;

import com.amap.api.services.district.DistrictSearchQuery;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.grn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class BdsSysCfgConverter {

    interface BdsSysCfgItem {
        public static final String EMPTY = "";
        public static final int FACTOR = 100000;
        public static final int ZERO = 0;

        default void inputFromJson(JsonArray jsonArray) {
        }

        default void inputFromJson(JsonObject jsonObject) {
        }

        default int outPutToByteBuffer(ByteBuffer byteBuffer) {
            return 0;
        }
    }

    static class g implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8615b;
        private int e;

        g() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            if (jsonObject == null) {
                return;
            }
            this.f8615b = jsonObject.get("freqType") != null ? jsonObject.get("freqType").getAsInt() : 0;
            this.f8614a = jsonObject.get("syncSeq") != null ? jsonObject.get("syncSeq").getAsInt() : 0;
            this.e = jsonObject.get("dataSeq") != null ? jsonObject.get("dataSeq").getAsInt() : 0;
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(this.f8615b);
            byteBuffer.putInt(this.f8614a);
            byteBuffer.putInt(this.e);
            return byteBuffer.position() - iPosition;
        }
    }

    static class h implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8616a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8618c;
        private int d;
        private int e;
        private String g = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g[] f8617b = new g[5];

        h() {
            int i = 0;
            while (true) {
                g[] gVarArr = this.f8617b;
                if (i >= gVarArr.length) {
                    return;
                }
                gVarArr[i] = new g();
                i++;
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            JsonElement jsonElement;
            if (jsonObject == null || (jsonElement = jsonObject.get("inChanCommInfo")) == null || !jsonElement.isJsonObject()) {
                return;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            this.e = asJsonObject.get("inFeqTypeSupp") != null ? asJsonObject.get("inFeqTypeSupp").getAsInt() : 0;
            this.d = asJsonObject.get("inPilotRatio") != null ? asJsonObject.get("inPilotRatio").getAsInt() : 0;
            this.f8618c = asJsonObject.get("inPilotSeq") != null ? asJsonObject.get("inPilotSeq").getAsInt() : 0;
            this.g = asJsonObject.get("inSyncSymbol") != null ? asJsonObject.get("inSyncSymbol").getAsString() : "";
            JsonElement jsonElement2 = asJsonObject.get("inSpreadSpecSeq");
            if (jsonElement2 == null || !jsonElement2.isJsonArray()) {
                return;
            }
            Iterator<JsonElement> it = jsonElement2.getAsJsonArray().iterator();
            while (it.hasNext()) {
                this.f8617b[this.f8616a].inputFromJson(it.next().getAsJsonObject());
                int i = this.f8616a + 1;
                this.f8616a = i;
                if (i >= this.f8617b.length) {
                    return;
                }
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(this.e);
            byteBuffer.putInt(this.d);
            byteBuffer.putInt(this.f8618c);
            byteBuffer.put(Arrays.copyOf(this.g.getBytes(StandardCharsets.UTF_8), 56));
            byteBuffer.putInt(this.f8616a);
            int i = 0;
            while (true) {
                g[] gVarArr = this.f8617b;
                if (i < gVarArr.length) {
                    gVarArr[i].outPutToByteBuffer(byteBuffer);
                    i++;
                } else {
                    return byteBuffer.position() - iPosition;
                }
            }
        }
    }

    static class j implements BdsSysCfgItem {
        private int e;

        j() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            JsonElement jsonElement = jsonObject.get("outChanCommInfo");
            if (jsonElement == null || !jsonElement.isJsonObject()) {
                return;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            this.e = asJsonObject.get("outCodeMode") != null ? asJsonObject.get("outCodeMode").getAsInt() : 0;
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(this.e);
            return byteBuffer.position() - iPosition;
        }
    }

    static class c implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8609a;
        private double d;
        private int e;

        c() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            if (jsonObject == null) {
                return;
            }
            this.e = jsonObject.get("svid") != null ? jsonObject.get("svid").getAsInt() : 0;
            this.f8609a = jsonObject.get("prn") != null ? jsonObject.get("prn").getAsInt() : 0;
            this.d = jsonObject.get("fixDelayOffset") != null ? jsonObject.get("fixDelayOffset").getAsDouble() : 0.0d;
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(this.e);
            byteBuffer.putInt(this.f8609a);
            byteBuffer.putInt((int) (this.d * 100000.0d));
            return byteBuffer.position() - iPosition;
        }
    }

    static class e implements BdsSysCfgItem {
        private c[] d = new c[20];
        private int e;

        e() {
            int i = 0;
            while (true) {
                c[] cVarArr = this.d;
                if (i >= cVarArr.length) {
                    return;
                }
                cVarArr[i] = new c();
                i++;
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            JsonElement jsonElement = jsonObject.get("beamChanInfo");
            if (jsonElement == null || !jsonElement.isJsonArray()) {
                return;
            }
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                this.d[this.e].inputFromJson(it.next().getAsJsonObject());
                int i = this.e + 1;
                this.e = i;
                if (i >= this.d.length) {
                    return;
                }
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(this.e);
            int i = 0;
            while (true) {
                c[] cVarArr = this.d;
                if (i < cVarArr.length) {
                    cVarArr[i].outPutToByteBuffer(byteBuffer);
                    i++;
                } else {
                    return byteBuffer.position() - iPosition;
                }
            }
        }
    }

    static class i implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f8620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8621c;
        private int[] d = new int[3];
        private double e;

        i() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            if (jsonObject == null) {
                return;
            }
            this.f8621c = jsonObject.get(DistrictSearchQuery.KEYWORDS_CITY) != null ? jsonObject.get(DistrictSearchQuery.KEYWORDS_CITY).getAsString() : "";
            this.e = jsonObject.get(JsbMapKeyNames.H5_LOC_LON) != null ? jsonObject.get(JsbMapKeyNames.H5_LOC_LON).getAsDouble() : 0.0d;
            this.f8620b = jsonObject.get(JsbMapKeyNames.H5_LOC_LAT) != null ? jsonObject.get(JsbMapKeyNames.H5_LOC_LAT).getAsDouble() : 0.0d;
            JsonElement jsonElement = jsonObject.get("beamInfo");
            if (jsonElement.isJsonArray()) {
                Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    this.d[this.f8619a] = it.next().getAsInt();
                    int i = this.f8619a + 1;
                    this.f8619a = i;
                    if (i >= this.d.length) {
                        return;
                    }
                }
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.put(Arrays.copyOf(this.f8621c.getBytes(StandardCharsets.UTF_8), 24));
            byteBuffer.putInt((int) (this.e * 100000.0d));
            byteBuffer.putInt((int) (this.f8620b * 100000.0d));
            int i = 0;
            while (true) {
                int[] iArr = this.d;
                if (i < iArr.length) {
                    byteBuffer.putInt(iArr[i]);
                    i++;
                } else {
                    return byteBuffer.position() - iPosition;
                }
            }
        }
    }

    static class f implements BdsSysCfgItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<i> f8613b = new ArrayList();
        private double e;

        f() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            JsonObject asJsonObject;
            JsonElement jsonElement = jsonObject.get("cityCoverInfo");
            if (jsonElement == null || !jsonElement.isJsonArray()) {
                return;
            }
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            if (asJsonArray.size() >= 1 && (asJsonObject = asJsonArray.get(0).getAsJsonObject()) != null) {
                this.e = asJsonObject.get("distanceThreshold") != null ? asJsonObject.get("distanceThreshold").getAsDouble() : 0.0d;
                JsonElement jsonElement2 = asJsonObject.get("cityList");
                if (jsonElement2.isJsonArray()) {
                    for (JsonElement jsonElement3 : jsonElement2.getAsJsonArray()) {
                        i iVar = new i();
                        iVar.inputFromJson(jsonElement3.getAsJsonObject());
                        this.f8613b.add(iVar);
                    }
                }
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt((int) this.e);
            byteBuffer.putInt(this.f8613b.size());
            Iterator<i> it = this.f8613b.iterator();
            while (it.hasNext()) {
                it.next().outPutToByteBuffer(byteBuffer);
            }
            return byteBuffer.position() - iPosition;
        }
    }

    static class o implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f8622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f8623b;

        o() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonArray jsonArray) {
            JsonArray asJsonArray = jsonArray.getAsJsonArray();
            if (asJsonArray.size() >= 2) {
                this.f8622a = asJsonArray.get(0).getAsDouble();
                this.f8623b = asJsonArray.get(1).getAsDouble();
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt((int) (this.f8622a * 100000.0d));
            byteBuffer.putInt((int) (this.f8623b * 100000.0d));
            return byteBuffer.position() - iPosition;
        }
    }

    static class b implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8608c;
        private int d;
        private List<o> e = new ArrayList();

        b() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            if (jsonObject == null) {
                return;
            }
            this.f8606a = jsonObject.get("svid") != null ? jsonObject.get("svid").getAsInt() : 0;
            this.f8608c = jsonObject.get("prn") != null ? jsonObject.get("prn").getAsInt() : 0;
            JsonElement jsonElement = jsonObject.get("position");
            if (jsonElement.isJsonArray()) {
                for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                    o oVar = new o();
                    oVar.inputFromJson(jsonElement2.getAsJsonArray());
                    this.e.add(oVar);
                }
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(this.f8606a);
            byteBuffer.putInt(this.f8608c);
            byteBuffer.putInt(this.d);
            byteBuffer.putInt(this.f8607b);
            return byteBuffer.position() - iPosition;
        }

        public void d(List<o> list) {
            this.d = list.size();
            list.addAll(this.e);
            this.f8607b = this.e.size();
        }
    }

    static class d implements BdsSysCfgItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b[] f8610a = new b[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<o> f8612c;

        d() {
            int i = 0;
            while (true) {
                b[] bVarArr = this.f8610a;
                if (i < bVarArr.length) {
                    bVarArr[i] = new b();
                    i++;
                } else {
                    this.f8612c = new ArrayList();
                    return;
                }
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            JsonElement jsonElement = jsonObject.get("serviceAreaSuggest");
            if (jsonElement == null || !jsonElement.isJsonArray()) {
                return;
            }
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                this.f8610a[this.f8611b].inputFromJson(it.next().getAsJsonObject());
                this.f8611b++;
            }
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            int i;
            int iPosition = byteBuffer.position();
            int i2 = 0;
            while (true) {
                i = this.f8611b;
                if (i2 >= i) {
                    break;
                }
                this.f8610a[i2].d(this.f8612c);
                i2++;
            }
            byteBuffer.putInt(i);
            int i3 = 0;
            while (true) {
                b[] bVarArr = this.f8610a;
                if (i3 >= bVarArr.length) {
                    break;
                }
                bVarArr[i3].outPutToByteBuffer(byteBuffer);
                i3++;
            }
            byteBuffer.putInt(this.f8612c.size());
            for (int i4 = 0; i4 < this.f8612c.size(); i4++) {
                this.f8612c.get(i4).outPutToByteBuffer(byteBuffer);
            }
            return byteBuffer.position() - iPosition;
        }
    }

    static class a implements BdsSysCfgItem {
        private long e;
        private long g;
        private String i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f8604b = new h();
        private j f = new j();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f8603a = new e();
        private f d = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f8605c = new d();

        a() {
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public void inputFromJson(JsonObject jsonObject) {
            if (jsonObject == null) {
                return;
            }
            this.i = jsonObject.get("version") != null ? jsonObject.get("version").getAsString() : "";
            this.g = jsonObject.get("releaseTime") != null ? jsonObject.get("releaseTime").getAsLong() : 0L;
            this.e = jsonObject.get("effectiveTime") != null ? jsonObject.get("effectiveTime").getAsLong() : 0L;
            this.f8604b.inputFromJson(jsonObject);
            this.f.inputFromJson(jsonObject);
            this.f8603a.inputFromJson(jsonObject);
            this.d.inputFromJson(jsonObject);
            this.f8605c.inputFromJson(jsonObject);
        }

        @Override // com.huawei.health.pluginlocation.eph.pgnss.BdsSysCfgConverter.BdsSysCfgItem
        public int outPutToByteBuffer(ByteBuffer byteBuffer) {
            byteBuffer.putInt(-1111638595);
            byteBuffer.mark();
            byteBuffer.putInt(0);
            byteBuffer.put(Arrays.copyOf(this.i.getBytes(StandardCharsets.UTF_8), 8));
            byteBuffer.putLong(this.g);
            byteBuffer.putLong(this.e);
            int iPosition = byteBuffer.position();
            int iOutPutToByteBuffer = this.f8604b.outPutToByteBuffer(byteBuffer);
            int iOutPutToByteBuffer2 = this.f.outPutToByteBuffer(byteBuffer);
            int iOutPutToByteBuffer3 = iPosition + iOutPutToByteBuffer + iOutPutToByteBuffer2 + this.f8603a.outPutToByteBuffer(byteBuffer) + this.d.outPutToByteBuffer(byteBuffer) + this.f8605c.outPutToByteBuffer(byteBuffer);
            byteBuffer.reset();
            byteBuffer.putInt(iOutPutToByteBuffer3);
            return iOutPutToByteBuffer3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileOutputStream] */
    public static void c(String str, String str2) throws Throwable {
        JsonElement jsonElement;
        ?? fileOutputStream;
        grn.d("BdsSysCfgConverter", "convertBdsSysCfgJsonToBin start");
        try {
            JsonElement jsonElement2 = new JsonParser().parse(new InputStreamReader(new FileInputStream(str), StandardCharsets.UTF_8)).getAsJsonObject().get("bdsPara");
            if (jsonElement2 == null || !jsonElement2.isJsonPrimitive() || (jsonElement = new JsonParser().parse(jsonElement2.getAsString())) == null || !jsonElement.isJsonObject()) {
                return;
            }
            a aVar = new a();
            aVar.inputFromJson(jsonElement.getAsJsonObject());
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32768);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            int iOutPutToByteBuffer = aVar.outPutToByteBuffer(byteBufferAllocate);
            ?? r4 = 0;
            ?? r5 = 0;
            try {
                try {
                    File file = new File(str2);
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        boolean zExists = file.exists();
                        if (!zExists) {
                            file.createNewFile();
                        }
                        fileOutputStream.write(byteBufferAllocate.array(), 0, iOutPutToByteBuffer);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused) {
                            grn.c("BdsSysCfgConverter", "convertBdsSysCfgJsonToBin IOException 2");
                            r4 = zExists;
                        }
                    } catch (IOException unused2) {
                        r5 = fileOutputStream;
                        grn.c("BdsSysCfgConverter", "convertBdsSysCfgJsonToBin IOException 1");
                        r4 = r5;
                        if (r5 != 0) {
                            try {
                                r5.close();
                                r4 = r5;
                            } catch (IOException unused3) {
                                grn.c("BdsSysCfgConverter", "convertBdsSysCfgJsonToBin IOException 2");
                                r4 = r5;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != 0) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                                grn.c("BdsSysCfgConverter", "convertBdsSysCfgJsonToBin IOException 2");
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = r4;
                }
            } catch (IOException unused5) {
            }
        } catch (FileNotFoundException unused6) {
            grn.c("BdsSysCfgConverter", "convertBdsSysCfgJsonToBin FileNotFoundException");
        }
    }
}
