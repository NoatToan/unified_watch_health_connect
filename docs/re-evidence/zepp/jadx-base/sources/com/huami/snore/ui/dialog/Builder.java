package com.huami.snore.ui.dialog;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010<\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010@\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006C"}, d2 = {"Lcom/huami/snore/ui/dialog/Builder;", "", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/lang/String;", "getTitleStr", "()Ljava/lang/String;", "setTitleStr", "(Ljava/lang/String;)V", "titleStr", "b", "getDescStr", "setDescStr", "descStr", "c", "getOkText", "setOkText", "okText", GoogleApiAvailabilityLight.a, "getCancelText", "setCancelText", "cancelText", "", "e", "Ljava/lang/Integer;", "getOkTextColor", "()Ljava/lang/Integer;", "setOkTextColor", "(Ljava/lang/Integer;)V", "okTextColor", "f", "getCancelTextColor", "setCancelTextColor", "cancelTextColor", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", "g", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", "getTitleStyle", "()Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", "setTitleStyle", "(Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;)V", "titleStyle", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "h", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "getButtonStyle", "()Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "setButtonStyle", "(Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;)V", "buttonStyle", "Lkotlin/Function0;", "", "i", "Lkotlin/jvm/functions/Function0;", "getOkListener", "()Lkotlin/jvm/functions/Function0;", "setOkListener", "(Lkotlin/jvm/functions/Function0;)V", "okListener", z.j, "getCancelListener", "setCancelListener", "cancelListener", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class Builder {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Integer okTextColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Integer cancelTextColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> okListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> cancelListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String titleStr = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String descStr = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String okText = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String cancelText = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private SnoreNormalDialog.TileStyle titleStyle = SnoreNormalDialog.TileStyle.NO_TITLE;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private SnoreNormalDialog.ButtonStyle buttonStyle = SnoreNormalDialog.ButtonStyle.TWO;

    @NotNull
    public final SnoreNormalDialog build() {
        SnoreNormalDialog snoreNormalDialog = new SnoreNormalDialog();
        snoreNormalDialog.setMOkText(getOkText());
        snoreNormalDialog.setMCancelText(getCancelText());
        snoreNormalDialog.setMTitleStyle(getTitleStyle());
        snoreNormalDialog.setMButtonStyle(getButtonStyle());
        snoreNormalDialog.setMDesc(getDescStr());
        snoreNormalDialog.setMTitle(getTitleStr());
        snoreNormalDialog.setMOkListener(getOkListener());
        snoreNormalDialog.setMCancelListener(getCancelListener());
        snoreNormalDialog.setMOkTextColor(getOkTextColor());
        snoreNormalDialog.setMCancelTextColor(getCancelTextColor());
        return snoreNormalDialog;
    }

    @NotNull
    public final SnoreNormalDialog.ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    @Nullable
    public final Function0<Unit> getCancelListener() {
        return this.cancelListener;
    }

    @Nullable
    public final String getCancelText() {
        return this.cancelText;
    }

    @Nullable
    public final Integer getCancelTextColor() {
        return this.cancelTextColor;
    }

    @Nullable
    public final String getDescStr() {
        return this.descStr;
    }

    @Nullable
    public final Function0<Unit> getOkListener() {
        return this.okListener;
    }

    @Nullable
    public final String getOkText() {
        return this.okText;
    }

    @Nullable
    public final Integer getOkTextColor() {
        return this.okTextColor;
    }

    @Nullable
    public final String getTitleStr() {
        return this.titleStr;
    }

    @NotNull
    public final SnoreNormalDialog.TileStyle getTitleStyle() {
        return this.titleStyle;
    }

    public final void setButtonStyle(@NotNull SnoreNormalDialog.ButtonStyle buttonStyle) {
        this.buttonStyle = buttonStyle;
    }

    public final void setCancelListener(@Nullable Function0<Unit> function0) {
        this.cancelListener = function0;
    }

    public final void setCancelText(@Nullable String str) {
        this.cancelText = str;
    }

    public final void setCancelTextColor(@Nullable Integer num) {
        this.cancelTextColor = num;
    }

    public final void setDescStr(@Nullable String str) {
        this.descStr = str;
    }

    public final void setOkListener(@Nullable Function0<Unit> function0) {
        this.okListener = function0;
    }

    public final void setOkText(@Nullable String str) {
        this.okText = str;
    }

    public final void setOkTextColor(@Nullable Integer num) {
        this.okTextColor = num;
    }

    public final void setTitleStr(@Nullable String str) {
        this.titleStr = str;
    }

    public final void setTitleStyle(@NotNull SnoreNormalDialog.TileStyle tileStyle) {
        this.titleStyle = tileStyle;
    }
}
