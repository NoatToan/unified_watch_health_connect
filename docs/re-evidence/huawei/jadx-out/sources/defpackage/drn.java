package defpackage;

import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class drn implements HealthDataParser {
    private float b(float f) {
        return f * 0.4535924f;
    }

    public HealthData b(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("WspMeasureDataParser", "parseWeightData result is null");
            return null;
        }
        dso dsoVar = new dso();
        byte[] bArrA = a(bArr[0]);
        byte[] bArr2 = {bArr[2], bArr[1]};
        if (bArrA[0] == 0) {
            dsoVar.setWeight(a(d(bArr2), 0.005f));
        } else {
            dsoVar.setWeight(b(a(d(bArr2), 0.01f)));
        }
        if (bArrA[1] == 1) {
            bArr2[0] = bArr[4];
            bArr2[1] = bArr[3];
            String strE = e(d(bArr2), 3, bArr);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            try {
                date = simpleDateFormat.parse(strE);
            } catch (ParseException unused) {
                LogUtil.e("WspMeasureDataParser", "parseWeightData ParseException");
            }
            dsoVar.setEndTime(date.getTime());
            dsoVar.setStartTime(date.getTime());
        }
        return dsoVar;
    }

    @Override // com.huawei.health.device.open.data.HealthDataParser
    public HealthData parseData(byte[] bArr) {
        if (bArr != null) {
            int i = 11;
            if (bArr.length == 11) {
                dso dsoVar = new dso();
                byte[] bArr2 = {bArr[3], bArr[2]};
                dsoVar.setBodyFatRat(d(bArr2) / 10.0f);
                byte[] bArrA = a(bArr[0]);
                if (bArrA[1] == 1.0f) {
                    bArr2[0] = bArr[5];
                    bArr2[1] = bArr[4];
                    int iD = d(bArr2);
                    LogUtil.d("WspMeasureDataParser", "parseData year ", Integer.valueOf(iD));
                    String strE = e(iD, 4, bArr);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date = new Date();
                    try {
                        date = simpleDateFormat.parse(strE);
                    } catch (ParseException unused) {
                        LogUtil.e("WspMeasureDataParser", "parseData exception");
                    }
                    dsoVar.setEndTime(date.getTime());
                    dsoVar.setStartTime(date.getTime());
                } else {
                    i = 4;
                }
                byte[] bArrA2 = a(bArr[1]);
                if (bArrA2[1] == 1.0f) {
                    bArr2[0] = bArr[i + 1];
                    bArr2[1] = bArr[i];
                    i += 2;
                }
                if (bArrA2[2] == 1.0f) {
                    bArr2[0] = bArr[i + 1];
                    bArr2[1] = bArr[i];
                    if (bArrA[0] == 0) {
                        dsoVar.setWeight(a(d(bArr2), 0.005f));
                    } else {
                        dsoVar.setWeight(b(a(d(bArr2), 0.01f)));
                    }
                }
                return dsoVar;
            }
        }
        LogUtil.j("WspMeasureDataParser", "parseData resultData is null or resultData.length != 11");
        return null;
    }

    private String e(int i, int i2, byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i).append(Constants.LINK).append((int) bArr[i2 + 2]).append(Constants.LINK).append((int) bArr[i2 + 3]).append(" ").append((int) bArr[i2 + 4]).append(":").append((int) bArr[i2 + 5]).append(":").append((int) bArr[i2 + 6]);
        return stringBuffer.toString();
    }

    private byte[] a(byte b2) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (b2 & 1);
            b2 = (byte) (b2 >> 1);
        }
        return bArr;
    }

    private int d(byte[] bArr) {
        String strA = erh.a(bArr, null);
        try {
            if (strA == null) {
                LogUtil.j("WspMeasureDataParser", "bytesToInt hexString is null");
                return 0;
            }
            return Integer.parseInt(strA, 16);
        } catch (NumberFormatException e) {
            LogUtil.e("WspMeasureDataParser", "bytesToInt NumberFormatException = ", e.getMessage());
            return 0;
        }
    }

    private float a(int i, float f) {
        try {
            return Float.parseFloat(new BigDecimal(String.valueOf(i)).multiply(new BigDecimal(String.valueOf(f))).toString());
        } catch (NumberFormatException e) {
            LogUtil.e("WspMeasureDataParser", "getWeightForConversionRate NumberFormatException = ", e.getMessage());
            return 0.0f;
        }
    }
}
