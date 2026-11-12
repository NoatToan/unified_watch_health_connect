package com.huami.dragview.draglist;

import android.content.Context;
import android.widget.Toast;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.CustomToast;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "msg", "", "centerToast", "dragview_release"}, k = 2, mv = {1, 4, 0})
public final class DragListAdapterKt {
    public static final void centerToast(@NotNull Context context, @NotNull String str) {
        Toast toastMakeText = CustomToast.makeText(context.getApplicationContext(), str, 0, 17);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }
}
