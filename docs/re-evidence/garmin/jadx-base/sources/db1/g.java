package db1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ldb1/g;", "Lww0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g implements ww0.f {
    GENERAL,
    KICKS,
    HICCUPS,
    OTHER;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59011a = new a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59017a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.KICKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.HICCUPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f59017a = iArr;
        }
    }

    @Override // ww0.f
    public final String a(Context context) {
        context.getClass();
        int i14 = b.f59017a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.lbl_general);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.pregnancy_kicks);
            string2.getClass();
            return string2;
        }
        if (i14 == 3) {
            String string3 = context.getString(R.string.pregnancy_hiccups);
            string3.getClass();
            return string3;
        }
        if (i14 != 4) {
            u0.r();
            return null;
        }
        String string4 = context.getString(R.string.lbl_other);
        string4.getClass();
        return string4;
    }

    @Override // ww0.f
    public final int b() {
        int i14 = b.f59017a[ordinal()];
        if (i14 == 1) {
            return R.raw.icon_pregnany_baby_movememnt_general;
        }
        if (i14 == 2) {
            return R.raw.icon_pregnany_baby_movememnt_kicks;
        }
        if (i14 == 3) {
            return R.raw.icon_pregnany_baby_movememnt_hiccups;
        }
        if (i14 == 4) {
            return R.raw.icon_pregnany_baby_movememnt_general;
        }
        u0.r();
        return 0;
    }

    public final int c() {
        int i14 = b.f59017a[ordinal()];
        if (i14 == 1) {
            return R.color.palette_blue_26;
        }
        if (i14 == 2) {
            return R.color.pregnancy_baby_movement_kick;
        }
        if (i14 == 3) {
            return R.color.pregnancy_baby_movement_hiccups;
        }
        if (i14 == 4) {
            return R.color.gray_45_static;
        }
        u0.r();
        return 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb1/g$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
