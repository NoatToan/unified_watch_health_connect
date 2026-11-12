package com.garmin.android.apps.connectmobile.activities.photos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p13.y;
import r22.k1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/PostPhotoManagementActivity;", "Lha1/a;", "<init>", "()V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PostPhotoManagementActivity extends ha1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f29721q = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f29722m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f29723n = new w1(s0.f105811a.b(b.class), new h(this), new g(this), new i(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f29724o = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SuppressLint({"NotifyDataSetChanged"})
    public final f.c<Intent> f29725p = registerForActivityResult(new g.h(), new a61.i(this, 7));

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29727a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29727a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/photos/PostPhotoManagementActivity$d", "Lb/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = PostPhotoManagementActivity.f29721q;
            PostPhotoManagementActivity postPhotoManagementActivity = PostPhotoManagementActivity.this;
            if (postPhotoManagementActivity.f82660b) {
                postPhotoManagementActivity.W2(false);
            } else if (postPhotoManagementActivity.f82661c) {
                postPhotoManagementActivity.ia(false);
            } else {
                postPhotoManagementActivity.z6();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/photos/PostPhotoManagementActivity$e", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i14) {
            return i14 == 0 ? 2 : 1;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29729a;

        public f(l lVar) {
            lVar.getClass();
            this.f29729a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f29729a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29729a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29730a;

        public g(b.g gVar) {
            this.f29730a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29730a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29731a;

        public h(b.g gVar) {
            this.f29731a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29731a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f29733b;

        public i(e23.a aVar, b.g gVar) {
            this.f29732a = aVar;
            this.f29733b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29732a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29733b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static ArrayList ja(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ha1.f.b((jo1.f) it.next()));
        }
        return arrayList2;
    }

    public static ArrayList ka(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ha1.f.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ha1.f.b) it.next()).f82702c);
        }
        return arrayList2;
    }

    @Override // ha1.g
    public final void T0(int i14, List list) {
        list.getClass();
        GroupPostViewImageActivity.a aVar = GroupPostViewImageActivity.f29703m;
        String str = this.f29722m;
        ArrayList arrayListKa = ka(list);
        boolean z14 = this.f82659a;
        aVar.getClass();
        this.f29725p.a(GroupPostViewImageActivity.a.a(this, str, arrayListKa, i14, z14), null);
    }

    @Override // ha1.a
    public final void fa() {
        ArrayList arrayListR = ca().r();
        b bVar = (b) this.f29723n.getValue();
        String str = this.f29722m;
        str.getClass();
        dh.b.L(xy2.b.K(bVar, new com.garmin.android.apps.connectmobile.activities.photos.a(bVar, str, arrayListR, null)), this, new f(new bp.h(0, this, arrayListR)));
    }

    @Override // ha1.a
    public final void ha() {
        List<ha1.f> list = ca().f82686b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ha1.f) obj).f82700b != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((ha1.f) it.next()).f82700b;
            str.getClass();
            arrayList2.add(str);
        }
        b bVar = (b) this.f29723n.getValue();
        String str2 = this.f29722m;
        str2.getClass();
        dh.b.L(xy2.b.K(bVar, new com.garmin.android.apps.connectmobile.activities.photos.b(bVar, str2, arrayList2, null)), this, new f(new b41.a(this, 7)));
    }

    @Override // ha1.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "GroupPhotoManagementActivity", "No extras are given");
            finish();
            return;
        }
        getOnBackPressedDispatcher().a(this.f29724o);
        this.f82659a = extras.getBoolean("GCM_extra_activity_open_mode", false);
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("GCM_extra_images_data", jo1.f.class) : extras.getParcelableArrayList("GCM_extra_images_data");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        String string = extras.getString("GCM_extra_connection_group_id", "");
        string.getClass();
        this.f29722m = string;
        setContentView(R.layout.activity_photos_gallery);
        initActionBar(R.string.title_photos, 2);
        this.f82668j = new ha1.e(this, new ArrayList(ja(parcelableArrayList)), this.f82659a);
        View viewFindViewById = findViewById(R.id.image_gallery_rv);
        viewFindViewById.getClass();
        this.f82669k = (RecyclerView) viewFindViewById;
        da().setHasFixedSize(true);
        da().setAdapter(ca());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.f10247g = new e();
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
            intent.putExtra("GCM_conversation_resource_id", this.f29722m);
            intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(ka(ca().f82686b)));
        }
        setResult(-1, intent);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/PostPhotoManagementActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/PostPhotoManagementActivity$b;", "Landroidx/lifecycle/u1;", "Lfo1/f;", "repo", "<init>", "(Lfo1/f;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fo1.f f29726a;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(fo1.f fVar, int i14, j jVar) {
            if ((i14 & 1) != 0) {
                fo1.f.f72522b.getClass();
                fVar = fo1.f.a.a();
            }
            this(fVar);
        }

        public b(fo1.f fVar) {
            fVar.getClass();
            this.f29726a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
