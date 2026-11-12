package wv2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwv2/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f187471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f187472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f187473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f187474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f187475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f187476f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.action_icon);
        viewFindViewById.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById;
        this.f187471a = appCompatImageView;
        View viewFindViewById2 = view2.findViewById(R.id.label_icon);
        viewFindViewById2.getClass();
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewFindViewById2;
        this.f187472b = appCompatImageView2;
        View viewFindViewById3 = view2.findViewById(R.id.title_text_view);
        viewFindViewById3.getClass();
        this.f187473c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.reorder_icon);
        viewFindViewById4.getClass();
        this.f187474d = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.arrow_up_icon);
        viewFindViewById5.getClass();
        this.f187475e = (AppCompatImageView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.arrow_down_icon);
        viewFindViewById6.getClass();
        this.f187476f = (AppCompatImageView) viewFindViewById6;
        Context context = view2.getContext();
        context.getClass();
        if (dw2.a.b(context)) {
            Context context2 = view2.getContext();
            context2.getClass();
            int iA = (int) dw2.a.a(context2, view2.getContext().getResources().getDimensionPixelSize(R.dimen.rts_standard_small_image_size), 1.5f);
            appCompatImageView.getLayoutParams().width = iA;
            appCompatImageView.getLayoutParams().height = iA;
            appCompatImageView2.getLayoutParams().width = iA;
            appCompatImageView2.getLayoutParams().height = iA;
        }
    }

    public static void d(View view2, boolean z14) {
        view2.setEnabled(z14);
        view2.setAlpha(z14 ? 1.0f : 0.5f);
    }
}
