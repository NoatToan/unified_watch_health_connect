package com.miui.tsmclient.util;

import android.text.Editable;
import android.text.TextUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class ValidDateFormatter extends Formatter {
    private static final char SEPARATOR = '/';

    private boolean isExpired(String str) {
        int length;
        if (TextUtils.isEmpty(str) || (length = str.length()) < 4) {
            return true;
        }
        String strSubstring = str.substring(0, 2);
        String strSubstring2 = str.substring(length - 2);
        int i = Integer.parseInt(strSubstring);
        int i2 = Integer.parseInt(strSubstring2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i3 = calendar.get(1) % 100;
        return i3 > i2 || (i3 == i2 && i < calendar.get(2));
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void clean(Editable editable) {
        int i = 0;
        while (i < editable.length()) {
            if (!isValidCharacter(editable.charAt(i))) {
                editable.delete(i, i + 1);
            } else if (i != 0 && editable.charAt(i) == '0' && editable.charAt(i - 1) == '0') {
                editable.delete(i, i + 1);
            } else {
                i++;
            }
        }
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void cover(Editable editable) {
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void format(Editable editable) {
        StringBuilder sb = new StringBuilder(clean(editable.toString()));
        if (sb.length() > 4) {
            sb.delete(4, sb.length());
        }
        for (int i = 0; i < sb.length(); i++) {
            char cCharAt = sb.charAt(i);
            if ((i == 0 && cCharAt > '1' && cCharAt <= '9') || (i == 1 && cCharAt > '2' && sb.charAt(0) > '0')) {
                sb.insert(0, "0");
                break;
            }
        }
        if (sb.length() > 4) {
            sb.delete(4, sb.length());
        }
        if ((editable.length() != 3 && sb.length() == 2) || (sb.length() > 2 && sb.charAt(2) != '/')) {
            sb.insert(2, "/");
        }
        if (TextUtils.equals(editable, sb)) {
            return;
        }
        editable.replace(0, editable.length(), sb);
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isSeparator(char c) {
        return c == '/';
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValid(String str) {
        return (TextUtils.isEmpty(str) || !str.matches("^[01]\\d/?\\d{2}$") || isExpired(str)) ? false : true;
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void setContentDescription(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() <= 2) {
            sb.append(str);
            sb.append(ResUtils.getString(this.mEditText.getContext(), "month"));
        } else {
            sb.append(StringUtils.replaceAll(str.substring(2), StringUtils.SOURCE_ANY_FORMAT, StringUtils.SOURCE_SPACE_FORMAT));
            sb.append(ResUtils.getString(this.mEditText.getContext(), "year"));
            sb.append(str.substring(0, 2));
            sb.append(ResUtils.getString(this.mEditText.getContext(), "month"));
        }
        super.setContentDescription(sb.toString());
    }
}
