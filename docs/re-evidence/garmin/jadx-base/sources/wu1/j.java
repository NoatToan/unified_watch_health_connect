package wu1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import bv1.m;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import vu1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwu1/j;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "Lvu1/w;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Lvu1/w;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f187321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f187322c;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(LayoutInflater layoutInflater, w wVar) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_dashboard_plan_overview, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f187321b = wVar;
        View viewFindViewById = this.f21420a.findViewById(R.id.plan_stats_compose_view);
        viewFindViewById.getClass();
        this.f187322c = (ComposeView) viewFindViewById;
    }
}
