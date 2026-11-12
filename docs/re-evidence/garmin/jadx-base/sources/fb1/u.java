package fb1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfb1/u;", "", "Landroid/view/ViewGroup;", "valueContainer", "Landroid/widget/TextView;", "title", "firstRowValue", "firstRowValueUom", "secondRowValue", "Landroid/view/View;", "divider", "<init>", "(Landroid/view/ViewGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f70304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f70305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f70306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f70307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f70308e;

    public /* synthetic */ u(ViewGroup viewGroup, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewGroup, textView, textView2, textView3, (i14 & 16) != 0 ? null : textView4, view2);
    }

    public u(ViewGroup viewGroup, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.f70304a = viewGroup;
        this.f70305b = textView2;
        this.f70306c = textView3;
        this.f70307d = textView4;
        this.f70308e = view2;
    }
}
