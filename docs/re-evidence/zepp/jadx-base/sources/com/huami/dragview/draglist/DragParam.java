package com.huami.dragview.draglist;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001d¨\u0006*"}, d2 = {"Lcom/huami/dragview/draglist/DragParam;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "b", "getShowTitle", "showTitle", "c", "getNotShowTitle", "notShowTitle", GoogleApiAvailabilityLight.a, "getDragTips", "dragTips", "e", "getEmptyTips", "emptyTips", "f", "getCannotDragTips", "cannotDragTips", "Lkotlin/Pair;", "g", "Lkotlin/Pair;", "getSaveAndCancelText", "()Lkotlin/Pair;", "setSaveAndCancelText", "(Lkotlin/Pair;)V", "saveAndCancelText", "h", "getSaveStatusToastText", "setSaveStatusToastText", "saveStatusToastText", "", "i", "getMinShowLimit", "setMinShowLimit", "minShowLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;)V", "dragview_release"}, k = 1, mv = {1, 4, 0})
public final class DragParam implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String showTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String notShowTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String dragTips;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String emptyTips;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String cannotDragTips;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Pair<String, String> saveAndCancelText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Pair<String, String> saveStatusToastText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Pair<Integer, String> minShowLimit;

    public DragParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Pair<String, String> pair, @Nullable Pair<String, String> pair2, @Nullable Pair<Integer, String> pair3) {
        this.title = str;
        this.showTitle = str2;
        this.notShowTitle = str3;
        this.dragTips = str4;
        this.emptyTips = str5;
        this.cannotDragTips = str6;
        this.saveAndCancelText = pair;
        this.saveStatusToastText = pair2;
        this.minShowLimit = pair3;
    }

    @NotNull
    public final String getCannotDragTips() {
        return this.cannotDragTips;
    }

    @NotNull
    public final String getDragTips() {
        return this.dragTips;
    }

    @NotNull
    public final String getEmptyTips() {
        return this.emptyTips;
    }

    @Nullable
    public final Pair<Integer, String> getMinShowLimit() {
        return this.minShowLimit;
    }

    @NotNull
    public final String getNotShowTitle() {
        return this.notShowTitle;
    }

    @NotNull
    public final Pair<String, String> getSaveAndCancelText() {
        return this.saveAndCancelText;
    }

    @Nullable
    public final Pair<String, String> getSaveStatusToastText() {
        return this.saveStatusToastText;
    }

    @NotNull
    public final String getShowTitle() {
        return this.showTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setMinShowLimit(@Nullable Pair<Integer, String> pair) {
        this.minShowLimit = pair;
    }

    public final void setSaveAndCancelText(@NotNull Pair<String, String> pair) {
        this.saveAndCancelText = pair;
    }

    public final void setSaveStatusToastText(@Nullable Pair<String, String> pair) {
        this.saveStatusToastText = pair;
    }

    public /* synthetic */ DragParam(String str, String str2, String str3, String str4, String str5, String str6, Pair pair, Pair pair2, Pair pair3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, pair, (i & 128) != 0 ? null : pair2, (i & 256) != 0 ? null : pair3);
    }
}
