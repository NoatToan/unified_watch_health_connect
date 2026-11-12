package com.mi.health.privacy;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JS\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0014¨\u0006\u001b"}, d2 = {"Lcom/mi/health/privacy/PrivacyProvider;", "Lcom/xiaomi/fitness/dataprovider/DataProvider;", "<init>", "()V", "onRegisterPath", "", "mapper", "Lcom/xiaomi/fitness/dataprovider/DataProvider$PathMapper;", "getType", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "", "selection", "selectionArgs", "sortOrder", "callPackage", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "call", "Landroid/os/Bundle;", "methodName", "arg", "extras", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrivacyProvider extends DataProvider {

    @NotNull
    public static final String PRIVACY_AGREE = "isPrivacyAgree";

    @NotNull
    private static final String TAG = "DataClearProvider";

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public Bundle call(@NotNull String methodName, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Logger.i(TAG, "call() called with: methodName = " + methodName + ", arg = " + arg + ", extras = " + extras);
        Bundle bundle = new Bundle();
        if (Intrinsics.areEqual(PRIVACY_AGREE, methodName)) {
            bundle.putBoolean("privacy_agree", RegionPreference.INSTANCE.getPRIVACY_AGREE());
        }
        return bundle;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(@NotNull DataProvider.PathMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Logger.i(TAG, "onRegisterPath() called with: mapper = " + mapper);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull String callPackage) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callPackage, "callPackage");
        return null;
    }
}
