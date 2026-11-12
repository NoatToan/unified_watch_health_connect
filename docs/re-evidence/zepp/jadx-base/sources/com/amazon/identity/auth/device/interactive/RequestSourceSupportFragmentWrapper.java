package com.amazon.identity.auth.device.interactive;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestSourceSupportFragmentWrapper implements RequestSource {
    private static final String LOG_TAG = "com.amazon.identity.auth.device.interactive.RequestSourceSupportFragmentWrapper";
    private final WeakReference<Fragment> fragmentReference;

    public RequestSourceSupportFragmentWrapper(Fragment fragment) {
        if (fragment == null) {
            throw new IllegalArgumentException("fragment must be non-null");
        }
        this.fragmentReference = new WeakReference<>(fragment);
    }

    private InteractiveState getInteractiveStateAddingRequest(InteractiveRequestRecord interactiveRequestRecord) {
        WorkflowSupportFragment workflowSupportFragment;
        Fragment fragment = this.fragmentReference.get();
        if (fragment == null) {
            MAPLog.e(LOG_TAG, "Failed to get InteractiveState on a garbage-collected Fragment");
            return null;
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        try {
            String str = InteractiveStateFragment.TAG_ID;
            InteractiveStateFragment interactiveStateFragment = (InteractiveStateFragment) fragmentManager.findFragmentByTag(str);
            InteractiveStateFragment interactiveStateFragment2 = interactiveStateFragment;
            if (interactiveStateFragment == null) {
                workflowSupportFragment = new WorkflowSupportFragment();
                fragmentManager.beginTransaction().add(workflowSupportFragment, str).commit();
            }
            if (interactiveRequestRecord != null) {
                interactiveStateFragment2 = workflowSupportFragment;
                Bundle bundle = new Bundle();
                fragmentManager.putFragment(bundle, InteractiveState.FRAGMENT_WRAPPER_KEY, fragment);
                interactiveRequestRecord.setFragmentWrapper(bundle);
                interactiveStateFragment2.getState().onRequestStart(interactiveRequestRecord);
            }
            interactiveStateFragment2 = workflowSupportFragment;
            return interactiveStateFragment2.getState();
        } catch (ClassCastException e) {
            MAPLog.e(LOG_TAG, "Found an invalid fragment looking for fragment with tag " + InteractiveStateFragment.TAG_ID + ". Please use a different fragment tag.", e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestSourceSupportFragmentWrapper.class != obj.getClass()) {
            return false;
        }
        RequestSourceSupportFragmentWrapper requestSourceSupportFragmentWrapper = (RequestSourceSupportFragmentWrapper) obj;
        WeakReference<Fragment> weakReference = this.fragmentReference;
        if (weakReference == null) {
            if (requestSourceSupportFragmentWrapper.fragmentReference != null) {
                return false;
            }
        } else {
            if (requestSourceSupportFragmentWrapper.fragmentReference == null) {
                return false;
            }
            if (weakReference.get() == null) {
                if (requestSourceSupportFragmentWrapper.fragmentReference.get() != null) {
                    return false;
                }
            } else if (!this.fragmentReference.get().equals(requestSourceSupportFragmentWrapper.fragmentReference.get())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public Object getBackingObject() {
        return this.fragmentReference.get();
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public Context getContext() {
        return this.fragmentReference.get().getActivity();
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public InteractiveState getInteractiveState() {
        return getInteractiveStateAddingRequest(null);
    }

    public int hashCode() {
        WeakReference<Fragment> weakReference = this.fragmentReference;
        return 31 + ((weakReference == null || weakReference.get() == null) ? 0 : this.fragmentReference.get().hashCode());
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public boolean isHookNeededOnUIResume() {
        return true;
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public void onStartRequest(InteractiveRequestRecord interactiveRequestRecord) {
        getInteractiveStateAddingRequest(interactiveRequestRecord);
    }
}
