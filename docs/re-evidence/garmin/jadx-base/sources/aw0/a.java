package aw0;

import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import l22.b;
import p005kotlin.Metadata;
import pv0.r;
import pv0.w;
import w13.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Law0/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13319a;

    /* JADX INFO: renamed from: aw0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0187a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13320a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.OVERNIGHT_STRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.OVERNIGHT_HRV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.SLEEP_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13320a = iArr;
        }
    }

    public a(b bVar) {
        bVar.getClass();
        this.f13319a = bVar;
    }

    public final String a(Long l14, String str) {
        Object next;
        c cVar = w.T0;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (true) {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
            long j8 = ((w) next).f141457a;
            if (l14 != null && j8 == l14.longValue()) {
                break;
            }
        }
        w wVar = (w) next;
        if (wVar == null) {
            return str == null ? "" : str;
        }
        zv0.a.f207158a.getClass();
        return zv0.a.b(wVar, this.f13319a);
    }

    public final String b(int i14, String str, String str2) {
        str.getClass();
        str2.getClass();
        b bVar = this.f13319a;
        if (i14 == -1) {
            return bVar.getString(R.string.msg_feedback_not_enough_logged);
        }
        String string = bVar.getString(i14);
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        return bVar.a(R.string.lbl_overall_impact_message, lowerCase, str, lowerCase2);
    }

    public final String c(Integer num) {
        return num == null ? this.f13319a.getString(R.string.no_value_card) : String.valueOf(num.intValue());
    }
}
