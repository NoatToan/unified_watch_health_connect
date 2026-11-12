package fb2;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfb2/p;", "Lfb2/b0;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends b0<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f70368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f70369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(View view2) {
        super(null);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.section_header_text);
        viewFindViewById.getClass();
        this.f70368b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.section_header_action_text);
        viewFindViewById2.getClass();
        this.f70369c = (TextView) viewFindViewById2;
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70368b);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70368b);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70368b, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70368b, z14);
    }
}
