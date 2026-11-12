package com.huami.wallet.accessdoor.api.cache;

import android.text.TextUtils;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0014\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/wallet/accessdoor/api/cache/DoorWebApiCache;", "", "", "clear", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "getDoorCardList", "cardList", "setDoorCardList", "Lcom/huami/nfc/door/DoorCardInfo;", "doorCardInfo", "updateDoorCardName", "", "aid", "updateDoorCardIsDefault", "updateDeleteDoorCard", "updateAddDoorCard", "", "a", "Ljava/util/List;", "doorInfoAndDefaultCardList", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class DoorWebApiCache {

    @NotNull
    public static final String TAG = "Wallet-DoorWebApiCache";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<DoorInfoAndDefaultCard> doorInfoAndDefaultCardList = new ArrayList();

    public final void clear() {
        synchronized (this.doorInfoAndDefaultCardList) {
            this.doorInfoAndDefaultCardList.clear();
            Unit unit = Unit.INSTANCE;
        }
        HMLog.i(TAG, "清除了DoorWebApiCache缓存", new Object[0]);
    }

    @Nullable
    public final List<DoorInfoAndDefaultCard> getDoorCardList() {
        return this.doorInfoAndDefaultCardList;
    }

    public final void setDoorCardList(@NotNull List<? extends DoorInfoAndDefaultCard> cardList) {
        synchronized (this.doorInfoAndDefaultCardList) {
            this.doorInfoAndDefaultCardList.clear();
            this.doorInfoAndDefaultCardList.addAll(cardList);
        }
    }

    public final void updateAddDoorCard(@NotNull DoorCardInfo doorCardInfo) {
        synchronized (this.doorInfoAndDefaultCardList) {
            this.doorInfoAndDefaultCardList.add(0, new DoorInfoAndDefaultCard(doorCardInfo, false));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void updateDeleteDoorCard(@NotNull String aid) {
        synchronized (this.doorInfoAndDefaultCardList) {
            Iterator<DoorInfoAndDefaultCard> it2 = this.doorInfoAndDefaultCardList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(it2.next().getDoorCardInfo().getAid(), aid)) {
                    it2.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void updateDoorCardIsDefault(@NotNull String aid) {
        synchronized (this.doorInfoAndDefaultCardList) {
            int i = 0;
            for (Object obj : this.doorInfoAndDefaultCardList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                this.doorInfoAndDefaultCardList.get(i).setIdDefaultCard(TextUtils.equals(((DoorInfoAndDefaultCard) obj).getDoorCardInfo().getAid(), aid));
                i = i2;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void updateDoorCardName(@NotNull DoorCardInfo doorCardInfo) {
        synchronized (this.doorInfoAndDefaultCardList) {
            int i = 0;
            for (Object obj : this.doorInfoAndDefaultCardList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DoorInfoAndDefaultCard doorInfoAndDefaultCard = (DoorInfoAndDefaultCard) obj;
                if (TextUtils.equals(doorInfoAndDefaultCard.getDoorCardInfo().getAid(), doorCardInfo.getAid())) {
                    doorInfoAndDefaultCard.setDoorCardInfo(doorCardInfo);
                    this.doorInfoAndDefaultCardList.set(i, doorInfoAndDefaultCard);
                }
                i = i2;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
