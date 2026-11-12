package com.garmin.android.apps.connectmobile.activities;

import a03.f;
import am.a1;
import am.r1;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lo.t;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/ActivityTypesActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ActivityTypesActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28779c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28780a = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f28781b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            c3 c3Var = ((x0) t7).f4360c;
            ActivityTypesActivity activityTypesActivity = ActivityTypesActivity.this;
            return r13.a.b(dh.b.A(activityTypesActivity, c3Var), dh.b.A(activityTypesActivity, ((x0) t14).f4360c));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, ActivityTypesActivity.class, "setResultAndFinish", "setResultAndFinish()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ActivityTypesActivity activityTypesActivity = (ActivityTypesActivity) this.receiver;
            a aVar = ActivityTypesActivity.f28779c;
            activityTypesActivity.ea();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<gr.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f28783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f28784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f28785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f28786d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f28783a = gVar;
            this.f28784b = qualifier;
            this.f28785c = aVar;
            this.f28786d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, gr.b] */
        @Override // e23.a
        public final gr.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f28783a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f28785c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(gr.b.class), f189591b, null, defaultViewModelCreationExtras, this.f28784b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f28786d, 4, null);
        }
    }

    public List<x0> da(x0 x0Var) {
        if (x0Var == x0.f4304m) {
            return r1.a(this);
        }
        q13.b bVarB = w.b();
        bVarB.add(x0Var);
        List<x0> listI = z0.i(x0Var);
        if (!listI.isEmpty()) {
            bVarB.addAll(h0.N0(listI, new b()));
        }
        return w.a(bVarB);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final void ea() {
        ?? r14 = this.f28780a;
        x0 x0Var = ((gr.a) ((gr.b) r14.getValue()).f78524a.getValue()).f78516c;
        if (x0Var != this.f28781b) {
            Intent intent = new Intent();
            intent.putExtra("GCM_extra_activity_type", x0Var != null ? x0Var.f4358a : null);
            intent.putExtra("GCM_extra_unlink_event", ((gr.a) ((gr.b) r14.getValue()).f78524a.getValue()).f78519f);
            Unit unit = Unit.INSTANCE;
            setResult(-1, intent);
        } else {
            setResult(0, null);
        }
        finish();
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x0 x0VarL;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_SCREEN_TITLE");
        if (stringExtra == null) {
            stringExtra = getString(R.string.txt_activity_type);
            stringExtra.getClass();
        }
        Collection stringArrayListExtra = getIntent().getStringArrayListExtra("EXTRA_SUGGESTED_ACTIVITY_TYPES");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = j0.f134944a;
        }
        String stringExtra2 = getIntent().getStringExtra("GCM_extra_activity_type");
        this.f28781b = stringExtra2 != null ? z0.m(stringExtra2) : null;
        if (stringArrayListExtra.isEmpty()) {
            x0VarL = null;
        } else {
            x0VarL = z0.l(x0.f4346x, getIntent().getStringExtra("EXTRA_TYPE_FROM_SUMMARY"));
        }
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_EDIT_MODE", false);
        x0 x0VarL2 = z0.l(x0.f4304m, getIntent().getStringExtra("EXTRA_CATEGORY_RESTRICTION"));
        boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_HAS_EVENT_LINKED", false);
        ArrayList arrayListC = r1.c(x0VarL, da(x0VarL2));
        long longExtra = getIntent().getLongExtra("EXTRA_DEVICE_ID", -1L);
        Long lValueOf = longExtra != -1 ? Long.valueOf(longExtra) : null;
        int i14 = 2;
        f0.k(getOnBackPressedDispatcher(), this, new f(this, 12), 2);
        ?? r14 = this.f28780a;
        if (((gr.a) ((gr.b) r14.getValue()).f78525b.f150540a.getValue()).f78514a.isEmpty()) {
            gr.b bVar = (gr.b) r14.getValue();
            x0 x0Var = this.f28781b;
            bVar.getClass();
            stringArrayListExtra.getClass();
            bVar.f78528e = booleanExtra;
            bVar.f78529f = booleanExtra2;
            ArrayList arrayList = new ArrayList(y.r(stringArrayListExtra, 10));
            Iterator it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList.add(z0.l(x0.f4346x, (String) it.next()));
            }
            p2 p2Var = bVar.f78524a;
            while (true) {
                Object value = p2Var.getValue();
                int i15 = i14;
                ArrayList arrayList2 = arrayList;
                if (p2Var.b(value, new gr.a(arrayListC, null, x0Var, x0Var, Math.max(0, arrayListC.indexOf(x0Var) - i14), false, false, null, lValueOf, arrayList2, 226, null))) {
                    break;
                }
                i14 = i15;
                arrayList = arrayList2;
            }
            ge1.b.T(v1.a(bVar), null, null, new gr.c(bVar, null), 3);
        }
        initComposeScreen(new e(1364073783, true, new a1(stringExtra, this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/ActivityTypesActivity$a;", "", "<init>", "()V", "", "EXTRA_CATEGORY_RESTRICTION", "Ljava/lang/String;", "EXTRA_TYPE_FROM_SUMMARY", "EXTRA_IS_EDIT_MODE", "EXTRA_HAS_EVENT_LINKED", "EXTRA_SCREEN_TITLE", "EXTRA_DEVICE_ID", "EXTRA_SUGGESTED_ACTIVITY_TYPES", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, x0 x0Var, String str, Long l14, List list) {
            list.getClass();
            Intent intent = new Intent(context, (Class<?>) ActivityTypesActivity.class);
            if (x0Var != null) {
                intent.putExtra("GCM_extra_activity_type", x0Var.f4358a);
            }
            if (str != null) {
                intent.putExtra("EXTRA_SCREEN_TITLE", str);
            }
            intent.putExtra("EXTRA_IS_EDIT_MODE", false);
            if (l14 != null) {
                intent.putExtra("EXTRA_DEVICE_ID", l14.longValue());
            }
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x0) it.next()).f4358a);
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                h0.W0(arrayList, arrayList2);
                intent.putStringArrayListExtra("EXTRA_SUGGESTED_ACTIVITY_TYPES", arrayList2);
            }
            return intent;
        }

        public static void b(t tVar, x0 x0Var, x0 x0Var2, x0 x0Var3, boolean z14, boolean z15) {
            x0Var2.getClass();
            Intent intent = new Intent(tVar.requireActivity(), (Class<?>) ActivityTypesActivity.class);
            intent.putExtra("GCM_extra_activity_type", x0Var2.f4358a);
            if (x0Var != null) {
                intent.putExtra("EXTRA_TYPE_FROM_SUMMARY", x0Var.f4358a);
            }
            intent.putExtra("EXTRA_IS_EDIT_MODE", z14);
            if (x0Var3 != null) {
                intent.putExtra("EXTRA_CATEGORY_RESTRICTION", x0Var3.f4358a);
            }
            intent.putExtra("EXTRA_HAS_EVENT_LINKED", z15);
            tVar.startActivityForResult(intent, 10);
        }

        private a() {
        }
    }
}
