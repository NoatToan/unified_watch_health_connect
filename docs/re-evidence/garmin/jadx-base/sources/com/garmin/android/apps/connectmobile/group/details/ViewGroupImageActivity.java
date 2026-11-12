package com.garmin.android.apps.connectmobile.group.details;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import mh1.x;
import mm0.z;
import o13.h;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/ViewGroupImageActivity;", "Lbp/a;", "Lca1/d$c;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ViewGroupImageActivity extends bp.a implements ca1.d.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36170e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroupDTO f36171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f36173d = new w1(s0.f105811a.b(z.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36174a;

        public b(l lVar) {
            lVar.getClass();
            this.f36174a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36174a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36174a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36175a;

        public c(g gVar) {
            this.f36175a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36175a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36176a;

        public d(g gVar) {
            this.f36176a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36176a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36178b;

        public e(e23.a aVar, g gVar) {
            this.f36177a = aVar;
            this.f36178b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36177a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36178b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // ca1.d.c
    public final ca1.d.b M2() {
        return (z) this.f36173d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_image_changed", this.f36172c);
        if (this.f36172c) {
            intent.putExtra("GCM_extra_connection_group", this.f36171b);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        GroupDTO groupDTO;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        this.f19358a = true;
        setContentView(R.layout.activity_view_group_image);
        initActionBar(true, R.string.social_photo);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("GCM_extra_connection_group", GroupDTO.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("GCM_extra_connection_group");
                if (!(parcelable3 instanceof GroupDTO)) {
                    parcelable3 = null;
                }
                parcelable2 = (GroupDTO) parcelable3;
            }
            groupDTO = (GroupDTO) parcelable2;
        } else {
            groupDTO = null;
        }
        this.f36171b = groupDTO;
        if (bundle != null) {
            this.f19358a = bundle.getBoolean("toolbarHidden");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("GCM_extra_connection_group", GroupDTO.class);
            } else {
                Parcelable parcelable4 = bundle.getParcelable("GCM_extra_connection_group");
                if (!(parcelable4 instanceof GroupDTO)) {
                    parcelable4 = null;
                }
                parcelable = (GroupDTO) parcelable4;
            }
            this.f36171b = (GroupDTO) parcelable;
            this.f36172c = bundle.getBoolean("GCM_extra_image_changed", false);
            if (!this.f19358a) {
                hideToolBar();
            }
        }
        GroupDTO groupDTO2 = this.f36171b;
        if (groupDTO2 == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ViewGroupImageActivity", "GroupDTO is null");
            finish();
            return;
        }
        w1 w1Var = this.f36173d;
        ((z) w1Var.getValue()).f119599b = groupDTO2;
        ((y0) ((z) w1Var.getValue()).f119600c.getValue()).f(this, new b(new x(this, 3)));
        String strC = groupDTO2.f31564g;
        if (strC == null) {
            strC = jm0.e.c(((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).s(this, groupDTO2.I), this);
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        cp.b bVar = new cp.b();
        Bundle bundle2 = new Bundle();
        bundle2.putString("imageUrl", strC);
        bVar.setArguments(bundle2);
        aVarB.j(R.id.content_frame, bVar, "FullImageFragment", 1);
        aVarB.e();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        boolean z14;
        MenuItem menuItemFindItem2;
        getMenuInflater().inflate(R.menu.view_group_image_menu, menu);
        boolean z15 = false;
        if (menu != null && (menuItemFindItem2 = menu.findItem(R.id.menu_item_change_group_image)) != null) {
            menuItemFindItem2.setVisible(false);
        }
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_report_group_image)) != null) {
            ga1.a aVar = (ga1.a) KoinJavaComponent.get$default(ga1.a.class, null, null, 6, null);
            GroupDTO groupDTO = this.f36171b;
            if (StringUtils.isNotEmpty(groupDTO != null ? groupDTO.f31564g : null)) {
                GroupDTO groupDTO2 = this.f36171b;
                if (StringUtils.isNotEmpty(groupDTO2 != null ? groupDTO2.f31562e : null)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
            GroupDTO groupDTO3 = this.f36171b;
            boolean zG = s.g(strValueOf, groupDTO3 != null ? groupDTO3.f31563f : null);
            s3.f23252a.getClass();
            ea1.d dVar = s3.a("ROLE_MBTESTER") ? ea1.d.MB_TESTER : ea1.d.NORMAL_USER;
            if (z14 && !zG && aVar.b(ea1.b.GROUP_PROFILE, dVar)) {
                z15 = true;
            }
            menuItemFindItem.setVisible(z15);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_change_group_image) {
            Toast.makeText(this, "Change Image, To be implemented", 0).show();
            return true;
        }
        if (itemId != R.id.menu_item_report_group_image) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca1.d.f26580m.getClass();
        ca1.d dVarA = ca1.d.a.a(this);
        if (dVarA != null) {
            dVarA.show(getSupportFragmentManager(), "reportImage");
        }
        return true;
    }

    @Override // bp.a, com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("GCM_extra_connection_group", this.f36171b);
        bundle.putBoolean("GCM_extra_image_changed", this.f36172c);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/ViewGroupImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "IMAGE_REPORTED_RESULT_CODE", "I", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
