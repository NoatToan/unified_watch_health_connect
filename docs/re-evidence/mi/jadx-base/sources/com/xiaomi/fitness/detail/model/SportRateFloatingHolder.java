package com.xiaomi.fitness.detail.model;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.dde;
import defpackage.lp5;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportRateFloatingHolder;", "", "", "guideBuyDeviceUrl", "()Ljava/lang/String;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "", "showBuyToast", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Ldde;", "binding", "Ldde;", "getBinding", "()Ldde;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "tvBuy", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "<init>", "(Ldde;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRateFloatingHolder {

    @NotNull
    private final dde binding;
    private final Context context;

    @NotNull
    private final View rootView;

    @NotNull
    private final TextView tvBuy;

    @NotNull
    private final TextView tvTitle;

    public SportRateFloatingHolder(@NotNull dde binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        TextView tvTitle = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        this.tvTitle = tvTitle;
        TextView tvBuy = binding.C;
        Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
        this.tvBuy = tvBuy;
        this.context = binding.getRoot().getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBuyToast$lambda$0(int i, SportBasicReport sportBasicReport, SportRateFloatingHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        pairArr[1] = TuplesKt.to("name", "btn_buy_device");
        pairArr[2] = TuplesKt.to("type_str", lp5.c(i));
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        WebViewUtilKt.startWebView$default(this$0.guideBuyDeviceUrl(), null, false, false, null, false, null, false, 254, null);
    }

    @NotNull
    public final dde getBinding() {
        return this.binding;
    }

    @NotNull
    public final String guideBuyDeviceUrl() {
        return "https://m.mi.com/mfbs/dghd/m_universal?_rt=rn&pageid=11771&pdl=mishop&sign=cc12401e973dfd2803341b68a91e277e&mute=0.1.0.1&g_utm=MIUI.Mijia.Others.xmyd.cdzn2&enter=1";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1.isSameLanguage(r2) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showBuyToast(@org.jetbrains.annotations.Nullable final com.xiaomi.fit.data.common.data.sport.SportBasicReport r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L4
            r0 = -1
            goto L8
        L4:
            int r0 = defpackage.lp5.a(r5)
        L8:
            com.xiaomi.fitness.common.utils.AppUtil r1 = com.xiaomi.fitness.common.utils.AppUtil.INSTANCE
            boolean r1 = r1.isPlayChannel()
            if (r1 != 0) goto L43
            com.xiaomi.fitness.common.utils.LocaleUtil r1 = com.xiaomi.fitness.common.utils.LocaleUtil.INSTANCE
            java.util.Locale r2 = java.util.Locale.CHINA
            java.lang.String r2 = r2.getLanguage()
            java.lang.String r3 = "getLanguage(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r2 = r1.isSameLanguage(r2)
            if (r2 != 0) goto L32
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.getLanguage()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r1 = r1.isSameLanguage(r2)
            if (r1 == 0) goto L43
        L32:
            android.view.View r1 = r4.rootView
            r2 = 1
            com.xiaomi.fitness.extensions.ViewExtKt.setVisible(r1, r2)
            android.widget.TextView r1 = r4.tvBuy
            ysn r2 = new ysn
            r2.<init>()
            r1.setOnClickListener(r2)
            goto L49
        L43:
            android.view.View r5 = r4.rootView
            r0 = 0
            com.xiaomi.fitness.extensions.ViewExtKt.setVisible(r5, r0)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.detail.model.SportRateFloatingHolder.showBuyToast(com.xiaomi.fit.data.common.data.sport.SportBasicReport):void");
    }
}
