package com.huami.userproperty.usecase;

import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;", "", "", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", Constant.METHOD_EXECUTE, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "propValuePersistence", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class GetAllLocalPropertiesUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence propValuePersistence;

    public GetAllLocalPropertiesUseCase(@NotNull KvPersistence kvPersistence) {
        this.propValuePersistence = kvPersistence;
    }

    @NotNull
    public final List<LocalProperty> execute() {
        String[] allKeys = this.propValuePersistence.getAllKeys();
        ArrayList arrayList = new ArrayList();
        for (String str : allKeys) {
            LocalProperty localProperty = (LocalProperty) this.propValuePersistence.getParcelableValue(str, LocalProperty.class);
            if (localProperty != null) {
                arrayList.add(localProperty);
            }
        }
        return arrayList;
    }
}
