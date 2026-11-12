package com.huawei.hms.scankit.p;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.operation.share.HiHealthError;
import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes34.dex */
public class m4 {
    private static final int[] p = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 20, 20, 21, 21, 22, 22, 23, 24, 24, 25, 26, 26, 27, 28, 28, 29, 30, 30, 31, 32, 32, 33, 34, 35, 35, 36, 37, 38, 38, 39, 40, 41, 42, 42, 43, 44, 45, 46, 47, 48, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91, 92, 93, 95, 96, 97, 98, 100, 101, 102, 103, 105, 106, 107, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110, 111, CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, 114, 115, 117, AgrConstant.HEALTH_AGREEMENT_CODE, Constants.MAX_PRO_BOTTOM_MARGIN_PAD, 121, 122, 123, 125, 126, 128, 129, 131, UserInfomation.WEIGHT_DEFAULT_ENGLISH, OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL, TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_DTS_HD, 138, 139, 141, 142, 144, 145, 147, 148, 150, HiHealthError.ERR_WRONG_DEVICE, 153, 154, 156, 158, 159, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY, MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA, MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY, 169, 170, TsExtractor.TS_STREAM_TYPE_AC4, 174, 175, 177, 179, 180, 182, 184, 185, 187, PsExtractor.PRIVATE_STREAM_1, 191, PsExtractor.AUDIO_STREAM, 194, 196, 198, 199, 201, 203, 205, com.huawei.hms.kit.awareness.barrier.internal.e.a.w, com.huawei.hms.kit.awareness.barrier.internal.e.a.z, com.huawei.hms.kit.awareness.barrier.internal.e.a.C, com.huawei.hms.kit.awareness.barrier.internal.e.a.K, com.huawei.hms.kit.awareness.barrier.internal.e.a.M, 216, 217, 219, FitnessSportType.HW_FITNESS_SPORT_ALL, 223, 225, 227, 229, 231, 233, FitnessSleepType.HW_FITNESS_WAKE, FitnessSleepType.HW_FITNESS_DREAM, 238, 240, InterfaceHiMap.POLY_LINE_MAX_SIZE, 244, 246, 248, 250, 252, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f16213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f16214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f16215c;
    private p d;
    private p e;
    private p f;
    private p g;
    private p h;
    private p i;
    private p j;
    private p k;
    private p l;
    private p m;
    private p n;
    private p o;

    public p e(p pVar, float f) {
        if (this.o == null) {
            if (r3.f16300a) {
                this.o = l4.a(r3.f16301b, pVar, f);
            } else {
                this.o = l4.a(pVar, f);
            }
        }
        return this.o;
    }

    public p d(p pVar) {
        if (this.e == null) {
            this.e = h(pVar);
        }
        return this.e;
    }

    public p b(p pVar) {
        if (this.f16215c == null) {
            this.f16215c = a(pVar);
        }
        return this.f16215c;
    }

    public p c(p pVar) {
        if (this.d == null) {
            this.d = a(pVar);
        }
        return this.d;
    }

    public p h(p pVar, float f) {
        if (this.g == null) {
            if (r3.f16300a) {
                this.g = l4.a(r3.f16301b, pVar, f);
            } else {
                this.g = l4.a(pVar, f);
            }
        }
        return this.g;
    }

    public p i(p pVar, float f) {
        if (this.h == null) {
            if (r3.f16300a) {
                this.h = l4.a(r3.f16301b, pVar, f);
            } else {
                this.h = l4.a(pVar, f);
            }
        }
        return this.h;
    }

    public p g(p pVar, float f) {
        if (this.j == null) {
            if (r3.f16300a) {
                this.j = l4.a(r3.f16301b, pVar, f);
            } else {
                this.j = l4.a(pVar, f);
            }
        }
        return this.j;
    }

    public p f(p pVar, float f) {
        if (this.l == null) {
            if (r3.f16300a) {
                this.l = l4.a(r3.f16301b, pVar, f);
            } else {
                this.l = l4.a(pVar, f);
            }
        }
        return this.l;
    }

    public p b(p pVar, float f) {
        if (this.f16214b == null) {
            if (r3.f16300a) {
                this.f16214b = l4.a(r3.f16301b, pVar, f);
            } else {
                this.f16214b = l4.a(pVar, f);
            }
        }
        return this.f16214b;
    }

    public void a() {
        this.o = null;
        this.g = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.h = null;
    }

    public p d(p pVar, float f) {
        if (this.f == null) {
            if (r3.f16300a) {
                this.f = l4.a(r3.f16301b, pVar, f);
            } else {
                this.f = l4.a(pVar, f);
            }
        }
        return this.f;
    }

    public p e(p pVar) {
        if (this.m == null) {
            this.m = a(pVar);
        }
        return this.m;
    }

    public p c(p pVar, float f) {
        if (this.i == null) {
            if (r3.f16300a) {
                this.i = l4.a(r3.f16301b, pVar, f);
            } else {
                this.i = l4.a(pVar, f);
            }
        }
        return this.i;
    }

    public p g(p pVar) {
        if (this.k == null) {
            this.k = h(pVar);
        }
        return this.k;
    }

    public static p h(p pVar) throws a {
        byte[] bArrB = pVar.a().c().b();
        if (bArrB == null || bArrB.length <= 0) {
            return pVar;
        }
        int length = bArrB.length;
        float[] fArr = new float[length];
        float f = 0.0f;
        float f2 = 255.0f;
        for (int i = 0; i < bArrB.length; i++) {
            float f3 = (bArrB[i] & 255) / 255.0f;
            fArr[i] = f3;
            double d = f3;
            if (d < 0.5d) {
                fArr[i] = 2.0f * f3 * f3;
            } else if (d > 0.5d) {
                float f4 = f3 - 1.0f;
                fArr[i] = ((-2.0f) * f4 * f4) + 1.0f;
            }
            float f5 = fArr[i];
            if (f5 > f) {
                f = f5;
            }
            if (f5 < f2) {
                f2 = f5;
            }
        }
        float f6 = f - f2;
        if (Math.abs(f6) >= 0.001d) {
            byte[] bArr = new byte[bArrB.length];
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = (byte) (((int) (((fArr[i2] - f2) / f6) * 255.0f)) & 255);
            }
            return new p(new e4(new e6(bArr, pVar.e(), pVar.c(), 0, 0, pVar.e(), pVar.c(), false)));
        }
        throw a.a();
    }

    public p f(p pVar) {
        if (this.n == null) {
            this.n = h(pVar);
        }
        return this.n;
    }

    public static p a(p pVar) {
        byte[] bArrB = pVar.a().c().b();
        if (bArrB == null || bArrB.length <= 0) {
            return pVar;
        }
        byte[] bArr = new byte[bArrB.length];
        for (int i = 0; i < bArrB.length; i++) {
            bArr[i] = (byte) (p[bArrB[i] & 255] & 255);
        }
        return new p(new e4(new e6(bArr, pVar.e(), pVar.c(), 0, 0, pVar.e(), pVar.c(), false)));
    }

    public p a(p pVar, float f) {
        if (this.f16213a == null) {
            if (r3.f16300a) {
                this.f16213a = l4.a(r3.f16301b, pVar, f);
            } else {
                this.f16213a = l4.a(pVar, f);
            }
        }
        return this.f16213a;
    }
}
