package com.huami.privacy.plugin;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\bR&\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/privacy/plugin/CreatedActivityClassNames;", "Lcom/huami/privacy/plugin/ActivityLifecyclePlugin;", "", "", "Landroid/app/Activity;", "activity", "", "onActivityCreated$hmutil_release", "(Landroid/app/Activity;)V", "onActivityCreated", "onActivityDestroyed$hmutil_release", "onActivityDestroyed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "names", "getValue", "()Ljava/util/List;", "value", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class CreatedActivityClassNames extends ActivityLifecyclePlugin<List<? extends String>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> names = new ArrayList<>();

    @Override // com.huami.privacy.plugin.ActivityLifecyclePlugin
    public void onActivityCreated$hmutil_release(@NotNull Activity activity) {
        super.onActivityCreated$hmutil_release(activity);
        this.names.add(0, activity.getClass().getName());
    }

    @Override // com.huami.privacy.plugin.ActivityLifecyclePlugin
    public void onActivityDestroyed$hmutil_release(@NotNull Activity activity) {
        super.onActivityDestroyed$hmutil_release(activity);
        this.names.remove(activity.getClass().getName());
    }

    @Override // com.huami.privacy.plugin.PrivacyPlugin
    @NotNull
    public List<String> getValue() {
        return this.names;
    }
}
