package defpackage;

import chipsea.bias.v432.CSBiasAPI;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class v45 {
    public static CSBiasAPI.CSBiasV432Resp a(int i, int i2, float f, float f2, int[] iArr) {
        if (i2 < 18) {
            Logger.i("CSBiasAPI age < 18 , age : " + i2, new Object[0]);
            CSBiasAPI.CSBiasV432Resp cSBiasV432Resp = new CSBiasAPI.CSBiasV432Resp();
            cSBiasV432Resp.data = null;
            return cSBiasV432Resp;
        }
        if (f < 90.0f || f > 220.0f) {
            Logger.i("CSBiasAPI height : " + f, new Object[0]);
            CSBiasAPI.CSBiasV432Resp cSBiasV432Resp2 = new CSBiasAPI.CSBiasV432Resp();
            cSBiasV432Resp2.data = null;
            return cSBiasV432Resp2;
        }
        if (f2 < 20.0f || f2 > 150.0f) {
            Logger.i("CSBiasAPI weight : " + f, new Object[0]);
            CSBiasAPI.CSBiasV432Resp cSBiasV432Resp3 = new CSBiasAPI.CSBiasV432Resp();
            cSBiasV432Resp3.data = null;
            return cSBiasV432Resp3;
        }
        if (i == 2) {
            i = 0;
        }
        new CSBiasAPI();
        CSBiasAPI.CSBiasPersonalInfoV432 cSBiasPersonalInfoV432 = new CSBiasAPI.CSBiasPersonalInfoV432();
        cSBiasPersonalInfoV432.sex = i;
        cSBiasPersonalInfoV432.age = i2;
        cSBiasPersonalInfoV432.height = (int) (f * 10.0f);
        cSBiasPersonalInfoV432.weight = (int) (10.0f * f2);
        cSBiasPersonalInfoV432.current_measuring_impedance = iArr;
        Logger.i("CSBiasAPI sex ：" + i, new Object[0]);
        Logger.i("CSBiasAPI age ：" + i2, new Object[0]);
        Logger.i("CSBiasAPI height ：" + f, new Object[0]);
        Logger.i("CSBiasAPI weight ：" + f2, new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[0] ：" + iArr[0], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[1] ：" + iArr[1], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[2] ：" + iArr[2], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[3] ：" + iArr[3], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[4] ：" + iArr[4], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[5] ：" + iArr[5], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[6] ：" + iArr[6], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[7] ：" + iArr[7], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[8] ：" + iArr[8], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[9] ：" + iArr[9], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[10] ：" + iArr[10], new Object[0]);
        Logger.i("CSBiasAPI current_measuring_impedance[11] ：" + iArr[11], new Object[0]);
        CSBiasAPI.CSBiasV432Resp cSBiasV432RespCs_bias_v432 = CSBiasAPI.cs_bias_v432(cSBiasPersonalInfoV432);
        Logger.i("Csbias432Test:result->" + cSBiasV432RespCs_bias_v432.result, new Object[0]);
        Logger.i("Csbias432Test:data->" + cSBiasV432RespCs_bias_v432.data, new Object[0]);
        return cSBiasV432RespCs_bias_v432;
    }
}
