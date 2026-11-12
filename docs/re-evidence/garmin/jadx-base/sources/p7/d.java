package p7;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ListView f136294r;

    public d(ListView listView) {
        super(listView);
        this.f136294r = listView;
    }

    @Override // p7.a
    public final boolean a(int i14) {
        ListView listView = this.f136294r;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i15 = firstVisiblePosition + childCount;
        if (i14 > 0) {
            if (i15 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i14 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p7.a
    public final void f(int i14) {
        this.f136294r.scrollListBy(i14);
    }
}
