package tm0;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.u;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.draggableimagepreviewer.DraggableImagePreviewer;
import gg1.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n12.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.q0;
import sg0.w0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltm0/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f165349i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f165350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DraggableImagePreviewer f165352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f165353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f165354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BubbleLayout f165355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuItem f165356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f165357h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165358a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f165358a = iArr;
        }
    }

    /* JADX INFO: renamed from: tm0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"tm0/c$c", "Landroidx/core/view/s;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3107c implements s {
        public C3107c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.group_post, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_post);
            c cVar = c.this;
            if (menuItemFindItem != null) {
                menuItemFindItem.setEnabled(c.u6(cVar));
            } else {
                menuItemFindItem = null;
            }
            cVar.f165356g = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_post) {
                return false;
            }
            c cVar = c.this;
            DraggableImagePreviewer draggableImagePreviewer = cVar.f165352c;
            if (draggableImagePreviewer == null) {
                p005kotlin.jvm.internal.s.m("photoPicker");
                throw null;
            }
            List<ef0.b> imageItems = draggableImagePreviewer.getImageItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : imageItems) {
                if (((ef0.b) obj).f63940b != ef0.e.SUCCESS) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                cVar.v6();
                return true;
            }
            new androidx.appcompat.app.e.a(cVar.requireContext()).setTitle(R.string.social_group_post_missing_photos).setMessage(R.string.social_group_post_missing_photo_message).setNegativeButton(R.string.lbl_cancel, new qh1.j(17)).setPositiveButton(R.string.lbl_common_continue, new tm0.b(cVar, 0)).show();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f165360a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f165360a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f165360a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f165360a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f165361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f165361a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f165361a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f165362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f165363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f165362a = aVar;
            this.f165363b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f165362a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f165363b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public c() {
        super(R.layout.fragment_group_post_feed_create_dialog_content);
        this.f165350a = new w1(s0.f105811a.b(l.class), new e(this), new w0(this, 21), new f(null, this));
    }

    public static final boolean u6(c cVar) {
        if (cVar.f165351b > 0) {
            return true;
        }
        EditText editText = cVar.f165353d;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("editText");
            throw null;
        }
        Editable text = editText.getText();
        text.getClass();
        return text.length() > 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new C3107c(), b0.b.RESUMED);
        EditText editText = (EditText) view2.findViewById(R.id.edit_text);
        int i14 = 1;
        if (editText != null) {
            this.f165353d = editText;
            editText.setOnTouchListener(new y(1));
            editText.addTextChangedListener(new tm0.e(this));
            editText.setFilters(new InputFilter[]{new l0(7)});
            editText.post(new po.g(editText, 24));
        }
        DraggableImagePreviewer draggableImagePreviewer = (DraggableImagePreviewer) view2.findViewById(R.id.image_list);
        if (draggableImagePreviewer != null) {
            this.f165352c = draggableImagePreviewer;
            draggableImagePreviewer.setMaxImageCount(10);
            y0<List<ef0.b>> y0Var = ((l) this.f165350a.getValue()).f165398d;
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0Var, viewLifecycleOwner, new d(new tm0.a(this, 2)));
            DraggableImagePreviewer draggableImagePreviewer2 = this.f165352c;
            if (draggableImagePreviewer2 == null) {
                p005kotlin.jvm.internal.s.m("photoPicker");
                throw null;
            }
            draggableImagePreviewer2.setImageClickListener(new tm0.f(this));
            DraggableImagePreviewer draggableImagePreviewer3 = this.f165352c;
            if (draggableImagePreviewer3 == null) {
                p005kotlin.jvm.internal.s.m("photoPicker");
                throw null;
            }
            draggableImagePreviewer3.setOnDataChangedListener(new g(this));
        }
        BubbleLayout bubbleLayout = (BubbleLayout) view2.findViewById(R.id.bubble_tip);
        if (bubbleLayout != null) {
            this.f165355f = bubbleLayout;
        }
        View viewFindViewById = view2.findViewById(R.id.add_photo);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new t61.m(this, i14));
        }
        View viewFindViewById2 = view2.findViewById(R.id.progress_view);
        if (viewFindViewById2 != null) {
            this.f165354e = viewFindViewById2;
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        onBackPressedDispatcher.b(new tm0.d(this), viewLifecycleOwner2);
    }

    public final void v6() {
        EditText editText = this.f165353d;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("editText");
            throw null;
        }
        Editable text = editText.getText();
        String string = text != null ? text.toString() : null;
        DraggableImagePreviewer draggableImagePreviewer = this.f165352c;
        if (draggableImagePreviewer == null) {
            p005kotlin.jvm.internal.s.m("photoPicker");
            throw null;
        }
        List<ef0.b> imageItems = draggableImagePreviewer.getImageItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageItems) {
            if (((ef0.b) obj).f63940b == ef0.e.SUCCESS) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj2 = ((ef0.b) it.next()).f63941c;
            jo1.f fVar = obj2 instanceof jo1.f ? (jo1.f) obj2 : null;
            if (fVar != null) {
                arrayList2.add(fVar);
            }
        }
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new m((l) this.f165350a.getValue(), string, arrayList2, null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new d(new tm0.a(this, 0)));
    }

    public final void w6() {
        View view2 = this.f165354e;
        if (view2 != null) {
            v22.e.q(view2);
        } else {
            p005kotlin.jvm.internal.s.m("progressView");
            throw null;
        }
    }

    public final void y6(String str, boolean z14) {
        q0 q0Var;
        if (z14 && (q0Var = this.f165357h) != null) {
            q0Var.dismiss();
        }
        q0 q0Var2 = this.f165357h;
        if (q0Var2 == null || !q0Var2.isShown()) {
            this.f165357h = null;
            q0.b bVar = q0.f149800b;
            View viewRequireView = requireView();
            viewRequireView.getClass();
            q0 q0VarC = q0.b.c(bVar, viewRequireView, str, null, 12);
            this.f165357h = q0VarC;
            q0VarC.show();
        }
    }

    public final void z6(ef0.b bVar) {
        l lVar = (l) this.f165350a.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new q(lVar, contextRequireContext, bVar, null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new d(new sy.i(13, bVar, this)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltm0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
