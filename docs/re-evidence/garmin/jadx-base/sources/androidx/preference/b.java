package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd.g;
import bd.h;
import bd.i;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Fragment implements DialogPreference.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bd.f f10193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f10194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10196e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f10192a = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10197f = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f10198g = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC0141b f10199h = new RunnableC0141b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b bVar = b.this;
            PreferenceScreen preferenceScreen = bVar.f10193b.f17494g;
            if (preferenceScreen != null) {
                bVar.f10194c.setAdapter(new androidx.preference.c(preferenceScreen));
                preferenceScreen.k();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.preference.b$b, reason: collision with other inner class name */
    public class RunnableC0141b implements Runnable {
        public RunnableC0141b() {
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
        public final void run() {
            RecyclerView recyclerView = b.this.f10194c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f10202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10204c = true;

        public c() {
        }

        public final boolean e(RecyclerView recyclerView, View view2) {
            RecyclerView.f0 childViewHolder = recyclerView.getChildViewHolder(view2);
            if (!(childViewHolder instanceof h) || !((h) childViewHolder).f17506e) {
                return false;
            }
            boolean z14 = this.f10204c;
            int iIndexOfChild = recyclerView.indexOfChild(view2);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z14;
            }
            RecyclerView.f0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            return (childViewHolder2 instanceof h) && ((h) childViewHolder2).f17505d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if (e(recyclerView, view2)) {
                rect.bottom = this.f10203b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if (this.f10202a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = recyclerView.getChildAt(i14);
                if (e(recyclerView, childAt)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f10202a.setBounds(0, height, width, this.f10203b + height);
                    this.f10202a.draw(canvas);
                }
            }
        }
    }

    public interface d {
        boolean a();
    }

    public interface e {
        boolean a();
    }

    public interface f {
        boolean a();
    }

    @Override // androidx.preference.DialogPreference.a
    public final Preference H0(String str) {
        PreferenceScreen preferenceScreen;
        bd.f fVar = this.f10193b;
        if (fVar == null || (preferenceScreen = fVar.f17494g) == null) {
            return null;
        }
        return preferenceScreen.F(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i14 = typedValue.resourceId;
        if (i14 == 0) {
            i14 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i14, false);
        bd.f fVar = new bd.f(requireContext());
        this.f10193b = fVar;
        fVar.f17497j = this;
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        v6();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, i.f17514h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f10197f = typedArrayObtainStyledAttributes.getResourceId(0, this.f10197f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f10197f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            vb.h.z("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAccessibilityDelegateCompat(new g(recyclerView));
        }
        this.f10194c = recyclerView;
        c cVar = this.f10192a;
        recyclerView.addItemDecoration(cVar);
        if (drawable != null) {
            cVar.getClass();
            cVar.f10203b = drawable.getIntrinsicHeight();
        } else {
            cVar.f10203b = 0;
        }
        cVar.f10202a = drawable;
        b bVar = b.this;
        bVar.f10194c.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            cVar.f10203b = dimensionPixelSize;
            bVar.f10194c.invalidateItemDecorations();
        }
        cVar.f10204c = z14;
        if (this.f10194c.getParent() == null) {
            viewGroup2.addView(this.f10194c);
        }
        this.f10198g.post(this.f10199h);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RunnableC0141b runnableC0141b = this.f10199h;
        a aVar = this.f10198g;
        aVar.removeCallbacks(runnableC0141b);
        aVar.removeMessages(1);
        if (this.f10195d) {
            this.f10194c.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f10193b.f17494g;
            if (preferenceScreen != null) {
                preferenceScreen.o();
            }
        }
        this.f10194c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f10193b.f17494g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        bd.f fVar = this.f10193b;
        fVar.f17495h = this;
        fVar.f17496i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        bd.f fVar = this.f10193b;
        fVar.f17495h = null;
        fVar.f17496i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view2, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f10193b.f17494g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.f10195d && (preferenceScreen = this.f10193b.f17494g) != null) {
            this.f10194c.setAdapter(new androidx.preference.c(preferenceScreen));
            preferenceScreen.k();
        }
        this.f10196e = true;
    }

    public final void u6(int i14) {
        bd.f fVar = this.f10193b;
        if (fVar == null) {
            kg.f.n("This should be called after super.onCreate.");
            return;
        }
        Context contextRequireContext = requireContext();
        PreferenceScreen preferenceScreen = this.f10193b.f17494g;
        fVar.f17492e = true;
        bd.e eVar = new bd.e(contextRequireContext, fVar);
        XmlResourceParser xml = eVar.f17484a.getResources().getXml(i14);
        try {
            PreferenceGroup preferenceGroupC = eVar.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.l(fVar);
            SharedPreferences.Editor editor = fVar.f17491d;
            if (editor != null) {
                editor.apply();
            }
            fVar.f17492e = false;
            bd.f fVar2 = this.f10193b;
            PreferenceScreen preferenceScreen3 = fVar2.f17494g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.o();
                }
                fVar2.f17494g = preferenceScreen2;
                this.f10195d = true;
                if (this.f10196e) {
                    a aVar = this.f10198g;
                    if (aVar.hasMessages(1)) {
                        return;
                    }
                    aVar.obtainMessage(1).sendToTarget();
                }
            }
        } catch (Throwable th3) {
            xml.close();
            throw th3;
        }
    }

    public abstract void v6();
}
