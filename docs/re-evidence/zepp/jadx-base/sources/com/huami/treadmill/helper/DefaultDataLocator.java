package com.huami.treadmill.helper;

import android.app.Application;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.api.TdmillApi;
import com.huami.treadmill.api.TdmillApiImp;
import com.huami.treadmill.data.source.TdmillRepository;
import com.huami.treadmill.data.source.db.TreadmillDb;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\t\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/treadmill/helper/DefaultDataLocator;", "Lcom/huami/treadmill/helper/DataLocator;", "", "isNeedDb", "Lcom/huami/treadmill/data/source/TdmillRepository;", "getRepository", "Lcom/huami/treadmill/api/TdmillApi;", "getTdmillApi", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "b", "Z", "getUseInMemoryDb", "()Z", "useInMemoryDb", "Lcom/huami/treadmill/data/source/db/TreadmillDb;", "c", "Lkotlin/Lazy;", "()Lcom/huami/treadmill/data/source/db/TreadmillDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/treadmill/api/TdmillApiImp;", GoogleApiAvailabilityLight.a, "()Lcom/huami/treadmill/api/TdmillApiImp;", "api", "<init>", "(Landroid/app/Application;Z)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public class DefaultDataLocator implements DataLocator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean useInMemoryDb;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy db = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy api = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/api/TdmillApiImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<TdmillApiImp> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TdmillApiImp invoke() {
            return new TdmillApiImp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/data/source/db/TreadmillDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TreadmillDb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreadmillDb invoke() {
            return TreadmillDb.INSTANCE.create(DefaultDataLocator.this.getApp(), DefaultDataLocator.this.getUseInMemoryDb());
        }
    }

    public DefaultDataLocator(@NotNull Application application, boolean z) {
        this.app = application;
        this.useInMemoryDb = z;
    }

    private final TdmillApiImp a() {
        return (TdmillApiImp) this.api.getValue();
    }

    private final TreadmillDb b() {
        return (TreadmillDb) this.db.getValue();
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    @Override // com.huami.treadmill.helper.DataLocator
    @NotNull
    public TdmillRepository getRepository(boolean isNeedDb) {
        if (isNeedDb) {
            TreadmillDb treadmillDbB = b();
            AppExecutorsLocator.Companion companion = AppExecutorsLocator.INSTANCE;
            return new TdmillRepository(treadmillDbB, companion.instance().getMainExecutor(), companion.instance().getDiskIOExecutor(), getTdmillApi(), 0, 16, null);
        }
        if (isNeedDb) {
            throw new NoWhenBranchMatchedException();
        }
        AppExecutorsLocator.Companion companion2 = AppExecutorsLocator.INSTANCE;
        return new TdmillRepository(companion2.instance().getDiskIOExecutor(), companion2.instance().getMainExecutor(), getTdmillApi());
    }

    @Override // com.huami.treadmill.helper.DataLocator
    @NotNull
    public TdmillApi getTdmillApi() {
        return a();
    }

    public final boolean getUseInMemoryDb() {
        return this.useInMemoryDb;
    }
}
