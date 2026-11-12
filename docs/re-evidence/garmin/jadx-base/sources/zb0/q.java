package zb0;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f203616b;

    public /* synthetic */ q(r rVar, int i14) {
        this.f203615a = i14;
        this.f203616b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f203615a) {
            case 0:
                o oVar = this.f203616b.f203621a;
                oVar.f203595q.g(false);
                oVar.S6();
                break;
            default:
                o oVar2 = this.f203616b.f203621a;
                oVar2.f203595q.g(false);
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(oVar2.requireContext());
                aVar.setMessage(R.string.find_my_watch_found_msg).setTitle(R.string.find_my_watch_found_title);
                aVar.setPositiveButton(R.string.lbl_close, new n(oVar2, 1));
                aVar.create().show();
                break;
        }
    }
}
