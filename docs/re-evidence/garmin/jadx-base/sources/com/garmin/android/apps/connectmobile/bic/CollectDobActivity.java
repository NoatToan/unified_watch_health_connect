package com.garmin.android.apps.connectmobile.bic;

import a42.z;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import d81.t;
import dv.f;
import dv.g;
import e23.l;
import e23.p;
import gw.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.w3;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import t13.h;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/CollectDobActivity;", "Lcom/garmin/android/apps/connectmobile/bic/a;", "<init>", "()V", "a", "", "showLoading", "showErrorDialog", "Lve2/e;", "environment", "", "applicationId", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CollectDobActivity extends com.garmin.android.apps.connectmobile.bic.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f30702e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f30703d = new w1(s0.f105811a.b(g.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bic.CollectDobActivity$onCreate$composeView$1$1$1$1$1", f = "CollectDobActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f30705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f30705b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CollectDobActivity.this.new b(this.f30705b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = CollectDobActivity.f30702e;
            boolean zBooleanValue = this.f30705b.getF182175a().booleanValue();
            CollectDobActivity collectDobActivity = CollectDobActivity.this;
            if (zBooleanValue) {
                collectDobActivity.showProgressOverlay();
            } else {
                collectDobActivity.hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f30706a;

        public c(b.g gVar) {
            this.f30706a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30706a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f30707a;

        public d(b.g gVar) {
            this.f30707a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30707a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f30709b;

        public e(e23.a aVar, b.g gVar) {
            this.f30708a = aVar;
            this.f30709b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30708a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30709b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void da(h4.r rVar, ve2.e eVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        e23.a aVar3;
        e23.a aVar4;
        h4.r rVar2;
        o0 o0VarE = mVar.E(-1587586266);
        int i15 = i14 | 6 | (o0VarE.k(eVar.ordinal()) ? 32 : 16) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar5 = h4.r.S;
            p3.x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            d92.b.f58623a.getClass();
            boolean zD = d92.b.d(o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(zD ? "GCM_ANDROID_DARK" : "GCM_ANDROID_LIGHT");
                o0VarE.K(objQ2);
            }
            h4.r rVarD = x2.d(aVar5, 1.0f);
            qi2.a aVar6 = new qi2.a(ui2.a.valueOf(eVar.name()), (String) ((p1) objQ2).getF182175a(), false, 4, null);
            boolean zR = o0VarE.r(this) | o0VarE.r(b0Var);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                aVar3 = aVar;
                objQ3 = new ci0.b(this, 11, b0Var, aVar3);
                o0VarE.K(objQ3);
            } else {
                aVar3 = aVar;
            }
            l lVar = (l) objQ3;
            boolean zR2 = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                aVar4 = aVar2;
                objQ4 = new cn1.d(23, (Object) this, (Object) aVar4);
                o0VarE.K(objQ4);
            } else {
                aVar4 = aVar2;
            }
            wi2.b.b(aVar6, rVarD, lVar, (l) objQ4, o0VarE, 0);
            rVar2 = aVar5;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) this, (Object) rVar2, (Object) eVar, (Object) aVar3, (Object) aVar4, i14, 24);
        }
    }

    public final void ea() {
        g gVar = (g) this.f30703d.getValue();
        com.garmin.android.apps.connectmobile.cloudmessaging.a.a(this);
        com.garmin.android.library.backgroundtaskmanagement.c.d(new k(null), null);
        ge1.b.T(v1.a(gVar), null, null, new f(null), 3);
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final List<androidx.lifecycle.n> getCommonBehaviorHandlers() {
        List<androidx.lifecycle.n> commonBehaviorHandlers = super.getCommonBehaviorHandlers();
        commonBehaviorHandlers.getClass();
        ArrayList arrayList = new ArrayList(commonBehaviorHandlers);
        arrayList.removeIf(new a73.n(new t(27), 7));
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_parallax_content_frame);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        initActionBar(R.string.lbl_confirm_details, 1);
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        composeView.setContent(new z3.e(869287039, true, new dv.c(this, 0)));
        frameLayout.addView(composeView);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/CollectDobActivity$a;", "", "<init>", "()V", "", "SSO_PORTAL_DARK_APP_ID", "Ljava/lang/String;", "SSO_PORTAL_LIGHT_APP_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
