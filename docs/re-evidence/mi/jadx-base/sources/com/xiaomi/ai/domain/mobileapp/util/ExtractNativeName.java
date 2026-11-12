package com.xiaomi.ai.domain.mobileapp.util;

import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ExtractNativeName {
    public static void setAppName(MobileAppIntention mobileAppIntention, String str, String str2, List<Integer> list) {
        String name;
        int iIndexOf;
        if (mobileAppIntention.getName() == null || mobileAppIntention.getName().isEmpty() || (iIndexOf = str2.indexOf((name = mobileAppIntention.getName()))) < 0) {
            return;
        }
        int iIntValue = list.get(iIndexOf).intValue();
        int length = str.length();
        if (name.length() + iIndexOf < list.size()) {
            length = list.get(iIndexOf + name.length()).intValue();
        }
        mobileAppIntention.setHintName(str.substring(iIntValue, length));
    }
}
