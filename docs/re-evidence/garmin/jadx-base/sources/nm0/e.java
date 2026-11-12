package nm0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm0/e;", "Lnm0/d;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends d {
    public FrameLayout F;

    @Override // nm0.d
    public final void M6() {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null) {
            v22.e.j(frameLayout);
        } else {
            s.m("progressOverlay");
            throw null;
        }
    }

    @Override // nm0.d
    public final void S6(View view2) {
        View viewFindViewById = view2.findViewById(R.id.progress_overlay);
        viewFindViewById.getClass();
        this.F = (FrameLayout) viewFindViewById;
    }

    @Override // nm0.d
    public final void T6() {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null) {
            v22.e.q(frameLayout);
        } else {
            s.m("progressOverlay");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_group_detail_about);
    }
}
