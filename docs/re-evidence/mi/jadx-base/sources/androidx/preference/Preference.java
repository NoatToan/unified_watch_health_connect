package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RestrictTo;
import defpackage.e0j;
import defpackage.g7i;
import defpackage.kui;
import defpackage.m80;
import defpackage.mii;
import defpackage.o6i;
import defpackage.of1;
import defpackage.p3j;
import defpackage.p5q;
import defpackage.vpi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private static final String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;
    private final Context mContext;
    private boolean mCopyingEnabled;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet;
    private List<Preference> mDependents;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId;
    private b mListener;
    private c mOnChangeListener;
    private d mOnClickListener;
    private e mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private o6i mPreferenceDataStore;
    private androidx.preference.b mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private f mSummaryProvider;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.performClick(view);
        }
    }

    public interface b {
        void a(Preference preference);

        void c(Preference preference);

        void h(Preference preference);
    }

    public interface c {
        boolean a(Preference preference, Object obj);
    }

    public interface d {
        boolean a(Preference preference);
    }

    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Preference f2723a;

        public e(Preference preference) {
            this.f2723a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence summary = this.f2723a.getSummary();
            if (!this.f2723a.isCopyingEnabled() || TextUtils.isEmpty(summary)) {
                return;
            }
            contextMenu.setHeaderTitle(summary);
            contextMenu.add(0, 0, 0, e0j.f16128a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f2723a.getContext().getSystemService("clipboard");
            CharSequence summary = this.f2723a.getSummary();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.CLIPBOARD_ID, summary));
            Toast.makeText(this.f2723a.getContext(), this.f2723a.getContext().getString(e0j.d, summary), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrder = Integer.MAX_VALUE;
        this.mViewId = 0;
        this.mEnabled = true;
        this.mSelectable = true;
        this.mPersistent = true;
        this.mDependencyMet = true;
        this.mParentDependencyMet = true;
        this.mVisible = true;
        this.mAllowDividerAbove = true;
        this.mAllowDividerBelow = true;
        this.mSingleLineTitle = true;
        this.mShouldDisableView = true;
        this.mLayoutResId = kui.f24308b;
        this.mClickListener = new a();
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.J, i, i2);
        this.mIconResId = p5q.n(typedArrayObtainStyledAttributes, p3j.h0, p3j.K, 0);
        this.mKey = p5q.o(typedArrayObtainStyledAttributes, p3j.k0, p3j.Q);
        this.mTitle = p5q.p(typedArrayObtainStyledAttributes, p3j.s0, p3j.O);
        this.mSummary = p5q.p(typedArrayObtainStyledAttributes, p3j.r0, p3j.R);
        this.mOrder = p5q.d(typedArrayObtainStyledAttributes, p3j.m0, p3j.S, Integer.MAX_VALUE);
        this.mFragment = p5q.o(typedArrayObtainStyledAttributes, p3j.g0, p3j.X);
        this.mLayoutResId = p5q.n(typedArrayObtainStyledAttributes, p3j.l0, p3j.N, kui.f24308b);
        this.mWidgetLayoutResId = p5q.n(typedArrayObtainStyledAttributes, p3j.t0, p3j.T, 0);
        this.mEnabled = p5q.b(typedArrayObtainStyledAttributes, p3j.f0, p3j.M, true);
        this.mSelectable = p5q.b(typedArrayObtainStyledAttributes, p3j.o0, p3j.P, true);
        this.mPersistent = p5q.b(typedArrayObtainStyledAttributes, p3j.n0, p3j.L, true);
        this.mDependencyKey = p5q.o(typedArrayObtainStyledAttributes, p3j.d0, p3j.U);
        int i3 = p3j.a0;
        this.mAllowDividerAbove = p5q.b(typedArrayObtainStyledAttributes, i3, i3, this.mSelectable);
        int i4 = p3j.b0;
        this.mAllowDividerBelow = p5q.b(typedArrayObtainStyledAttributes, i4, i4, this.mSelectable);
        if (typedArrayObtainStyledAttributes.hasValue(p3j.c0)) {
            this.mDefaultValue = onGetDefaultValue(typedArrayObtainStyledAttributes, p3j.c0);
        } else if (typedArrayObtainStyledAttributes.hasValue(p3j.V)) {
            this.mDefaultValue = onGetDefaultValue(typedArrayObtainStyledAttributes, p3j.V);
        }
        this.mShouldDisableView = p5q.b(typedArrayObtainStyledAttributes, p3j.p0, p3j.W, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(p3j.q0);
        this.mHasSingleLineTitleAttr = zHasValue;
        if (zHasValue) {
            this.mSingleLineTitle = p5q.b(typedArrayObtainStyledAttributes, p3j.q0, p3j.Y, true);
        }
        this.mIconSpaceReserved = p5q.b(typedArrayObtainStyledAttributes, p3j.i0, p3j.Z, false);
        int i5 = p3j.j0;
        this.mVisible = p5q.b(typedArrayObtainStyledAttributes, i5, i5, true);
        int i6 = p3j.e0;
        this.mCopyingEnabled = p5q.b(typedArrayObtainStyledAttributes, i6, i6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void dispatchSetInitialValue() {
        getPreferenceDataStore();
        if (shouldPersist() && getSharedPreferences().contains(this.mKey)) {
            onSetInitialValue(true, null);
            return;
        }
        Object obj = this.mDefaultValue;
        if (obj != null) {
            onSetInitialValue(false, obj);
        }
    }

    private void registerDependency() {
        if (TextUtils.isEmpty(this.mDependencyKey)) {
            return;
        }
        Preference preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(this.mDependencyKey);
        if (preferenceFindPreferenceInHierarchy != null) {
            preferenceFindPreferenceInHierarchy.registerDependent(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.mDependencyKey + "\" not found for preference \"" + this.mKey + "\" (title: \"" + ((Object) this.mTitle) + "\"");
    }

    private void registerDependent(Preference preference) {
        if (this.mDependents == null) {
            this.mDependents = new ArrayList();
        }
        this.mDependents.add(preference);
        preference.onDependencyChanged(this, shouldDisableDependents());
    }

    private void setEnabledStateOnViews(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                setEnabledStateOnViews(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    private void tryCommit(SharedPreferences.Editor editor) {
        if (this.mPreferenceManager.o()) {
            editor.apply();
        }
    }

    private void unregisterDependency() {
        Preference preferenceFindPreferenceInHierarchy;
        String str = this.mDependencyKey;
        if (str == null || (preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(str)) == null) {
            return;
        }
        preferenceFindPreferenceInHierarchy.unregisterDependent(this);
    }

    private void unregisterDependent(Preference preference) {
        List<Preference> list = this.mDependents;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void assignParent(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.mParentGroup != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.mParentGroup = preferenceGroup;
    }

    public boolean callChangeListener(Object obj) {
        c cVar = this.mOnChangeListener;
        return cVar == null || cVar.a(this, obj);
    }

    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    public void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        if (!hasKey() || (parcelable = bundle.getParcelable(this.mKey)) == null) {
            return;
        }
        this.mBaseMethodCalled = false;
        onRestoreInstanceState(parcelable);
        if (!this.mBaseMethodCalled) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
        if (hasKey()) {
            this.mBaseMethodCalled = false;
            Parcelable parcelableOnSaveInstanceState = onSaveInstanceState();
            if (!this.mBaseMethodCalled) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableOnSaveInstanceState != null) {
                bundle.putParcelable(this.mKey, parcelableOnSaveInstanceState);
            }
        }
    }

    public <T extends Preference> T findPreferenceInHierarchy(String str) {
        androidx.preference.b bVar = this.mPreferenceManager;
        if (bVar == null) {
            return null;
        }
        return (T) bVar.a(str);
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDependency() {
        return this.mDependencyKey;
    }

    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }

    public StringBuilder getFilterableStringBuilder() {
        StringBuilder sb = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb.append(title);
            sb.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb.append(summary);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String getFragment() {
        return this.mFragment;
    }

    public Drawable getIcon() {
        int i;
        if (this.mIcon == null && (i = this.mIconResId) != 0) {
            this.mIcon = of1.b(this.mContext, i);
        }
        return this.mIcon;
    }

    public long getId() {
        return this.mId;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getKey() {
        return this.mKey;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    public c getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    public d getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    public boolean getPersistedBoolean(boolean z) {
        if (!shouldPersist()) {
            return z;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j().getBoolean(this.mKey, z);
    }

    public float getPersistedFloat(float f2) {
        if (!shouldPersist()) {
            return f2;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j().getFloat(this.mKey, f2);
    }

    public int getPersistedInt(int i) {
        if (!shouldPersist()) {
            return i;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j().getInt(this.mKey, i);
    }

    public long getPersistedLong(long j) {
        if (!shouldPersist()) {
            return j;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j().getLong(this.mKey, j);
    }

    public String getPersistedString(String str) {
        if (!shouldPersist()) {
            return str;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j().getString(this.mKey, str);
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return set;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j().getStringSet(this.mKey, set);
    }

    public o6i getPreferenceDataStore() {
        androidx.preference.b bVar = this.mPreferenceManager;
        if (bVar != null) {
            bVar.h();
        }
        return null;
    }

    public androidx.preference.b getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager == null) {
            return null;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.j();
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    public CharSequence getSummary() {
        return getSummaryProvider() != null ? getSummaryProvider().a(this) : this.mSummary;
    }

    public final f getSummaryProvider() {
        return this.mSummaryProvider;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.mKey);
    }

    public boolean isCopyingEnabled() {
        return this.mCopyingEnabled;
    }

    public boolean isEnabled() {
        return this.mEnabled && this.mDependencyMet && this.mParentDependencyMet;
    }

    public boolean isIconSpaceReserved() {
        return this.mIconSpaceReserved;
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().i()) {
            return true;
        }
        PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    public boolean isSingleLineTitle() {
        return this.mSingleLineTitle;
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    public void notifyChanged() {
        b bVar = this.mListener;
        if (bVar != null) {
            bVar.c(this);
        }
    }

    public void notifyDependencyChange(boolean z) {
        List<Preference> list = this.mDependents;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onDependencyChanged(this, z);
        }
    }

    public void notifyHierarchyChanged() {
        b bVar = this.mListener;
        if (bVar != null) {
            bVar.h(this);
        }
    }

    public void onAttached() {
        registerDependency();
    }

    public void onAttachedToHierarchy(androidx.preference.b bVar) {
        this.mPreferenceManager = bVar;
        if (!this.mHasId) {
            this.mId = bVar.d();
        }
        dispatchSetInitialValue();
    }

    public void onBindViewHolder(g7i g7iVar) {
        Integer numValueOf;
        View view = g7iVar.itemView;
        view.setOnClickListener(this.mClickListener);
        view.setId(this.mViewId);
        TextView textView = (TextView) g7iVar.a(R.id.summary);
        if (textView != null) {
            CharSequence summary = getSummary();
            if (TextUtils.isEmpty(summary)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(summary);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) g7iVar.a(R.id.title);
        if (textView2 != null) {
            CharSequence title = getTitle();
            if (TextUtils.isEmpty(title)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(title);
                textView2.setVisibility(0);
                if (this.mHasSingleLineTitleAttr) {
                    textView2.setSingleLine(this.mSingleLineTitle);
                }
                if (!isSelectable() && isEnabled() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) g7iVar.a(R.id.icon);
        if (imageView != null) {
            int i = this.mIconResId;
            if (i != 0 || this.mIcon != null) {
                if (this.mIcon == null) {
                    this.mIcon = of1.b(this.mContext, i);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.mIcon != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        View viewA = g7iVar.a(vpi.f37111a);
        if (viewA == null) {
            viewA = g7iVar.a(R.id.icon_frame);
        }
        if (viewA != null) {
            if (this.mIcon != null) {
                viewA.setVisibility(0);
            } else {
                viewA.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        if (this.mShouldDisableView) {
            setEnabledStateOnViews(view, isEnabled());
        } else {
            setEnabledStateOnViews(view, true);
        }
        boolean zIsSelectable = isSelectable();
        view.setFocusable(zIsSelectable);
        view.setClickable(zIsSelectable);
        g7iVar.e(this.mAllowDividerAbove);
        g7iVar.f(this.mAllowDividerBelow);
        boolean zIsCopyingEnabled = isCopyingEnabled();
        if (zIsCopyingEnabled && this.mOnCopyListener == null) {
            this.mOnCopyListener = new e(this);
        }
        view.setOnCreateContextMenuListener(zIsCopyingEnabled ? this.mOnCopyListener : null);
        view.setLongClickable(zIsCopyingEnabled);
        if (!zIsCopyingEnabled || zIsSelectable) {
            return;
        }
        androidx.core.view.c.v0(view, null);
    }

    public void onClick() {
    }

    public void onDependencyChanged(Preference preference, boolean z) {
        if (this.mDependencyMet == z) {
            this.mDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onDetached() {
        unregisterDependency();
        this.mWasDetached = true;
    }

    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    public void onInitializeAccessibilityNodeInfo(m80 m80Var) {
    }

    public void onParentChanged(Preference preference, boolean z) {
        if (this.mParentDependencyMet == z) {
            this.mParentDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onPrepareForRemoval() {
        unregisterDependency();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void onSetInitialValue(Object obj) {
    }

    public Bundle peekExtras() {
        return this.mExtras;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick(View view) {
        performClick();
    }

    public boolean persistBoolean(boolean z) {
        if (!shouldPersist()) {
            return false;
        }
        if (z == getPersistedBoolean(!z)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor editorC = this.mPreferenceManager.c();
        editorC.putBoolean(this.mKey, z);
        tryCommit(editorC);
        return true;
    }

    public boolean persistFloat(float f2) {
        if (!shouldPersist()) {
            return false;
        }
        if (f2 == getPersistedFloat(Float.NaN)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor editorC = this.mPreferenceManager.c();
        editorC.putFloat(this.mKey, f2);
        tryCommit(editorC);
        return true;
    }

    public boolean persistInt(int i) {
        if (!shouldPersist()) {
            return false;
        }
        if (i == getPersistedInt(~i)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor editorC = this.mPreferenceManager.c();
        editorC.putInt(this.mKey, i);
        tryCommit(editorC);
        return true;
    }

    public boolean persistLong(long j) {
        if (!shouldPersist()) {
            return false;
        }
        if (j == getPersistedLong(~j)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor editorC = this.mPreferenceManager.c();
        editorC.putLong(this.mKey, j);
        tryCommit(editorC);
        return true;
    }

    public boolean persistString(String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor editorC = this.mPreferenceManager.c();
        editorC.putString(this.mKey, str);
        tryCommit(editorC);
        return true;
    }

    public boolean persistStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor editorC = this.mPreferenceManager.c();
        editorC.putStringSet(this.mKey, set);
        tryCommit(editorC);
        return true;
    }

    public void requireKey() {
        if (TextUtils.isEmpty(this.mKey)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.mRequiresKey = true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCopyingEnabled(boolean z) {
        if (this.mCopyingEnabled != z) {
            this.mCopyingEnabled = z;
            notifyChanged();
        }
    }

    public void setDefaultValue(Object obj) {
        this.mDefaultValue = obj;
    }

    public void setDependency(String str) {
        unregisterDependency();
        this.mDependencyKey = str;
        registerDependency();
    }

    public void setEnabled(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void setFragment(String str) {
        this.mFragment = str;
    }

    public void setIcon(Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIconResId = 0;
            notifyChanged();
        }
    }

    public void setIconSpaceReserved(boolean z) {
        if (this.mIconSpaceReserved != z) {
            this.mIconSpaceReserved = z;
            notifyChanged();
        }
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }

    public void setKey(String str) {
        this.mKey = str;
        if (!this.mRequiresKey || hasKey()) {
            return;
        }
        requireKey();
    }

    public void setLayoutResource(int i) {
        this.mLayoutResId = i;
    }

    public final void setOnPreferenceChangeInternalListener(b bVar) {
        this.mListener = bVar;
    }

    public void setOnPreferenceChangeListener(c cVar) {
        this.mOnChangeListener = cVar;
    }

    public void setOnPreferenceClickListener(d dVar) {
        this.mOnClickListener = dVar;
    }

    public void setOrder(int i) {
        if (i != this.mOrder) {
            this.mOrder = i;
            notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean z) {
        this.mPersistent = z;
    }

    public void setPreferenceDataStore(o6i o6iVar) {
    }

    public void setSelectable(boolean z) {
        if (this.mSelectable != z) {
            this.mSelectable = z;
            notifyChanged();
        }
    }

    public void setShouldDisableView(boolean z) {
        if (this.mShouldDisableView != z) {
            this.mShouldDisableView = z;
            notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean z) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = z;
    }

    public void setSummary(CharSequence charSequence) {
        if (getSummaryProvider() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.mSummary, charSequence)) {
            return;
        }
        this.mSummary = charSequence;
        notifyChanged();
    }

    public final void setSummaryProvider(f fVar) {
        this.mSummaryProvider = fVar;
        notifyChanged();
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        notifyChanged();
    }

    public void setViewId(int i) {
        this.mViewId = i;
    }

    public final void setVisible(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(this);
            }
        }
    }

    public void setWidgetLayoutResource(int i) {
        this.mWidgetLayoutResId = i;
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    public boolean shouldPersist() {
        return this.mPreferenceManager != null && isPersistent() && hasKey();
    }

    public String toString() {
        return getFilterableStringBuilder().toString();
    }

    public final boolean wasDetached() {
        return this.mWasDetached;
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        int i = this.mOrder;
        int i2 = preference.mOrder;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.mTitle;
        CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    @Deprecated
    public void onSetInitialValue(boolean z, Object obj) {
        onSetInitialValue(obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick() {
        androidx.preference.b.c cVarF;
        if (isEnabled() && isSelectable()) {
            onClick();
            d dVar = this.mOnClickListener;
            if (dVar == null || !dVar.a(this)) {
                androidx.preference.b preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (cVarF = preferenceManager.f()) == null || !cVarF.onPreferenceTreeClick(this)) && this.mIntent != null) {
                    getContext().startActivity(this.mIntent);
                }
            }
        }
    }

    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onAttachedToHierarchy(androidx.preference.b bVar, long j) {
        this.mId = j;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(bVar);
        } finally {
            this.mHasId = false;
        }
    }

    public void setIcon(int i) {
        setIcon(of1.b(this.mContext, i));
        this.mIconResId = i;
    }

    public void setSummary(int i) {
        setSummary(this.mContext.getString(i));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, mii.i, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
