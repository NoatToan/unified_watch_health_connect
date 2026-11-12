package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.util.Log;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R)\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/assistant/ui/fragment/UpdateFragmentStartDelegate;", "", "Landroid/app/Activity;", DbUtils.Const.Table.CONTEXT, "", "onStart", "onStop", "Ljava/util/ArrayList;", "Lcom/huami/assistant/ui/fragment/UpdateStartListener;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getOnUpdateStartEventListener", "()Ljava/util/ArrayList;", "onUpdateStartEventListener", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class UpdateFragmentStartDelegate {

    @NotNull
    public static final UpdateFragmentStartDelegate INSTANCE = new UpdateFragmentStartDelegate();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<UpdateStartListener> onUpdateStartEventListener = new ArrayList<>();

    private UpdateFragmentStartDelegate() {
    }

    @NotNull
    public final ArrayList<UpdateStartListener> getOnUpdateStartEventListener() {
        return onUpdateStartEventListener;
    }

    public final void onStart(@Nullable Activity context) {
        if (context == null) {
            return;
        }
        try {
            Iterator<T> it2 = INSTANCE.getOnUpdateStartEventListener().iterator();
            while (it2.hasNext()) {
                ((UpdateStartListener) it2.next()).onStart(context);
            }
        } catch (Exception e) {
            Log.e("UpdateFragment", "error", e);
        }
    }

    public final void onStop() {
        onUpdateStartEventListener.clear();
    }
}
