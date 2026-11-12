package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "act", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/app/Activity;Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$b;)V", "b", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40568e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<b, e> f40569f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f40570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f40571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f40572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f40573d;

    public interface b {
        void g0(boolean z14);
    }

    private e(Activity activity, b bVar) {
        this.f40570a = bVar;
        View viewFindViewById = activity.findViewById(R.id.content);
        viewFindViewById.getClass();
        View childAt = ((ViewGroup) viewFindViewById).getChildAt(0);
        childAt.getClass();
        this.f40571b = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f40573d = activity.getResources().getDisplayMetrics().density;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        View view2 = this.f40571b;
        view2.getWindowVisibleDisplayFrame(rect);
        boolean z14 = ((float) (view2.getRootView().getHeight() - (rect.bottom - rect.top))) / this.f40573d > 200.0f;
        if (this.f40570a != null) {
            if (this.f40572c == null || !Boolean.valueOf(z14).equals(this.f40572c)) {
                this.f40572c = Boolean.valueOf(z14);
                b bVar = this.f40570a;
                if (bVar != null) {
                    bVar.g0(z14);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$a;", "", "<init>", "()V", "", "MAGIC_NUMBER", "I", "Ljava/util/HashMap;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$b;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e;", "Lkotlin/collections/HashMap;", "sListenerMap", "Ljava/util/HashMap;", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(androidx.fragment.app.m mVar, b bVar) {
            HashMap<b, e> map = e.f40569f;
            e eVarRemove = map.remove(bVar);
            p005kotlin.jvm.internal.j jVar = null;
            if (eVarRemove != null) {
                eVarRemove.f40570a = null;
                eVarRemove.f40571b.getViewTreeObserver().removeOnGlobalLayoutListener(eVarRemove);
            }
            map.put(bVar, new e(mVar, bVar, jVar));
        }

        public static void b(View view2) {
            Object systemService = view2.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        }

        private a() {
        }
    }

    public /* synthetic */ e(Activity activity, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(activity, bVar);
    }
}
