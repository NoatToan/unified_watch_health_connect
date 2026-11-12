package zb0;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f203576b;

    public /* synthetic */ n(o oVar, int i14) {
        this.f203575a = i14;
        this.f203576b = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f203575a) {
            case 0:
                o oVar = this.f203576b;
                oVar.getClass();
                g22.e.i(oVar, Uri.parse("https://www.garmin.com.cn/news/bulletin/garmin-news-forerunner-235/"));
                break;
            default:
                o oVar2 = this.f203576b;
                xt2.a aVarK6 = o.K6(oVar2.f203588j);
                if (aVarK6 != null) {
                    aVarK6.c(new s(oVar2));
                }
                dialogInterface.dismiss();
                break;
        }
    }
}
