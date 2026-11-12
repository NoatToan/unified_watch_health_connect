package vk1;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvk1/d;", "", "<init>", "()V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f178596a = new a(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvk1/d$a;", "", "<init>", "()V", "", "DEFAULT_PWZ_CYCLING_FTP", "I", "DEFAULT_PWZ_RUNNING_FTP", "DEFAULT_PWZ_ROWING_FTP", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: vk1.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3337a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f178597a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.CROSS_COUNTRY_SKIING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.CYCLING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.RUNNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.ROWING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f178597a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a(int i14, int i15) {
            return MathKt.c((i14 / 100) * i15);
        }

        public static int b(int i14, e eVar) {
            int i15 = eVar == null ? -1 : C3337a.f178597a[eVar.ordinal()];
            if (i15 == 1) {
                return a(60, i14);
            }
            if (i15 == 2 || i15 == 3 || i15 != 4) {
                return 200;
            }
            return SyslogConstants.LOG_LOCAL4;
        }

        public static e c(PowerZonesDTO powerZonesDTO) {
            String str;
            if (powerZonesDTO != null && (str = powerZonesDTO.f43986a) != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    try {
                        return e.valueOf(str);
                    } catch (IllegalArgumentException e4) {
                        sn.a.s("getSportEnum: ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "PowerZonesUtil");
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }
}
