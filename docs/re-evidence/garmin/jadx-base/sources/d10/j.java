package d10;

import androidx.media3.exoplayer.u;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57039a;

    public j(int i14) {
        this.f57039a = i14;
    }

    @Override // d10.h, androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r */
    public void onBindViewHolder(h.a aVar, int i14) {
        GCMCheckableRow gCMCheckableRow = aVar.f57035a;
        gCMCheckableRow.setEnabled(i14 != this.f57039a);
        gCMCheckableRow.c(i14 == this.f57039a);
        gCMCheckableRow.setOnCheckChangeListener(new u(this, i14, aVar, 5));
    }

    public abstract void t(int i14);
}
