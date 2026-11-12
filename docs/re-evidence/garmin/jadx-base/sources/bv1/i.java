package bv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lbv1/i;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "Lvu1/w;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Lvu1/w;)V", "", "cardVisibility", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu1.w f21414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f21415c;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(LayoutInflater layoutInflater, vu1.w wVar) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_activity_view, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f21414b = wVar;
        View viewFindViewById = this.f21420a.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        this.f21415c = (ComposeView) viewFindViewById;
    }
}
