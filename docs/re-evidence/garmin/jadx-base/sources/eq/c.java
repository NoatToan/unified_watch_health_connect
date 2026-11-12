package eq;

import android.content.Context;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import lc.u0;
import oi0.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Leq/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Loi0/h;", "contentDescriptionTimeFormatter", "Lm00/c;", "formatter", "<init>", "(Landroid/content/Context;Loi0/h;Lm00/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f65020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m00.c f65021c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65022a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f65028c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f65029d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f65030e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f65031f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f65032g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.f65033h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.f65034i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f65022a = iArr;
        }
    }

    public c(Context context, h hVar, m00.c cVar) {
        context.getClass();
        hVar.getClass();
        cVar.getClass();
        this.f65019a = context;
        this.f65020b = hVar;
        this.f65021c = cVar;
    }

    public static Integer a(e eVar, boolean z14) {
        int i14;
        switch (a.f65022a[eVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                if (z14) {
                    i14 = zY ? R.string.common_kph_string : R.string.common_mph_string;
                } else {
                    i14 = (zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR).f23223e;
                }
                return Integer.valueOf(i14);
            case 5:
                return Integer.valueOf(z14 ? R.string.lbl_heart_rate_beats_per_minute : R.string.lbl_bpm);
            case 6:
                return Integer.valueOf(z14 ? R.string.common_watts : R.string.lbl_watts);
            case 7:
                return Integer.valueOf(z14 ? R.string.lbl_revolutions_per_minute : R.string.lbl_rpm);
            default:
                u0.r();
                return null;
        }
    }
}
