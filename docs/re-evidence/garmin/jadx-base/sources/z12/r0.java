package z12;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexTwoLineEventButton;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/r0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "parent", "<init>", "(Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f201481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m12.r f201482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GCMComplexTwoLineEventButton f201483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(View view2) {
        super(view2);
        view2.getClass();
        this.f201481a = view2.getContext();
        this.f201482b = (m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null);
        View viewFindViewById = view2.findViewById(R.id.event_view);
        viewFindViewById.getClass();
        this.f201483c = (GCMComplexTwoLineEventButton) viewFindViewById;
    }
}
