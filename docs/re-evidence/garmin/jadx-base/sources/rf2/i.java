package rf2;

import com.garmin.proto.generated.GDILiveSessionProto;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152489a;

        static {
            int[] iArr = new int[GDILiveSessionProto.WorkoutInfo.Type.values().length];
            try {
                iArr[GDILiveSessionProto.WorkoutInfo.Type.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDILiveSessionProto.WorkoutInfo.Type.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152489a = iArr;
        }
    }
}
