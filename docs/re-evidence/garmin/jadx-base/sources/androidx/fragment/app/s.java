package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes.dex */
public class s implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f7361a;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f7362a;

        public a(d0 d0Var) {
            this.f7362a = d0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            d0 d0Var = this.f7362a;
            Fragment fragment = d0Var.f7166c;
            d0Var.i();
            q0.i((ViewGroup) fragment.mView.getParent(), s.this.f7361a).h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    public s(v vVar) {
        this.f7361a = vVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view2, String str, Context context, AttributeSet attributeSet) {
        d0 d0VarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        v vVar = this.f7361a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, vVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f63439a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null && q.isFragmentClass(context.getClassLoader(), attributeValue)) {
                int id3 = view2 != null ? view2.getId() : 0;
                if (id3 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentF = resourceId != -1 ? vVar.F(resourceId) : null;
                if (fragmentF == null && string != null) {
                    fragmentF = vVar.G(string);
                }
                if (fragmentF == null && id3 != -1) {
                    fragmentF = vVar.F(id3);
                }
                if (fragmentF == null) {
                    fragmentF = vVar.P().instantiate(context.getClassLoader(), attributeValue);
                    fragmentF.mFromLayout = true;
                    fragmentF.mFragmentId = resourceId != 0 ? resourceId : id3;
                    fragmentF.mContainerId = id3;
                    fragmentF.mTag = string;
                    fragmentF.mInLayout = true;
                    fragmentF.mFragmentManager = vVar;
                    r<?> rVar = vVar.f7393x;
                    fragmentF.mHost = rVar;
                    fragmentF.onInflate(rVar.f7358b, attributeSet, fragmentF.mSavedFragmentState);
                    d0VarH = vVar.a(fragmentF);
                    if (v.R(2)) {
                        fragmentF.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (fragmentF.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id3) + " with another fragment for " + attributeValue);
                    }
                    fragmentF.mInLayout = true;
                    fragmentF.mFragmentManager = vVar;
                    r<?> rVar2 = vVar.f7393x;
                    fragmentF.mHost = rVar2;
                    fragmentF.onInflate(rVar2.f7358b, attributeSet, fragmentF.mSavedFragmentState);
                    d0VarH = vVar.h(fragmentF);
                    if (v.R(2)) {
                        fragmentF.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                f8.a aVar = f8.a.f69927a;
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragmentF, viewGroup);
                f8.a.f69927a.getClass();
                f8.a.c(fragmentTagUsageViolation);
                f8.a.c cVarA = f8.a.a(fragmentF);
                if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_FRAGMENT_TAG_USAGE) && f8.a.e(cVarA, fragmentF.getClass(), FragmentTagUsageViolation.class)) {
                    f8.a.b(cVarA, fragmentTagUsageViolation);
                }
                fragmentF.mContainer = viewGroup;
                d0VarH.i();
                d0VarH.h();
                View view3 = fragmentF.mView;
                if (view3 == null) {
                    vb.h.z(am.j.m("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
                if (resourceId != 0) {
                    view3.setId(resourceId);
                }
                if (fragmentF.mView.getTag() == null) {
                    fragmentF.mView.setTag(string);
                }
                fragmentF.mView.addOnAttachStateChangeListener(new a(d0VarH));
                return fragmentF.mView;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
