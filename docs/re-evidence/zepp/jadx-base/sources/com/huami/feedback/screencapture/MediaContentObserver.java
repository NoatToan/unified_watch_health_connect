package com.huami.feedback.screencapture;

import android.annotation.SuppressLint;
import android.app.Application;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/feedback/screencapture/MediaContentObserver;", "Landroid/database/ContentObserver;", "", "c", "Lcom/huami/feedback/screencapture/ImageInfo;", "b", "imageInfo", "", "a", "f", "e", GoogleApiAvailabilityLight.a, "selfChange", "Landroid/net/Uri;", "uri", "onChange", "Landroid/app/Application;", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "Landroid/net/Uri;", "contentUri", "", "J", "observerTime", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/app/Application;Landroid/net/Uri;Landroid/os/Handler;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class MediaContentObserver extends ContentObserver {
    private static final int d = 10000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Uri contentUri;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long observerTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ImageInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImageInfo imageInfo) {
            super(0);
            this.a = imageInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取图片详情失败！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ImageInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageInfo imageInfo) {
            super(0);
            this.a = imageInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("成功获取图片信息：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "图片的路径名称为空！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "图片命名不包含枚举的截屏关键字！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "图片宽度大于屏幕宽度，图片不符合截屏要求！";
        }
    }

    public MediaContentObserver(@NotNull Application application, @NotNull Uri uri, @NotNull Handler handler) {
        super(handler);
        this.context = application;
        this.contentUri = uri;
        this.observerTime = System.currentTimeMillis();
    }

    private final boolean a(ImageInfo imageInfo) {
        return f(imageInfo) && e(imageInfo) && d(imageInfo);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0094: MOVE (r12 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:31:0x0094 */
    @SuppressLint({"InlinedApi"})
    private final ImageInfo b() throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = this.context.getContentResolver().query(this.contentUri, new String[]{"_id", "_data", "datetaken", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height"}, null, null, "date_added desc limit 1");
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            ImageInfo imageInfo = new ImageInfo(cursorQuery.getString(cursorQuery.getColumnIndex("_data")), Uri.withAppendedPath(this.contentUri, cursorQuery.getString(cursorQuery.getColumnIndex("_id"))), cursorQuery.getLong(cursorQuery.getColumnIndex("datetaken")), cursorQuery.getInt(cursorQuery.getColumnIndex(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)), cursorQuery.getInt(cursorQuery.getColumnIndex("height")));
                            HMLog.info("feedback", new a(imageInfo));
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return imageInfo;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                }
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null && !cursor2.isClosed()) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private final void c() throws Throwable {
        ImageInfo imageInfoB = b();
        if (imageInfoB == null) {
            HMLog.info("feedback", b.a);
        } else if (a(imageInfoB)) {
            HMLog.info("feedback", new c(imageInfoB));
            ScreenShotMonitor.INSTANCE.getImageLiveData().postValue(imageInfoB);
        }
    }

    private final boolean d(ImageInfo imageInfo) {
        String dataPath = imageInfo.getDataPath();
        if (dataPath == null || dataPath.length() == 0) {
            HMLog.info("feedback", d.a);
            return false;
        }
        String dataPath2 = imageInfo.getDataPath();
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(dataPath2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = dataPath2.toLowerCase(locale);
        String[] strArr = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "Screenshots"};
        int i = 0;
        while (i < 13) {
            String str = strArr[i];
            i++;
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
            HMLog.info("feedback", e.a);
        }
        return false;
    }

    private final boolean e(ImageInfo imageInfo) {
        if (CaptureUitlsKt.getScreeSize(this.context).x >= imageInfo.getWidth()) {
            return true;
        }
        HMLog.info("feedback", f.a);
        return false;
    }

    private final boolean f(ImageInfo imageInfo) {
        return imageInfo.getDateTaken() >= this.observerTime && System.currentTimeMillis() - imageInfo.getDateTaken() <= 10000;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, @Nullable Uri uri) throws Throwable {
        super.onChange(selfChange, uri);
        c();
    }
}
