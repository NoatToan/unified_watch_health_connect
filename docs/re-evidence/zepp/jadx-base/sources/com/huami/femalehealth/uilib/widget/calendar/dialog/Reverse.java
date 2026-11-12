package com.huami.femalehealth.uilib.widget.calendar.dialog;

import android.content.Context;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.module.homepage.cards.business.healthstate.HealthStateCardView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/Reverse;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "shouldReverse", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class Reverse {

    @NotNull
    private static final String a = "Reverse";
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;

    @NotNull
    private static final String[] e = {"vi", Argument.IN, Language.CS, "nl", Language.RO, "as-rIN", "as-rIN", "bn-rBD", "bn-rIN", "bs", "de", Language.EL, "es", "es-rUS", "fa-rIR", "fi", "fr", "ha-rNG", "hi", Constants.DATA_KEY_HR, "it", "iw-rIL", "ka-rGE", "ka-rGE", "kn-rIN", "lv", "ml-rIN", "mr-rIN", "ms-rMY", "ne-rIN", "ne-rNP", "pa-rIN", "pl", "pt", "pt-rBR", "pt-rPT", HealthStateCardView.LANGUAGE_RU, "sk", "sl", "sr", "ta-rIN", "te-RIN", "th", "tr", "uk", "ur-rIN", "ur-rPK", "nb", Command.DISABLE, "uz-rUZ"};

    @NotNull
    private static final String[] f = {"en", "az-rz", "bg", "ca", "bg", "en-rGB", "en-rIN", "gl-rES", "bg", "gu-rIN", "bg", "hy-rAM", "iw-rIL", "kk-rKZ", "km-rKH", "mk-rMK", "mt-rMT", "my-rMM", "or-rIN", "sq-rAL", com.alipay.sdk.m.s.a.r};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("shouldReverse:", this.a);
        }
    }

    public final int shouldReverse(@NotNull Context context) {
        String language = context.getResources().getConfiguration().locale.getLanguage();
        HMLog.info("xys_Reverse", new a(language));
        if (ArraysKt___ArraysKt.contains(e, language)) {
            return 1;
        }
        return ArraysKt___ArraysKt.contains(f, language) ? 2 : 0;
    }
}
