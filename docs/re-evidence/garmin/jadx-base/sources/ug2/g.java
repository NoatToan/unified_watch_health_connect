package ug2;

import com.garmin.proto.generated.GDILiveSessionProto;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f170772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f170773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f170774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f170775d;

    static {
        int[] iArr = new int[GDILiveSessionProto.ActivityAlertMessage.Size.values().length];
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_TINY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_XSMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_MEDIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_LARGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_XLARGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[GDILiveSessionProto.ActivityAlertMessage.Size.SIZE_UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f170772a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[c.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c.BOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f170773b = iArr2;
        int[] iArr3 = new int[GDILiveSessionProto.ActivityAlertMessage.Weight.values().length];
        try {
            iArr3[GDILiveSessionProto.ActivityAlertMessage.Weight.WEIGHT_REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[GDILiveSessionProto.ActivityAlertMessage.Weight.WEIGHT_BOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[GDILiveSessionProto.ActivityAlertMessage.Weight.WEIGHT_MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[GDILiveSessionProto.ActivityAlertMessage.Weight.WEIGHT_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        f170774c = iArr3;
        int[] iArr4 = new int[GDILiveSessionProto.ActivityAlertRequest.Type.values().length];
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.DISTANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.RUN.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.WALK.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.POWER.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.SPEED.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.PACE.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.HR.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.CALORIES.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.ELEVATION.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.CADENCE_SPM.ordinal()] = 11;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.CADENCE_RPM.ordinal()] = 12;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.TIME.ordinal()] = 13;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.LAP.ordinal()] = 14;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.CLIMB.ordinal()] = 15;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.STROKE_RATE_INDOOR.ordinal()] = 16;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.STROKE_RATE_OUTDOOR.ordinal()] = 17;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.NAVIGATION.ordinal()] = 18;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[GDILiveSessionProto.ActivityAlertRequest.Type.PHASE.ordinal()] = 19;
        } catch (NoSuchFieldError unused33) {
        }
        f170775d = iArr4;
    }
}
