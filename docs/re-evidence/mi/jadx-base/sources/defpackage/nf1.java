package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public final class nf1 {

    @RequiresApi(24)
    public static final class a {
        public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                c.g0(textView, new ContentInfoCompat.a(dragEvent.getClipData(), 3).a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        public static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            c.g0(view, new ContentInfoCompat.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    public static boolean a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && c.D(view) != null) {
            Activity activityC = c(view);
            if (activityC == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.a(dragEvent, (TextView) view, activityC) : a.b(dragEvent, view, activityC);
            }
        }
        return false;
    }

    public static boolean b(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || c.D(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            c.g0(textView, new ContentInfoCompat.a(primaryClip, 1).c(i != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    public static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
