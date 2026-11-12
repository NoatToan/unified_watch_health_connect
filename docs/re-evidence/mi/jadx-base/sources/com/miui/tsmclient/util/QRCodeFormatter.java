package com.miui.tsmclient.util;

import android.text.Editable;

/* JADX INFO: loaded from: classes6.dex */
public class QRCodeFormatter extends Formatter {
    private static final String SEPARATOR = "  ";

    @Override // com.miui.tsmclient.util.Formatter
    public void format(Editable editable) {
        if (editable != null) {
            clean(editable);
            for (int i = 4; i < editable.length(); i += 6) {
                editable.insert(i, SEPARATOR);
            }
        }
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValid(String str) {
        return true;
    }
}
