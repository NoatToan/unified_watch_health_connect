package chipsea.bias.v432;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class CSBiasAPI {

    public static class CSBiasDataV432 {
        public float out_bfm;
        public float out_bfp;
        public float out_bmc;
        public float out_bmi;
        public int out_bmr;
        public int out_bs;
        public int out_bt;
        public float out_bwm;
        public float out_bwp;
        public int out_cin;
        public int out_eofa;
        public int out_eofb;
        public int out_eofl;
        public int out_eoma;
        public int out_eomb;
        public int out_eoml;
        public float out_fc;
        public float out_lafm;
        public float out_lafm_p;
        public int out_lafm_s;
        public float out_lam;
        public float out_lam_p;
        public int out_lam_s;
        public float out_limbmi;
        public float out_llfm;
        public float out_llfm_p;
        public int out_llfm_s;
        public float out_llm;
        public float out_llm_p;
        public int out_llm_s;
        public int out_ma;
        public float out_mc;
        public float out_pm;
        public float out_rafm;
        public float out_rafm_p;
        public int out_rafm_s;
        public float out_ram;
        public float out_ram_p;
        public int out_ram_s;
        public float out_rlfm;
        public float out_rlfm_p;
        public int out_rlfm_s;
        public float out_rlm;
        public float out_rlm_p;
        public int out_rlm_s;
        public int out_sbc;
        public float out_sbw;
        public float out_slm;
        public float out_tfm;
        public float out_tfm_p;
        public int out_tfm_s;
        public float out_tm;
        public float out_tm_p;
        public int out_tm_s;
        public int out_vfr;
        public float out_wc;
        public float out_whr;

        public String toString() {
            return "CSBiasDataV432{out_bfp=" + this.out_bfp + ", out_slm=" + this.out_slm + ", out_bwp=" + this.out_bwp + ", out_bmc=" + this.out_bmc + ", out_vfr=" + this.out_vfr + ", out_bmi=" + this.out_bmi + ", out_sbw=" + this.out_sbw + ", out_bfm=" + this.out_bfm + ", out_bwm=" + this.out_bwm + ", out_pm=" + this.out_pm + ", out_whr=" + this.out_whr + ", out_ram=" + this.out_ram + ", out_lam=" + this.out_lam + ", out_rlm=" + this.out_rlm + ", out_llm=" + this.out_llm + ", out_tm=" + this.out_tm + ", out_ram_p=" + this.out_ram_p + ", out_lam_p=" + this.out_lam_p + ", out_rlm_p=" + this.out_rlm_p + ", out_llm_p=" + this.out_llm_p + ", out_tm_p=" + this.out_tm_p + ", out_ram_s=" + this.out_ram_s + ", out_lam_s=" + this.out_lam_s + ", out_rlm_s=" + this.out_rlm_s + ", out_llm_s=" + this.out_llm_s + ", out_tm_s=" + this.out_tm_s + ", out_rafm=" + this.out_rafm + ", out_lafm=" + this.out_lafm + ", out_rlfm=" + this.out_rlfm + ", out_llfm=" + this.out_llfm + ", out_tfm=" + this.out_tfm + ", out_rafm_p=" + this.out_rafm_p + ", out_lafm_p=" + this.out_lafm_p + ", out_rlfm_p=" + this.out_rlfm_p + ", out_llfm_p=" + this.out_llfm_p + ", out_tfm_p=" + this.out_tfm_p + ", out_rafm_s=" + this.out_rafm_s + ", out_lafm_s=" + this.out_lafm_s + ", out_rlfm_s=" + this.out_rlfm_s + ", out_llfm_s=" + this.out_llfm_s + ", out_tfm_s=" + this.out_tfm_s + ", out_bmr=" + this.out_bmr + ", out_cin=" + this.out_cin + ", out_bt=" + this.out_bt + ", out_bs=" + this.out_bs + ", out_limbmi=" + this.out_limbmi + ", out_ma=" + this.out_ma + ", out_sbc=" + this.out_sbc + ", out_eoma=" + this.out_eoma + ", out_eoml=" + this.out_eoml + ", out_eomb=" + this.out_eomb + ", out_eofa=" + this.out_eofa + ", out_eofl=" + this.out_eofl + ", out_eofb=" + this.out_eofb + ", out_wc=" + this.out_wc + ", out_fc=" + this.out_fc + ", out_mc=" + this.out_mc + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class CSBiasPersonalInfoV432 {
        public int age;
        public int[] current_measuring_impedance;
        public int height;
        public int sex;
        public int weight;
    }

    public static class CSBiasV432Resp {
        public CSBiasDataV432 data;
        public int result;
    }

    static {
        System.loadLibrary("chipsea_bias_v432");
    }

    public static native CSBiasV432Resp cs_bias_v432(CSBiasPersonalInfoV432 cSBiasPersonalInfoV432);
}
