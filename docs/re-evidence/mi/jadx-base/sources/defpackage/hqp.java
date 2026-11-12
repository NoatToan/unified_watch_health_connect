package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.amap.api.maps.MapView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.amap.moments.MomentsView;
import com.xiaomi.fitness.share.view.DataShareProfileView;
import com.xiaomi.fitness.share.view.DataTitleShareVideo;
import com.xiaomi.fitness.share.view.ShareSportInfoView;
import com.xiaomi.fitness.share.view.SportTraceDataView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hqp extends ViewDataBinding {
    public final pqp A;
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final MapView D;
    public final MomentsView E;
    public final ImageView F;
    public final ImageView G;
    public final DataShareProfileView H;
    public final ConstraintLayout I;
    public final ShareSportInfoView J;
    public final SportShareLongView K;
    public final SportTraceDataView L;
    public final rqp M;
    public final tqp N;
    public final zqp O;
    public final DataTitleShareVideo P;
    public final LinearLayout Q;

    public hqp(Object obj, View view, int i, pqp pqpVar, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MapView mapView, MomentsView momentsView, ImageView imageView, ImageView imageView2, DataShareProfileView dataShareProfileView, ConstraintLayout constraintLayout3, ShareSportInfoView shareSportInfoView, SportShareLongView sportShareLongView, SportTraceDataView sportTraceDataView, rqp rqpVar, tqp tqpVar, zqp zqpVar, DataTitleShareVideo dataTitleShareVideo, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = pqpVar;
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = mapView;
        this.E = momentsView;
        this.F = imageView;
        this.G = imageView2;
        this.H = dataShareProfileView;
        this.I = constraintLayout3;
        this.J = shareSportInfoView;
        this.K = sportShareLongView;
        this.L = sportTraceDataView;
        this.M = rqpVar;
        this.N = tqpVar;
        this.O = zqpVar;
        this.P = dataTitleShareVideo;
        this.Q = linearLayout;
    }
}
