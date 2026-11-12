package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.k;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;

    @Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;

    @Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;

    @Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;

    public interface a {
        void a(boolean z);
    }

    @Deprecated
    public interface b {
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract CharSequence e();

        public abstract void f();

        public abstract c g(CharSequence charSequence);
    }

    @Deprecated
    public interface d {
        void a(c cVar, k kVar);

        void b(c cVar, k kVar);

        void c(c cVar, k kVar);
    }

    public abstract void addOnMenuVisibilityListener(a aVar);

    @Deprecated
    public abstract void addTab(c cVar);

    @Deprecated
    public abstract void addTab(c cVar, int i);

    @Deprecated
    public abstract void addTab(c cVar, int i, boolean z);

    @Deprecated
    public abstract void addTab(c cVar, boolean z);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean closeOptionsMenu() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean collapseActionView() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
        return 0.0f;
    }

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    @Deprecated
    public abstract int getNavigationItemCount();

    @Deprecated
    public abstract int getNavigationMode();

    @Deprecated
    public abstract int getSelectedNavigationIndex();

    @Deprecated
    public abstract c getSelectedTab();

    public abstract CharSequence getSubtitle();

    @Deprecated
    public abstract c getTabAt(int i);

    @Deprecated
    public abstract int getTabCount();

    public Context getThemedContext() {
        return null;
    }

    public abstract CharSequence getTitle();

    public abstract void hide();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        return false;
    }

    @Deprecated
    public abstract c newTab();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onConfigurationChanged(Configuration configuration) {
    }

    void onDestroy() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean openOptionsMenu() {
        return false;
    }

    @Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(a aVar);

    @Deprecated
    public abstract void removeTab(c cVar);

    @Deprecated
    public abstract void removeTabAt(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean requestFocus() {
        return false;
    }

    @Deprecated
    public abstract void selectTab(c cVar);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, LayoutParams layoutParams);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayOptions(int i, int i2);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public abstract void setDisplayUseLogoEnabled(boolean z);

    public void setElevation(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void setHideOffset(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void setHomeActionContentDescription(int i) {
    }

    public void setHomeAsUpIndicator(int i) {
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    @Deprecated
    public abstract void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, b bVar);

    public abstract void setLogo(int i);

    public abstract void setLogo(Drawable drawable);

    @Deprecated
    public abstract void setNavigationMode(int i);

    @Deprecated
    public abstract void setSelectedNavigationItem(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charSequence);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setWindowTitle(CharSequence charSequence) {
    }

    public abstract void show();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public void setHomeActionContentDescription(CharSequence charSequence) {
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1402a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1402a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5j.t);
            this.f1402a = typedArrayObtainStyledAttributes.getInt(z5j.u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1402a = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f1402a = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f1402a = 0;
            this.f1402a = layoutParams.f1402a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1402a = 0;
        }
    }
}
