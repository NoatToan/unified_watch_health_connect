package defpackage;

import android.util.Base64;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ogt f16175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i[] f16176b;
    public int c;
    public DaySportData d;

    public e1t(ogt ogtVar, i iVar) {
        this.f16175a = ogtVar;
        this.c = iVar.b();
        DaySportData daySportData = new DaySportData(new SportDay(ogtVar.e(), ogtVar.c(), ogtVar.a()));
        this.d = daySportData;
        if (this.c <= 4) {
            this.c = 4;
            l[] lVarArr = new l[1440];
            this.f16176b = lVarArr;
            Arrays.fill(lVarArr, new l((byte) 0, (byte) 0, (byte) -2, (byte) 0));
            return;
        }
        daySportData.set8Byte(true);
        this.f16176b = new j[1440];
        int i = this.c;
        byte[] bArr = new byte[i];
        bArr[0] = -2;
        Arrays.fill(bArr, 1, i, (byte) 0);
        Arrays.fill(this.f16176b, new j(bArr));
    }

    public JSONObject a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DialWidgetType.DATE, d().b());
            int iF = f();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StepsInfo.KEY_STEPS, iF);
            jSONObject2.put(StepsInfo.KEY_STEP_INFO, jSONObject3);
            jSONObject.put("summary", this.d.getSummary(i));
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(StatConstants.PARAM_START, 0);
            jSONObject4.put(BroadcastsKt.SILENT_PUSHING_STOP, 1439);
            jSONObject4.put("value", Base64.encodeToString(c(), 2));
            jSONArray.put(jSONObject4);
            jSONObject.put("data", jSONArray);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void b(int i, i iVar) {
        SportData sportData;
        this.f16176b[i] = iVar;
        if (this.d.is8Byte()) {
            j jVar = (j) iVar;
            sportData = new SportData(i, iVar.v & 255, iVar.t & 255, iVar.u & 255, iVar.w & 255, jVar.c() & 255, jVar.d() & 255, jVar.e() & 255, jVar.f() & 255);
        } else {
            sportData = new SportData(i, iVar.v & 255, iVar.t & 255, iVar.u & 255, iVar.w & 255);
        }
        this.d.add(sportData);
    }

    public byte[] c() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.c * 1440).order(ByteOrder.LITTLE_ENDIAN);
        for (i iVar : this.f16176b) {
            byteBufferOrder.put(iVar.a());
        }
        return byteBufferOrder.array();
    }

    public ogt d() {
        return this.f16175a;
    }

    public DaySportData e() {
        return this.d;
    }

    public int f() {
        int i = 0;
        for (i iVar : this.f16176b) {
            i += iVar.u;
        }
        return i;
    }
}
