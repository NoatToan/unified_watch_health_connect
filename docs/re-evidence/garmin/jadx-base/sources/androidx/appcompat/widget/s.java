package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    private s() {
    }

    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            androidx.core.view.s0.m(textView, new androidx.core.view.e.a(dragEvent.getClipData(), 3).f6415a.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view2, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        androidx.core.view.s0.m(view2, new androidx.core.view.e.a(dragEvent.getClipData(), 3).f6415a.build());
        return true;
    }
}
