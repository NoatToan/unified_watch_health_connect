package i62;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.q;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li62/g;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f91848a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91849a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.MOUNTAIN_BIKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.SNOW_SKIING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q.SNOWBOARDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q.SURFING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q.HIKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q.PADDLE_SPORTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q.RACQUET_SPORTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q.GOLF.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q.RUCKING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f91849a = iArr;
        }
    }

    public g(l22.b bVar) {
        bVar.getClass();
        this.f91848a = bVar;
    }

    public final String a(String str) {
        Object next;
        int i14;
        str.getClass();
        q.f48295b.getClass();
        Iterator<T> it = q.f48309p.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((q) next).f48310a, str));
        q qVar = (q) next;
        if (qVar == null) {
            return "";
        }
        switch (a.f91849a[qVar.ordinal()]) {
            case 1:
                i14 = R.string.lbl_running;
                break;
            case 2:
                i14 = R.string.lbl_cycling;
                break;
            case 3:
                i14 = R.string.lbl_swimming;
                break;
            case 4:
                i14 = R.string.lbl_mountain_biking;
                break;
            case 5:
                i14 = R.string.lbl_snow_skiing;
                break;
            case 6:
                i14 = R.string.lbl_snowboarding;
                break;
            case 7:
                i14 = R.string.lbl_surfing;
                break;
            case 8:
                i14 = R.string.lbl_hiking;
                break;
            case 9:
                i14 = R.string.lbl_paddle_sports;
                break;
            case 10:
                i14 = R.string.lbl_racquet_sports;
                break;
            case 11:
                i14 = R.string.lbl_golf;
                break;
            case 12:
                i14 = R.string.lbl_rucking;
                break;
            default:
                u0.r();
                return null;
        }
        return this.f91848a.getString(i14);
    }
}
