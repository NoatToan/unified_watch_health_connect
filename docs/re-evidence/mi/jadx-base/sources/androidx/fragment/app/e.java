package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import defpackage.w5j;

/* JADX INFO: loaded from: classes.dex */
public class e implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f2407a;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2408a;

        public a(h hVar) {
            this.f2408a = hVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f2408a.k();
            this.f2408a.m();
            l.o((ViewGroup) fragmentK.mView.getParent(), e.this.f2407a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public e(FragmentManager fragmentManager) {
        this.f2407a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        h hVarX;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2407a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w5j.f37636a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(w5j.f37637b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(w5j.c, -1);
        String string = typedArrayObtainStyledAttributes.getString(w5j.d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !d.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentK0 = resourceId != -1 ? this.f2407a.k0(resourceId) : null;
        if (fragmentK0 == null && string != null) {
            fragmentK0 = this.f2407a.l0(string);
        }
        if (fragmentK0 == null && id != -1) {
            fragmentK0 = this.f2407a.k0(id);
        }
        if (fragmentK0 == null) {
            fragmentK0 = this.f2407a.x0().a(context.getClassLoader(), attributeValue);
            fragmentK0.mFromLayout = true;
            fragmentK0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentK0.mContainerId = id;
            fragmentK0.mTag = string;
            fragmentK0.mInLayout = true;
            FragmentManager fragmentManager = this.f2407a;
            fragmentK0.mFragmentManager = fragmentManager;
            fragmentK0.mHost = fragmentManager.z0();
            fragmentK0.onInflate(this.f2407a.z0().f(), attributeSet, fragmentK0.mSavedFragmentState);
            hVarX = this.f2407a.j(fragmentK0);
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentK0);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentK0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentK0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f2407a;
            fragmentK0.mFragmentManager = fragmentManager2;
            fragmentK0.mHost = fragmentManager2.z0();
            fragmentK0.onInflate(this.f2407a.z0().f(), attributeSet, fragmentK0.mSavedFragmentState);
            hVarX = this.f2407a.x(fragmentK0);
            if (FragmentManager.M0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragmentK0);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.onFragmentTagUsage(fragmentK0, viewGroup);
        fragmentK0.mContainer = viewGroup;
        hVarX.m();
        hVarX.j();
        View view2 = fragmentK0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentK0.mView.getTag() == null) {
            fragmentK0.mView.setTag(string);
        }
        fragmentK0.mView.addOnAttachStateChangeListener(new a(hVarX));
        return fragmentK0.mView;
    }
}
