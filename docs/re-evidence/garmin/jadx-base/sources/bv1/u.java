package bv1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbv1/u;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/app/Activity;", "activity", "Lvu1/w;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Landroid/app/Activity;Lvu1/w;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f21444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu1.w f21445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComposeView f21446d;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(LayoutInflater layoutInflater, Activity activity, vu1.w wVar) {
        layoutInflater.getClass();
        activity.getClass();
        wVar.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_activity_view, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f21444b = activity;
        this.f21445c = wVar;
        View viewFindViewById = this.f21420a.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        this.f21446d = (ComposeView) viewFindViewById;
    }
}
