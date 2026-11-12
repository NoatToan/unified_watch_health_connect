package k32;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/a;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f102662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f102663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102665d;

    public a(View view2) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_pull_tab);
        viewFindViewById.getClass();
        this.f102662a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.bottom_sheet_back_button);
        viewFindViewById2.getClass();
        this.f102663b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.bottom_sheet_title);
        viewFindViewById3.getClass();
        this.f102664c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.bottom_sheet_action_button);
        viewFindViewById4.getClass();
        this.f102665d = (TextView) viewFindViewById4;
    }
}
