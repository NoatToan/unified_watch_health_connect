package com.huami.devicex.injection.other;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u001c\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0013"}, d2 = {"Lcom/huami/devicex/injection/other/AppUtilApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.PERMISSION, "", "checkPermission", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "showGotoLocationServerDialog", "msd", "showPermissionDenieDialog", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "isFastDoubleClick", "isLocationServerOpen", "needShowAlexa", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AppUtilApi {
    boolean checkPermission(@Nullable Context context, @Nullable String permission);

    boolean isFastDoubleClick(@Nullable View view);

    boolean isLocationServerOpen(@Nullable Context context);

    boolean needShowAlexa(@NotNull Context context);

    void showGotoLocationServerDialog(@Nullable AppCompatActivity activity);

    void showPermissionDenieDialog(@Nullable AppCompatActivity activity, @Nullable String msd);
}
