package com.garmin.android.apps.connectmobile.activities.photos;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import b71.i;
import c22.s3;
import com.airbnb.lottie.SimpleColorFilter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.ui.photos.PhotoViewPager;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.y;
import ps.j;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/GroupPostViewImageActivity;", "Lha1/d;", "Lca1/d$c;", "Lca1/d$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupPostViewImageActivity extends ha1.d implements ca1.d.c, ca1.d.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f29703m = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29704j = "-1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f29705k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1 f29706l = new w1(s0.f105811a.b(bp.e.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29707a;

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
            f29707a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29708a;

        public c(l lVar) {
            lVar.getClass();
            this.f29708a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29708a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29708a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29709a;

        public d(g gVar) {
            this.f29709a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29709a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29710a;

        public e(g gVar) {
            this.f29710a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29710a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29712b;

        public f(e23.a aVar, g gVar) {
            this.f29711a = aVar;
            this.f29712b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29711a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29712b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // ca1.d.b
    public final androidx.lifecycle.s0<v2<da1.b>> A7(ea1.a aVar, String str) {
        Object next;
        ArrayList<j> arrayList;
        aVar.getClass();
        PhotoViewPager photoViewPager = this.f82676b;
        int currentItem = photoViewPager != null ? photoViewPager.getCurrentItem() : 0;
        ia1.a aVar2 = this.f82677c;
        j jVar = (aVar2 == null || (arrayList = aVar2.f92438h) == null) ? null : (j) h0.e0(currentItem, arrayList);
        if (jVar == null) {
            a2 a2Var = a2.ACTIVITIES;
            String strH = am.j.h(currentItem, "Report image failed, no item for position: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GroupPostViewImageActivity", strH);
            return null;
        }
        Iterator it = this.f29705k.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(String.valueOf(((jo1.f) next).getNewsPostHasImageId()), jVar.getImageId()));
        jo1.f fVar = (jo1.f) next;
        String imageUuid = fVar != null ? fVar.getImageUuid() : null;
        if (imageUuid != null) {
            bp.e eVar = (bp.e) this.f29706l.getValue();
            String str2 = this.f29704j;
            str2.getClass();
            return m.a(v1.a(eVar).f183565a, new bp.g(eVar, str2, imageUuid, aVar, str, null), 2);
        }
        i2.f36769a.getClass();
        i2.a.b(a2.ACTIVITIES, "GroupPostViewImageActivity", "Report image failed, no image id for image item: " + jVar);
        return null;
    }

    @Override // ca1.d.c
    public final ca1.d.b M2() {
        return this;
    }

    @Override // ha1.d
    public final void ca(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        ArrayList<j> arrayList = this.f82682h;
        ArrayList arrayList2 = this.f29705k;
        if (extras != null) {
            String string = extras.getString("GCM_conversation_resource_id");
            if (string == null) {
                string = "-1";
            }
            this.f29704j = string;
            Collection parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("GCM_extra_images_data", jo1.f.class) : extras.getParcelableArrayList("GCM_extra_images_data");
            if (parcelableArrayList == null) {
                parcelableArrayList = j0.f134944a;
            }
            arrayList2.clear();
            arrayList2.addAll(parcelableArrayList);
            arrayList.clear();
            Collection collection = parcelableArrayList;
            ArrayList arrayList3 = new ArrayList(y.r(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList3.add(ge1.b.a0((jo1.f) it.next()));
            }
            arrayList.addAll(arrayList3);
            this.f82678d = extras.getInt("imagePosition", 0);
            this.f82679e = extras.getBoolean("GCM_extra_activity_open_mode", false);
        } else {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.b(a2Var, "GroupPostViewImageActivity", "No extras passed");
            finish();
        }
        if (bundle != null) {
            this.f19358a = bundle.getBoolean("toolbarHidden");
            ArrayList parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("SavedImageList", jo1.f.class) : bundle.getParcelableArrayList("SavedImageList");
            if (parcelableArrayList2 != null) {
                arrayList2.clear();
                arrayList2.addAll(parcelableArrayList2);
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(y.r(parcelableArrayList2, 10));
                Iterator it3 = parcelableArrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(ge1.b.a0((jo1.f) it3.next()));
                }
                arrayList.addAll(arrayList4);
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
            intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(this.f29705k));
            intent.putExtra("GCM_conversation_resource_id", this.f29704j);
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final void ga(int i14) {
        this.f82680f = true;
        ia1.a aVar = this.f82677c;
        if (aVar != null) {
            aVar.b(i14);
        }
        if (i14 >= 0) {
            ArrayList arrayList = this.f29705k;
            if (i14 < arrayList.size()) {
                arrayList.remove(i14);
            } else {
                String strF = e0.f(i14, "Position: ", " is out of bundle.");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "GroupPostViewImageActivity", strF);
            }
        } else {
            String strF2 = e0.f(i14, "Position: ", " is out of bundle.");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "GroupPostViewImageActivity", strF2);
        }
        ia1.a aVar4 = this.f82677c;
        if (aVar4 != null && aVar4.f92438h.size() == 0) {
            fa();
        }
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        fa();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_delete) {
            PhotoViewPager photoViewPager = this.f82676b;
            da(photoViewPager != null ? photoViewPager.getCurrentItem() : 0, new b41.a(this, 6));
            return true;
        }
        if (itemId != R.id.menu_item_report_this_image) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca1.d.f26580m.getClass();
        ca1.d dVarA = ca1.d.a.a(this);
        if (dVarA != null) {
            dVarA.show(getSupportFragmentManager(), "reportImage");
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Drawable drawableMutate;
        if (menu != null) {
            menu.removeItem(R.id.menu_item_share);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_delete);
            if (menuItemFindItem != null) {
                if (this.f82679e) {
                    Drawable icon = menuItemFindItem.getIcon();
                    if (icon != null && (drawableMutate = icon.mutate()) != null) {
                        drawableMutate.setColorFilter(new SimpleColorFilter(a7.b.getColor(this, R.color.gcm_icon_primary)));
                    }
                } else {
                    menu.removeItem(R.id.menu_item_delete);
                }
            }
            MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_report_this_image);
            if (menuItemFindItem2 != null) {
                ga1.a aVar = (ga1.a) KoinJavaComponent.get$default(ga1.a.class, null, null, 6, null);
                boolean z14 = this.f82679e;
                s3.f23252a.getClass();
                menuItemFindItem2.setVisible(!z14 && aVar.b(ea1.b.GROUP_POST, s3.a("ROLE_MBTESTER") ? ea1.d.MB_TESTER : ea1.d.NORMAL_USER));
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // ha1.d, bp.a, com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("savedImageList", new ArrayList<>(this.f29705k));
    }

    @Override // ca1.d.b
    public final void w1() {
        PhotoViewPager photoViewPager = this.f82676b;
        ga(photoViewPager != null ? photoViewPager.getCurrentItem() : 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/photos/GroupPostViewImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SAVED_IMAGE_LIST", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(androidx.fragment.app.m mVar, String str, List list, int i14, boolean z14) {
            str.getClass();
            Intent intent = new Intent(mVar, (Class<?>) GroupPostViewImageActivity.class);
            Bundle bundleD = i.d("GCM_conversation_resource_id", str);
            bundleD.putParcelableArrayList("GCM_extra_images_data", new ArrayList<>(list));
            bundleD.putInt("imagePosition", i14);
            bundleD.putBoolean("GCM_extra_activity_open_mode", z14);
            intent.putExtras(bundleD);
            return intent;
        }

        private a() {
        }
    }
}
