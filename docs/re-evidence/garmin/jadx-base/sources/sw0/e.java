package sw0;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import ps.b1;
import ps.t1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsw0/e;", "Lsw0/a;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view2) {
        super(view2);
        view2.getClass();
    }

    @Override // sw0.a
    public final void d(k kVar) {
        kVar.getClass();
        if (!(kVar instanceof d)) {
            vb.h.s("Error! Bound a MapDataOverlayViewHolder with something other than MapDataOverlayItem.");
            return;
        }
        Context context = this.itemView.getContext();
        t1 t1Var = ((d) kVar).f161072a;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.legend_view);
        context.getClass();
        LayerDrawable layerDrawableD = t1Var.d(context);
        b1 b1Var = t1Var.f140222a;
        imageView.setImageDrawable(layerDrawableD);
        ((TextView) this.itemView.findViewById(R.id.legend_left_tv)).setText(context.getString(b1Var.f139691c));
        ((TextView) this.itemView.findViewById(R.id.legend_right_tv)).setText(context.getString(b1Var.f139692d));
    }
}
