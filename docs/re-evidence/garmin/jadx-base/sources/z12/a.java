package z12;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.userprofile.recycler.SmallActivityCard;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/a;", "Lz12/q0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends q0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SmallActivityCard f201360m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
    }

    @Override // z12.q0
    public final void d(ActivityListItemDTO activityListItemDTO) {
        SmallActivityCard smallActivityCard = this.f201360m;
        if (smallActivityCard != null) {
            smallActivityCard.a(activityListItemDTO);
        } else {
            p005kotlin.jvm.internal.s.m("activityCard");
            throw null;
        }
    }

    @Override // z12.q0
    public final int e() {
        return R.layout.small_activity_card;
    }

    @Override // z12.q0
    public final View f() {
        SmallActivityCard smallActivityCard = this.f201360m;
        if (smallActivityCard != null) {
            return smallActivityCard;
        }
        p005kotlin.jvm.internal.s.m("activityCard");
        throw null;
    }

    @Override // z12.q0
    public final void h() {
        super.h();
        View viewFindViewById = this.itemView.findViewById(R.id.small_activity_card_view);
        viewFindViewById.getClass();
        this.f201360m = (SmallActivityCard) viewFindViewById;
    }
}
