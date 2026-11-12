package qa1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqa1/e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f143876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f143877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f143878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f143879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view2) {
        super(view2);
        view2.getClass();
        Context context = view2.getContext();
        context.getClass();
        this.f143876a = context;
        View viewFindViewById = view2.findViewById(R.id.peak_tv);
        viewFindViewById.getClass();
        this.f143877b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.watts_tv);
        viewFindViewById2.getClass();
        this.f143878c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.date_tv);
        viewFindViewById3.getClass();
        this.f143879d = (TextView) viewFindViewById3;
    }
}
