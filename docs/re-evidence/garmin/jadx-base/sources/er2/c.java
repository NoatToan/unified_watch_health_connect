package er2;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ler2/c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f65069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f65070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f65071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f65072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f65073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f65074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f65075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.address_name);
        viewFindViewById.getClass();
        this.f65069a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.address_line_1);
        viewFindViewById2.getClass();
        this.f65070b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.address_line_2);
        viewFindViewById3.getClass();
        this.f65071c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.address_line_3);
        viewFindViewById4.getClass();
        this.f65072d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.address_line_4);
        viewFindViewById5.getClass();
        this.f65073e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.phone_number);
        viewFindViewById6.getClass();
        this.f65074f = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.address_line_complement);
        viewFindViewById7.getClass();
        this.f65075g = (TextView) viewFindViewById7;
    }
}
