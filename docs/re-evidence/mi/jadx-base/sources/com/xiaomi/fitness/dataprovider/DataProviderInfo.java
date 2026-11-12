package com.xiaomi.fitness.dataprovider;

import android.content.Context;
import android.text.TextUtils;
import defpackage.t40;
import defpackage.zbd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eBI\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0016\u0010\u0011\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0018\u00010\u000e\u0012\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR'\u0010\u0011\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderInfo;", "", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/dataprovider/DataProvider;", "getProvider", "(Landroid/content/Context;)Lcom/xiaomi/fitness/dataprovider/DataProvider;", "", "readPermission", "Ljava/lang/String;", "getReadPermission", "()Ljava/lang/String;", "writePermission", "getWritePermission", "", "Ljava/lang/Class;", "Lt40;", "filterTypes", "[Ljava/lang/Class;", "getFilterTypes", "()[Ljava/lang/Class;", "path", "getPath", "Lcom/xiaomi/fitness/dataprovider/DataProviderInfo$InstanceHolder;", "mHolder", "Lcom/xiaomi/fitness/dataprovider/DataProviderInfo$InstanceHolder;", "Lzbd;", "instanceFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Lzbd;)V", "Companion", "InstanceHolder", "data-provider-core_release"}, k = 1, mv = {2, 0, 0})
public final class DataProviderInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Class<? extends t40>[] filterTypes;

    @NotNull
    private final InstanceHolder mHolder;

    @NotNull
    private final String path;

    @NotNull
    private final String readPermission;

    @NotNull
    private final String writePermission;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderInfo$Companion;", "", "<init>", "()V", "requireValidatePath", "", "path", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDataProviderInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataProviderInfo.kt\ncom/xiaomi/fitness/dataprovider/DataProviderInfo$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String requireValidatePath(String path) {
            if (!(!TextUtils.isEmpty(path))) {
                throw new IllegalStateException("root path is empty".toString());
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) Marker.ANY_MARKER, false, 2, (Object) null) || StringsKt__StringsJVMKt.endsWith$default(path, "/", false, 2, null)) {
                throw new IllegalStateException("root path can't contains '*' or end with '/'.".toString());
            }
            return path;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u0010\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataProviderInfo$InstanceHolder;", "", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/dataprovider/DataProvider;", "get", "(Landroid/content/Context;)Lcom/xiaomi/fitness/dataprovider/DataProvider;", "", "mPath", "Ljava/lang/String;", "mInstance", "Ljava/lang/Object;", "Lzbd;", "mProviderInstanceFactory", "Lzbd;", "providerInstanceFactory", "path", "<init>", "(Lzbd;Ljava/lang/String;)V", "Companion", "data-provider-core_release"}, k = 1, mv = {2, 0, 0})
    public static final class InstanceHolder {

        @NotNull
        private static final Object INIT_OBJ = new Object();

        @Nullable
        private volatile Object mInstance;

        @NotNull
        private final String mPath;

        @NotNull
        private final zbd<? extends DataProvider> mProviderInstanceFactory;

        public InstanceHolder(@NotNull zbd<? extends DataProvider> providerInstanceFactory, @NotNull String path) {
            Intrinsics.checkNotNullParameter(providerInstanceFactory, "providerInstanceFactory");
            Intrinsics.checkNotNullParameter(path, "path");
            this.mPath = path;
            this.mInstance = INIT_OBJ;
            this.mProviderInstanceFactory = providerInstanceFactory;
        }

        @Nullable
        public final DataProvider get(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object obj = this.mInstance;
            Object obj2 = INIT_OBJ;
            if (obj != obj2) {
                return (DataProvider) this.mInstance;
            }
            synchronized (this) {
                if (this.mInstance != obj2) {
                    return (DataProvider) this.mInstance;
                }
                DataProvider dataProvider = this.mProviderInstanceFactory.get();
                Intrinsics.checkNotNullExpressionValue(dataProvider, "get(...)");
                DataProvider dataProvider2 = dataProvider;
                dataProvider2.attachContext(context);
                dataProvider2.attachRootPath(this.mPath);
                if (!dataProvider2.onCreate()) {
                    dataProvider2 = null;
                }
                this.mInstance = dataProvider2;
                return (DataProvider) this.mInstance;
            }
        }
    }

    public DataProviderInfo(@NotNull String readPermission, @NotNull String writePermission, @NotNull String path, @Nullable Class<? extends t40>[] clsArr, @NotNull zbd<? extends DataProvider> instanceFactory) {
        Intrinsics.checkNotNullParameter(readPermission, "readPermission");
        Intrinsics.checkNotNullParameter(writePermission, "writePermission");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        this.readPermission = readPermission;
        this.writePermission = writePermission;
        this.filterTypes = clsArr;
        this.path = INSTANCE.requireValidatePath(path);
        this.mHolder = new InstanceHolder(instanceFactory, path);
    }

    @Nullable
    public final Class<? extends t40>[] getFilterTypes() {
        return this.filterTypes;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final DataProvider getProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.mHolder.get(context);
    }

    @NotNull
    public final String getReadPermission() {
        return this.readPermission;
    }

    @NotNull
    public final String getWritePermission() {
        return this.writePermission;
    }
}
