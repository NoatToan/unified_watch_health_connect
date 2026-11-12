package defpackage;

import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.enums.EnumProcessResult;
import com.careforeyou.library.enums.Weight_Digit;
import com.careforeyou.library.enums.Weight_Unit;
import com.careforeyou.library.protocal.iStraightFrame;
import com.huawei.openalliance.ad.constant.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class wb implements iStraightFrame {
    private CsFatScale d = null;

    @Override // com.careforeyou.library.protocal.iStraightFrame
    public EnumProcessResult process(byte[] bArr, String str) throws vs {
        int i;
        if (bArr == null) {
            throw new vs("帧格式错误 -- 帧为空");
        }
        if (bArr.length < 14) {
            throw new vs("帧格式错误 -- 帧长度不对");
        }
        byte b2 = bArr[0];
        if (b2 == 2 && bArr[1] == 0) {
            i = 1;
        } else {
            if ((b2 != 6 || bArr[1] != 3) && (b2 != 6 || bArr[1] != 35)) {
                throw new vs("帧格式错误 -- 类型不对");
            }
            i = 0;
        }
        CsFatScale csFatScale = new CsFatScale();
        this.d = csFatScale;
        csFatScale.setDeviceType(i);
        if (str.equalsIgnoreCase("0000fff1-0000-1000-8000-00805f9b34fb")) {
            this.d.setLockFlag((byte) 0);
            this.d.weighingDate = new Date();
        } else {
            this.d.setLockFlag((byte) 1);
            String str2 = wg.a(new byte[]{bArr[3], bArr[2]}) + Constants.LINK + ((int) bArr[4]) + Constants.LINK + ((int) bArr[5]) + " " + ((int) bArr[6]) + ":" + ((int) bArr[7]) + ":" + ((int) bArr[8]);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            try {
                date = simpleDateFormat.parse(str2);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.d.weighingDate = date;
        }
        this.d.setHistoryData(false);
        if (str.compareToIgnoreCase("0000fa9c-0000-1000-8000-00805f9b34fb") == 0) {
            this.d.setHistoryData(true);
        }
        if (i == 0) {
            this.d.setImpedance(wg.a(new byte[]{bArr[10], bArr[9]}) * 0.1f);
        }
        byte b3 = bArr[15];
        vz vzVarE = wl.e(bArr[12], bArr[11], b3, true);
        this.d.setWeight(vzVarE.f51724a * 10.0d);
        this.d.setScaleWeightC(vzVarE.d);
        this.d.setScaleProperty(c(b3));
        return EnumProcessResult.Received_Scale_Data;
    }

    private byte c(byte b2) {
        String str;
        String str2;
        Weight_Unit weight_UnitF = wg.f(b2);
        Weight_Digit weight_DigitA = wg.a(b2);
        if (weight_UnitF == Weight_Unit.JIN) {
            str = "00001";
        } else if (weight_UnitF == Weight_Unit.LB) {
            str = "00010";
        } else if (weight_UnitF == Weight_Unit.ST) {
            str = "00011";
        } else {
            str = "00000";
        }
        if (weight_DigitA == Weight_Digit.ONE) {
            str2 = str + "001";
        } else if (weight_DigitA == Weight_Digit.TWO) {
            str2 = str + "101";
        } else {
            str2 = str + "011";
        }
        return (byte) Integer.parseInt(str2, 2);
    }

    @Override // com.careforeyou.library.protocal.iStraightFrame
    public CsFatScale getFatScale() {
        return this.d;
    }
}
