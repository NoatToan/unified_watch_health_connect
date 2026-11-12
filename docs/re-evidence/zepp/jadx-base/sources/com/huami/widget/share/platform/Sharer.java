package com.huami.widget.share.platform;

import android.content.Intent;
import com.huami.widget.share.ShareContent;

/* JADX INFO: loaded from: classes17.dex */
public interface Sharer {
    void onActivityResult(int i, int i2, Intent intent);

    void shareTo(ShareContent shareContent, ShareMissionListener shareMissionListener);
}
