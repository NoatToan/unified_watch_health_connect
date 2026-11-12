package com.xiaomi.fitness.dataprovider;

import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import androidx.collection.ArrayMap;
import androidx.collection.SparseArrayCompat;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SignatureUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.onetrack.OneTrack;
import defpackage.t40;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u000254B\t\b\u0002¢\u0006\u0004\b2\u00103J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u000b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\"\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00101\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderManager;", "", "Ljava/lang/Class;", "Lt40;", "filterType", "createAccessFilter", "(Ljava/lang/Class;)Lt40;", "onCreateAccessFilter", "", OneTrack.Param.PKG, "sign", "", "addWhiteList", "(Ljava/lang/String;Ljava/lang/String;)V", "removeWhiteList", "(Ljava/lang/String;)V", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Lcom/xiaomi/fitness/dataprovider/DataProviderInfo;", "getDeployDataProviderInfo", "(Landroid/net/Uri;)Lcom/xiaomi/fitness/dataprovider/DataProviderInfo;", "Landroid/content/Context;", "context", "callingPackage", "", "isPrivilegedPackage", "(Landroid/content/Context;Ljava/lang/String;)Z", "", "infos", "deploy", "(Ljava/util/List;)V", "providerInfo", "", "opt", "onIntercept", "(Landroid/content/Context;Lcom/xiaomi/fitness/dataprovider/DataProviderInfo;Landroid/net/Uri;ILjava/lang/String;)I", "Landroidx/collection/SparseArrayCompat;", "mRegProviders", "Landroidx/collection/SparseArrayCompat;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mRegisterAlloc", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "mWhiteList", "Ljava/util/Map;", "mGrantedApps", "Landroid/content/UriMatcher;", "mPathMatcher", "Landroid/content/UriMatcher;", "mFilterMap", "<init>", "()V", "Companion", "Holder", "data-provider-core_release"}, k = 1, mv = {2, 0, 0})
public final class DataProviderManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "DataProviderManager";

    @NotNull
    private static final String[] sInternalSignatures;

    @NotNull
    private final Map<Class<? extends t40>, t40> mFilterMap;

    @NotNull
    private final Map<Integer, String> mGrantedApps;

    @NotNull
    private final UriMatcher mPathMatcher;

    @NotNull
    private final SparseArrayCompat<DataProviderInfo> mRegProviders;

    @NotNull
    private final AtomicInteger mRegisterAlloc;

    @NotNull
    private final Map<String, String> mWhiteList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderManager$Companion;", "", "<init>", "()V", "TAG", "", "sInternalSignatures", "", "[Ljava/lang/String;", "getInstance", "Lcom/xiaomi/fitness/dataprovider/DataProviderManager;", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DataProviderManager getInstance() {
            return Holder.INSTANCE.getInstance();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderManager$Holder;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/dataprovider/DataProviderManager;", "getInstance", "()Lcom/xiaomi/fitness/dataprovider/DataProviderManager;", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Holder {

        @NotNull
        public static final Holder INSTANCE = new Holder();

        @NotNull
        private static final DataProviderManager instance = new DataProviderManager(null);

        private Holder() {
        }

        @NotNull
        public final DataProviderManager getInstance() {
            return instance;
        }
    }

    static {
        String[] strArr = {"7B6DC7079C34739CE81159719FB5EB61D2A03225", "B3D1CE9C2C6403E9685324BCD57F677B13A53174"};
        Arrays.sort(strArr);
        sInternalSignatures = strArr;
    }

    public /* synthetic */ DataProviderManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final t40 createAccessFilter(Class<? extends t40> filterType) {
        t40 t40VarOnCreateAccessFilter;
        synchronized (this.mFilterMap) {
            try {
                t40VarOnCreateAccessFilter = this.mFilterMap.get(filterType);
                if (t40VarOnCreateAccessFilter == null && (t40VarOnCreateAccessFilter = onCreateAccessFilter(filterType)) != null) {
                    this.mFilterMap.put(filterType, t40VarOnCreateAccessFilter);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t40VarOnCreateAccessFilter;
    }

    private final t40 onCreateAccessFilter(Class<? extends t40> filterType) {
        try {
            return filterType.newInstance();
        } catch (Exception e) {
            Logger.e(TAG, "create access filter fail: " + filterType + ", " + e);
            return null;
        }
    }

    public final void addWhiteList(@NotNull String pkg, @NotNull String sign) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Map<String, String> map = this.mWhiteList;
        Objects.requireNonNull(pkg);
        Objects.requireNonNull(sign);
        map.put(pkg, sign);
    }

    public final void deploy(@Nullable List<DataProviderInfo> infos) {
        if (infos == null || infos.isEmpty()) {
            return;
        }
        for (DataProviderInfo dataProviderInfo : infos) {
            int andIncrement = this.mRegisterAlloc.getAndIncrement();
            this.mPathMatcher.addURI(Marker.ANY_MARKER, dataProviderInfo.getPath(), andIncrement);
            this.mPathMatcher.addURI(Marker.ANY_MARKER, dataProviderInfo.getPath() + "/*", andIncrement);
            this.mRegProviders.put(andIncrement, dataProviderInfo);
        }
    }

    @Nullable
    public final DataProviderInfo getDeployDataProviderInfo(@NotNull Uri uri) {
        DataProviderInfo dataProviderInfo;
        Intrinsics.checkNotNullParameter(uri, "uri");
        synchronized (this.mRegProviders) {
            int iMatch = this.mPathMatcher.match(uri);
            dataProviderInfo = iMatch == -1 ? null : this.mRegProviders.get(iMatch);
        }
        return dataProviderInfo;
    }

    public final boolean isPrivilegedPackage(@NotNull Context context, @NotNull String callingPackage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callingPackage, "callingPackage");
        int callingUid = Binder.getCallingUid();
        String str = this.mGrantedApps.get(Integer.valueOf(callingUid));
        if (str != null && Intrinsics.areEqual(str, callingPackage)) {
            return true;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(callingPackage, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            if ((applicationInfo.flags & 129) != 0) {
                this.mGrantedApps.put(Integer.valueOf(callingUid), callingPackage);
                Logger.d(TAG, "Privileged type: system");
                return true;
            }
            String signature = SignatureUtils.INSTANCE.getSignature(context, callingPackage);
            if (Arrays.binarySearch(sInternalSignatures, signature) >= 0) {
                this.mGrantedApps.put(Integer.valueOf(callingUid), callingPackage);
                Logger.d(TAG, "Privileged type: internal");
                return true;
            }
            String str2 = this.mWhiteList.get(callingPackage);
            if (str2 != null && StringsKt__StringsJVMKt.equals(str2, signature, true)) {
                this.mGrantedApps.put(Integer.valueOf(callingUid), callingPackage);
                Logger.d(TAG, "Privileged type: white list");
                return true;
            }
            if ((context.getApplicationInfo().flags & 2) != 0) {
                this.mGrantedApps.put(Integer.valueOf(callingUid), callingPackage);
                Logger.d(TAG, "Privileged -- for debug");
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final int onIntercept(@NotNull Context context, @NotNull DataProviderInfo providerInfo, @NotNull Uri uri, int opt, @NotNull String callingPackage) {
        t40 t40VarCreateAccessFilter;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(providerInfo, "providerInfo");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callingPackage, "callingPackage");
        Class<? extends t40>[] filterTypes = providerInfo.getFilterTypes();
        int iOnAcceptAccess = 0;
        if (filterTypes != null && filterTypes.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(filterTypes);
            while (it.hasNext() && ((t40VarCreateAccessFilter = createAccessFilter((Class) it.next())) == null || (iOnAcceptAccess = t40VarCreateAccessFilter.onAcceptAccess(context, uri, opt, callingPackage)) == 0)) {
            }
        }
        return iOnAcceptAccess;
    }

    public final void removeWhiteList(@NotNull String pkg) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Map<String, String> map = this.mWhiteList;
        Objects.requireNonNull(pkg);
        map.remove(pkg);
    }

    private DataProviderManager() {
        this.mRegProviders = new SparseArrayCompat<>();
        this.mRegisterAlloc = new AtomicInteger(1);
        this.mWhiteList = new ConcurrentHashMap();
        this.mGrantedApps = new ConcurrentHashMap();
        this.mPathMatcher = new UriMatcher(-1);
        this.mFilterMap = new ArrayMap(5);
    }
}
