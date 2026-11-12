package com.garmin.android.apps.connectmobile.social.share;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import c22.u2;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.social.share.ui.ActivityStatsTemplateView;
import com.garmin.android.apps.connectmobile.social.share.ui.StickerEditorView;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jr.o;
import jr.p;
import ng1.c1;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.j0;
import p13.x;
import ps.q;
import r22.k0;
import ro1.d0;
import ro1.g0;
import ro1.i0;
import ro1.l0;
import ro1.n;
import ro1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/d;", "Landroidx/fragment/app/Fragment;", "Lro1/n;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment implements n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f44653m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f44654n = 8000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StickerEditorView f44655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f44656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f44657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewFlipper f44658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BubbleLayout f44659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BubbleLayout f44660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f44661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f44662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f44663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f44664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f44665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d3 f44666l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/share/d$b", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            d dVar = d.this;
            Context contextRequireContext = dVar.requireContext();
            contextRequireContext.getClass();
            String string = dVar.getString(R.string.social_photo_sharing_edit_image_discard_changes_alert_title);
            string.getClass();
            String string2 = dVar.getString(R.string.social_photo_sharing_edit_image_discard_changes_alert_text);
            string2.getClass();
            new k0(contextRequireContext, new k0.a(string, string2, true, false, null, null, dVar.getString(R.string.social_photo_sharing_edit_image_keep_editing), null, null, dVar.getString(R.string.social_photo_sharing_edit_image_discard), null, new ro1.j(dVar, 4), 1464, null)).show();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/share/d$c", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.share_image_menu, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_next) {
                return false;
            }
            d dVar = d.this;
            dVar.getClass();
            a7.e activity = dVar.getActivity();
            s2 s2Var = activity instanceof s2 ? (s2) activity : null;
            if (s2Var != null ? s2Var.isProgressOverlayVisible() : false) {
                return true;
            }
            a aVar = d.f44653m;
            j22.b.f96736a.getClass();
            if (j22.b.d()) {
                dVar.v6();
                return true;
            }
            m mVarRequireActivity = dVar.requireActivity();
            mVarRequireActivity.getClass();
            j22.a aVar2 = j22.a.f96722k;
            if (j22.b.C(mVarRequireActivity, aVar2)) {
                new androidx.appcompat.app.e.a(dVar.requireContext()).setMessage(j22.b.f(aVar2)).setPositiveButton(R.string.lbl_ok, new c1(dVar, 25)).setNegativeButton(R.string.lbl_cancel, new qh1.j(5)).setCancelable(false).create().show();
                return true;
            }
            j22.b.z(dVar, 3, aVar2);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.share.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0846d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f44669a;

        public C0846d(e23.l lVar) {
            lVar.getClass();
            this.f44669a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44669a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44669a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f44670a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44670a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f44672b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f44671a = aVar;
            this.f44672b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44671a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44672b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f44673a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44673a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f44674a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f44674a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar) {
            super(0);
            this.f44675a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f44675a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f44676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o13.l lVar) {
            super(0);
            this.f44676a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f44676a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f44678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, o13.l lVar) {
            super(0);
            this.f44677a = aVar;
            this.f44678b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44677a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44678b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f44680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, o13.l lVar) {
            super(0);
            this.f44679a = fragment;
            this.f44680b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44680b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f44679a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public d() {
        t0 t0Var = s0.f105811a;
        this.f44661g = new w1(t0Var.b(u.class), new e(this), new g(this), new f(null, this));
        o13.l lVarA = o13.m.a(o13.n.NONE, new i(new h(this)));
        this.f44662h = new w1(t0Var.b(bq0.l.class), new j(lVarA), new l(this, lVarA), new k(null, lVarA));
        this.f44664j = j0.f134944a;
    }

    @Override // ro1.n
    public final List<com.garmin.android.apps.connectmobile.social.share.ui.b.C0849b> R4() {
        StickerEditorView stickerEditorView = this.f44655a;
        if (stickerEditorView != null) {
            return stickerEditorView.getStickerImageInfos();
        }
        p005kotlin.jvm.internal.s.m("mStickerEditorView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f44666l = context instanceof d3 ? (d3) context : null;
        this.f44665k = new b();
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b bVar = this.f44665k;
        if (bVar != null) {
            onBackPressedDispatcher.b(bVar, this);
        } else {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        q qVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("activity_stats_brief", q.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("activity_stats_brief");
                parcelable = (q) (parcelable2 instanceof q ? parcelable2 : null);
            }
            qVar = (q) parcelable;
        }
        if (qVar != null) {
            this.f44663i = qVar;
            return;
        }
        m activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.share_image, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 3) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            v6();
        } else {
            new androidx.appcompat.app.e.a(requireContext()).setMessage(j22.b.f(j22.a.f96722k)).setPositiveButton(R.string.lbl_ok, new qh1.j(6)).create().show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.garmin.android.apps.connectmobile.social.share.ui.StickerEditorView] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws Throwable {
        ArrayList arrayList;
        Throwable th3;
        ArrayList arrayList2;
        Object obj;
        Context context;
        Integer num;
        CharSequence charSequence;
        CharSequence charSequence2;
        List<o> listA;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        d3 d3Var = this.f44666l;
        if (d3Var != null) {
            d3Var.updateActionBarTitle(getString(R.string.social_photo_sharing_edit_image));
        }
        View viewFindViewById = view2.findViewById(R.id.image_edit_container);
        viewFindViewById.getClass();
        this.f44655a = (StickerEditorView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.garmin_logo_layer);
        viewFindViewById2.getClass();
        this.f44656b = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.share_image_view);
        viewFindViewById3.getClass();
        this.f44657c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.template_container);
        viewFindViewById4.getClass();
        this.f44658d = (ViewFlipper) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.tool_tip_container);
        viewFindViewById5.getClass();
        this.f44659e = (BubbleLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.sticker_tooltip);
        viewFindViewById6.getClass();
        BubbleLayout bubbleLayout = (BubbleLayout) viewFindViewById6;
        this.f44660f = bubbleLayout;
        View viewFindViewById7 = bubbleLayout.findViewById(R.id.tool_tip_label);
        TextView textView = viewFindViewById7 instanceof TextView ? (TextView) viewFindViewById7 : null;
        if (textView != null) {
            textView.setText(R.string.social_photo_sharing_different_look);
        }
        BubbleLayout bubbleLayout2 = this.f44660f;
        if (bubbleLayout2 == null) {
            p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
            throw null;
        }
        uj.a aVar = uj.a.BOTTOM_CENTER;
        bubbleLayout2.b();
        bubbleLayout2.f28579a = aVar;
        bubbleLayout2.a();
        View viewFindViewById8 = view2.findViewById(R.id.tab_layout);
        viewFindViewById8.getClass();
        TabLayout tabLayout = (TabLayout) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.view_pager);
        viewFindViewById9.getClass();
        SwipeViewPager swipeViewPager = (SwipeViewPager) viewFindViewById9;
        Context context2 = getContext();
        int i14 = 0;
        if (context2 != null) {
            v childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            swipeViewPager.setAdapter(new d0(context2, childFragmentManager));
            swipeViewPager.setSwipeEnabled(false);
            tabLayout.setupWithViewPager(swipeViewPager);
        }
        BubbleLayout bubbleLayout3 = this.f44659e;
        if (bubbleLayout3 == null) {
            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
            throw null;
        }
        String string = getString(R.string.social_photo_sharing_switch_colors);
        string.getClass();
        og.a.Y(bubbleLayout3, string);
        u6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        q qVar = this.f44663i;
        if (qVar == null) {
            p005kotlin.jvm.internal.s.m("mActivityStatsBrief");
            throw null;
        }
        jr.c cVarB = kr.a.b(new kr.a(contextRequireContext), qVar.o());
        sr.b bVar = new sr.b(contextRequireContext);
        jr.g customPhoto = cVarB.getCustomPhoto();
        if (customPhoto == null || (listA = customPhoto.a()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                p pVarB = ((o) it.next()).b();
                if (pVarB != null) {
                    arrayList.add(pVarB);
                }
            }
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ls.e eVarA = is.m.a((p) it3.next());
                Object objK = ss.k.k(eVarA, qVar);
                int i15 = ss.k.a.f160607a[eVarA.ordinal()];
                int iF = (i15 == 2 || i15 == 37 || i15 == 38) ? 8 : ss.k.f(eVarA);
                String strN = bVar.n(eVarA.f114678a);
                l22.a aVar2 = bVar.f160541b;
                String strB = ss.k.b(eVarA, aVar2, objK, iF);
                if (strB != null) {
                    num = null;
                    if (strB.equals(contextRequireContext.getString(R.string.no_value_card))) {
                        context = contextRequireContext;
                        charSequence2 = strB;
                    } else {
                        int length = strB.length();
                        while (true) {
                            if (i14 >= length) {
                                context = contextRequireContext;
                                i14 = -1;
                                break;
                            }
                            char cCharAt = strB.charAt(i14);
                            context = contextRequireContext;
                            if (cCharAt == ' ' || cCharAt == '/') {
                                break;
                            }
                            i14++;
                            contextRequireContext = context;
                        }
                        charSequence2 = strB;
                        if (i14 != -1) {
                            SpannableString spannableString = new SpannableString(strB);
                            spannableString.setSpan(new RelativeSizeSpan(0.9f), i14, strB.length(), 33);
                            charSequence2 = spannableString;
                        }
                    }
                    charSequence = charSequence2;
                } else {
                    context = contextRequireContext;
                    num = null;
                    charSequence = null;
                }
                Integer numValueOf = (ss.k.n(eVarA) && qVar.getIsDecoDive()) ? Integer.valueOf(R.string.abbrev_decompression_dive) : num;
                String strB2 = ss.k.b(eVarA, aVar2, objK, 32);
                if (strB2 == null) {
                    strB2 = "";
                }
                Object cVar = charSequence != null ? new aq.c(strN, null, charSequence, strB2, numValueOf, 2, null) : num;
                if (cVar != null) {
                    arrayList3.add(cVar);
                }
                contextRequireContext = context;
                i14 = 0;
            }
            th3 = null;
            arrayList2 = arrayList3;
        } else {
            th3 = null;
            arrayList2 = null;
        }
        if (arrayList2 == null || !(!arrayList2.isEmpty())) {
            obj = arrayList2;
            obj = j0.f134944a;
        }
        obj = arrayList2;
        this.f44664j = obj;
        final int i16 = 0;
        u6().f154017f.f(getViewLifecycleOwner(), new z0(this) { // from class: ro1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153966b;

            {
                this.f153966b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj2) {
                int i17 = i16;
                final int i18 = 0;
                final com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153966b;
                switch (i17) {
                    case 0:
                        b bVar2 = (b) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar3 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        bVar2.getClass();
                        ViewFlipper viewFlipper = dVar.f44658d;
                        if (viewFlipper == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        viewFlipper.setDisplayedChild(bVar2.ordinal());
                        if (bVar2 == b.Default) {
                            return;
                        }
                        ViewFlipper viewFlipper2 = dVar.f44658d;
                        if (viewFlipper2 == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        View currentView = viewFlipper2.getCurrentView();
                        currentView.getClass();
                        dVar.w6((ActivityStatsTemplateView) currentView);
                        a aVarD = dVar.u6().f154018g.d();
                        if (aVarD != null) {
                            dVar.y6(aVarD.f153901a);
                        }
                        BubbleLayout bubbleLayout4 = dVar.f44659e;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.postDelayed(new Runnable() { // from class: ro1.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19 = i18;
                                    com.garmin.android.apps.connectmobile.social.share.d dVar2 = dVar;
                                    switch (i19) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar2.u6().x4();
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar2.u6().y4();
                                            break;
                                    }
                                }
                            }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.y6(((a) obj2).f153901a);
                        return;
                    case 2:
                        l0 l0Var = (l0) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        l0Var.getClass();
                        Context context3 = dVar.getContext();
                        if (context3 != null) {
                            com.garmin.android.apps.connectmobile.social.share.ui.b bVar3 = new com.garmin.android.apps.connectmobile.social.share.ui.b(context3, null, 0, 6, null);
                            bVar3.setLayoutParams(new ConstraintLayout.b(0, -2));
                            bVar3.setId(View.generateViewId());
                            final int i19 = 1;
                            bVar3.setAdjustViewBounds(true);
                            StickerEditorView stickerEditorView = dVar.f44655a;
                            if (stickerEditorView == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            bVar3.setZ(stickerEditorView.getNextZValue());
                            stickerEditorView.f44708a.add(bVar3);
                            stickerEditorView.addView(bVar3);
                            bVar3.setModel(l0Var);
                            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                            StickerEditorView stickerEditorView2 = dVar.f44655a;
                            if (stickerEditorView2 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.f(stickerEditorView2);
                            dVar2.h(bVar3.getId(), 3, R.id.share_image_view, 3);
                            dVar2.h(bVar3.getId(), 4, R.id.share_image_view, 4);
                            dVar2.h(bVar3.getId(), 6, R.id.share_image_view, 6);
                            dVar2.h(bVar3.getId(), 7, R.id.share_image_view, 7);
                            int id3 = bVar3.getId();
                            ImageView imageView = dVar.f44657c;
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mShareImageView");
                                throw null;
                            }
                            dVar2.k(id3).f6203e.f6224c = (int) (imageView.getWidth() * 0.4f);
                            BubbleLayout bubbleLayout5 = dVar.f44660f;
                            if (bubbleLayout5 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout5.getId(), 4, bVar3.getId(), 3);
                            BubbleLayout bubbleLayout6 = dVar.f44660f;
                            if (bubbleLayout6 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout6.getId(), 6, bVar3.getId(), 6);
                            BubbleLayout bubbleLayout7 = dVar.f44660f;
                            if (bubbleLayout7 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout7.getId(), 7, bVar3.getId(), 7);
                            StickerEditorView stickerEditorView3 = dVar.f44655a;
                            if (stickerEditorView3 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.b(stickerEditorView3);
                            BubbleLayout bubbleLayout8 = dVar.f44660f;
                            if (bubbleLayout8 != null) {
                                bubbleLayout8.postDelayed(new Runnable() { // from class: ro1.k
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i110 = i19;
                                        com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                        switch (i110) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().x4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().y4();
                                                break;
                                        }
                                    }
                                }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                        }
                        return;
                    default:
                        g3 g3Var = (g3) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        fw.p pVar = g3Var.f35300a;
                        List list = (List) g3Var.f35301b;
                        if (pVar == fw.p.SUCCESS && list != null) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                Iterator<T> it5 = ((l0) it4.next()).f153988c.iterator();
                                while (it5.hasNext()) {
                                    com.bumptech.glide.j<Drawable> jVarL = com.bumptech.glide.b.c(dVar.getContext()).d(dVar).l(((k0) it5.next()).f153983b);
                                    jVarL.getClass();
                                    new com.bumptech.glide.j(File.class, jVarL).a(com.bumptech.glide.j.f28502k0).L();
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        u uVarU6 = u6();
        final w0 w0Var = new w0();
        final m0 m0Var = new m0();
        final m0 m0Var2 = new m0();
        uVarU6.f154012a.getClass();
        SharedPreferences sharedPreferences = GCMSettingManager.f41536b;
        String string2 = GCMSettingManager.f41535a.getString(R.string.key_activity_stats_color_change_hint);
        sharedPreferences.getClass();
        string2.getClass();
        u2 u2Var = new u2(sharedPreferences, string2, true);
        final int i17 = 2;
        w0Var.n(u2Var, new u.c(new e23.l() { // from class: ro1.t
            @Override // e23.l
            public final Object invoke(Object obj2) {
                int i18 = i17;
                p005kotlin.jvm.internal.m0 m0Var3 = m0Var2;
                w0 w0Var2 = w0Var;
                p005kotlin.jvm.internal.m0 m0Var4 = m0Var;
                switch (i18) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        int i19 = u.f154011k;
                        bool.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        m0Var4.f105804a = zBooleanValue;
                        w0Var2.m(Boolean.valueOf(zBooleanValue && m0Var3.f105804a));
                        break;
                    case 1:
                        l0 l0Var = (l0) obj2;
                        int i24 = u.f154011k;
                        boolean z14 = l0Var != null && l0Var.f153988c.size() > 1;
                        m0Var4.f105804a = z14;
                        w0Var2.m(Boolean.valueOf(m0Var3.f105804a && z14));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj2;
                        int i25 = u.f154011k;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        m0Var4.f105804a = zBooleanValue2;
                        w0Var2.m(Boolean.valueOf(zBooleanValue2 && m0Var3.f105804a));
                        break;
                    default:
                        b bVar2 = (b) obj2;
                        int i26 = u.f154011k;
                        boolean z15 = bVar2 != b.Default;
                        m0Var4.f105804a = z15;
                        w0Var2.m(Boolean.valueOf(m0Var3.f105804a && z15));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i18 = 3;
        w0Var.n(uVarU6.f154017f, new u.c(new e23.l() { // from class: ro1.t
            @Override // e23.l
            public final Object invoke(Object obj2) {
                int i19 = i18;
                p005kotlin.jvm.internal.m0 m0Var3 = m0Var;
                w0 w0Var2 = w0Var;
                p005kotlin.jvm.internal.m0 m0Var4 = m0Var2;
                switch (i19) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        int i110 = u.f154011k;
                        bool.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        m0Var4.f105804a = zBooleanValue;
                        w0Var2.m(Boolean.valueOf(zBooleanValue && m0Var3.f105804a));
                        break;
                    case 1:
                        l0 l0Var = (l0) obj2;
                        int i24 = u.f154011k;
                        boolean z14 = l0Var != null && l0Var.f153988c.size() > 1;
                        m0Var4.f105804a = z14;
                        w0Var2.m(Boolean.valueOf(m0Var3.f105804a && z14));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj2;
                        int i25 = u.f154011k;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        m0Var4.f105804a = zBooleanValue2;
                        w0Var2.m(Boolean.valueOf(zBooleanValue2 && m0Var3.f105804a));
                        break;
                    default:
                        b bVar2 = (b) obj2;
                        int i26 = u.f154011k;
                        boolean z15 = bVar2 != b.Default;
                        m0Var4.f105804a = z15;
                        w0Var2.m(Boolean.valueOf(m0Var3.f105804a && z15));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        w0Var.f(getViewLifecycleOwner(), new C0846d(new ro1.j(this, 3)));
        BubbleLayout bubbleLayout4 = this.f44659e;
        if (bubbleLayout4 == null) {
            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
            throw th3;
        }
        final int i19 = 0;
        bubbleLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: ro1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153985b;

            {
                this.f153985b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                a aVar3;
                int i24 = i19;
                com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153985b;
                switch (i24) {
                    case 0:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.u6().x4();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        u uVarU7 = dVar.u6();
                        if (uVarU7.f154017f.d() != b.Default) {
                            y0<a> y0Var = uVarU7.f154018g;
                            a aVarD = y0Var.d();
                            if (aVarD != null) {
                                int iOrdinal = aVarD.ordinal() + 1;
                                w13.c cVar2 = a.f153900e;
                                aVar3 = (a) cVar2.get(iOrdinal % cVar2.getF134973e());
                            } else {
                                aVar3 = null;
                            }
                            y0Var.m(aVar3);
                            uVarU7.x4();
                            break;
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.u6().y4();
                        break;
                }
            }
        });
        View view3 = this.f44656b;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mGarminLogoLayer");
            throw th3;
        }
        final int i24 = 1;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: ro1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153985b;

            {
                this.f153985b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                a aVar3;
                int i25 = i24;
                com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153985b;
                switch (i25) {
                    case 0:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.u6().x4();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        u uVarU7 = dVar.u6();
                        if (uVarU7.f154017f.d() != b.Default) {
                            y0<a> y0Var = uVarU7.f154018g;
                            a aVarD = y0Var.d();
                            if (aVarD != null) {
                                int iOrdinal = aVarD.ordinal() + 1;
                                w13.c cVar2 = a.f153900e;
                                aVar3 = (a) cVar2.get(iOrdinal % cVar2.getF134973e());
                            } else {
                                aVar3 = null;
                            }
                            y0Var.m(aVar3);
                            uVarU7.x4();
                            break;
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.u6().y4();
                        break;
                }
            }
        });
        final int i25 = 1;
        u6().f154018g.f(getViewLifecycleOwner(), new z0(this) { // from class: ro1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153966b;

            {
                this.f153966b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj2) {
                int i110 = i25;
                final int i111 = 0;
                final com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153966b;
                switch (i110) {
                    case 0:
                        b bVar2 = (b) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar3 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        bVar2.getClass();
                        ViewFlipper viewFlipper = dVar.f44658d;
                        if (viewFlipper == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        viewFlipper.setDisplayedChild(bVar2.ordinal());
                        if (bVar2 == b.Default) {
                            return;
                        }
                        ViewFlipper viewFlipper2 = dVar.f44658d;
                        if (viewFlipper2 == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        View currentView = viewFlipper2.getCurrentView();
                        currentView.getClass();
                        dVar.w6((ActivityStatsTemplateView) currentView);
                        a aVarD = dVar.u6().f154018g.d();
                        if (aVarD != null) {
                            dVar.y6(aVarD.f153901a);
                        }
                        BubbleLayout bubbleLayout5 = dVar.f44659e;
                        if (bubbleLayout5 != null) {
                            bubbleLayout5.postDelayed(new Runnable() { // from class: ro1.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i112 = i111;
                                    com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                    switch (i112) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar3.u6().x4();
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar3.u6().y4();
                                            break;
                                    }
                                }
                            }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.y6(((a) obj2).f153901a);
                        return;
                    case 2:
                        l0 l0Var = (l0) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        l0Var.getClass();
                        Context context3 = dVar.getContext();
                        if (context3 != null) {
                            com.garmin.android.apps.connectmobile.social.share.ui.b bVar3 = new com.garmin.android.apps.connectmobile.social.share.ui.b(context3, null, 0, 6, null);
                            bVar3.setLayoutParams(new ConstraintLayout.b(0, -2));
                            bVar3.setId(View.generateViewId());
                            final int i112 = 1;
                            bVar3.setAdjustViewBounds(true);
                            StickerEditorView stickerEditorView = dVar.f44655a;
                            if (stickerEditorView == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            bVar3.setZ(stickerEditorView.getNextZValue());
                            stickerEditorView.f44708a.add(bVar3);
                            stickerEditorView.addView(bVar3);
                            bVar3.setModel(l0Var);
                            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                            StickerEditorView stickerEditorView2 = dVar.f44655a;
                            if (stickerEditorView2 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.f(stickerEditorView2);
                            dVar2.h(bVar3.getId(), 3, R.id.share_image_view, 3);
                            dVar2.h(bVar3.getId(), 4, R.id.share_image_view, 4);
                            dVar2.h(bVar3.getId(), 6, R.id.share_image_view, 6);
                            dVar2.h(bVar3.getId(), 7, R.id.share_image_view, 7);
                            int id3 = bVar3.getId();
                            ImageView imageView = dVar.f44657c;
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mShareImageView");
                                throw null;
                            }
                            dVar2.k(id3).f6203e.f6224c = (int) (imageView.getWidth() * 0.4f);
                            BubbleLayout bubbleLayout6 = dVar.f44660f;
                            if (bubbleLayout6 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout6.getId(), 4, bVar3.getId(), 3);
                            BubbleLayout bubbleLayout7 = dVar.f44660f;
                            if (bubbleLayout7 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout7.getId(), 6, bVar3.getId(), 6);
                            BubbleLayout bubbleLayout8 = dVar.f44660f;
                            if (bubbleLayout8 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout8.getId(), 7, bVar3.getId(), 7);
                            StickerEditorView stickerEditorView3 = dVar.f44655a;
                            if (stickerEditorView3 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.b(stickerEditorView3);
                            BubbleLayout bubbleLayout9 = dVar.f44660f;
                            if (bubbleLayout9 != null) {
                                bubbleLayout9.postDelayed(new Runnable() { // from class: ro1.k
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i113 = i112;
                                        com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                        switch (i113) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().x4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().y4();
                                                break;
                                        }
                                    }
                                }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                        }
                        return;
                    default:
                        g3 g3Var = (g3) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        fw.p pVar = g3Var.f35300a;
                        List list = (List) g3Var.f35301b;
                        if (pVar == fw.p.SUCCESS && list != null) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                Iterator<T> it5 = ((l0) it4.next()).f153988c.iterator();
                                while (it5.hasNext()) {
                                    com.bumptech.glide.j<Drawable> jVarL = com.bumptech.glide.b.c(dVar.getContext()).d(dVar).l(((k0) it5.next()).f153983b);
                                    jVarL.getClass();
                                    new com.bumptech.glide.j(File.class, jVarL).a(com.bumptech.glide.j.f28502k0).L();
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        View view4 = this.f44656b;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mGarminLogoLayer");
            throw th3;
        }
        view4.setZ(Float.MAX_VALUE);
        BubbleLayout bubbleLayout5 = this.f44660f;
        if (bubbleLayout5 == null) {
            p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
            throw th3;
        }
        bubbleLayout5.setZ(Float.MAX_VALUE);
        BubbleLayout bubbleLayout6 = this.f44659e;
        if (bubbleLayout6 == null) {
            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
            throw th3;
        }
        bubbleLayout6.setZ(Float.MAX_VALUE);
        ?? r14 = this.f44655a;
        if (r14 == 0) {
            p005kotlin.jvm.internal.s.m("mStickerEditorView");
            throw th3;
        }
        View view5 = getView();
        r14.setDeleteView(view5 != null ? (ViewGroup) view5.findViewById(R.id.share_image_tabs) : th3);
        final int i26 = 2;
        u6().f154020i.f(getViewLifecycleOwner(), new z0(this) { // from class: ro1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153966b;

            {
                this.f153966b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj2) {
                int i110 = i26;
                final int i111 = 0;
                final com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153966b;
                switch (i110) {
                    case 0:
                        b bVar2 = (b) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar3 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        bVar2.getClass();
                        ViewFlipper viewFlipper = dVar.f44658d;
                        if (viewFlipper == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        viewFlipper.setDisplayedChild(bVar2.ordinal());
                        if (bVar2 == b.Default) {
                            return;
                        }
                        ViewFlipper viewFlipper2 = dVar.f44658d;
                        if (viewFlipper2 == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        View currentView = viewFlipper2.getCurrentView();
                        currentView.getClass();
                        dVar.w6((ActivityStatsTemplateView) currentView);
                        a aVarD = dVar.u6().f154018g.d();
                        if (aVarD != null) {
                            dVar.y6(aVarD.f153901a);
                        }
                        BubbleLayout bubbleLayout7 = dVar.f44659e;
                        if (bubbleLayout7 != null) {
                            bubbleLayout7.postDelayed(new Runnable() { // from class: ro1.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i113 = i111;
                                    com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                    switch (i113) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar3.u6().x4();
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar3.u6().y4();
                                            break;
                                    }
                                }
                            }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.y6(((a) obj2).f153901a);
                        return;
                    case 2:
                        l0 l0Var = (l0) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        l0Var.getClass();
                        Context context3 = dVar.getContext();
                        if (context3 != null) {
                            com.garmin.android.apps.connectmobile.social.share.ui.b bVar3 = new com.garmin.android.apps.connectmobile.social.share.ui.b(context3, null, 0, 6, null);
                            bVar3.setLayoutParams(new ConstraintLayout.b(0, -2));
                            bVar3.setId(View.generateViewId());
                            final int i112 = 1;
                            bVar3.setAdjustViewBounds(true);
                            StickerEditorView stickerEditorView = dVar.f44655a;
                            if (stickerEditorView == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            bVar3.setZ(stickerEditorView.getNextZValue());
                            stickerEditorView.f44708a.add(bVar3);
                            stickerEditorView.addView(bVar3);
                            bVar3.setModel(l0Var);
                            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                            StickerEditorView stickerEditorView2 = dVar.f44655a;
                            if (stickerEditorView2 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.f(stickerEditorView2);
                            dVar2.h(bVar3.getId(), 3, R.id.share_image_view, 3);
                            dVar2.h(bVar3.getId(), 4, R.id.share_image_view, 4);
                            dVar2.h(bVar3.getId(), 6, R.id.share_image_view, 6);
                            dVar2.h(bVar3.getId(), 7, R.id.share_image_view, 7);
                            int id3 = bVar3.getId();
                            ImageView imageView = dVar.f44657c;
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mShareImageView");
                                throw null;
                            }
                            dVar2.k(id3).f6203e.f6224c = (int) (imageView.getWidth() * 0.4f);
                            BubbleLayout bubbleLayout8 = dVar.f44660f;
                            if (bubbleLayout8 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout8.getId(), 4, bVar3.getId(), 3);
                            BubbleLayout bubbleLayout9 = dVar.f44660f;
                            if (bubbleLayout9 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout9.getId(), 6, bVar3.getId(), 6);
                            BubbleLayout bubbleLayout10 = dVar.f44660f;
                            if (bubbleLayout10 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout10.getId(), 7, bVar3.getId(), 7);
                            StickerEditorView stickerEditorView3 = dVar.f44655a;
                            if (stickerEditorView3 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.b(stickerEditorView3);
                            BubbleLayout bubbleLayout11 = dVar.f44660f;
                            if (bubbleLayout11 != null) {
                                bubbleLayout11.postDelayed(new Runnable() { // from class: ro1.k
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i113 = i112;
                                        com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                        switch (i113) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().x4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().y4();
                                                break;
                                        }
                                    }
                                }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                        }
                        return;
                    default:
                        g3 g3Var = (g3) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        fw.p pVar = g3Var.f35300a;
                        List list = (List) g3Var.f35301b;
                        if (pVar == fw.p.SUCCESS && list != null) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                Iterator<T> it5 = ((l0) it4.next()).f153988c.iterator();
                                while (it5.hasNext()) {
                                    com.bumptech.glide.j<Drawable> jVarL = com.bumptech.glide.b.c(dVar.getContext()).d(dVar).l(((k0) it5.next()).f153983b);
                                    jVarL.getClass();
                                    new com.bumptech.glide.j(File.class, jVarL).a(com.bumptech.glide.j.f28502k0).L();
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        u uVarU7 = u6();
        final w0 w0Var2 = new w0();
        final m0 m0Var3 = new m0();
        final m0 m0Var4 = new m0();
        uVarU7.f154012a.getClass();
        SharedPreferences sharedPreferences2 = GCMSettingManager.f41536b;
        String string3 = GCMSettingManager.f41535a.getString(R.string.key_sticker_tap_for_more_hint);
        sharedPreferences2.getClass();
        string3.getClass();
        u2 u2Var2 = new u2(sharedPreferences2, string3, true);
        final int i27 = 0;
        w0Var2.n(u2Var2, new u.c(new e23.l() { // from class: ro1.t
            @Override // e23.l
            public final Object invoke(Object obj2) {
                int i110 = i27;
                p005kotlin.jvm.internal.m0 m0Var5 = m0Var4;
                w0 w0Var3 = w0Var2;
                p005kotlin.jvm.internal.m0 m0Var6 = m0Var3;
                switch (i110) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        int i111 = u.f154011k;
                        bool.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        m0Var6.f105804a = zBooleanValue;
                        w0Var3.m(Boolean.valueOf(zBooleanValue && m0Var5.f105804a));
                        break;
                    case 1:
                        l0 l0Var = (l0) obj2;
                        int i28 = u.f154011k;
                        boolean z14 = l0Var != null && l0Var.f153988c.size() > 1;
                        m0Var6.f105804a = z14;
                        w0Var3.m(Boolean.valueOf(m0Var5.f105804a && z14));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj2;
                        int i29 = u.f154011k;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        m0Var6.f105804a = zBooleanValue2;
                        w0Var3.m(Boolean.valueOf(zBooleanValue2 && m0Var5.f105804a));
                        break;
                    default:
                        b bVar2 = (b) obj2;
                        int i210 = u.f154011k;
                        boolean z15 = bVar2 != b.Default;
                        m0Var6.f105804a = z15;
                        w0Var3.m(Boolean.valueOf(m0Var5.f105804a && z15));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i28 = 1;
        w0Var2.n(uVarU7.f154020i, new u.c(new e23.l() { // from class: ro1.t
            @Override // e23.l
            public final Object invoke(Object obj2) {
                int i110 = i28;
                p005kotlin.jvm.internal.m0 m0Var5 = m0Var3;
                w0 w0Var3 = w0Var2;
                p005kotlin.jvm.internal.m0 m0Var6 = m0Var4;
                switch (i110) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        int i111 = u.f154011k;
                        bool.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        m0Var6.f105804a = zBooleanValue;
                        w0Var3.m(Boolean.valueOf(zBooleanValue && m0Var5.f105804a));
                        break;
                    case 1:
                        l0 l0Var = (l0) obj2;
                        int i29 = u.f154011k;
                        boolean z14 = l0Var != null && l0Var.f153988c.size() > 1;
                        m0Var6.f105804a = z14;
                        w0Var3.m(Boolean.valueOf(m0Var5.f105804a && z14));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj2;
                        int i210 = u.f154011k;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        m0Var6.f105804a = zBooleanValue2;
                        w0Var3.m(Boolean.valueOf(zBooleanValue2 && m0Var5.f105804a));
                        break;
                    default:
                        b bVar2 = (b) obj2;
                        int i211 = u.f154011k;
                        boolean z15 = bVar2 != b.Default;
                        m0Var6.f105804a = z15;
                        w0Var3.m(Boolean.valueOf(m0Var5.f105804a && z15));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        w0Var2.f(getViewLifecycleOwner(), new C0846d(new ro1.j(this, 2)));
        BubbleLayout bubbleLayout7 = this.f44660f;
        if (bubbleLayout7 == null) {
            p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
            throw th3;
        }
        final int i29 = 2;
        bubbleLayout7.setOnClickListener(new View.OnClickListener(this) { // from class: ro1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153985b;

            {
                this.f153985b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                a aVar3;
                int i210 = i29;
                com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153985b;
                switch (i210) {
                    case 0:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.u6().x4();
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        u uVarU8 = dVar.u6();
                        if (uVarU8.f154017f.d() != b.Default) {
                            y0<a> y0Var = uVarU8.f154018g;
                            a aVarD = y0Var.d();
                            if (aVarD != null) {
                                int iOrdinal = aVarD.ordinal() + 1;
                                w13.c cVar2 = a.f153900e;
                                aVar3 = (a) cVar2.get(iOrdinal % cVar2.getF134973e());
                            } else {
                                aVar3 = null;
                            }
                            y0Var.m(aVar3);
                            uVarU8.x4();
                            break;
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.u6().y4();
                        break;
                }
            }
        });
        StickerEditorView stickerEditorView = this.f44655a;
        if (stickerEditorView == null) {
            p005kotlin.jvm.internal.s.m("mStickerEditorView");
            throw th3;
        }
        stickerEditorView.setOnStickerEditListener(new ro1.m(this));
        final int i30 = 3;
        u6().f154019h.f(getViewLifecycleOwner(), new z0(this) { // from class: ro1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153966b;

            {
                this.f153966b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj2) {
                int i110 = i30;
                final int i111 = 0;
                final com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153966b;
                switch (i110) {
                    case 0:
                        b bVar2 = (b) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar3 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        bVar2.getClass();
                        ViewFlipper viewFlipper = dVar.f44658d;
                        if (viewFlipper == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        viewFlipper.setDisplayedChild(bVar2.ordinal());
                        if (bVar2 == b.Default) {
                            return;
                        }
                        ViewFlipper viewFlipper2 = dVar.f44658d;
                        if (viewFlipper2 == null) {
                            p005kotlin.jvm.internal.s.m("mTemplateContainer");
                            throw null;
                        }
                        View currentView = viewFlipper2.getCurrentView();
                        currentView.getClass();
                        dVar.w6((ActivityStatsTemplateView) currentView);
                        a aVarD = dVar.u6().f154018g.d();
                        if (aVarD != null) {
                            dVar.y6(aVarD.f153901a);
                        }
                        BubbleLayout bubbleLayout8 = dVar.f44659e;
                        if (bubbleLayout8 != null) {
                            bubbleLayout8.postDelayed(new Runnable() { // from class: ro1.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i113 = i111;
                                    com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                    switch (i113) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar3.u6().x4();
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                            dVar3.u6().y4();
                                            break;
                                    }
                                }
                            }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar4 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        dVar.y6(((a) obj2).f153901a);
                        return;
                    case 2:
                        l0 l0Var = (l0) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar5 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        l0Var.getClass();
                        Context context3 = dVar.getContext();
                        if (context3 != null) {
                            com.garmin.android.apps.connectmobile.social.share.ui.b bVar3 = new com.garmin.android.apps.connectmobile.social.share.ui.b(context3, null, 0, 6, null);
                            bVar3.setLayoutParams(new ConstraintLayout.b(0, -2));
                            bVar3.setId(View.generateViewId());
                            final int i112 = 1;
                            bVar3.setAdjustViewBounds(true);
                            StickerEditorView stickerEditorView2 = dVar.f44655a;
                            if (stickerEditorView2 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            bVar3.setZ(stickerEditorView2.getNextZValue());
                            stickerEditorView2.f44708a.add(bVar3);
                            stickerEditorView2.addView(bVar3);
                            bVar3.setModel(l0Var);
                            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                            StickerEditorView stickerEditorView3 = dVar.f44655a;
                            if (stickerEditorView3 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.f(stickerEditorView3);
                            dVar2.h(bVar3.getId(), 3, R.id.share_image_view, 3);
                            dVar2.h(bVar3.getId(), 4, R.id.share_image_view, 4);
                            dVar2.h(bVar3.getId(), 6, R.id.share_image_view, 6);
                            dVar2.h(bVar3.getId(), 7, R.id.share_image_view, 7);
                            int id3 = bVar3.getId();
                            ImageView imageView = dVar.f44657c;
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mShareImageView");
                                throw null;
                            }
                            dVar2.k(id3).f6203e.f6224c = (int) (imageView.getWidth() * 0.4f);
                            BubbleLayout bubbleLayout9 = dVar.f44660f;
                            if (bubbleLayout9 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout9.getId(), 4, bVar3.getId(), 3);
                            BubbleLayout bubbleLayout10 = dVar.f44660f;
                            if (bubbleLayout10 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout10.getId(), 6, bVar3.getId(), 6);
                            BubbleLayout bubbleLayout11 = dVar.f44660f;
                            if (bubbleLayout11 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                            dVar2.h(bubbleLayout11.getId(), 7, bVar3.getId(), 7);
                            StickerEditorView stickerEditorView4 = dVar.f44655a;
                            if (stickerEditorView4 == null) {
                                p005kotlin.jvm.internal.s.m("mStickerEditorView");
                                throw null;
                            }
                            dVar2.b(stickerEditorView4);
                            BubbleLayout bubbleLayout12 = dVar.f44660f;
                            if (bubbleLayout12 != null) {
                                bubbleLayout12.postDelayed(new Runnable() { // from class: ro1.k
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i113 = i112;
                                        com.garmin.android.apps.connectmobile.social.share.d dVar3 = dVar;
                                        switch (i113) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().x4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                                                dVar3.u6().y4();
                                                break;
                                        }
                                    }
                                }, com.garmin.android.apps.connectmobile.social.share.d.f44654n);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                                throw null;
                            }
                        }
                        return;
                    default:
                        g3 g3Var = (g3) obj2;
                        com.garmin.android.apps.connectmobile.social.share.d.a aVar6 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                        fw.p pVar = g3Var.f35300a;
                        List list = (List) g3Var.f35301b;
                        if (pVar == fw.p.SUCCESS && list != null) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                Iterator<T> it5 = ((l0) it4.next()).f153988c.iterator();
                                while (it5.hasNext()) {
                                    com.bumptech.glide.j<Drawable> jVarL = com.bumptech.glide.b.c(dVar.getContext()).d(dVar).l(((k0) it5.next()).f153983b);
                                    jVarL.getClass();
                                    new com.bumptech.glide.j(File.class, jVarL).a(com.bumptech.glide.j.f28502k0).L();
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        u6().f154021j.f(getViewLifecycleOwner(), new C0846d(new ro1.j(this, 0)));
    }

    public final u u6() {
        return (u) this.f44661g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    public final void v6() {
        Bitmap bitmap;
        Bitmap bitmap2;
        ActivityStatsTemplateView activityStatsTemplateView;
        g3<Bitmap> g3VarD = u6().f154021j.d();
        if (g3VarD == null || (bitmap2 = g3VarD.f35301b) == null) {
            bitmap = null;
        } else {
            com.garmin.android.apps.connectmobile.social.share.e eVar = new com.garmin.android.apps.connectmobile.social.share.e(bitmap2);
            if (u6().f154017f.d() != ro1.b.Default) {
                ro1.b bVarD = u6().f154017f.d();
                if (bVarD != null) {
                    int i14 = bVarD.f153911b;
                    Context context = getContext();
                    if (context != null) {
                        activityStatsTemplateView = new ActivityStatsTemplateView(context, i14);
                        activityStatsTemplateView.setLayoutDirection(requireActivity().getWindow().getDecorView().getLayoutDirection());
                        w6(activityStatsTemplateView);
                        ro1.a aVarD = u6().f154018g.d();
                        if (aVarD != null) {
                            activityStatsTemplateView.setColor(a7.b.getColor(context, aVarD.f153901a));
                        }
                    } else {
                        activityStatsTemplateView = null;
                    }
                } else {
                    activityStatsTemplateView = null;
                }
                if (activityStatsTemplateView != null) {
                    com.garmin.android.apps.connectmobile.social.share.a aVar = new com.garmin.android.apps.connectmobile.social.share.a(activityStatsTemplateView);
                    Canvas canvas = eVar.f44682b;
                    if (canvas != null) {
                        aVar.draw(canvas);
                    }
                }
            }
            float width = bitmap2.getWidth();
            ImageView imageView = this.f44657c;
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("mShareImageView");
                throw null;
            }
            float width2 = width / imageView.getWidth();
            m activity = getActivity();
            if (activity != null) {
                ConstraintLayout constraintLayout = new ConstraintLayout(activity);
                StickerEditorView stickerEditorView = this.f44655a;
                if (stickerEditorView == null) {
                    p005kotlin.jvm.internal.s.m("mStickerEditorView");
                    throw null;
                }
                i0 i0Var = new i0(constraintLayout, stickerEditorView.getStickers(), width2);
                Canvas canvas2 = eVar.f44682b;
                if (canvas2 != null) {
                    i0Var.draw(canvas2);
                }
                com.garmin.android.apps.connectmobile.social.share.a aVar2 = new com.garmin.android.apps.connectmobile.social.share.a(activity, R.layout.share_image_logo_layer);
                Canvas canvas3 = eVar.f44682b;
                if (canvas3 != null) {
                    aVar2.draw(canvas3);
                }
            }
            bitmap = eVar.f44681a;
        }
        if (bitmap == null) {
            g22.e.a(this, null);
            return;
        }
        Bundle arguments = getArguments();
        boolean z14 = arguments != null ? arguments.getBoolean("arg_is_png") : true;
        Bitmap.CompressFormat compressFormat = z14 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        bq0.l lVar = (bq0.l) this.f44662h.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        g0.f153957a.getClass();
        String strC = g0.c(z14);
        compressFormat.getClass();
        androidx.lifecycle.m.a(lVar.f19514a, new bq0.p(contextRequireContext, strC, lVar, compressFormat, bitmap, null), 2).f(this, new C0846d(new ro1.j(this, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void w6(ActivityStatsTemplateView activityStatsTemplateView) {
        String strP;
        String str;
        List<l0> list;
        Object next;
        List<ro1.k0> list2;
        ro1.k0 k0Var;
        String strA;
        String activityName;
        int i14 = 0;
        for (Object obj : h0.S0(this.f44664j, 3)) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            aq.c cVar = (aq.c) obj;
            CharSequence charSequence = cVar.f11849c;
            charSequence.getClass();
            TextView textView = (TextView) activityStatsTemplateView.findViewById(ActivityStatsTemplateView.f44701b.get(i14).intValue());
            if (textView != null) {
                if (textView.getTypeface().isItalic() || (!textView.getTypeface().isItalic() && textView.getPaint().getTextSkewX() < 0.0f)) {
                    x0 x0Var = x0.f105818a;
                    String str2 = activityStatsTemplateView.f44706a;
                    q6.f.y(new Object[]{str2, charSequence, str2}, 3, "%s%s%s", textView);
                } else {
                    textView.setText(charSequence);
                }
            }
            CharSequence charSequence2 = cVar.f11847a;
            charSequence2.getClass();
            TextView textView2 = (TextView) activityStatsTemplateView.findViewById(ActivityStatsTemplateView.f44702c.get(i14).intValue());
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
            i14 = i15;
        }
        ImageView imageView = (ImageView) activityStatsTemplateView.findViewById(R.id.activity_type_icon);
        q qVar = this.f44663i;
        if (qVar == null) {
            p005kotlin.jvm.internal.s.m("mActivityStatsBrief");
            throw null;
        }
        am.x0 x0VarO = qVar.o();
        if (imageView != null) {
            imageView.setImageResource(x0VarO.f4361d);
        }
        TextView textView3 = (TextView) activityStatsTemplateView.findViewById(R.id.activity_type_name);
        String strPrint = "";
        if (textView3 != null) {
            u uVarU6 = u6();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            q qVar2 = this.f44663i;
            if (qVar2 == null) {
                p005kotlin.jvm.internal.s.m("mActivityStatsBrief");
                throw null;
            }
            if (uVarU6.f154017f.d() == ro1.b.Option2 || (activityName = qVar2.getActivityName()) == null || d53.w.J(activityName)) {
                strA = dh.b.A(contextRequireContext, qVar2.o().f4360c);
            } else {
                strA = qVar2.getActivityName();
                if (strA == null) {
                    strA = "";
                }
            }
            textView3.setText(strA);
        }
        TextView textView4 = (TextView) activityStatsTemplateView.findViewById(R.id.device_product_name);
        if (textView4 != null) {
            g3<List<l0>> g3VarD = u6().f154019h.d();
            if (g3VarD == null || (list = g3VarD.f35301b) == null) {
                str = "";
            } else {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((l0) next).f153986a != so1.e.DEVICE);
                l0 l0Var = (l0) next;
                if (l0Var == null || (list2 = l0Var.f153988c) == null || (k0Var = (ro1.k0) h0.b0(list2)) == null || (str = k0Var.f153982a) == null) {
                    str = "";
                }
            }
            textView4.setText(str);
        }
        TextView textView5 = (TextView) activityStatsTemplateView.findViewById(R.id.datetime_at_location);
        if (textView5 != null) {
            q qVar3 = this.f44663i;
            if (qVar3 == null) {
                p005kotlin.jvm.internal.s.m("mActivityStatsBrief");
                throw null;
            }
            String startTimeLocal = qVar3.getStartTimeLocal();
            if (startTimeLocal == null) {
                startTimeLocal = "";
            }
            DateTime dateTimeN = c22.j0.N(startTimeLocal, false);
            q qVar4 = this.f44663i;
            if (qVar4 == null) {
                p005kotlin.jvm.internal.s.m("mActivityStatsBrief");
                throw null;
            }
            String locationName = qVar4.getLocationName();
            if (dateTimeN != null) {
                if (p005kotlin.jvm.internal.s.g(Locale.getDefault().getLanguage(), "en")) {
                    strP = "MMM d yyyy, HH:mm";
                } else {
                    c22.j0 j0Var = c22.j0.f23099a;
                    Locale locale = Locale.getDefault();
                    j0Var.getClass();
                    strP = c22.j0.P("MS", locale);
                }
                strPrint = DateTimeFormat.forPattern(strP).print(dateTimeN);
                if (locationName == null || d53.w.J(locationName)) {
                    strPrint.getClass();
                } else {
                    strPrint = getString(R.string.string_at_string_pattern, strPrint, locationName);
                    strPrint.getClass();
                }
            } else if (locationName != null && !d53.w.J(locationName)) {
                strPrint = locationName;
            }
            textView5.setText(strPrint);
        }
    }

    public final void y6(int i14) {
        Context context = getContext();
        if (context != null) {
            ViewFlipper viewFlipper = this.f44658d;
            if (viewFlipper == null) {
                p005kotlin.jvm.internal.s.m("mTemplateContainer");
                throw null;
            }
            View currentView = viewFlipper.getCurrentView();
            ActivityStatsTemplateView activityStatsTemplateView = currentView instanceof ActivityStatsTemplateView ? (ActivityStatsTemplateView) currentView : null;
            if (activityStatsTemplateView != null) {
                activityStatsTemplateView.setColor(a7.b.getColor(context, i14));
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/d$a;", "", "<init>", "()V", "", "TOOLTIP_TIMER_IN_MILLI_SECOND", "J", "", "ARG_IS_PNG", "Ljava/lang/String;", "", "REQUEST_CODE_SAVE_IMAGE_PERMS", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
