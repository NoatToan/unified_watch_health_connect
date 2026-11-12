package com.xiaomi.fitness.dataprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.t40;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016JK\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J/\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0017J9\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\fH\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001bH\u0002J(\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010*\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020$H\u0002J \u0010-\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020$H\u0002J\"\u0010.\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u00102\u001a\u00020\u00052\u0006\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020\fH\u0002J\b\u00103\u001a\u000200H\u0002¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "check", "Lcom/xiaomi/fitness/dataprovider/DataProvider;", "method", "call", "Landroid/os/Bundle;", "arg", "extras", "performProviderCheck", "", "providerInfo", "Lcom/xiaomi/fitness/dataprovider/DataProviderInfo;", "provider", "handleIntercept", "opt", "isBaseRootUri", "requireDataProviderInfo", "checkReadPermission", "callingPackage", "info", "checkWritePermission", "checkNormalPermission", "ctx", "Landroid/content/Context;", "permission", "checkPrivilegedPermission", "requireCtx", "Companion", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataContentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataContentProvider.kt\ncom/xiaomi/fitness/dataprovider/DataContentProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class DataContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "DataContentProvider";

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0006\u001a\u00060\bj\u0002`\u00072\u0006\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataContentProvider$Companion;", "", "<init>", "()V", "TAG", "", "createReplyException", "Lkotlin/IllegalStateException;", "Ljava/lang/IllegalStateException;", "code", "", PluginDeviceInfo.FICONOFFLINE, "Lkotlin/Exception;", "Ljava/lang/Exception;", "(ILjava/lang/Exception;)Ljava/lang/IllegalStateException;", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ IllegalStateException createReplyException$default(Companion companion, int i, Exception exc, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                exc = null;
            }
            return companion.createReplyException(i, exc);
        }

        @JvmOverloads
        @NotNull
        public final IllegalStateException createReplyException(int i) {
            return createReplyException$default(this, i, null, 2, null);
        }

        @JvmOverloads
        @NotNull
        public final IllegalStateException createReplyException(int code, @Nullable Exception e) {
            if (code != 0) {
                return new IllegalStateException(String.valueOf(code), e);
            }
            throw new RuntimeException("code can't be 0");
        }
    }

    private final DataProvider check(Uri uri, String method) {
        DataProviderInfo dataProviderInfoRequireDataProviderInfo = requireDataProviderInfo(uri);
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            checkWritePermission(uri, callingPackage, dataProviderInfoRequireDataProviderInfo);
        }
        DataProvider provider = dataProviderInfoRequireDataProviderInfo.getProvider(requireCtx());
        performProviderCheck(uri, dataProviderInfoRequireDataProviderInfo, provider);
        Logger.i(TAG, method + " " + uri + " from " + getCallingPackage());
        return provider;
    }

    private final void checkNormalPermission(Uri uri, Context ctx, String permission) {
        if (TextUtils.isEmpty(permission)) {
            throw new SecurityException("Permission Denial: " + DataContentProvider.class.getName() + " uri " + uri + " permission is denial.");
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        Intrinsics.checkNotNull(permission);
        if (ctx.checkPermission(permission, callingPid, callingUid) == 0) {
            return;
        }
        throw new SecurityException("Permission Denial: " + this + "@DataContentProvider.javaClass.name uri " + uri + " from pid=" + callingPid + ", uid=" + callingUid + " requires " + permission);
    }

    private final boolean checkPrivilegedPermission(Context ctx, String callingPackage) {
        return DataProviderManager.INSTANCE.getInstance().isPrivilegedPackage(ctx, callingPackage);
    }

    private final void checkReadPermission(Uri uri, String callingPackage, DataProviderInfo info) {
        Context contextRequireCtx = requireCtx();
        if (checkPrivilegedPermission(contextRequireCtx, callingPackage)) {
            return;
        }
        checkNormalPermission(uri, contextRequireCtx, info.getReadPermission());
    }

    private final void checkWritePermission(Uri uri, String callingPackage, DataProviderInfo info) {
        Context contextRequireCtx = requireCtx();
        if (checkPrivilegedPermission(contextRequireCtx, callingPackage)) {
            return;
        }
        checkNormalPermission(uri, contextRequireCtx, info.getWritePermission());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int handleIntercept(DataProviderInfo providerInfo, DataProvider provider, Uri uri, int opt) {
        DataProviderManager companion = DataProviderManager.INSTANCE.getInstance();
        Context contextRequireCtx = requireCtx();
        String callingPackage = getCallingPackage();
        int iOnIntercept = companion.onIntercept(contextRequireCtx, providerInfo, uri, opt, callingPackage == null ? "" : callingPackage);
        if (iOnIntercept != 0 || !(provider instanceof t40)) {
            return iOnIntercept;
        }
        t40 t40Var = (t40) provider;
        Context contextRequireCtx2 = requireCtx();
        String callingPackage2 = getCallingPackage();
        return t40Var.onAcceptAccess(contextRequireCtx2, uri, opt, callingPackage2 != null ? callingPackage2 : "");
    }

    private final boolean isBaseRootUri(Uri uri) {
        return TextUtils.isEmpty(uri.getPath());
    }

    private final void performProviderCheck(Uri uri, DataProviderInfo providerInfo, DataProvider provider) {
        if (provider == null) {
            throw Companion.createReplyException$default(INSTANCE, -1, null, 2, null);
        }
        int iHandleIntercept = handleIntercept(providerInfo, provider, uri, 2);
        if (iHandleIntercept != 0) {
            throw Companion.createReplyException$default(INSTANCE, iHandleIntercept, null, 2, null);
        }
    }

    private final Context requireCtx() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("context is null");
    }

    private final DataProviderInfo requireDataProviderInfo(Uri uri) {
        DataProviderInfo deployDataProviderInfo = DataProviderManager.INSTANCE.getInstance().getDeployDataProviderInfo(uri);
        if (deployDataProviderInfo != null) {
            return deployDataProviderInfo;
        }
        throw new SecurityException("Permission Denial: " + DataContentProvider.class.getName() + " uri " + uri + " no provider deploy.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!StringsKt__StringsJVMKt.startsWith$default(method, "content://", false, 2, null)) {
            throw new IllegalArgumentException(("illegal call method: " + method + ", method example: content://xxx.xxx/your/path#method_name").toString());
        }
        try {
            Uri uri = Uri.parse(method);
            String fragment = uri.getFragment();
            if (fragment == null || fragment.length() == 0) {
                throw new IllegalArgumentException(("can't found method : " + method).toString());
            }
            DataProviderInfo dataProviderInfoRequireDataProviderInfo = requireDataProviderInfo(uri);
            String callingPackage = getCallingPackage();
            if (callingPackage != null) {
                checkReadPermission(uri, callingPackage, dataProviderInfoRequireDataProviderInfo);
            }
            DataProvider provider = dataProviderInfoRequireDataProviderInfo.getProvider(requireCtx());
            performProviderCheck(uri, dataProviderInfoRequireDataProviderInfo, provider);
            Logger.i(TAG, "Call " + method + " from " + getCallingPackage() + ", " + uri);
            Intrinsics.checkNotNull(provider);
            return provider.handleCall(fragment, arg, extras);
        } catch (Exception e) {
            throw new IllegalArgumentException("parse method uri failure: " + method, e);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        DataProvider dataProviderCheck = check(uri, "Delete");
        Intrinsics.checkNotNull(dataProviderCheck);
        return dataProviderCheck.handleDelete(uri, selection, selectionArgs);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        String strHandleGetType;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.i(TAG, "getType uri:" + uri);
        if (isBaseRootUri(uri)) {
            strHandleGetType = "vnd.android.cursor.item/none";
        } else {
            DataProvider provider = requireDataProviderInfo(uri).getProvider(requireCtx());
            strHandleGetType = provider != null ? provider.handleGetType(uri) : null;
        }
        Logger.i(TAG, "get type result:" + strHandleGetType);
        return strHandleGetType;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        DataProvider dataProviderCheck = check(uri, "Insert");
        Intrinsics.checkNotNull(dataProviderCheck);
        return dataProviderCheck.handleInsert(uri, values);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (isBaseRootUri(uri)) {
            return null;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            return DataUtils.obtainEmptyCursor(-3, null);
        }
        DataProviderInfo dataProviderInfoRequireDataProviderInfo = requireDataProviderInfo(uri);
        checkReadPermission(uri, callingPackage, dataProviderInfoRequireDataProviderInfo);
        DataProvider provider = dataProviderInfoRequireDataProviderInfo.getProvider(requireCtx());
        if (provider == null) {
            return DataUtils.obtainEmptyCursor(-1, null);
        }
        int iHandleIntercept = handleIntercept(dataProviderInfoRequireDataProviderInfo, provider, uri, 1);
        if (iHandleIntercept != 0) {
            return DataUtils.obtainEmptyCursor(iHandleIntercept, null);
        }
        Logger.i(TAG, "Query " + uri + " from " + callingPackage);
        return provider.handleQuery(uri, projection, selection, selectionArgs, sortOrder, callingPackage);
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        DataProvider dataProviderCheck = check(uri, "Update");
        Intrinsics.checkNotNull(dataProviderCheck);
        return dataProviderCheck.handleUpdate(uri, values, selection, selectionArgs);
    }
}
