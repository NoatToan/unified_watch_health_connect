package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ks {
    private StringBuilder a = new StringBuilder();

    public final kp a(String str, Context context, is isVar) {
        kp kpVar = new kp("");
        kpVar.setErrorCode(7);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status") || !jSONObject.has("info")) {
                this.a.append("json is error ".concat(String.valueOf(str)));
            }
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("info");
            if (string.equals("0")) {
                this.a.append("auth fail:".concat(String.valueOf(string2)));
            }
        } catch (Throwable th) {
            this.a.append("json exception error:" + th.getMessage());
            ke.a(th, "MapParser", "paseAuthFailurJson");
        }
        try {
            StringBuilder sb = this.a;
            sb.append("#SHA1AndPackage#");
            sb.append(gj.e(context));
            String str2 = isVar.b.get("gsid").get(0);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = this.a;
                sb2.append(" #gsid#");
                sb2.append(str2);
            }
            String str3 = isVar.c;
            if (!TextUtils.isEmpty(str3)) {
                this.a.append(" #csid#".concat(String.valueOf(str3)));
            }
        } catch (Throwable unused) {
        }
        kpVar.setLocationDetail(this.a.toString());
        if (this.a.length() > 0) {
            StringBuilder sb3 = this.a;
            sb3.delete(0, sb3.length());
        }
        return kpVar;
    }

    public final kp a(byte[] bArr) {
        kp kpVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ByteBuffer byteBuffer = null;
        try {
            kpVar = new kp("");
            if (bArr == null) {
                kpVar.setErrorCode(5);
                this.a.append("byte[] is null");
                kpVar.setLocationDetail(this.a.toString());
                StringBuilder sb = this.a;
                sb.delete(0, sb.length());
                return kpVar;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            if (byteBufferWrap.get() == 0) {
                kpVar.b(String.valueOf((int) byteBufferWrap.getShort()));
                byteBufferWrap.clear();
                byteBufferWrap.clear();
                return kpVar;
            }
            kpVar.setLongitude(ki.a(((double) byteBufferWrap.getInt()) / 1000000.0d));
            kpVar.setLatitude(ki.a(((double) byteBufferWrap.getInt()) / 1000000.0d));
            kpVar.setAccuracy(byteBufferWrap.getShort());
            kpVar.c(String.valueOf((int) byteBufferWrap.get()));
            kpVar.d(String.valueOf((int) byteBufferWrap.get()));
            if (byteBufferWrap.get() == 1) {
                byte[] bArr2 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr2);
                try {
                    kpVar.setCountry(new String(bArr2, "UTF-8"));
                } catch (Throwable unused) {
                }
                byte[] bArr3 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr3);
                try {
                    str = new String(bArr3, "UTF-8");
                    try {
                        kpVar.setProvince(str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    str = "";
                }
                byte[] bArr4 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr4);
                try {
                    str2 = new String(bArr4, "UTF-8");
                    try {
                        kpVar.setCity(str2);
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    str2 = "";
                }
                byte[] bArr5 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr5);
                try {
                    str3 = new String(bArr5, "UTF-8");
                    try {
                        kpVar.setDistrict(str3);
                    } catch (Throwable unused6) {
                    }
                } catch (Throwable unused7) {
                    str3 = "";
                }
                byte[] bArr6 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr6);
                try {
                    str4 = new String(bArr6, "UTF-8");
                    try {
                        kpVar.setStreet(str4);
                        kpVar.setRoad(str4);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                    str4 = "";
                }
                byte[] bArr7 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr7);
                try {
                    kpVar.setNumber(new String(bArr7, "UTF-8"));
                } catch (Throwable unused10) {
                }
                byte[] bArr8 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr8);
                try {
                    str5 = new String(bArr8, "UTF-8");
                    try {
                        kpVar.setPoiName(str5);
                    } catch (Throwable unused11) {
                    }
                } catch (Throwable unused12) {
                    str5 = "";
                }
                byte[] bArr9 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr9);
                try {
                    kpVar.setAoiName(new String(bArr9, "UTF-8"));
                } catch (Throwable unused13) {
                }
                byte[] bArr10 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr10);
                try {
                    str6 = new String(bArr10, "UTF-8");
                    try {
                        kpVar.setAdCode(str6);
                    } catch (Throwable unused14) {
                    }
                } catch (Throwable unused15) {
                    str6 = "";
                }
                byte[] bArr11 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr11);
                try {
                    kpVar.setCityCode(new String(bArr11, "UTF-8"));
                } catch (Throwable unused16) {
                }
                StringBuilder sb2 = new StringBuilder();
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    sb2.append(" ");
                }
                if (!TextUtils.isEmpty(str2) && (!str.contains("市") || !str.equals(str2))) {
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
                    if (!TextUtils.isEmpty(str6)) {
                        sb2.append("靠近");
                    }
                    sb2.append(str5);
                    sb2.append(" ");
                }
                Bundle bundle = new Bundle();
                bundle.putString("citycode", kpVar.getCityCode());
                bundle.putString("desc", sb2.toString());
                bundle.putString("adcode", kpVar.getAdCode());
                kpVar.setExtras(bundle);
                kpVar.e(sb2.toString());
                String adCode = kpVar.getAdCode();
                kpVar.setAddress((adCode == null || adCode.trim().length() <= 0) ? sb2.toString() : sb2.toString().replace(" ", ""));
            }
            byteBufferWrap.get(new byte[byteBufferWrap.get() & 255]);
            if (byteBufferWrap.get() == 1) {
                byteBufferWrap.getInt();
                byteBufferWrap.getInt();
                byteBufferWrap.getShort();
            }
            if (byteBufferWrap.get() == 1) {
                byte[] bArr12 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr12);
                try {
                    kpVar.setBuildingId(new String(bArr12, "UTF-8"));
                } catch (Throwable unused17) {
                }
                byte[] bArr13 = new byte[byteBufferWrap.get() & 255];
                byteBufferWrap.get(bArr13);
                try {
                    kpVar.setFloor(new String(bArr13, "UTF-8"));
                } catch (Throwable unused18) {
                }
            }
            if (byteBufferWrap.get() == 1) {
                byteBufferWrap.get();
                byteBufferWrap.getInt();
                byteBufferWrap.get();
            }
            if (byteBufferWrap.get() == 1) {
                kpVar.setTime(byteBufferWrap.getLong());
            }
            byte[] bArr14 = new byte[byteBufferWrap.getShort()];
            byteBufferWrap.get(bArr14);
            try {
                kpVar.a(new String(bArr14, "UTF-8"));
            } catch (Throwable unused19) {
            }
            byteBufferWrap.clear();
            if (this.a.length() > 0) {
                StringBuilder sb3 = this.a;
                sb3.delete(0, sb3.length());
            }
            return kpVar;
        } catch (Throwable th) {
            try {
                kp kpVar2 = new kp("");
                kpVar2.setErrorCode(5);
                this.a.append("parser data error:" + th.getMessage());
                kpVar2.setLocationDetail(this.a.toString());
                if (0 != 0) {
                    byteBuffer.clear();
                }
                kpVar = kpVar2;
            } catch (Throwable th2) {
                if (0 != 0) {
                    byteBuffer.clear();
                }
                throw th2;
            }
        }
    }
}
