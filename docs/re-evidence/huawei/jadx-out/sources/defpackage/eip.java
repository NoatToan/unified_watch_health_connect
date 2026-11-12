package defpackage;

import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class eip implements HealthDataParser {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [eip$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.huawei.health.device.open.data.model.HealthData] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.huawei.health.device.open.data.HealthDataParser
    public HealthData parseData(byte[] bArr) {
        LogUtil.a("GlucoseDataParser", "parseData");
        ?? r0 = 0;
        r0 = 0;
        if (bArr == null) {
            LogUtil.j("GlucoseDataParser", "parseData data is null");
            return null;
        }
        List<Object> listB = new b().b(bArr);
        if (listB != null && listB.size() > 0) {
            emq emqVar = new emq();
            if (listB.get(0) instanceof Float) {
                emqVar.setBloodSugar(((Float) listB.get(0)).floatValue());
            }
            if (listB.get(1) instanceof Long) {
                emqVar.setStartTime(((Long) listB.get(1)).longValue());
                emqVar.setEndTime(((Long) listB.get(1)).longValue());
                ReleaseLogUtil.d("BTSYNC_GlucoseDataParser", "BloodSugarData time is", Long.valueOf(emqVar.getStartTime()));
            }
            r0 = emqVar;
            if (listB.get(2) instanceof Integer) {
                emqVar.setSequenceNumber(((Integer) listB.get(2)).intValue());
                r0 = emqVar;
            }
        }
        return r0;
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f33039a;
        private byte[] d;
        private int e;

        private b() {
            this.d = new byte[2];
            this.f33039a = new byte[1];
            this.e = 0;
        }

        public String c(byte[] bArr) {
            StringBuilder sb = new StringBuilder("");
            if (bArr != null && bArr.length > 0) {
                for (byte b2 : bArr) {
                    String hexString = Integer.toHexString(b2 & 255);
                    if (hexString.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(hexString);
                }
                return sb.toString().toUpperCase(Locale.ENGLISH);
            }
            return sb.toString();
        }

        private int d(byte[] bArr) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOf(bArr, 4));
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return byteBufferWrap.asIntBuffer().get();
        }

        private String a(int i) {
            if (i >= 10) {
                return String.valueOf(i);
            }
            return "0" + i;
        }

        public List<Object> b(byte[] bArr) {
            LogUtil.a("GlucoseDataParser", "getSugarData return data:", e(bArr));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.get(this.f33039a, 0, 1);
            String strSubstring = c(this.f33039a).substring(1, 2);
            LogUtil.a("GlucoseDataParser", "getSugarData Flag:", strSubstring);
            try {
                int i = Integer.parseInt(strSubstring);
                byteBufferWrap.get(this.d, 0, 2);
                int iD = d(this.d);
                this.e = iD;
                LogUtil.a("GlucoseDataParser", "getSugarData sequenceNumber:", Integer.valueOf(iD));
                String strE = e(byteBufferWrap);
                if ((i & 1) == 1) {
                    byteBufferWrap.get(this.d, 0, 2);
                }
                byteBufferWrap.get(this.d, 0, 2);
                String binaryString = Integer.toBinaryString(d(this.d));
                try {
                    double dC = eip.c((i & 4) >> 2, binaryString);
                    if (a((i & 2) >> 1, byteBufferWrap)) {
                        return Collections.EMPTY_LIST;
                    }
                    return c(new BigDecimal(dC).setScale(1, 4).floatValue(), strE, this.e);
                } catch (IllegalArgumentException e) {
                    LogUtil.e("GlucoseDataParser", "getSugarData glpValue rawGlucose:", binaryString, " e = ", e.getMessage());
                    return Collections.EMPTY_LIST;
                }
            } catch (NumberFormatException e2) {
                LogUtil.e("GlucoseDataParser", "getSugarData e = ", e2.getMessage());
                return Collections.EMPTY_LIST;
            }
        }

        private List<Object> c(float f, String str, int i) {
            ArrayList arrayList = new ArrayList(3);
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                arrayList.add(Float.valueOf(f));
                arrayList.add(Long.valueOf(simpleDateFormat.parse(str).getTime()));
                arrayList.add(Integer.valueOf(i));
                return arrayList;
            } catch (ParseException e) {
                LogUtil.e("GlucoseDataParser", "getSugarData ParseException e = ", e.getMessage());
                return Collections.EMPTY_LIST;
            }
        }

        private boolean a(int i, ByteBuffer byteBuffer) {
            if (i == 1) {
                byteBuffer.get(this.f33039a, 0, 1);
                String binaryString = Integer.toBinaryString(d(this.f33039a));
                try {
                    if (Integer.parseInt(("00000000".substring(0, 8 - binaryString.length()) + binaryString).substring(0, 4), 2) == 4) {
                        return true;
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("GlucoseDataParser", "isParseOneSuccess", e.getMessage());
                    return true;
                }
            }
            return false;
        }

        private String e(ByteBuffer byteBuffer) {
            byteBuffer.get(this.d, 0, 2);
            String strA = a(d(this.d));
            byteBuffer.get(this.f33039a, 0, 1);
            String strA2 = a(d(this.f33039a));
            byteBuffer.get(this.f33039a, 0, 1);
            String strA3 = a(d(this.f33039a));
            byteBuffer.get(this.f33039a, 0, 1);
            String strA4 = a(d(this.f33039a));
            byteBuffer.get(this.f33039a, 0, 1);
            String strA5 = a(d(this.f33039a));
            byteBuffer.get(this.f33039a, 0, 1);
            return String.format(Locale.ENGLISH, "%s-%s-%s %s:%s:%s", strA, strA2, strA3, strA4, strA5, a(d(this.f33039a)));
        }

        public String e(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b2 : bArr) {
                sb.append(String.format(Locale.ENGLISH, "%02x", Integer.valueOf(b2 & 255)));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double c(int i, String str) throws IllegalArgumentException {
        double dPow;
        double dPow2;
        try {
            int i2 = str.length() >= 4 ? Integer.parseInt(str.substring(0, 4), 2) : 0;
            int i3 = i2 > 8 ? i2 - 16 : -i2;
            try {
                int i4 = Integer.parseInt(str.substring(4, 16), 2);
                if (i == 1) {
                    dPow = i4;
                    dPow2 = Math.pow(10.0d, i3);
                } else {
                    dPow = ((double) i4) * Math.pow(10.0d, i3);
                    dPow2 = 5.55000555000555d;
                }
                return dPow * dPow2 * 1000.0d;
            } catch (NumberFormatException e) {
                LogUtil.e("GlucoseDataParser", "getGlpValue mantissa", e.getMessage());
                throw new IllegalArgumentException("mantissa parse error");
            }
        } catch (NumberFormatException e2) {
            LogUtil.e("GlucoseDataParser", "getGlpValue exponent", e2.getMessage());
            throw new IllegalArgumentException("exponent parse error");
        }
    }
}
