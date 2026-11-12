package com.xiaomi.hm.health.di.koin.female;

import android.content.Context;
import com.huami.femalehealth.logiclib.nav.ExternalNavigator;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/female/FemaleExternalNavigator;", "Lcom/huami/femalehealth/logiclib/nav/ExternalNavigator;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "courseId", "", "navigateToCourseDetail", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleExternalNavigator implements ExternalNavigator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "FemaleExternalNavigator";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "navigateToCourseDetail not impl";
        }
    }

    @Override // com.huami.femalehealth.logiclib.nav.ExternalNavigator
    public void navigateToCourseDetail(@NotNull Context context, @Nullable String courseId) {
        HMLog.warn$default(this.tag, null, a.a, 2, null);
    }
}
