package com.garmin.android.apps.connectmobile.activities.photos;

import a61.i;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d80.f;
import d80.g;
import g.h;
import ha1.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import ps.j;
import ps.q;
import r22.k1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/PhotoManagementActivity;", "Lha1/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoManagementActivity extends ha1.a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f29713t = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f29714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f<Object> f29715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f29716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f29717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SuppressLint({"NotifyDataSetChanged"})
    public final f.c<Intent> f29719r = registerForActivityResult(new h(), new i(this, 6));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/photos/PhotoManagementActivity$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i14) {
            return i14 == 0 ? 2 : 1;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/photos/PhotoManagementActivity$c", "Ld80/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements d80.b {
        public c() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            PhotoManagementActivity photoManagementActivity = PhotoManagementActivity.this;
            Toast.makeText(photoManagementActivity, photoManagementActivity.getString(R.string.txt_error_occurred), 0).show();
            photoManagementActivity.da().scrollToPosition(0);
            photoManagementActivity.ca().t();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            iz0.a aVar2 = (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
            PhotoManagementActivity photoManagementActivity = PhotoManagementActivity.this;
            aVar2.o(photoManagementActivity, photoManagementActivity.f29716o, false);
        }
    }

    public static ArrayList ja(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ha1.f.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ha1.f.a) it.next()).f82701c);
        }
        return arrayList2;
    }

    public static ArrayList ka(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ha1.f.a((j) it.next()));
        }
        return arrayList2;
    }

    @Override // ha1.g
    public final void T0(int i14, List list) {
        list.getClass();
        ViewImageActivity.a aVar = ViewImageActivity.f29734o;
        q qVar = this.f29717p;
        if (qVar == null) {
            s.m("activityStatsBrief");
            throw null;
        }
        ArrayList arrayList = new ArrayList(ja(list));
        boolean z14 = this.f82659a;
        aVar.getClass();
        this.f29719r.a(ViewImageActivity.a.a(this, qVar, arrayList, i14, z14), null);
    }

    @Override // ha1.a
    public final boolean ea() {
        return !com.garmin.android.library.backgroundtaskmanagement.c.f50123c.e(Long.valueOf(this.f29714m));
    }

    @Override // ha1.a
    public final void fa() {
        showProgressOverlay();
        this.f29714m = com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.h(this, ca().r(), this.f29716o, new cw.b()), this);
        ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).o(this, this.f29716o, false);
    }

    @Override // ha1.a
    public final void ha() {
        f<Object> fVarA;
        am.b bVarM = am.b.M();
        long j8 = this.f29716o;
        ArrayList arrayListJa = ja(ca().f82686b);
        c cVar = new c();
        bVarM.getClass();
        try {
            ArrayList arrayList = new ArrayList(arrayListJa.size());
            Iterator it = arrayListJa.iterator();
            while (it.hasNext()) {
                String imageId = ((j) it.next()).getImageId();
                if (imageId != null) {
                    arrayList.add(imageId);
                }
            }
            JSONArray jSONArray = new JSONArray((Collection) arrayList);
            lj0.a aVar = lj0.a.f112937j;
            Object[] objArr = {Long.toString(j8)};
            aVar.f112948f = jSONArray.toString();
            f.b bVar = new f.b(objArr, aVar);
            bVar.f58274d = cVar;
            bVar.f58275e = g.NO_PARSING;
            fVarA = bVar.a();
            fVarA.b();
        } catch (Exception e4) {
            i2.f(a2.ACTIVITIES, "ActivitiesDataManager", "JSON exception: " + e4.getMessage());
            cVar.a(lj0.b.f112956j);
            fVarA = null;
        }
        this.f29715n = fVarA;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.s2
    public final void hideProgressOverlay() {
        if (getApplicationContext() != null) {
            super.hideProgressOverlay();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (com.garmin.android.library.backgroundtaskmanagement.c.f50123c.e(Long.valueOf(this.f29714m))) {
            this.f29718q = true;
            return;
        }
        if (this.f82660b) {
            W2(false);
        } else if (this.f82661c) {
            ia(false);
        } else {
            z6();
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        hideProgressOverlay();
        if (!isFinishing() && cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            Toast.makeText(this, R.string.delete_photo_error, 0).show();
        }
        if (this.f29718q) {
            z6();
        }
    }

    @Override // ha1.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.b(a2Var, "PhotoMngmentActivity", "No extras given");
            finish();
            return;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = (Parcelable) extras.getParcelable("activity_stats_brief", q.class);
        } else {
            Parcelable parcelable2 = extras.getParcelable("activity_stats_brief");
            if (!(parcelable2 instanceof q)) {
                parcelable2 = null;
            }
            parcelable = (q) parcelable2;
        }
        q qVar = (q) parcelable;
        if (qVar == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.ACTIVITIES;
            aVar2.getClass();
            i2.a.b(a2Var2, "PhotoMngmentActivity", "Activity summary null");
            finish();
            return;
        }
        this.f29717p = qVar;
        this.f82659a = extras.getBoolean("GCM_extra_activity_open_mode", false);
        ArrayList arrayList = new ArrayList();
        RandomAccess parcelableArrayList = i14 >= 33 ? extras.getParcelableArrayList("GCM_extra_images_data", j.class) : extras.getParcelableArrayList("GCM_extra_images_data");
        if (parcelableArrayList == null) {
            parcelableArrayList = j0.f134944a;
        }
        arrayList.addAll(parcelableArrayList);
        q qVar2 = this.f29717p;
        if (qVar2 == null) {
            s.m("activityStatsBrief");
            throw null;
        }
        this.f29716o = qVar2.getActivityId();
        extras.getString("GCM_deviceDisplayName");
        extras.getString("GCM_deviceImage");
        setContentView(R.layout.activity_photos_gallery);
        initActionBar(R.string.title_photos, 2);
        this.f82668j = new e(this, new ArrayList(ka(arrayList)), this.f82659a);
        View viewFindViewById = findViewById(R.id.image_gallery_rv);
        viewFindViewById.getClass();
        this.f82669k = (RecyclerView) viewFindViewById;
        da().setHasFixedSize(true);
        da().setAdapter(ca());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.f10247g = new b();
        da().setLayoutManager(gridLayoutManager);
        if (this.f82659a) {
            new androidx.recyclerview.widget.s(new ha1.a.b()).e(da());
        }
        da().addItemDecoration(new k1(this, 4, false));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        long j8 = this.f29714m;
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.e(Long.valueOf(j8))) {
            cVar.a(this.f29714m);
        }
        f<Object> fVar = this.f29715n;
        if (fVar == null || fVar.c()) {
            return;
        }
        fVar.f58259c = null;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        ArrayList arrayList = (ArrayList) obj;
        ga(arrayList);
        if (arrayList.size() != ca().f82691g) {
            Toast.makeText(this, R.string.delete_photo_error, 0).show();
        }
        W2(false);
    }

    @Override // ha1.a, z6.e
    public final void z6() {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_image_list_changed", this.f82662d);
        if (this.f82662d) {
            intent.putExtra("GCM_conversation_resource_id", this.f29716o);
            intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(ja(ca().f82686b)));
        }
        setResult(-1, intent);
        finish();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/PhotoManagementActivity$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(m mVar, q qVar, ArrayList arrayList, boolean z14, String str, String str2) {
            qVar.getClass();
            Intent intent = new Intent(mVar, (Class<?>) PhotoManagementActivity.class);
            intent.putExtra("activity_stats_brief", qVar);
            intent.putParcelableArrayListExtra("GCM_extra_images_data", arrayList);
            intent.putExtra("GCM_extra_activity_open_mode", z14);
            intent.putExtra("GCM_deviceDisplayName", str);
            intent.putExtra("GCM_deviceImage", str2);
            return intent;
        }

        private a() {
        }
    }
}
