package p40;

import am.e1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp40/l;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends com.garmin.android.apps.connectmobile.c0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f135693p = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f135694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f135695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c60.b f135696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e1 f135697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bp.h f135698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a03.h0 f135699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e23.l<? super Integer, Unit> f135700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c60.c f135701o;

    public l() {
        super(R.layout.course_planner_bottom_sheet_header, null, R.layout.course_planner_bottom_sheet_content, false, 10, null);
        this.f135695i = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("coursePoint")) {
                this.f135694h = Long.valueOf(arguments.getLong("coursePoint"));
            }
            if (arguments.containsKey("isEditable")) {
                this.f135695i = arguments.getBoolean("isEditable");
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View view3 = getView();
        if (view3 != null) {
            if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                view3.addOnLayoutChangeListener(new m(this));
                return;
            }
            w6().setPeekHeight(view3.findViewById(R.id.bottom_sheet_header).getMeasuredHeight());
            w6().setState(4);
            e23.l<? super Integer, Unit> lVar = this.f135700n;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(w6().getPeekHeight()));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        w wVar = new w(view2);
        c60.c cVar = this.f135701o;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = cVar != null ? (com.garmin.android.apps.connectmobile.courses.model.g) cVar.invoke(this.f135694h) : null;
        boolean z14 = this.f135695i;
        k kVar = new k(this, 2);
        if (gVar != null) {
            Context context = wVar.f135770a.getContext();
            context.getClass();
            q40.b bVarA = v0.a(gVar, context, false, 6);
            ComposeView composeView = wVar.f135771b;
            if (composeView != null) {
                composeView.setContent(new z3.e(785284876, true, new v(bVarA, z14, kVar, 0)));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        z zVar = new z(view2);
        c60.c cVar = this.f135701o;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = cVar != null ? (com.garmin.android.apps.connectmobile.courses.model.g) cVar.invoke(this.f135694h) : null;
        boolean z14 = this.f135695i;
        ov1.u uVar = new ov1.u(this, 8);
        k kVar = new k(this, 0);
        k kVar2 = new k(this, 1);
        if (gVar != null) {
            Context context = zVar.f135779a.getContext();
            context.getClass();
            q40.b bVarA = v0.a(gVar, context, false, 6);
            ComposeView composeView = zVar.f135780b;
            if (composeView != null) {
                composeView.setContent(new z3.e(770312915, true, new y(bVarA, z14, kVar2, kVar, uVar, 0)));
            }
        }
    }

    public final void z6() {
        c60.b bVar = this.f135696j;
        if (bVar != null) {
            bVar.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lp40/l$a;", "", "<init>", "()V", "", "COURSE_POINT_KEY", "Ljava/lang/String;", "EDITABLE_KEY", "TAG", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
