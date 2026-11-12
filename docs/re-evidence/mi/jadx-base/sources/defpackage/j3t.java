package defpackage;

import com.xiaomi.hm.health.bt.sdk.data.FatBurningData;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.HeartRateInfo;
import com.xiaomi.hm.health.dataprocess.SportData;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class j3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22392b;
    public long c;
    public int d;
    public List<e1t> e;
    public final int f;
    public final int g;
    public final Calendar h;

    public j3t(Calendar calendar, int i, int i2) {
        this.h = calendar;
        this.f = i;
        this.g = i2;
    }

    public String a(e1t e1tVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", this.f22392b);
            jSONObject.put(PaiData.LAST_SYNC_TIME, this.c);
            jSONObject.put(OneTrack.Param.TZ, this.d);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(e1tVar.a(this.f));
            jSONObject.put("metadata", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            t5t.m("DateDataTotal", "format exception:" + e.getMessage());
            return null;
        }
    }

    public List<e1t> b() {
        return this.e;
    }

    public List<FatBurningData> c(qd qdVar) {
        ArrayList arrayList = new ArrayList();
        List<e1t> list = this.e;
        if (list != null && !list.isEmpty()) {
            long timeInMillis = this.h.getTimeInMillis();
            Iterator<e1t> it = this.e.iterator();
            loop0: while (true) {
                long j = 0;
                while (it.hasNext()) {
                    DaySportData daySportDataE = it.next().e();
                    if (daySportDataE == null || daySportDataE.isEmpty() || !daySportDataE.is8Byte()) {
                        t5t.d("DateDataTotal", "daySportData is unuseful!");
                    } else {
                        ArrayList<SportData> datas = daySportDataE.getDatas();
                        long timestamp = daySportDataE.getTimestamp();
                        Iterator<SportData> it2 = datas.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SportData next = it2.next();
                                long timeIndex = (((long) next.getTimeIndex()) * 60000) + timestamp;
                                if (timeIndex >= timeInMillis) {
                                    boolean zH = h(next, qdVar);
                                    if (timeIndex < i() * 1000) {
                                        if (zH && j == 0) {
                                            j = timeIndex;
                                        }
                                        if (!zH && j != 0) {
                                            arrayList.add(new FatBurningData(j, timeIndex - 60000));
                                            j = 0;
                                        }
                                    } else if (j > 0) {
                                        if (!zH) {
                                            timeIndex -= 60000;
                                        }
                                        arrayList.add(new FatBurningData(j, timeIndex));
                                    }
                                }
                            }
                        }
                    }
                }
                break loop0;
            }
        }
        return arrayList;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(long j) {
        this.c = j;
    }

    public void f(String str) {
        this.f22392b = str;
    }

    public void g(List<e1t> list) {
        this.e = list;
    }

    public final boolean h(SportData sportData, qd qdVar) {
        int sportMode = sportData.getSportMode();
        if ((sportMode & 7) > 0 || (sportMode & 8) > 0) {
            return false;
        }
        int hr = sportData.getHR();
        if (!HeartRateInfo.isHRValueValid(hr)) {
            return false;
        }
        if (k(qdVar)) {
            return ((float) hr) >= ((float) (220 - this.g)) * 0.64f || sportData.getStep() > 100;
        }
        return ((float) hr) >= ((float) (220 - this.g)) * 0.6f;
    }

    public long i() {
        return this.c;
    }

    public void j(int i) {
        this.f22391a = i;
    }

    public final boolean k(qd qdVar) {
        return qdVar == qd.I2 || qdVar == qd.K2 || qdVar == qd.J2 || qdVar == qd.M2 || qdVar == qd.G2 || qdVar == qd.H2 || qdVar == qd.L2;
    }

    public int l() {
        return this.d;
    }

    public int m() {
        return this.f22391a;
    }

    public String toString() {
        return "DateDataTotal{error=" + this.f22391a + ", deviceId='" + this.f22392b + "', endTime=" + this.c + ", endTimeTz=" + this.d + ", dateDataList=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
