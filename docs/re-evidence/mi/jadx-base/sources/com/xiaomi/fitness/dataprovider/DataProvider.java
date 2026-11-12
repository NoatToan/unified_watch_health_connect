package com.xiaomi.fitness.dataprovider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import com.google.android.gms.actions.SearchIntents;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 E2\u00020\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H$J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0004J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001eJQ\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0002\u0010*J$\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010,J\u0012\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u0010-\u001a\u00020\u0006H\u0002J\u001b\u00101\u001a\u00020\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u0002030%H\u0002¢\u0006\u0002\u00104J\u001a\u00105\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u00106\u001a\u0004\u0018\u000107J-\u00108\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%¢\u0006\u0002\u00109J7\u0010:\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\b\u00106\u001a\u0004\u0018\u0001072\b\u0010&\u001a\u0004\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%¢\u0006\u0002\u0010;J\u0012\u0010>\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001eH&J&\u0010?\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010,H\u0014JS\u0010@\u001a\u0004\u0018\u00010#2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020\u0006H$¢\u0006\u0002\u0010*J\u001c\u0010A\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u00106\u001a\u0004\u0018\u000107H\u0016J-\u0010B\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%¢\u0006\u0002\u00109J9\u0010C\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\b\u00106\u001a\u0004\u0018\u0001072\b\u0010&\u001a\u0004\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%H\u0016¢\u0006\u0002\u0010;R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProvider;", "", "<init>", "()V", "mPathMap", "", "", "", "mUriMatcher", "Landroid/content/UriMatcher;", "mParseCallMethodLock", "mContext", "Landroid/content/Context;", "mRootPath", "mCallMethodHandlers", "", "Lcom/xiaomi/fitness/dataprovider/CallMethodHandler;", "attachRootPath", "", "rootPath", "onCreate", "", "onRegisterPath", "mapper", "Lcom/xiaomi/fitness/dataprovider/DataProvider$PathMapper;", "addSubPath", "subPath", "id", "matchPath", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "attachContext", "context", "handleGetType", "handleQuery", "Landroid/database/Cursor;", "projection", "", "selection", "selectionArgs", "sortOrder", "callPackage", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "handleCall", "Landroid/os/Bundle;", "methodName", "arg", "extras", "getCallMethodHandler", "performParseCallMethodIfNeed", "declaredMethods", "Ljava/lang/reflect/Method;", "([Ljava/lang/reflect/Method;)V", "handleInsert", Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "handleDelete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "handleUpdate", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "getContext", "()Landroid/content/Context;", "getType", "call", SearchIntents.EXTRA_QUERY, "insert", "delete", "update", "PathMapper", "Companion", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataProvider.kt\ncom/xiaomi/fitness/dataprovider/DataProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n1#2:288\n*E\n"})
public abstract class DataProvider {
    public static final int OPT_DELETE = 8;
    public static final int OPT_INSERT = 2;
    public static final int OPT_QUERY = 1;
    public static final int OPT_UPDATE = 4;
    public static final int ROOT = 1;

    @NotNull
    private static final String TAG = "DataProvider";

    @Nullable
    private List<CallMethodHandler> mCallMethodHandlers;

    @Nullable
    private Context mContext;

    @Nullable
    private String mRootPath;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Class<?>[] CALL_METHOD_PARAMS = {String.class, String.class, Bundle.class};

    @NotNull
    private final Map<String, Integer> mPathMap = new ArrayMap();

    @NotNull
    private final UriMatcher mUriMatcher = new UriMatcher(-1);

    @NotNull
    private final Object mParseCallMethodLock = new Object();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProvider$PathMapper;", "", "addPath", "", "path", "", "id", "", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PathMapper {
        void addPath(@NotNull String path, int id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSubPath(String subPath, int id) {
        String str;
        if (id == 1) {
            throw new IllegalStateException(("path " + subPath + ", id = " + id + ", is already use by root").toString());
        }
        String str2 = this.mRootPath;
        if (StringsKt__StringsJVMKt.startsWith$default(subPath, "/", false, 2, null)) {
            str = subPath;
        } else {
            str = "/" + subPath;
        }
        String str3 = str2 + str;
        Integer numPut = this.mPathMap.put(str3, Integer.valueOf(id));
        if (numPut == null) {
            this.mUriMatcher.addURI(Marker.ANY_MARKER, str3, id);
            return;
        }
        throw new IllegalStateException(("sub path " + subPath + " has already map to " + numPut).toString());
    }

    private final CallMethodHandler getCallMethodHandler(String methodName) {
        List<CallMethodHandler> list = this.mCallMethodHandlers;
        if (list == null) {
            return null;
        }
        Intrinsics.checkNotNull(list);
        for (CallMethodHandler callMethodHandler : list) {
            if (callMethodHandler.isMatch(methodName)) {
                return callMethodHandler;
            }
        }
        return null;
    }

    private final void performParseCallMethodIfNeed(Method[] declaredMethods) {
        if (this.mCallMethodHandlers != null) {
            return;
        }
        synchronized (this.mParseCallMethodLock) {
            try {
                if (this.mCallMethodHandlers != null) {
                    return;
                }
                for (Method method : declaredMethods) {
                    CallMethod callMethod = (CallMethod) method.getAnnotation(CallMethod.class);
                    if (callMethod != null) {
                        if (callMethod.value().length == 0 && TextUtils.isEmpty(callMethod.regex())) {
                            throw new IllegalStateException(("Not found method name in " + method).toString());
                        }
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (!Arrays.equals(parameterTypes, CALL_METHOD_PARAMS)) {
                            Intrinsics.checkNotNull(parameterTypes);
                            throw new IllegalStateException(("Not found method name in " + method + ", params : " + ArraysKt___ArraysKt.joinToString$default(parameterTypes, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)).toString());
                        }
                        if (this.mCallMethodHandlers == null) {
                            this.mCallMethodHandlers = new LinkedList();
                        }
                        List<CallMethodHandler> list = this.mCallMethodHandlers;
                        Intrinsics.checkNotNull(list);
                        ListExtKt.add(list, new CallMethodHandler(method, callMethod.value(), callMethod.regex()));
                    }
                }
                if (this.mCallMethodHandlers == null) {
                    this.mCallMethodHandlers = CollectionsKt__CollectionsKt.emptyList();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void attachContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        this.mContext = context;
    }

    public final void attachRootPath(@NotNull String rootPath) {
        Intrinsics.checkNotNullParameter(rootPath, "rootPath");
        if (this.mRootPath != null) {
            throw new IllegalStateException("root path already attached!".toString());
        }
        Objects.requireNonNull(rootPath);
        this.mRootPath = rootPath;
        this.mUriMatcher.addURI(Marker.ANY_MARKER, rootPath, 1);
        onRegisterPath(new PathMapper() { // from class: com.xiaomi.fitness.dataprovider.DataProvider.attachRootPath.2
            @Override // com.xiaomi.fitness.dataprovider.DataProvider.PathMapper
            public void addPath(String path, int id) {
                Intrinsics.checkNotNullParameter(path, "path");
                DataProvider.this.addSubPath(path, id);
            }
        });
    }

    @Nullable
    public Bundle call(@NotNull String methodName, @Nullable String arg, @Nullable Bundle extras) throws DataProviderException {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return null;
    }

    public final int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) throws DataProviderException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @NotNull
    public final Context getContext() {
        Context context = this.mContext;
        Objects.requireNonNull(context, "provider not attach context");
        Intrinsics.checkNotNull(context);
        return context;
    }

    @Nullable
    public abstract String getType(@NotNull Uri uri);

    @Nullable
    public final Bundle handleCall(@NotNull String methodName, @Nullable String arg, @Nullable Bundle extras) {
        Bundle bundleOnHandle;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        try {
            Method[] declaredMethods = getClass().getDeclaredMethods();
            Intrinsics.checkNotNull(declaredMethods);
            performParseCallMethodIfNeed(declaredMethods);
            CallMethodHandler callMethodHandler = getCallMethodHandler(methodName);
            if (callMethodHandler != null && (bundleOnHandle = callMethodHandler.onHandle(this, methodName, arg, extras)) != null) {
                return bundleOnHandle;
            }
            return call(methodName, arg, extras);
        } catch (DataProviderException e) {
            throw DataContentProvider.Companion.createReplyException$default(DataContentProvider.INSTANCE, e.getCode(), null, 2, null);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, "handleCall illegal state " + e2);
            throw DataContentProvider.INSTANCE.createReplyException(-2, e2);
        }
    }

    public final int handleDelete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            return delete(uri, selection, selectionArgs);
        } catch (DataProviderException e) {
            throw DataContentProvider.Companion.createReplyException$default(DataContentProvider.INSTANCE, e.getCode(), null, 2, null);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, "handleDelete illegal state " + e2);
            throw DataContentProvider.INSTANCE.createReplyException(-2, e2);
        }
    }

    @Nullable
    public final String handleGetType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.mUriMatcher.match(uri) == 1 ? "vnd.android.cursor.item/path_list" : getType(uri);
    }

    @Nullable
    public final Uri handleInsert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            return insert(uri, values);
        } catch (DataProviderException e) {
            throw DataContentProvider.Companion.createReplyException$default(DataContentProvider.INSTANCE, e.getCode(), null, 2, null);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, "handleInsert illegal state " + e2);
            throw DataContentProvider.INSTANCE.createReplyException(-2, e2);
        }
    }

    @Nullable
    public final Cursor handleQuery(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull String callPackage) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callPackage, "callPackage");
        if (this.mUriMatcher.match(uri) == 1) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"path"}, this.mPathMap.size());
            Iterator<String> it = this.mPathMap.keySet().iterator();
            while (it.hasNext()) {
                matrixCursor.addRow(new Object[]{it.next()});
            }
            return matrixCursor;
        }
        try {
            return query(uri, projection, selection, selectionArgs, sortOrder, callPackage);
        } catch (DataProviderException e) {
            int code = e.getCode();
            if (code != 0) {
                Logger.e(TAG, "handleQuery DataProviderException code " + code + ", " + e.getExtra());
                return DataUtils.obtainEmptyCursor(code, e.getExtra());
            }
            return DataUtils.obtainEmptyCursor(-2, null);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, "handleQuery illegal state " + e2);
            return DataUtils.obtainEmptyCursor(-2, null);
        }
    }

    public final int handleUpdate(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            return update(uri, values, selection, selectionArgs);
        } catch (DataProviderException e) {
            throw DataContentProvider.Companion.createReplyException$default(DataContentProvider.INSTANCE, e.getCode(), null, 2, null);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, "handleUpdate illegal state " + e2);
            throw DataContentProvider.INSTANCE.createReplyException(-2, e2);
        }
    }

    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) throws DataProviderException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final int matchPath(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.mUriMatcher.match(uri);
    }

    public final boolean onCreate() {
        return true;
    }

    public abstract void onRegisterPath(@NotNull PathMapper mapper);

    @Nullable
    public abstract Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull String callPackage) throws DataProviderException;

    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) throws DataProviderException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0019J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProvider$Companion;", "", "<init>", "()V", "ROOT", "", "OPT_QUERY", "OPT_INSERT", "OPT_UPDATE", "OPT_DELETE", "CALL_METHOD_PARAMS", "", "Ljava/lang/Class;", "getCALL_METHOD_PARAMS", "()[Ljava/lang/Class;", "[Ljava/lang/Class;", "TAG", "", "requireValidCursor", "Landroid/database/Cursor;", "cnt", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "cursorLiveData", "Landroidx/lifecycle/LiveData;", "cursor", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Class<?>[] getCALL_METHOD_PARAMS() {
            return DataProvider.CALL_METHOD_PARAMS;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /* JADX WARN: Code duplicated, block: B:29:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Cursor requireValidCursor(@NotNull Context cnt, @NotNull Uri uri, @Nullable LiveData<Cursor> cursorLiveData) throws Throwable {
            Cursor value;
            Cursor cursor;
            Intrinsics.checkNotNullParameter(cnt, "cnt");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Object obj = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (cursorLiveData != null) {
                try {
                    value = cursorLiveData.getValue();
                } catch (Throwable th) {
                    th = th;
                    cursor = (Cursor) obj;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.setNotificationUri(cnt.getContentResolver(), uri);
                    throw th;
                }
            } else {
                value = null;
            }
            Logger.i(DataProvider.TAG, "requireValidCursor, uri: " + uri + " , cursorLiveData: " + value);
            Object objTakeData = cursorLiveData != null ? LiveDataHelper.INSTANCE.takeData(cursorLiveData, 20, TimeUnit.SECONDS, null) : null;
            if (objTakeData != null) {
                Cursor cursor2 = (Cursor) objTakeData;
                cursor2.setNotificationUri(cnt.getContentResolver(), uri);
                return cursor2;
            }
            try {
                throw new DataProviderException(-4, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            } catch (Throwable th2) {
                obj = objTakeData;
                th = th2;
                cursor = (Cursor) obj;
                if (cursor != null) {
                    throw th;
                }
                cursor.setNotificationUri(cnt.getContentResolver(), uri);
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Cursor requireValidCursor(@NotNull Context cnt, @NotNull Uri uri, @Nullable Cursor cursor) throws DataProviderException {
            Intrinsics.checkNotNullParameter(cnt, "cnt");
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (cursor != null) {
                cursor.setNotificationUri(cnt.getContentResolver(), uri);
                return cursor;
            }
            throw new DataProviderException(-4, null, 2, 0 == true ? 1 : 0);
        }
    }
}
