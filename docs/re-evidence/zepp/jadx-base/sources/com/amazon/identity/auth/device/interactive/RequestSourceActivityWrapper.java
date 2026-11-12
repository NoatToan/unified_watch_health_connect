package com.amazon.identity.auth.device.interactive;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import com.amazon.identity.auth.device.api.InvalidIntegrationException;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestSourceActivityWrapper implements RequestSource {
    private static final String LOG_TAG = "com.amazon.identity.auth.device.interactive.RequestSourceActivityWrapper";
    private static final String SDK_FRAGMENT_CLASS_NAME = "android.app.Fragment";
    private final WeakReference<Activity> activityReference;

    public RequestSourceActivityWrapper(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("activity must be non-null");
        }
        this.activityReference = new WeakReference<>(activity);
    }

    private boolean assertFragmentsPresent() {
        try {
            return Class.forName(SDK_FRAGMENT_CLASS_NAME, false, RequestSourceActivityWrapper.class.getClassLoader()) != null;
        } catch (ClassNotFoundException e) {
            throw new InvalidIntegrationException("android.app.Fragment not found. To make a request from an activity, use minSdkVersion of at least 11, or use FragmentActivity from Android Support Library v4", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestSourceActivityWrapper.class != obj.getClass()) {
            return false;
        }
        RequestSourceActivityWrapper requestSourceActivityWrapper = (RequestSourceActivityWrapper) obj;
        WeakReference<Activity> weakReference = this.activityReference;
        if (weakReference == null) {
            if (requestSourceActivityWrapper.activityReference != null) {
                return false;
            }
        } else {
            if (requestSourceActivityWrapper.activityReference == null) {
                return false;
            }
            if (weakReference.get() == null) {
                if (requestSourceActivityWrapper.activityReference.get() != null) {
                    return false;
                }
            } else if (!this.activityReference.get().equals(requestSourceActivityWrapper.activityReference.get())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public Object getBackingObject() {
        return this.activityReference.get();
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public Context getContext() {
        return this.activityReference.get();
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    @SuppressLint({"NewApi"})
    public InteractiveState getInteractiveState() {
        Activity activity = this.activityReference.get();
        if (activity == null) {
            MAPLog.e(LOG_TAG, "Failed to get InteractiveState on a garbage-collected Activity");
            return null;
        }
        assertFragmentsPresent();
        FragmentManager fragmentManager = activity.getFragmentManager();
        try {
            String str = InteractiveStateFragment.TAG_ID;
            InteractiveStateFragment interactiveStateFragment = (InteractiveStateFragment) fragmentManager.findFragmentByTag(str);
            InteractiveStateFragment interactiveStateFragment2 = interactiveStateFragment;
            if (interactiveStateFragment == null) {
                WorkflowFragment workflowFragment = new WorkflowFragment();
                fragmentManager.beginTransaction().add(workflowFragment, str).commit();
                interactiveStateFragment2 = workflowFragment;
            }
            return interactiveStateFragment2.getState();
        } catch (ClassCastException e) {
            MAPLog.e(LOG_TAG, "Found an invalid fragment looking for fragment with tag " + InteractiveStateFragment.TAG_ID + ". Please use a different fragment tag.", e);
            return null;
        }
    }

    public int hashCode() {
        WeakReference<Activity> weakReference = this.activityReference;
        return 31 + ((weakReference == null || weakReference.get() == null) ? 0 : this.activityReference.get().hashCode());
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public boolean isHookNeededOnUIResume() {
        return true;
    }

    @Override // com.amazon.identity.auth.device.interactive.RequestSource
    public void onStartRequest(InteractiveRequestRecord interactiveRequestRecord) {
        InteractiveState interactiveState = getInteractiveState();
        if (interactiveState != null) {
            interactiveState.onRequestStart(interactiveRequestRecord);
        }
    }
}
