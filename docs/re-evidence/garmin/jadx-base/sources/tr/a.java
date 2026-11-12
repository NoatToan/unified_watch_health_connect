package tr;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import im.n;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltr/a;", "Ltr/g;", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f166116b;

    /* JADX INFO: renamed from: tr.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3126a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166117a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.SEATED_STANDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.AUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.LUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f166117a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l22.b bVar) {
        super(bVar);
        bVar.getClass();
        this.f166116b = n.SEATED_STANDING;
    }

    @Override // tr.g
    public final String b(int i14, Double d14) {
        if (!Double.isNaN(d14.doubleValue())) {
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            l22.b bVar = this.f166119a;
            String strY1 = l3.a.y1(bVar, dDoubleValue, true, "");
            int i15 = C3126a.f166117a[this.f166116b.ordinal()];
            if (i15 != 1) {
                if (i15 != 2 && i15 != 3) {
                    u0.r();
                    return null;
                }
                if (i14 == 1) {
                    return bVar.a(R.string.lbl_less_than_number, strY1);
                }
                if (i14 == 2) {
                    return bVar.a(R.string.lbl_greater_than_number, strY1);
                }
            }
        }
        return "";
    }

    @Override // tr.g
    public final String e(int i14) {
        int i15 = C3126a.f166117a[this.f166116b.ordinal()];
        l22.b bVar = this.f166119a;
        if (i15 == 1) {
            return i14 == 1 ? bVar.getString(R.string.activity_details_seated) : bVar.getString(R.string.activity_details_standing);
        }
        if (i15 == 2) {
            if (i14 != 1) {
                return i14 != 2 ? bVar.getString(R.string.activity_details_standing) : bVar.getString(R.string.lbl_upright);
            }
            return bVar.getString(R.string.lbl_aero);
        }
        if (i15 != 3) {
            u0.r();
            return null;
        }
        if (i14 != 1) {
            return i14 != 2 ? bVar.getString(R.string.activity_details_standing) : bVar.getString(R.string.lbl_upright);
        }
        return bVar.getString(R.string.lbl_lowered);
    }

    @Override // tr.g
    public final Integer f(int i14) {
        return null;
    }
}
