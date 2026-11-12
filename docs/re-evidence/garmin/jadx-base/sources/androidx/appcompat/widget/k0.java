package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends i0 implements j0 {
    public static final Method F;
    public androidx.appcompat.view.menu.d.c E;

    public static class a {
        private a() {
        }

        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(PopupWindow popupWindow, boolean z14) {
            popupWindow.setTouchModal(z14);
        }
    }

    public static class c extends d0 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f5165m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f5166n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public j0 f5167o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public androidx.appcompat.view.menu.j f5168p;

        public c(Context context, boolean z14) {
            super(context, z14);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f5165m = 21;
                this.f5166n = 22;
            } else {
                this.f5165m = 22;
                this.f5166n = 21;
            }
        }

        @Override // androidx.appcompat.widget.d0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.g gVar;
            int headersCount;
            int iPointToPosition;
            int i14;
            if (this.f5167o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    gVar = (androidx.appcompat.view.menu.g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (androidx.appcompat.view.menu.g) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.j item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i14 = iPointToPosition - headersCount) < 0 || i14 >= gVar.getCount()) ? null : gVar.getItem(i14);
                androidx.appcompat.view.menu.j jVar = this.f5168p;
                if (jVar != item) {
                    androidx.appcompat.view.menu.h hVar = gVar.f4764a;
                    if (jVar != null) {
                        this.f5167o.d(hVar, jVar);
                    }
                    this.f5168p = item;
                    if (item != null) {
                        this.f5167o.f(hVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i14, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i14 == this.f5165m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i14 != this.f5166n) {
                return super.onKeyDown(i14, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.g) adapter).f4764a.close(false);
            return true;
        }

        public void setHoverListener(j0 j0Var) {
            this.f5167o = j0Var;
        }

        @Override // androidx.appcompat.widget.d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
    }

    @Override // androidx.appcompat.widget.j0
    public final void d(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        androidx.appcompat.view.menu.d.c cVar = this.E;
        if (cVar != null) {
            cVar.d(hVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.j0
    public final void f(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        androidx.appcompat.view.menu.d.c cVar = this.E;
        if (cVar != null) {
            cVar.f(hVar, jVar);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final d0 o(Context context, boolean z14) {
        c cVar = new c(context, z14);
        cVar.setHoverListener(this);
        return cVar;
    }
}
