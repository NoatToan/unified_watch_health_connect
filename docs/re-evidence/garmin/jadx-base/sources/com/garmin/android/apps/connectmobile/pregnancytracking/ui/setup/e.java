package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/e;", "", "", HeaderParameterNames.AUTHENTICATION_TAG, "", "customNext", "customSkip", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    TERMS_CONDITIONS("TERMS_CONDITIONS", false, false, 6, null),
    DUE_DATE("DUE_DATE", true, false, 4, null),
    HYDRATION_GOALS("HYDRATION_GOALS", true, true),
    WEIGHT_GAIN_GOALS("WEIGHT_GAIN_GOALS", true, false, 4, null),
    INDEX_SCALE("INDEX_SCALE", true, true),
    TRAINING_STATUS("TRAINING_STATUS", true, false, 4, null),
    MOVE_ALERTS("MOVE_ALERTS", true, false, 4, null);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40972d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40983c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40984a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TERMS_CONDITIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.HYDRATION_GOALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.INDEX_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.MOVE_ALERTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40984a = iArr;
        }
    }

    /* synthetic */ e(String str, boolean z14, boolean z15, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/e$a;", "", "<init>", "()V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    e(String str, boolean z14, boolean z15) {
        this.f40981a = str;
        this.f40982b = z14;
        this.f40983c = z15;
    }
}
