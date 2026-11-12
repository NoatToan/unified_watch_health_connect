package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController f4653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f4654b;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f4654b = bVar;
        this.f4653a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
        AlertController.b bVar = this.f4654b;
        DialogInterface.OnClickListener onClickListener = bVar.f4641w;
        AlertController alertController = this.f4653a;
        onClickListener.onClick(alertController.f4591b, i14);
        if (bVar.G) {
            return;
        }
        alertController.f4591b.dismiss();
    }
}
