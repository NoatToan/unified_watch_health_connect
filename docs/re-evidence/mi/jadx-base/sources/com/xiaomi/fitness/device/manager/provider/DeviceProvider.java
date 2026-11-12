package com.xiaomi.fitness.device.manager.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002JO\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001e\u001a\u00020\tH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J1\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010$J;\u0010%\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/device/manager/provider/DeviceProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "mAuthority", "", "mMatcher", "Landroid/content/UriMatcher;", "onCreate", "", "attachInfo", "", "context", "Landroid/content/Context;", "info", "Landroid/content/pm/ProviderInfo;", "registerAuthority", "authority", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "projection", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "queryDeviceStatus", "isHuanji", "insert", Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceProvider extends ContentProvider {

    @NotNull
    private static final String[] DEFAULT_DEVICE_PROJECTION = {"device_name", DeviceContractKt.COLUMN_DEVICE_BATTERY, DeviceContractKt.COLUMN_DEVICE_TYPE, "device_icon"};
    private static final int MATCH_DEVICE_STATUS = 0;

    @NotNull
    private static final String TAG = "DeviceStatusProvider";
    private String mAuthority;
    private UriMatcher mMatcher;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.provider.DeviceProvider$queryDeviceStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.provider.DeviceProvider$queryDeviceStatus$1", f = "DeviceProvider.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = this.$deviceModel;
                this.label = 1;
                obj = DeviceModelExtKt.getBattery(wearableDeviceModel, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean isHuanji() {
        return Intrinsics.areEqual(getCallingPackage(), "com.miui.huanji") || Intrinsics.areEqual(getCallingPackage(), "com.miui.backup");
    }

    private final Cursor queryDeviceStatus() {
        WearableDeviceModel wearableDeviceModel;
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(TAG, "queryDeviceStatus() called ");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
            return null;
        }
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("queryDeviceStatus dm = " + com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel) + " , isconnect = " + wearableDeviceModel.getIsDeviceConnected() + ", callingPackage = " + getCallingPackage());
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(DEFAULT_DEVICE_PROJECTION);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("device_name", com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(wearableDeviceModel));
        rowBuilderNewRow.add(DeviceContractKt.COLUMN_DEVICE_TYPE, Integer.valueOf(com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBandType(wearableDeviceModel) ? 1 : 2));
        rowBuilderNewRow.add(DeviceContractKt.COLUMN_DEVICE_BATTERY, BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(wearableDeviceModel, null), 1, null));
        rowBuilderNewRow.add("device_icon", wearableDeviceModel.getProduct().getBigIcon());
        return matrixCursor;
    }

    private final void registerAuthority(String authority) {
        this.mAuthority = authority;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.mMatcher = uriMatcher;
        String str = this.mAuthority;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAuthority");
            str = null;
        }
        uriMatcher.addURI(str, "status", 0);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@Nullable Context context, @Nullable ProviderInfo info) {
        if (info != null) {
            String authority = info.authority;
            Intrinsics.checkNotNullExpressionValue(authority, "authority");
            registerAuthority(authority);
        }
        super.attachInfo(context, info);
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        UriMatcher uriMatcher = this.mMatcher;
        if (uriMatcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMatcher");
            uriMatcher = null;
        }
        if (uriMatcher.match(uri) == 0) {
            return queryDeviceStatus();
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new UnsupportedOperationException();
    }
}
