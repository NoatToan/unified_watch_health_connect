package org.greenrobot.greendao.query;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.apihint.Internal;
import org.greenrobot.greendao.rx.RxQuery;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes23.dex */
public class Query<T> extends c<T> {
    private final b<T> a;
    private volatile RxQuery b;
    private volatile RxQuery c;

    public static final class b<T2> extends org.greenrobot.greendao.query.b<T2, Query<T2>> {
        private final int e;
        private final int f;

        public b(AbstractDao<T2, ?> abstractDao, String str, String[] strArr, int i, int i2) {
            super(abstractDao, str, strArr);
            this.e = i;
            this.f = i2;
        }

        @Override // org.greenrobot.greendao.query.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Query<T2> a() {
            return new Query<>(this, this.b, this.a, (String[]) this.c.clone(), this.e, this.f);
        }
    }

    public static <T2> Query<T2> a(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr, int i, int i2) {
        return new b(abstractDao, str, org.greenrobot.greendao.query.a.toStringArray(objArr), i, i2).b();
    }

    public static <T2> Query<T2> internalCreate(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return a(abstractDao, str, objArr, -1, -1);
    }

    @Internal
    public RxQuery __InternalRx() {
        if (this.c == null) {
            this.c = new RxQuery(this, Schedulers.io());
        }
        return this.c;
    }

    @Internal
    public RxQuery __internalRxPlain() {
        if (this.b == null) {
            this.b = new RxQuery(this);
        }
        return this.b;
    }

    public Query<T> forCurrentThread() {
        return (Query) this.a.c(this);
    }

    public List<T> list() {
        checkThread();
        return this.daoAccess.loadAllAndCloseCursor(this.dao.getDatabase().rawQuery(this.sql, this.parameters));
    }

    public CloseableListIterator<T> listIterator() {
        return listLazyUncached().listIteratorAutoClose();
    }

    public LazyList<T> listLazy() {
        checkThread();
        return new LazyList<>(this.daoAccess, this.dao.getDatabase().rawQuery(this.sql, this.parameters), true);
    }

    public LazyList<T> listLazyUncached() {
        checkThread();
        return new LazyList<>(this.daoAccess, this.dao.getDatabase().rawQuery(this.sql, this.parameters), false);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void setLimit(int i) {
        super.setLimit(i);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void setOffset(int i) {
        super.setOffset(i);
    }

    public T unique() {
        checkThread();
        return this.daoAccess.loadUniqueAndCloseCursor(this.dao.getDatabase().rawQuery(this.sql, this.parameters));
    }

    public T uniqueOrThrow() {
        T tUnique = unique();
        if (tUnique != null) {
            return tUnique;
        }
        throw new DaoException("No entity found for query");
    }

    private Query(b<T> bVar, AbstractDao<T, ?> abstractDao, String str, String[] strArr, int i, int i2) {
        super(abstractDao, str, strArr, i, i2);
        this.a = bVar;
    }

    @Override // org.greenrobot.greendao.query.c, org.greenrobot.greendao.query.a
    public Query<T> setParameter(int i, Object obj) {
        return (Query) super.setParameter(i, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    public Query<T> setParameter(int i, Date date) {
        return (Query) super.setParameter(i, date);
    }

    @Override // org.greenrobot.greendao.query.a
    public Query<T> setParameter(int i, Boolean bool) {
        return (Query) super.setParameter(i, bool);
    }
}
