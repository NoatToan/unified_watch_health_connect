package com.garmin.android.apps.connectmobile.courses.presentation.map;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import e23.p;
import java.util.List;
import k50.f;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.x3;
import r53.b2;
import u20.g;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/map/CourseMapActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lu20/g;", "Ll40/b;", "<init>", "()V", "a", "Lm50/c;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseMapActivity extends com.garmin.android.apps.connectmobile.c implements g, l40.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33059b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33060a = m.a(n.NONE, new d(this, null, null, new k01.a(26)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<m50.a, Unit> {
        public b(Object obj) {
            super(1, obj, CourseMapActivity.class, "onAction", "onAction(Lcom/garmin/android/apps/connectmobile/courses/presentation/map/model/CourseMapAction;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(m50.a aVar) {
            m50.a aVar2 = aVar;
            aVar2.getClass();
            CourseMapActivity courseMapActivity = (CourseMapActivity) this.receiver;
            a aVar3 = CourseMapActivity.f33059b;
            courseMapActivity.getClass();
            if (s.g(aVar2, m50.a.C2217a.f116641a)) {
                courseMapActivity.onNavigateUp();
                return Unit.INSTANCE;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapActivity$onCreate$1$1$2$1", f = "CourseMapActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<m50.c> f33062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<m50.c> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f33062b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CourseMapActivity.this.new c(this.f33062b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = CourseMapActivity.f33059b;
            boolean z14 = this.f33062b.getF182175a().f116644a;
            CourseMapActivity courseMapActivity = CourseMapActivity.this;
            if (z14) {
                courseMapActivity.showProgressOverlay();
            } else {
                courseMapActivity.hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33066d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33063a = gVar;
            this.f33064b = qualifier;
            this.f33065c = aVar;
            this.f33066d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, k50.f] */
        @Override // e23.a
        public final f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33063a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33065c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), f189591b, null, defaultViewModelCreationExtras, this.f33064b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33066d, 4, null);
        }
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        ca().F3(aVar);
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2 */
    public final b2 getX() {
        return ca().f102929e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final f ca() {
        return (f) this.f33060a.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        f fVarCa = ca();
        fVarCa.getClass();
        ge1.b.T(v1.a(fVarCa), null, null, new k50.b(fVarCa, m50.b.a.f116642a, null), 3);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // u20.g
    /* JADX INFO: renamed from: j6 */
    public final com.garmin.android.apps.connectmobile.courses.model.i getF104023a() {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM;
        List<w20.a> list = ((m50.c) ca().f102926b.f150540a.getValue()).f116645b;
        if (list == null || list.size() != 1) {
            return com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
        }
        w20.a aVar = (w20.a) h0.d0(list);
        return (aVar == null || (eVar = aVar.f181476a) == null || (iVarM = eVar.m()) == null) ? com.garmin.android.apps.connectmobile.courses.model.i.OTHER : iVarM;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1857621595, true, new k50.a(this, 0)));
    }

    @Override // u20.g
    public final void p5(com.garmin.android.library.mapsdkadapter.e eVar, List<? extends fn0.c> list) {
        w20.a aVar;
        list.getClass();
        f fVarCa = ca();
        List<w20.a> list2 = ((m50.c) fVarCa.f102925a.getValue()).f116645b;
        List<fn0.a> list3 = (list2 == null || (aVar = (w20.a) h0.d0(list2)) == null) ? null : aVar.f181478c;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        ge1.b.T(v1.a(fVarCa), null, null, new k50.b(fVarCa, new m50.b.C2218b(list3), null), 3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/map/CourseMapActivity$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(com.garmin.android.apps.connectmobile.c cVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            eVar.getClass();
            ((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).G(eVar);
            cVar.startActivity(new Intent(cVar, (Class<?>) CourseMapActivity.class));
        }

        private a() {
        }
    }
}
