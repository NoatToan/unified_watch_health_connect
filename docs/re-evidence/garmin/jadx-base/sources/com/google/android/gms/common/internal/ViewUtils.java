package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z14, boolean z15, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z14) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 8 + strSubstring.length());
                sb3.append(packageName);
                sb3.append(":string/");
                sb3.append(strSubstring);
                resources.getValue(sb3.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                new StringBuilder(v.a(30, str2) + attributeValue.length());
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                new StringBuilder(v.a(28, str2) + typedValue.toString().length());
            }
        }
        if (z15 && attributeValue == null) {
            new StringBuilder(String.valueOf(str2).length() + 33);
        }
        return attributeValue;
    }
}
