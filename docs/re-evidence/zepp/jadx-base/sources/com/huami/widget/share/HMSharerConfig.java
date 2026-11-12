package com.huami.widget.share;

import android.util.SparseArray;
import com.huami.widget.share.platform.SharerProvider;

/* JADX INFO: loaded from: classes17.dex */
public class HMSharerConfig {
    private static final SparseArray<ShareTypeDisplayCondition> a = new SparseArray<>();
    public static SharerProvider facebookSharerProvider;

    public interface ShareTypeDisplayCondition {
        boolean shouldShow();
    }

    public static void addDisplayConditions(int i, ShareTypeDisplayCondition shareTypeDisplayCondition) {
        a.put(i, shareTypeDisplayCondition);
    }

    public static boolean isSupportType(int i) {
        if (facebookSharerProvider == null && i == 8) {
            return false;
        }
        ShareTypeDisplayCondition shareTypeDisplayCondition = a.get(i);
        if (shareTypeDisplayCondition == null) {
            return true;
        }
        return shareTypeDisplayCondition.shouldShow();
    }

    public static void setFacebookSharer(SharerProvider sharerProvider) {
        facebookSharerProvider = sharerProvider;
    }
}
