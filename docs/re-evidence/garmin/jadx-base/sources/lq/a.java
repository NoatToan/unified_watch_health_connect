package lq;

import android.view.View;
import android.widget.ScrollView;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollView f114254b;

    public /* synthetic */ a(ScrollView scrollView, int i14) {
        this.f114253a = i14;
        this.f114254b = scrollView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view2, int i14, int i15, int i16, int i17) {
        int i18 = this.f114253a;
        ScrollView scrollView = this.f114254b;
        switch (i18) {
            case 0:
                int i19 = b.f114255u;
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            case 1:
                int i24 = b.f114255u;
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            case 2:
                int i25 = mq.d.B;
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            case 3:
                int i26 = mq.d.B;
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            case 4:
                Logger logger = mq.e.f120159p;
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            case 5:
                Logger logger2 = mq.e.f120159p;
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            case 6:
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
            default:
                if (scrollView.getScrollY() != i15) {
                    scrollView.scrollTo(i14, i15);
                }
                break;
        }
    }
}
