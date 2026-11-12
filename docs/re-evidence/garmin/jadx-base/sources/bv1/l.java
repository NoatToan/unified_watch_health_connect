package bv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbv1/l;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f21419b;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_activity_view, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        View viewFindViewById = this.f21420a.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        this.f21419b = (ComposeView) viewFindViewById;
    }
}
