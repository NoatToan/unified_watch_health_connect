package com.xiaomi.hm.health.ui.pai;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.db.PaiDb;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai_service.PaiDo;
import com.huami.pai_service.PaiDoService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/PaiDoServiceImp;", "Lcom/huami/pai_service/PaiDoService;", "", GoogleApiAvailabilityLight.b, "", "Lcom/huami/pai_service/PaiDo;", "getPaiList", "Lcom/huami/pai/db/PaiDb;", "a", "Lcom/huami/pai/db/PaiDb;", "dbRepo", "<init>", "(Lcom/huami/pai/db/PaiDb;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PaiDoServiceImp implements PaiDoService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PaiDb dbRepo;

    public PaiDoServiceImp(@NotNull PaiDb paiDb) {
        this.dbRepo = paiDb;
    }

    @Override // com.huami.pai_service.PaiDoService
    @Nullable
    public List<PaiDo> getPaiList(int n) {
        Object objM3845constructorimpl;
        List mutableList;
        try {
            Result.Companion companion = Result.Companion;
            List<PAIDataVo> countPaiList = this.dbRepo.paiUserDB().getCountPaiList(n);
            if (countPaiList == null) {
                mutableList = null;
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(countPaiList, 10));
                Iterator<T> it2 = countPaiList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(PaiDoServiceImpKt.toPaiDo((PAIDataVo) it2.next()));
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(mutableList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
