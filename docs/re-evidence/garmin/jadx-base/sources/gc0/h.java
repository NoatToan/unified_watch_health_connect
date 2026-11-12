package gc0;

import android.widget.Toast;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f76866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f76867c;

    public /* synthetic */ h(i iVar, String str, int i14) {
        this.f76865a = i14;
        this.f76866b = iVar;
        this.f76867c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f76865a) {
            case 0:
                Toast.makeText(this.f76866b.f76870c, this.f76867c, 1).show();
                break;
            default:
                Toast.makeText(this.f76866b.f76870c, this.f76867c, 1).show();
                break;
        }
    }
}
