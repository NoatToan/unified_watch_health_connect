package com.mi.health.account;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.Gson;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.yc5;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JS\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/mi/health/account/AccountProvider;", "Lcom/xiaomi/fitness/dataprovider/DataProvider;", "<init>", "()V", "onRegisterPath", "", "mapper", "Lcom/xiaomi/fitness/dataprovider/DataProvider$PathMapper;", "getType", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "", "selection", "selectionArgs", "sortOrder", "callPackage", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountProvider extends DataProvider {
    private static final int GET_TOKEN = 2;
    private static final int IS_LOGIN = 3;

    @NotNull
    private static final String PATH_GET_TOKEN = "getToken";

    @NotNull
    private static final String PATH_IS_LOGIN = "isLogin";

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            return "vnd.android.cursor.item/vnd.mi.health.account.getToken";
        }
        if (iMatchPath != 3) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.mi.health.account.isLogin";
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(@NotNull DataProvider.PathMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        mapper.addPath("/getToken", 2);
        mapper.addPath("/isLogin", 3);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull String callPackage) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callPackage, "callPackage");
        int iMatchPath = matchPath(uri);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iMatchPath == 2) {
            TokenManager accountManagerExtKt = AccountManagerExtKt.getInstance(TokenManager.INSTANCE);
            Intrinsics.checkNotNull(projection);
            linkedHashMap.put(PATH_GET_TOKEN, new Gson().toJson(TokenManager.DefaultImpls.getServiceToken$default(accountManagerExtKt, projection[0], false, 0, 4, null)));
        } else if (iMatchPath == 3) {
            linkedHashMap.put(PATH_IS_LOGIN, Integer.valueOf(AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() ? 1 : 0));
        }
        return yc5.a(linkedHashMap, null);
    }
}
