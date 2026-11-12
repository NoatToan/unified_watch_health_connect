package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g3j;
import defpackage.g7i;
import defpackage.kui;
import defpackage.mii;
import defpackage.p3j;
import defpackage.vpi;
import defpackage.y6i;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements androidx.preference.b.c, androidx.preference.b.a, androidx.preference.b.InterfaceC0063b, DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private androidx.preference.b mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final d mDividerDecoration = new d();
    private int mLayoutResId = kui.c;
    private final Handler mHandler = new a(Looper.getMainLooper());
    private final Runnable mRequestFocus = new b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat.this.bindPreferences();
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
            RecyclerView recyclerView = PreferenceFragmentCompat.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Preference f2736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2737b;

        public c(Preference preference, String str) {
            this.f2736a = preference;
            this.f2737b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.Adapter adapter = PreferenceFragmentCompat.this.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f2736a;
            int iB = preference != null ? ((PreferenceGroup.c) adapter).b(preference) : ((PreferenceGroup.c) adapter).e(this.f2737b);
            if (iB != -1) {
                PreferenceFragmentCompat.this.mList.scrollToPosition(iB);
            } else {
                adapter.registerAdapterDataObserver(new h(adapter, PreferenceFragmentCompat.this.mList, this.f2736a, this.f2737b));
            }
        }
    }

    public class d extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f2738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2739b;
        public boolean c = true;

        public d() {
        }

        private boolean f(View view, RecyclerView recyclerView) {
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

        public void c(boolean z) {
            this.c = z;
        }

        public void d(Drawable drawable) {
            if (drawable != null) {
                this.f2739b = drawable.getIntrinsicHeight();
            } else {
                this.f2739b = 0;
            }
            this.f2738a = drawable;
            PreferenceFragmentCompat.this.mList.invalidateItemDecorations();
        }

        public void e(int i) {
            this.f2739b = i;
            PreferenceFragmentCompat.this.mList.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (f(view, recyclerView)) {
                rect.bottom = this.f2739b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (this.f2738a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (f(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.f2738a.setBounds(0, y, width, this.f2739b + y);
                    this.f2738a.draw(canvas);
                }
            }
        }
    }

    public interface e {
        boolean a(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    public interface f {
        boolean onPreferenceStartFragment(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    public interface g {
        boolean a(PreferenceFragmentCompat preferenceFragmentCompat, PreferenceScreen preferenceScreen);
    }

    public static class h extends RecyclerView.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView.Adapter<?> f2740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f2741b;
        public final Preference c;
        public final String d;

        public h(RecyclerView.Adapter<?> adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f2740a = adapter;
            this.f2741b = recyclerView;
            this.c = preference;
            this.d = str;
        }

        public final void a() {
            this.f2740a.unregisterAdapterDataObserver(this);
            Preference preference = this.c;
            int iB = preference != null ? ((PreferenceGroup.c) this.f2740a).b(preference) : ((PreferenceGroup.c) this.f2740a).e(this.d);
            if (iB != -1) {
                this.f2741b.scrollToPosition(iB);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i, int i2, Object obj) {
            a();
        }
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        c cVar = new c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.k(requireContext(), i, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        androidx.preference.b bVar = this.mPreferenceManager;
        if (bVar == null) {
            return null;
        }
        return (T) bVar.a(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public androidx.preference.b getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(mii.j, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = g3j.f18551a;
        }
        requireContext().getTheme().applyStyle(i, false);
        androidx.preference.b bVar = new androidx.preference.b(requireContext());
        this.mPreferenceManager = bVar;
        bVar.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    public RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new androidx.preference.a(preferenceScreen);
    }

    public RecyclerView.o onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(vpi.e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(kui.d, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new y6i(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, p3j.z0, mii.f, 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(p3j.A0, this.mLayoutResId);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(p3j.B0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3j.C0, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(p3j.D0, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = recyclerViewOnCreateRecyclerView;
        recyclerViewOnCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.c(z);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.b.a
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment dialogFragmentB;
        boolean zA = getCallbackFragment() instanceof e ? ((e) getCallbackFragment()).a(this, preference) : false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof e) {
                zA = ((e) parentFragment).a(this, preference);
            }
        }
        if (!zA && (getContext() instanceof e)) {
            zA = ((e) getContext()).a(this, preference);
        }
        if (!zA && (getActivity() instanceof e)) {
            zA = ((e) getActivity()).a(this, preference);
        }
        if (!zA && getParentFragmentManager().l0(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentB = EditTextPreferenceDialogFragmentCompat.C(preference.getKey());
            } else if (preference instanceof ListPreference) {
                dialogFragmentB = ListPreferenceDialogFragmentCompat.B(preference.getKey());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                dialogFragmentB = MultiSelectListPreferenceDialogFragmentCompat.B(preference.getKey());
            }
            dialogFragmentB.setTargetFragment(this, 0);
            dialogFragmentB.show(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // androidx.preference.b.InterfaceC0063b
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        boolean zA = getCallbackFragment() instanceof g ? ((g) getCallbackFragment()).a(this, preferenceScreen) : false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof g) {
                zA = ((g) parentFragment).a(this, preferenceScreen);
            }
        }
        if (!zA && (getContext() instanceof g)) {
            zA = ((g) getContext()).a(this, preferenceScreen);
        }
        if (zA || !(getActivity() instanceof g)) {
            return;
        }
        ((g) getActivity()).a(this, preferenceScreen);
    }

    @Override // androidx.preference.b.c
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean zOnPreferenceStartFragment = getCallbackFragment() instanceof f ? ((f) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        for (Fragment parentFragment = this; !zOnPreferenceStartFragment && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof f) {
                zOnPreferenceStartFragment = ((f) parentFragment).onPreferenceStartFragment(this, preference);
            }
        }
        if (!zOnPreferenceStartFragment && (getContext() instanceof f)) {
            zOnPreferenceStartFragment = ((f) getContext()).onPreferenceStartFragment(this, preference);
        }
        if (!zOnPreferenceStartFragment && (getActivity() instanceof f)) {
            zOnPreferenceStartFragment = ((f) getActivity()).onPreferenceStartFragment(this, preference);
        }
        if (zOnPreferenceStartFragment) {
            return true;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle extras = preference.getExtras();
        Fragment fragmentA = parentFragmentManager.x0().a(requireActivity().getClassLoader(), preference.getFragment());
        fragmentA.setArguments(extras);
        fragmentA.setTargetFragment(this, 0);
        parentFragmentManager.o().w(((View) requireView().getParent()).getId(), fragmentA).j(null).l();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(this);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(null);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.d(drawable);
    }

    public void setDividerHeight(int i) {
        this.mDividerDecoration.e(i);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.mPreferenceManager.m(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            postBindPreferences();
        }
    }

    public void setPreferencesFromResource(int i, String str) {
        Preference preferenceI;
        requirePreferenceManager();
        PreferenceScreen preferenceScreenK = this.mPreferenceManager.k(requireContext(), i, null);
        Preference preference = preferenceScreenK;
        if (str != null) {
            preferenceI = preferenceScreenK.i(str);
            if (!(preferenceI instanceof PreferenceScreen)) {
                preference = preferenceI;
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        preference = preferenceI;
        setPreferenceScreen((PreferenceScreen) preference);
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }
}
