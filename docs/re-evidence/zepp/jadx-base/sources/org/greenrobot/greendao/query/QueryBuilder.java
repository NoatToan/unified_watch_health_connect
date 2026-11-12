package org.greenrobot.greendao.query;

import android.database.sqlite.SQLiteDatabase;
import androidx.exifinterface.media.ExifInterface;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.DaoLog;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.annotation.apihint.Experimental;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.rx.RxQuery;

/* JADX INFO: loaded from: classes23.dex */
public class QueryBuilder<T> {
    public static boolean LOG_SQL;
    public static boolean LOG_VALUES;
    private final d<T> a;
    private StringBuilder b;
    private final List<Object> c;
    private final List<Join<T, ?>> d;
    private final AbstractDao<T, ?> e;
    private final String f;
    private Integer g;
    private Integer h;
    private boolean i;
    private String j;

    public QueryBuilder(AbstractDao<T, ?> abstractDao) {
        this(abstractDao, ExifInterface.GPS_DIRECTION_TRUE);
    }

    private <J> Join<T, J> a(String str, Property property, AbstractDao<J, ?> abstractDao, Property property2) {
        Join<T, J> join = new Join<>(str, property, abstractDao, property2, "J" + (this.d.size() + 1));
        this.d.add(join);
        return join;
    }

    private void b(StringBuilder sb, String str) {
        this.c.clear();
        for (Join<T, ?> join : this.d) {
            sb.append(" JOIN ");
            sb.append(join.b.getTablename());
            sb.append(StringUtil.SPACE);
            sb.append(join.e);
            sb.append(" ON ");
            SqlUtils.appendProperty(sb, join.a, join.c).append(com.alipay.sdk.m.n.a.h);
            SqlUtils.appendProperty(sb, join.e, join.d);
        }
        boolean z = !this.a.g();
        if (z) {
            sb.append(" WHERE ");
            this.a.c(sb, str, this.c);
        }
        for (Join<T, ?> join2 : this.d) {
            if (!join2.f.g()) {
                if (z) {
                    sb.append(" AND ");
                } else {
                    sb.append(" WHERE ");
                    z = true;
                }
                join2.f.c(sb, join2.e, this.c);
            }
        }
    }

    private int c(StringBuilder sb) {
        if (this.g == null) {
            return -1;
        }
        sb.append(" LIMIT ?");
        this.c.add(this.g);
        return this.c.size() - 1;
    }

    private int d(StringBuilder sb) {
        if (this.h == null) {
            return -1;
        }
        if (this.g == null) {
            throw new IllegalStateException("Offset cannot be set without limit");
        }
        sb.append(" OFFSET ?");
        this.c.add(this.h);
        return this.c.size() - 1;
    }

    private void e(String str) {
        if (LOG_SQL) {
            DaoLog.d("Built SQL for query: " + str);
        }
        if (LOG_VALUES) {
            DaoLog.d("Values for query: " + this.c);
        }
    }

    private void f() {
        StringBuilder sb = this.b;
        if (sb == null) {
            this.b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.b.append(",");
        }
    }

    private StringBuilder g() {
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlSelect(this.e.getTablename(), this.f, this.e.getAllColumns(), this.i));
        b(sb, this.f);
        StringBuilder sb2 = this.b;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append((CharSequence) this.b);
        }
        return sb;
    }

    private void h(String str, Property... propertyArr) {
        String str2;
        for (Property property : propertyArr) {
            f();
            append(this.b, property);
            if (String.class.equals(property.type) && (str2 = this.j) != null) {
                this.b.append(str2);
            }
            this.b.append(str);
        }
    }

    public static <T2> QueryBuilder<T2> internalCreate(AbstractDao<T2, ?> abstractDao) {
        return new QueryBuilder<>(abstractDao);
    }

    public WhereCondition and(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        return this.a.f(" AND ", whereCondition, whereCondition2, whereConditionArr);
    }

    public StringBuilder append(StringBuilder sb, Property property) {
        this.a.e(property);
        sb.append(this.f);
        sb.append('.');
        sb.append('\'');
        sb.append(property.columnName);
        sb.append('\'');
        return sb;
    }

    public Query<T> build() {
        StringBuilder sbG = g();
        int iC = c(sbG);
        int iD = d(sbG);
        String string = sbG.toString();
        e(string);
        return Query.a(this.e, string, this.c.toArray(), iC, iD);
    }

    public CountQuery<T> buildCount() {
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlSelectCountStar(this.e.getTablename(), this.f));
        b(sb, this.f);
        String string = sb.toString();
        e(string);
        return CountQuery.a(this.e, string, this.c.toArray());
    }

    public CursorQuery buildCursor() {
        StringBuilder sbG = g();
        int iC = c(sbG);
        int iD = d(sbG);
        String string = sbG.toString();
        e(string);
        return CursorQuery.a(this.e, string, this.c.toArray(), iC, iD);
    }

    public DeleteQuery<T> buildDelete() {
        if (!this.d.isEmpty()) {
            throw new DaoException("JOINs are not supported for DELETE queries");
        }
        String tablename = this.e.getTablename();
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlDelete(tablename, null));
        b(sb, this.f);
        String strReplace = sb.toString().replace(this.f + ".\"", '\"' + tablename + "\".\"");
        e(strReplace);
        return DeleteQuery.a(this.e, strReplace, this.c.toArray());
    }

    public long count() {
        return buildCount().count();
    }

    public QueryBuilder<T> distinct() {
        this.i = true;
        return this;
    }

    public <J> Join<T, J> join(Class<J> cls, Property property) {
        return join(this.e.getPkProperty(), cls, property);
    }

    public QueryBuilder<T> limit(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public List<T> list() {
        return build().list();
    }

    public CloseableListIterator<T> listIterator() {
        return build().listIterator();
    }

    public LazyList<T> listLazy() {
        return build().listLazy();
    }

    public LazyList<T> listLazyUncached() {
        return build().listLazyUncached();
    }

    public QueryBuilder<T> offset(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public WhereCondition or(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        return this.a.f(" OR ", whereCondition, whereCondition2, whereConditionArr);
    }

    public QueryBuilder<T> orderAsc(Property... propertyArr) {
        h(" ASC", propertyArr);
        return this;
    }

    public QueryBuilder<T> orderCustom(Property property, String str) {
        f();
        append(this.b, property).append(StringUtil.SPACE);
        this.b.append(str);
        return this;
    }

    public QueryBuilder<T> orderDesc(Property... propertyArr) {
        h(" DESC", propertyArr);
        return this;
    }

    public QueryBuilder<T> orderRaw(String str) {
        f();
        this.b.append(str);
        return this;
    }

    public QueryBuilder<T> preferLocalizedStringOrder() {
        if (this.e.getDatabase().getRawDatabase() instanceof SQLiteDatabase) {
            this.j = " COLLATE LOCALIZED";
        }
        return this;
    }

    @Experimental
    public RxQuery<T> rx() {
        return build().__InternalRx();
    }

    @Experimental
    public RxQuery<T> rxPlain() {
        return build().__internalRxPlain();
    }

    public QueryBuilder<T> stringOrderCollation(String str) {
        if (this.e.getDatabase().getRawDatabase() instanceof SQLiteDatabase) {
            if (str != null && !str.startsWith(" ")) {
                str = " " + str;
            }
            this.j = str;
        }
        return this;
    }

    public T unique() {
        return build().unique();
    }

    public T uniqueOrThrow() {
        return build().uniqueOrThrow();
    }

    public QueryBuilder<T> where(WhereCondition whereCondition, WhereCondition... whereConditionArr) {
        this.a.a(whereCondition, whereConditionArr);
        return this;
    }

    public QueryBuilder<T> whereOr(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        this.a.a(or(whereCondition, whereCondition2, whereConditionArr), new WhereCondition[0]);
        return this;
    }

    public QueryBuilder(AbstractDao<T, ?> abstractDao, String str) {
        this.e = abstractDao;
        this.f = str;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = new d<>(abstractDao, str);
        this.j = " COLLATE NOCASE";
    }

    public <J> Join<T, J> join(Property property, Class<J> cls) {
        AbstractDao<?, ?> dao = this.e.getSession().getDao(cls);
        return a(this.f, property, dao, dao.getPkProperty());
    }

    public <J> Join<T, J> join(Property property, Class<J> cls, Property property2) {
        return a(this.f, property, this.e.getSession().getDao(cls), property2);
    }

    public <J> Join<T, J> join(Join<?, T> join, Property property, Class<J> cls, Property property2) {
        return a(join.e, property, this.e.getSession().getDao(cls), property2);
    }
}
