package com.garmin.android.apps.connectmobile.navigation.more;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k2;
import com.garmin.android.apps.connectmobile.r0;
import e23.p;
import g.h;
import java.util.ArrayList;
import java.util.Arrays;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import tr2.y;
import v13.e;
import v13.i;
import vy0.f;
import z41.j;
import zb0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "Lpi2/c;", "<init>", "()V", "a", "", "shouldCheckConsent", "bottomBarVisible", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MoreActivity extends r0 implements pi2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f39378g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f39379e = m.b(new f(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f39380f = registerForActivityResult(new h(), new y(this, 6));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39381a;

        static {
            int[] iArr = new int[ty0.b.values().length];
            try {
                iArr[ty0.b.E1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.b.S2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.b.f166873g2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39381a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreActivity$onCreate$1", f = "MoreActivity.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39382a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MoreActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39382a;
            if (i14 == 0) {
                r.b(obj);
                f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                this.f39382a = 1;
                obj = bVar.E(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                MoreActivity moreActivity = MoreActivity.this;
                if (!moreActivity.isFinishing() && !moreActivity.isDestroyed()) {
                    moreActivity.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit ma(MoreActivity moreActivity, p3.m mVar, int i14) {
        t tVar = moreActivity.f39379e;
        int i15 = 1;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.valueOf(((ty0.b) tVar.getValue()) == ty0.b.J2));
                mVar.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.valueOf(((ty0.b) tVar.getValue()) != ty0.b.J2));
                mVar.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            moreActivity.ea(((Boolean) p1Var2.getF182175a()).booleanValue());
            moreActivity.applyBottomInsets(((Boolean) p1Var2.getF182175a()).booleanValue() ? k2.RESET_INSETS : k2.UPDATE_INSETS, moreActivity.mConsentBanner);
            z02.b.a(false, null, null, null, true, z3.f.c(409724256, new vx1.b(moreActivity, i15, p1Var, p1Var2), mVar), mVar, 221184, 15);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        String str = ((ty0.b) this.f39379e.getValue()).f166942h;
        return str == null ? "MORE" : str;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("MORE_REMOVED_DEVICE_EXTRA", lj1.c.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("MORE_REMOVED_DEVICE_EXTRA");
                parcelable = (lj1.c) (parcelable2 instanceof lj1.c ? parcelable2 : null);
            }
            lj1.c cVar = (lj1.c) parcelable;
            if (cVar != null) {
                ArrayList arrayList = new ArrayList();
                String str = cVar.f113050b;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = cVar.f113051c;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                String str3 = cVar.f113049a;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                k.d(this, str3, (String[]) Arrays.copyOf(strArr, strArr.length), new j(26));
            }
        }
        ca(fa());
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(519087274, true, new vy0.e(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        ja(fa());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreActivity$a;", "", "<init>", "()V", "", "MORE_START_DESTINATION_EXTRA", "Ljava/lang/String;", "MORE_REMOVED_DEVICE_EXTRA", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
