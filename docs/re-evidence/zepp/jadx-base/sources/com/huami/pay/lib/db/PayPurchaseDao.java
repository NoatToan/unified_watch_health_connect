package com.huami.pay.lib.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H'¨\u0006\u000b"}, d2 = {"Lcom/huami/pay/lib/db/PayPurchaseDao;", "", "", "userId", "", "Lcom/huami/pay/lib/db/PayPurchase;", "queryPurchases", "payPurchase", "", "insertPurchases", "deletePurchase", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public interface PayPurchaseDao {
    @Delete(entity = PayPurchase.class)
    void deletePurchase(@NotNull PayPurchase payPurchase);

    @Insert(onConflict = 1)
    void insertPurchases(@NotNull PayPurchase payPurchase);

    @Query("select * from pay_notification where userId =:userId")
    @NotNull
    List<PayPurchase> queryPurchases(@NotNull String userId);
}
