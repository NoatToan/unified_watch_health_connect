package s90;

import ca0.o1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls90/b;", "", "Lx80/b;", "delegate", "<init>", "(Lx80/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x80.b f158026a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f158028b;

        static {
            int[] iArr = new int[u90.a.values().length];
            try {
                iArr[u90.a.PROFILE_DETAILS_INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u90.a.PROFILE_PICTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u90.a.GENDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u90.a.HEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u90.a.WEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u90.a.BIRTHDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u90.a.ACTIVITY_LEVEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u90.a.WHEELCHAIR_ACTIVITY_LEVEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u90.a.SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u90.a.SLEEP_ADVANCED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u90.a.BOTTOM_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u90.a.USER_SHORT_NAME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f158027a = iArr;
            int[] iArr2 = new int[o1.values().length];
            try {
                iArr2[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[o1.ADD_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f158028b = iArr2;
        }
    }

    public b(x80.b bVar) {
        bVar.getClass();
        this.f158026a = bVar;
    }
}
