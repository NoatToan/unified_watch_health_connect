package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    private T a;

    @Nullable
    private Bundle b;
    private LinkedList<a> c;
    private final OnDelegateCreatedListener<T> d = new com.google.android.gms.dynamic.a(this);

    public interface a {
        void a(LifecycleDelegate lifecycleDelegate);

        int zaa();
    }

    @KeepForSdk
    public DeferredLifecycleHelper() {
    }

    public static /* synthetic */ Bundle a(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        deferredLifecycleHelper.b = null;
        return null;
    }

    private final void d(int i) {
        while (!this.c.isEmpty() && this.c.getLast().zaa() >= i) {
            this.c.removeLast();
        }
    }

    private final void e(@Nullable Bundle bundle, a aVar) {
        T t = this.a;
        if (t != null) {
            aVar.a(t);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.d);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@RecentlyNonNull FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String strZac = zac.zac(context, iIsGooglePlayServicesAvailable);
        String strZae = zac.zae(context, iIsGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strZac);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strZae);
            linearLayout.addView(button);
            button.setOnClickListener(new d(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    public abstract void createDelegate(@RecentlyNonNull OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @RecentlyNonNull
    @KeepForSdk
    public T getDelegate() {
        return this.a;
    }

    @KeepForSdk
    public void handleGooglePlayUnavailable(@RecentlyNonNull FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(@RecentlyNonNull Bundle bundle) {
        e(bundle, new b(this, bundle));
    }

    @RecentlyNonNull
    @KeepForSdk
    public View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, @RecentlyNonNull ViewGroup viewGroup, @RecentlyNonNull Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        e(bundle, new e(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t = this.a;
        if (t != null) {
            t.onDestroy();
        } else {
            d(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t = this.a;
        if (t != null) {
            t.onDestroyView();
        } else {
            d(2);
        }
    }

    @KeepForSdk
    public void onInflate(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2) {
        e(bundle2, new c(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        T t = this.a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t = this.a;
        if (t != null) {
            t.onPause();
        } else {
            d(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        e(null, new f(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        T t = this.a;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        e(null, new g(this));
    }

    @KeepForSdk
    public void onStop() {
        T t = this.a;
        if (t != null) {
            t.onStop();
        } else {
            d(4);
        }
    }
}
