package com.garmin.android.apps.connectmobile.social.share;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import f.j;
import f.k;
import java.io.File;
import java.util.ArrayList;
import ng1.c1;
import o13.h;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.x;
import ro1.o;
import ro1.q;
import ro1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f44683j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GridView f44684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f44685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f44686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.c<j> f44687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<String[]> f44688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d3 f44689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f44690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f44691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j22.a[] f44692i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44693a;

        public b(l lVar) {
            lVar.getClass();
            this.f44693a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44693a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44693a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f44694a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f44694a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar) {
            super(0);
            this.f44695a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f44695a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f44696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o13.l lVar) {
            super(0);
            this.f44696a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f44696a.getValue()).getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.share.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0847f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f44698b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0847f(e23.a aVar, o13.l lVar) {
            super(0);
            this.f44697a = aVar;
            this.f44698b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44697a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44698b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f44700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, o13.l lVar) {
            super(0);
            this.f44699a = fragment;
            this.f44700b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44700b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f44699a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public f() {
        f.c<String[]> cVarRegisterForActivityResult = registerForActivityResult(new g.f(), new q(this, 1));
        cVarRegisterForActivityResult.getClass();
        this.f44688e = cVarRegisterForActivityResult;
        o13.l lVarA = m.a(o13.n.NONE, new d(new c(this)));
        this.f44691h = new w1(s0.f105811a.b(bq0.l.class), new e(lVarA), new g(this, lVarA), new C0847f(null, lVarA));
        ArrayList arrayListM = x.m(j22.a.f96716e);
        j22.b.f96736a.getClass();
        if (j22.b.q()) {
            arrayListM.add(j22.a.f96722k);
        }
        this.f44692i = (j22.a[]) arrayListM.toArray(new j22.a[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 != 3) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 != -1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ImagePickerFragment", "onActivityResult from camera canceled action");
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "ImagePickerFragment", "onActivityResult from camera RESULT OK");
        r rVar = this.f44690g;
        if (rVar != null) {
            File file = this.f44686c;
            if (file != null) {
                rVar.O7(Uri.fromFile(file));
            } else {
                s.m("capturedImageFile");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f44689f = context instanceof d3 ? (d3) context : null;
        this.f44690g = context instanceof r ? (r) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.image_picker_3_0, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 == 1) {
            j22.b.f96736a.getClass();
            if (!j22.b.E(iArr)) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "ImagePickerFragment", "onRequestPermissionsResult REQUEST_CODE_GET_IMAGES_PERMS NOT granted");
                new androidx.appcompat.app.e.a(requireContext()).setMessage(j22.b.f(j22.a.f96721j)).setPositiveButton(R.string.lbl_ok, new c1(this, 26)).setCancelable(false).create().show();
                return;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "ImagePickerFragment", "onRequestPermissionsResult REQUEST_CODE_GET_IMAGES_PERMS granted");
            bq0.l lVar = (bq0.l) this.f44691h.getValue();
            ContentResolver contentResolver = requireContext().getApplicationContext().getContentResolver();
            contentResolver.getClass();
            bq0.l.x4(lVar, contentResolver).f(this, new b(new qw0.y(this, 17)));
            return;
        }
        if (i14 != 2) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (!j22.b.E(iArr)) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "ImagePickerFragment", "onRequestPermissionsResult REQUEST_CODE_CAPTURE_IMAGE_PERMS NOT granted");
            new androidx.appcompat.app.e.a(requireContext()).setMessage(j22.b.h(p13.s.c(this.f44692i))).setPositiveButton(R.string.lbl_ok, new qh1.j(7)).setCancelable(false).create().show();
            return;
        }
        i2.a aVar4 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var4, "ImagePickerFragment", "onRequestPermissionsResult REQUEST_CODE_CAPTURE_IMAGE_PERMS granted");
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        File file = new File(pi1.b.a(contextRequireContext, null), "captured_image.jpg");
        this.f44686c = file;
        yy.a.b(this, file);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        f.c<j> cVarRegisterForActivityResult = registerForActivityResult(new g.e(), new q(this, 0));
        cVarRegisterForActivityResult.getClass();
        this.f44687d = cVarRegisterForActivityResult;
        if (Build.VERSION.SDK_INT > 29) {
            u6();
        } else {
            this.f44688e.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
        }
        d3 d3Var = this.f44689f;
        if (d3Var != null) {
            d3Var.updateActionBarTitle(getString(R.string.social_choose_photo));
        }
        View viewFindViewById = view2.findViewById(R.id.gallery);
        viewFindViewById.getClass();
        this.f44684a = (GridView) viewFindViewById;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        o oVar = new o(contextRequireContext);
        this.f44685b = oVar;
        GridView gridView = this.f44684a;
        if (gridView == null) {
            s.m("gallery");
            throw null;
        }
        gridView.setAdapter((ListAdapter) oVar);
        GridView gridView2 = this.f44684a;
        if (gridView2 == null) {
            s.m("gallery");
            throw null;
        }
        gridView2.setDrawSelectorOnTop(true);
        GridView gridView3 = this.f44684a;
        if (gridView3 == null) {
            s.m("gallery");
            throw null;
        }
        gridView3.setVisibility(8);
        GridView gridView4 = this.f44684a;
        if (gridView4 != null) {
            gridView4.setOnItemClickListener(new ey.a(this, 6));
        } else {
            s.m("gallery");
            throw null;
        }
    }

    public final void u6() {
        f.c<j> cVar = this.f44687d;
        if (cVar != null) {
            cVar.a(k.a(g.e.d.f74074a, 0, 14), null);
        } else {
            s.m("pickMedia");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CAPTURED_IMAGE_NAME", "", "REQUEST_CODE_GET_IMAGES_PERMS", "I", "REQUEST_CODE_CAPTURE_IMAGE_PERMS", "REQUEST_CODE_CAPTURE_IMAGE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
