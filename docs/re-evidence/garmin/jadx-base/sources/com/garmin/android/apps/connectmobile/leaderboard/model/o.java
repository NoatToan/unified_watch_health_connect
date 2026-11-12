package com.garmin.android.apps.connectmobile.leaderboard.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/o;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum o {
    RUNNING_DISTANCE(1),
    CYCLING_DISTANCE(2),
    SWIMMING_DISTANCE(3),
    WELLNESS_STEPS_COUNT(4),
    WELLNESS_STEPS_DISTANCE(5),
    YOGA(6),
    STRENGTH(7),
    HIKING(8),
    FITNESS(9),
    /* JADX INFO: Fake field, exist only in values array */
    CHALLENGE_COMPOSITE(10),
    CARDIO(11),
    VIRTUAL_HIKE(12),
    VIRTUAL_CLIMB(13),
    SOCIAL(14),
    HEALTH_AND_WELLNESS(15),
    TRIATHLON(17);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38245b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38262a;

    o(int i14) {
        this.f38262a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/o$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.model.o$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0676a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38263a;

            static {
                int[] iArr = new int[o.values().length];
                try {
                    iArr[o.RUNNING_DISTANCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.CYCLING_DISTANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o.SWIMMING_DISTANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[o.WELLNESS_STEPS_COUNT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[o.WELLNESS_STEPS_DISTANCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[o.YOGA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[o.STRENGTH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[o.HIKING.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[o.FITNESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[o.CARDIO.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[o.SOCIAL.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[o.HEALTH_AND_WELLNESS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                f38263a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(Integer num) {
            if (num == null) {
                return null;
            }
            for (o oVar : o.values()) {
                if (oVar.f38262a == num.intValue()) {
                    return oVar;
                }
            }
            return null;
        }

        public static int b(o oVar) {
            switch (oVar == null ? -1 : C0676a.f38263a[oVar.ordinal()]) {
                case 1:
                    return R.string.social_running_challenge;
                case 2:
                    return R.string.social_cycling_challenge;
                case 3:
                    return R.string.social_swimming_challenge;
                case 4:
                    return R.string.social_steps_challenge;
                case 5:
                    return R.string.social_walking_challenge;
                case 6:
                    return R.string.social_yoga_challenge;
                case 7:
                    return R.string.social_strength_challenge;
                case 8:
                    return R.string.social_hiking_challenge;
                case 9:
                    return R.string.social_fitness_challenge;
                case 10:
                    return R.string.social_cardio_challenge;
                case 11:
                    return R.string.social_social_challenge;
                case 12:
                    return R.string.social_health_and_wellness_challenge;
                default:
                    return R.string.challenge_title;
            }
        }

        private a() {
        }
    }
}
