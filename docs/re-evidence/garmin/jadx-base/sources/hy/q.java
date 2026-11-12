package hy;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhy/q;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "itemView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy.f f86350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f86351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f86352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f86353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f86354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f86355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, View view2) {
        super(view2);
        context.getClass();
        view2.getClass();
        this.f86350a = new fy.f(context);
        View viewFindViewById = view2.findViewById(R.id.icon_start);
        viewFindViewById.getClass();
        this.f86351b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text1);
        viewFindViewById2.getClass();
        this.f86352c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text2);
        viewFindViewById3.getClass();
        this.f86353d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.icon_end);
        viewFindViewById4.getClass();
        this.f86354e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.text3);
        viewFindViewById5.getClass();
        this.f86355f = (TextView) viewFindViewById5;
    }
}
