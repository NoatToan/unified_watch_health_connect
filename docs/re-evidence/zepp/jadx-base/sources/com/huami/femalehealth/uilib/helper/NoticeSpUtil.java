package com.huami.femalehealth.uilib.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/NoticeSpUtil;", "", "", "key", GoogleApiAvailabilityLight.a, "", "f", "c", "b", "e", "a", "Ljava/lang/String;", "uid", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
final class NoticeSpUtil {

    @NotNull
    private static final String d = "FemaleHealthNotice_";

    @NotNull
    private static final String e = "_";

    @NotNull
    private static final String f = "FemaleAppNoticeHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String uid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferences preferences;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "----------- " + NoticeSpUtil.this.preferences.getAll().size() + " ---------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<String, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map.Entry<String, ? extends Object> entry) {
            super(0);
            this.a = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "notice sp: " + ((Object) this.a.getKey()) + " -> " + this.a.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "------------ end --------------";
        }
    }

    public NoticeSpUtil(@NotNull Context context, @NotNull String str) {
        this.uid = str;
        this.preferences = context.getSharedPreferences(Intrinsics.stringPlus(d, str), 0);
    }

    private final String d(String key) {
        return this.uid + '_' + key;
    }

    public final void b() {
        this.preferences.edit().clear().apply();
    }

    @Nullable
    public final String c(@NotNull String key) {
        return this.preferences.getString(d(key), null);
    }

    public final void e() {
        HMLog.info("xys_FemaleAppNoticeHelper", new a());
        Iterator<Map.Entry<String, ?>> it2 = this.preferences.getAll().entrySet().iterator();
        while (it2.hasNext()) {
            HMLog.info("xys_FemaleAppNoticeHelper", new b(it2.next()));
        }
        HMLog.info("xys_FemaleAppNoticeHelper", c.a);
    }

    public final void f(@Nullable String key) {
        if (key == null) {
            return;
        }
        this.preferences.edit().putString(d(key), "_").apply();
    }
}
