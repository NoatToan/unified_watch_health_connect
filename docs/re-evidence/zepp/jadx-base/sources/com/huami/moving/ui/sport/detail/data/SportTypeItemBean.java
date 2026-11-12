package com.huami.moving.ui.sport.detail.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.dataflow.model.sport.SportParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/ui/sport/detail/data/SportTypeItemBean;", "", "", "sport_type", LogUtil.I, "getSport_type", "()I", "setSport_type", "(I)V", "", SportParams.PARAM_SPORT_NAME, "Ljava/lang/String;", "getSport_name", "()Ljava/lang/String;", "setSport_name", "(Ljava/lang/String;)V", "<init>", "(ILjava/lang/String;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportTypeItemBean {

    @NotNull
    private String sport_name;
    private int sport_type;

    /* JADX WARN: Multi-variable type inference failed */
    public SportTypeItemBean() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public SportTypeItemBean(int i, @NotNull String str) {
        this.sport_type = i;
        this.sport_name = str;
    }

    @NotNull
    public final String getSport_name() {
        return this.sport_name;
    }

    public final int getSport_type() {
        return this.sport_type;
    }

    public final void setSport_name(@NotNull String str) {
        this.sport_name = str;
    }

    public final void setSport_type(int i) {
        this.sport_type = i;
    }

    public /* synthetic */ SportTypeItemBean(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str);
    }
}
