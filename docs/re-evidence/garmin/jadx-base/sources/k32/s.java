package k32;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/s;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class s extends RecyclerView.f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f102728f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f102729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f102733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.text1);
        viewFindViewById.getClass();
        this.f102729a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text2);
        viewFindViewById2.getClass();
        this.f102730b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text3);
        viewFindViewById3.getClass();
        this.f102731c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.text4);
        viewFindViewById4.getClass();
        this.f102732d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.chart_container);
        viewFindViewById5.getClass();
        this.f102733e = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.right_container);
        viewFindViewById6.getClass();
    }

    public final void d(String str, String str2, String str3) {
        View view2 = this.itemView;
        view2.getClass();
        view2.setVisibility(0);
        this.f102729a.setText(str);
        TextView textView = this.f102730b;
        if (str2 != null) {
            v22.e.q(textView);
            textView.setText(str2);
            Context context = this.itemView.getContext();
            context.getClass();
            textView.setContentDescription(oi0.c.A(context, new jy0.b(17), str2));
        } else {
            v22.e.j(textView);
        }
        TextView textView2 = this.f102731c;
        if (str3 == null) {
            v22.e.j(textView2);
            return;
        }
        v22.e.q(textView2);
        textView2.setText(str3);
        Context context2 = this.itemView.getContext();
        context2.getClass();
        textView2.setContentDescription(oi0.c.A(context2, new jy0.b(16), str3));
    }
}
