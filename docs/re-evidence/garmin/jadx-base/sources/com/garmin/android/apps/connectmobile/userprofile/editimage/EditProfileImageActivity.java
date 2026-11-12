package com.garmin.android.apps.connectmobile.userprofile.editimage;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.room.a0;
import androidx.viewpager2.widget.ViewPager2;
import b.s;
import c80.r;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import e23.l;
import e23.p;
import mt0.y;
import n12.k;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import r53.d2;
import r53.j;
import v13.i;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditProfileImageActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46576j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.editimage.c f46578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f46579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2 f46580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TabLayout f46581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TabLayoutMediator f46582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuItem f46583g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46577a = new w1(s0.f105811a.b(EditProfileImageViewModel.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f46584h = new d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f46585i = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageActivity$b", "Lb/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            EditProfileImageActivity editProfileImageActivity = EditProfileImageActivity.this;
            EditProfileImageViewModel editProfileImageViewModelCa = editProfileImageActivity.ca();
            if (editProfileImageViewModelCa.L0 && (editProfileImageViewModelCa.z4() || editProfileImageViewModelCa.B4())) {
                new androidx.appcompat.app.e.a(editProfileImageActivity, R.style.Theme_Gcm_Dialog_Button_Not_All_Caps).setTitle(R.string.message_common_confirm_leaving_screen).setMessage(R.string.msg_training_exit_plan_info).setPositiveButton(R.string.lbl_common_continue, new kx0.f(editProfileImageActivity, 11)).setNegativeButton(R.string.lbl_close, new y(6)).create().show();
            } else {
                editProfileImageActivity.finish();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity$onCreate$1", f = "EditProfileImageActivity.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46587a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditProfileImageActivity f46589a;

            public a(EditProfileImageActivity editProfileImageActivity) {
                this.f46589a = editProfileImageActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                if (((r) obj) instanceof r.a) {
                    this.f46589a.ca().F4();
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditProfileImageActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46587a;
            if (i14 == 0) {
                o13.r.b(obj);
                d2<r> d2VarB = ((j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null)).b();
                a aVar2 = new a(EditProfileImageActivity.this);
                this.f46587a = 1;
                if (d2VarB.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageActivity$d", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/c$b;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.apps.connectmobile.userprofile.editimage.c.b {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.c.b
        public final void a() {
            EditProfileImageActivity.this.ca().f46609m.j(Boolean.TRUE);
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.c.b
        public final void b() {
            EditProfileImageActivity.this.ca().f46609m.j(Boolean.FALSE);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46591a;

        public e(l lVar) {
            lVar.getClass();
            this.f46591a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46591a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46591a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f46592a;

        public f(b.g gVar) {
            this.f46592a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46592a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f46593a;

        public g(b.g gVar) {
            this.f46593a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46593a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f46595b;

        public h(e23.a aVar, b.g gVar) {
            this.f46594a = aVar;
            this.f46595b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46594a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46595b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final EditProfileImageViewModel ca() {
        return (EditProfileImageViewModel) this.f46577a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_edit_profile_image_activity);
        initActionBar(R.string.edit_profile_image_title, 3);
        View viewFindViewById = findViewById(R.id.root_container);
        viewFindViewById.getClass();
        this.f46579c = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.view_pager);
        viewFindViewById2.getClass();
        this.f46580d = (ViewPager2) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tab_layout);
        viewFindViewById3.getClass();
        this.f46581e = (TabLayout) viewFindViewById3;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.crop_container);
        viewGroup.getClass();
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = new com.garmin.android.apps.connectmobile.userprofile.editimage.c(viewGroup, this.f46584h);
        this.f46578b = cVar;
        cVar.f46672o = new mh1.i(this, 19);
        y0 y0Var = ca().F;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar2 = this.f46578b;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("editProfileImageViewHolder");
            throw null;
        }
        dh.b.L(y0Var, this, new e(new n12.g(cVar2)));
        y0 y0Var2 = ca().f46608l;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar3 = this.f46578b;
        if (cVar3 == null) {
            p005kotlin.jvm.internal.s.m("editProfileImageViewHolder");
            throw null;
        }
        dh.b.L(y0Var2, this, new e(new n12.h(cVar3)));
        y0 y0Var3 = ca().f46605j;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar4 = this.f46578b;
        if (cVar4 == null) {
            p005kotlin.jvm.internal.s.m("editProfileImageViewHolder");
            throw null;
        }
        dh.b.L(y0Var3, this, new e(new n12.i(cVar4)));
        w0 w0Var = ca().Y;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar5 = this.f46578b;
        if (cVar5 == null) {
            p005kotlin.jvm.internal.s.m("editProfileImageViewHolder");
            throw null;
        }
        dh.b.L(w0Var, this, new e(new n12.j(cVar5)));
        w0 w0Var2 = ca().I;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar6 = this.f46578b;
        if (cVar6 == null) {
            p005kotlin.jvm.internal.s.m("editProfileImageViewHolder");
            throw null;
        }
        dh.b.L(w0Var2, this, new e(new k(cVar6)));
        dh.b.L(ca().I0, this, new e(new n12.d(this, 0)));
        dh.b.L(ca().f46611o, this, new e(new n12.d(this, 1)));
        dh.b.L(ca().f46613q, this, new e(new n12.d(this, 2)));
        dh.b.L(ca().f46615t, this, new e(new n12.d(this, 3)));
        dh.b.L(ca().f46617w, this, new e(new n12.d(this, 4)));
        dh.b.L(ca().D, this, new e(new n12.f(this)));
        getOnBackPressedDispatcher().a(this.f46585i);
        ca().F4();
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu != null ? menu.add(0, 1, 0, R.string.lbl_common_save) : null;
        this.f46583g = menuItemAdd;
        if (menuItemAdd != null) {
            menuItemAdd.setShowAsActionFlags(1);
        }
        MenuItem menuItem = this.f46583g;
        if (menuItem != null) {
            menuItem.setEnabled(false);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String uuid;
        menuItem.getClass();
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        EditProfileImageViewModel editProfileImageViewModelCa = ca();
        y0 y0Var = editProfileImageViewModelCa.f46605j;
        y0 y0Var2 = editProfileImageViewModelCa.f46608l;
        y0<Unit> y0Var3 = editProfileImageViewModelCa.f46614r;
        editProfileImageViewModelCa.f46610n.j(Boolean.TRUE);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "EditProfileImageViewModel", "checkProfileImageChange");
        if (editProfileImageViewModelCa.y4() && !editProfileImageViewModelCa.B4()) {
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is default avatar, frame is not changed, skip save");
            y0Var3.j(Unit.INSTANCE);
            return true;
        }
        if (editProfileImageViewModelCa.y4() && editProfileImageViewModelCa.B4() && !editProfileImageViewModelCa.C4()) {
            com.garmin.android.apps.connectmobile.userprofile.model.e eVar = (com.garmin.android.apps.connectmobile.userprofile.model.e) y0Var2.d();
            String uuid2 = eVar != null ? eVar.getUuid() : null;
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is default avatar, change to new frame, frame key is: " + uuid2);
            EditProfileImageViewModel.J4(editProfileImageViewModelCa, com.garmin.android.apps.connectmobile.userprofile.model.h.DEFAULT_AVATAR, uuid2, null, 4);
            return true;
        }
        if (editProfileImageViewModelCa.y4() && editProfileImageViewModelCa.B4() && editProfileImageViewModelCa.C4()) {
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is default avatar, change to no frame");
            EditProfileImageViewModel.J4(editProfileImageViewModelCa, com.garmin.android.apps.connectmobile.userprofile.model.h.DEFAULT_AVATAR, "NO_FRAME", null, 4);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) && !editProfileImageViewModelCa.A4() && !editProfileImageViewModelCa.B4()) {
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is connect avatar, but is not changed, frame is not changed, skip save");
            y0Var3.j(Unit.INSTANCE);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) && !editProfileImageViewModelCa.B4()) {
            T tD = y0Var.d();
            com.garmin.android.apps.connectmobile.userprofile.editimage.f.a aVar2 = tD instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a ? (com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) tD : null;
            String str = aVar2 != null ? aVar2.f46703c : null;
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is connect avatar, avatar key is: " + str + ", frame is not changed");
            EditProfileImageViewModel.J4(editProfileImageViewModelCa, com.garmin.android.apps.connectmobile.userprofile.model.h.CONNECT_AVATAR, null, str, 2);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) && editProfileImageViewModelCa.B4() && !editProfileImageViewModelCa.C4()) {
            T tD2 = y0Var.d();
            com.garmin.android.apps.connectmobile.userprofile.editimage.f.a aVar3 = tD2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a ? (com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) tD2 : null;
            String str2 = aVar3 != null ? aVar3.f46703c : null;
            com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) y0Var2.d();
            uuid = eVar2 != null ? eVar2.getUuid() : null;
            i2.a.b(a2Var, "EditProfileImageViewModel", a0.j("Image is connect avatar, avatar key is: ", str2, ", change to new frame, frame key is: ", uuid));
            editProfileImageViewModelCa.I4(com.garmin.android.apps.connectmobile.userprofile.model.h.CONNECT_AVATAR, uuid, str2);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) && editProfileImageViewModelCa.B4() && editProfileImageViewModelCa.C4()) {
            T tD3 = y0Var.d();
            com.garmin.android.apps.connectmobile.userprofile.editimage.f.a aVar4 = tD3 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a ? (com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) tD3 : null;
            uuid = aVar4 != null ? aVar4.f46703c : null;
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is connect avatar, avatar key is: " + uuid + ", change to no frame");
            editProfileImageViewModelCa.I4(com.garmin.android.apps.connectmobile.userprofile.model.h.CONNECT_AVATAR, "NO_FRAME", uuid);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) && !editProfileImageViewModelCa.A4() && !editProfileImageViewModelCa.B4()) {
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is themed avatar, but is not changed, frame is not changed, skip save");
            y0Var3.j(Unit.INSTANCE);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) && !editProfileImageViewModelCa.B4()) {
            T tD4 = y0Var.d();
            tD4.getClass();
            com.garmin.android.apps.connectmobile.userprofile.editimage.f.e eVar3 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) tD4;
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is themed avatar, themed avatar key is: " + eVar3.f46708c + ", frame is not changed");
            editProfileImageViewModelCa.H4(this, eVar3.f46707b, com.garmin.android.apps.connectmobile.userprofile.model.h.THEMED_AVATAR, null);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) && editProfileImageViewModelCa.B4() && !editProfileImageViewModelCa.C4()) {
            T tD5 = y0Var.d();
            tD5.getClass();
            com.garmin.android.apps.connectmobile.userprofile.editimage.f.e eVar4 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) tD5;
            String str3 = eVar4.f46708c;
            Uri uri = eVar4.f46707b;
            com.garmin.android.apps.connectmobile.userprofile.model.e eVar5 = (com.garmin.android.apps.connectmobile.userprofile.model.e) y0Var2.d();
            uuid = eVar5 != null ? eVar5.getUuid() : null;
            i2.a.b(a2Var, "EditProfileImageViewModel", a0.j("Image is themed avatar, themed avatar key is: ", str3, ", change to new frame, frame key is: ", uuid));
            editProfileImageViewModelCa.H4(this, uri, com.garmin.android.apps.connectmobile.userprofile.model.h.THEMED_AVATAR, uuid);
            return true;
        }
        if ((y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) && editProfileImageViewModelCa.B4() && editProfileImageViewModelCa.C4()) {
            T tD6 = y0Var.d();
            tD6.getClass();
            com.garmin.android.apps.connectmobile.userprofile.editimage.f.e eVar6 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) tD6;
            String str4 = eVar6.f46708c;
            Uri uri2 = eVar6.f46707b;
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is themed avatar, themed avatar key is: " + str4 + ", change to no frame");
            editProfileImageViewModelCa.H4(this, uri2, com.garmin.android.apps.connectmobile.userprofile.model.h.THEMED_AVATAR, "NO_FRAME");
            return true;
        }
        if ((editProfileImageViewModelCa.E4() && editProfileImageViewModelCa.z4() && !editProfileImageViewModelCa.B4()) || ((editProfileImageViewModelCa.E4() && editProfileImageViewModelCa.z4() && editProfileImageViewModelCa.B4()) || (editProfileImageViewModelCa.E4() && editProfileImageViewModelCa.z4() && editProfileImageViewModelCa.C4()))) {
            editProfileImageViewModelCa.f46612p.j(Unit.INSTANCE);
            return true;
        }
        if (editProfileImageViewModelCa.E4() && !editProfileImageViewModelCa.z4() && editProfileImageViewModelCa.C4()) {
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is uploaded photo, but is not changed, change to no frame");
            editProfileImageViewModelCa.H4(this, null, com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO, "NO_FRAME");
            return true;
        }
        if (editProfileImageViewModelCa.E4() && !editProfileImageViewModelCa.z4() && editProfileImageViewModelCa.B4()) {
            com.garmin.android.apps.connectmobile.userprofile.model.e eVar7 = (com.garmin.android.apps.connectmobile.userprofile.model.e) y0Var2.d();
            String uuid3 = eVar7 != null ? eVar7.getUuid() : null;
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is uploaded photo, but is not changed, change to new frame, frame key is: " + uuid3);
            editProfileImageViewModelCa.H4(this, null, com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO, uuid3);
            return true;
        }
        if (editProfileImageViewModelCa.E4() && !editProfileImageViewModelCa.z4() && !editProfileImageViewModelCa.B4()) {
            i2.a.b(a2Var, "EditProfileImageViewModel", "Image is upload photo, but is not changed, frame is not changed, skip save");
            y0Var3.j(Unit.INSTANCE);
            return true;
        }
        boolean zE4 = editProfileImageViewModelCa.E4();
        boolean zZ4 = editProfileImageViewModelCa.z4();
        boolean zB4 = editProfileImageViewModelCa.B4();
        boolean zC4 = editProfileImageViewModelCa.C4();
        boolean z14 = y0Var.d() instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a;
        boolean zY4 = editProfileImageViewModelCa.y4();
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Error case: { isProfileImage: ", ", isImageChanged: ", ", isNewFrame: ", zE4, zZ4);
        kg.f.q(", isNoFrame: ", ", isAvatarImage: ", sbM, zB4, zC4);
        i2.a.f(a2Var, "EditProfileImageViewModel", com.airbnb.lottie.animation.keyframe.a.f(", isDefaultAvatar: ", " }", sbM, z14, zY4));
        editProfileImageViewModelCa.G4(new Exception("Unhandled cases"));
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_START_WITH_FRAME", "", "SAVE_MENU_ID", "I", "GRID_ITEM_COUNT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
