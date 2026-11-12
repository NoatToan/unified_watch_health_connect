package defpackage;

import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.enums.EnumProcessResult;
import com.careforeyou.library.enums.Weight_Digit;
import com.careforeyou.library.enums.Weight_Unit;
import com.careforeyou.library.protocal.iStraightFrame;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes4.dex */
public class wa implements iStraightFrame {
    private CsFatScale d = null;

    @Override // com.careforeyou.library.protocal.iStraightFrame
    public EnumProcessResult process(byte[] bArr, String str) throws vs {
        int i;
        CsFatScale csFatScale = new CsFatScale();
        this.d = csFatScale;
        byte b2 = bArr[0];
        if (b2 == -64) {
            i = 1;
        } else {
            if (b2 != -60 && b2 != -56 && b2 != -59) {
                throw new vs("帧格式错误 -- 类型不对");
            }
            i = 0;
        }
        csFatScale.setDeviceType(i);
        if (str.equalsIgnoreCase("0000fff1-0000-1000-8000-00805f9b34fb")) {
            this.d.setLockFlag((byte) 0);
            this.d.weighingDate = new Date();
        } else {
            this.d.setLockFlag((byte) 1);
            this.d.weighingDate = new Date(((long) wg.a(wg.c(bArr, 2, 4))) * 1000);
        }
        this.d.setHistoryData(false);
        if (str.compareToIgnoreCase("0000fa9c-0000-1000-8000-00805f9b34fb") == 0) {
            this.d.setHistoryData(true);
        }
        byte b3 = bArr[1];
        vz vzVarE = wl.e(bArr[7], bArr[6], b3, true);
        this.d.setWeight(vzVarE.f51724a * 10.0d);
        this.d.setScaleWeightC(vzVarE.d);
        this.d.setScaleProperty(e(b3, bArr[0]));
        byte b4 = bArr[0];
        if (b4 != -64) {
            if (b4 == -59) {
                String strB = wg.b(b3);
                this.d.setImpedanceMeasuringType(Integer.parseInt(strB.substring(6, 7)));
                this.d.setHeartRateMeasuringType(Integer.parseInt(strB.substring(7)));
                this.d.setImpedance(wg.a(new byte[]{bArr[9], bArr[8]}) * 0.1f);
                int iC = wg.c(bArr[10]);
                if (iC > 0) {
                    this.d.setRemark("2:" + iC);
                } else {
                    this.d.setRemark(null);
                }
            } else if (b4 == -60) {
                this.d.setImpedance(wg.a(new byte[]{bArr[9], bArr[8]}) * 0.1f);
            } else if (b4 == -56) {
                float fA = wg.a(new byte[]{bArr[9], bArr[8]}) * 0.1f;
                this.d.setImpedance(fA);
                if (fA > 0.0f) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                    decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
                    DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                    this.d.setRemark("1:" + decimalFormat.format(wg.a(new byte[]{bArr[11], bArr[10]}) * 0.1f) + "," + decimalFormat.format(wg.a(new byte[]{bArr[13], bArr[12]}) * 0.1f) + "," + decimalFormat.format(wg.a(new byte[]{bArr[15], bArr[14]}) * 0.1f) + "," + decimalFormat.format(wg.a(new byte[]{bArr[17], bArr[16]}) * 0.1f) + "," + decimalFormat.format(wg.a(new byte[]{bArr[19], bArr[18]}) * 0.1f));
                }
            } else {
                return EnumProcessResult.Wait_Scale_Data;
            }
        }
        return EnumProcessResult.Received_Scale_Data;
    }

    private byte e(byte b2, byte b3) {
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
