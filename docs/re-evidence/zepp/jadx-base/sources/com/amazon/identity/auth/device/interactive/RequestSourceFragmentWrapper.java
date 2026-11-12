package com.amazon.identity.auth.device.interactive;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public final class RequestSourceFragmentWrapper implements RequestSource {
    private static final String LOG_TAG = "com.amazon.identity.auth.device.interactive.RequestSourceFragmentWrapper";
    private final WeakReference<Fragment> fragmentReference;

    public RequestSourceFragmentWrapper(Fragment fragment) {
        if (fragment == null) {
            throw new IllegalArgumentException("fragment must be non-null");
        }
        this.fragmentReference = new WeakReference<>(fragment);
    }

    private InteractiveState getInteractiveStateAddingRequest(InteractiveRequestRecord interactiveRequestRecord) {
        WorkflowFragment workflowFragment;
        Fragment fragment = this.fragmentReference.get();
        if (fragment == null) {
            MAPLog.e(LOG_TAG, "Failed to get InteractiveState for a garbage-collected Fragment");
            return null;
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        try {
            String str = InteractiveStateFragment.TAG_ID;
            InteractiveStateFragment interactiveStateFragment = (InteractiveStateFragment) fragmentManager.findFragmentByTag(str);
            InteractiveStateFragment interactiveStateFragment2 = interactiveStateFragment;
            if (interactiveStateFragment == null) {
                workflowFragment = new WorkflowFragment();
                fragmentManager.beginTransaction().add(workflowFragment, str).commit();
            }
            if (interactiveRequestRecord != null) {
                interactiveStateFragment2 = workflowFragment;
                Bundle bundle = new Bundle();
                fragmentManager.putFragment(bundle, InteractiveState.FRAGMENT_WRAPPER_KEY, fragment);
                interactiveRequestRecord.setFragmentWrapper(bundle);
                interactiveStateFragment2.getState().onRequestStart(interactiveRequestRecord);
            }
            interactiveStateFragment2 = workflowFragment;
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
        if (obj == null || RequestSourceFragmentWrapper.class != obj.getClass()) {
            return false;
        }
        RequestSourceFragmentWrapper requestSourceFragmentWrapper = (RequestSourceFragmentWrapper) obj;
        WeakReference<Fragment> weakReference = this.fragmentReference;
        if (weakReference == null) {
            if (requestSourceFragmentWrapper.fragmentReference != null) {
                return false;
            }
        } else {
            if (requestSourceFragmentWrapper.fragmentReference == null) {
                return false;
            }
            if (weakReference.get() == null) {
                if (requestSourceFragmentWrapper.fragmentReference.get() != null) {
                    return false;
                }
            } else if (!this.fragmentReference.get().equals(requestSourceFragmentWrapper.fragmentReference.get())) {
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
