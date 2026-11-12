package com.garmin.android.apps.connectmobile.imagemultipicker;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import bq0.f;
import bq0.k;
import bq0.l;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f.j;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p13.x;
import r22.k1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/imagemultipicker/ImageMultiPickerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lbq0/b;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ImageMultiPickerActivity extends com.garmin.android.apps.connectmobile.c implements bq0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f36770j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f36771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f36772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f.c<j> f36773c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuItem f36775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f36776f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j22.a[] f36779i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<k> f36774d = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f36777g = new w1(s0.f105811a.b(l.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<String[]> f36778h = registerForActivityResult(new g.f(), new bq0.d(this, 0));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f36780a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f36780a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36780a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36780a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36781a;

        public c(g gVar) {
            this.f36781a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36781a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36782a;

        public d(g gVar) {
            this.f36782a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36782a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36784b;

        public e(e23.a aVar, g gVar) {
            this.f36783a = aVar;
            this.f36784b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36783a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36784b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public ImageMultiPickerActivity() {
        ArrayList arrayListM = x.m(j22.a.f96716e);
        j22.b.f96736a.getClass();
        if (j22.b.q()) {
            arrayListM.add(j22.a.f96722k);
        }
        this.f36779i = (j22.a[]) arrayListM.toArray(new j22.a[0]);
    }

    @Override // bq0.b
    public final void I7() {
        da();
    }

    @Override // bq0.b
    public final void R5(int i14) {
        MenuItem menuItem = this.f36775e;
        if (i14 < 1) {
            if (menuItem == null) {
                s.m("uploadMenuItem");
                throw null;
            }
            menuItem.setEnabled(false);
            updateActionBarTitle(getString(R.string.title_select_photos));
            return;
        }
        if (menuItem == null) {
            s.m("uploadMenuItem");
            throw null;
        }
        menuItem.setEnabled(true);
        if (i14 == 1) {
            updateActionBarTitle(getString(R.string.lbl_one_photo_selected));
            return;
        }
        x0 x0Var = x0.f105818a;
        String string = getString(R.string.lbl_photos_selected);
        string.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i14);
        updateActionBarTitle(String.format(string, Arrays.copyOf(new Object[]{sb3.toString()}, 1)));
    }

    public final void ca(Uri uri) {
        ContentResolver contentResolver;
        if (Build.VERSION.SDK_INT > 29 && (contentResolver = getContentResolver()) != null) {
            contentResolver.takePersistableUriPermission(uri, 1);
        }
        String string = uri.toString();
        string.getClass();
        this.f36774d.add(new k(uri, string, "jpg", 0.0d));
    }

    public final void da() {
        f.c<j> cVar = this.f36773c;
        if (cVar != null) {
            cVar.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        } else {
            s.m("pickMedia");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 != 3) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 == -1) {
            Uri uri = this.f36776f;
            if (uri == null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "ImageMultiPickerActivity", "NULL capturedImageUri");
                displayFailedMessage();
                return;
            }
            k kVar = new k(uri, tn.k.g(uri.toString(), new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date())), "jpg", 0.0d);
            f fVar = this.f36772b;
            if (fVar != null) {
                fVar.r(kVar);
            } else {
                s.m("adapter");
                throw null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.image_multi_picker);
        initActionBar(R.string.title_select_photos, 2);
        int intExtra = getIntent().getIntExtra("imageCount", 10);
        if (intExtra == 0) {
            Toast.makeText(this, getString(R.string.activities_photo_limit_message_2), 1).show();
            finish();
        }
        this.f36773c = intExtra < 2 ? registerForActivityResult(new g.e(), new bq0.d(this, 1)) : registerForActivityResult(new g.d(intExtra), new bq0.d(this, 2));
        if (Build.VERSION.SDK_INT > 29) {
            da();
        } else {
            this.f36778h.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
        }
        View viewFindViewById = findViewById(R.id.recycler_gallery);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f36771a = recyclerView;
        recyclerView.addItemDecoration(new k1(this, 1, false));
        RecyclerView recyclerView2 = this.f36771a;
        if (recyclerView2 == null) {
            s.m("gallery");
            throw null;
        }
        recyclerView2.setLayoutManager(new GridLayoutManager(this, 4));
        f fVar = new f(this, getIntent().getIntExtra("imageCount", 100));
        this.f36772b = fVar;
        fVar.f19496i = this;
        RecyclerView recyclerView3 = this.f36771a;
        if (recyclerView3 == null) {
            s.m("gallery");
            throw null;
        }
        recyclerView3.setAdapter(fVar);
        RecyclerView recyclerView4 = this.f36771a;
        if (recyclerView4 != null) {
            recyclerView4.setVisibility(8);
        } else {
            s.m("gallery");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        MenuItem menuItem2 = this.f36775e;
        if (menuItem2 == null) {
            s.m("uploadMenuItem");
            throw null;
        }
        if (menuItem == menuItem2) {
            if (menuItem2 == null) {
                s.m("uploadMenuItem");
                throw null;
            }
            if (menuItem2.isEnabled()) {
                f fVar = this.f36772b;
                if (fVar == null) {
                    s.m("adapter");
                    throw null;
                }
                ArrayList<k> arrayListX = fVar.x();
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("GCM_extra_images_data", arrayListX);
                setResult(-1, intent);
                finish();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
        menuItemFindItem.getClass();
        this.f36775e = menuItemFindItem;
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ImageMultiPickerActivity", "onRequestPermissionsResult");
        if (i14 != 1) {
            if (i14 != 2) {
                super.onRequestPermissionsResult(i14, strArr, iArr);
                return;
            }
            j22.b.f96736a.getClass();
            if (j22.b.E(iArr)) {
                this.f36776f = yy.a.c(this, new File(pi1.b.a(this, null), "captured_image.jpg"));
                return;
            } else {
                new androidx.appcompat.app.e.a(this).setMessage(j22.b.h(p13.s.c(this.f36779i))).setPositiveButton(R.string.lbl_ok, new ag0.e(16)).setCancelable(false).create().show();
                return;
            }
        }
        j22.b.f96736a.getClass();
        if (!j22.b.E(iArr)) {
            new androidx.appcompat.app.e.a(this).setMessage(j22.b.f(j22.a.f96721j)).setPositiveButton(R.string.lbl_ok, new ai1.a(this, 6)).setCancelable(false).create().show();
            return;
        }
        l lVar = (l) this.f36777g.getValue();
        ContentResolver contentResolver = getApplicationContext().getContentResolver();
        contentResolver.getClass();
        l.x4(lVar, contentResolver).f(this, new b(new b41.a(this, 9)));
    }

    @Override // bq0.b
    public final void y8() {
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = this.f36779i;
        j22.a[] aVarArr2 = (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        bVar.getClass();
        if (j22.b.k(aVarArr2)) {
            this.f36776f = yy.a.c(this, new File(pi1.b.a(this, null), "captured_image.jpg"));
        } else {
            j22.b.x(this, 2, (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/imagemultipicker/ImageMultiPickerActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "IMAGE_COUNT", "CAPTURED_IMAGE_NAME", "CAPTURED_IMAGE_EXTENSION", "", "REQUEST_CODE_GET_IMAGES_PERMS", "I", "REQUEST_CODE_CAPTURE_IMAGE_PERMS", "REQUEST_CODE_CAPTURE_IMAGE", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
