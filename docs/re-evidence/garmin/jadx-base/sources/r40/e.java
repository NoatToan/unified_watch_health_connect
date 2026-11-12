package r40;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import as.n;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c0;
import p005kotlin.Metadata;
import p40.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr40/e;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f150271k = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c60.b f150272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bb0.d f150273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f150274j;

    public e() {
        super(R.layout.course_planner_bottom_sheet_header, null, R.layout.course_planner_bottom_sheet_content, false, 10, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        n nVar = this.f150274j;
        if (nVar != null) {
            nVar.invoke();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        g gVar = new g(view2);
        d dVar = new d(this, 1);
        ComposeView composeView = gVar.f150278a;
        if (composeView != null) {
            composeView.setContent(new z3.e(521627034, true, new f(dVar, 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        c cVar = new c(view2);
        d dVar = new d(this, 0);
        ComposeView composeView = cVar.f150268a;
        if (composeView != null) {
            composeView.setContent(new z3.e(1913210042, true, new r(dVar, 20)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr40/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
