package androidx.work.impl.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.TagConstants;
import defpackage.zcp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH'J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "deleteByWorkSpecId", "", "id", "", "getTagsForWorkSpecId", "", "getWorkSpecIdsWithTag", RemoteMessageConst.Notification.TAG, "insert", "workTag", "Landroidx/work/impl/model/WorkTag;", "insertTags", TagConstants.TAG_LIST_KEY, "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WorkTagDao {
    void deleteByWorkSpecId(String id);

    List<String> getTagsForWorkSpecId(String id);

    List<String> getWorkSpecIdsWithTag(String tag);

    void insert(WorkTag workTag);

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void insertTags(WorkTagDao workTagDao, String str, Set<String> set) {
            zcp.c(str, "");
            zcp.c(set, "");
            WorkTagDao.super.insertTags(str, set);
        }
    }

    default void insertTags(String id, Set<String> tags) {
        zcp.c(id, "");
        zcp.c(tags, "");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            insert(new WorkTag((String) it.next(), id));
        }
    }
}
