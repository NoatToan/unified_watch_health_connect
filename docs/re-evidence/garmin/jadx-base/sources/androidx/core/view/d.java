package androidx.core.view;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ boolean B(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException e(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* synthetic */ Font.Builder j(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder p(ClipData clipData, int i14) {
        return new ContentInfo.Builder(clipData, i14);
    }

    public static /* synthetic */ ContentInfo.Builder q(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo s(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void u() {
    }
}
