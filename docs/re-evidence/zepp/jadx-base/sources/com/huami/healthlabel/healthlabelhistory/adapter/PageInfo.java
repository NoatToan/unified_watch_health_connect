package com.huami.healthlabel.healthlabelhistory.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.passport.Configs;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/PageInfo;", "", "", "nextPage", Configs.Params.RESET, "", "isFirstPage", "", "a", LogUtil.I, "getPage", "()I", "setPage", "(I)V", DTransferConstants.PAGE, "<init>", "()V", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class PageInfo {
    public static final int PAGE_SIZE = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int page;

    public final int getPage() {
        return this.page;
    }

    public final boolean isFirstPage() {
        return this.page == 0;
    }

    public final void nextPage() {
        this.page++;
    }

    public final void reset() {
        this.page = 0;
    }

    public final void setPage(int i) {
        this.page = i;
    }
}
