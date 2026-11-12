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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp40/h0;", "Lcom/garmin/android/apps/connectmobile/c0;", "", "isNewCoursePoint", "<init>", "(Z)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends com.garmin.android.apps.connectmobile.c0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f135666q = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f135667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f135668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f135669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.f f135670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ak0.m f135671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e1 f135672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bp.h f135673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bp.h f135674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a61.d f135675p;

    public h0(boolean z14) {
        super(R.layout.course_planner_bottom_sheet_header, null, R.layout.course_planner_bottom_sheet_content, false, 10, null);
        this.f135667h = z14;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f135669j = Long.valueOf(arguments.getLong("coursePoint"));
            String string = arguments.getString("coursePointType");
            if (string != null) {
                com.garmin.android.apps.connectmobile.courses.model.f.f32898h.getClass();
                this.f135670k = com.garmin.android.apps.connectmobile.courses.model.f.a.a(string);
            } else {
                string = null;
            }
            if (string != null) {
                return;
            }
        }
        androidx.fragment.app.v parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.k(this);
        aVar.s(true, true);
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        com.garmin.android.apps.connectmobile.courses.model.f fVar;
        a61.d dVar;
        this.f135668i = new t0(view2);
        Long l14 = this.f135669j;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = null;
        if (l14 != null && (fVar = this.f135670k) != null && (dVar = this.f135675p) != null) {
            gVar = (com.garmin.android.apps.connectmobile.courses.model.g) dVar.invoke(l14, fVar);
        }
        if (gVar != null) {
            Context context = view2.getContext();
            context.getClass();
            z6(v0.a(gVar, context, this.f135667h, 2));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        n0 n0Var = new n0(view2);
        f0 f0Var = new f0(this, 0);
        f0 f0Var2 = new f0(this, 1);
        ComposeView composeView = n0Var.f135707a;
        if (composeView != null) {
            composeView.setContent(new z3.e(863865776, true, new m0(f0Var2, f0Var, 0)));
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [p40.g0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p40.g0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p40.g0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [p40.g0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p40.g0] */
    public final void z6(q40.b bVar) {
        t0 t0Var = this.f135668i;
        if (t0Var == null) {
            p005kotlin.jvm.internal.s.m("pointDetailViewHolder");
            throw null;
        }
        final int i14 = 0;
        ?? r14 = new e23.l(this) { // from class: p40.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f135664b;

            {
                this.f135664b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws Exception {
                int i15 = i14;
                h0 h0Var = this.f135664b;
                switch (i15) {
                    case 0:
                        q40.b bVar2 = (q40.b) obj;
                        h0.a aVar = h0.f135666q;
                        bVar2.getClass();
                        h0Var.z6(bVar2);
                        break;
                    case 1:
                        q40.b bVar3 = (q40.b) obj;
                        h0.a aVar2 = h0.f135666q;
                        bVar3.getClass();
                        bp.h hVar = h0Var.f135673n;
                        if (hVar != null) {
                            hVar.invoke(bVar3);
                        }
                        break;
                    case 2:
                        q40.b bVar4 = (q40.b) obj;
                        h0.a aVar3 = h0.f135666q;
                        bVar4.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar4.f142580g;
                        u40.j.f168573h.getClass();
                        u40.j jVarA = u40.j.a.a(fVar, true);
                        jVarA.f168575g = new o50.a(22, bVar4, h0Var);
                        jVarA.show(h0Var.getParentFragmentManager(), "");
                        break;
                    case 3:
                        q40.b bVar5 = (q40.b) obj;
                        h0.a aVar4 = h0.f135666q;
                        bVar5.getClass();
                        bp.h hVar2 = h0Var.f135674o;
                        if (hVar2 != null) {
                            hVar2.invoke(bVar5);
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        h0.a aVar5 = h0.f135666q;
                        int i16 = (int) fFloatValue;
                        View view2 = h0Var.getView();
                        if (view2 != null) {
                            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                                view2.addOnLayoutChangeListener(new i0(h0Var, i16));
                            } else {
                                h0Var.w6().setPeekHeight(view2.findViewById(R.id.bottom_sheet_header).getMeasuredHeight() + i16);
                                h0Var.w6().setState(3);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        ?? r15 = new e23.l(this) { // from class: p40.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f135664b;

            {
                this.f135664b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws Exception {
                int i16 = i15;
                h0 h0Var = this.f135664b;
                switch (i16) {
                    case 0:
                        q40.b bVar2 = (q40.b) obj;
                        h0.a aVar = h0.f135666q;
                        bVar2.getClass();
                        h0Var.z6(bVar2);
                        break;
                    case 1:
                        q40.b bVar3 = (q40.b) obj;
                        h0.a aVar2 = h0.f135666q;
                        bVar3.getClass();
                        bp.h hVar = h0Var.f135673n;
                        if (hVar != null) {
                            hVar.invoke(bVar3);
                        }
                        break;
                    case 2:
                        q40.b bVar4 = (q40.b) obj;
                        h0.a aVar3 = h0.f135666q;
                        bVar4.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar4.f142580g;
                        u40.j.f168573h.getClass();
                        u40.j jVarA = u40.j.a.a(fVar, true);
                        jVarA.f168575g = new o50.a(22, bVar4, h0Var);
                        jVarA.show(h0Var.getParentFragmentManager(), "");
                        break;
                    case 3:
                        q40.b bVar5 = (q40.b) obj;
                        h0.a aVar4 = h0.f135666q;
                        bVar5.getClass();
                        bp.h hVar2 = h0Var.f135674o;
                        if (hVar2 != null) {
                            hVar2.invoke(bVar5);
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        h0.a aVar5 = h0.f135666q;
                        int i17 = (int) fFloatValue;
                        View view2 = h0Var.getView();
                        if (view2 != null) {
                            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                                view2.addOnLayoutChangeListener(new i0(h0Var, i17));
                            } else {
                                h0Var.w6().setPeekHeight(view2.findViewById(R.id.bottom_sheet_header).getMeasuredHeight() + i17);
                                h0Var.w6().setState(3);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i16 = 2;
        ?? r16 = new e23.l(this) { // from class: p40.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f135664b;

            {
                this.f135664b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws Exception {
                int i17 = i16;
                h0 h0Var = this.f135664b;
                switch (i17) {
                    case 0:
                        q40.b bVar2 = (q40.b) obj;
                        h0.a aVar = h0.f135666q;
                        bVar2.getClass();
                        h0Var.z6(bVar2);
                        break;
                    case 1:
                        q40.b bVar3 = (q40.b) obj;
                        h0.a aVar2 = h0.f135666q;
                        bVar3.getClass();
                        bp.h hVar = h0Var.f135673n;
                        if (hVar != null) {
                            hVar.invoke(bVar3);
                        }
                        break;
                    case 2:
                        q40.b bVar4 = (q40.b) obj;
                        h0.a aVar3 = h0.f135666q;
                        bVar4.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar4.f142580g;
                        u40.j.f168573h.getClass();
                        u40.j jVarA = u40.j.a.a(fVar, true);
                        jVarA.f168575g = new o50.a(22, bVar4, h0Var);
                        jVarA.show(h0Var.getParentFragmentManager(), "");
                        break;
                    case 3:
                        q40.b bVar5 = (q40.b) obj;
                        h0.a aVar4 = h0.f135666q;
                        bVar5.getClass();
                        bp.h hVar2 = h0Var.f135674o;
                        if (hVar2 != null) {
                            hVar2.invoke(bVar5);
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        h0.a aVar5 = h0.f135666q;
                        int i18 = (int) fFloatValue;
                        View view2 = h0Var.getView();
                        if (view2 != null) {
                            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                                view2.addOnLayoutChangeListener(new i0(h0Var, i18));
                            } else {
                                h0Var.w6().setPeekHeight(view2.findViewById(R.id.bottom_sheet_header).getMeasuredHeight() + i18);
                                h0Var.w6().setState(3);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i17 = 3;
        ?? r17 = new e23.l(this) { // from class: p40.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f135664b;

            {
                this.f135664b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws Exception {
                int i18 = i17;
                h0 h0Var = this.f135664b;
                switch (i18) {
                    case 0:
                        q40.b bVar2 = (q40.b) obj;
                        h0.a aVar = h0.f135666q;
                        bVar2.getClass();
                        h0Var.z6(bVar2);
                        break;
                    case 1:
                        q40.b bVar3 = (q40.b) obj;
                        h0.a aVar2 = h0.f135666q;
                        bVar3.getClass();
                        bp.h hVar = h0Var.f135673n;
                        if (hVar != null) {
                            hVar.invoke(bVar3);
                        }
                        break;
                    case 2:
                        q40.b bVar4 = (q40.b) obj;
                        h0.a aVar3 = h0.f135666q;
                        bVar4.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar4.f142580g;
                        u40.j.f168573h.getClass();
                        u40.j jVarA = u40.j.a.a(fVar, true);
                        jVarA.f168575g = new o50.a(22, bVar4, h0Var);
                        jVarA.show(h0Var.getParentFragmentManager(), "");
                        break;
                    case 3:
                        q40.b bVar5 = (q40.b) obj;
                        h0.a aVar4 = h0.f135666q;
                        bVar5.getClass();
                        bp.h hVar2 = h0Var.f135674o;
                        if (hVar2 != null) {
                            hVar2.invoke(bVar5);
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        h0.a aVar5 = h0.f135666q;
                        int i19 = (int) fFloatValue;
                        View view2 = h0Var.getView();
                        if (view2 != null) {
                            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                                view2.addOnLayoutChangeListener(new i0(h0Var, i19));
                            } else {
                                h0Var.w6().setPeekHeight(view2.findViewById(R.id.bottom_sheet_header).getMeasuredHeight() + i19);
                                h0Var.w6().setState(3);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i18 = 4;
        ?? r18 = new e23.l(this) { // from class: p40.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f135664b;

            {
                this.f135664b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws Exception {
                int i19 = i18;
                h0 h0Var = this.f135664b;
                switch (i19) {
                    case 0:
                        q40.b bVar2 = (q40.b) obj;
                        h0.a aVar = h0.f135666q;
                        bVar2.getClass();
                        h0Var.z6(bVar2);
                        break;
                    case 1:
                        q40.b bVar3 = (q40.b) obj;
                        h0.a aVar2 = h0.f135666q;
                        bVar3.getClass();
                        bp.h hVar = h0Var.f135673n;
                        if (hVar != null) {
                            hVar.invoke(bVar3);
                        }
                        break;
                    case 2:
                        q40.b bVar4 = (q40.b) obj;
                        h0.a aVar3 = h0.f135666q;
                        bVar4.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar4.f142580g;
                        u40.j.f168573h.getClass();
                        u40.j jVarA = u40.j.a.a(fVar, true);
                        jVarA.f168575g = new o50.a(22, bVar4, h0Var);
                        jVarA.show(h0Var.getParentFragmentManager(), "");
                        break;
                    case 3:
                        q40.b bVar5 = (q40.b) obj;
                        h0.a aVar4 = h0.f135666q;
                        bVar5.getClass();
                        bp.h hVar2 = h0Var.f135674o;
                        if (hVar2 != null) {
                            hVar2.invoke(bVar5);
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        h0.a aVar5 = h0.f135666q;
                        int i110 = (int) fFloatValue;
                        View view2 = h0Var.getView();
                        if (view2 != null) {
                            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                                view2.addOnLayoutChangeListener(new i0(h0Var, i110));
                            } else {
                                h0Var.w6().setPeekHeight(view2.findViewById(R.id.bottom_sheet_header).getMeasuredHeight() + i110);
                                h0Var.w6().setState(3);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        bVar.getClass();
        ComposeView composeView = t0Var.f135758a;
        if (composeView != null) {
            composeView.setContent(new z3.e(46453528, true, new s0(bVar, t0Var, r14, r15, r16, r17, r18, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lp40/h0$a;", "", "<init>", "()V", "", "COURSE_POINT_KEY", "Ljava/lang/String;", "COURSE_POINT_TYPE_KEY", "TAG", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
