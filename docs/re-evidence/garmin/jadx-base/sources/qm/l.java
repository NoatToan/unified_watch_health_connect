package qm;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm/l;", "Lqm/l0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public im.n f145396a = im.n.SEATED_STANDING;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145397a;

        static {
            int[] iArr = new int[im.n.values().length];
            try {
                iArr[im.n.SEATED_STANDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[im.n.AUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[im.n.LUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145397a = iArr;
        }
    }

    @Override // qm.l0
    public final List a() {
        Integer numValueOf = Integer.valueOf(R.color.gds_data_viz_yellow_primary);
        Integer numValueOf2 = Integer.valueOf(R.color.gds_data_viz_teal_primary);
        int i14 = a.f145397a[this.f145396a.ordinal()];
        if (i14 == 1) {
            return p13.x.d(Integer.valueOf(R.color.gds_data_viz_orange_primary), numValueOf2);
        }
        if (i14 == 2) {
            return p13.x.d(Integer.valueOf(R.color.gds_data_viz_violet_primary), numValueOf, numValueOf2);
        }
        if (i14 == 3) {
            return p13.x.d(Integer.valueOf(R.color.gds_data_viz_purple_primary), numValueOf, numValueOf2);
        }
        u0.r();
        return null;
    }

    @Override // qm.l0
    public final int b() {
        return R.string.lbl_empty_string;
    }
}
