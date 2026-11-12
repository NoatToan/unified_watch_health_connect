package cg1;

import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsActivity f27151b;

    public /* synthetic */ j(SegmentDetailsActivity segmentDetailsActivity, int i14) {
        this.f27150a = i14;
        this.f27151b = segmentDetailsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        bg1.a aVar;
        int i14 = this.f27150a;
        SegmentDetailsActivity segmentDetailsActivity = this.f27151b;
        int i15 = 1;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                SegmentDetailsActivity.a aVar2 = SegmentDetailsActivity.Z;
                g3Var.getClass();
                fw.p pVar = g3Var.f35300a;
                SegmentLeaderboardDTO segmentLeaderboardDTO = (SegmentLeaderboardDTO) g3Var.f35301b;
                int i16 = SegmentDetailsActivity.b.f41415b[pVar.ordinal()];
                if (i16 == 1) {
                    segmentDetailsActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    segmentDetailsActivity.hideProgressOverlay();
                    segmentDetailsActivity.f41406q = segmentLeaderboardDTO;
                    if (!segmentDetailsActivity.isFinishing() && segmentDetailsActivity.A) {
                        segmentDetailsActivity.ta(segmentDetailsActivity.f41406q, segmentDetailsActivity.X);
                    }
                    segmentDetailsActivity.B = true;
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    segmentDetailsActivity.hideProgressOverlay();
                    lj0.b bVar = lj0.b.f112956j;
                    bVar.getClass();
                    g22.a.b(segmentDetailsActivity, bVar);
                }
                return Unit.INSTANCE;
            case 1:
                SegmentDetailsActivity.a aVar3 = SegmentDetailsActivity.Z;
                g3Var.getClass();
                fw.p pVar2 = g3Var.f35300a;
                mo1.d dVar = (mo1.d) g3Var.f35301b;
                int i17 = SegmentDetailsActivity.b.f41415b[pVar2.ordinal()];
                if (i17 == 1) {
                    segmentDetailsActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    segmentDetailsActivity.hideProgressOverlay();
                    segmentDetailsActivity.f41408t = dVar;
                    segmentDetailsActivity.qa();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    segmentDetailsActivity.hideProgressOverlay();
                    lj0.b bVar2 = lj0.b.f112956j;
                    bVar2.getClass();
                    g22.a.b(segmentDetailsActivity, bVar2);
                }
                return Unit.INSTANCE;
            case 2:
                SegmentDetailsActivity.a aVar4 = SegmentDetailsActivity.Z;
                g3Var.getClass();
                int i18 = SegmentDetailsActivity.b.f41415b[g3Var.f35300a.ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        SegmentDetailsDTO segmentDetailsDTO = segmentDetailsActivity.T;
                        segmentDetailsDTO.getClass();
                        segmentDetailsDTO.f17840e = false;
                        SegmentDetailsActivity.Z.getClass();
                        ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).g();
                        SegmentDetailsDTO segmentDetailsDTO2 = segmentDetailsActivity.T;
                        segmentDetailsDTO2.getClass();
                        segmentDetailsActivity.ra(segmentDetailsDTO2.f17840e);
                        if (!segmentDetailsActivity.isFinishing()) {
                            Toast.makeText(segmentDetailsActivity, R.string.activity_unfavorite_general_success_message, 0).show();
                        }
                    } else {
                        if (i18 != 3) {
                            u0.r();
                            return null;
                        }
                        lj0.b bVar3 = lj0.b.f112956j;
                        bVar3.getClass();
                        g22.a.b(segmentDetailsActivity, bVar3);
                        SegmentDetailsDTO segmentDetailsDTO3 = segmentDetailsActivity.T;
                        segmentDetailsDTO3.getClass();
                        segmentDetailsActivity.ra(segmentDetailsDTO3.f17840e);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                SegmentDetailsActivity.a aVar5 = SegmentDetailsActivity.Z;
                g3Var.getClass();
                int i19 = SegmentDetailsActivity.b.f41415b[g3Var.f35300a.ordinal()];
                if (i19 != 1) {
                    if (i19 == 2) {
                        SegmentDetailsDTO segmentDetailsDTO4 = segmentDetailsActivity.T;
                        segmentDetailsDTO4.getClass();
                        segmentDetailsDTO4.f17840e = true;
                        SegmentDetailsDTO segmentDetailsDTO5 = segmentDetailsActivity.T;
                        segmentDetailsDTO5.getClass();
                        segmentDetailsActivity.ra(segmentDetailsDTO5.f17840e);
                        SegmentDetailsActivity.Z.getClass();
                        ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).g();
                        if (!segmentDetailsActivity.isFinishing()) {
                            Toast.makeText(segmentDetailsActivity, R.string.activity_favorite_general_success_message, 0).show();
                        }
                    } else {
                        if (i19 != 3) {
                            u0.r();
                            return null;
                        }
                        lj0.b bVar4 = lj0.b.f112956j;
                        bVar4.getClass();
                        g22.a.b(segmentDetailsActivity, bVar4);
                        SegmentDetailsDTO segmentDetailsDTO6 = segmentDetailsActivity.T;
                        segmentDetailsDTO6.getClass();
                        segmentDetailsActivity.ra(segmentDetailsDTO6.f17840e);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                SegmentDetailsActivity.a aVar6 = SegmentDetailsActivity.Z;
                g3Var.getClass();
                fw.p pVar3 = g3Var.f35300a;
                SegmentDetailsDTO segmentDetailsDTO7 = (SegmentDetailsDTO) g3Var.f35301b;
                int i24 = SegmentDetailsActivity.b.f41415b[pVar3.ordinal()];
                if (i24 == 1) {
                    segmentDetailsActivity.showProgressOverlay();
                } else if (i24 == 2) {
                    segmentDetailsActivity.hideProgressOverlay();
                    segmentDetailsActivity.va(false);
                    SwipeRefreshLayout swipeRefreshLayout = segmentDetailsActivity.C;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                    segmentDetailsActivity.T = segmentDetailsDTO7;
                    if (segmentDetailsDTO7 != null && (aVar = segmentDetailsActivity.P) != null) {
                        segmentDetailsDTO7.f17840e = aVar.f17840e;
                    }
                    if (!segmentDetailsActivity.isFinishing()) {
                        segmentDetailsActivity.sa(segmentDetailsActivity.T);
                    }
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    segmentDetailsActivity.hideProgressOverlay();
                    segmentDetailsActivity.va(true);
                    SwipeRefreshLayout swipeRefreshLayout2 = segmentDetailsActivity.C;
                    if (swipeRefreshLayout2 != null) {
                        swipeRefreshLayout2.setRefreshing(false);
                    }
                }
                return Unit.INSTANCE;
            default:
                SegmentDetailsActivity.a aVar7 = SegmentDetailsActivity.Z;
                g3Var.getClass();
                fw.p pVar4 = g3Var.f35300a;
                UserRankDTO userRankDTO = (UserRankDTO) g3Var.f35301b;
                int i25 = SegmentDetailsActivity.b.f41415b[pVar4.ordinal()];
                if (i25 == 1) {
                    segmentDetailsActivity.showProgressOverlay();
                } else if (i25 == 2) {
                    segmentDetailsActivity.hideProgressOverlay();
                    segmentDetailsActivity.X = userRankDTO;
                    if (!segmentDetailsActivity.isFinishing()) {
                        segmentDetailsActivity.ua(segmentDetailsActivity.X);
                    }
                    if (!segmentDetailsActivity.isFinishing() && segmentDetailsActivity.B) {
                        segmentDetailsActivity.ta(segmentDetailsActivity.f41406q, segmentDetailsActivity.X);
                    }
                    segmentDetailsActivity.A = true;
                    UserRankDTO userRankDTO2 = segmentDetailsActivity.X;
                    if (userRankDTO2 != null && userRankDTO2.f41250b > 0) {
                        c0 c0Var = segmentDetailsActivity.f41413z;
                        c0Var.getClass();
                        String str = segmentDetailsActivity.f41403n;
                        str.getClass();
                        androidx.lifecycle.m.a(null, new w(c0Var, "SEGMENT", str, null), 3).f(segmentDetailsActivity, new SegmentDetailsActivity.c(new j(segmentDetailsActivity, i15)));
                    }
                } else {
                    if (i25 != 3) {
                        u0.r();
                        return null;
                    }
                    segmentDetailsActivity.hideProgressOverlay();
                    lj0.b bVar5 = lj0.b.f112956j;
                    bVar5.getClass();
                    g22.a.b(segmentDetailsActivity, bVar5);
                }
                return Unit.INSTANCE;
        }
    }
}
