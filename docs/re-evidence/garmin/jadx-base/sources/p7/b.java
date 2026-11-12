package p7;

import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContentLoadingProgressBar f136293b;

    public /* synthetic */ b(ContentLoadingProgressBar contentLoadingProgressBar, int i14) {
        this.f136292a = i14;
        this.f136293b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f136292a) {
            case 0:
                ContentLoadingProgressBar contentLoadingProgressBar = this.f136293b;
                contentLoadingProgressBar.f6593b = false;
                contentLoadingProgressBar.f6592a = -1L;
                contentLoadingProgressBar.setVisibility(8);
                break;
            case 1:
                ContentLoadingProgressBar contentLoadingProgressBar2 = this.f136293b;
                contentLoadingProgressBar2.f6594c = false;
                if (!contentLoadingProgressBar2.f6595d) {
                    contentLoadingProgressBar2.f6592a = System.currentTimeMillis();
                    contentLoadingProgressBar2.setVisibility(0);
                }
                break;
            case 2:
                ContentLoadingProgressBar contentLoadingProgressBar3 = this.f136293b;
                contentLoadingProgressBar3.f6592a = -1L;
                contentLoadingProgressBar3.f6595d = false;
                contentLoadingProgressBar3.removeCallbacks(contentLoadingProgressBar3.f6596e);
                contentLoadingProgressBar3.f6593b = false;
                if (!contentLoadingProgressBar3.f6594c) {
                    contentLoadingProgressBar3.postDelayed(contentLoadingProgressBar3.f6597f, 500L);
                    contentLoadingProgressBar3.f6594c = true;
                }
                break;
            default:
                ContentLoadingProgressBar contentLoadingProgressBar4 = this.f136293b;
                contentLoadingProgressBar4.f6595d = true;
                contentLoadingProgressBar4.removeCallbacks(contentLoadingProgressBar4.f6597f);
                contentLoadingProgressBar4.f6594c = false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j8 = contentLoadingProgressBar4.f6592a;
                long j14 = jCurrentTimeMillis - j8;
                if (j14 >= 500 || j8 == -1) {
                    contentLoadingProgressBar4.setVisibility(8);
                } else if (!contentLoadingProgressBar4.f6593b) {
                    contentLoadingProgressBar4.postDelayed(contentLoadingProgressBar4.f6596e, 500 - j14);
                    contentLoadingProgressBar4.f6593b = true;
                }
                break;
        }
    }
}
