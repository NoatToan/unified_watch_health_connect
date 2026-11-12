package er2;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ler2/s;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f65112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f65113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f65114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f65115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f65116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f65117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f65118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.no_cards_desc);
        viewFindViewById.getClass();
        this.f65112a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.change_passcode_layout);
        viewFindViewById2.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        this.f65113b = constraintLayout;
        View viewFindViewById3 = constraintLayout.findViewById(R.id.image_card_selection_item);
        viewFindViewById3.getClass();
        this.f65114c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = constraintLayout.findViewById(R.id.text_card_selection_item);
        viewFindViewById4.getClass();
        this.f65115d = (TextView) viewFindViewById4;
        View viewFindViewById5 = constraintLayout.findViewById(R.id.text_card_promotion_item);
        viewFindViewById5.getClass();
        this.f65116e = (TextView) viewFindViewById5;
        View viewFindViewById6 = constraintLayout.findViewById(R.id.border_list_item);
        viewFindViewById6.getClass();
        this.f65117f = viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.add_card_button);
        viewFindViewById7.getClass();
        this.f65118g = (Button) viewFindViewById7;
    }
}
