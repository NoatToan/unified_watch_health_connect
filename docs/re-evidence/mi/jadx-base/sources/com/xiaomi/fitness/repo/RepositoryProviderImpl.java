package com.xiaomi.fitness.repo;

import com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRedDotRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J,\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0004\b\u0001\u0010\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J1\u0010\r\u001a\u0002H\u000b\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0004\b\u0001\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\nH\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/repo/RepositoryProviderImpl;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "<init>", "()V", "getRepositoryByType", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getRepositoryClass", "Ljava/lang/Class;", "T", "R", "getRepository", "clazz", "(Ljava/lang/Class;)Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "getRainbowRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "getHomeDataRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "getDevicesListRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "getRedDotRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RepositoryProviderImpl implements IRepositoryProvider {
    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IDevicesListRepository getDevicesListRepository() {
        return RepositoryManager.INSTANCE.getInstance().getDevicesListRepository();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IHomeDataRepository getHomeDataRepository() {
        return RepositoryManager.INSTANCE.getInstance().getHomeDataRepository();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IRainbowRepository getRainbowRepository() {
        return RepositoryManager.INSTANCE.getInstance().getRainbowRepository();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IRedDotRepository getRedDotRepository() {
        return RepositoryManager.INSTANCE.getInstance().getRedDotRepository();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public <T extends IRepository<R>, R> T getRepository(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) RepositoryManager.INSTANCE.getInstance().getRepository(clazz);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IRepository<? extends DailyBasicReport> getRepositoryByType(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return RepositoryManager.INSTANCE.getInstance().getRepositoryByType(dataType);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public <T extends IRepository<R>, R> Class<T> getRepositoryClass(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return RepositoryManager.INSTANCE.getInstance().getRepositoryClass(dataType);
    }
}
