package com.xiaomi.hm.health.play.card;

import android.content.Context;
import android.view.ViewGroup;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/play/card/ICardRender;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "rootView", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", GLMapRender.TAG, "onClear", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ICardRender {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void onClear(@NotNull ICardRender iCardRender) {
        }
    }

    void onClear();

    void render(@NotNull Context context, @NotNull ViewGroup rootView, @NotNull CardUiData uiParams);
}
