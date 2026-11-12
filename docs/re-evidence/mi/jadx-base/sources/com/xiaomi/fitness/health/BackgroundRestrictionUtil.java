package com.xiaomi.fitness.health;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.fitness.common.utils.SafeDBUtil;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/BackgroundRestrictionUtil;", "", "<init>", "()V", "LEVEL_INVALID", "", "LEVEL_NO_RESTRICT", "LEVEL_AUTO", "LEVEL_RESTRICT_BG", "LEVEL_NO_BG", "BACKGROUND_CONFIGURE_URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "Landroid/net/Uri;", "LEVEL_STR_NO_RESTRICT", "", "LEVEL_STR_AUTO", "LEVEL_STR_RESTRICT_BG", "LEVEL_STR_NO_BG", "queryRestrictionLevelString", "context", "Landroid/content/Context;", "packageName", "queryRestrictionLevel", "isNoRestrictedLevel", "", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "restrictionLevel", "(I)Ljava/lang/Boolean;", "isRestrictedLevel", "health-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackgroundRestrictionUtil {
    public static final int LEVEL_AUTO = 1;
    public static final int LEVEL_INVALID = -1;
    public static final int LEVEL_NO_BG = 3;
    public static final int LEVEL_NO_RESTRICT = 0;
    public static final int LEVEL_RESTRICT_BG = 2;

    @NotNull
    private static final String LEVEL_STR_AUTO = "miuiAuto";

    @NotNull
    private static final String LEVEL_STR_NO_BG = "noBg";

    @NotNull
    private static final String LEVEL_STR_NO_RESTRICT = "noRestrict";

    @NotNull
    private static final String LEVEL_STR_RESTRICT_BG = "restrictBg";

    @NotNull
    public static final BackgroundRestrictionUtil INSTANCE = new BackgroundRestrictionUtil();
    private static final Uri BACKGROUND_CONFIGURE_URI = Uri.withAppendedPath(Uri.parse("content://com.miui.powerkeeper.configure"), "userTable");

    private BackgroundRestrictionUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String queryRestrictionLevelString$lambda$0(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            return "";
        }
        String string = cursor.getString(cursor.getColumnIndex("bgControl"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Nullable
    public final Boolean isNoRestrictedLevel(@Nullable Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int iQueryRestrictionLevel = queryRestrictionLevel(context, packageName);
        if (-1 == iQueryRestrictionLevel) {
            return null;
        }
        return Boolean.valueOf(iQueryRestrictionLevel == 0);
    }

    @Nullable
    public final Boolean isRestrictedLevel(int restrictionLevel) {
        if (-1 == restrictionLevel) {
            return null;
        }
        return Boolean.valueOf(3 == restrictionLevel);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[RETURN, SYNTHETIC] */
    public final int queryRestrictionLevel(@Nullable Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        switch (queryRestrictionLevelString(context, packageName)) {
            case "restrictBg":
                return 2;
            case "miuiAuto":
                return 1;
            case "noBg":
                return 3;
            case "noRestrict":
                return 0;
            default:
                return -1;
        }
    }

    @NotNull
    public final String queryRestrictionLevelString(@Nullable Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        SafeDBUtil safeDBUtil = SafeDBUtil.INSTANCE;
        Intrinsics.checkNotNull(context);
        return (String) safeDBUtil.safeQuery(context, BACKGROUND_CONFIGURE_URI, (String[]) null, "pkgName = ? ", new String[]{packageName}, (String) null, new Function1() { // from class: fx1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackgroundRestrictionUtil.queryRestrictionLevelString$lambda$0((Cursor) obj);
            }
        });
    }

    @Nullable
    public final Boolean isNoRestrictedLevel(int restrictionLevel) {
        if (-1 == restrictionLevel) {
            return null;
        }
        return Boolean.valueOf(restrictionLevel == 0);
    }
}
