package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import com.huawei.operation.utils.Constants;
import defpackage.yzp;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, d2 = {"bindings", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "count", "", "toRawQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/work/WorkQuery;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RawQueries {
    public static final SupportSQLiteQuery toRawQuery(WorkQuery workQuery) {
        String str;
        zcp.c(workQuery, "");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = workQuery.getStates();
        zcp.b((Object) states, "");
        String str2 = " AND";
        if (states.isEmpty()) {
            str = " WHERE";
        } else {
            List<WorkInfo.State> states2 = workQuery.getStates();
            zcp.b((Object) states2, "");
            List<WorkInfo.State> list = states2;
            ArrayList arrayList2 = new ArrayList(yzp.e(list, 10));
            for (WorkInfo.State state : list) {
                zcp.e(state);
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(state)));
            }
            ArrayList arrayList3 = arrayList2;
            sb.append(" WHERE state IN (");
            bindings(sb, arrayList3.size());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        List<UUID> ids = workQuery.getIds();
        zcp.b((Object) ids, "");
        if (!ids.isEmpty()) {
            List<UUID> ids2 = workQuery.getIds();
            zcp.b((Object) ids2, "");
            List<UUID> list2 = ids2;
            ArrayList arrayList4 = new ArrayList(yzp.e(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList4.add(((UUID) it.next()).toString());
            }
            sb.append(str.concat(" id IN ("));
            bindings(sb, workQuery.getIds().size());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            arrayList.addAll(arrayList4);
            str = " AND";
        }
        List<String> tags = workQuery.getTags();
        zcp.b((Object) tags, "");
        if (tags.isEmpty()) {
            str2 = str;
        } else {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            bindings(sb, workQuery.getTags().size());
            sb.append("))");
            List<String> tags2 = workQuery.getTags();
            zcp.b((Object) tags2, "");
            arrayList.addAll(tags2);
        }
        List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        zcp.b((Object) uniqueWorkNames, "");
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            bindings(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            List<String> uniqueWorkNames2 = workQuery.getUniqueWorkNames();
            zcp.b((Object) uniqueWorkNames2, "");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb.append(";");
        String string = sb.toString();
        zcp.b((Object) string, "");
        return new SimpleSQLiteQuery(string, arrayList.toArray(new Object[0]));
    }

    private static final void bindings(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(yzp.c(arrayList, ",", null, null, 0, null, null, 62, null));
    }
}
