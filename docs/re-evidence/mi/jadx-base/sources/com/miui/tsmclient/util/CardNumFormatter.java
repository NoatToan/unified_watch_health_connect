package com.miui.tsmclient.util;

import android.text.Editable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class CardNumFormatter extends Formatter {
    @Override // com.miui.tsmclient.util.Formatter
    public void format(Editable editable) {
        clean(editable);
        if (editable.length() <= 4) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < editable.length()) {
            if (i2 % 4 == 0 && i2 != 0) {
                editable.insert(i, Character.toString(this.SEPARATOR));
                i++;
            }
            i++;
            i2++;
        }
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValid(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^\\d{14,19}$");
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void setContentDescription(String str) {
        super.setContentDescription(StringUtils.replaceAll(str, StringUtils.SOURCE_ANY_FORMAT, StringUtils.SOURCE_SPACE_FORMAT));
    }
}
