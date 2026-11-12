package com.huami.bloodoxygen.core.repository;

import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate;
import com.huami.watch.notification.TransportUri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tJ8\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IClickSpo2Delegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOdiDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/ISyncLogDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IHttpDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IDataCacheDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "clickSpo2s", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "osaProcesses", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "osaEvents", "", TransportUri.ACTION_ADD, "", "clear", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodOxygenRepo extends IClickSpo2Delegate, IOdiDelegate, IOsaProcessDelegate, IOsaEventDelegate, IOriginOsaProcessDelegate, IOriginOsaEventDelegate, ISyncLogDelegate, IHttpDelegate, IDataCacheDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean add$default(IBloodOxygenRepo iBloodOxygenRepo, List list, List list2, List list3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i & 1) != 0) {
                list = new ArrayList();
            }
            if ((i & 2) != 0) {
                list2 = new ArrayList();
            }
            if ((i & 4) != 0) {
                list3 = new ArrayList();
            }
            return iBloodOxygenRepo.add(list, list2, list3);
        }
    }

    boolean add(@NotNull List<ClickMeasuredSpo2> clickSpo2s, @NotNull List<OriginOsaProcess> osaProcesses, @NotNull List<OriginOsaEvent> osaEvents);

    void clear();
}
