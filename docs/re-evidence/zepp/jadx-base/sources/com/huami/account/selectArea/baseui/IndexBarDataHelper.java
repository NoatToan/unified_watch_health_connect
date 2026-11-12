package com.huami.account.selectArea.baseui;

import android.content.Context;
import android.icu.text.AlphabeticIndex;
import android.icu.util.ULocale;
import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import com.huami.account.selectArea.baseui.BaseIndexBean;
import com.huami.account.selectArea.baseui.IndexBarDataHelper;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J$\u0010\u000f\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rJ \u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/account/selectArea/baseui/IndexBarDataHelper;", "", "", "Lcom/huami/account/selectArea/baseui/BaseIndexBean;", "data", "", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "sortByAlphabeticIndex", "handleAlphabeticIndex", "sourceData", "", "indexData", "getSortedIndexData", "sortSourceData", "Landroid/icu/text/AlphabeticIndex;", "a", "Landroid/icu/text/AlphabeticIndex;", "indexBuilder", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class IndexBarDataHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AlphabeticIndex<BaseIndexBean> indexBuilder;

    private final void b(List<? extends BaseIndexBean> data) {
        Collections.sort(data, new Comparator() { // from class: xe4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return IndexBarDataHelper.c((BaseIndexBean) obj, (BaseIndexBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(BaseIndexBean baseIndexBean, BaseIndexBean baseIndexBean2) {
        return Intrinsics.compare(baseIndexBean.getIndex(), baseIndexBean2.getIndex());
    }

    public final void getSortedIndexData(@Nullable List<? extends BaseIndexBean> sourceData, @NotNull List<String> indexData) {
        if (sourceData == null || sourceData.isEmpty()) {
            return;
        }
        Iterator<? extends BaseIndexBean> it2 = sourceData.iterator();
        while (it2.hasNext()) {
            String baseIndexTag = it2.next().getBaseIndexTag();
            if (!CollectionsKt___CollectionsKt.contains(indexData, baseIndexTag) && baseIndexTag != null) {
                indexData.add(baseIndexTag);
            }
        }
    }

    @RequiresApi(24)
    @NotNull
    public final List<String> handleAlphabeticIndex(@NotNull Context context, @NotNull List<? extends BaseIndexBean> data) {
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        int i = 0;
        Locale locale = locales.size() == 0 ? Locale.ENGLISH : locales.get(0);
        if (this.indexBuilder == null) {
            this.indexBuilder = new AlphabeticIndex(locale).addLabels(ULocale.ENGLISH);
        }
        AlphabeticIndex<BaseIndexBean> alphabeticIndex = this.indexBuilder;
        if (alphabeticIndex != null) {
            alphabeticIndex.clearRecords();
        }
        for (BaseIndexBean baseIndexBean : data) {
            AlphabeticIndex<BaseIndexBean> alphabeticIndex2 = this.indexBuilder;
            if (alphabeticIndex2 != null) {
                alphabeticIndex2.addRecord(baseIndexBean.getDataToSort(), baseIndexBean);
            }
        }
        ArrayList arrayList = new ArrayList();
        AlphabeticIndex<BaseIndexBean> alphabeticIndex3 = this.indexBuilder;
        if (alphabeticIndex3 != null) {
            Iterator<T> it2 = alphabeticIndex3.iterator();
            while (it2.hasNext()) {
                AlphabeticIndex.Bucket<AlphabeticIndex.Record> bucket = (AlphabeticIndex.Bucket) it2.next();
                if (bucket.size() != 0 && !Intrinsics.areEqual(bucket.getLabel(), "...")) {
                    arrayList.add(bucket.getLabel());
                    for (AlphabeticIndex.Record record : bucket) {
                        ((BaseIndexBean) record.getData()).setIndex(i);
                        ((BaseIndexBean) record.getData()).setBaseIndexTag(bucket.getLabel());
                        i++;
                    }
                }
            }
        }
        b(data);
        return arrayList;
    }

    @RequiresApi(24)
    @Nullable
    public final List<String> sortByAlphabeticIndex(@Nullable List<? extends BaseIndexBean> data, @NotNull Context context) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        return handleAlphabeticIndex(context, data);
    }

    @RequiresApi(24)
    public final void sortSourceData(@Nullable List<? extends BaseIndexBean> data, @NotNull Context context) {
        if (data == null || data.isEmpty()) {
            return;
        }
        handleAlphabeticIndex(context, data);
    }
}
