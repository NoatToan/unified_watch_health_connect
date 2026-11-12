package nq2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnq2/b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "view", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f126961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f126962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f126963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, View view2) {
        super(view2);
        context.getClass();
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.card_image_view);
        viewFindViewById.getClass();
        this.f126961a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.balance_number_view);
        viewFindViewById2.getClass();
        this.f126962b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.last_sync_time);
        viewFindViewById3.getClass();
        this.f126963c = (TextView) viewFindViewById3;
    }
}
