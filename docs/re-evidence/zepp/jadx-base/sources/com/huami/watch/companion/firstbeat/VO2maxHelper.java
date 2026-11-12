package com.huami.watch.companion.firstbeat;

import com.activeandroid.query.Select;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/companion/firstbeat/VO2maxHelper;", "", "Lcom/huami/watch/dataflow/model/firstbeat/bean/VO2maxDataItem;", "getLatest", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class VO2maxHelper {

    @NotNull
    public static final VO2maxHelper INSTANCE = new VO2maxHelper();

    private VO2maxHelper() {
    }

    @Nullable
    public final VO2maxDataItem getLatest() {
        return (VO2maxDataItem) new Select().from(VO2maxDataItem.class).where("date <= ?", new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date())).where("vo2_max_run > ?", 0).orderBy("date DESC").executeSingle();
    }
}
