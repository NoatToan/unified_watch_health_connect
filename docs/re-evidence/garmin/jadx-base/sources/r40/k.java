package r40;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p40.r;
import qw0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr40/k;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f150284l = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c32.k f150285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b41.a f150286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ad.b f150287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f150288k;

    public k() {
        super(R.layout.course_planner_bottom_sheet_header, null, R.layout.course_planner_bottom_sheet_content, false, 10, null);
        this.f150288k = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        super.onCreate(bundle);
        ad.b bVar = this.f150287j;
        if (bVar == null || (list = bVar.f2715b) == null) {
            return;
        }
        this.f150288k.addAll(list);
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        i iVar = new i(view2);
        y yVar = new y(this, 7);
        ArrayList arrayList = this.f150288k;
        arrayList.getClass();
        ComposeView composeView = iVar.f150283a;
        if (composeView != null) {
            composeView.setContent(new z3.e(-987618013, true, new h(arrayList, yVar, 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        c cVar = new c(view2);
        q42.d dVar = new q42.d(this, 29);
        ComposeView composeView = cVar.f150268a;
        if (composeView != null) {
            composeView.setContent(new z3.e(1913210042, true, new r(dVar, 20)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr40/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
