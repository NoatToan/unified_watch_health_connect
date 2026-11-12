package qg0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k0;
import e23.p;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import q42.d;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqg0/a;", "Lcom/garmin/android/apps/connectmobile/k0;", "Landroidx/appcompat/widget/SearchView$m;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends k0 implements SearchView.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f144654i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f144655e = m.b(new d(this, 8));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SearchView f144656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Menu f144657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f144658h;

    /* JADX INFO: renamed from: qg0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.ContentSearchActivity$onCreate$1", f = "ContentSearchActivity.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class C2725a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144659a;

        /* JADX INFO: renamed from: qg0.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.ContentSearchActivity$onCreate$1$1", f = "ContentSearchActivity.kt", l = {35}, m = "invokeSuspend", v = 2)
        public static final class C2726a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f144661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f144662b;

            /* JADX INFO: renamed from: qg0.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C2727a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a f144663a;

                public C2727a(a aVar) {
                    this.f144663a = aVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    MenuItem menuItemFindItem;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    Menu menu = this.f144663a.f144657g;
                    if (menu == null || (menuItemFindItem = menu.findItem(R.id.menu_item_search)) == null) {
                        return Unit.INSTANCE;
                    }
                    menuItemFindItem.setVisible(zBooleanValue);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2726a(a aVar, t13.d<? super C2726a> dVar) {
                super(2, dVar);
                this.f144662b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2726a(this.f144662b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2726a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to qg0.a$a$a for r4v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r4.f144661a
                    r2 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r2) goto L10
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r5)
                Le:
                    r5 = 0
                    return r5
                L10:
                    o13.r.b(r5)
                    goto L33
                L14:
                    o13.r.b(r5)
                    qg0.a r5 = r4.f144662b
                    qg0.b r1 = r5.fa()
                    r53.p2 r1 = r1.f144664a
                    r53.b2 r1 = r53.s.d(r1)
                    qg0.a$a$a$a r3 = new qg0.a$a$a$a
                    r3.<init>(r5)
                    r4.f144661a = r2
                    r53.o2<T> r5 = r1.f150540a
                    java.lang.Object r5 = r5.collect(r3, r4)
                    if (r5 != r0) goto L33
                    return r0
                L33:
                    o2.c.f()
                    goto Le
                */
                throw new UnsupportedOperationException("Method not decompiled: qg0.a.C2725a.C2726a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C2725a(t13.d<? super C2725a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new C2725a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2725a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144659a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = a.this;
                C2726a c2726a = new C2726a(aVar2, null);
                this.f144659a = 1;
                if (h1.b(aVar2, bVar, c2726a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean E0(String str) {
        SearchView searchView = this.f144656f;
        if (searchView == null) {
            s.m("searchView");
            throw null;
        }
        searchView.clearFocus();
        this.f144658h = str;
        return true;
    }

    public final b fa() {
        return (b) this.f144655e.getValue();
    }

    public void ga() {
    }

    public boolean l5(String str) {
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        SearchView searchView = this.f144656f;
        if (searchView == null) {
            s.m("searchView");
            throw null;
        }
        if (searchView.C) {
            super.onBackPressed();
            return;
        }
        searchView.j("");
        SearchView searchView2 = this.f144656f;
        if (searchView2 != null) {
            searchView2.setIconified(true);
        } else {
            s.m("searchView");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ge1.b.T(f0.w(this), null, null, new C2725a(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        this.f144657g = menu;
        getMenuInflater().inflate(R.menu.menu_search, menu);
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_search)) != null) {
            menuItemFindItem.setVisible(((Boolean) r53.s.d(fa().f144664a).f150540a.getValue()).booleanValue());
            View actionView = menuItemFindItem.getActionView();
            SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
            if (searchView != null) {
                this.f144656f = searchView;
                searchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                searchView.setMaxWidth(Integer.MAX_VALUE);
                View viewFindViewById = searchView.findViewById(R.id.search_edit_frame);
                viewFindViewById.getClass();
                ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewFindViewById).getLayoutParams();
                layoutParams.getClass();
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
                View viewFindViewById2 = searchView.findViewById(R.id.search_src_text);
                viewFindViewById2.getClass();
                EditText editText = (EditText) viewFindViewById2;
                editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                searchView.setQueryHint(getString(R.string.lbl_search));
                searchView.setIconifiedByDefault(true);
                searchView.setFocusable(false);
                searchView.setOnQueryTextListener(this);
                searchView.setOnCloseListener(new ps2.d(this, 10));
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (!((Boolean) r53.s.d(fa().f144664a).f150540a.getValue()).booleanValue()) {
            return super.onPrepareOptionsMenu(menu);
        }
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.menu_item_search) : null;
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        if (searchView == null) {
            return super.onPrepareOptionsMenu(menu);
        }
        this.f144656f = searchView;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_primary));
        colorStateListValueOf.getClass();
        ImageView imageView = (ImageView) searchView.findViewById(R.id.search_button);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.search);
        }
        if (imageView != null) {
            imageView.setImageTintList(colorStateListValueOf);
        }
        ImageView imageView2 = (ImageView) searchView.findViewById(R.id.search_mag_icon);
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.search);
        }
        if (imageView2 != null) {
            imageView2.setImageTintList(colorStateListValueOf);
        }
        String str = this.f144658h;
        if (str != null) {
            searchView.j(str);
            searchView.setIconified(false);
            searchView.clearFocus();
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
