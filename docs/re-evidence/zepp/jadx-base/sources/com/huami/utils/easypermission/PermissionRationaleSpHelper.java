package com.huami.utils.easypermission;

import android.text.TextUtils;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/utils/easypermission/PermissionRationaleSpHelper;", "", "", "requestKey", "", "time", "", "saveShowTime", "getShowTime", "", "requestCode", "putRequestKey2Code", "removeRequestKey2Code", "onPermissionDenied", "a", "Ljava/lang/String;", "FILE_NAME", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "", "c", "Ljava/util/Map;", "strictMap", "<init>", "()V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionRationaleSpHelper {

    @NotNull
    public static final PermissionRationaleSpHelper INSTANCE = new PermissionRationaleSpHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String FILE_NAME = "permission_rational";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final KvPersistence kv = KvKit.getKvPersistence$default(FILE_NAME, false, 2, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, Integer> strictMap = new LinkedHashMap();

    private PermissionRationaleSpHelper() {
    }

    @JvmStatic
    public static final long getShowTime(@NotNull String requestKey) {
        return ((Number) kv.getValue(requestKey, 0L)).longValue();
    }

    @JvmStatic
    public static final synchronized void onPermissionDenied(@Nullable String requestKey, int requestCode) {
        Integer num;
        if (requestKey == null) {
            return;
        }
        Map<String, Integer> map = strictMap;
        if (map.containsKey(requestKey) && (num = map.get(requestKey)) != null && num.intValue() == requestCode) {
            saveShowTime(requestKey, System.currentTimeMillis());
            map.remove(requestKey);
        }
    }

    @JvmStatic
    public static final void putRequestKey2Code(@Nullable String requestKey, int requestCode) {
        if (requestKey != null) {
            strictMap.put(requestKey, Integer.valueOf(requestCode));
        }
    }

    @JvmStatic
    public static final synchronized void removeRequestKey2Code(@Nullable String requestKey, int requestCode) {
        Integer num;
        if (!TextUtils.isEmpty(requestKey)) {
            Map<String, Integer> map = strictMap;
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
            if (map.containsKey(requestKey) && (num = map.get(requestKey)) != null && num.intValue() == requestCode) {
                if (map == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
                TypeIntrinsics.asMutableMap(map).remove(requestKey);
            }
        }
    }

    @JvmStatic
    public static final void saveShowTime(@NotNull String requestKey, long time) {
        kv.setValue(requestKey, Long.valueOf(time));
    }
}
