package com.garmin.android.apps.connectmobile.steps.presentation.details;

import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/steps/presentation/details/EditStepsGoalActivity;", "Lbl0/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditStepsGoalActivity extends bl0.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f44923l = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f44924i = new w1(s0.f105811a.b(yq1.c.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zk0.c f44925j = new zk0.c(null, null, false, null, null, 31, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f44926k = true;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44927a;

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
            f44927a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44928a;

        public c(l lVar) {
            lVar.getClass();
            this.f44928a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44928a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44928a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44929a;

        public d(g gVar) {
            this.f44929a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44929a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44930a;

        public e(g gVar) {
            this.f44930a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44930a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44932b;

        public f(e23.a aVar, g gVar) {
            this.f44931a = aVar;
            this.f44932b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44931a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44932b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // bl0.c
    /* JADX INFO: renamed from: da, reason: from getter */
    public final boolean getF44926k() {
        return this.f44926k;
    }

    @Override // bl0.c
    public final Integer ea() {
        return Integer.valueOf(getResources().getInteger(R.integer.max_step_goal_digit_count));
    }

    @Override // bl0.c
    public final boolean fa(String str) {
        str.getClass();
        try {
            return str.length() > 0 && Integer.parseInt(str) >= 1 && Integer.parseInt(str) <= 999999;
        } catch (NumberFormatException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.b(a2Var, "EditStepsGoalActivity", "Invalid steps goal value.");
            return false;
        }
    }

    @Override // bl0.c
    public final void ga(int i14, boolean z14) {
        zk0.c cVar = z14 ? new zk0.c(null, null, false, null, null, 31, null) : new zk0.c(Integer.valueOf(i14), null, false, "permanently", null, 22, null);
        yq1.c cVar2 = (yq1.c) this.f44924i.getValue();
        xy2.b.K(cVar2, new yq1.b(cVar2, cVar, null)).f(this, new c(new sq1.a(this, 0)));
    }

    @Override // bl0.c, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l3.f23124b.getClass();
        String str = l3.f23131i.format((Object) 1);
        String str2 = l3.f23131i.format((Object) 999999);
        ha(R.string.txt_title_daily_steps);
        ia(R.string.lbl_steps);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f18586e;
        if (gCMComplexOneLineButton == null) {
            s.m("goalSwitch");
            throw null;
        }
        gCMComplexOneLineButton.setButtonLeftLabel(getString(R.string.steps_auto_goal_steps_lbl));
        gCMComplexOneLineButton.setVisibility(0);
        TextView textView = this.f18587f;
        if (textView == null) {
            s.m("switchDescriptionTextView");
            throw null;
        }
        textView.setText(getString(R.string.steps_auto_goal_description));
        textView.setVisibility(0);
        String string = getString(R.string.invalid_range_input_error_message, str, str2);
        string.getClass();
        TextView textView2 = this.f18588g;
        if (textView2 == null) {
            s.m("errorMessageTextView");
            throw null;
        }
        textView2.setText(string);
        sq1.a aVar = new sq1.a(this, 1);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f18586e;
        if (gCMComplexOneLineButton2 == null) {
            s.m("goalSwitch");
            throw null;
        }
        gCMComplexOneLineButton2.setOnCheckedChangeListener(new bl0.b(0, aVar, this));
        yq1.c cVar = (yq1.c) this.f44924i.getValue();
        xy2.b.K(cVar, new yq1.a(cVar, null)).f(this, new c(new sq1.a(this, 2)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/steps/presentation/details/EditStepsGoalActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
