package com.huami.moving.ui.sport.detail.screenshot;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0011\b\u0016\u0012\u0006\u0010<\u001a\u00020$¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004R\u001e\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R&\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u000607j\b\u0012\u0004\u0012\u00020\u0006`88\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lcom/huami/moving/ui/sport/detail/screenshot/ScreenShotListenManager;", "", "Landroid/net/Uri;", "contentUri", "", "e", "", "data", "", "dateTaken", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "f", "", "b", "imagePath", "Landroid/graphics/Point;", "c", GoogleApiAvailabilityLight.a, "a", "Lcom/huami/moving/ui/sport/detail/screenshot/OnScreenShotListener;", "mOnScreenShotListener", "setOnChangeListener", "startListen", "stopListen", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "[Ljava/lang/String;", "MEDIA_PROJECTIONS", "MEDIA_PROJECTIONS_API_16", "KEYWORDS", "Landroid/graphics/Point;", "sScreenRealSize", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", "g", "Lcom/huami/moving/ui/sport/detail/screenshot/OnScreenShotListener;", "mListener", "Lcom/huami/moving/ui/sport/detail/screenshot/ScreenshotContentObserver;", "h", "Lcom/huami/moving/ui/sport/detail/screenshot/ScreenshotContentObserver;", "mInternalObserver", "i", "mExternalObserver", "Landroid/os/Handler;", z.j, "Landroid/os/Handler;", "mUiHandler", hl.k, "J", "mStartListenTime", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "l", "Ljava/util/ArrayList;", "sHasCallbackPaths", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenShotListenManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String[] MEDIA_PROJECTIONS;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String[] MEDIA_PROJECTIONS_API_16;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String[] KEYWORDS;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Point sScreenRealSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Context mContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private OnScreenShotListener mListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ScreenshotContentObserver mInternalObserver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ScreenshotContentObserver mExternalObserver;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Handler mUiHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long mStartListenTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> sHasCallbackPaths;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/moving/ui/sport/detail/screenshot/ScreenShotListenManager$Companion;", "", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/moving/ui/sport/detail/screenshot/ScreenShotListenManager;", "newInstance", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void a() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                return;
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String string = null;
            if (stackTrace != null && stackTrace.length >= 4) {
                string = stackTrace[3].toString();
            }
            throw new IllegalStateException("Call the method must be in main thread: " + string);
        }

        @JvmStatic
        @NotNull
        public final ScreenShotListenManager newInstance(@NotNull Context context) {
            a();
            return new ScreenShotListenManager(context);
        }
    }

    public ScreenShotListenManager(@NotNull Context context) {
        String simpleName = ScreenShotListenManager.class.getSimpleName();
        this.TAG = simpleName;
        this.MEDIA_PROJECTIONS = new String[]{"_data", "datetaken"};
        this.MEDIA_PROJECTIONS_API_16 = new String[]{"_data", "datetaken", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height"};
        this.KEYWORDS = new String[]{"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
        this.mUiHandler = new Handler(Looper.getMainLooper());
        this.sHasCallbackPaths = new ArrayList<>();
        this.mContext = context;
        if (this.sScreenRealSize == null) {
            Point pointD = d();
            this.sScreenRealSize = pointD;
            if (pointD == null) {
                Log.w(simpleName, "Get screen real size failed.");
                return;
            }
            Integer numValueOf = pointD == null ? null : Integer.valueOf(pointD.x);
            Point point = this.sScreenRealSize;
            Log.d(simpleName, "Screen Real Size: " + numValueOf + " * " + (point != null ? Integer.valueOf(point.y) : null));
        }
    }

    private final boolean a(String imagePath) {
        if (this.sHasCallbackPaths.contains(imagePath)) {
            return true;
        }
        if (this.sHasCallbackPaths.size() >= 20) {
            int i = 0;
            do {
                i++;
                this.sHasCallbackPaths.remove(0);
            } while (i <= 4);
        }
        this.sHasCallbackPaths.add(imagePath);
        return false;
    }

    private final boolean b(String data, long dateTaken, int width, int height) {
        Point point;
        int i;
        if (dateTaken > System.currentTimeMillis() || dateTaken < this.mStartListenTime || System.currentTimeMillis() - dateTaken > 10000 || (((point = this.sScreenRealSize) != null && ((width > (i = point.x) || height > point.y) && (height > i || width > point.y))) || TextUtils.isEmpty(data))) {
            return false;
        }
        Objects.requireNonNull(data, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = data.toLowerCase();
        String[] strArr = this.KEYWORDS;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final Point c(String imagePath) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imagePath, options);
        return new Point(options.outWidth, options.outHeight);
    }

    private final Point d() {
        Point point;
        Exception e;
        Object systemService = null;
        try {
            point = new Point();
            try {
                Context context = this.mContext;
                if (context != null) {
                    systemService = context.getSystemService("window");
                }
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
                }
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Method method = Display.class.getMethod("getRawWidth", new Class[0]);
                        Method method2 = Display.class.getMethod("getRawHeight", new Class[0]);
                        Object objInvoke = method.invoke(defaultDisplay, new Object[0]);
                        if (objInvoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        int iIntValue = ((Integer) objInvoke).intValue();
                        Object objInvoke2 = method2.invoke(defaultDisplay, new Object[0]);
                        if (objInvoke2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        point.set(iIntValue, ((Integer) objInvoke2).intValue());
                    } catch (Exception e2) {
                        point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
            }
        } catch (Exception e4) {
            point = null;
            e = e4;
        }
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Uri contentUri) {
        ContentResolver contentResolver;
        int columnIndex;
        int i;
        int i2;
        Cursor cursorQuery = null;
        try {
            try {
                Context context = this.mContext;
                if (context != null && (contentResolver = context.getContentResolver()) != null) {
                    cursorQuery = contentResolver.query(contentUri, Build.VERSION.SDK_INT < 16 ? this.MEDIA_PROJECTIONS : this.MEDIA_PROJECTIONS_API_16, null, null, "date_added desc limit 1");
                }
                if (cursorQuery == null) {
                    Log.e(this.TAG, "Deviant logic.");
                    return;
                }
                if (!cursorQuery.moveToFirst()) {
                    Log.d(this.TAG, "Cursor no data.");
                    if (cursorQuery.isClosed()) {
                        return;
                    }
                    cursorQuery.close();
                    return;
                }
                int columnIndex2 = cursorQuery.getColumnIndex("_data");
                int columnIndex3 = cursorQuery.getColumnIndex("datetaken");
                int columnIndex4 = -1;
                if (Build.VERSION.SDK_INT >= 16) {
                    columnIndex4 = cursorQuery.getColumnIndex(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                    columnIndex = cursorQuery.getColumnIndex("height");
                } else {
                    columnIndex = -1;
                }
                String string = cursorQuery.getString(columnIndex2);
                long j = cursorQuery.getLong(columnIndex3);
                if (columnIndex4 < 0 || columnIndex < 0) {
                    Point pointC = c(string);
                    int i3 = pointC.x;
                    i = pointC.y;
                    i2 = i3;
                } else {
                    i2 = cursorQuery.getInt(columnIndex4);
                    i = cursorQuery.getInt(columnIndex);
                }
                f(string, j, i2, i);
                if (cursorQuery.isClosed()) {
                    return;
                }
                cursorQuery.close();
            } catch (Exception e) {
                e.printStackTrace();
                if (0 == 0 || cursorQuery.isClosed()) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private final void f(String data, long dateTaken, int width, int height) {
        OnScreenShotListener onScreenShotListener;
        if (b(data, dateTaken, width, height)) {
            if (a(data) || (onScreenShotListener = this.mListener) == null) {
                return;
            }
            onScreenShotListener.onShot(data);
            return;
        }
        Log.w(this.TAG, "Media content changed, but not screenshot: path = " + data + "; size = " + width + " * " + height + "; date = " + dateTaken);
    }

    @JvmStatic
    @NotNull
    public static final ScreenShotListenManager newInstance(@NotNull Context context) {
        return INSTANCE.newInstance(context);
    }

    public final void setOnChangeListener(@Nullable OnScreenShotListener mOnScreenShotListener) {
        this.mListener = mOnScreenShotListener;
    }

    public final void startListen() {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        INSTANCE.a();
        this.sHasCallbackPaths.clear();
        this.mStartListenTime = System.currentTimeMillis();
        ScreenshotContentObserver screenshotContentObserver = new ScreenshotContentObserver(this.mUiHandler);
        this.mInternalObserver = screenshotContentObserver;
        screenshotContentObserver.setOnChangeListener(new OnChangeListener() { // from class: com.huami.moving.ui.sport.detail.screenshot.ScreenShotListenManager.startListen.1
            @Override // com.huami.moving.ui.sport.detail.screenshot.OnChangeListener
            public void onChange(@NotNull Uri uri) {
                ScreenShotListenManager.this.e(uri);
            }
        });
        ScreenshotContentObserver screenshotContentObserver2 = new ScreenshotContentObserver(this.mUiHandler);
        this.mExternalObserver = screenshotContentObserver2;
        screenshotContentObserver2.setOnChangeListener(new OnChangeListener() { // from class: com.huami.moving.ui.sport.detail.screenshot.ScreenShotListenManager.startListen.2
            @Override // com.huami.moving.ui.sport.detail.screenshot.OnChangeListener
            public void onChange(@NotNull Uri uri) {
                ScreenShotListenManager.this.e(uri);
            }
        });
        Context context = this.mContext;
        if (context != null && (contentResolver2 = context.getContentResolver()) != null) {
            Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
            ScreenshotContentObserver screenshotContentObserver3 = this.mInternalObserver;
            Objects.requireNonNull(screenshotContentObserver3, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver2.registerContentObserver(uri, false, screenshotContentObserver3);
        }
        Context context2 = this.mContext;
        if (context2 == null || (contentResolver = context2.getContentResolver()) == null) {
            return;
        }
        Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ScreenshotContentObserver screenshotContentObserver4 = this.mExternalObserver;
        Objects.requireNonNull(screenshotContentObserver4, "null cannot be cast to non-null type android.database.ContentObserver");
        contentResolver.registerContentObserver(uri2, false, screenshotContentObserver4);
    }

    public final void stopListen() {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        INSTANCE.a();
        if (this.mInternalObserver != null) {
            try {
                Context context = this.mContext;
                if (context != null && (contentResolver = context.getContentResolver()) != null) {
                    ScreenshotContentObserver screenshotContentObserver = this.mInternalObserver;
                    if (screenshotContentObserver == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.database.ContentObserver");
                    }
                    contentResolver.unregisterContentObserver(screenshotContentObserver);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mInternalObserver = null;
        }
        if (this.mExternalObserver != null) {
            try {
                Context context2 = this.mContext;
                if (context2 != null && (contentResolver2 = context2.getContentResolver()) != null) {
                    ScreenshotContentObserver screenshotContentObserver2 = this.mExternalObserver;
                    if (screenshotContentObserver2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.database.ContentObserver");
                    }
                    contentResolver2.unregisterContentObserver(screenshotContentObserver2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.mExternalObserver = null;
        }
        this.mStartListenTime = 0L;
        this.sHasCallbackPaths.clear();
        this.mListener = null;
        this.mContext = null;
    }
}
