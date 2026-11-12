package androidx.preference;

import android.R;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g3j;
import defpackage.g7i;
import defpackage.kui;
import defpackage.mii;
import defpackage.p3j;
import defpackage.p5q;
import defpackage.vpi;
import defpackage.y6i;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class PreferenceFragment extends Fragment implements androidx.preference.b.c, androidx.preference.b.a, androidx.preference.b.InterfaceC0063b, DialogPreference.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.preference.b f2729b;
    public RecyclerView c;
    public boolean d;
    public boolean e;
    public Context f;
    public Runnable h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2728a = new c();
    public int g = kui.c;
    public final Handler i = new a();
    public final Runnable j = new b();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragment.this.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

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
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragment.this.c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f2732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2733b;
        public boolean c = true;

        public c() {
        }

        public void c(boolean z) {
            this.c = z;
        }

        public void d(Drawable drawable) {
            if (drawable != null) {
                this.f2733b = drawable.getIntrinsicHeight();
            } else {
                this.f2733b = 0;
            }
            this.f2732a = drawable;
            PreferenceFragment.this.c.invalidateItemDecorations();
        }

        public void e(int i) {
            this.f2733b = i;
            PreferenceFragment.this.c.invalidateItemDecorations();
        }

        public final boolean f(View view, RecyclerView recyclerView) {
            RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!(childViewHolder instanceof g7i) || !((g7i) childViewHolder).c()) {
                return false;
            }
            boolean z2 = this.c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.d0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof g7i) && ((g7i) childViewHolder2).b()) {
                z = true;
            }
            return z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (f(view, recyclerView)) {
                rect.bottom = this.f2733b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (this.f2732a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (f(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.f2732a.setBounds(0, y, width, this.f2733b + y);
                    this.f2732a.draw(canvas);
                }
            }
        }
    }

    public interface d {
        boolean a(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface e {
        boolean a(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface f {
        boolean a(PreferenceFragment preferenceFragment, PreferenceScreen preferenceScreen);
    }

    public void a() {
        PreferenceScreen preferenceScreenD = d();
        if (preferenceScreenD != null) {
            c().setAdapter(f(preferenceScreenD));
            preferenceScreenD.onAttached();
        }
        e();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Fragment b() {
        return null;
    }

    @Deprecated
    public final RecyclerView c() {
        return this.c;
    }

    @Deprecated
    public PreferenceScreen d() {
        return this.f2729b.i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void e() {
    }

    @Deprecated
    public RecyclerView.Adapter f(PreferenceScreen preferenceScreen) {
        return new androidx.preference.a(preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.a
    @Deprecated
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        androidx.preference.b bVar = this.f2729b;
        if (bVar == null) {
            return null;
        }
        return (T) bVar.a(charSequence);
    }

    @Deprecated
    public RecyclerView.o g() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    public abstract void h(Bundle bundle, String str);

    @Deprecated
    public RecyclerView i(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(vpi.e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(kui.d, viewGroup, false);
        recyclerView2.setLayoutManager(g());
        recyclerView2.setAccessibilityDelegateCompat(new y6i(recyclerView2));
        return recyclerView2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void j() {
    }

    @Deprecated
    public void k(Drawable drawable) {
        this.f2728a.d(drawable);
    }

    @Deprecated
    public void l(int i) {
        this.f2728a.e(i);
    }

    public final void m() {
        PreferenceScreen preferenceScreenD = d();
        if (preferenceScreenD != null) {
            preferenceScreenD.onDetached();
        }
        j();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(mii.j, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = g3j.f18551a;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.f = contextThemeWrapper;
        androidx.preference.b bVar = new androidx.preference.b(contextThemeWrapper);
        this.f2729b = bVar;
        bVar.setOnNavigateToScreenListener(this);
        h(bundle, getArguments() != null ? getArguments().getString(PreferenceFragmentCompat.ARG_PREFERENCE_ROOT) : null);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p3j.u0, p5q.a(context, mii.g, R.attr.preferenceFragmentStyle), 0);
        this.g = typedArrayObtainStyledAttributes.getResourceId(p3j.v0, this.g);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(p3j.w0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3j.x0, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(p3j.y0, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.g, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewI = i(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewI == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.c = recyclerViewI;
        recyclerViewI.addItemDecoration(this.f2728a);
        k(drawable);
        if (dimensionPixelSize != -1) {
            l(dimensionPixelSize);
        }
        this.f2728a.c(z);
        if (this.c.getParent() == null) {
            viewGroup2.addView(this.c);
        }
        this.i.post(this.j);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.i.removeCallbacks(this.j);
        this.i.removeMessages(1);
        if (this.d) {
            m();
        }
        this.c = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.b.a
    @Deprecated
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment dialogFragmentI;
        boolean zA = b() instanceof d ? ((d) b()).a(this, preference) : false;
        if (!zA && (getActivity() instanceof d)) {
            zA = ((d) getActivity()).a(this, preference);
        }
        if (!zA && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentI = EditTextPreferenceDialogFragment.i(preference.getKey());
            } else if (preference instanceof ListPreference) {
                dialogFragmentI = ListPreferenceDialogFragment.i(preference.getKey());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                dialogFragmentI = MultiSelectListPreferenceDialogFragment.i(preference.getKey());
            }
            dialogFragmentI.setTargetFragment(this, 0);
            dialogFragmentI.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.b.InterfaceC0063b
    @Deprecated
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (!((b() instanceof f) && ((f) b()).a(this, preferenceScreen)) && (getActivity() instanceof f)) {
            ((f) getActivity()).a(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.b.c
    @Deprecated
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean zA = b() instanceof e ? ((e) b()).a(this, preference) : false;
        return (zA || !(getActivity() instanceof e)) ? zA : ((e) getActivity()).a(this, preference);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenD = d();
        if (preferenceScreenD != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenD.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f2729b.setOnPreferenceTreeClickListener(this);
        this.f2729b.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f2729b.setOnPreferenceTreeClickListener(null);
        this.f2729b.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenD;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenD = d()) != null) {
            preferenceScreenD.restoreHierarchyState(bundle2);
        }
        if (this.d) {
            a();
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
                this.h = null;
            }
        }
        this.e = true;
    }
}
