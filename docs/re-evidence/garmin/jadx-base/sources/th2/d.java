package th2;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lth2/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "rowView", "<init>", "(Landroid/view/View;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f164558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f164559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f164560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.add_selected_icon);
        viewFindViewById.getClass();
        this.f164558a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.label_icon);
        viewFindViewById2.getClass();
        this.f164559b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.title_text);
        viewFindViewById3.getClass();
        this.f164560c = (StyledTextView) viewFindViewById3;
    }
}
