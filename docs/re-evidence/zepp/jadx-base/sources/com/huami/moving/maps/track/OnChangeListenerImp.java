package com.huami.moving.maps.track;

import com.huami.moving.ui.sport.detail.SportTrackDetailFragment;
import com.huami.tools.log.HMLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class OnChangeListenerImp implements OnChangeListener {
    private static final String c = "OnChangeListenerImp";
    public WeakReference<SportTrackDetailFragment> a;
    private boolean b = false;

    public OnChangeListenerImp(SportTrackDetailFragment sportTrackDetailFragment) {
        this.a = new WeakReference<>(sportTrackDetailFragment);
    }

    @Override // com.huami.moving.maps.track.OnChangeListener
    public void onChangeEnd() {
        HMLog.i(c, "onChangeEnd ....", new Object[0]);
    }

    @Override // com.huami.moving.maps.track.OnChangeListener
    public void onChangeStart() {
        HMLog.i(c, "onChangeStart ....", new Object[0]);
    }
}
