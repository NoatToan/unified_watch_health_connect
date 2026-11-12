package com.huami.medal.data;

import android.text.TextUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Medal;
import com.xiaomi.hm.health.databases.model.MedalDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import rx.Observable;

/* JADX INFO: loaded from: classes10.dex */
class e {
    public static void b(Medal medal) {
        d().deleteInTx(medal);
    }

    public static List<Medal> c(String str, List<Medal> list) {
        QueryBuilder<Medal> queryBuilderWhere = d().queryBuilder().where(MedalDao.Properties.State.eq(1), new WhereCondition[0]);
        if (!TextUtils.isEmpty(str)) {
            queryBuilderWhere.where(MedalDao.Properties.Category.eq(str), new WhereCondition[0]);
        }
        List<Medal> list2 = queryBuilderWhere.list();
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(list2);
        return arrayList;
    }

    private static MedalDao d() {
        return HMDaoManager.getInstance().getMedalDao();
    }

    private static void e(List<Medal> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Medal> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().getId()));
        }
        List<Medal> list2 = d().queryBuilder().where(MedalDao.Properties.Id.in(arrayList), new WhereCondition[0]).list();
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.removeAll(list2);
        d().insertInTx(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(String str, List list) {
        QueryBuilder<Medal> queryBuilderWhere = d().queryBuilder().where(MedalDao.Properties.State.notEq(1), new WhereCondition[0]);
        if (!TextUtils.isEmpty(str)) {
            queryBuilderWhere.where(MedalDao.Properties.Category.eq(str), new WhereCondition[0]);
        }
        queryBuilderWhere.buildDelete().executeDeleteWithoutDetachingEntities();
        e(list);
    }

    public static void g(final String str, final List<Medal> list) {
        HMDaoManager.getInstance().getDaoSession().runInTx(new Runnable() { // from class: com.huami.medal.data.d
            @Override // java.lang.Runnable
            public final void run() {
                e.f(str, list);
            }
        });
    }

    public static Observable<Medal> h() {
        return d().queryBuilder().where(MedalDao.Properties.State.eq(1), new WhereCondition[0]).rx().oneByOne();
    }

    public static void i(Medal medal) {
        d().update(medal);
    }
}
