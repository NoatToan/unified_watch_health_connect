package gg1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgg1/g;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f77233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.gcm3_single_line_text, viewGroup, false));
        layoutInflater.getClass();
        viewGroup.getClass();
        View viewFindViewById = this.itemView.findViewById(R.id.single_line_name_text_view);
        viewFindViewById.getClass();
        this.f77233a = (TextView) viewFindViewById;
    }
}
