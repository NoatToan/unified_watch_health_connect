package com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.airbnb.lottie.SimpleColorFilter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.ui.photos.PhotoViewPager;
import cy0.o;
import e23.l;
import ey0.g0;
import fw.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import mh1.x;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.y;
import ps.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicViewImageActivity;", "Lha1/d;", "<init>", "()V", "b", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EpicViewImageActivity extends ha1.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f39276m = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39277j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f39278k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1 f39279l = new w1(s0.f105811a.b(b.class), new f(this), new e(this), new g(null, this));

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39281a;

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
            f39281a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f39282a;

        public d(l lVar) {
            lVar.getClass();
            this.f39282a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f39282a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39282a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39283a;

        public e(b.g gVar) {
            this.f39283a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39283a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39284a;

        public f(b.g gVar) {
            this.f39284a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39284a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f39286b;

        public g(e23.a aVar, b.g gVar) {
            this.f39285a = aVar;
            this.f39286b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39285a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39286b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // ha1.d
    public final void ca(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        ArrayList<j> arrayList = this.f82682h;
        ArrayList arrayList2 = this.f39278k;
        if (extras != null) {
            String string = extras.getString("EXTRA_EPIC_UUID");
            if (string == null) {
                string = "";
            }
            this.f39277j = string;
            Collection parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("GCM_extra_images_data", o.class) : extras.getParcelableArrayList("GCM_extra_images_data");
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
                arrayList3.add(ge1.b.Z((o) it.next()));
            }
            arrayList.addAll(arrayList3);
            this.f82678d = extras.getInt("imagePosition", 0);
            this.f82679e = extras.getBoolean("GCM_extra_activity_open_mode", false);
        } else {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.MULTI_DAY_ACTIVITY;
            aVar.getClass();
            i2.a.b(a2Var, "EpicViewImageActivity", "No extras passed");
            finish();
        }
        if (bundle != null) {
            this.f19358a = bundle.getBoolean("toolbarHidden");
            ArrayList parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("SavedEpicImageList", o.class) : bundle.getParcelableArrayList("SavedEpicImageList");
            if (parcelableArrayList2 != null) {
                arrayList2.clear();
                arrayList2.addAll(parcelableArrayList2);
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(y.r(parcelableArrayList2, 10));
                Iterator it3 = parcelableArrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(ge1.b.Z((o) it3.next()));
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
            intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(this.f39278k));
            intent.putExtra("EXTRA_EPIC_UUID", this.f39277j);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        fa();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_delete) {
            return super.onOptionsItemSelected(menuItem);
        }
        PhotoViewPager photoViewPager = this.f82676b;
        da(photoViewPager != null ? photoViewPager.getCurrentItem() : 0, new x(this, 18));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Drawable drawableMutate;
        if (menu != null) {
            menu.removeItem(R.id.menu_item_share);
            menu.removeItem(R.id.menu_item_report_this_image);
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
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // ha1.d, bp.a, com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("SavedEpicImageList", new ArrayList<>(this.f39278k));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicViewImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SAVED_EPIC_IMAGE_LIST", "EXTRA_EPIC_UUID", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/photos/EpicViewImageActivity$b;", "Landroidx/lifecycle/u1;", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f39280a;

        public /* synthetic */ b(g0 g0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? (g0) KoinJavaComponent.get$default(g0.class, null, null, 6, null) : g0Var);
        }

        public b(g0 g0Var) {
            g0Var.getClass();
            this.f39280a = g0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
