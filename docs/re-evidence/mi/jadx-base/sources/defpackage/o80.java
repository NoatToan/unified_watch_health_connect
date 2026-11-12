package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public class o80 {
    public static void a(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
