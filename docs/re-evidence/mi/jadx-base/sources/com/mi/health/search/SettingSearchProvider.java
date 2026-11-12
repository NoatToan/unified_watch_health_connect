package com.mi.health.search;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016JO\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J1\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0017J;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/mi/health/search/SettingSearchProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingSearchProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        SearchSettingHelper searchSettingHelper = new SearchSettingHelper();
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        List<SearchSettingHelper.SearchSetting> listConstructHealthSearchSetting = searchSettingHelper.constructHealthSearchSetting(context);
        if (!(!listConstructHealthSearchSetting.isEmpty())) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(SearchContract.INSTANCE.getSEARCH_RESULT_COLUMNS());
        for (SearchSettingHelper.SearchSetting searchSetting : listConstructHealthSearchSetting) {
            matrixCursor.newRow().add("title", searchSetting.getTitle()).add(SearchContract.COLUMN_INTENT_ACTION, searchSetting.getIntentAction()).add(SearchContract.COLUMN_INTENT_TARGET_PACKAGE, searchSetting.getIntentTargetPackage()).add(SearchContract.COLUMN_INTENT_TARGET_CLASS, searchSetting.getIntentTargetClass()).add(SearchContract.COLUMN_SUMMARY_ON, searchSetting.getSummaryOn()).add(SearchContract.COLUMN_SUMMARY_OFF, searchSetting.getSummaryOff()).add("keywords", searchSetting.getSearchKeyWords()).add("extras", searchSetting.getExtras());
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
