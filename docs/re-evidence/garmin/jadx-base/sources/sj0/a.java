package sj0;

import android.content.Context;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: sj0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3019a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159440a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.MESSAGING_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.LIVE_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.LIVE_TRACK_PLUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.GARMIN_TRAILS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.SOCIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q.ADVANCED_REPORTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q.TRAINING_MEDIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q.MAPS_3D.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q.NUTRITION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q.EXCLUSIVE_OFFERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q.PROFILE_IMAGE_FRAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q.ANNUAL_REPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q.LIVE_TRACK_SMS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f159440a = iArr;
        }
    }

    public static final int a(q qVar) {
        qVar.getClass();
        switch (C3019a.f159440a[qVar.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 9;
            case 6:
                return 3;
            case 7:
                return 8;
            case 8:
                return 7;
            case 9:
                return 2;
            case 10:
                return 10;
            case 11:
            case 12:
            case 13:
                return 0;
            default:
                u0.r();
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    public static final we0.a b(q qVar, Context context) {
        String string;
        String str;
        qVar.getClass();
        context.getClass();
        switch (C3019a.f159440a[qVar.ordinal()]) {
            case 1:
                string = context.getString(R.string.active_intelligence);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 2:
                string = context.getString(R.string.live_activity);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 3:
                string = context.getString(R.string.title_live_track);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 4:
                string = context.getString(R.string.lbl_garmin_trails);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 5:
                string = context.getString(R.string.badge_challenges);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 6:
                string = context.getString(R.string.performance_dashboard);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 7:
                string = context.getString(R.string.training_guidance);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 8:
                string = context.getString(R.string.map_3d_label);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 9:
                string = context.getString(R.string.lbl_nutrition);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 10:
                string = context.getString(R.string.exclusive_offers);
                str = string;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            case 11:
            case 12:
            case 13:
                str = null;
                if (str == null) {
                    return null;
                }
                return new we0.a(qVar.f25548a, str, null, 4, null);
            default:
                u0.r();
                return null;
        }
    }
}
