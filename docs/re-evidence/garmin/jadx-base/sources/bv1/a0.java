package bv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv1/a0;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "Lvu1/w;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Lvu1/w;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu1.w f21378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f21379c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(LayoutInflater layoutInflater, vu1.w wVar) {
        layoutInflater.getClass();
        wVar.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_activity_view, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f21378b = wVar;
        View viewFindViewById = this.f21420a.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        this.f21379c = (ComposeView) viewFindViewById;
    }
}
