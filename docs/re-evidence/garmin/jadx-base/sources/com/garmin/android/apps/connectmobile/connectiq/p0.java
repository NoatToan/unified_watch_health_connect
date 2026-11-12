package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.i2;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class p0 {
    public static String a(byte[] bArr) {
        JSONObject jSONObjectC;
        try {
            vt2.a aVarA = vt2.p.a(bArr);
            if (aVarA.size() == 0) {
                return new JSONObject("{}").toString();
            }
            if (aVarA.size() == 1) {
                vt2.n<?> nVar = aVarA.get(0);
                byte b14 = nVar.f180206a;
                if (b14 == 5) {
                    JSONArray jSONArrayB = b((vt2.b) nVar);
                    if (jSONArrayB != null) {
                        return jSONArrayB.toString();
                    }
                } else if (b14 == 11 && (jSONObjectC = c((vt2.i) nVar)) != null) {
                    return jSONObjectC.toString();
                }
            }
            return null;
        } catch (UnsupportedEncodingException e4) {
            e = e4;
            i2.i("ConnectIQUtil", "convertMBToJSON: " + e.getMessage());
            return null;
        } catch (JSONException e14) {
            e = e14;
            i2.i("ConnectIQUtil", "convertMBToJSON: " + e.getMessage());
            return null;
        }
    }

    public static JSONArray b(vt2.b bVar) {
        JSONObject jSONObjectC;
        JSONArray jSONArray = new JSONArray();
        for (vt2.n nVar : bVar.f180193b) {
            byte b14 = nVar.f180206a;
            if (b14 == 3) {
                jSONArray.put(((vt2.m) nVar).f180205c);
            } else if (b14 == 9) {
                jSONArray.put(Boolean.valueOf(((vt2.c) nVar).f180195b));
            } else if (b14 == 1) {
                jSONArray.put(Integer.valueOf(((vt2.j) nVar).f180202b));
            } else if (b14 == 14) {
                jSONArray.put(Long.valueOf(((vt2.k) nVar).f180203b));
            } else if (b14 == 2) {
                jSONArray.put(Float.valueOf(((vt2.h) nVar).f180199b));
            } else if (b14 == 15) {
                jSONArray.put(Double.valueOf(((vt2.g) nVar).f180198b));
            } else if (b14 == 0) {
                jSONArray.put(JSONObject.NULL);
            } else if (b14 == 5) {
                JSONArray jSONArrayB = b((vt2.b) nVar);
                if (jSONArrayB == null) {
                    return null;
                }
                jSONArray.put(jSONArrayB);
            } else {
                if (b14 != 11 || (jSONObjectC = c((vt2.i) nVar)) == null) {
                    return null;
                }
                jSONArray.put(jSONObjectC);
            }
        }
        return jSONArray;
    }

    public static JSONObject c(vt2.i iVar) {
        JSONObject jSONObjectC;
        JSONObject jSONObject = new JSONObject();
        HashMap<vt2.n<?>, vt2.n<?>> map = iVar.f180200b;
        for (vt2.n<?> nVar : map.keySet()) {
            if (nVar.f180206a != 3) {
                return null;
            }
            vt2.m mVar = (vt2.m) nVar;
            vt2.n<?> nVar2 = map.get(nVar);
            try {
                byte b14 = nVar2.f180206a;
                if (b14 == 3) {
                    jSONObject.put(mVar.f180205c, ((vt2.m) nVar2).f180205c);
                } else if (b14 == 9) {
                    jSONObject.put(mVar.f180205c, Boolean.valueOf(((vt2.c) nVar2).f180195b));
                } else if (b14 == 1) {
                    jSONObject.put(mVar.f180205c, Integer.valueOf(((vt2.j) nVar2).f180202b));
                } else if (b14 == 14) {
                    jSONObject.put(mVar.f180205c, Long.valueOf(((vt2.k) nVar2).f180203b));
                } else if (b14 == 2) {
                    jSONObject.put(mVar.f180205c, Float.valueOf(((vt2.h) nVar2).f180199b));
                } else if (b14 == 15) {
                    jSONObject.put(mVar.f180205c, Double.valueOf(((vt2.g) nVar2).f180198b));
                } else if (b14 == 0) {
                    jSONObject.put(mVar.f180205c, JSONObject.NULL);
                } else {
                    if (b14 != 5) {
                        if (b14 == 11 && (jSONObjectC = c((vt2.i) nVar2)) != null) {
                            jSONObject.put(mVar.f180205c, jSONObjectC);
                        }
                        return null;
                    }
                    JSONArray jSONArrayB = b((vt2.b) nVar2);
                    if (jSONArrayB == null) {
                        return null;
                    }
                    jSONObject.put(mVar.f180205c, jSONArrayB);
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static byte[] d(UUID uuid) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }
}
