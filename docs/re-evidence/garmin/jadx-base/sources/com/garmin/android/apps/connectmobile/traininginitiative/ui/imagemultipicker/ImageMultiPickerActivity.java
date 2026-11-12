package com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.CropImageActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import e23.l;
import ew1.h1;
import f.j;
import f.k;
import f20.i;
import g.f;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import r22.k1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/imagemultipicker/ImageMultiPickerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ImageMultiPickerActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46078j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static ImageMultiPickerActivity f46079k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f46080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hz1.c f46081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f.c<j> f46082c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuItem f46084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f46085f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j22.a[] f46087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46088i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<String[]> f46083d = registerForActivityResult(new f(), new hz1.a(this, 1));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f46086g = new w1(s0.f105811a.b(hz1.f.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46089a;

        public b(l lVar) {
            lVar.getClass();
            this.f46089a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f46089a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46089a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f46090a;

        public c(g gVar) {
            this.f46090a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46090a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f46091a;

        public d(g gVar) {
            this.f46091a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46091a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f46093b;

        public e(e23.a aVar, g gVar) {
            this.f46092a = aVar;
            this.f46093b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46092a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46093b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ImageMultiPickerActivity() {
        ArrayList arrayListM = x.m(j22.a.f96716e);
        j22.b.f96736a.getClass();
        if (j22.b.q()) {
            arrayListM.add(j22.a.f96722k);
        }
        this.f46087h = (j22.a[]) arrayListM.toArray(new j22.a[0]);
    }

    public final void ca() {
        f.c<j> cVar = this.f46082c;
        if (cVar != null) {
            cVar.a(k.a(g.e.d.f74074a, 0, 14), null);
        } else {
            s.m("pickMedia");
            throw null;
        }
    }

    public final void da(Uri uri) {
        CropImageActivity.a aVar = CropImageActivity.f45671f;
        boolean z14 = this.f46088i;
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) CropImageActivity.class);
        intent.putExtra("CropImageSource", uri);
        intent.putExtra("IsFromReviewEntries", z14);
        startActivity(intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 != 3) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 == -1) {
            Uri uri = this.f46085f;
            if (uri == null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "ImageMultiPickerActivity", "NULL capturedImageUri");
                displayFailedMessage();
                return;
            }
            hz1.e eVar = new hz1.e(uri, tn.k.g(uri.toString(), new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date())), "jpg");
            hz1.c cVar = this.f46081b;
            if (cVar != null) {
                cVar.t(eVar);
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
        initActionBar(R.string.social_choose_photo, 2);
        f46078j.getClass();
        f46079k = this;
        this.f46082c = registerForActivityResult(new g.e(), new hz1.a(this, 0));
        if (Build.VERSION.SDK_INT > 29) {
            ca();
        } else {
            this.f46083d.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
        }
        View viewFindViewById = findViewById(R.id.recycler_gallery);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f46080a = recyclerView;
        recyclerView.addItemDecoration(new k1(this, 1, false));
        RecyclerView recyclerView2 = this.f46080a;
        if (recyclerView2 == null) {
            s.m("gallery");
            throw null;
        }
        recyclerView2.setLayoutManager(new GridLayoutManager(this, 4));
        int intExtra = getIntent().getIntExtra("imageCount", 100);
        TrainingInitiativeEventActivity.f45718o.getClass();
        TrainingInitiativeEventActivity.a.b();
        hz1.c cVar = new hz1.c(this, intExtra, TrainingInitiativeEventActivity.f45720q);
        this.f46081b = cVar;
        RecyclerView recyclerView3 = this.f46080a;
        if (recyclerView3 == null) {
            s.m("gallery");
            throw null;
        }
        recyclerView3.setAdapter(cVar);
        RecyclerView recyclerView4 = this.f46080a;
        if (recyclerView4 == null) {
            s.m("gallery");
            throw null;
        }
        recyclerView4.setVisibility(8);
        this.f46088i = getIntent().getBooleanExtra("isFromReviewEntries", false);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.menu_next, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        MenuItem menuItem2 = this.f46084e;
        if (menuItem2 != null && menuItem == menuItem2 && menuItem2.isEnabled()) {
            hz1.c cVar = this.f46081b;
            if (cVar == null) {
                s.m("adapter");
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            if (cVar.f86526h != null) {
                int size = cVar.f86527i.size();
                for (int i14 = 0; i14 < size; i14++) {
                    int iKeyAt = cVar.f86527i.keyAt(i14);
                    if (cVar.f86527i.get(iKeyAt)) {
                        List<hz1.e> list = cVar.f86526h;
                        list.getClass();
                        arrayList.add(list.get(iKeyAt - 2));
                    }
                }
            }
            if (arrayList.size() > 0) {
                da(((hz1.e) arrayList.get(0)).f86534a);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        this.f46084e = menu.findItem(R.id.menu_item_next);
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
                this.f46085f = yy.a.c(this, new File(pi1.b.a(this, null), "captured_image.jpg"));
                return;
            } else {
                new androidx.appcompat.app.e.a(this).setMessage(j22.b.h(p13.s.c(this.f46087h))).setPositiveButton(R.string.lbl_ok, new i(20)).setCancelable(false).create().show();
                return;
            }
        }
        j22.b.f96736a.getClass();
        if (!j22.b.E(iArr)) {
            new androidx.appcompat.app.e.a(this).setMessage(j22.b.f(j22.a.f96721j)).setPositiveButton(R.string.lbl_ok, new h1(this, 18)).setCancelable(false).create().show();
            return;
        }
        hz1.f fVar = (hz1.f) this.f46086g.getValue();
        ContentResolver contentResolver = getApplicationContext().getContentResolver();
        contentResolver.getClass();
        List<String> list = hz1.f.f86537b;
        list.getClass();
        m.a(fVar.f86538a, new hz1.g(contentResolver, "date_added DESC", list, 10000000L, null), 2).f(this, new b(new ho0.g(this, 11)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/imagemultipicker/ImageMultiPickerActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CAPTURED_IMAGE_NAME", "CAPTURED_IMAGE_EXTENSION", "IMAGE_COUNT", "", "REQUEST_CODE_GET_IMAGES_PERMS", "I", "REQUEST_CODE_CAPTURE_IMAGE_PERMS", "REQUEST_CODE_CAPTURE_IMAGE", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14) {
            Intent intent = new Intent(context, (Class<?>) ImageMultiPickerActivity.class);
            intent.putExtra("imageCount", 1);
            intent.putExtra("isFromReviewEntries", z14);
            return intent;
        }

        private a() {
        }
    }
}
