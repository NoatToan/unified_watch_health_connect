package rf2;

import com.garmin.proto.generated.GDIDataTypes;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152462a;

    static {
        int[] iArr = new int[GDIDataTypes.MeasurementUnit.values().length];
        try {
            iArr[GDIDataTypes.MeasurementUnit.METRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GDIDataTypes.MeasurementUnit.STATUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f152462a = iArr;
    }
}
