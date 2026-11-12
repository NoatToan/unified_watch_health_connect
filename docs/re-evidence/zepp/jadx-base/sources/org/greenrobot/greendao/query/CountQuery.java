package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.util.Date;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes23.dex */
public class CountQuery<T> extends org.greenrobot.greendao.query.a<T> {
    private final b<T> a;

    public static final class b<T2> extends org.greenrobot.greendao.query.b<T2, CountQuery<T2>> {
        @Override // org.greenrobot.greendao.query.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public CountQuery<T2> a() {
            return new CountQuery<>(this, this.b, this.a, (String[]) this.c.clone());
        }

        private b(AbstractDao<T2, ?> abstractDao, String str, String[] strArr) {
            super(abstractDao, str, strArr);
        }
    }

    public static <T2> CountQuery<T2> a(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return new b(abstractDao, str, org.greenrobot.greendao.query.a.toStringArray(objArr)).b();
    }

    public long count() {
        checkThread();
        Cursor cursorRawQuery = this.dao.getDatabase().rawQuery(this.sql, this.parameters);
        try {
            if (!cursorRawQuery.moveToNext()) {
                throw new DaoException("No result for count");
            }
            if (!cursorRawQuery.isLast()) {
                throw new DaoException("Unexpected row count: " + cursorRawQuery.getCount());
            }
            if (cursorRawQuery.getColumnCount() == 1) {
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            }
            throw new DaoException("Unexpected column count: " + cursorRawQuery.getColumnCount());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public CountQuery<T> forCurrentThread() {
        return (CountQuery) this.a.c(this);
    }

    private CountQuery(b<T> bVar, AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        super(abstractDao, str, strArr);
        this.a = bVar;
    }

    @Override // org.greenrobot.greendao.query.a
    public CountQuery<T> setParameter(int i, Object obj) {
        return (CountQuery) super.setParameter(i, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    public CountQuery<T> setParameter(int i, Date date) {
        return (CountQuery) super.setParameter(i, date);
    }

    @Override // org.greenrobot.greendao.query.a
    public CountQuery<T> setParameter(int i, Boolean bool) {
        return (CountQuery) super.setParameter(i, bool);
    }
}
