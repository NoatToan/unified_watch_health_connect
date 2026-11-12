package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.uikit.hwalphaindexerlistview.widget.HwAlphaIndexerListView;
import com.huawei.uikit.hwalphaindexerlistview.widget.HwSortedTextListAdapter;

/* JADX INFO: loaded from: classes43.dex */
public class xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnKeyListener f52748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwAlphaIndexerListView f52749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f52750c;
    private HwSortedTextListAdapter d;
    private View.OnTouchListener e;
    private boolean f;
    private boolean g;
    private AbsListView.OnScrollListener i = new a();
    private HwAlphaIndexerListView.OnItemClickListener j = new e();

    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            View childAt;
            if (xdr.this.d == null) {
                return;
            }
            int i4 = i2 + i;
            if (i4 < i3 || xdr.this.f52750c.getSelectedItemPosition() == i) {
                xdr.this.g = false;
            }
            if (i4 == i3 && (childAt = xdr.this.f52750c.getChildAt(xdr.this.f52750c.getChildCount() - 1)) != null && childAt.getBottom() != xdr.this.f52750c.getHeight()) {
                xdr.this.g = false;
            }
            if (!xdr.this.g) {
                xdr.this.f52749b.invalidate();
                xdr.this.f52749b.setOverLayInfo(xdr.this.c(xdr.this.d.getSectionForPosition(i)));
            }
            if (xdr.this.f) {
                xdr.this.f52749b.b();
                xdr.this.f52750c.sendAccessibilityEvent(4096);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            xdr.this.g = false;
            if (i != 0) {
                xdr.this.f = true;
            } else {
                xdr.this.f = false;
                xdr.this.f52749b.d();
            }
        }
    }

    class e implements HwAlphaIndexerListView.OnItemClickListener {
        e() {
        }

        @Override // com.huawei.uikit.hwalphaindexerlistview.widget.HwAlphaIndexerListView.OnItemClickListener
        public void onItemClick(String str, int i) {
            int i2;
            String str2;
            if (str == null || xdr.this.d == null) {
                return;
            }
            xdr.this.g = false;
            Object[] sections = xdr.this.d.getSections();
            if (sections instanceof String[]) {
                String[] strArr = (String[]) sections;
                int i3 = 0;
                while (true) {
                    if (i3 >= strArr.length) {
                        i2 = i;
                        str2 = null;
                        break;
                    } else {
                        if (xdr.this.f52749b.d(str, strArr[i3], i)) {
                            i2 = i3;
                            str2 = strArr[i3];
                            break;
                        }
                        i3++;
                    }
                }
                if (str2 != null) {
                    xdr.this.a(str2, i2, i);
                    return;
                }
                if (!xdr.this.f52749b.a(i)) {
                    xdr.this.a(str, i, strArr, i2, str2);
                } else if (xdr.this.f52749b.a()) {
                    xdr.this.f52750c.setSelection(xdr.this.f52750c.getCount() - 1);
                } else {
                    xdr.this.f52750c.setSelection(0);
                }
            }
        }
    }

    public xdr(ListView listView, HwAlphaIndexerListView hwAlphaIndexerListView) {
        this.f52750c = listView;
        this.f52749b = hwAlphaIndexerListView;
        hwAlphaIndexerListView.setListViewAttachTo(listView);
        ListAdapter adapter = listView.getAdapter();
        if (adapter instanceof HwSortedTextListAdapter) {
            this.d = (HwSortedTextListAdapter) adapter;
            this.f52749b.setSectionText(c(this.d.getSectionForPosition(this.f52750c.getFirstVisiblePosition())));
        }
    }

    public void a() {
        ListView listView = this.f52750c;
        if (listView == null || this.f52749b == null) {
            return;
        }
        listView.setOnScrollListener(c());
        this.f52750c.setOnTouchListener(e());
        this.f52750c.setOnKeyListener(d());
        this.f52749b.setOnItemClickListener(this.j);
    }

    protected AbsListView.OnScrollListener c() {
        return this.i;
    }

    protected View.OnKeyListener d() {
        return this.f52748a;
    }

    protected View.OnTouchListener e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String[] strArr, int i2, String str2) {
        if (str == null || strArr == null || strArr.length == 0) {
            return;
        }
        int size = this.f52749b.f29247c.size();
        int i3 = i + 1;
        if ("•".equals(str) && i3 < size) {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (this.f52749b.d(str, strArr[i4], i3)) {
                    str2 = strArr[i4];
                    i2 = i4;
                    break;
                }
            }
            this.f52749b.a(this.f52749b.f29247c.get(i3));
            if (str2 != null) {
                a(str2, i2, i);
                return;
            }
            return;
        }
        this.f52749b.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(int i) {
        if (this.d.getSections().length <= i || i < 0) {
            return "";
        }
        Object obj = this.d.getSections()[i];
        return obj instanceof String ? (String) obj : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, int i2) {
        int positionForSection = this.d.getPositionForSection(i);
        int lastVisiblePosition = (this.f52750c.getLastVisiblePosition() - this.f52750c.getFirstVisiblePosition()) + 1;
        if (positionForSection != -1 && positionForSection + lastVisiblePosition <= this.f52750c.getCount()) {
            this.f52750c.setSelection(positionForSection);
        }
        if (positionForSection + lastVisiblePosition > this.f52750c.getCount()) {
            this.g = true;
            ListView listView = this.f52750c;
            listView.setSelection(listView.getCount() - 1);
        }
        this.f52749b.setOverLayInfo(i2, str);
        this.f52749b.a(str);
    }
}
