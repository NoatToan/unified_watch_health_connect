package com.huawei.hms.scankit.p;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.share.HiHealthError;
import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16449a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f16450b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE}, new int[]{28, 24, 185, MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE, 223, 248, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, 97, 178, 100, InterfaceHiMap.POLY_LINE_MAX_SIZE}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, Constants.MAX_PRO_BOTTOM_MARGIN_PAD, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, TsExtractor.TS_PACKET_SIZE, 75, 66, 61, 241, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 129, 94, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE, 225, 48, 90, TsExtractor.TS_PACKET_SIZE}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, TsExtractor.TS_PACKET_SIZE, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, TsExtractor.TS_STREAM_TYPE_AC4}, new int[]{52, 190, 88, 205, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, TsExtractor.TS_STREAM_TYPE_AC4, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE, 124, 12, 181, 184, 96, 50, 193}, new int[]{com.huawei.hms.kit.awareness.barrier.internal.e.a.D, 231, 43, 97, 71, 96, 103, 174, 37, HiHealthError.ERR_WRONG_DEVICE, 170, 53, 75, 34, 249, 121, 17, 138, 110, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, 141, TsExtractor.TS_STREAM_TYPE_DTS_HD, 120, HiHealthError.ERR_WRONG_DEVICE, 233, 168, 93, 255}, new int[]{245, 127, InterfaceHiMap.POLY_LINE_MAX_SIZE, 218, 130, 250, MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY, 181, 102, 120, 84, 179, HeartRateThresholdConfig.HEART_RATE_LIMIT, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, Constants.MAX_PRO_BOTTOM_MARGIN_PAD, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL, InterfaceHiMap.POLY_LINE_MAX_SIZE, 8, 175, 95, 100, 9, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY, 105, com.huawei.hms.kit.awareness.barrier.internal.e.a.M, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, UserInfomation.WEIGHT_DEFAULT_ENGLISH, TsExtractor.TS_STREAM_TYPE_AC4, 223, 96, 32, 117, 22, 238, OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL, 238, 231, 205, TsExtractor.TS_PACKET_SIZE, FitnessSleepType.HW_FITNESS_NOON, 87, 191, 106, 16, 147, AgrConstant.HEALTH_AGREEMENT_CODE, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, HeartRateThresholdConfig.HEART_RATE_LIMIT, com.huawei.hms.kit.awareness.barrier.internal.e.a.z, 100, 29, 175, 170, 230, PsExtractor.AUDIO_STREAM, com.huawei.hms.kit.awareness.barrier.internal.e.a.N, 235, 150, 159, 36, 223, 38, 200, UserInfomation.WEIGHT_DEFAULT_ENGLISH, 54, 228, 146, 218, FitnessSleepType.HW_FITNESS_WAKE, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, com.huawei.hms.kit.awareness.barrier.internal.e.a.w, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{InterfaceHiMap.POLY_LINE_MAX_SIZE, 93, 169, 50, 144, com.huawei.hms.kit.awareness.barrier.internal.e.a.C, 39, AgrConstant.HEALTH_AGREEMENT_CODE, 202, TsExtractor.TS_PACKET_SIZE, 201, PsExtractor.PRIVATE_STREAM_1, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, FitnessSportType.HW_FITNESS_SPORT_ALL, 175, 64, 114, 71, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, TsExtractor.TS_PACKET_SIZE, 17, MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT, 31, 176, 170, 4, 107, 232, 7, 94, MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE, 224, 124, 86, 47, 11, 204}, new int[]{HeartRateThresholdConfig.HEART_RATE_LIMIT, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, TsExtractor.TS_STREAM_TYPE_DTS_HD, 248, 180, FitnessSleepType.HW_FITNESS_WAKE, 197, 158, 177, 68, 122, 93, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, 15, 160, 227, FitnessSleepType.HW_FITNESS_DREAM, 66, 139, 153, 185, 202, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY, 179, 25, HeartRateThresholdConfig.HEART_RATE_LIMIT, 232, 96, com.huawei.hms.kit.awareness.barrier.internal.e.a.C, 231, TsExtractor.TS_STREAM_TYPE_DTS_HD, 223, 239, 181, 241, 59, 52, TsExtractor.TS_STREAM_TYPE_AC4, 25, 49, 232, com.huawei.hms.kit.awareness.barrier.internal.e.a.D, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, 153, UserInfomation.WEIGHT_DEFAULT_ENGLISH, 63, 96, 103, 82, 186}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16451c = new int[256];
    private static final int[] d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            int[] iArr = d;
            if (w7.a(iArr, i2)) {
                iArr[i2] = i;
            }
            int[] iArr2 = f16451c;
            if (w7.a(iArr2, i)) {
                iArr2[i] = i2;
            }
            i *= 2;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private static String a(CharSequence charSequence, int i) {
        return a(charSequence, 0, charSequence.length(), i);
    }

    private static String a(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            int[] iArr = f16449a;
            if (i6 >= iArr.length) {
                i6 = -1;
                break;
            }
            if (iArr[i6] == i3) {
                break;
            }
            i6++;
        }
        if (i6 >= 0) {
            int[] iArr2 = f16450b[i6];
            char[] cArr = new char[i3];
            for (int i7 = 0; i7 < i3; i7++) {
                cArr[i7] = 0;
            }
            for (int i8 = i; i8 < i + i2; i8++) {
                int i9 = i3 - 1;
                int iCharAt = cArr[i9] ^ charSequence.charAt(i8);
                while (i9 > 0) {
                    if (iCharAt != 0 && (i5 = iArr2[i9]) != 0) {
                        char c2 = cArr[i9 - 1];
                        int[] iArr3 = d;
                        int[] iArr4 = f16451c;
                        cArr[i9] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i5]) % 255] ^ c2);
                    } else {
                        cArr[i9] = cArr[i9 - 1];
                    }
                    i9--;
                }
                if (iCharAt != 0 && (i4 = iArr2[0]) != 0) {
                    int[] iArr5 = d;
                    int[] iArr6 = f16451c;
                    cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i4]) % 255];
                } else {
                    cArr[0] = 0;
                }
            }
            char[] cArr2 = new char[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                cArr2[i10] = cArr[(i3 - i10) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: " + i3);
    }

    public static String a(String str, d7 d7Var) {
        if (str.length() == d7Var.a()) {
            StringBuilder sb = new StringBuilder(d7Var.a() + d7Var.b());
            sb.append(str);
            int iD = d7Var.d();
            if (iD == 1) {
                sb.append(a(str, d7Var.b()));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[iD];
                int[] iArr2 = new int[iD];
                int[] iArr3 = new int[iD];
                int i = 0;
                while (i < iD) {
                    int i2 = i + 1;
                    iArr[i] = d7Var.a(i2);
                    iArr2[i] = d7Var.b(i2);
                    iArr3[i] = 0;
                    if (i > 0) {
                        iArr3[i] = iArr3[i - 1] + iArr[i];
                    }
                    i = i2;
                }
                for (int i3 = 0; i3 < iD; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < d7Var.a(); i4 += iD) {
                        sb2.append(str.charAt(i4));
                    }
                    String strA = a(sb2.toString(), iArr2[i3]);
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < iArr2[i3] * iD) {
                        sb.setCharAt(d7Var.a() + i5, strA.charAt(i6));
                        i5 += iD;
                        i6++;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}
