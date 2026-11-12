package com.xiaomi.fitness.sport_manager.db;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager.db.SCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import defpackage.lcn;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/db/SCMRepository;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISCMRepository;", "", DailyRecordKey.sportType, "Llcn;", "getSportRemindTable", "(I)Llcn;", "Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "getScmDao", "()Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "<init>", "()V", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SCMRepository implements ISCMRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SCMRepository> instanse$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: x6l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SCMRepository.instanse_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/db/SCMRepository$Companion;", "", "<init>", "()V", "instanse", "Lcom/xiaomi/fitness/sport_manager/db/SCMRepository;", "getInstanse", "()Lcom/xiaomi/fitness/sport_manager/db/SCMRepository;", "instanse$delegate", "Lkotlin/Lazy;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SCMRepository getInstanse() {
            return (SCMRepository) SCMRepository.instanse$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMRepository instanse_delegate$lambda$0() {
        return new SCMRepository();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository
    @NotNull
    public SCMDao getScmDao() {
        return SCMDatabase.INSTANCE.getInstance().scmDao();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository
    @Nullable
    public lcn getSportRemindTable(int sportType) {
        return getScmDao().getSportConfigModel(sportType);
    }
}
