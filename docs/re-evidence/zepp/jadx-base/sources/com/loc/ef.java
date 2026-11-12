package com.loc;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.amap.api.location.AMapLocationClientOption;
import com.huami.ecg.core.db.entity.EcgData;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class ef {
    private StringBuilder a = new StringBuilder();
    private AMapLocationClientOption b = new AMapLocationClientOption();

    private void a(dr drVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(str2) && (this.b.getGeoLanguage() != AMapLocationClientOption.GeoLanguage.EN ? !str.contains("市") || !str.equals(str2) : !str2.equals(str))) {
            sb2.append(str2);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(str3);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append(str4);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb2.append(str5);
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(str6)) {
            if (TextUtils.isEmpty(str7) || this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) {
                sb2.append("Near " + str6);
                sb = new StringBuilder("Near ");
                sb.append(str6);
            } else {
                sb2.append("靠近");
                sb2.append(str6);
                sb2.append(" ");
                sb = new StringBuilder("在");
                sb.append(str6);
                sb.append("附近");
            }
            drVar.setDescription(sb.toString());
        }
        Bundle bundle = new Bundle();
        bundle.putString("citycode", drVar.getCityCode());
        bundle.putString("desc", sb2.toString());
        bundle.putString("adcode", drVar.getAdCode());
        drVar.setExtras(bundle);
        drVar.g(sb2.toString());
        String adCode = drVar.getAdCode();
        drVar.setAddress((adCode == null || adCode.trim().length() <= 0 || this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) ? sb2.toString() : sb2.toString().replace(" ", ""));
    }

    private static String b(String str) {
        return "[]".equals(str) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02af  */
    public final dr a(dr drVar, byte[] bArr, dl dlVar) {
        String str;
        ByteBuffer byteBufferWrap;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        byte b;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        dr drVar2 = drVar;
        try {
            if (bArr == null) {
                drVar2.setErrorCode(5);
                dlVar.f("#0504");
                this.a.append("binaryResult is null#0504");
                drVar2.setLocationDetail(this.a.toString());
                StringBuilder sb = this.a;
                sb.delete(0, sb.length());
                return drVar2;
            }
            byteBufferWrap = ByteBuffer.wrap(bArr);
            try {
                try {
                    if (byteBufferWrap.get() != 0) {
                        drVar2.setLongitude(eo.a(((double) byteBufferWrap.getInt()) / 1000000.0d));
                        drVar2.setLatitude(eo.a(((double) byteBufferWrap.getInt()) / 1000000.0d));
                        drVar2.setAccuracy(byteBufferWrap.getShort());
                        drVar2.c(String.valueOf((int) byteBufferWrap.get()));
                        drVar2.d(String.valueOf((int) byteBufferWrap.get()));
                        if (byteBufferWrap.get() == 1) {
                            try {
                                byte[] bArr2 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr2);
                                try {
                                    drVar2.setCountry(new String(bArr2, "UTF-8"));
                                } catch (Throwable unused) {
                                }
                                byte[] bArr3 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr3);
                                try {
                                    str2 = new String(bArr3, "UTF-8");
                                    try {
                                        drVar2.setProvince(str2);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable unused3) {
                                    str2 = "";
                                }
                                String str9 = str2;
                                byte[] bArr4 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr4);
                                try {
                                    str3 = new String(bArr4, "UTF-8");
                                    try {
                                        drVar2.setCity(str3);
                                    } catch (Throwable unused4) {
                                    }
                                } catch (Throwable unused5) {
                                    str3 = "";
                                }
                                String str10 = str3;
                                byte[] bArr5 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr5);
                                try {
                                    str4 = new String(bArr5, "UTF-8");
                                    try {
                                        drVar2.setDistrict(str4);
                                    } catch (Throwable unused6) {
                                    }
                                } catch (Throwable unused7) {
                                    str4 = "";
                                }
                                String str11 = str4;
                                byte[] bArr6 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr6);
                                try {
                                    str5 = new String(bArr6, "UTF-8");
                                    try {
                                        drVar2.setStreet(str5);
                                        drVar2.setRoad(str5);
                                    } catch (Throwable unused8) {
                                    }
                                } catch (Throwable unused9) {
                                    str5 = "";
                                }
                                String str12 = str5;
                                byte[] bArr7 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr7);
                                try {
                                    str6 = new String(bArr7, "UTF-8");
                                    try {
                                        drVar2.setNumber(str6);
                                    } catch (Throwable unused10) {
                                    }
                                } catch (Throwable unused11) {
                                    str6 = "";
                                }
                                String str13 = str6;
                                byte[] bArr8 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr8);
                                try {
                                    str7 = new String(bArr8, "UTF-8");
                                    try {
                                        drVar2.setPoiName(str7);
                                    } catch (Throwable unused12) {
                                    }
                                } catch (Throwable unused13) {
                                    str7 = "";
                                }
                                String str14 = str7;
                                byte[] bArr9 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr9);
                                try {
                                    drVar2.setAoiName(new String(bArr9, "UTF-8"));
                                } catch (Throwable unused14) {
                                }
                                byte[] bArr10 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr10);
                                try {
                                    str8 = new String(bArr10, "UTF-8");
                                    try {
                                        drVar2.setAdCode(str8);
                                    } catch (Throwable unused15) {
                                    }
                                } catch (Throwable unused16) {
                                    str8 = "";
                                }
                                String str15 = str8;
                                byte[] bArr11 = new byte[byteBufferWrap.get() & 255];
                                byteBufferWrap.get(bArr11);
                                try {
                                    drVar2.setCityCode(new String(bArr11, "UTF-8"));
                                } catch (Throwable unused17) {
                                }
                                b = 1;
                                byteBuffer = byteBufferWrap;
                                str = "";
                                try {
                                    a(drVar, str9, str10, str11, str12, str13, str14, str15);
                                } catch (Throwable th) {
                                    th = th;
                                    byteBufferWrap = byteBuffer;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str = "";
                            }
                        } else {
                            byteBuffer = byteBufferWrap;
                            str = "";
                            b = 1;
                        }
                        try {
                            byteBuffer2 = byteBuffer;
                            try {
                                byteBuffer2.get(new byte[byteBuffer.get() & 255]);
                                if (byteBuffer2.get() == b) {
                                    byteBuffer2.getInt();
                                    byteBuffer2.getInt();
                                    byteBuffer2.getShort();
                                }
                                if (byteBuffer2.get() == b) {
                                    byte[] bArr12 = new byte[byteBuffer2.get() & 255];
                                    byteBuffer2.get(bArr12);
                                    try {
                                        drVar2.setBuildingId(new String(bArr12, (String) r6));
                                    } catch (Throwable unused18) {
                                    }
                                    byte[] bArr13 = new byte[byteBuffer2.get() & 255];
                                    byteBuffer2.get(bArr13);
                                    try {
                                        drVar2.setFloor(new String(bArr13, (String) r6));
                                    } catch (Throwable unused19) {
                                    }
                                }
                                if (byteBuffer2.get() == b) {
                                    byteBuffer2.get();
                                    byteBuffer2.getInt();
                                    byteBuffer2.get();
                                }
                                if (byteBuffer2.get() == b) {
                                    drVar2.setTime(byteBuffer2.getLong());
                                }
                                int i = byteBuffer2.getShort();
                                if (i > 0) {
                                    byte[] bArr14 = new byte[i];
                                    byteBuffer2.get(bArr14);
                                    if (i > 0) {
                                        try {
                                            drVar2.a(new String(Base64.decode(bArr14, 0), "UTF-8"));
                                        } catch (Throwable unused20) {
                                        }
                                    }
                                }
                                int i2 = byteBuffer2.getShort();
                                if (i2 > 0) {
                                    byteBuffer2.get(new byte[i2]);
                                }
                                if (Double.valueOf("5.1").doubleValue() >= 5.1d) {
                                    short s = byteBuffer2.getShort();
                                    if (EcgData.DEFAULT_DIGIT_VALUE.equals(drVar.d())) {
                                        if (s == 101) {
                                            s = 100;
                                        }
                                    } else if (s == -1) {
                                        s = 0;
                                    } else if (s == 0) {
                                        s = -1;
                                    }
                                    drVar2.setConScenario(s);
                                    byteBuffer2.get();
                                }
                                byteBuffer2.clear();
                            } catch (Throwable th3) {
                                th = th3;
                                byteBufferWrap = byteBuffer2;
                                dr drVar3 = new dr(str);
                                drVar3.setErrorCode(5);
                                dlVar.f("#0505");
                                this.a.append("parser data error:" + th.getMessage() + "#0505");
                                em.a((String) null, 2054);
                                drVar3.setLocationDetail(this.a.toString());
                                if (byteBufferWrap != null) {
                                    byteBufferWrap.clear();
                                }
                                drVar2 = drVar3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteBuffer2 = byteBuffer;
                        }
                        if (this.a.length() > 0) {
                            StringBuilder sb2 = this.a;
                            sb2.delete(0, sb2.length());
                        }
                        return drVar2;
                    }
                    try {
                        drVar2.b(String.valueOf((int) byteBufferWrap.getShort()));
                        byteBufferWrap.clear();
                        byteBufferWrap.clear();
                        return drVar2;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    dr drVar4 = new dr(str);
                    drVar4.setErrorCode(5);
                    dlVar.f("#0505");
                    this.a.append("parser data error:" + th.getMessage() + "#0505");
                    em.a((String) null, 2054);
                    drVar4.setLocationDetail(this.a.toString());
                    if (byteBufferWrap != null) {
                        byteBufferWrap.clear();
                    }
                    drVar2 = drVar4;
                    if (this.a.length() > 0) {
                        StringBuilder sb3 = this.a;
                        sb3.delete(0, sb3.length());
                    }
                    return drVar2;
                } catch (Throwable th6) {
                    if (byteBufferWrap != null) {
                        byteBufferWrap.clear();
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
            str = "";
        } catch (Throwable th8) {
            th = th8;
            str = "";
            byteBufferWrap = null;
        }
    }

    public final dr a(String str) {
        String str2;
        try {
            dr drVar = new dr("");
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("regeocode");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("addressComponent");
            drVar.setCountry(b(jSONObjectOptJSONObject2.optString("country")));
            String strB = b(jSONObjectOptJSONObject2.optString("province"));
            drVar.setProvince(strB);
            String strB2 = b(jSONObjectOptJSONObject2.optString("citycode"));
            drVar.setCityCode(strB2);
            String strOptString = jSONObjectOptJSONObject2.optString("city");
            if (!strB2.endsWith("010") && !strB2.endsWith("021") && !strB2.endsWith("022") && !strB2.endsWith("023")) {
                strOptString = b(strOptString);
                drVar.setCity(strOptString);
            } else if (strB != null && strB.length() > 0) {
                drVar.setCity(strB);
                strOptString = strB;
            }
            if (TextUtils.isEmpty(strOptString)) {
                drVar.setCity(strB);
                strOptString = strB;
            }
            String strB3 = b(jSONObjectOptJSONObject2.optString("district"));
            drVar.setDistrict(strB3);
            String strB4 = b(jSONObjectOptJSONObject2.optString("adcode"));
            drVar.setAdCode(strB4);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("streetNumber");
            String strB5 = b(jSONObjectOptJSONObject3.optString("street"));
            drVar.setStreet(strB5);
            drVar.setRoad(strB5);
            String strB6 = b(jSONObjectOptJSONObject3.optString("number"));
            drVar.setNumber(strB6);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("pois");
            if (jSONArrayOptJSONArray.length() > 0) {
                String strB7 = b(jSONArrayOptJSONArray.getJSONObject(0).optString("name"));
                drVar.setPoiName(strB7);
                str2 = strB7;
            } else {
                str2 = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("aois");
            if (jSONArrayOptJSONArray2.length() > 0) {
                drVar.setAoiName(b(jSONArrayOptJSONArray2.getJSONObject(0).optString("name")));
            }
            a(drVar, strB, strOptString, strB3, strB5, strB6, str2, strB4);
            return drVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final dr a(String str, Context context, av avVar, dl dlVar) {
        dr drVar = new dr("");
        drVar.setErrorCode(7);
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("#SHA1AndPackage#");
            stringBuffer.append(k.e(context));
            String str2 = avVar.b.get("gsid").get(0);
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append("#gsid#");
                stringBuffer.append(str2);
            }
            String str3 = avVar.c;
            if (!TextUtils.isEmpty(str3)) {
                stringBuffer.append("#csid#" + str3);
            }
        } catch (Throwable unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status") || !jSONObject.has("info")) {
                dlVar.f("#0702");
                StringBuilder sb = this.a;
                sb.append("json is error:");
                sb.append(str);
                sb.append(stringBuffer);
                sb.append("#0702");
            }
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("info");
            String string3 = jSONObject.getString("infocode");
            if ("0".equals(string)) {
                dlVar.f("#0701");
                StringBuilder sb2 = this.a;
                sb2.append("auth fail:");
                sb2.append(string2);
                sb2.append(stringBuffer);
                sb2.append("#0701");
                em.a(avVar.d, string3, string2);
            }
        } catch (Throwable th) {
            dlVar.f("#0703");
            StringBuilder sb3 = this.a;
            sb3.append("json exception error:");
            sb3.append(th.getMessage());
            sb3.append(stringBuffer);
            sb3.append("#0703");
            ei.a(th, "parser", "paseAuthFailurJson");
        }
        drVar.setLocationDetail(this.a.toString());
        if (this.a.length() > 0) {
            StringBuilder sb4 = this.a;
            sb4.delete(0, sb4.length());
        }
        return drVar;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            this.b = new AMapLocationClientOption();
        } else {
            this.b = aMapLocationClientOption;
        }
    }
}
