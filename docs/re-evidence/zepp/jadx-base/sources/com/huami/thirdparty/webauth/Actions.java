package com.huami.thirdparty.webauth;

import android.app.Activity;
import com.huami.tools.analytics.DbUtils;
import com.tekartik.sqflite.Constant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005R=\u0010\u0012\u001a)\u0012\u0004\u0012\u00020\u0002\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00040\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/thirdparty/webauth/Actions;", "", "", "url", "Lkotlin/Function1;", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "action", "register", "remove", "activity", Constant.METHOD_EXECUTE, "", "a", "Ljava/util/Map;", "actionMap", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class Actions {

    @NotNull
    public static final Actions INSTANCE = new Actions();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Map<String, Function1<Activity, Unit>> actionMap = new LinkedHashMap();

    private Actions() {
    }

    public final void execute(@NotNull String url, @NotNull Activity activity) {
        Iterator<T> it2 = actionMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) entry.getKey(), false, 2, (Object) null)) {
                ((Function1) entry.getValue()).invoke(activity);
            }
        }
    }

    public final void register(@NotNull String url, @NotNull Function1<? super Activity, Unit> action) {
        Map<String, Function1<Activity, Unit>> map = actionMap;
        if (map.containsKey(url)) {
            return;
        }
        map.put(url, action);
    }

    public final void remove(@NotNull String url) {
        Map<String, Function1<Activity, Unit>> map = actionMap;
        if (map.containsKey(url)) {
            map.remove(url);
        }
    }
}
