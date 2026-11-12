package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    private l(DragAndDropPermissions dragAndDropPermissions) {
    }

    public static void a(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsRequestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
        if (dragAndDropPermissionsRequestDragAndDropPermissions != null) {
            new l(dragAndDropPermissionsRequestDragAndDropPermissions);
        }
    }
}
