package er2;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ler2/q;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f65109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f65110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f65111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(View view2) {
        super(view2);
        view2.getClass();
        this.f65109a = view2;
        View viewFindViewById = view2.findViewById(R.id.text_item_info);
        viewFindViewById.getClass();
        this.f65110b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_item_value);
        viewFindViewById2.getClass();
        this.f65111c = (TextView) viewFindViewById2;
    }
}
