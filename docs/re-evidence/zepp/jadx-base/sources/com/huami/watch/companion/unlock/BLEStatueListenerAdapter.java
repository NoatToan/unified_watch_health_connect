package com.huami.watch.companion.unlock;

/* JADX INFO: loaded from: classes16.dex */
public class BLEStatueListenerAdapter implements BTStatusFragment.BLEStatueListener {
    @Override // com.huami.watch.companion.unlock.BTStatusFragment.BLEStatueListener
    public CharSequence getUnbindStr() {
        return null;
    }

    @Override // com.huami.watch.companion.unlock.BTStatusFragment.BLEStatueListener
    public void onVisibleChange(boolean z) {
    }

    @Override // com.huami.watch.companion.unlock.BTStatusFragment.BLEStatueListener
    public BTStatusFragment.TopTips setTopTips() {
        return new BTStatusFragment.TopTips(false, "");
    }
}
