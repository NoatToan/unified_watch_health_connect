package io.github.anotherjack.avoidonresult;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import io.reactivex.Observable;

/* JADX INFO: loaded from: classes22.dex */
public class AvoidOnResult {
    private static final String b = "AvoidOnResult";
    private AvoidOnResultFragment a;

    public interface Callback {
        void onActivityResult(int i, Intent intent);
    }

    public AvoidOnResult(Activity activity) {
        this.a = b(activity);
    }

    private AvoidOnResultFragment a(Activity activity) {
        return (AvoidOnResultFragment) activity.getFragmentManager().findFragmentByTag(b);
    }

    private AvoidOnResultFragment b(Activity activity) {
        AvoidOnResultFragment avoidOnResultFragmentA = a(activity);
        if (avoidOnResultFragmentA != null) {
            return avoidOnResultFragmentA;
        }
        AvoidOnResultFragment avoidOnResultFragment = new AvoidOnResultFragment();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(avoidOnResultFragment, b).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return avoidOnResultFragment;
    }

    public Observable<ActivityResultInfo> startForResult(Intent intent) {
        return this.a.startForResult(intent);
    }

    public Observable<ActivityResultInfo> startForResult(Class<?> cls) {
        return startForResult(new Intent(this.a.getActivity(), cls));
    }

    public AvoidOnResult(Fragment fragment) {
        this(fragment.getActivity());
    }

    public void startForResult(Intent intent, Callback callback) {
        this.a.startForResult(intent, callback);
    }

    public void startForResult(Class<?> cls, Callback callback) {
        startForResult(new Intent(this.a.getActivity(), cls), callback);
    }
}
