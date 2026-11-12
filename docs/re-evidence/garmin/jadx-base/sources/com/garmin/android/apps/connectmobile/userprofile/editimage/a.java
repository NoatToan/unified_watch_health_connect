package com.garmin.android.apps.connectmobile.userprofile.editimage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import e23.l;
import ew1.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import m12.r;
import n12.p;
import n12.q;
import n12.t;
import n12.u;
import n12.v;
import n12.v0;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/a;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g$c;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements g.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f46642h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.c<Unit> f46643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<File> f46644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.e f46646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f46647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f46648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f46649g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46650a;

        public b(l lVar) {
            lVar.getClass();
            this.f46650a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f46650a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46650a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46651a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46651a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46652a = aVar;
            this.f46653b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46652a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46653b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46654a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46654a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new C0900a(null);
    }

    public a() {
        final int i14 = 0;
        f.c<Unit> cVarRegisterForActivityResult = registerForActivityResult(new t(this), new f.b(this) { // from class: n12.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122299b;

            {
                this.f122299b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar = this.f122299b;
                Uri uri = (Uri) obj;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                        if (uri != null) {
                            try {
                                EditProfileImageViewModel editProfileImageViewModelW6 = aVar.w6();
                                Context contextRequireContext = aVar.requireContext();
                                contextRequireContext.getClass();
                                if (editProfileImageViewModelW6.K0 == null) {
                                    editProfileImageViewModelW6.K0 = new File(pi1.b.a(contextRequireContext, null), "temp_file");
                                }
                                File file = editProfileImageViewModelW6.K0;
                                Uri.fromFile(file);
                                InputStream inputStreamOpenInputStream = aVar.requireActivity().getContentResolver().openInputStream(uri);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                if (inputStreamOpenInputStream != null) {
                                    aVar.f46649g.E(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                }
                                EditProfileImageViewModel editProfileImageViewModelW7 = aVar.w6();
                                editProfileImageViewModelW7.f46604i.j(new com.garmin.android.apps.connectmobile.userprofile.editimage.f.c(uri));
                            } catch (Exception e4) {
                                String strN = fb1.c.n("Error while creating temp file: ", e4.getMessage());
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.f(a2Var, "EditProfileImageTabImageFragment", strN);
                                return;
                            }
                        }
                        break;
                    default:
                        int i17 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                        if (uri != null) {
                            EditProfileImageViewModel editProfileImageViewModelW8 = aVar.w6();
                            editProfileImageViewModelW8.f46604i.j(new com.garmin.android.apps.connectmobile.userprofile.editimage.f.c(uri));
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f46643a = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<File> cVarRegisterForActivityResult2 = registerForActivityResult(new n12.s(this), new f.b(this) { // from class: n12.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122299b;

            {
                this.f122299b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar = this.f122299b;
                Uri uri = (Uri) obj;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                        if (uri != null) {
                            try {
                                EditProfileImageViewModel editProfileImageViewModelW6 = aVar.w6();
                                Context contextRequireContext = aVar.requireContext();
                                contextRequireContext.getClass();
                                if (editProfileImageViewModelW6.K0 == null) {
                                    editProfileImageViewModelW6.K0 = new File(pi1.b.a(contextRequireContext, null), "temp_file");
                                }
                                File file = editProfileImageViewModelW6.K0;
                                Uri.fromFile(file);
                                InputStream inputStreamOpenInputStream = aVar.requireActivity().getContentResolver().openInputStream(uri);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                if (inputStreamOpenInputStream != null) {
                                    aVar.f46649g.E(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                }
                                EditProfileImageViewModel editProfileImageViewModelW7 = aVar.w6();
                                editProfileImageViewModelW7.f46604i.j(new com.garmin.android.apps.connectmobile.userprofile.editimage.f.c(uri));
                            } catch (Exception e4) {
                                String strN = fb1.c.n("Error while creating temp file: ", e4.getMessage());
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.f(a2Var, "EditProfileImageTabImageFragment", strN);
                                return;
                            }
                        }
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                        if (uri != null) {
                            EditProfileImageViewModel editProfileImageViewModelW8 = aVar.w6();
                            editProfileImageViewModelW8.f46604i.j(new com.garmin.android.apps.connectmobile.userprofile.editimage.f.c(uri));
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f46644b = cVarRegisterForActivityResult2;
        this.f46645c = new w1(s0.f105811a.b(EditProfileImageViewModel.class), new c(this), new e(this), new d(null, this));
        this.f46649g = (r) KoinJavaComponent.get$default(r.class, null, null, 6, null);
    }

    public static final void u6(a aVar, int i14, j22.a... aVarArr) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j22.a aVar2 : aVarArr) {
            j22.b.f96736a.getClass();
            if (!j22.b.k(aVar2)) {
                arrayList.add(aVar2);
                m mVarRequireActivity = aVar.requireActivity();
                mVarRequireActivity.getClass();
                if (j22.b.C(mVarRequireActivity, aVar2)) {
                    arrayList2.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                return;
            }
            j22.b.f96736a.getClass();
            j22.b.y(aVar, i14, arrayList);
        } else {
            aVar.v6(arrayList2).setPositiveButton(R.string.lbl_ok, new k(aVar, i14, arrayList, 3)).show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.g.c
    public final void E2(com.garmin.android.apps.connectmobile.userprofile.model.a aVar) {
        Uri uri = Uri.parse(aVar.getImage());
        uri.getClass();
        w6().f46604i.j(new f.a(uri, aVar.getUuid()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return View.inflate(requireContext(), R.layout.fragment_edit_profile_image_tab_image, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 1411 && i14 != 1412) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (!j22.b.E(iArr)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(j22.a.f96716e);
            if (j22.b.q()) {
                arrayList.add(j22.a.f96722k);
            }
            this.f46646d = v6(arrayList).setPositiveButton(R.string.lbl_settings, new kx0.f(this, 12)).show();
            return;
        }
        if (i14 != 1411) {
            this.f46643a.a(Unit.INSTANCE, null);
            return;
        }
        EditProfileImageViewModel editProfileImageViewModelW6 = w6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (editProfileImageViewModelW6.K0 == null) {
            editProfileImageViewModelW6.K0 = new File(pi1.b.a(contextRequireContext, null), "temp_file");
        }
        this.f46644b.a(editProfileImageViewModelW6.K0, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        androidx.appcompat.app.e eVar;
        super.onStop();
        androidx.appcompat.app.e eVar2 = this.f46646d;
        if (eVar2 == null || !eVar2.isShowing() || (eVar = this.f46646d) == null) {
            return;
        }
        eVar.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        v0 v0Var = new v0();
        v0Var.f122322d = new u(this);
        v0Var.f122321c = new v(this);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.tool_item_row);
        RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
        h0 h0Var = itemAnimator instanceof h0 ? (h0) itemAnimator : null;
        if (h0Var != null) {
            h0Var.f10476g = false;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        recyclerView.addItemDecoration(new n12.c(3, R.dimen.profile_avatar_size_medium));
        recyclerView.setAdapter(v0Var);
        y0 y0Var = w6().f46603h;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new b(new q(v0Var, this, 0)));
        this.f46648f = new g(this);
        View viewFindViewById = view2.findViewById(R.id.grid_view_avatars);
        viewFindViewById.getClass();
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById;
        this.f46647e = recyclerView2;
        RecyclerView.m itemAnimator2 = recyclerView2.getItemAnimator();
        h0 h0Var2 = itemAnimator2 instanceof h0 ? (h0) itemAnimator2 : null;
        if (h0Var2 != null) {
            h0Var2.f10476g = false;
        }
        RecyclerView recyclerView3 = this.f46647e;
        if (recyclerView3 == null) {
            s.m("avatarGridView");
            throw null;
        }
        recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        RecyclerView recyclerView4 = this.f46647e;
        if (recyclerView4 == null) {
            s.m("avatarGridView");
            throw null;
        }
        recyclerView4.addItemDecoration(new n12.c(3, R.dimen.profile_avatar_size_medium));
        w6().f46619y.f(getViewLifecycleOwner(), new b(new p(this, 0)));
        y0 y0Var2 = w6().A;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(y0Var2, viewLifecycleOwner2, new b(new p(this, 1)));
    }

    public final androidx.appcompat.app.e.a v6(ArrayList arrayList) {
        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(requireContext()).setTitle("");
        j22.b.f96736a.getClass();
        androidx.appcompat.app.e.a negativeButton = title.setMessage(Html.fromHtml(j22.b.i(arrayList))).setCancelable(false).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null);
        negativeButton.getClass();
        return negativeButton;
    }

    public final EditProfileImageViewModel w6() {
        return (EditProfileImageViewModel) this.f46645c.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.editimage.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS_TAKE_PICTURE", "I", "REQUEST_CODE_ASK_PERMISSION_GALLERY", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0900a {
        public /* synthetic */ C0900a(j jVar) {
            this();
        }

        private C0900a() {
        }
    }
}
