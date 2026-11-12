package n12;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Ln12/u0;", "Lo53/b0;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "", "imageModel", "", "checked", "locked", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u53.d f122312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f122313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f122314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f122315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f122316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f122317f;

    public u0(View view2) {
        view2.getClass();
        this.f122312a = o53.c0.b();
        this.f122313b = view2;
        View viewFindViewById = view2.findViewById(R.id.compose_view);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f122314c = composeView;
        this.f122315d = q2.a(null);
        Boolean bool = Boolean.FALSE;
        this.f122316e = q2.a(bool);
        this.f122317f = q2.a(bool);
        composeView.setContent(new z3.e(1405309445, true, new o0(this, 0)));
    }

    public final void a(boolean z14) {
        ge1.b.T(this, null, null, new r0(this, z14, null), 3);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return this.f122312a.f168725a;
    }
}
