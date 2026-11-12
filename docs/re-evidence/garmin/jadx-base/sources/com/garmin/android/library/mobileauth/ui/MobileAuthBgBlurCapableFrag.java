package com.garmin.android.library.mobileauth.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.l;
import o13.m;
import o13.r;
import o53.b0;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import re2.g0;
import re2.l0;
import v13.i;
import vb.h;
import vg1.z0;
import xa1.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H ¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\r\u001a\u00020\nH @¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000eH ¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0000@BX\u0080.¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020.8\u0000@BX\u0080.¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/MobileAuthBgBlurCapableFrag;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "useBackgroundImage$mobile_auth_release", "()Z", "useBackgroundImage", "shouldBlurBackgroundImage$mobile_auth_release", "shouldBlurBackgroundImage", "", "constructToolbarTitle$mobile_auth_release", "(Lt13/d;)Ljava/lang/Object;", "constructToolbarTitle", "", "onToolbarBackPressed$mobile_auth_release", "onToolbarBackPressed", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "title", "updateToolbarTitle", "(Ljava/lang/String;)V", "Lorg/slf4j/Logger;", "logger$delegate", "Lo13/l;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "Landroid/widget/TextView;", "toolbarTitleTextView", "Landroid/widget/TextView;", "Lcom/garmin/android/library/mobileauth/ui/b;", "value", "fragListener", "Lcom/garmin/android/library/mobileauth/ui/b;", "getFragListener$mobile_auth_release", "()Lcom/garmin/android/library/mobileauth/ui/b;", "Lve2/l;", "mobileAuthConfig", "Lve2/l;", "getMobileAuthConfig$mobile_auth_release", "()Lve2/l;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MobileAuthBgBlurCapableFrag extends Fragment {
    public static final int $stable = 8;
    private b fragListener;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final l logger = m.b(new j(27));
    private ve2.l mobileAuthConfig;
    private TextView toolbarTitleTextView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag$onViewCreated$1$1", f = "MobileAuthBgBlurCapableFrag.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50404a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MobileAuthBgBlurCapableFrag.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50404a;
            MobileAuthBgBlurCapableFrag mobileAuthBgBlurCapableFrag = MobileAuthBgBlurCapableFrag.this;
            if (i14 == 0) {
                r.b(obj);
                this.f50404a = 1;
                obj = mobileAuthBgBlurCapableFrag.constructToolbarTitle$mobile_auth_release(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            CharSequence charSequence = (CharSequence) obj;
            TextView textView = mobileAuthBgBlurCapableFrag.toolbarTitleTextView;
            if (textView != null) {
                textView.setText(charSequence);
                return Unit.INSTANCE;
            }
            s.m("toolbarTitleTextView");
            throw null;
        }
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger logger_delegate$lambda$0() {
        l0.f152316a.getClass();
        return l0.c("BgBlurCapableFrag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateToolbarTitle$lambda$5(MobileAuthBgBlurCapableFrag mobileAuthBgBlurCapableFrag, String str) {
        try {
            TextView textView = mobileAuthBgBlurCapableFrag.toolbarTitleTextView;
            if (textView != null) {
                textView.setText(str);
                return Unit.INSTANCE;
            }
            s.m("toolbarTitleTextView");
            throw null;
        } catch (Exception unused) {
        }
    }

    public abstract Object constructToolbarTitle$mobile_auth_release(t13.d<? super CharSequence> dVar);

    public final b getFragListener$mobile_auth_release() {
        b bVar = this.fragListener;
        if (bVar != null) {
            return bVar;
        }
        s.m("fragListener");
        throw null;
    }

    public final ve2.l getMobileAuthConfig$mobile_auth_release() {
        ve2.l lVar = this.mobileAuthConfig;
        if (lVar != null) {
            return lVar;
        }
        s.m("mobileAuthConfig");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a7.e activity = getActivity();
        activity.getClass();
        this.fragListener = (b) activity;
        re2.b.f152215a.getClass();
        this.mobileAuthConfig = re2.b.m();
    }

    public abstract void onToolbarBackPressed$mobile_auth_release();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle savedInstanceState) {
        view2.getClass();
        super.onViewCreated(view2, savedInstanceState);
        Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
        this.toolbarTitleTextView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new a(null), 3);
        boolean z14 = this instanceof xe2.r;
        if (!z14) {
            Drawable drawable = a7.b.getDrawable(toolbar.getContext(), R.drawable.ic_back);
            drawable.getClass();
            drawable.setTint(a7.b.getColor(toolbar.getContext(), R.color.ssoTouText));
            toolbar.setNavigationIcon(R.drawable.ic_back);
            toolbar.setNavigationContentDescription(R.string.lbl_navigate_up);
            toolbar.setNavigationOnClickListener(new z0(this, 20));
        }
        if (useBackgroundImage$mobile_auth_release()) {
            re2.b.f152215a.getClass();
            ve2.l lVarM = re2.b.m();
            TypedArray typedArray = lVarM.f177768i;
            if (typedArray == null) {
                s.m("backgroundImageResIds");
                throw null;
            }
            if (typedArray.length() <= 0) {
                getLogger().warn("useBackgroundImage is TRUE, but app's mobile_auth_config.xml does not define 'ssoBackgroundImageResIds'.");
                return;
            }
            int f50494n = z14 ? 0 : getFragListener$mobile_auth_release().getF50348q();
            if (f50494n != -1) {
                ImageView imageView = (ImageView) view2.findViewById(R.id.background_image);
                imageView.setVisibility(0);
                TypedArray typedArray2 = lVarM.f177768i;
                if (typedArray2 == null) {
                    s.m("backgroundImageResIds");
                    throw null;
                }
                imageView.setImageDrawable(a7.b.getDrawable(requireContext(), typedArray2.getResourceId(f50494n, 0)));
                if (shouldBlurBackgroundImage$mobile_auth_release()) {
                    View viewFindViewById = view2.findViewById(R.id.overlay);
                    viewFindViewById.setBackgroundColor(lVarM.f177784y);
                    viewFindViewById.setVisibility(0);
                }
            }
        }
    }

    public abstract boolean shouldBlurBackgroundImage$mobile_auth_release();

    public final void updateToolbarTitle(String title) {
        title.getClass();
        g0.c(new wz1.c(21, this, title), this);
    }

    public abstract boolean useBackgroundImage$mobile_auth_release();
}
