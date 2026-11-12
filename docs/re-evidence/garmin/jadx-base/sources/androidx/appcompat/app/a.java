package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: loaded from: classes.dex */
public class a extends ArrayAdapter<CharSequence> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f4646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f4647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AlertController.b bVar, Context context, int i14, int i15, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i14, i15, charSequenceArr);
        this.f4647b = bVar;
        this.f4646a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        View view3 = super.getView(i14, view2, viewGroup);
        boolean[] zArr = this.f4647b.E;
        if (zArr != null && zArr[i14]) {
            this.f4646a.setItemChecked(i14, true);
        }
        return view3;
    }
}
