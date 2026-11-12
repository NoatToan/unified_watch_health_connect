package dp1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldp1/h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f60663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.text1);
        viewFindViewById.getClass();
        this.f60660a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text2);
        viewFindViewById2.getClass();
        this.f60661b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text3);
        viewFindViewById3.getClass();
        this.f60662c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.tagTextView);
        viewFindViewById4.getClass();
        this.f60663d = (TextView) viewFindViewById4;
    }
}
