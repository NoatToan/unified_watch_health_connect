package com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.y;
import r22.k1;
import r53.c2;
import u53.o;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicPhotoManagementActivity;", "Lha1/a;", "<init>", "()V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EpicPhotoManagementActivity extends ha1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f39254q = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f39255m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f39256n = new w1(s0.f105811a.b(my0.d.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f39257o = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SuppressLint({"NotifyDataSetChanged"})
    public final f.c<Intent> f39258p = registerForActivityResult(new g.h(), new jp.a(this, 9));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicPhotoManagementActivity$b", "Lb/s;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = EpicPhotoManagementActivity.f39254q;
            EpicPhotoManagementActivity epicPhotoManagementActivity = EpicPhotoManagementActivity.this;
            if (epicPhotoManagementActivity.f82660b) {
                epicPhotoManagementActivity.W2(false);
            } else if (epicPhotoManagementActivity.f82661c) {
                epicPhotoManagementActivity.ia(false);
            } else {
                epicPhotoManagementActivity.z6();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicPhotoManagementActivity$c", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i14) {
            return i14 == 0 ? 2 : 1;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity$postDeleteImages$1", f = "EpicPhotoManagementActivity.kt", l = {114, 115}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f39260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39261b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity$postDeleteImages$1$1$1", f = "EpicPhotoManagementActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g3<Unit> f39263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EpicPhotoManagementActivity f39264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<String> f39265c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity$d$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0699a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f39266a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f39266a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g3<Unit> g3Var, EpicPhotoManagementActivity epicPhotoManagementActivity, List<String> list, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f39263a = g3Var;
                this.f39264b = epicPhotoManagementActivity;
                this.f39265c = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f39263a, this.f39264b, this.f39265c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                int i14 = C0699a.f39266a[this.f39263a.f35300a.ordinal()];
                EpicPhotoManagementActivity epicPhotoManagementActivity = this.f39264b;
                if (i14 == 1) {
                    a aVar2 = EpicPhotoManagementActivity.f39254q;
                    List<String> list = this.f39265c;
                    epicPhotoManagementActivity.ga(list);
                    if (list.size() != epicPhotoManagementActivity.ca().f82691g) {
                        Toast.makeText(epicPhotoManagementActivity, R.string.delete_photo_error, 0).show();
                    }
                    epicPhotoManagementActivity.W2(false);
                    epicPhotoManagementActivity.hideProgressOverlay();
                } else if (i14 == 2) {
                    epicPhotoManagementActivity.hideProgressOverlay();
                    Toast.makeText(epicPhotoManagementActivity, R.string.delete_photo_error, 0).show();
                    a aVar3 = EpicPhotoManagementActivity.f39254q;
                    epicPhotoManagementActivity.da().scrollToPosition(0);
                    epicPhotoManagementActivity.ca().t();
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    epicPhotoManagementActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EpicPhotoManagementActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
        
            if (ge1.b.e0(r3, r6, r9) == r0) goto L33;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListR;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39261b;
            EpicPhotoManagementActivity epicPhotoManagementActivity = EpicPhotoManagementActivity.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    arrayListR = this.f39260a;
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            a aVar2 = EpicPhotoManagementActivity.f39254q;
            arrayListR = epicPhotoManagementActivity.ca().r();
            List<ha1.f> list = epicPhotoManagementActivity.ca().f82686b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof my0.a) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (h0.R(arrayListR, ((my0.a) obj3).f82700b)) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((my0.a) it.next()).f121457c);
            }
            my0.d dVar = (my0.d) epicPhotoManagementActivity.f39256n.getValue();
            String str = epicPhotoManagementActivity.f39255m;
            str.getClass();
            c2 c2Var = new c2(new my0.b(dVar, str, arrayList3, null));
            this.f39260a = arrayListR;
            this.f39261b = 1;
            obj = r53.s.y(c2Var, this);
            if (obj != aVar) {
            }
            return aVar;
            g3 g3Var = (g3) obj;
            if (g3Var != null) {
                x53.c cVar = o53.s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar3 = new a(g3Var, epicPhotoManagementActivity, arrayListR, null);
                this.f39260a = null;
                this.f39261b = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity$saveReorderedList$1", f = "EpicPhotoManagementActivity.kt", l = {145, 146}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39267a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity$saveReorderedList$1$1$1", f = "EpicPhotoManagementActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g3<Unit> f39269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EpicPhotoManagementActivity f39270b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoManagementActivity$e$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0700a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f39271a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f39271a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g3<Unit> g3Var, EpicPhotoManagementActivity epicPhotoManagementActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f39269a = g3Var;
                this.f39270b = epicPhotoManagementActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f39269a, this.f39270b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                int i14 = C0700a.f39271a[this.f39269a.f35300a.ordinal()];
                EpicPhotoManagementActivity epicPhotoManagementActivity = this.f39270b;
                if (i14 == 1) {
                    epicPhotoManagementActivity.hideProgressOverlay();
                    Toast.makeText(epicPhotoManagementActivity, R.string.delete_photo_error, 0).show();
                    a aVar2 = EpicPhotoManagementActivity.f39254q;
                    epicPhotoManagementActivity.da().scrollToPosition(0);
                    epicPhotoManagementActivity.ca().t();
                } else if (i14 == 2) {
                    epicPhotoManagementActivity.hideProgressOverlay();
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    epicPhotoManagementActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            }
        }

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EpicPhotoManagementActivity.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        
            if (ge1.b.e0(r1, r3, r8) == r0) goto L27;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39267a;
            EpicPhotoManagementActivity epicPhotoManagementActivity = EpicPhotoManagementActivity.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            a aVar2 = EpicPhotoManagementActivity.f39254q;
            List<ha1.f> list = epicPhotoManagementActivity.ca().f82686b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof my0.a) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((my0.a) it.next()).f121457c.getMediaUuid().getUuid());
            }
            my0.d dVar = (my0.d) epicPhotoManagementActivity.f39256n.getValue();
            String str = epicPhotoManagementActivity.f39255m;
            str.getClass();
            c2 c2Var = new c2(new my0.c(dVar, str, arrayList2, null));
            this.f39267a = 1;
            obj = r53.s.y(c2Var, this);
            if (obj != aVar) {
            }
            return aVar;
            g3 g3Var = (g3) obj;
            if (g3Var != null) {
                x53.c cVar = o53.s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar3 = new a(g3Var, epicPhotoManagementActivity, null);
                this.f39267a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39272a;

        public f(b.g gVar) {
            this.f39272a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39272a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39273a;

        public g(b.g gVar) {
            this.f39273a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39273a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f39275b;

        public h(e23.a aVar, b.g gVar) {
            this.f39274a = aVar;
            this.f39275b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39274a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39275b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static ArrayList ja(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof my0.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((my0.a) it.next()).f121457c);
        }
        return arrayList2;
    }

    public static ArrayList ka(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new my0.a((cy0.o) it.next()));
        }
        return arrayList2;
    }

    @Override // ha1.g
    public final void T0(int i14, List list) {
        list.getClass();
        EpicViewImageActivity.a aVar = EpicViewImageActivity.f39276m;
        String str = this.f39255m;
        ArrayList arrayListJa = ja(list);
        boolean z14 = this.f82659a;
        aVar.getClass();
        str.getClass();
        Intent intent = new Intent(this, (Class<?>) EpicViewImageActivity.class);
        Bundle bundleD = b71.i.d("EXTRA_EPIC_UUID", str);
        bundleD.putParcelableArrayList("GCM_extra_images_data", new ArrayList<>(arrayListJa));
        bundleD.putInt("imagePosition", i14);
        bundleD.putBoolean("GCM_extra_activity_open_mode", z14);
        intent.putExtras(bundleD);
        this.f39258p.a(intent, null);
    }

    @Override // ha1.a
    public final void fa() {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new d(null), 3);
    }

    @Override // ha1.a
    public final void ha() {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new e(null), 3);
    }

    @Override // ha1.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EpicPhotoManagementActivity", "No extras are given");
            finish();
            return;
        }
        getOnBackPressedDispatcher().a(this.f39257o);
        this.f82659a = extras.getBoolean("GCM_extra_activity_open_mode", false);
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("GCM_extra_images_data", cy0.o.class) : extras.getParcelableArrayList("GCM_extra_images_data");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        String string = extras.getString("EXTRA_EPIC_UUID", "");
        string.getClass();
        this.f39255m = string;
        setContentView(R.layout.activity_photos_gallery);
        initActionBar(R.string.title_photos, 2);
        this.f82668j = new ha1.e(this, new ArrayList(ka(parcelableArrayList)), this.f82659a);
        View viewFindViewById = findViewById(R.id.image_gallery_rv);
        viewFindViewById.getClass();
        this.f82669k = (RecyclerView) viewFindViewById;
        da().setHasFixedSize(true);
        da().setAdapter(ca());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.f10247g = new c();
        da().setLayoutManager(gridLayoutManager);
        if (this.f82659a) {
            new androidx.recyclerview.widget.s(new ha1.a.b()).e(da());
        }
        da().addItemDecoration(new k1(this, 4, false));
    }

    @Override // ha1.a, z6.e
    public final void z6() {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_image_list_changed", this.f82662d);
        if (this.f82662d) {
            intent.putExtra("EXTRA_EPIC_UUID", this.f39255m);
            intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(ja(ca().f82686b)));
        }
        setResult(-1, intent);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicPhotoManagementActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_EPIC_UUID", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
