package z12;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/p0;", "Lz12/q0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 extends q0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f201459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f201460n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
    }

    @Override // z12.q0
    public final void d(ActivityListItemDTO activityListItemDTO) {
        TextView textView = this.f201459m;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("cardActivityTitle");
            throw null;
        }
        textView.setText(new mn.a(new l22.a(g())).a(activityListItemDTO.f29253c));
        String str = activityListItemDTO.f29259e;
        if (str != null) {
            Context contextG = g();
            SpannableString spannableString = new SpannableString(gm.b.c(contextG, R.style.GCMCardPrimaryValueUnit, -1, c22.j0.r(contextG, c22.j0.K(str, "yyyy-MM-dd'T'HH:mm:ss.S"))));
            spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(g(), R.color.gcm_text_on_color)), 0, spannableString.length(), 33);
            TextView textView2 = this.f201460n;
            if (textView2 != null) {
                textView2.setText(spannableString);
            } else {
                p005kotlin.jvm.internal.s.m("cardActivityTime");
                throw null;
            }
        }
    }

    @Override // z12.q0
    public final int e() {
        return R.layout.safety_small_card;
    }

    @Override // z12.q0
    public final View f() {
        View viewFindViewById = this.itemView.findViewById(R.id.card_activity_container);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // z12.q0
    public final void h() {
        super.h();
        View viewFindViewById = f().findViewById(R.id.card_activity_title);
        viewFindViewById.getClass();
        this.f201459m = (TextView) viewFindViewById;
        View viewFindViewById2 = f().findViewById(R.id.card_activity_time);
        viewFindViewById2.getClass();
        this.f201460n = (TextView) viewFindViewById2;
    }
}
