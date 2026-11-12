package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/FragmentWrapper;", "", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "Landroidx/fragment/app/Fragment;", "<set-?>", "a", "Landroidx/fragment/app/Fragment;", "getSupportFragment", "()Landroidx/fragment/app/Fragment;", "supportFragment", "Landroid/app/Fragment;", "b", "Landroid/app/Fragment;", "getNativeFragment", "()Landroid/app/Fragment;", "nativeFragment", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "(Landroid/app/Fragment;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FragmentWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Fragment supportFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private android.app.Fragment nativeFragment;

    public FragmentWrapper(@NotNull Fragment fragment) {
        this.supportFragment = fragment;
    }

    @Nullable
    public final Activity getActivity() {
        Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        }
        android.app.Fragment fragment2 = this.nativeFragment;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        return null;
    }

    @Nullable
    public final android.app.Fragment getNativeFragment() {
        return this.nativeFragment;
    }

    @Nullable
    public final Fragment getSupportFragment() {
        return this.supportFragment;
    }

    public final void startActivityForResult(@Nullable Intent intent, int requestCode) {
        Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment != null) {
                fragment.startActivityForResult(intent, requestCode);
            }
        } else {
            android.app.Fragment fragment2 = this.nativeFragment;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, requestCode);
            }
        }
    }

    public FragmentWrapper(@NotNull android.app.Fragment fragment) {
        this.nativeFragment = fragment;
    }
}
