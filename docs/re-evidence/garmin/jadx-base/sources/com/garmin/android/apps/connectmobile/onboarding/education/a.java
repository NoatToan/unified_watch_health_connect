package com.garmin.android.apps.connectmobile.onboarding.education;

import android.text.style.ClickableSpan;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/a;", "", "<init>", "()V", "b", "c", "d", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0714a f39696a = new C0714a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f39697b = x.m(d.BIKE_ALARM_1, d.BIKE_ALARM_2, d.BIKE_ALARM_3);

    public interface b {
        void a(long j8);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/a$d;", "", "", "imageResId", "featureTitleResId", "featureDescriptionResId", "<init>", "(Ljava/lang/String;IIII)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        BIKE_ALARM_1(R.raw.onboarding_bike_alarm_one, R.string.lbl_bike_alarm, R.string.bike_alarm_brief_description),
        BIKE_ALARM_2(R.raw.onboarding_bike_alarm_two, R.string.lbl_how_it_works, R.string.bike_alarm_how_it_works_description),
        BIKE_ALARM_3(R.raw.onboarding_bike_alarm_three, R.string.onboarding_bike_alarm_page_three_title, R.string.bike_alarm_theft_deterrent_description);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39713c;

        d(int i14, int i15, int i16) {
            this.f39711a = i14;
            this.f39712b = i15;
            this.f39713c = i16;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/a$c;", "", "", "showFooter", "", "footerTextResId", "Lcom/garmin/android/apps/connectmobile/onboarding/education/a$b;", "onFeatureComplete", "Landroid/text/style/ClickableSpan;", "clickableSpan", "numberOfCharFromEnd", "<init>", "(Ljava/lang/String;IZILcom/garmin/android/apps/connectmobile/onboarding/education/a$b;Landroid/text/style/ClickableSpan;I)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        BIKE_ALARM(false, -1, com.garmin.android.apps.connectmobile.onboarding.education.b.f39714a, null, 0, 16, null);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0716a f39699f = new C0716a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f39702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f39704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ClickableSpan f39705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f39706e;

        /* synthetic */ c(boolean z14, int i14, b bVar, ClickableSpan clickableSpan, int i15, int i16, j jVar) {
            this(z14, i14, bVar, clickableSpan, (i16 & 16) != 0 ? 0 : i15);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.onboarding.education.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/a$c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0716a {
            public /* synthetic */ C0716a(j jVar) {
                this();
            }

            private C0716a() {
            }
        }

        c(boolean z14, int i14, b bVar, ClickableSpan clickableSpan, int i15) {
            this.f39702a = z14;
            this.f39703b = i14;
            this.f39704c = bVar;
            this.f39705d = clickableSpan;
            this.f39706e = i15;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.onboarding.education.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/a$a;", "", "<init>", "()V", "", "Lcom/garmin/android/apps/connectmobile/onboarding/education/a$d;", "bikeAlarmEducationPages", "Ljava/util/List;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0714a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.onboarding.education.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0715a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39698a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.BIKE_ALARM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f39698a = iArr;
            }
        }

        public /* synthetic */ C0714a(j jVar) {
            this();
        }

        private C0714a() {
        }
    }
}
