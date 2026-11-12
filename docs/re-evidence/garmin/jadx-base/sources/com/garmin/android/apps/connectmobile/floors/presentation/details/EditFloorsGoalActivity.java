package com.garmin.android.apps.connectmobile.floors.presentation.details;

import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c32.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import xk0.g;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/floors/presentation/details/EditFloorsGoalActivity;", "Lbl0/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditFloorsGoalActivity extends bl0.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f35236k = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f35237i = new w1(s0.f105811a.b(g.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f35238j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35239a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35239a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f35240a;

        public c(l lVar) {
            lVar.getClass();
            this.f35240a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f35240a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f35240a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f35241a;

        public d(b.g gVar) {
            this.f35241a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f35241a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f35242a;

        public e(b.g gVar) {
            this.f35242a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f35242a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f35243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f35244b;

        public f(e23.a aVar, b.g gVar) {
            this.f35243a = aVar;
            this.f35244b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f35243a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f35244b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public EditFloorsGoalActivity() {
        new h();
        this.f35238j = new h("FLOORS_CLIMBED", 10);
    }

    @Override // bl0.c
    /* JADX INFO: renamed from: da */
    public final boolean getF44926k() {
        return false;
    }

    @Override // bl0.c
    public final Integer ea() {
        return 3;
    }

    @Override // bl0.c
    public final boolean fa(String str) {
        str.getClass();
        try {
            return str.length() > 0 && Integer.parseInt(str) >= 0 && Integer.parseInt(str) <= 999;
        } catch (NumberFormatException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.b(a2Var, "EditFloorsGoalActivity", "Invalid floors goal value.");
            return false;
        }
    }

    @Override // bl0.c
    public final void ga(int i14, boolean z14) {
        g.x4((g) this.f35237i.getValue(), "floors-climbed", new h("FLOORS_CLIMBED", i14)).f(this, new c(new ci0.a(this, 0)));
    }

    @Override // bl0.c, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ha(R.string.user_settings_daily_floors_climbed);
        ia(R.string.floors_title);
        TextView textView = this.f18585d;
        if (textView == null) {
            s.m("goalAction");
            throw null;
        }
        textView.setText(getString(R.string.lbl_use_default_goal));
        textView.setVisibility(0);
        k kVar = new k(this, 15);
        TextView textView2 = this.f18585d;
        if (textView2 == null) {
            s.m("goalAction");
            throw null;
        }
        textView2.setOnClickListener(new a32.b(kVar, 15));
        g gVar = (g) this.f35237i.getValue();
        xy2.b.K(gVar, new xk0.c(gVar, "floors-climbed", new fz0.c(DateTime.now(), null, 2, null).toString(), null)).f(this, new c(new ci0.a(this, 1)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/floors/presentation/details/EditFloorsGoalActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "FLOORS_GOAL_NUMBER_MAX_DIGITS", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
