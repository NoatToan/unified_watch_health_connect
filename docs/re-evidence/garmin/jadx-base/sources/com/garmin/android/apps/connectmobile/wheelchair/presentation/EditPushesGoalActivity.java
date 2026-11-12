package com.garmin.android.apps.connectmobile.wheelchair.presentation;

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
import d52.h;
import e23.l;
import fw.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/wheelchair/presentation/EditPushesGoalActivity;", "Lbl0/c;", "<init>", "()V", "a", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditPushesGoalActivity extends bl0.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f48020l = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f48021i = new w1(s0.f105811a.b(h.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zk0.a f48022j = new zk0.b(null, null, false, null, null, 31, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f48023k = true;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48024a;

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
            f48024a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f48025a;

        public c(l lVar) {
            lVar.getClass();
            this.f48025a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f48025a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48025a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48026a;

        public d(g gVar) {
            this.f48026a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48026a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48027a;

        public e(g gVar) {
            this.f48027a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48027a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f48029b;

        public f(e23.a aVar, g gVar) {
            this.f48028a = aVar;
            this.f48029b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48028a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48029b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // bl0.c
    /* JADX INFO: renamed from: da, reason: from getter */
    public final boolean getF48023k() {
        return this.f48023k;
    }

    @Override // bl0.c
    public final Integer ea() {
        return 6;
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
            i2.a.b(a2Var, "EditPushesGoalActivity", "Invalid pushes goal value.");
            return false;
        }
    }

    @Override // bl0.c
    public final void ga(int i14, boolean z14) {
        zk0.b bVar = z14 ? new zk0.b(null, null, false, null, null, 31, null) : new zk0.b(Integer.valueOf(i14), null, false, "permanently", null, 22, null);
        h hVar = (h) this.f48021i.getValue();
        xy2.b.K(hVar, new d52.g(hVar, bVar, null)).f(this, new c(new d52.b(this, 2)));
    }

    @Override // bl0.c, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l3.f23124b.getClass();
        String str = l3.f23131i.format((Object) 1);
        String str2 = l3.f23131i.format((Object) 999999);
        ha(R.string.lbl_daily_pushes);
        ia(R.string.lbl_pushes);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f18586e;
        if (gCMComplexOneLineButton == null) {
            s.m("goalSwitch");
            throw null;
        }
        gCMComplexOneLineButton.setButtonLeftLabel(getString(R.string.steps_auto_goal_steps_lbl));
        gCMComplexOneLineButton.setVisibility(0);
        String string = getString(R.string.invalid_range_input_error_message, str, str2);
        string.getClass();
        TextView textView = this.f18588g;
        if (textView == null) {
            s.m("errorMessageTextView");
            throw null;
        }
        textView.setText(string);
        d52.b bVar = new d52.b(this, 0);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f18586e;
        if (gCMComplexOneLineButton2 == null) {
            s.m("goalSwitch");
            throw null;
        }
        gCMComplexOneLineButton2.setOnCheckedChangeListener(new bl0.b(0, bVar, this));
        h hVar = (h) this.f48021i.getValue();
        xy2.b.K(hVar, new d52.f(hVar, null)).f(this, new c(new d52.b(this, 1)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/wheelchair/presentation/EditPushesGoalActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PUSHES_GOAL_NUMBER_MAX_DIGITS", "I", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
