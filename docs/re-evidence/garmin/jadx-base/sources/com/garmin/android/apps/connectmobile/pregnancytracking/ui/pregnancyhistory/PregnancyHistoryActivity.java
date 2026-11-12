package com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.PregnancyHistoryActivity;
import db1.m;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import o13.h;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/pregnancyhistory/PregnancyHistoryActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lkb1/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyHistoryActivity extends com.garmin.android.apps.connectmobile.c implements kb1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40886b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f40887c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f40888a = new w1(s0.f105811a.b(kb1.e.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40889a;

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
            f40889a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40890a;

        public c(l lVar) {
            lVar.getClass();
            this.f40890a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40890a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40890a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40891a;

        public d(g gVar) {
            this.f40891a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40891a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40892a;

        public e(g gVar) {
            this.f40892a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40892a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f40894b;

        public f(e23.a aVar, g gVar) {
            this.f40893a = aVar;
            this.f40894b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40893a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40894b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f40887c = gt2.b.f79005a.h("PregnancyHistoryActivity");
    }

    @Override // kb1.a
    public final void O1(LocalDate localDate) {
        ca().y4(localDate);
    }

    public final kb1.e ca() {
        return (kb1.e) this.f40888a.getValue();
    }

    public final void da() {
        List<m> listD = ca().z4().d();
        boolean z14 = listD != null ? !listD.isEmpty() : false;
        Intent intent = new Intent();
        intent.putExtra("extra_has_previous_pregnancy", z14);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        try {
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) getSupportFragmentManager().G("PreviousPregnancyDetailsFragment");
            if (bVar == null) {
                da();
            } else if (bVar.isVisible()) {
                super.onBackPressed();
            } else {
                da();
            }
        } catch (Exception e4) {
            f40887c.error("error trying to find previousPregnancyDetailsFragment", (Throwable) e4);
            da();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(getString(R.string.pregnancy_previous_pregnancy), 2);
        final int i14 = 0;
        ca().z4().f(this, new c(new l(this) { // from class: kb1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancyHistoryActivity f103815b;

            {
                this.f103815b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                PregnancyHistoryActivity pregnancyHistoryActivity = this.f103815b;
                switch (i15) {
                    case 0:
                        List list = (List) obj;
                        PregnancyHistoryActivity.a aVar = PregnancyHistoryActivity.f40886b;
                        if (list != null) {
                            if (list.isEmpty()) {
                                pregnancyHistoryActivity.da();
                            } else if (list.size() == 1) {
                                m mVar = (m) list.get(0);
                                if (mVar != null) {
                                    v supportFragmentManager = pregnancyHistoryActivity.getSupportFragmentManager();
                                    androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o.getClass();
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", mVar);
                                    bVar.setArguments(bundle2);
                                    aVarB.l(R.id.content_frame, bVar, null);
                                    aVarB.e();
                                }
                            } else {
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a aVar2 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a) pregnancyHistoryActivity.getSupportFragmentManager().G("PregnancyHistoryFragment");
                                if (aVar2 == null) {
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a.f40895e.getClass();
                                    aVar2 = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a();
                                }
                                v supportFragmentManager2 = pregnancyHistoryActivity.getSupportFragmentManager();
                                supportFragmentManager2.getClass();
                                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                                aVar3.l(R.id.content_frame, aVar2, null);
                                aVar3.e();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        PregnancyHistoryActivity.a aVar4 = PregnancyHistoryActivity.f40886b;
                        int i16 = PregnancyHistoryActivity.b.f40889a[mVar2.f73769b.ordinal()];
                        if (i16 == 1) {
                            pregnancyHistoryActivity.showProgressOverlay();
                        } else if (i16 == 2) {
                            pregnancyHistoryActivity.hideProgressOverlay();
                            LocalDate localDate = (LocalDate) mVar2.f73770c;
                            if (localDate != null) {
                                List<m> listD = pregnancyHistoryActivity.ca().z4().d();
                                if (listD == null || listD.size() <= 2) {
                                    pregnancyHistoryActivity.da();
                                } else {
                                    e eVarCa = pregnancyHistoryActivity.ca();
                                    List<m> listD2 = eVarCa.z4().d();
                                    if (listD2 != null) {
                                        ArrayList arrayList = new ArrayList(h0.Z(listD2));
                                        ListIterator listIterator = arrayList.listIterator();
                                        while (listIterator.hasNext()) {
                                            if (s.g(((m) listIterator.next()).getDueDate(), localDate)) {
                                                listIterator.remove();
                                            }
                                        }
                                        eVarCa.z4().j(arrayList);
                                    }
                                }
                            }
                        } else {
                            if (i16 != 3) {
                                u0.r();
                                return null;
                            }
                            pregnancyHistoryActivity.hideProgressOverlay();
                            g22.a.a(pregnancyHistoryActivity, mVar2.f73771d);
                            o13.p pVar = new o13.p(pregnancyHistoryActivity.getString(R.string.lbl_retry), new ik1.c(pregnancyHistoryActivity, 23));
                            o13.p pVar2 = new o13.p(pregnancyHistoryActivity.getString(R.string.lbl_cancel), new kb0.f(9));
                            c22.f.f23050a.getClass();
                            c22.f.a(pregnancyHistoryActivity, R.string.pregnancy_unable_to_delete_data, R.string.pregnancy_something_went_wrong_delete_again, pVar, pVar2).show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        ca().f103823c.f(this, new c(new l(this) { // from class: kb1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancyHistoryActivity f103815b;

            {
                this.f103815b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                PregnancyHistoryActivity pregnancyHistoryActivity = this.f103815b;
                switch (i16) {
                    case 0:
                        List list = (List) obj;
                        PregnancyHistoryActivity.a aVar = PregnancyHistoryActivity.f40886b;
                        if (list != null) {
                            if (list.isEmpty()) {
                                pregnancyHistoryActivity.da();
                            } else if (list.size() == 1) {
                                m mVar = (m) list.get(0);
                                if (mVar != null) {
                                    v supportFragmentManager = pregnancyHistoryActivity.getSupportFragmentManager();
                                    androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o.getClass();
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", mVar);
                                    bVar.setArguments(bundle2);
                                    aVarB.l(R.id.content_frame, bVar, null);
                                    aVarB.e();
                                }
                            } else {
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a aVar2 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a) pregnancyHistoryActivity.getSupportFragmentManager().G("PregnancyHistoryFragment");
                                if (aVar2 == null) {
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a.f40895e.getClass();
                                    aVar2 = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a();
                                }
                                v supportFragmentManager2 = pregnancyHistoryActivity.getSupportFragmentManager();
                                supportFragmentManager2.getClass();
                                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                                aVar3.l(R.id.content_frame, aVar2, null);
                                aVar3.e();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        PregnancyHistoryActivity.a aVar4 = PregnancyHistoryActivity.f40886b;
                        int i17 = PregnancyHistoryActivity.b.f40889a[mVar2.f73769b.ordinal()];
                        if (i17 == 1) {
                            pregnancyHistoryActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            pregnancyHistoryActivity.hideProgressOverlay();
                            LocalDate localDate = (LocalDate) mVar2.f73770c;
                            if (localDate != null) {
                                List<m> listD = pregnancyHistoryActivity.ca().z4().d();
                                if (listD == null || listD.size() <= 2) {
                                    pregnancyHistoryActivity.da();
                                } else {
                                    e eVarCa = pregnancyHistoryActivity.ca();
                                    List<m> listD2 = eVarCa.z4().d();
                                    if (listD2 != null) {
                                        ArrayList arrayList = new ArrayList(h0.Z(listD2));
                                        ListIterator listIterator = arrayList.listIterator();
                                        while (listIterator.hasNext()) {
                                            if (s.g(((m) listIterator.next()).getDueDate(), localDate)) {
                                                listIterator.remove();
                                            }
                                        }
                                        eVarCa.z4().j(arrayList);
                                    }
                                }
                            }
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            pregnancyHistoryActivity.hideProgressOverlay();
                            g22.a.a(pregnancyHistoryActivity, mVar2.f73771d);
                            o13.p pVar = new o13.p(pregnancyHistoryActivity.getString(R.string.lbl_retry), new ik1.c(pregnancyHistoryActivity, 23));
                            o13.p pVar2 = new o13.p(pregnancyHistoryActivity.getString(R.string.lbl_cancel), new kb0.f(9));
                            c22.f.f23050a.getClass();
                            c22.f.a(pregnancyHistoryActivity, R.string.pregnancy_unable_to_delete_data, R.string.pregnancy_something_went_wrong_delete_again, pVar, pVar2).show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("extra_pregnancy_history_list", m.class) : extras.getParcelableArrayList("extra_pregnancy_history_list");
            if (parcelableArrayList != null) {
                kb1.e eVarCa = ca();
                if (parcelableArrayList.isEmpty()) {
                    return;
                }
                eVarCa.z4().m(parcelableArrayList);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // kb1.a
    public final void u(m mVar) {
        mVar.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", mVar);
        bVar.setArguments(bundle);
        aVar.l(R.id.content_frame, bVar, "PreviousPregnancyDetailsFragment");
        aVar.d("PreviousPregnancyDetailsFragment");
        aVar.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/pregnancyhistory/PregnancyHistoryActivity$a;", "", "<init>", "()V", "", "EXTRA_PREGNANCY_HISTORY_LIST", "Ljava/lang/String;", "EXTRA_HAS_PREVIOUS_PREGNANCY", "TAG", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
