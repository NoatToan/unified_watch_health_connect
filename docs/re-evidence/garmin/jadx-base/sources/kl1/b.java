package kl1;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import tf2.g;
import zf2.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkl1/b;", "Lkl1/a;", "Ltf2/g;", "activityInfoDataSource", "<init>", "(Ltf2/g;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements kl1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f105262a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105263a;

        static {
            int[] iArr = new int[il1.a.values().length];
            try {
                iArr[il1.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[il1.a.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[il1.a.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[il1.a.GYM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[il1.a.WINTER_SPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[il1.a.WATER_SPORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[il1.a.TEAM_SPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[il1.a.RACKET_SPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[il1.a.OUTDOOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[il1.a.OTHER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f105263a = iArr;
        }
    }

    public b(g gVar) {
        gVar.getClass();
        this.f105262a = gVar;
    }

    @Override // kl1.a
    public final String a(d dVar) {
        dVar.getClass();
        return this.f105262a.d(dVar);
    }

    @Override // kl1.a
    public final int b(il1.a aVar) {
        aVar.getClass();
        switch (a.f105263a[aVar.ordinal()]) {
            case 1:
                return R.string.lbl_running;
            case 2:
                return R.string.lbl_cycling;
            case 3:
                return R.string.lbl_swimming;
            case 4:
                return R.string.lbl_gym;
            case 5:
                return R.string.lbl_winter_sports;
            case 6:
                return R.string.lbl_water_sports;
            case 7:
                return R.string.lbl_team_sports;
            case 8:
                return R.string.lbl_racket_sports;
            case 9:
                return R.string.device_category_outdoor;
            case 10:
                return R.string.lbl_other;
            default:
                u0.r();
                return 0;
        }
    }

    @Override // kl1.a
    public final u4.d c(d dVar) {
        dVar.getClass();
        return this.f105262a.c(dVar.f204629a);
    }
}
