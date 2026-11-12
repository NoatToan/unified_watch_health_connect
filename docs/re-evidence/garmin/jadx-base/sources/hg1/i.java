package hg1;

import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhg1/i;", "", "Lzb0/u0;", "garminDeviceEnum", "Lcom/garmin/android/apps/connectmobile/settings/devices/e$a;", "sport", "<init>", "(Lzb0/u0;Lcom/garmin/android/apps/connectmobile/settings/devices/e$a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f83687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83688b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83689a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.DATA_FIELD_PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.DATA_FIELD_PACE_AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.DATA_FIELD_PACE_LAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.DATA_FIELD_SPEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.DATA_FIELD_SPEED_AVG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.DATA_FIELD_SPEED_LAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f83689a = iArr;
        }
    }

    public i(u0 u0Var, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar) {
        u0Var.getClass();
        aVar.getClass();
        this.f83688b = (aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING || aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING) && u0Var == u0.T1 && !bo1.a.a().c().z();
    }
}
