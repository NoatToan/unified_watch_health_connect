package r22;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr22/z;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserLevelImageView f149932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f149933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f149934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckBox f149935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f149936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f149937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f149938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(View view2) {
        super(view2);
        view2.getClass();
        this.f149932a = (UserLevelImageView) view2.findViewById(R.id.contact_img);
        this.f149933b = (TextView) view2.findViewById(R.id.contact_name);
        this.f149934c = (TextView) view2.findViewById(R.id.contact_profile_details);
        this.f149935d = (CheckBox) view2.findViewById(R.id.contact_checkbox);
        this.f149936e = view2.findViewById(R.id.contact_info_warning);
        this.f149937f = (ImageView) view2.findViewById(R.id.emergency_contact_icon);
        this.f149938g = (ImageView) view2.findViewById(R.id.contact_live_track);
    }
}
