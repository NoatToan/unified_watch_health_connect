package rl1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrl1/c;", "", "Landroid/view/ViewGroup;", "valueContainer", "Landroid/widget/TextView;", "firstRowValue", "secondRowValue", "Landroid/view/View;", "divider", "<init>", "(Landroid/view/ViewGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f153406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f153407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f153408c;

    public c(ViewGroup viewGroup, TextView textView, TextView textView2, View view2) {
        this.f153406a = viewGroup;
        this.f153407b = textView;
        this.f153408c = view2;
    }

    public /* synthetic */ c(ViewGroup viewGroup, TextView textView, TextView textView2, View view2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewGroup, textView, (i14 & 4) != 0 ? null : textView2, view2);
    }
}
