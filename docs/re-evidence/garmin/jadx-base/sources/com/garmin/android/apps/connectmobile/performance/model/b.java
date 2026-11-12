package com.garmin.android.apps.connectmobile.performance.model;

import com.garmin.android.apps.connectmobile.R;
import o61.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rBO\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/b;", "", "", "statusIcon", "statusColor", "iconBackgroundColor", "statusIconColor", "statusLabel", "statusHelpText", "Lo61/d;", "iconColorType", "<init>", "(Ljava/lang/String;IIIIIIILo61/d;)V", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    PEAKING(R.drawable.icon_training_status_peaking, R.color.gcm_training_status_peaking, R.color.gcm_training_status_peaking, R.color.gray_15_static, R.string.lbl_peaking, R.string.training_status_peaking_help_text, null, 64, null),
    PRODUCTIVE(R.drawable.icon_training_status_productive, R.color.gcm_training_status_productive, R.color.gcm_training_status_productive, R.color.gray_15_static, R.string.lbl_productive, R.string.training_status_productive_help_text, null, 64, null),
    MAINTAINING(R.drawable.icon_training_status_maintaining, R.color.gcm_training_status_maintaining, R.color.gcm_training_status_maintaining, R.color.gray_70_static, R.string.lbl_maintaining, R.string.training_status_maintaining_help_text, null, 64, null),
    RECOVERY(R.drawable.icon_training_status_recovery, R.color.gcm_training_status_recovery, R.color.gcm_training_status_recovery, R.color.gray_15_static, R.string.activities_training_effect_recovery, R.string.training_status_recovery_help_text, null, 64, null),
    UNPRODUCTIVE(R.drawable.icon_training_status_unproductive, R.color.gcm_training_status_unproductive, R.color.gcm_training_status_unproductive, R.color.gray_15_static, R.string.lbl_unproductive_short, R.string.training_status_unproductive_help_text, null, 64, null),
    DETRAINING(R.drawable.icon_training_status_detraining, R.color.gcm_training_status_detraining, R.color.gcm_training_status_detraining, R.color.gray_15_static, R.string.lbl_detraining_short, R.string.training_status_detraining_help_text, null, 64, null),
    OVERREACHING(R.drawable.icon_training_status_overreaching, R.color.gcm_training_status_overreaching, R.color.gcm_training_status_overreaching, R.color.gray_15_static, R.string.aerobic_overreaching, R.string.training_status_overreaching_help_text, null, 64, null),
    UNKNOWN(R.drawable.icon_training_status_nostatus, R.color.palette_transparent, R.color.gcm_training_status_no_status, R.color.gcm_training_status_no_status_icon, R.string.lbl_no_status, R.string.training_status_no_status_help_text, null, 64, null),
    PAUSE(R.drawable.icon_training_status_paused, R.color.palette_transparent, R.color.gcm_training_status_paused, R.color.gcm_icon_primary, R.string.common_paused, R.string.training_status_paused_desc, d.OUTLINE),
    STRAINED(R.drawable.icon_training_status_strained, R.color.gcm_training_status_strained, R.color.gcm_training_status_strained, R.color.gray_15_static, R.string.lbl_strained, R.string.training_status_strained_desc, 0 == true ? 1 : 0, 64, null),
    NO_DATA(R.drawable.icon_training_status_no_data, R.color.palette_transparent, R.color.gcm_training_status_no_data, R.color.gcm_icon_primary, R.string.no_data_label, R.string.training_status_no_status_help_text, d.DASHED_OUTLINE);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f39921h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f39940g;

    /* synthetic */ b(int i14, int i15, int i16, int i17, int i18, int i19, d dVar, int i24, j jVar) {
        this(i14, i15, i16, i17, i18, i19, (i24 & 64) != 0 ? d.FILL_COLOR : dVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/b$a;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.model.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0735a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39941a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.PEAKING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.PRODUCTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.MAINTAINING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.RECOVERY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.UNPRODUCTIVE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.DETRAINING.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.OVERREACHING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b.PAUSE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[b.STRAINED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[b.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[b.NO_DATA.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                f39941a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(double d14, Boolean bool) {
            if (Double.isNaN(d14)) {
                return b.NO_DATA;
            }
            if (bool.equals(Boolean.TRUE)) {
                return b.PAUSE;
            }
            switch ((int) d14) {
                case 0:
                    return b.UNKNOWN;
                case 1:
                    return b.DETRAINING;
                case 2:
                    return b.UNPRODUCTIVE;
                case 3:
                    return b.OVERREACHING;
                case 4:
                    return b.MAINTAINING;
                case 5:
                    return b.RECOVERY;
                case 6:
                    return b.PEAKING;
                case 7:
                    return b.PRODUCTIVE;
                case 8:
                    return b.STRAINED;
                default:
                    return b.UNKNOWN;
            }
        }

        public static /* synthetic */ b b(a aVar, double d14) {
            Boolean bool = Boolean.FALSE;
            aVar.getClass();
            return a(d14, bool);
        }

        private a() {
        }
    }

    b(int i14, int i15, int i16, int i17, int i18, int i19, d dVar) {
        this.f39934a = i14;
        this.f39935b = i15;
        this.f39936c = i16;
        this.f39937d = i17;
        this.f39938e = i18;
        this.f39939f = i19;
        this.f39940g = dVar;
    }
}
