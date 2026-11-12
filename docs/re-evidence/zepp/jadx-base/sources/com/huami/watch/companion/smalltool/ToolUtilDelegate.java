package com.huami.watch.companion.smalltool;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ToolUtilDelegate {
    private static IToolUtil a;

    public interface IToolUtil {
        void addToMyTools(@NonNull String str);

        boolean canAddToMyTools(@NonNull String str);
    }

    public static void delegate(IToolUtil iToolUtil) {
        a = iToolUtil;
    }

    public void addToMyTools(String str) {
        IToolUtil iToolUtil = a;
        if (iToolUtil != null) {
            iToolUtil.addToMyTools(str);
        }
    }

    public boolean canAddToMyTools(String str) {
        IToolUtil iToolUtil = a;
        return iToolUtil != null && iToolUtil.canAddToMyTools(str);
    }
}
