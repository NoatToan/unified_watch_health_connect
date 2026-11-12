package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f4655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f4656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f4657c;

    public d(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f4657c = bVar;
        this.f4655a = recycleListView;
        this.f4656b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
        AlertController.b bVar = this.f4657c;
        boolean[] zArr = bVar.E;
        AlertController.RecycleListView recycleListView = this.f4655a;
        if (zArr != null) {
            zArr[i14] = recycleListView.isItemChecked(i14);
        }
        bVar.I.onClick(this.f4656b.f4591b, i14, recycleListView.isItemChecked(i14));
    }
}
