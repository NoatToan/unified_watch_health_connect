package com.huami.utils.persistence.kvkit;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistenceLogger;", "", "", "Lcom/huami/utils/persistence/kvkit/LEVEL;", FirebaseAnalytics.Param.LEVEL, "", "Lcom/huami/utils/persistence/kvkit/MESSAGE;", "msg", "", "log", "library_release"}, k = 1, mv = {1, 5, 1})
public interface KvPersistenceLogger {
    void log(int level, @NotNull String msg);
}
