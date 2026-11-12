package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
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
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import defpackage.b67;
import defpackage.mqf;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends ListPopupWindow implements mqf {
    public static Method J;
    public mqf I;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends b67 {
        public final int o;
        public final int p;
        public mqf q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public MenuItem f1628r;

        @RequiresApi(17)
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.o = 21;
                this.p = 22;
            } else {
                this.o = 22;
                this.p = 21;
            }
        }

        @Override // defpackage.b67
        public /* bridge */ /* synthetic */ int d(int i, int i2, int i3, int i4, int i5) {
            return super.d(i, i2, i3, i4, i5);
        }

        @Override // defpackage.b67
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i) {
            return super.e(motionEvent, i);
        }

        @Override // defpackage.b67, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // defpackage.b67, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // defpackage.b67, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // defpackage.b67, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // defpackage.b67, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            d dVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                    headersCount = 0;
                }
                g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= dVar.getCount()) ? null : dVar.getItem(i);
                MenuItem menuItem = this.f1628r;
                if (menuItem != item) {
                    e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.q.l(eVarB, menuItem);
                    }
                    this.f1628r = item;
                    if (item != null) {
                        this.q.k(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.p) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (d) adapter).b().e(false);
            return true;
        }

        @Override // defpackage.b67, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(mqf mqfVar) {
            this.q = mqfVar;
        }

        @Override // defpackage.b67, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    @RequiresApi(23)
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @RequiresApi(29)
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void M(Object obj) {
        a.a(this.F, (Transition) obj);
    }

    public void N(Object obj) {
        a.b(this.F, (Transition) obj);
    }

    public void O(mqf mqfVar) {
        this.I = mqfVar;
    }

    public void P(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.F, z);
            return;
        }
        Method method = J;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.mqf
    public void k(e eVar, MenuItem menuItem) {
        mqf mqfVar = this.I;
        if (mqfVar != null) {
            mqfVar.k(eVar, menuItem);
        }
    }

    @Override // defpackage.mqf
    public void l(e eVar, MenuItem menuItem) {
        mqf mqfVar = this.I;
        if (mqfVar != null) {
            mqfVar.l(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public b67 p(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
