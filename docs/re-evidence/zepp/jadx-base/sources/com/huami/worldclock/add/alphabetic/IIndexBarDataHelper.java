package com.huami.worldclock.add.alphabetic;

import android.content.Context;
import androidx.annotation.RequiresApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.bean.BaseIndexAlphabeticBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J \u0010\b\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\t\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J&\u0010\u000e\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\rH&¨\u0006\u000f"}, d2 = {"Lcom/huami/worldclock/add/alphabetic/IIndexBarDataHelper;", "", "", "Lcom/huami/worldclock/bean/BaseIndexAlphabeticBean;", "data", "convert", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "fillIndexTag", "sortSourceData", "", "sortByAlphabeticIndex", "sourceData", "", "getSortedIndexData", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public interface IIndexBarDataHelper {
    @NotNull
    IIndexBarDataHelper convert(@Nullable List<? extends BaseIndexAlphabeticBean> data);

    @NotNull
    IIndexBarDataHelper fillIndexTag(@Nullable List<? extends BaseIndexAlphabeticBean> data, @NotNull Context context);

    @NotNull
    IIndexBarDataHelper getSortedIndexData(@Nullable List<? extends BaseIndexAlphabeticBean> sourceData, @NotNull List<String> data);

    @RequiresApi(24)
    @Nullable
    List<String> sortByAlphabeticIndex(@Nullable List<? extends BaseIndexAlphabeticBean> data, @NotNull Context context);

    @NotNull
    IIndexBarDataHelper sortSourceData(@Nullable List<? extends BaseIndexAlphabeticBean> data, @NotNull Context context);
}
