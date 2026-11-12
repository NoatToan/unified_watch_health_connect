package com.huami.moving.ui.sport.detail.screenshot;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/moving/ui/sport/detail/screenshot/ScreenshotContentObserver;", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "Landroid/net/Uri;", "uri", "Lcom/huami/moving/ui/sport/detail/screenshot/OnChangeListener;", "mOnChangeListener", "setOnChangeListener", "", "a", "Ljava/lang/String;", "Tag", "", "b", LogUtil.I, "mCount", "c", "Lcom/huami/moving/ui/sport/detail/screenshot/OnChangeListener;", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenshotContentObserver extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String Tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnChangeListener mOnChangeListener;

    public ScreenshotContentObserver(@Nullable Handler handler) {
        super(handler);
        this.Tag = ScreenshotContentObserver.class.getSimpleName();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
    }

    public final void setOnChangeListener(@Nullable OnChangeListener mOnChangeListener) {
        this.mOnChangeListener = mOnChangeListener;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, @Nullable Uri uri) {
        super.onChange(selfChange, uri);
        Log.d(this.Tag, "onChange() returned: uri = " + uri);
        if (uri != null && StringsKt__StringsKt.contains$default((CharSequence) uri.toString(), (CharSequence) "images", false, 2, (Object) null)) {
            this.mCount++;
            OnChangeListener onChangeListener = this.mOnChangeListener;
            if (onChangeListener == null) {
                return;
            }
            onChangeListener.onChange(uri);
        }
    }
}
