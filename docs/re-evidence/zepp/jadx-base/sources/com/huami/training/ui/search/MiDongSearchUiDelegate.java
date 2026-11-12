package com.huami.training.ui.search;

import android.graphics.Color;
import com.huami.training.ui.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/training/ui/search/MiDongSearchUiDelegate;", "Lcom/huami/training/ui/search/SearchUiDelegate;", "", "getButtonTextColor", "getRoundButtonBg", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiDongSearchUiDelegate implements SearchUiDelegate {
    @Override // com.huami.training.ui.search.SearchUiDelegate
    public int getButtonTextColor() {
        return Color.parseColor("#ff5353");
    }

    @Override // com.huami.training.ui.search.SearchUiDelegate
    public int getRoundButtonBg() {
        return R.drawable.tr_shape_corner_white_bg_orange_stroke_md;
    }
}
