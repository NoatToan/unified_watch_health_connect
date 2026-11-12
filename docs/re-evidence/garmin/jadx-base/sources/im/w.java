package im;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lim/w;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends RecyclerView.f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View view2) {
        super(view2);
        view2.getClass();
        view2.findViewById(R.id.orientation_hint_img).setContentDescription(view2.getContext().getString(R.string.msg_rotate_phone_for_more_stats));
    }
}
