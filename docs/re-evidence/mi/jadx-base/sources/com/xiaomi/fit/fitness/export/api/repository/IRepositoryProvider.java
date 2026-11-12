package com.xiaomi.fit.fitness.export.api.repository;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\n0\u0003\"\u0004\b\u0001\u0010\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J1\u0010\u000b\u001a\u0002H\t\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\n0\u0003\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "", "getRepositoryByType", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getRepositoryClass", "Ljava/lang/Class;", "T", "R", "getRepository", "clazz", "(Ljava/lang/Class;)Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "getRainbowRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "getHomeDataRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "getDevicesListRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "getRedDotRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRepositoryProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider$Companion;", "", "<init>", "()V", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    IDevicesListRepository getDevicesListRepository();

    @NotNull
    IHomeDataRepository getHomeDataRepository();

    @NotNull
    IRainbowRepository getRainbowRepository();

    @NotNull
    IRedDotRepository getRedDotRepository();

    @NotNull
    <T extends IRepository<R>, R> T getRepository(@NotNull Class<T> clazz);

    @NotNull
    IRepository<? extends DailyBasicReport> getRepositoryByType(@NotNull HomeDataType dataType);

    @NotNull
    <T extends IRepository<R>, R> Class<T> getRepositoryClass(@NotNull HomeDataType dataType);
}
