package com.huami.worldclock.add.alphabetic;

import android.content.Context;
import android.icu.text.AlphabeticIndex;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import com.github.promeg.pinyinhelper.Pinyin;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.ota.UpdateUtils;
import com.huami.worldclock.R;
import com.huami.worldclock.add.alphabetic.IndexBarDataHelperImpl;
import com.huami.worldclock.bean.BaseIndexAlphabeticBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J \u0010\f\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J&\u0010\u0012\u001a\u00020\u00012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/worldclock/add/alphabetic/IndexBarDataHelperImpl;", "Lcom/huami/worldclock/add/alphabetic/IIndexBarDataHelper;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/worldclock/bean/BaseIndexAlphabeticBean;", "data", "", "b", "", "c", "convert", "fillIndexTag", "sortSourceData", "sortByAlphabeticIndex", "sourceData", "", "indexData", "getSortedIndexData", "a", "Ljava/lang/String;", "TAG", "Landroid/icu/text/AlphabeticIndex;", "Landroid/icu/text/AlphabeticIndex;", "indexBuilder", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class IndexBarDataHelperImpl implements IIndexBarDataHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG = IndexBarDataHelperImpl.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AlphabeticIndex<BaseIndexAlphabeticBean> indexBuilder;

    @RequiresApi(24)
    private final List<String> b(Context context, List<? extends BaseIndexAlphabeticBean> data) {
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        int i = 0;
        Locale locale = locales.size() == 0 ? Locale.ENGLISH : locales.get(0);
        if (this.indexBuilder == null) {
            this.indexBuilder = new AlphabeticIndex<>(locale);
        }
        AlphabeticIndex<BaseIndexAlphabeticBean> alphabeticIndex = this.indexBuilder;
        if (alphabeticIndex != null) {
            alphabeticIndex.clearRecords();
        }
        for (BaseIndexAlphabeticBean baseIndexAlphabeticBean : data) {
            AlphabeticIndex<BaseIndexAlphabeticBean> alphabeticIndex2 = this.indexBuilder;
            if (alphabeticIndex2 != null) {
                alphabeticIndex2.addRecord(baseIndexAlphabeticBean.getBaseAlphabeticString(), baseIndexAlphabeticBean);
            }
        }
        ArrayList arrayList = new ArrayList();
        AlphabeticIndex<BaseIndexAlphabeticBean> alphabeticIndex3 = this.indexBuilder;
        if (alphabeticIndex3 != null) {
            Iterator<T> it2 = alphabeticIndex3.iterator();
            while (it2.hasNext()) {
                AlphabeticIndex.Bucket<AlphabeticIndex.Record> bucket = (AlphabeticIndex.Bucket) it2.next();
                if (bucket.size() != 0) {
                    arrayList.add(LabelProcess.INSTANCE.labelUnifiedProcessing(locale, bucket.getLabel()));
                    for (AlphabeticIndex.Record record : bucket) {
                        ((BaseIndexAlphabeticBean) record.getData()).setIndex(i);
                        ((BaseIndexAlphabeticBean) record.getData()).setBaseIndexTag(bucket.getLabel());
                        i++;
                    }
                }
            }
        }
        c(data);
        return arrayList;
    }

    private final void c(List<? extends BaseIndexAlphabeticBean> data) {
        Collections.sort(data, new Comparator() { // from class: ye4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return IndexBarDataHelperImpl.d((BaseIndexAlphabeticBean) obj, (BaseIndexAlphabeticBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(BaseIndexAlphabeticBean baseIndexAlphabeticBean, BaseIndexAlphabeticBean baseIndexAlphabeticBean2) {
        if (!baseIndexAlphabeticBean.isNeedToAlphabetic() || !baseIndexAlphabeticBean2.isNeedToAlphabetic()) {
            return 0;
        }
        if (m.equals$default(baseIndexAlphabeticBean.getBaseIndexTag(), UpdateUtils.CMD_FILTER, false, 2, null) && m.equals$default(baseIndexAlphabeticBean2.getBaseIndexTag(), UpdateUtils.CMD_FILTER, false, 2, null)) {
            return 0;
        }
        if (m.equals$default(baseIndexAlphabeticBean.getBaseIndexTag(), UpdateUtils.CMD_FILTER, false, 2, null)) {
            return 1;
        }
        if (m.equals$default(baseIndexAlphabeticBean2.getBaseIndexTag(), UpdateUtils.CMD_FILTER, false, 2, null)) {
            return -1;
        }
        return Intrinsics.compare(baseIndexAlphabeticBean.getIndex(), baseIndexAlphabeticBean2.getIndex());
    }

    @Override // com.huami.worldclock.add.alphabetic.IIndexBarDataHelper
    @NotNull
    public IIndexBarDataHelper convert(@Nullable List<? extends BaseIndexAlphabeticBean> data) {
        if (data == null || data.isEmpty()) {
            return this;
        }
        for (BaseIndexAlphabeticBean baseIndexAlphabeticBean : data) {
            StringBuilder sb = new StringBuilder();
            if (baseIndexAlphabeticBean.isNeedToAlphabetic()) {
                String target = baseIndexAlphabeticBean.getTarget();
                int length = target.length();
                int i = 0;
                while (i < length) {
                    char cCharAt = target.charAt(i);
                    i++;
                    sb.append(Pinyin.toPinyin(cCharAt).toUpperCase());
                }
                baseIndexAlphabeticBean.setBaseIndexPinyin(sb.toString());
            }
        }
        return this;
    }

    @Override // com.huami.worldclock.add.alphabetic.IIndexBarDataHelper
    @NotNull
    public IIndexBarDataHelper fillIndexTag(@Nullable List<? extends BaseIndexAlphabeticBean> data, @NotNull Context context) {
        if (data == null || data.isEmpty()) {
            return this;
        }
        String[] stringArray = context.getResources().getStringArray(R.array.world_clock_alphabet_navigation_table);
        StringBuilder sb = new StringBuilder();
        int length = stringArray.length;
        int length2 = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            String str = stringArray[i];
            int i3 = i2 + 1;
            if (i2 == 0) {
                sb.append("[");
            }
            if (i2 <= length - 2) {
                sb.append(str);
            }
            if (i2 == length - 1) {
                sb.append("]");
            }
            i++;
            i2 = i3;
        }
        for (BaseIndexAlphabeticBean baseIndexAlphabeticBean : data) {
            if (baseIndexAlphabeticBean.isNeedToAlphabetic()) {
                String string = baseIndexAlphabeticBean.getBaseIndexPinyin().toString();
                Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = string.substring(0, 1);
                if (new Regex(sb.toString()).matches(strSubstring)) {
                    baseIndexAlphabeticBean.setBaseIndexTag(strSubstring);
                    baseIndexAlphabeticBean.setIndex(ArraysKt___ArraysKt.indexOf(stringArray, strSubstring));
                } else {
                    baseIndexAlphabeticBean.setBaseIndexTag(stringArray[length - 1]);
                    baseIndexAlphabeticBean.setIndex(stringArray.length - 1);
                }
            }
        }
        return this;
    }

    @Override // com.huami.worldclock.add.alphabetic.IIndexBarDataHelper
    @NotNull
    public IIndexBarDataHelper getSortedIndexData(@Nullable List<? extends BaseIndexAlphabeticBean> sourceData, @NotNull List<String> indexData) {
        if (sourceData == null || sourceData.isEmpty()) {
            return this;
        }
        Iterator<? extends BaseIndexAlphabeticBean> it2 = sourceData.iterator();
        while (it2.hasNext()) {
            String baseIndexTag = it2.next().getBaseIndexTag();
            if (!CollectionsKt___CollectionsKt.contains(indexData, baseIndexTag) && baseIndexTag != null) {
                indexData.add(baseIndexTag);
            }
        }
        return this;
    }

    @Override // com.huami.worldclock.add.alphabetic.IIndexBarDataHelper
    @RequiresApi(24)
    @Nullable
    public List<String> sortByAlphabeticIndex(@Nullable List<? extends BaseIndexAlphabeticBean> data, @NotNull Context context) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        return b(context, data);
    }

    @Override // com.huami.worldclock.add.alphabetic.IIndexBarDataHelper
    @NotNull
    public IIndexBarDataHelper sortSourceData(@Nullable List<? extends BaseIndexAlphabeticBean> data, @NotNull Context context) {
        if (data == null || data.isEmpty()) {
            return this;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            b(context, data);
        } else {
            convert(data);
            fillIndexTag(data, context);
            c(data);
        }
        return this;
    }
}
