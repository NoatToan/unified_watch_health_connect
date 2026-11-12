package com.huami.sleepassistant.apilib.repo;

import android.content.Context;
import androidx.annotation.MainThread;
import com.facebook.appevents.UserDataStore;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.utils.SleepServiceInitUtils;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/FristOpenRepo;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "fristOpen", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "a", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class FristOpenRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantDb db;

    public FristOpenRepo(@NotNull SleepAssistantDb sleepAssistantDb) {
        this.db = sleepAssistantDb;
    }

    @MainThread
    public final void fristOpen(@NotNull Context context) {
        SleepServiceInitUtils.INSTANCE.getInstance(context).init(this.db);
    }
}
