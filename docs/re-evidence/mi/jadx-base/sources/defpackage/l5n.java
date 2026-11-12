package defpackage;

import android.text.TextUtils;
import com.miot.spec.entity.SpecValueType;
import com.miot.spec.exception.NotSupportValueException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24698b;
    public List<q5n> c;

    public l5n(int i, int i2, List<q5n> list) {
        this.f24697a = i2;
        this.f24698b = i;
        this.c = list;
    }

    public static l5n d(String str) throws NotSupportValueException {
        n5n.b("SepcAction", "parseJson ,json =" + str, new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("siid", -1);
            if (iOptInt < 1 || iOptInt > 255) {
                throw new NotSupportValueException(-1009, "parse action json, but service id out of [1,255]!!!");
            }
            int iOptInt2 = jSONObject.optInt("aiid", -1);
            if (iOptInt2 < 1 || iOptInt2 > 255) {
                throw new NotSupportValueException(-1012, "parse action json, but action id out of [1,255]!!!");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("objects");
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    int iOptInt3 = jSONObject2.optInt("piid", -1);
                    if (iOptInt3 < 1 || iOptInt3 > SpecValueType.UINT16.getMaxValue()) {
                        throw new NotSupportValueException(-1010, "parse action json, but property id out of [1,65535]!!!");
                    }
                    int iOptInt4 = jSONObject2.optInt("type", -1);
                    if (iOptInt4 == -1) {
                        throw new NotSupportValueException(-1013, "parse action json, but data type  is empty!!!");
                    }
                    SpecValueType specValueTypeConvert2ValueType = SpecValueType.convert2ValueType(iOptInt4);
                    Object objOpt = jSONObject2.opt("value");
                    if (objOpt == null) {
                        throw new NotSupportValueException(-1014, "parse action json, but data value  is empty!!!");
                    }
                    if ((objOpt instanceof String) && TextUtils.isEmpty((String) objOpt)) {
                        throw new NotSupportValueException(-1014, "parse action json, but data value  is empty!!!");
                    }
                    arrayList.add(q5n.i(iOptInt, iOptInt3, specValueTypeConvert2ValueType, q5n.a(objOpt, specValueTypeConvert2ValueType)));
                }
            }
            return new l5n(iOptInt, iOptInt2, arrayList);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int a() {
        return this.f24697a;
    }

    public List<q5n> b() {
        List<q5n> list = this.c;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int c() {
        return this.f24698b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("siid=");
        sb.append(this.f24698b);
        sb.append(",aiid=");
        sb.append(this.f24697a);
        List<q5n> list = this.c;
        if (list == null || list.isEmpty()) {
            sb.append("property size =0");
        } else {
            sb.append(",property size=");
            sb.append(this.c.size());
            sb.append("{\n");
            Iterator<q5n> it = this.c.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append("\n");
            }
            sb.append("}");
        }
        return sb.toString();
    }
}
