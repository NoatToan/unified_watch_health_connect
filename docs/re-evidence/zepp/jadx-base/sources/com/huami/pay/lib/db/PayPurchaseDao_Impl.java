package com.huami.pay.lib.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class PayPurchaseDao_Impl implements PayPurchaseDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<PayPurchase> b;
    private final PurchaseSkuConvert c = new PurchaseSkuConvert();
    private final EntityDeletionOrUpdateAdapter<PayPurchase> d;

    public class a extends EntityInsertionAdapter<PayPurchase> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PayPurchase value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            if (value.getOrderId() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getOrderId());
            }
            if (value.getPurchaseToken() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getPurchaseToken());
            }
            String strSkuToJson = PayPurchaseDao_Impl.this.c.skuToJson(value.getSkus());
            if (strSkuToJson == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, strSkuToJson);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `pay_notification` (`userId`,`orderId`,`purchaseToken`,`skus`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<PayPurchase> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PayPurchase value) {
            if (value.getPurchaseToken() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getPurchaseToken());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `pay_notification` WHERE `purchaseToken` = ?";
        }
    }

    public PayPurchaseDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
    }

    @Override // com.huami.pay.lib.db.PayPurchaseDao
    public void deletePurchase(final PayPurchase payPurchase) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.handle(payPurchase);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.pay.lib.db.PayPurchaseDao
    public void insertPurchases(final PayPurchase payPurchase) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(payPurchase);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.pay.lib.db.PayPurchaseDao
    public List<PayPurchase> queryPurchases(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from pay_notification where userId =?", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "orderId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "purchaseToken");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "skus");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PayPurchase(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), this.c.jsonToSku(cursorQuery.getString(columnIndexOrThrow4))));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }
}
