package com.huami.sleepassistant.lib.fake;

import android.content.Context;
import com.huami.sleepassistant.lib.navigation.ExternalNavigator;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/sleepassistant/lib/fake/FakeExternalNavigator;", "Lcom/huami/sleepassistant/lib/navigation/ExternalNavigator;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "mode", "", "url", "", "navigateToAdJumpAction", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FakeExternalNavigator implements ExternalNavigator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "FakeNavigator";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str) {
            super(0);
            this.a = i;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "navigateToAdJumpAction:userId:" + this.a + ",url:" + this.b;
        }
    }

    @Override // com.huami.sleepassistant.lib.navigation.ExternalNavigator
    public void navigateToAdJumpAction(@NotNull Context context, int mode, @NotNull String url) {
        HMLog.debug(this.tag, new a(mode, url));
    }
}
