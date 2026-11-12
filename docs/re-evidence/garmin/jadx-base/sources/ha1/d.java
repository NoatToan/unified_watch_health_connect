package ha1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.ui.photos.PhotoViewPager;
import e23.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import ps.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lha1/d;", "Lbp/a;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends bp.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f82675i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PhotoViewPager f82676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ia1.a f82677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f82681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<j> f82682h = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ha1/d$b", "Landroidx/viewpager/widget/ViewPager$m;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ViewPager.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82683a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
            d dVar = d.this;
            PhotoViewPager photoViewPager = dVar.f82676b;
            this.f82683a = photoViewPager != null ? photoViewPager.getCurrentItem() : 0;
            dVar.ea();
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            String imageId;
            ez2.j jVar;
            WeakReference<cp.b> weakReference;
            d dVar = d.this;
            ia1.a aVar = dVar.f82677c;
            j jVarA = aVar != null ? aVar.a(this.f82683a) : null;
            if (jVarA == null || (imageId = jVarA.getImageId()) == null) {
                return;
            }
            ia1.a aVar2 = dVar.f82677c;
            cp.b bVar = (aVar2 == null || (weakReference = aVar2.f92440j.get(imageId)) == null) ? null : weakReference.get();
            cp.b bVar2 = bVar != null ? bVar : null;
            if (bVar2 == null || bVar2.f54871a == null || (jVar = bVar2.f54872b) == null) {
                return;
            }
            ImageView imageView = jVar.f67552h;
            jVar.e(1.0f, imageView.getRight() / 2, imageView.getBottom() / 2, false);
        }
    }

    static {
        new a(null);
    }

    public abstract void ca(Bundle bundle);

    public final void da(int i14, l<? super Integer, Unit> lVar) {
        new androidx.appcompat.app.e.a(this).setMessage(R.string.delete_this_photo_message).setPositiveButton(R.string.lbl_delete, new c(lVar, i14, 0)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    public final void ea() {
        PhotoViewPager photoViewPager = this.f82676b;
        int currentItem = (photoViewPager != null ? photoViewPager.getCurrentItem() : 0) + 1;
        ia1.a aVar = this.f82677c;
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f92438h.size()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 1) {
            hideSubtitle();
        } else {
            x0 x0Var = x0.f105818a;
            setSubtitle(String.format("%s / %s", Arrays.copyOf(new Object[]{Integer.valueOf(currentItem), numValueOf}, 2)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.s2
    public final void hideProgressOverlay() {
        if (getApplicationContext() != null) {
            super.hideProgressOverlay();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19358a = true;
        setContentView(R.layout.activity_photos_view_pager);
        initActionBar(true, R.string.title_photos);
        ca(bundle);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        this.f82677c = new ia1.a(this.f82682h, supportFragmentManager);
        View viewFindViewById = findViewById(R.id.image_gallery_view_pager);
        viewFindViewById.getClass();
        PhotoViewPager photoViewPager = (PhotoViewPager) viewFindViewById;
        photoViewPager.setAdapter(this.f82677c);
        photoViewPager.setCurrentItem(this.f82678d);
        photoViewPager.c(new b());
        this.f82676b = photoViewPager;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_image_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // bp.a, com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("GCM_extra_image_list_changed", this.f82680f);
        ia1.a aVar = this.f82677c;
        aVar.getClass();
        bundle.putParcelableArrayList("savedImageList", aVar.f92438h);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lha1/d$a;", "", "<init>", "()V", "", "SAVED_IMAGE_LIST", "Ljava/lang/String;", "IMAGE_LIST", "IMAGE_POSITION", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
