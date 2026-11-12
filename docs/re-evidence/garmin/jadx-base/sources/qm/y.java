package qm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm/y;", "Lzm/q;", "Landroid/content/Context;", "mContext", "Lzm/p;", "mActivityChartData", "<init>", "(Landroid/content/Context;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements zm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm.p f145466b;

    public y(Context context, zm.p pVar) {
        context.getClass();
        pVar.getClass();
        this.f145465a = context;
        this.f145466b = pVar;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        ComposeView composeView;
        View viewInflate = LayoutInflater.from(this.f145465a).inflate(R.layout.activity_composable_container, viewGroup, false);
        if (viewInflate != null && (composeView = (ComposeView) viewInflate.findViewById(R.id.composable_container)) != null) {
            composeView.setContent(new z3.e(394371746, true, new ov1.q(this, 23)));
        }
        return viewInflate;
    }
}
