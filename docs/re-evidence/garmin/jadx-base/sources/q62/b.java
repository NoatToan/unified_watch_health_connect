package q62;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.view.SwipeToOptions;
import p005kotlin.Metadata;
import sq0.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq62/b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lsq0/c;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.f0 implements sq0.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f143174r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f143175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f143176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f143177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f143178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComposeView f143179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f143180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f143181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f143182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f143183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SwipeToOptions f143184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f143185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f143186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ComposeView f143187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f143188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f143189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f143190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public sq0.d f143191q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view2) {
        super(view2);
        view2.getClass();
        this.f143175a = view2;
        View viewFindViewById = view2.findViewById(R.id.first_line);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f143176b = textView;
        View viewFindViewById2 = view2.findViewById(R.id.second_line);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f143177c = textView2;
        View viewFindViewById3 = view2.findViewById(R.id.icon_delete);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f143178d = imageView;
        View viewFindViewById4 = view2.findViewById(R.id.icon_start);
        viewFindViewById4.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById4;
        this.f143179e = composeView;
        View viewFindViewById5 = view2.findViewById(R.id.swipe_top_container);
        viewFindViewById5.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById5;
        this.f143180f = constraintLayout;
        View viewFindViewById6 = view2.findViewById(R.id.swipe_bottom_container);
        viewFindViewById6.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById6;
        this.f143181g = linearLayout;
        View viewFindViewById7 = view2.findViewById(R.id.option_text1);
        viewFindViewById7.getClass();
        this.f143182h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.option_text2);
        viewFindViewById8.getClass();
        this.f143183i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.swipe_list_item);
        viewFindViewById9.getClass();
        this.f143184j = (SwipeToOptions) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.icon_warning);
        viewFindViewById10.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById10;
        this.f143185k = imageView2;
        View viewFindViewById11 = view2.findViewById(R.id.icon_duplicate);
        viewFindViewById11.getClass();
        ImageView imageView3 = (ImageView) viewFindViewById11;
        this.f143186l = imageView3;
        View viewFindViewById12 = view2.findViewById(R.id.icon_reorder);
        viewFindViewById12.getClass();
        ComposeView composeView2 = (ComposeView) viewFindViewById12;
        this.f143187m = composeView2;
        v22.e.j(textView);
        v22.e.j(textView2);
        v22.e.j(composeView);
        v22.e.q(constraintLayout);
        v22.e.j(linearLayout);
        v22.e.j(imageView);
        v22.e.j(imageView3);
        v22.e.j(composeView2);
        v22.e.j(imageView2);
    }

    @Override // sq0.c
    public final void a() {
        if (this.f143188n) {
            this.itemView.setAlpha(0.4f);
        }
    }

    @Override // sq0.c
    public final void c() {
        View view2 = this.itemView;
        view2.setBackgroundColor(a7.b.getColor(view2.getContext(), R.color.gcm_list_item_background));
        this.itemView.setAlpha(1.0f);
        sq0.d dVar = this.f143191q;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final void d() {
        SwipeToOptions swipeToOptions = this.f143184j;
        if (swipeToOptions.f49737h) {
            swipeToOptions.c(true);
        }
    }
}
