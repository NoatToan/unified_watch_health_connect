package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e23.p;
import fw.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import ro0.l;
import v13.i;
import vb.h;
import w61.r0;
import w61.x;
import x61.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/TrainingLoadActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingLoadActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40177b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f40178a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingload.TrainingLoadActivity$onDeviceChanged$1", f = "TrainingLoadActivity.kt", l = {151}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40179a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f40181c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return TrainingLoadActivity.this.new b(this.f40181c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40179a;
            if (i14 == 0) {
                r.b(obj);
                x xVar = TrainingLoadActivity.this.f40178a;
                if (xVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                this.f40179a = 1;
                if (xVar.A4(this.f40181c, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit ca(TrainingLoadActivity trainingLoadActivity, o13.p pVar) {
        pVar.getClass();
        com.garmin.android.apps.connectmobile.performance.model.a aVar = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
        Set set = (Set) pVar.f128595b;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>((Collection<? extends Object>) (set != null ? set : new ArrayList()));
        Intent intent = new Intent();
        intent.putExtra("EXTRA_LAST_USED_DEVICE", aVar);
        intent.putParcelableArrayListExtra("EXTRA_ALL_USED_DEVICE", arrayList);
        trainingLoadActivity.setResult(-1, intent);
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b
    public final void m5(String str) {
        ge1.b.T(f0.w(this), null, null, new b(str, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        x xVar = this.f40178a;
        if (xVar == null) {
            s.m("viewModel");
            throw null;
        }
        y0<w61.f<o13.p<com.garmin.android.apps.connectmobile.performance.model.a, Set<com.garmin.android.apps.connectmobile.performance.model.a>>>> y0Var = xVar.D;
        m<com.garmin.android.apps.connectmobile.performance.model.a> mVarD = xVar.f183282q.d();
        com.garmin.android.apps.connectmobile.performance.model.a aVar = mVarD != null ? mVarD.f73770c : null;
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setD = xVar.f183272h.d();
        y0Var.m(new w61.f<>(new o13.p(aVar, setD != null ? h0.f1(setD) : null)));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z14;
        Set linkedHashSet;
        Bundle extras;
        Bundle extras2;
        Parcelable parcelable;
        Fragment dVar;
        Bundle extras3;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_load_activity);
        Intent intent = getIntent();
        if (intent == null || (extras3 = intent.getExtras()) == null) {
            z14 = bo1.a.a().c().e() || bo1.a.a().c().S();
        } else {
            z14 = extras3.getBoolean("EXTRA_SHOW_ADVANCED_TRAINING_LOAD_VIEW");
        }
        Intent intent2 = getIntent();
        Parcelable parcelable2 = null;
        if (intent2 != null && intent2.getExtras() != null) {
            initActionBar(z14 ? R.string.lbl_training_status_load : R.string.lbl_7day_training_load, 2);
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            if (z14) {
                f.f40244a.getClass();
                dVar = new f();
            } else {
                d.f40216d.getClass();
                dVar = new d();
            }
            aVar.j(R.id.training_load_fragment_container, dVar, null, 1);
            Unit unit = Unit.INSTANCE;
            aVar.e();
        }
        l22.a aVar2 = new l22.a(this);
        Resources resources = getResources();
        resources.getClass();
        k kVar = new k(aVar2, resources);
        Intent intent3 = getIntent();
        if (intent3 != null && (extras2 = intent3.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("EXTRA_LAST_USED_DEVICE", com.garmin.android.apps.connectmobile.performance.model.a.class);
            } else {
                Parcelable parcelable3 = extras2.getParcelable("EXTRA_LAST_USED_DEVICE");
                parcelable = (com.garmin.android.apps.connectmobile.performance.model.a) (parcelable3 instanceof com.garmin.android.apps.connectmobile.performance.model.a ? parcelable3 : null);
            }
            parcelable2 = (com.garmin.android.apps.connectmobile.performance.model.a) parcelable;
        }
        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = parcelable2;
        Intent intent4 = getIntent();
        if (intent4 == null || (extras = intent4.getExtras()) == null) {
            linkedHashSet = new LinkedHashSet();
        } else {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("EXTRA_ALL_USED_DEVICE", com.garmin.android.apps.connectmobile.performance.model.a.class) : extras.getParcelableArrayList("EXTRA_ALL_USED_DEVICE");
            if (parcelableArrayList != null) {
                linkedHashSet = h0.f1(parcelableArrayList);
            } else {
                linkedHashSet = new LinkedHashSet();
            }
        }
        x xVar = (x) new x1(this, new r0(kVar, aVar3, linkedHashSet, false, 8, null)).b(s0.f105811a.b(x.class));
        this.f40178a = xVar;
        xVar.D.f(this, new w61.g(new a03.f(this, 5)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gj1.e primaryTrainingDevices;
        Integer primaryTrainingDeviceCount;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        x xVar = this.f40178a;
        if (xVar == null) {
            s.m("viewModel");
            throw null;
        }
        gj1.f fVar = xVar.J0;
        Bundle bundleA = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a.a(com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j, (fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue());
        HelpActivity.a aVar = HelpActivity.f36653a;
        l lVar = l.TRAINING_STATUS;
        aVar.getClass();
        HelpActivity.a.d(this, lVar, "DEFAULT_ACTION", bundleA);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/TrainingLoadActivity$a;", "", "<init>", "()V", "", "EXTRA_SHOW_ADVANCED_TRAINING_LOAD_VIEW", "Ljava/lang/String;", "EXTRA_LAST_USED_DEVICE", "EXTRA_ALL_USED_DEVICE", "EXTRA_VO2_MAX_HELP_STATE", "EXTRA_LATEST_SHOW_SELECTOR", "EXTRA_NAVIGATION_DESTINATION", "LOAD_FOCUS_DEST", "TRAINING_LOAD_DEST", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(androidx.fragment.app.m mVar, boolean z14, com.garmin.android.apps.connectmobile.performance.model.a aVar, Set set, String str) {
            str.getClass();
            if (mVar != null) {
                Intent intent = new Intent(mVar, (Class<?>) TrainingLoadActivity.class);
                intent.putExtra("EXTRA_SHOW_ADVANCED_TRAINING_LOAD_VIEW", z14);
                intent.putExtra("EXTRA_LAST_USED_DEVICE", aVar);
                if (set != null) {
                    intent.putParcelableArrayListExtra("EXTRA_ALL_USED_DEVICE", new ArrayList<>(set));
                }
                intent.putExtra("EXTRA_NAVIGATION_DESTINATION", str);
                mVar.startActivityForResult(intent, 7777);
            }
        }

        private a() {
        }
    }
}
