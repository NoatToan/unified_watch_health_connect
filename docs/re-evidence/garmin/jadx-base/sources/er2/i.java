package er2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ler2/i;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f65082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f65083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f65084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f65085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view2) {
        super(view2);
        view2.getClass();
        this.f65082a = view2;
        View viewFindViewById = view2.findViewById(R.id.device_image_view);
        viewFindViewById.getClass();
        this.f65083b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.device_name_label);
        viewFindViewById2.getClass();
        this.f65084c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.device_connection_state_label);
        viewFindViewById3.getClass();
        this.f65085d = (TextView) viewFindViewById3;
    }
}
