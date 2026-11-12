package xa2;

import android.content.DialogInterface;
import com.garmin.android.exportablereports.views.ReportsViewActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReportsViewActivity f189858b;

    public /* synthetic */ f(ReportsViewActivity reportsViewActivity, int i14) {
        this.f189857a = i14;
        this.f189858b = reportsViewActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f189857a;
        ReportsViewActivity reportsViewActivity = this.f189858b;
        switch (i15) {
            case 0:
                ReportsViewActivity.a aVar = ReportsViewActivity.f49847l;
                reportsViewActivity.finish();
                break;
            default:
                ReportsViewActivity.a aVar2 = ReportsViewActivity.f49847l;
                reportsViewActivity.finish();
                break;
        }
    }
}
