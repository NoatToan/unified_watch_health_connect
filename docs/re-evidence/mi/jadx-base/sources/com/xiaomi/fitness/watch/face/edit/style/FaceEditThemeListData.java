package com.xiaomi.fitness.watch.face.edit.style;

import android.graphics.Bitmap;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditThemeListData;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "type", "", "title", "<init>", "(II)V", "getTitle", "()I", "themeList", "", "Landroid/graphics/Bitmap;", "getThemeList", "()Ljava/util/List;", "setThemeList", "(Ljava/util/List;)V", "select", "getSelect", "setSelect", "(I)V", "videoBg", "", "getVideoBg", "()Ljava/lang/String;", "setVideoBg", "(Ljava/lang/String;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditThemeListData extends FaceEditPickerBaseData {
    private int select;

    @NotNull
    private List<Bitmap> themeList;
    private final int title;

    @Nullable
    private String videoBg;

    public FaceEditThemeListData(int i, int i2) {
        super(i, i2);
        this.title = i2;
        this.themeList = new ArrayList();
    }

    public final int getSelect() {
        return this.select;
    }

    @NotNull
    public final List<Bitmap> getThemeList() {
        return this.themeList;
    }

    public final int getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVideoBg() {
        return this.videoBg;
    }

    public final void setSelect(int i) {
        this.select = i;
    }

    public final void setThemeList(@NotNull List<Bitmap> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.themeList = list;
    }

    public final void setVideoBg(@Nullable String str) {
        this.videoBg = str;
    }
}
