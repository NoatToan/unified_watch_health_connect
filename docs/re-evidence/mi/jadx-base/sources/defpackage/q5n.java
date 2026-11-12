package defpackage;

import android.text.TextUtils;
import com.miot.spec.entity.SpecValueType;
import com.miot.spec.exception.NotSupportValueException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31143b;
    public Object c;
    public SpecValueType d;
    public int e = -1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31144a;

        static {
            int[] iArr = new int[SpecValueType.values().length];
            f31144a = iArr;
            try {
                iArr[SpecValueType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31144a[SpecValueType.INT8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31144a[SpecValueType.UINT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31144a[SpecValueType.INT16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31144a[SpecValueType.UINT16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31144a[SpecValueType.INT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31144a[SpecValueType.UINT32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31144a[SpecValueType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31144a[SpecValueType.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31144a[SpecValueType.FLOAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31144a[SpecValueType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public q5n(int i, int i2, SpecValueType specValueType, Object obj) {
        this.f31142a = i;
        this.f31143b = i2;
        this.d = specValueType;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[PHI: r1
      0x0097: PHI (r1v15 java.lang.Object) = (r1v1 java.lang.Object), (r1v18 java.lang.Object) binds: [B:9:0x0025, B:31:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[PHI: r1
      0x00c4: PHI (r1v11 java.lang.Object) = (r1v1 java.lang.Object), (r1v13 java.lang.Object) binds: [B:9:0x0025, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da A[PHI: r1
      0x00da: PHI (r1v9 java.lang.Object) = (r1v1 java.lang.Object), (r1v11 java.lang.Object) binds: [B:9:0x0025, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea A[PHI: r1
      0x00ea: PHI (r1v6 java.lang.Object) = (r1v1 java.lang.Object), (r1v9 java.lang.Object) binds: [B:9:0x0025, B:49:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0126, please report this as an issue */
    public static Object a(Object obj, SpecValueType specValueType) throws NotSupportValueException {
        if (g(specValueType)) {
            if (!(obj instanceof String)) {
                obj = String.valueOf(obj);
            }
            specValueType.isValueValid(Long.valueOf(Long.parseLong((String) obj)));
        }
        Object objValueOf = null;
        switch (a.f31144a[specValueType.ordinal()]) {
            case 1:
                if (obj instanceof Boolean) {
                    objValueOf = obj;
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if ("true".equalsIgnoreCase(str)) {
                        objValueOf = Boolean.TRUE;
                    } else if ("false".equalsIgnoreCase(str)) {
                        objValueOf = Boolean.FALSE;
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 2:
                if (obj instanceof String) {
                    objValueOf = Byte.valueOf(Byte.parseByte((String) obj));
                } else {
                    if (!(obj instanceof Byte)) {
                        objValueOf = obj;
                    } else if (obj instanceof String) {
                        objValueOf = Byte.valueOf((byte) (Long.parseLong((String) obj) & 255));
                    }
                    if (obj instanceof String) {
                        objValueOf = Short.valueOf(Short.parseShort((String) obj));
                    } else {
                        if (!(obj instanceof Short)) {
                            objValueOf = obj;
                        } else if (obj instanceof String) {
                            objValueOf = Short.valueOf((short) (Long.parseLong((String) obj) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                        }
                        if (obj instanceof String) {
                            objValueOf = Integer.valueOf(Integer.parseInt((String) obj));
                        } else {
                            if (obj instanceof Integer) {
                                return obj;
                            }
                            if (obj instanceof String) {
                                objValueOf = Integer.valueOf((int) Long.parseLong((String) obj));
                            } else if (obj instanceof String) {
                                objValueOf = Long.valueOf(Long.parseLong((String) obj));
                            } else {
                                if (obj instanceof Long) {
                                    return obj;
                                }
                                if (obj instanceof String) {
                                    objValueOf = Long.valueOf(v73.i((String) obj, 10));
                                }
                            }
                        }
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 3:
                if (!(obj instanceof Byte)) {
                    if (obj instanceof String) {
                        objValueOf = Byte.valueOf((byte) (Long.parseLong((String) obj) & 255));
                    }
                    if (objValueOf != null) {
                        return objValueOf;
                    }
                    throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
                }
                objValueOf = obj;
                if (obj instanceof String) {
                    objValueOf = Short.valueOf(Short.parseShort((String) obj));
                } else {
                    if (!(obj instanceof Short)) {
                        objValueOf = obj;
                    } else if (obj instanceof String) {
                        objValueOf = Short.valueOf((short) (Long.parseLong((String) obj) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                    }
                    if (obj instanceof String) {
                        objValueOf = Integer.valueOf(Integer.parseInt((String) obj));
                    } else {
                        if (obj instanceof Integer) {
                            return obj;
                        }
                        if (obj instanceof String) {
                            objValueOf = Integer.valueOf((int) Long.parseLong((String) obj));
                        } else if (obj instanceof String) {
                            objValueOf = Long.valueOf(Long.parseLong((String) obj));
                        } else {
                            if (obj instanceof Long) {
                                return obj;
                            }
                            if (obj instanceof String) {
                                objValueOf = Long.valueOf(v73.i((String) obj, 10));
                            }
                        }
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 4:
                if (obj instanceof String) {
                    objValueOf = Short.valueOf(Short.parseShort((String) obj));
                } else {
                    if (!(obj instanceof Short)) {
                        objValueOf = obj;
                    } else if (obj instanceof String) {
                        objValueOf = Short.valueOf((short) (Long.parseLong((String) obj) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                    }
                    if (obj instanceof String) {
                        objValueOf = Integer.valueOf(Integer.parseInt((String) obj));
                    } else {
                        if (obj instanceof Integer) {
                            return obj;
                        }
                        if (obj instanceof String) {
                            objValueOf = Integer.valueOf((int) Long.parseLong((String) obj));
                        } else if (obj instanceof String) {
                            objValueOf = Long.valueOf(Long.parseLong((String) obj));
                        } else {
                            if (obj instanceof Long) {
                                return obj;
                            }
                            if (obj instanceof String) {
                                objValueOf = Long.valueOf(v73.i((String) obj, 10));
                            }
                        }
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 5:
                if (!(obj instanceof Short)) {
                    if (obj instanceof String) {
                        objValueOf = Short.valueOf((short) (Long.parseLong((String) obj) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                    }
                    if (objValueOf != null) {
                        return objValueOf;
                    }
                    throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
                }
                objValueOf = obj;
                if (obj instanceof String) {
                    objValueOf = Integer.valueOf(Integer.parseInt((String) obj));
                } else {
                    if (obj instanceof Integer) {
                        return obj;
                    }
                    if (obj instanceof String) {
                        objValueOf = Integer.valueOf((int) Long.parseLong((String) obj));
                    } else if (obj instanceof String) {
                        objValueOf = Long.valueOf(Long.parseLong((String) obj));
                    } else {
                        if (obj instanceof Long) {
                            return obj;
                        }
                        if (obj instanceof String) {
                            objValueOf = Long.valueOf(v73.i((String) obj, 10));
                        }
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 6:
                if (obj instanceof String) {
                    objValueOf = Integer.valueOf(Integer.parseInt((String) obj));
                } else {
                    if (obj instanceof Integer) {
                        return obj;
                    }
                    if (obj instanceof String) {
                        objValueOf = Integer.valueOf((int) Long.parseLong((String) obj));
                    } else if (obj instanceof String) {
                        objValueOf = Long.valueOf(Long.parseLong((String) obj));
                    } else {
                        if (obj instanceof Long) {
                            return obj;
                        }
                        if (obj instanceof String) {
                            objValueOf = Long.valueOf(v73.i((String) obj, 10));
                        }
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 7:
                if (obj instanceof Integer) {
                    return obj;
                }
                if (obj instanceof String) {
                    objValueOf = Integer.valueOf((int) Long.parseLong((String) obj));
                } else if (obj instanceof String) {
                    objValueOf = Long.valueOf(Long.parseLong((String) obj));
                } else {
                    if (obj instanceof Long) {
                        return obj;
                    }
                    if (obj instanceof String) {
                        objValueOf = Long.valueOf(v73.i((String) obj, 10));
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 8:
                if (obj instanceof String) {
                    objValueOf = Long.valueOf(Long.parseLong((String) obj));
                } else {
                    if (obj instanceof Long) {
                        return obj;
                    }
                    if (obj instanceof String) {
                        objValueOf = Long.valueOf(v73.i((String) obj, 10));
                    }
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 9:
                if (obj instanceof Long) {
                    return obj;
                }
                if (obj instanceof String) {
                    objValueOf = Long.valueOf(v73.i((String) obj, 10));
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 10:
                if (obj instanceof Float) {
                    objValueOf = obj;
                } else if (obj instanceof String) {
                    objValueOf = Float.valueOf(Float.parseFloat((String) obj));
                } else if (obj instanceof Double) {
                    objValueOf = Float.valueOf(Float.parseFloat(String.valueOf(obj)));
                }
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            case 11:
                objValueOf = obj.toString();
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
            default:
                if (objValueOf != null) {
                    return objValueOf;
                }
                throw new NotSupportValueException("NotSupportValue:value type is " + specValueType.name() + ",but value is " + obj);
        }
    }

    public static boolean g(SpecValueType specValueType) {
        switch (a.f31144a[specValueType.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static q5n h(int i, int i2) {
        return new q5n(i, i2);
    }

    public static q5n i(int i, int i2, SpecValueType specValueType, Object obj) {
        return new q5n(i, i2, specValueType, obj);
    }

    public static List<q5n> j(String str) throws NotSupportValueException {
        n5n.b("SpecProperty", "parseJson4GetProperties json =" + str, new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("objects");
            int length = jSONArray != null ? jSONArray.length() : 0;
            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int iOptInt = jSONObject.optInt("siid", -1);
                    if (iOptInt < 1 || iOptInt > 255) {
                        throw new NotSupportValueException(-1009, "parse get property json, but service id is out of [1,255]!!!");
                    }
                    int iOptInt2 = jSONObject.optInt("piid", -1);
                    if (iOptInt2 < 1 || iOptInt2 > SpecValueType.UINT16.getMaxValue()) {
                        throw new NotSupportValueException(-1010, "parse get property json,but property id is out of [1,65535]!!!");
                    }
                    arrayList.add(h(iOptInt, iOptInt2));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static List<q5n> k(String str) throws NotSupportValueException {
        n5n.b("SpecProperty", "parseJson4SetProperties json=" + str, new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("objects");
            int length = jSONArray != null ? jSONArray.length() : 0;
            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    arrayList.add(l(jSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static q5n l(JSONObject jSONObject) throws NotSupportValueException {
        int iOptInt = jSONObject.optInt("siid", -1);
        if (iOptInt < 1 || iOptInt > 255) {
            throw new NotSupportValueException(-1009, "parse set property json, but service id is out of [1,255]!!!");
        }
        int iOptInt2 = jSONObject.optInt("piid", -1);
        if (iOptInt2 < 1 || iOptInt2 > SpecValueType.UINT16.getMaxValue()) {
            throw new NotSupportValueException(-1010, "parse set property json,but property id is out of [1,65535]!!!");
        }
        int iOptInt3 = jSONObject.optInt("type", -1);
        if (iOptInt3 == -1) {
            throw new NotSupportValueException(-1013, "parse set property json,but data type is empty!!!");
        }
        SpecValueType specValueTypeConvert2ValueType = SpecValueType.convert2ValueType(iOptInt3);
        Object objOpt = jSONObject.opt("value");
        if (objOpt == null) {
            throw new NotSupportValueException(-1014, String.format("parse set property json,piid(%d)'s value is null", Integer.valueOf(iOptInt2)));
        }
        if ((objOpt instanceof String) && TextUtils.isEmpty((String) objOpt)) {
            throw new NotSupportValueException(-1014, String.format("parse set property json,piid(%d)'s value is null", Integer.valueOf(iOptInt2)));
        }
        return i(iOptInt, iOptInt2, specValueTypeConvert2ValueType, a(objOpt, specValueTypeConvert2ValueType));
    }

    public static JSONArray n(List<q5n> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            Iterator<q5n> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(o(it.next()));
            }
        }
        return jSONArray;
    }

    public static JSONObject o(q5n q5nVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("siid", q5nVar.f31142a);
        jSONObject.put("piid", q5nVar.f31143b);
        SpecValueType specValueType = q5nVar.d;
        if (specValueType != null) {
            jSONObject.put("type", (int) specValueType.value());
            jSONObject.put("value", g(q5nVar.f()) ? q5nVar.c() : q5nVar.c);
        }
        jSONObject.put("code", q5nVar.e);
        return jSONObject;
    }

    public int b() {
        return this.f31143b;
    }

    public Object c() {
        switch (a.f31144a[this.d.ordinal()]) {
            case 2:
                Byte b2 = (Byte) this.c;
                b2.byteValue();
                return b2;
            case 3:
                return Integer.valueOf(v73.d(((Byte) this.c).byteValue()));
            case 4:
                Short sh = (Short) this.c;
                sh.shortValue();
                return sh;
            case 5:
                return Integer.valueOf(v73.g(((Short) this.c).shortValue()));
            case 6:
                Integer num = (Integer) this.c;
                num.intValue();
                return num;
            case 7:
                return Long.valueOf(v73.e(((Integer) this.c).intValue()));
            case 8:
                Long l = (Long) this.c;
                l.longValue();
                return l;
            case 9:
                return v73.f(((Long) this.c).longValue());
            default:
                return this.c;
        }
    }

    public int d() {
        return this.f31142a;
    }

    public Object e() {
        return this.c;
    }

    public SpecValueType f() {
        return this.d;
    }

    public void m(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("property:{");
        sb.append("siid=");
        sb.append(this.f31142a);
        sb.append(",piid=");
        sb.append(this.f31143b);
        sb.append(",status=");
        sb.append(this.e);
        if (this.d != null) {
            sb.append(",valueType=");
            SpecValueType specValueType = this.d;
            sb.append(specValueType != null ? specValueType.name() : "None");
            sb.append(",value=");
            sb.append(g(this.d) ? c() : this.c);
        }
        sb.append("}");
        return sb.toString();
    }

    public q5n(int i, int i2) {
        this.f31142a = i;
        this.f31143b = i2;
    }
}
