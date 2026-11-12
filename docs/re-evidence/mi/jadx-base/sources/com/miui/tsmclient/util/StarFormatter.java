package com.miui.tsmclient.util;

import android.text.Editable;

/* JADX INFO: loaded from: classes6.dex */
public class StarFormatter extends Formatter {
    @Override // com.miui.tsmclient.util.Formatter
    public void format(Editable editable) {
        if (editable.length() == 2) {
            editable.replace(1, 2, Character.toString('*'));
            return;
        }
        if (editable.length() > 2) {
            int i = 1;
            while (i < editable.length() - 1) {
                int i2 = i + 1;
                editable.replace(i, i2, Character.toString('*'));
                i = i2;
            }
        }
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValid(String str) {
        return true;
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValidCharacter(char c) {
        return '*' != c;
    }
}
