package com.garmin.android.apps.connectmobile.courses.presentation.setup;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import k30.k;
import n30.e;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import s20.h;
import xn.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/setup/CourseParametersActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "La60/b;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseParametersActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33102c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f33103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33104b = m.a(n.NONE, new c(this, null, null, new r(this, 8)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<a60.a, Unit> {
        public b(Object obj) {
            super(1, obj, CourseParametersActivity.class, "onAction", "onAction(Lcom/garmin/android/apps/connectmobile/courses/presentation/setup/model/CourseParametersAction;)V", 0);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o13.l] */
        @Override // e23.l
        public final Unit invoke(a60.a aVar) {
            double dDoubleValue;
            double d14;
            a60.a aVar2 = aVar;
            aVar2.getClass();
            CourseParametersActivity courseParametersActivity = (CourseParametersActivity) this.receiver;
            a aVar3 = CourseParametersActivity.f33102c;
            courseParametersActivity.getClass();
            boolean zEquals = aVar2.equals(a60.a.C0016a.f1527a);
            ?? r14 = courseParametersActivity.f33104b;
            if (zEquals) {
                a60.b bVar = (a60.b) ((y50.c) r14.getValue()).f194489b.f150540a.getValue();
                boolean z14 = bVar.f1546l;
                i iVar = bVar.f1544j;
                boolean z15 = bVar.f1540f;
                boolean z16 = bVar.f1539e;
                boolean z17 = bVar.f1538d;
                Double d15 = bVar.f1541g;
                w20.b bVar2 = bVar.f1545k;
                k kVar = bVar.f1536b;
                String str = bVar.f1535a;
                if (z14) {
                    l3.a aVar4 = l3.f23124b;
                    dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                    aVar4.getClass();
                    d14 = 1000.0d;
                } else {
                    l3.a aVar5 = l3.f23124b;
                    dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                    aVar5.getClass();
                    d14 = 1609.344d;
                }
                double d16 = dDoubleValue * d14;
                if (bVar.f1547m) {
                    Intent intent = new Intent();
                    intent.putExtra("GCM_extra_course_name", str == null ? "" : str);
                    intent.putExtra("GCM_extra_course_routing_type", kVar);
                    intent.putExtra("GCM_extra_course_avoid_high_traffic", z17);
                    intent.putExtra("GCM_extra_course_avoid_closed_roads", z16);
                    intent.putExtra("GCM_extra_course_avoid_unpaved_roads", z15);
                    intent.putExtra("GCM_extra_course_distance", d16);
                    intent.putExtra("GCM_extra_course_direction", bVar2);
                    courseParametersActivity.setResult(-1, intent);
                    courseParametersActivity.finish();
                } else if (((h) KoinJavaComponent.get$default(h.class, null, null, 6, null)).c()) {
                    MultipleCoursesActivity.a aVar6 = MultipleCoursesActivity.f33000c;
                    String str2 = str == null ? "" : str;
                    boolean z18 = bVar.f1538d;
                    boolean z19 = bVar.f1539e;
                    boolean z24 = bVar.f1540f;
                    int i14 = bVar.f1548n;
                    aVar6.getClass();
                    Intent intent2 = new Intent(courseParametersActivity, (Class<?>) MultipleCoursesActivity.class);
                    intent2.putExtra("GCM_extra_course_type", iVar);
                    intent2.putExtra("GCM_extra_course_name", str2);
                    intent2.putExtra("GCM_extra_automatic_course_params", new e(kVar, z18, z19, z24, d16, bVar2, i14));
                    courseParametersActivity.startActivityForResult(intent2, 111);
                } else {
                    CreateCourseActivity.a aVar7 = CreateCourseActivity.f32989g;
                    String str3 = str == null ? "" : str;
                    int i15 = bVar.f1548n;
                    aVar7.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e();
                    eVar.j0(iVar);
                    eVar.courseName = str3;
                    eVar.sourceTypeId = 3L;
                    eVar.z0(false);
                    Intent intent3 = new Intent(courseParametersActivity, (Class<?>) CreateCourseActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("GCM_extra_course_data", new w20.a(eVar, null, null, null, null, false, 62, null));
                    bundle.putSerializable("GCM_extra_course_routing_type", kVar);
                    bundle.putBoolean("GCM_extra_course_avoid_high_traffic", z17);
                    bundle.putBoolean("GCM_extra_course_avoid_closed_roads", z16);
                    bundle.putBoolean("GCM_extra_course_avoid_unpaved_roads", z15);
                    bundle.putDouble("GCM_extra_course_distance", d16);
                    bundle.putSerializable("GCM_extra_course_direction", bVar2);
                    bundle.putInt("GCM_create_course_flow", i15);
                    com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent3, bundle);
                    courseParametersActivity.startActivityForResult(intent3, 111);
                }
            } else {
                p2 p2Var = ((y50.c) r14.getValue()).f194488a;
                if (aVar2 instanceof a60.a.g) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), ((a60.a.g) aVar2).f1533a, null, false, false, false, null, null, 16382));
                } else if (aVar2 instanceof a60.a.h) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), null, ((a60.a.h) aVar2).f1534a, false, false, false, null, null, 16381));
                } else if (aVar2 instanceof a60.a.c) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), null, null, ((a60.a.c) aVar2).f1529a, false, false, null, null, 16375));
                } else if (aVar2 instanceof a60.a.b) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), null, null, false, ((a60.a.b) aVar2).f1528a, false, null, null, 16367));
                } else if (aVar2 instanceof a60.a.d) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), null, null, false, false, ((a60.a.d) aVar2).f1530a, null, null, 16351));
                } else if (aVar2 instanceof a60.a.f) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), null, null, false, false, false, ((a60.a.f) aVar2).f1532a, null, 16319));
                } else if (aVar2 instanceof a60.a.e) {
                    p2Var.k(null, a60.b.a((a60.b) p2Var.getValue(), null, null, false, false, false, null, ((a60.a.e) aVar2).f1531a, 15359));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y50.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f33105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33108d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33105a = gVar;
            this.f33106b = qualifier;
            this.f33107c = aVar;
            this.f33108d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, y50.c] */
        @Override // e23.a
        public final y50.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f33105a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33107c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(y50.c.class), f189591b, null, defaultViewModelCreationExtras, this.f33106b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33108d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 111) {
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(true, R.string.lbl_course_setup);
        if (bundle == null) {
            Intent intent = getIntent();
            bundle = intent != null ? intent.getExtras() : null;
        }
        this.f33103a = bundle;
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1612598698, true, new y50.b(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.f33103a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/setup/CourseParametersActivity$a;", "", "<init>", "()V", "", "EXIT_REQUEST_CODE", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
