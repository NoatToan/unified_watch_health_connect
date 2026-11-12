package com.garmin.android.apps.connectmobile.activities.photos;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import bp.l;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.ui.photos.PhotoViewPager;
import d80.f;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import ps.j;
import ps.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/ViewImageActivity;", "Lha1/d;", "Ldp/b$a;", "Lca1/d$c;", "Lca1/d$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ViewImageActivity extends ha1.d implements dp.b.a, ca1.d.c, ca1.d.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f29734o = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f<Object> f29735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f29736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f29737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w1 f29738m = new w1(s0.f105811a.b(l.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29739n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29740a;

        public b(g gVar) {
            this.f29740a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29740a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29741a;

        public c(g gVar) {
            this.f29741a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29741a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29743b;

        public d(e23.a aVar, g gVar) {
            this.f29742a = aVar;
            this.f29743b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29742a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29743b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // ca1.d.b
    public final androidx.lifecycle.s0<v2<da1.b>> A7(ea1.a aVar, String str) {
        String url;
        aVar.getClass();
        j jVarGa = ga();
        String imageId = jVarGa != null ? jVarGa.getImageId() : null;
        if (jVarGa == null || (url = jVarGa.getUrl()) == null || url.length() == 0 || imageId == null || imageId.length() == 0) {
            return null;
        }
        l lVar = (l) this.f29738m.getValue();
        return m.a(v1.a(lVar).f183565a, new bp.m(lVar, this.f29737l, imageId, aVar, str, null), 2);
    }

    @Override // dp.b.a
    public final void I2() {
        String str;
        am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
        q qVar = this.f29736k;
        if (qVar == null || (str = this.f82681g) == null) {
            return;
        }
        dVar.E(this, qVar, str);
    }

    @Override // ca1.d.c
    public final ca1.d.b M2() {
        return this;
    }

    @Override // ha1.d
    public final void ca(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        ArrayList<j> arrayList = this.f82682h;
        if (extras != null) {
            this.f29736k = (q) extras.getParcelable("activity_stats_brief");
            arrayList.clear();
            ArrayList parcelableArrayList = extras.getParcelableArrayList("GCM_extra_images_data");
            if (parcelableArrayList != null) {
                arrayList.addAll(parcelableArrayList);
            }
            this.f82678d = extras.getInt("imagePosition", 0);
            this.f82679e = extras.getBoolean("GCM_extra_activity_open_mode", false);
            q qVar = this.f29736k;
            this.f29737l = qVar != null ? qVar.getActivityId() : extras.getLong("GCM_extra_activity_id");
            this.f29739n = extras.getBoolean("allowActivityMetric", false);
        } else {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.b(a2Var, "ViewImageActivity", "No extras passed");
            finish();
        }
        if (bundle != null) {
            this.f19358a = bundle.getBoolean("toolbarHidden");
            arrayList.clear();
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("savedImageList");
            if (parcelableArrayList2 != null) {
                arrayList.addAll(parcelableArrayList2);
            }
            this.f82680f = bundle.getBoolean("GCM_extra_image_list_changed", false);
            if (this.f19358a) {
                return;
            }
            hideToolBar();
        }
    }

    public final void fa() {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_image_list_changed", this.f82680f);
        if (this.f82680f) {
            ia1.a aVar = this.f82677c;
            if (aVar != null) {
                intent.putParcelableArrayListExtra("GCM_extra_images_data", aVar.f92438h);
            }
            intent.putExtra("GCM_conversation_resource_id", this.f29737l);
            ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).o(this, this.f29737l, false);
            qd2.a aVarB = qd2.a.b();
            if (aVarB != null) {
                aVarB.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, this.f29737l);
            }
        }
        setResult(-1, intent);
        finish();
    }

    public final j ga() {
        ia1.a aVar;
        PhotoViewPager photoViewPager = this.f82676b;
        Integer numValueOf = photoViewPager != null ? Integer.valueOf(photoViewPager.getCurrentItem()) : null;
        if (numValueOf == null || (aVar = this.f82677c) == null) {
            return null;
        }
        return aVar.a(numValueOf.intValue());
    }

    public final void ha(int i14) {
        this.f82680f = true;
        ia1.a aVar = this.f82677c;
        if (aVar == null) {
            return;
        }
        if (aVar != null) {
            aVar.b(i14);
        }
        ia1.a aVar2 = this.f82677c;
        if (aVar2 != null && aVar2.f92438h.size() == 0) {
            fa();
        }
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        fa();
    }

    @Override // ha1.d, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f29739n) {
            return true;
        }
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        f<Object> fVar;
        super.onDestroy();
        f<Object> fVar2 = this.f29735j;
        if (fVar2 == null || fVar2.c() || (fVar = this.f29735j) == null) {
            return;
        }
        fVar.f58259c = null;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_share) {
            j jVarGa = ga();
            if (jVarGa != null) {
                this.f82681g = jVarGa.getUrl();
                if (this.f29736k != null) {
                    new dp.b().show(getSupportFragmentManager(), (String) null);
                    return true;
                }
            }
        } else if (itemId == R.id.menu_item_delete) {
            PhotoViewPager photoViewPager = this.f82676b;
            Integer numValueOf = photoViewPager != null ? Integer.valueOf(photoViewPager.getCurrentItem()) : null;
            if (numValueOf != null) {
                da(numValueOf.intValue(), new b41.a(this, 8));
                return true;
            }
        } else {
            if (menuItem.getItemId() != R.id.menu_item_report_this_image) {
                return super.onOptionsItemSelected(menuItem);
            }
            ca1.d.f26580m.getClass();
            ca1.d dVarA = ca1.d.a.a(this);
            if (dVarA != null) {
                dVarA.show(getSupportFragmentManager(), "reportImage");
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        boolean z14;
        Drawable drawableMutate;
        menu.getClass();
        menu.removeItem(R.id.menu_item_share);
        if (this.f29739n) {
            return true;
        }
        if (this.f82679e) {
            int size = menu.size();
            for (int i14 = 0; i14 < size; i14++) {
                Drawable icon = menu.getItem(i14).getIcon();
                if (icon != null && (drawableMutate = icon.mutate()) != null) {
                    drawableMutate.setColorFilter(a7.b.getColor(this, R.color.gcm_icon_primary), PorterDuff.Mode.SRC_ATOP);
                }
            }
            if (this.f29736k == null) {
                menu.removeItem(R.id.menu_item_share);
            }
        } else {
            menu.removeItem(R.id.menu_item_share);
            menu.removeItem(R.id.menu_item_delete);
        }
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_report_this_image);
        j jVarGa = ga();
        if (jVarGa != null) {
            ga1.a aVar = (ga1.a) KoinJavaComponent.get$default(ga1.a.class, null, null, 6, null);
            boolean z15 = this.f82679e;
            boolean zIsNotEmpty = StringUtils.isNotEmpty(jVarGa.getUrl());
            s3.f23252a.getClass();
            z14 = zIsNotEmpty && !z15 && aVar.b(ea1.b.ACTIVITY, s3.a("ROLE_MBTESTER") ? ea1.d.MB_TESTER : ea1.d.NORMAL_USER);
        }
        menuItemFindItem.setVisible(z14);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // ca1.d.b
    public final void w1() {
        PhotoViewPager photoViewPager = this.f82676b;
        Integer numValueOf = photoViewPager != null ? Integer.valueOf(photoViewPager.getCurrentItem()) : null;
        if (numValueOf != null) {
            ha(numValueOf.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/ViewImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ALLOW_ACTIVITY_METRIC", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(androidx.fragment.app.m mVar, q qVar, ArrayList arrayList, int i14, boolean z14) {
            qVar.getClass();
            Intent intent = new Intent(mVar, (Class<?>) ViewImageActivity.class);
            intent.putExtra("activity_stats_brief", qVar);
            intent.putExtra("GCM_extra_activity_open_mode", z14);
            intent.putParcelableArrayListExtra("GCM_extra_images_data", arrayList);
            intent.putExtra("imagePosition", i14);
            return intent;
        }

        private a() {
        }
    }
}
