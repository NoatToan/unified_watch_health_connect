package tm0;

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
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.z1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import p13.x;
import p13.y;
import r22.k1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ltm0/i;", "Landroidx/fragment/app/Fragment;", "Lbq0/b;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment implements bq0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f165371j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j22.a[] f165372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f165373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bq0.f f165374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f165375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.c<f.j> f165376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<String[]> f165377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f165378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f165379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f165380i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"tm0/i$b", "Landroidx/core/view/s;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menu.clear();
            menuInflater.inflate(R.menu.group_done, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
            i iVar = i.this;
            if (menuItemFindItem != null) {
                bq0.f fVar = iVar.f165374c;
                if (fVar == null) {
                    p005kotlin.jvm.internal.s.m("adapter");
                    throw null;
                }
                menuItemFindItem.setEnabled(fVar.x().size() > 0);
            } else {
                menuItemFindItem = null;
            }
            iVar.f165375d = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_done) {
                return false;
            }
            i iVar = i.this;
            l lVar = (l) iVar.f165379h.getValue();
            bq0.f fVar = iVar.f165374c;
            if (fVar == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            ArrayList<bq0.k> arrayListX = fVar.x();
            ArrayList arrayList = new ArrayList(y.r(arrayListX, 10));
            for (bq0.k kVar : arrayListX) {
                String string = kVar.f19509a.toString();
                string.getClass();
                arrayList.add(new ef0.b(string, ef0.e.LOADING, kVar, false, 8, null));
            }
            lVar.f165398d.j(arrayList);
            iVar.requireActivity().onBackPressed();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f165382a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f165382a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f165382a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f165382a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f165383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f165383a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f165383a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f165384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f165385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f165384a = aVar;
            this.f165385b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f165384a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f165385b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f165386a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f165386a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f165386a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f165387a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f165387a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f165387a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f165388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar) {
            super(0);
            this.f165388a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f165388a.invoke();
        }
    }

    /* JADX INFO: renamed from: tm0.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C3108i extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f165389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3108i(o13.l lVar) {
            super(0);
            this.f165389a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f165389a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f165390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f165391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e23.a aVar, o13.l lVar) {
            super(0);
            this.f165390a = aVar;
            this.f165391b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f165390a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f165391b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f165392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f165393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment, o13.l lVar) {
            super(0);
            this.f165392a = fragment;
            this.f165393b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f165393b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f165392a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public i() {
        super(R.layout.fragment_group_post_feed_image_picker);
        ArrayList arrayListM = x.m(j22.a.f96716e);
        j22.b.f96736a.getClass();
        if (j22.b.q()) {
            arrayListM.add(j22.a.f96722k);
        }
        this.f165372a = (j22.a[]) arrayListM.toArray(new j22.a[0]);
        f.c<String[]> cVarRegisterForActivityResult = registerForActivityResult(new g.f(), new tm0.h(this, 0));
        cVarRegisterForActivityResult.getClass();
        this.f165377f = cVarRegisterForActivityResult;
        o13.l lVarA = o13.m.a(o13.n.NONE, new h(new g(this)));
        t0 t0Var = s0.f105811a;
        this.f165378g = new w1(t0Var.b(bq0.l.class), new C3108i(lVarA), new k(this, lVarA), new j(null, lVarA));
        this.f165379h = new w1(t0Var.b(l.class), new d(this), new f(this), new e(null, this));
        this.f165380i = 10;
    }

    @Override // bq0.b
    public final void I7() {
        if (Build.VERSION.SDK_INT <= 29) {
            this.f165377f.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
            return;
        }
        f.c<f.j> cVar = this.f165376e;
        if (cVar != null) {
            cVar.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        } else {
            p005kotlin.jvm.internal.s.m("pickMedia");
            throw null;
        }
    }

    @Override // bq0.b
    public final void R5(int i14) {
        z1 z1Var;
        MenuItem menuItem = this.f165375d;
        if (menuItem != null) {
            menuItem.setEnabled(i14 > 0);
        }
        if (i14 == 0) {
            androidx.fragment.app.m activity = getActivity();
            z1Var = activity instanceof z1 ? (z1) activity : null;
            if (z1Var != null) {
                z1Var.updateActionBarTitle(getString(R.string.social_choose_photo));
                return;
            }
            return;
        }
        if (i14 != 1) {
            androidx.fragment.app.m activity2 = getActivity();
            z1Var = activity2 instanceof z1 ? (z1) activity2 : null;
            if (z1Var != null) {
                z1Var.updateActionBarTitle(getString(R.string.social_number_photos_chosen, String.valueOf(i14)));
                return;
            }
            return;
        }
        androidx.fragment.app.m activity3 = getActivity();
        z1Var = activity3 instanceof z1 ? (z1) activity3 : null;
        if (z1Var != null) {
            z1Var.updateActionBarTitle(getString(R.string.social_one_photo_chosen));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 != 3) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 == -1) {
            Uri uri = this.f165373b;
            if (uri == null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "CreatePostImagePickerDialogFragment", "NULL capturedImageUri");
                g22.e.c(this);
                return;
            }
            bq0.k kVar = new bq0.k(uri, tn.k.g(uri.toString(), new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date())), "jpg", 0.0d);
            bq0.f fVar = this.f165374c;
            if (fVar != null) {
                fVar.r(kVar);
            } else {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CreatePostImagePickerDialogFragment", "onRequestPermissionsResult");
        if (i14 != 1) {
            if (i14 != 2) {
                super.onRequestPermissionsResult(i14, strArr, iArr);
                return;
            }
            j22.b.f96736a.getClass();
            if (j22.b.E(iArr)) {
                u6();
                return;
            } else {
                new androidx.appcompat.app.e.a(requireContext()).setMessage(j22.b.h(p13.s.c(this.f165372a))).setPositiveButton(R.string.lbl_ok, new qh1.j(20)).setCancelable(false).create().show();
                return;
            }
        }
        j22.b.f96736a.getClass();
        if (!j22.b.E(iArr)) {
            new androidx.appcompat.app.e.a(requireContext()).setMessage(j22.b.f(j22.a.f96721j)).setPositiveButton(R.string.lbl_ok, new sa2.b(this, 3)).setCancelable(false).create().show();
            return;
        }
        bq0.l lVar = (bq0.l) this.f165378g.getValue();
        ContentResolver contentResolver = requireContext().getApplicationContext().getContentResolver();
        contentResolver.getClass();
        androidx.lifecycle.j jVarX4 = bq0.l.x4(lVar, contentResolver);
        bq0.f fVar = this.f165374c;
        if (fVar != null) {
            jVarX4.f(this, new c(new tm0.j(fVar)));
        } else {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        f.c<f.j> cVarRegisterForActivityResult = registerForActivityResult(new g.d(0, 1, null), new tm0.h(this, 1));
        cVarRegisterForActivityResult.getClass();
        this.f165376e = cVarRegisterForActivityResult;
        g22.e.k(this, new b(), b0.b.RESUMED);
        Bundle arguments = getArguments();
        this.f165380i = arguments != null ? arguments.getInt("image_size", 10) : 10;
        View viewFindViewById = view2.findViewById(R.id.gallery);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.gallery);
        viewFindViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        i.c cVar = mVarRequireActivity instanceof i.c ? (i.c) mVarRequireActivity : null;
        if (cVar != null) {
            recyclerView.addItemDecoration(new k1(cVar, 1, false));
            recyclerView.setLayoutManager(new GridLayoutManager(cVar, 4));
            bq0.f fVar = new bq0.f(cVar, this.f165380i);
            this.f165374c = fVar;
            fVar.f19496i = this;
            recyclerView.setAdapter(fVar);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(new tm0.k(this), viewLifecycleOwner);
    }

    public final void u6() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f165373b = yy.a.b(this, new File(pi1.b.a(contextRequireContext, null), uuidRandomUUID + "-captured_image.jpg"));
    }

    @Override // bq0.b
    public final void y8() {
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = this.f165372a;
        j22.a[] aVarArr2 = (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        bVar.getClass();
        if (j22.b.k(aVarArr2)) {
            u6();
        } else {
            j22.b.z(this, 2, (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Ltm0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "IMAGES_PER_ROW", "I", "CAPTURED_IMAGE_NAME", "CAPTURED_IMAGE_EXTENSION", "REQUEST_CODE_GET_IMAGES_PERMS", "REQUEST_CODE_CAPTURE_IMAGE_PERMS", "REQUEST_CODE_CAPTURE_IMAGE", "IMAGE_SIZE", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
