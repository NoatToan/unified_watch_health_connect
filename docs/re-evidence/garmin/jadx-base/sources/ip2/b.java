package ip2;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import fo2.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lip2/b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.f0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f94710m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f94711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f94712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f94713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f94714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f94715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f94716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f94717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f94718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearLayout f94719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f94720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f94721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f94722l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94723a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.SELECT_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.EDIT_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94723a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view2) {
        super(view2);
        view2.getClass();
        this.f94711a = view2;
        View viewFindViewById = view2.findViewById(R.id.item_address_layout);
        viewFindViewById.getClass();
        this.f94712b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.address_name);
        viewFindViewById2.getClass();
        this.f94713c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.address_line_1);
        viewFindViewById3.getClass();
        this.f94714d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.address_line_2);
        viewFindViewById4.getClass();
        this.f94715e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.address_line_3);
        viewFindViewById5.getClass();
        this.f94716f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.address_line_4);
        viewFindViewById6.getClass();
        this.f94717g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.phone_number);
        viewFindViewById7.getClass();
        this.f94718h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.phone_number_section);
        viewFindViewById8.getClass();
        this.f94719i = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.address_line_complement);
        viewFindViewById9.getClass();
        this.f94720j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.selected_mark);
        viewFindViewById10.getClass();
        this.f94721k = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.remove_mark);
        viewFindViewById11.getClass();
        this.f94722l = (ImageView) viewFindViewById11;
    }
}
