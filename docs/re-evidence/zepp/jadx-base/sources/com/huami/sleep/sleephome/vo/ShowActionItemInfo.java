package com.huami.sleep.sleephome.vo;

import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/sleephome/vo/ShowActionItemInfo;", "", "", "component1", "id", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "b", "getShowText", "setShowText", "showText", "<init>", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShowActionItemInfo {

    @NotNull
    public static final String DATA_SOURCE = "data_source";

    @NotNull
    public static final String EDIT = "edit";

    @NotNull
    public static final String SHARE = "share";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String showText;

    public ShowActionItemInfo(@Nullable String str) {
        this.id = str;
        String string = "";
        this.showText = "";
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1333894576) {
                if (iHashCode != 3108362) {
                    if (iHashCode == 109400031 && str.equals("share")) {
                        string = KoinExtKt.getAppContext().getString(R.string.webview_more_menu_share);
                    }
                } else if (str.equals(EDIT)) {
                    string = KoinExtKt.getAppContext().getString(R.string.sleep_edit_data);
                }
            } else if (str.equals(DATA_SOURCE)) {
                string = KoinExtKt.getAppContext().getString(R.string.sleep_select_source);
            }
        }
        this.showText = string;
    }

    public static /* synthetic */ ShowActionItemInfo copy$default(ShowActionItemInfo showActionItemInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showActionItemInfo.id;
        }
        return showActionItemInfo.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ShowActionItemInfo copy(@Nullable String id) {
        return new ShowActionItemInfo(id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShowActionItemInfo) && Intrinsics.areEqual(this.id, ((ShowActionItemInfo) other).id);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getShowText() {
        return this.showText;
    }

    public int hashCode() {
        String str = this.id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setShowText(@NotNull String str) {
        this.showText = str;
    }

    @NotNull
    public String toString() {
        return "ShowActionItemInfo(id=" + this.id + ")";
    }
}
