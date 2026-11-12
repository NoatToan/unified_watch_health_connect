package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class qop {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Set<WeakReference<qop>> f46567b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f46568a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46569c;
    private ListView d;
    private int e;
    private WeakReference<View> g;
    private PopupWindow i;
    private int j;

    public qop(Context context, View view) {
        this.f46568a = context;
        if (context == null) {
            this.f46568a = BaseApplication.getContext();
        }
        this.i = new PopupWindow(view, -2, -2, true);
        if (SystemInfo.e()) {
            view.setBackgroundResource(R.drawable.popup_menu_bg);
            view.setClipToOutline(true);
            b();
        } else {
            view.setBackgroundResource(R.drawable.poplist_menu_bg);
        }
        this.i.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: qop.3
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                qop.this.e();
            }
        });
        view.measure(0, 0);
        this.f46569c = view.getMeasuredWidth();
        this.e = view.getMeasuredHeight();
        this.d = (ListView) view.findViewById(R.id.list_pop_window_tab);
    }

    private void b() {
        xeh.b(this.i, "setShadowEnabled", new Class[]{Boolean.TYPE}, new Object[]{true}, PopupWindow.class);
        xeh.b(this.i, "setShadowStyle", new Class[]{Integer.TYPE}, new Object[]{0}, PopupWindow.class);
        xeh.b(this.i, "setShadowSize", new Class[]{Integer.TYPE}, new Object[]{2}, PopupWindow.class);
        xeh.b(this.i, "setShadowColor", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(this.f46568a.getResources().getColor(R.color.hwspinner_list_shadow_color))}, PopupWindow.class);
        xeh.b(this.i, "setShadowClip", new Class[]{Boolean.TYPE}, new Object[]{false}, PopupWindow.class);
    }

    private void d() {
        float measuredHeight;
        View view;
        ListView listView = this.d;
        if (listView == null) {
            return;
        }
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null || adapter.getCount() <= 0 || (view = adapter.getView(0, null, this.d)) == null) {
            measuredHeight = -1.0f;
        } else {
            view.measure(0, 0);
            measuredHeight = view.getMeasuredHeight() / 2.0f;
        }
        xeh.b(this.i, "setShadowViewZ", new Class[]{Float.TYPE}, new Object[]{Float.valueOf(measuredHeight)}, PopupWindow.class);
    }

    public boolean a() {
        return this.i.isShowing();
    }

    public void e(View view, int i) {
        if (view == null) {
            return;
        }
        f46567b.add(new WeakReference<>(this));
        if (SystemInfo.e()) {
            d();
        }
        this.g = new WeakReference<>(view);
        this.j = i;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        a(this.i.getContentView());
        a(view, i, iArr);
        b(view, i, iArr);
        c(view, i, iArr);
    }

    public static void c() {
        for (WeakReference weakReference : new ArrayList(f46567b)) {
            qop qopVar = (qop) weakReference.get();
            if (qopVar == null || !qopVar.a()) {
                f46567b.remove(weakReference);
            } else {
                qopVar.e();
                WeakReference<View> weakReference2 = qopVar.g;
                if (weakReference2 != null && weakReference2.get() != null) {
                    final View view = qopVar.g.get();
                    view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qop.5
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            View view2;
                            if (qop.this == null || (view2 = view) == null) {
                                return;
                            }
                            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            qop qopVar2 = qop.this;
                            qopVar2.e(view, qopVar2.j);
                        }
                    });
                }
            }
        }
    }

    private void a(View view, int i, int[] iArr) {
        switch (i) {
            case 0:
                int width = (iArr[0] + view.getWidth()) - this.f46569c;
                if (LanguageUtil.ba(this.f46568a)) {
                    width = iArr[0];
                }
                this.i.showAtLocation(view, 0, width, iArr[1] + view.getHeight());
                break;
            case 1:
                if (LanguageUtil.ba(this.f46568a)) {
                    this.i.showAtLocation(view, 0, iArr[0] - qrs.d(this.f46568a, 48.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 3.0f));
                } else {
                    PopupWindow popupWindow = this.i;
                    int i2 = iArr[0];
                    int width2 = view.getWidth();
                    int iD = qrs.d(this.f46568a, 48.0f);
                    popupWindow.showAtLocation(view, 0, ((i2 + width2) + iD) - this.f46569c, iArr[1] + view.getHeight() + qrs.d(this.f46568a, 3.0f));
                }
                break;
            case 2:
                PopupWindow popupWindow2 = this.i;
                int i3 = iArr[0];
                int iD2 = qrs.d(this.f46568a, 4.0f);
                popupWindow2.showAtLocation(view, 0, (i3 - iD2) - this.f46569c, (iArr[1] + qrs.d(this.f46568a, 17.0f)) - (this.e / 2));
                break;
            case 3:
                PopupWindow popupWindow3 = this.i;
                int i4 = iArr[0];
                int i5 = this.f46569c / 2;
                popupWindow3.showAtLocation(view, 0, (i4 - i5) + qrs.d(this.f46568a, 42.0f), (iArr[1] - qrs.d(this.f46568a, 4.0f)) - this.e);
                break;
            case 4:
                PopupWindow popupWindow4 = this.i;
                int i6 = iArr[0];
                int iD3 = qrs.d(this.f46568a, 180.0f);
                popupWindow4.showAtLocation(view, 0, (i6 + iD3) - (this.f46569c / 2), iArr[1] + qrs.d(this.f46568a, 115.0f));
                break;
            case 5:
                PopupWindow popupWindow5 = this.i;
                int i7 = iArr[0];
                int iD4 = qrs.d(this.f46568a, 4.0f);
                int width3 = view.getWidth();
                popupWindow5.showAtLocation(view, 0, ((i7 + iD4) + width3) - this.f46569c, iArr[1] + qrs.d(this.f46568a, 4.0f) + view.getHeight());
                break;
            case 6:
                PopupWindow popupWindow6 = this.i;
                int i8 = iArr[0];
                int width4 = view.getWidth() / 2;
                popupWindow6.showAtLocation(view, 0, (i8 + width4) - qrs.d(this.f46568a, 30.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 3.0f));
                break;
        }
    }

    private void b(View view, int i, int[] iArr) {
        if (i != 20) {
            switch (i) {
                case 13:
                    PopupWindow popupWindow = this.i;
                    int right = view.getRight();
                    int width = view.getWidth() / 2;
                    popupWindow.showAtLocation(view, 0, (right - width) - qrs.d(this.f46568a, 16.0f), (iArr[1] - qrs.d(this.f46568a, 2.0f)) - this.e);
                    break;
                case 14:
                    if (LanguageUtil.ba(this.f46568a)) {
                        this.i.showAtLocation(view, 0, qrs.d(this.f46568a, 12.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 4.0f));
                    } else {
                        PopupWindow popupWindow2 = this.i;
                        int right2 = view.getRight();
                        int i2 = this.f46569c;
                        popupWindow2.showAtLocation(view, 0, (right2 - i2) - qrs.d(this.f46568a, 12.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 4.0f));
                    }
                    break;
                case 15:
                    if (LanguageUtil.ba(this.f46568a)) {
                        int width2 = ((Activity) this.f46568a).getWindowManager().getDefaultDisplay().getWidth();
                        int i3 = this.f46569c;
                        int iD = qrs.d(this.f46568a, 16.0f);
                        this.i.showAtLocation(view, 0, (width2 - i3) - iD, iArr[1] + view.getHeight() + qrs.d(this.f46568a, 17.0f));
                    } else {
                        this.i.showAtLocation(view, 0, qrs.d(this.f46568a, 16.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 17.0f));
                    }
                    break;
                case 16:
                    if (LanguageUtil.ba(this.f46568a)) {
                        this.i.showAtLocation(view, 0, qrs.d(this.f46568a, 12.0f), (iArr[1] - qrs.d(this.f46568a, 3.0f)) - this.e);
                    } else {
                        PopupWindow popupWindow3 = this.i;
                        int right3 = view.getRight();
                        int i4 = this.f46569c;
                        popupWindow3.showAtLocation(view, 0, (right3 - i4) - qrs.d(this.f46568a, 12.0f), (iArr[1] - qrs.d(this.f46568a, 3.0f)) - this.e);
                    }
                    break;
            }
            return;
        }
        b(view, iArr);
    }

    private void c(View view, int i, int[] iArr) {
        if (view.getWindowToken() == null) {
            LogUtil.j("PopView", "view.getWindowToken() is null");
        }
        switch (i) {
            case 7:
                PopupWindow popupWindow = this.i;
                int i2 = iArr[0];
                int width = view.getWidth() / 8;
                popupWindow.showAtLocation(view, 0, (i2 + (width * 5)) - (this.f46569c / 2), (iArr[1] + view.getHeight()) - qrs.d(this.f46568a, 10.0f));
                break;
            case 8:
                PopupWindow popupWindow2 = this.i;
                int i3 = iArr[0];
                int iD = qrs.d(this.f46568a, 4.0f);
                popupWindow2.showAtLocation(view, 0, (i3 - iD) + this.f46569c, iArr[1] + qrs.d(this.f46568a, 17.0f));
                break;
            case 9:
                PopupWindow popupWindow3 = this.i;
                int i4 = iArr[0];
                int iD2 = qrs.d(this.f46568a, 4.0f);
                popupWindow3.showAtLocation(view, 0, (i4 - iD2) + this.f46569c, iArr[1]);
                break;
            case 10:
                PopupWindow popupWindow4 = this.i;
                int i5 = iArr[0];
                int width2 = view.getWidth();
                int i6 = this.f46569c;
                popupWindow4.showAtLocation(view, 0, ((i5 + width2) - i6) + qrs.d(this.f46568a, 8.0f), (iArr[1] + view.getHeight()) - qrs.d(this.f46568a, 3.0f));
                break;
            default:
                switch (i) {
                    case 17:
                        int height = iArr[1] + view.getHeight();
                        int dimensionPixelSize = this.f46568a.getResources().getDimensionPixelSize(R.dimen.maxPaddingEnd);
                        if (!SystemInfo.e()) {
                            dimensionPixelSize = this.f46568a.getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
                            height -= this.f46568a.getResources().getDimensionPixelSize(R.dimen.health_common_15dp);
                        }
                        int i7 = qrs.i(this.f46568a);
                        if (LanguageUtil.ba(this.f46568a)) {
                            this.i.showAtLocation(view, 0, dimensionPixelSize, height);
                        } else {
                            this.i.showAtLocation(view, 0, (i7 - this.f46569c) - dimensionPixelSize, height);
                        }
                        break;
                    case 18:
                        this.i.showAtLocation(view, 0, iArr[0] - qrs.d(this.f46568a, 8.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 8.0f));
                        break;
                    case 19:
                        this.i.showAtLocation(view, 0, qrs.d(this.f46568a, 16.0f), iArr[1] + view.getHeight() + qrs.d(this.f46568a, 8.0f));
                        break;
                }
                break;
        }
    }

    private void b(View view, int[] iArr) {
        Context context = this.f46568a;
        if (context instanceof Activity) {
            if (LanguageUtil.ba(context)) {
                PopupWindow popupWindow = this.i;
                int width = ((Activity) this.f46568a).getWindowManager().getDefaultDisplay().getWidth();
                int i = this.f46569c;
                popupWindow.showAtLocation(view, 0, (width - i) - qrs.d(this.f46568a, 16.0f), iArr[1] + view.getHeight());
                return;
            }
            this.i.showAtLocation(view, 0, qrs.d(this.f46568a, 16.0f), iArr[1] + view.getHeight());
        }
    }

    public void e() {
        this.i.dismiss();
        for (WeakReference weakReference : new ArrayList(f46567b)) {
            if (((qop) weakReference.get()) == this) {
                f46567b.remove(weakReference);
                return;
            }
        }
    }

    public void a(View view) {
        if (view != null) {
            view.measure(0, 0);
            this.f46569c = view.getMeasuredWidth();
            this.e = view.getMeasuredHeight();
        }
    }
}
