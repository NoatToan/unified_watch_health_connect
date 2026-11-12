package th2;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lth2/c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "rowView", "<init>", "(Landroid/view/View;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f164554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f164555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f164556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f164557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.item_view);
        viewFindViewById.getClass();
        this.f164554a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.delete_selected_icon);
        viewFindViewById2.getClass();
        this.f164555b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.label_icon);
        viewFindViewById3.getClass();
        this.f164556c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.title_text);
        viewFindViewById4.getClass();
        this.f164557d = (StyledTextView) viewFindViewById4;
    }
}
