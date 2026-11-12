package ks0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lks0/a;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f106377a;

    /* JADX INFO: renamed from: ks0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2054a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106378a;

        static {
            int[] iArr = new int[yr0.a.values().length];
            try {
                iArr[yr0.a.DECREASE_DUE_TO_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yr0.a.NOT_CHANGED_DUE_TO_SLEEP_BEFORE_TRAVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yr0.a.DECREASE_DUE_TO_LINEAR_MODEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yr0.a._0_DURING_TRAVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yr0.a.INCREASE_DUE_TO_SLEEP_BEFORE_NEXT_TRAVEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yr0.a.NOT_CHANGED_DUE_TO_SLEEP_BEFORE_NEXT_TRAVEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yr0.a.DIRECTION_CHANGED_WESTWARD_DUE_TO_SLEEP_BEFORE_NEXT_TRAVEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[yr0.a.DIRECTION_CHANGED_EASTWARD_DUE_TO_SLEEP_BEFORE_NEXT_TRAVEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[yr0.a.FIRST_DAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[yr0.a.CHANGED_DUE_TO_TIME_ZONE_CHANGE_AT_LEAST_3_H.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[yr0.a.CHANGED_DUE_TO_TIME_ZONE_CHANGE_LESS_THAN_3_H.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f106378a = iArr;
        }
    }

    public a(l22.b bVar) {
        bVar.getClass();
        this.f106377a = bVar;
    }
}
