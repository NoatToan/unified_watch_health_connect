package org.greenrobot.greendao.test;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomMasterTable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import junit.framework.TestCase;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoLog;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractDaoTestSinglePk<D extends AbstractDao<T, K>, T, K> extends AbstractDaoTest<D, T, K> {
    private Property b;
    public Set<K> usedPks;

    public AbstractDaoTestSinglePk(Class<D> cls) {
        super(cls);
        this.usedPks = new HashSet();
    }

    public boolean checkKeyIsNullable() {
        if (createEntity(null) != null) {
            return true;
        }
        DaoLog.d("Test is not available for entities with non-null keys");
        return false;
    }

    public abstract T createEntity(K k);

    public T createEntityWithRandomPk() {
        return createEntity(nextPk());
    }

    public abstract K createRandomPk();

    public K nextPk() {
        for (int i = 0; i < 100000; i++) {
            K kCreateRandomPk = createRandomPk();
            if (this.usedPks.add(kCreateRandomPk)) {
                return kCreateRandomPk;
            }
        }
        throw new IllegalStateException("Could not find a new PK");
    }

    public Cursor queryWithDummyColumnsInFront(int i, String str, K k) {
        StringBuilder sb = new StringBuilder("SELECT ");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str);
            sb.append(",");
        }
        SqlUtils.appendColumns(sb, ExifInterface.GPS_DIRECTION_TRUE, this.dao.getAllColumns()).append(" FROM ");
        sb.append('\"');
        sb.append(this.dao.getTablename());
        sb.append('\"');
        sb.append(" T");
        if (k != null) {
            sb.append(" WHERE ");
            TestCase.assertEquals(1, this.dao.getPkColumns().length);
            sb.append(this.dao.getPkColumns()[0]);
            sb.append(SearchCriteria.EQ);
            DatabaseUtils.appendValueToSql(sb, k);
        }
        Cursor cursorRawQuery = this.db.rawQuery(sb.toString(), null);
        TestCase.assertTrue(cursorRawQuery.moveToFirst());
        for (int i3 = 0; i3 < i; i3++) {
            try {
                TestCase.assertEquals(str, cursorRawQuery.getString(i3));
            } catch (RuntimeException e) {
                cursorRawQuery.close();
                throw e;
            }
        }
        if (k != null) {
            TestCase.assertEquals(1, cursorRawQuery.getCount());
        }
        return cursorRawQuery;
    }

    public void runLoadPkTest(int i) {
        K kNextPk = nextPk();
        this.dao.insert(createEntity(kNextPk));
        Cursor cursorQueryWithDummyColumnsInFront = queryWithDummyColumnsInFront(i, RoomMasterTable.DEFAULT_ID, kNextPk);
        try {
            TestCase.assertEquals(kNextPk, this.daoAccess.readKey(cursorQueryWithDummyColumnsInFront, i));
        } finally {
            cursorQueryWithDummyColumnsInFront.close();
        }
    }

    @Override // org.greenrobot.greendao.test.AbstractDaoTest, org.greenrobot.greendao.test.DbTest
    public void setUp() throws Exception {
        super.setUp();
        for (Property property : this.daoAccess.getProperties()) {
            if (property.primaryKey) {
                if (this.b != null) {
                    throw new RuntimeException("Test does not work with multiple PK columns");
                }
                this.b = property;
            }
        }
        if (this.b == null) {
            throw new RuntimeException("Test does not work without a PK column");
        }
    }

    public void testCount() {
        this.dao.deleteAll();
        TestCase.assertEquals(0L, this.dao.count());
        this.dao.insert(createEntityWithRandomPk());
        TestCase.assertEquals(1L, this.dao.count());
        this.dao.insert(createEntityWithRandomPk());
        TestCase.assertEquals(2L, this.dao.count());
    }

    public void testDelete() {
        K kNextPk = nextPk();
        this.dao.deleteByKey(kNextPk);
        this.dao.insert(createEntity(kNextPk));
        TestCase.assertNotNull(this.dao.load(kNextPk));
        this.dao.deleteByKey(kNextPk);
        TestCase.assertNull(this.dao.load(kNextPk));
    }

    public void testDeleteAll() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        this.dao.deleteAll();
        TestCase.assertEquals(0L, this.dao.count());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            K key = this.daoAccess.getKey((T) it2.next());
            TestCase.assertNotNull(key);
            TestCase.assertNull(this.dao.load(key));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void testDeleteByKeyInTx() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.daoAccess.getKey((T) arrayList.get(0)));
        arrayList2.add(this.daoAccess.getKey((T) arrayList.get(3)));
        arrayList2.add(this.daoAccess.getKey((T) arrayList.get(4)));
        arrayList2.add(this.daoAccess.getKey((T) arrayList.get(8)));
        this.dao.deleteByKeyInTx(arrayList2);
        TestCase.assertEquals(arrayList.size() - arrayList2.size(), this.dao.count());
        for (Object obj : arrayList2) {
            TestCase.assertNotNull(obj);
            TestCase.assertNull(this.dao.load(obj));
        }
    }

    public void testDeleteInTx() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList.get(0));
        arrayList2.add(arrayList.get(3));
        arrayList2.add(arrayList.get(4));
        arrayList2.add(arrayList.get(8));
        this.dao.deleteInTx(arrayList2);
        TestCase.assertEquals(arrayList.size() - arrayList2.size(), this.dao.count());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            K key = this.daoAccess.getKey((T) it2.next());
            TestCase.assertNotNull(key);
            TestCase.assertNull(this.dao.load(key));
        }
    }

    public void testInsertAndLoad() {
        K kNextPk = nextPk();
        T tCreateEntity = createEntity(kNextPk);
        this.dao.insert(tCreateEntity);
        TestCase.assertEquals(kNextPk, this.daoAccess.getKey(tCreateEntity));
        Object objLoad = this.dao.load(kNextPk);
        TestCase.assertNotNull(objLoad);
        TestCase.assertEquals(this.daoAccess.getKey(tCreateEntity), this.daoAccess.getKey((T) objLoad));
    }

    public void testInsertInTx() {
        this.dao.deleteAll();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 20; i++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        TestCase.assertEquals(arrayList.size(), this.dao.count());
    }

    public void testInsertOrReplaceInTx() {
        this.dao.deleteAll();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 20; i++) {
            T tCreateEntityWithRandomPk = createEntityWithRandomPk();
            if (i % 2 == 0) {
                arrayList.add(tCreateEntityWithRandomPk);
            }
            arrayList2.add(tCreateEntityWithRandomPk);
        }
        this.dao.insertOrReplaceInTx(arrayList);
        this.dao.insertOrReplaceInTx(arrayList2);
        TestCase.assertEquals(arrayList2.size(), this.dao.count());
    }

    public void testInsertOrReplaceTwice() {
        T tCreateEntityWithRandomPk = createEntityWithRandomPk();
        long jInsert = this.dao.insert(tCreateEntityWithRandomPk);
        long jInsertOrReplace = this.dao.insertOrReplace(tCreateEntityWithRandomPk);
        if (this.dao.getPkProperty().type == Long.class) {
            TestCase.assertEquals(jInsert, jInsertOrReplace);
        }
    }

    public void testInsertTwice() {
        T tCreateEntity = createEntity(nextPk());
        this.dao.insert(tCreateEntity);
        try {
            this.dao.insert(tCreateEntity);
            TestCase.fail("Inserting twice should not work");
        } catch (SQLException unused) {
        }
    }

    public void testLoadAll() {
        this.dao.deleteAll();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add(createEntity(nextPk()));
        }
        this.dao.insertInTx(arrayList);
        TestCase.assertEquals(arrayList.size(), this.dao.loadAll().size());
    }

    public void testLoadPk() {
        runLoadPkTest(0);
    }

    public void testLoadPkWithOffset() {
        runLoadPkTest(10);
    }

    public void testQuery() {
        this.dao.insert(createEntityWithRandomPk());
        K kNextPk = nextPk();
        this.dao.insert(createEntity(kNextPk));
        this.dao.insert(createEntityWithRandomPk());
        List<T> listQueryRaw = this.dao.queryRaw("WHERE " + this.dao.getPkColumns()[0] + "=?", kNextPk.toString());
        TestCase.assertEquals(1, listQueryRaw.size());
        TestCase.assertEquals(kNextPk, this.daoAccess.getKey(listQueryRaw.get(0)));
    }

    public void testReadWithOffset() {
        K kNextPk = nextPk();
        this.dao.insert(createEntity(kNextPk));
        Cursor cursorQueryWithDummyColumnsInFront = queryWithDummyColumnsInFront(5, RoomMasterTable.DEFAULT_ID, kNextPk);
        try {
            TestCase.assertEquals(kNextPk, this.daoAccess.getKey(this.daoAccess.readEntity(cursorQueryWithDummyColumnsInFront, 5)));
        } finally {
            cursorQueryWithDummyColumnsInFront.close();
        }
    }

    public void testRowId() {
        TestCase.assertTrue(this.dao.insert(createEntityWithRandomPk()) != this.dao.insert(createEntityWithRandomPk()));
    }

    public void testSave() {
        if (checkKeyIsNullable()) {
            this.dao.deleteAll();
            T tCreateEntity = createEntity(null);
            if (tCreateEntity != null) {
                this.dao.save(tCreateEntity);
                this.dao.save(tCreateEntity);
                TestCase.assertEquals(1L, this.dao.count());
            }
        }
    }

    public void testSaveInTx() {
        if (checkKeyIsNullable()) {
            this.dao.deleteAll();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 20; i++) {
                T tCreateEntity = createEntity(null);
                if (i % 2 == 0) {
                    arrayList.add(tCreateEntity);
                }
                arrayList2.add(tCreateEntity);
            }
            this.dao.saveInTx(arrayList);
            this.dao.saveInTx(arrayList2);
            TestCase.assertEquals(arrayList2.size(), this.dao.count());
        }
    }

    public void testUpdate() {
        this.dao.deleteAll();
        T tCreateEntityWithRandomPk = createEntityWithRandomPk();
        this.dao.insert(tCreateEntityWithRandomPk);
        this.dao.update(tCreateEntityWithRandomPk);
        TestCase.assertEquals(1L, this.dao.count());
    }
}
