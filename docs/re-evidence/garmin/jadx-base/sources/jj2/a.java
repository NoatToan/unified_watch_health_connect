package jj2;

import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import i3.f2;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljj2/a;", "Li/c;", "<init>", "()V", "a", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends i.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f98963c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98964a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1905a.C1906a f98965b = AbstractC1905a.C1906a.f98966a;

    public a() {
        m.b(new f2(this, 24));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 2) && (currentFocus instanceof EditText))) {
            int[] iArr = new int[2];
            currentFocus.getLocationOnScreen(iArr);
            EditText editText = (EditText) currentFocus;
            float rawX = (motionEvent.getRawX() + editText.getLeft()) - iArr[0];
            float rawY = (motionEvent.getRawY() + editText.getTop()) - iArr[1];
            if ((rawX < editText.getLeft() || rawX > editText.getRight() || rawY < editText.getTop() || rawY > editText.getBottom()) && getWindow() != null) {
                getWindow().getDecorView();
                Object systemService = getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
            try {
                currentFocus.clearFocus();
            } catch (Exception unused) {
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null) {
            if (menu.size() == 0) {
                return super.onPrepareOptionsMenu(menu);
            }
            this.f98965b.getClass();
            int size = menu.size();
            for (int i14 = 0; i14 < size; i14++) {
                menu.getItem(i14).setVisible(true);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return this.f98964a;
    }

    /* JADX INFO: renamed from: jj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ljj2/a$a;", "", "<init>", "()V", "a", "Ljj2/a$a$a;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC1905a {

        /* JADX INFO: renamed from: jj2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljj2/a$a$a;", "Ljj2/a$a;", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1906a extends AbstractC1905a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1906a f98966a = new C1906a();

            private C1906a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1906a);
            }

            public final int hashCode() {
                return -147016121;
            }

            public final String toString() {
                return "ShowAll";
            }
        }

        public /* synthetic */ AbstractC1905a(j jVar) {
            this();
        }

        private AbstractC1905a() {
        }
    }
}
