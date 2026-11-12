package hz0;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhz0/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f86416d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f86417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f86418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f86419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2) {
        super(view2);
        view2.getClass();
        this.f86417a = view2.findViewById(R.id.separator);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_container);
        this.f86418b = composeView;
        this.f86419c = p0.n(null);
        if (composeView != null) {
            composeView.setContent(new z3.e(-1939849694, true, new c(this, 0)));
        }
    }
}
