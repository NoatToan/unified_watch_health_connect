package com.airbnb.lottie.utils;

import j20.x;

/* JADX INFO: loaded from: classes7.dex */
public class GammaEvaluator {
    private static float EOCF_sRGB(float f14) {
        return f14 <= 0.04045f ? f14 / 12.92f : (float) Math.pow((f14 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float OECF_sRGB(float f14) {
        return f14 <= 0.0031308f ? f14 * 12.92f : (float) ((Math.pow(f14, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f14, int i14, int i15) {
        if (i14 == i15 || f14 <= 0.0f) {
            return i14;
        }
        if (f14 >= 1.0f) {
            return i15;
        }
        float f15 = ((i14 >> 24) & 255) / 255.0f;
        float f16 = ((i15 >> 24) & 255) / 255.0f;
        float fEOCF_sRGB = EOCF_sRGB(((i14 >> 16) & 255) / 255.0f);
        float fEOCF_sRGB2 = EOCF_sRGB(((i14 >> 8) & 255) / 255.0f);
        float fEOCF_sRGB3 = EOCF_sRGB((i14 & 255) / 255.0f);
        float fEOCF_sRGB4 = EOCF_sRGB(((i15 >> 16) & 255) / 255.0f);
        float fEOCF_sRGB5 = EOCF_sRGB(((i15 >> 8) & 255) / 255.0f);
        float fEOCF_sRGB6 = EOCF_sRGB((i15 & 255) / 255.0f);
        float fA = x.a(f16, f15, f14, f15);
        float fA2 = x.a(fEOCF_sRGB4, fEOCF_sRGB, f14, fEOCF_sRGB);
        float fA3 = x.a(fEOCF_sRGB5, fEOCF_sRGB2, f14, fEOCF_sRGB2);
        float fA4 = x.a(fEOCF_sRGB6, fEOCF_sRGB3, f14, fEOCF_sRGB3);
        float fOECF_sRGB = OECF_sRGB(fA2) * 255.0f;
        float fOECF_sRGB2 = OECF_sRGB(fA3) * 255.0f;
        return Math.round(OECF_sRGB(fA4) * 255.0f) | (Math.round(fOECF_sRGB) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fOECF_sRGB2) << 8);
    }
}
