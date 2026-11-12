package ut;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import j20.x;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f172541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f172542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f172543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComposeView f172544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieAnimationView f172545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComposeView f172546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f172547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f172548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GCMMapView f172549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ComposeView f172550j;

    private a(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, LottieAnimationView lottieAnimationView, ComposeView composeView4, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, GCMMapView gCMMapView, ComposeView composeView5) {
        this.f172541a = constraintLayout;
        this.f172542b = composeView;
        this.f172543c = composeView2;
        this.f172544d = composeView3;
        this.f172545e = lottieAnimationView;
        this.f172546f = composeView4;
        this.f172547g = constraintLayout2;
        this.f172548h = imageView2;
        this.f172549i = gCMMapView;
        this.f172550j = composeView5;
    }

    public static a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_annual_report_player, viewGroup, false);
        int i14 = R.id.bottom_banner_composable;
        ComposeView composeView = (ComposeView) ee.a.a(R.id.bottom_banner_composable, viewInflate);
        if (composeView != null) {
            i14 = R.id.btn_close_composable;
            ComposeView composeView2 = (ComposeView) ee.a.a(R.id.btn_close_composable, viewInflate);
            if (composeView2 != null) {
                i14 = R.id.btn_play_pause_composable;
                ComposeView composeView3 = (ComposeView) ee.a.a(R.id.btn_play_pause_composable, viewInflate);
                if (composeView3 != null) {
                    i14 = R.id.chapter_lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ee.a.a(R.id.chapter_lottie, viewInflate);
                    if (lottieAnimationView != null) {
                        i14 = R.id.compose_view;
                        ComposeView composeView4 = (ComposeView) ee.a.a(R.id.compose_view, viewInflate);
                        if (composeView4 != null) {
                            i14 = R.id.connect_logo;
                            ImageView imageView = (ImageView) ee.a.a(R.id.connect_logo, viewInflate);
                            if (imageView != null) {
                                i14 = R.id.control_panel;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ee.a.a(R.id.control_panel, viewInflate);
                                if (constraintLayout != null) {
                                    i14 = R.id.garmin_logo;
                                    ImageView imageView2 = (ImageView) ee.a.a(R.id.garmin_logo, viewInflate);
                                    if (imageView2 != null) {
                                        i14 = R.id.map_preview;
                                        GCMMapView gCMMapView = (GCMMapView) ee.a.a(R.id.map_preview, viewInflate);
                                        if (gCMMapView != null) {
                                            i14 = R.id.progress_composable;
                                            ComposeView composeView5 = (ComposeView) ee.a.a(R.id.progress_composable, viewInflate);
                                            if (composeView5 != null) {
                                                return new a((ConstraintLayout) viewInflate, composeView, composeView2, composeView3, lottieAnimationView, composeView4, imageView, constraintLayout, imageView2, gCMMapView, composeView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        x.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
        return null;
    }
}
