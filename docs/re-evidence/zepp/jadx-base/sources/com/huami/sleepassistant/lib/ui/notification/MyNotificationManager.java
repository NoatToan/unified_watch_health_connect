package com.huami.sleepassistant.lib.ui.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.jsbridge.BridgeConstant;
import com.huami.sleepassistant.lib.ui.music.MediaPlayService;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.ui.notification.MyNotificationManager;
import com.huami.sleepassistant.lib.utils.ImageUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.container.WebActivity;
import com.loc.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0002\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J:\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J(\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00110\u001cj\u0002`\u001dH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/notification/MyNotificationManager;", "Lcom/huami/sleepassistant/lib/ui/notification/NotificationManagers;", "", "url", "", SOAP.XMLNS, "isPlay", "", "listLoopMediaPosition", "", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "dataList", "isCollection", "collectionName", "Landroid/app/Notification;", "getNotification", "imageurl", "", "getImageInputStream", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "mediaPlay", "Landroid/app/NotificationManager;", "notificationManager", "notificationId", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "service", "updateNotification", "cancelNotification", "Lkotlin/Function0;", "Lcom/huami/sleepassistant/lib/ui/notification/OnBitmapCallBack;", "callBack", "setOnBitmapCallBack", "removeBitmapCallback", "Landroid/content/Context;", "i", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, z.j, "Z", "isCompatible", "<init>", "(Landroid/content/Context;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MyNotificationManager extends NotificationManagers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String k = "MyNotificationManager";

    @Nullable
    private static MyNotificationManager l;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isCompatible;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/notification/MyNotificationManager$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/lib/ui/notification/MyNotificationManager;", "getInstance", "", "TAG", "Ljava/lang/String;", "mInstance", "Lcom/huami/sleepassistant/lib/ui/notification/MyNotificationManager;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized MyNotificationManager getInstance(@NotNull Context context) {
            MyNotificationManager myNotificationManager;
            if (MyNotificationManager.l == null) {
                MyNotificationManager.l = new MyNotificationManager(context, null);
            }
            myNotificationManager = MyNotificationManager.l;
            if (myNotificationManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.huami.sleepassistant.lib.ui.notification.MyNotificationManager");
            }
            return myNotificationManager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("获取图片失败", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("获取图片失败", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("获取图片失败", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("更新助眠音律通知栏：", MyNotificationManager.this.context.getPackageName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("是否通知栏可以显示：", Boolean.valueOf(this.a));
        }
    }

    private MyNotificationManager(Context context) {
        this.context = context;
    }

    public /* synthetic */ MyNotificationManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MyNotificationManager myNotificationManager, Bitmap bitmap) {
        myNotificationManager.setMBitmap(bitmap);
        Function0<Unit> callBack = myNotificationManager.getCallBack();
        if (callBack == null) {
            return;
        }
        callBack.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Throwable th) {
        HMLog.warn$default(null, th, new c(th), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MyNotificationManager myNotificationManager, String str, Subscriber subscriber) throws IOException {
        InputStream inputStreamOpen = myNotificationManager.context.getAssets().open(str.substring(22, str.length()));
        Bitmap bitmap = ImageUtils.INSTANCE.getBitmap(inputStreamOpen);
        inputStreamOpen.close();
        subscriber.onNext(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MyNotificationManager myNotificationManager, Bitmap bitmap) {
        myNotificationManager.setMBitmap(bitmap);
        Function0<Unit> callBack = myNotificationManager.getCallBack();
        if (callBack == null) {
            return;
        }
        callBack.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Throwable th) {
        HMLog.warn$default(null, th, new a(th), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MyNotificationManager myNotificationManager, String str, Subscriber subscriber) {
        Bitmap bitmap = null;
        myNotificationManager.setMBitmap(null);
        try {
            bitmap = ImageUtils.INSTANCE.getBitmap(Base64.decode((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(1), 0));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        subscriber.onNext(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MyNotificationManager myNotificationManager, Bitmap bitmap) {
        myNotificationManager.setMBitmap(bitmap);
        Function0<Unit> callBack = myNotificationManager.getCallBack();
        if (callBack == null) {
            return;
        }
        callBack.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Throwable th) {
        HMLog.warn$default(null, th, new b(th), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(MyNotificationManager myNotificationManager, String str, Subscriber subscriber) {
        Bitmap bitmap = null;
        myNotificationManager.setMBitmap(null);
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(6000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            InputStream inputStream = httpURLConnection.getInputStream();
            bitmap = ImageUtils.INSTANCE.getBitmap(inputStream);
            inputStream.close();
            subscriber.onNext(bitmap);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final boolean s(String url) {
        return StringsKt__StringsKt.indexOf$default((CharSequence) url, "data:image/png;base64,", 0, false, 6, (Object) null) > -1 || StringsKt__StringsKt.indexOf$default((CharSequence) url, "data:image/jpg;base64,", 0, false, 6, (Object) null) > -1;
    }

    @Override // com.huami.sleepassistant.lib.ui.notification.NotificationManagers
    public void cancelNotification(@NotNull NotificationManager notificationManager, int notificationId, @NotNull MediaPlayService service) {
        service.stopForeground(true);
        notificationManager.cancel(notificationId);
        INSTANCE.getInstance(service.getApplicationContext()).setMNotificationPostTime(0L);
        setMNotifyMode(0);
    }

    @Override // com.huami.sleepassistant.lib.ui.notification.NotificationManagers
    public void getImageInputStream(@NotNull final String imageurl) {
        if (TextUtils.isEmpty(imageurl)) {
            return;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) imageurl, (CharSequence) com.squareup.picasso.b.b, false, 2, (Object) null)) {
            setMBitmap(null);
            Observable.create(new Observable.OnSubscribe() { // from class: za5
                @Override // rx.functions.Action1
                public final void call(Object obj) throws IOException {
                    MyNotificationManager.l(this.a, imageurl, (Subscriber) obj);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: db5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.m(this.a, (Bitmap) obj);
                }
            }, new Action1() { // from class: hb5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.n((Throwable) obj);
                }
            });
        } else if (s(imageurl)) {
            Observable.create(new Observable.OnSubscribe() { // from class: bb5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.o(this.a, imageurl, (Subscriber) obj);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: cb5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.p(this.a, (Bitmap) obj);
                }
            }, new Action1() { // from class: fb5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.q((Throwable) obj);
                }
            });
        } else {
            Observable.create(new Observable.OnSubscribe() { // from class: ab5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.r(this.a, imageurl, (Subscriber) obj);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: eb5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.j(this.a, (Bitmap) obj);
                }
            }, new Action1() { // from class: gb5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MyNotificationManager.k((Throwable) obj);
                }
            });
        }
    }

    @Override // com.huami.sleepassistant.lib.ui.notification.NotificationManagers
    @Nullable
    public Notification getNotification(boolean isPlay, int listLoopMediaPosition, @Nullable List<MusicControlVo> dataList, boolean isCollection, @NotNull String collectionName) {
        getCurrentDataList().clear();
        if (listLoopMediaPosition >= 0 && listLoopMediaPosition < (dataList == null ? 0 : dataList.size())) {
            if (dataList != null) {
                getCurrentDataList().add(dataList.get(listLoopMediaPosition));
            }
        } else if (dataList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : dataList) {
                if (!TextUtils.isEmpty(((MusicControlVo) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                getCurrentDataList().add((MusicControlVo) it2.next());
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        int size = getCurrentDataList().size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i == 0) {
                    stringBuffer.append(getCurrentDataList().get(i).getSimpleChinese());
                } else {
                    stringBuffer.append(Intrinsics.stringPlus("+", getCurrentDataList().get(i).getSimpleChinese()));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        if (TextUtils.isEmpty(collectionName)) {
            collectionName = stringBuffer.toString();
        }
        String string = stringBuffer.toString();
        String bigImgUrl = getCurrentDataList().size() > 0 ? getCurrentDataList().get(getCurrentDataList().size() - 1).getBigImgUrl() : null;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        boolean z = (Intrinsics.areEqual(str.toLowerCase(locale), "xiaomi") && Build.VERSION.SDK_INT <= 28) || (Intrinsics.areEqual(str.toLowerCase(locale), "huawei") && Build.VERSION.SDK_INT <= 28) || ((Intrinsics.areEqual(str.toLowerCase(locale), "oppo") && Build.VERSION.SDK_INT <= 28) || (Intrinsics.areEqual(str.toLowerCase(locale), "vivo") && Build.VERSION.SDK_INT <= 28));
        this.isCompatible = z;
        RemoteViews remoteViews = (!z || Build.VERSION.SDK_INT == 25) ? new RemoteViews(this.context.getPackageName(), R.layout.sls_media_player_notification) : new RemoteViews(this.context.getPackageName(), R.layout.sls_media_player_notification2);
        remoteViews.setTextViewText(R.id.sls_notification_title, collectionName);
        remoteViews.setTextViewText(R.id.sls_notification_text, string);
        Intent intent = new Intent(NotificationManagersKt.TOGGLE_PAUSE_ACTION);
        intent.putExtra("FLAG", 1);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = i3 >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH;
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 0, intent, i4);
        int i5 = R.id.sls_notification_btn_pause;
        remoteViews.setImageViewResource(i5, isPlay ? R.drawable.sls_notification_btn_play : R.drawable.sls_notification_btn_pause);
        remoteViews.setOnClickPendingIntent(i5, broadcast);
        int i6 = R.id.sls_notification_btn_collection;
        remoteViews.setImageViewResource(i6, isCollection ? R.drawable.sls_notification_collection : R.drawable.sls_notification_btn_collection_chose);
        Intent intent2 = new Intent(NotificationManagersKt.TOGGLE_COLLECTION_ACTION);
        intent2.putExtra("FLAG", 3);
        remoteViews.setOnClickPendingIntent(i6, PendingIntent.getBroadcast(this.context, 0, intent2, i4));
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(this.context.getPackageName(), "com.huami.sleepassistant.lib.ui.music.MusicWebActivity"));
        HMLog.info(k, new d());
        if (Intrinsics.areEqual(this.context.getPackageName(), "com.xiaomi.hm.health")) {
            intent3.putExtra(WebActivity.KEY_WEB_ITEM, BridgeConstant.INSTANCE.buildMiWebItem());
        } else {
            intent3.putExtra(WebActivity.KEY_WEB_ITEM, BridgeConstant.INSTANCE.buildWebItem());
        }
        intent3.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, intent3, AMapEngineUtils.HALF_MAX_P20_WIDTH);
        if (bigImgUrl == null || TextUtils.isEmpty(bigImgUrl)) {
            remoteViews.setImageViewBitmap(R.id.sls_notification_image, null);
        } else if (!Intrinsics.areEqual(getTempUrl(), bigImgUrl)) {
            getImageInputStream(bigImgUrl);
            setTempUrl(bigImgUrl);
        } else if (getMBitmap() != null) {
            if (this.isCompatible) {
                remoteViews.setImageViewBitmap(R.id.sls_notification_image, getMBitmap());
            } else {
                remoteViews.setImageViewBitmap(R.id.sls_notification_image, getMBitmap());
            }
        }
        if (getMNotificationPostTime() == 0) {
            setMNotificationPostTime(System.currentTimeMillis());
        }
        NotificationCompat.Builder when = (i3 >= 26 ? new NotificationCompat.Builder(this.context, getChannel()) : new NotificationCompat.Builder(this.context)).setCustomHeadsUpContentView(null).setSmallIcon(R.mipmap.ic_launcher).setContentIntent(activity).setWhen(getMNotificationPostTime());
        if (this.isCompatible) {
            when.setContent(remoteViews);
        } else {
            when.setCustomBigContentView(remoteViews).setContent(null);
        }
        if (i3 >= 17) {
            when.setShowWhen(false);
        }
        if (!this.isCompatible) {
            when.setStyle(new androidx.media.app.NotificationCompat.MediaStyle());
        }
        setMNotification(when.build());
        return getMNotification();
    }

    @Override // com.huami.sleepassistant.lib.ui.notification.NotificationManagers
    public void removeBitmapCallback() {
        setCallBack(null);
    }

    @Override // com.huami.sleepassistant.lib.ui.notification.NotificationManagers
    public void setOnBitmapCallBack(@NotNull Function0<Unit> callBack) {
        setCallBack(callBack);
    }

    @Override // com.huami.sleepassistant.lib.ui.notification.NotificationManagers
    public void updateNotification(@NotNull MediaMusicPlayUtils1 mediaPlay, @NotNull NotificationManager notificationManager, int notificationId, @NotNull MediaPlayService service) {
        int i;
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(this.context).areNotificationsEnabled();
        HMLog.info(k, new e(zAreNotificationsEnabled));
        if (!zAreNotificationsEnabled) {
            if (getMNotifyMode() != 0) {
                cancelNotification(notificationManager, notificationId, service);
                return;
            }
            return;
        }
        if (mediaPlay.isPlaying()) {
            i = 1;
        } else {
            i = (mediaPlay.getPlayStatus() == MediaMusicPlayUtils1.PlayStatus.ALL_PAUSE || mediaPlay.getPlayStatus() == MediaMusicPlayUtils1.PlayStatus.ALL_STOP) ? 2 : 0;
        }
        if (getMNotifyMode() != i) {
            if (getMNotifyMode() == 1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    service.stopForeground(i == 0);
                } else {
                    service.stopForeground(i == 0 || i == 2);
                }
            } else if (i == 0) {
                notificationManager.cancel(notificationId);
                INSTANCE.getInstance(service.getApplicationContext()).setMNotificationPostTime(0L);
            }
        }
        if (i == 1) {
            service.startForeground(notificationId, INSTANCE.getInstance(service.getApplicationContext()).getNotification(mediaPlay.isPlaying(), mediaPlay.getMListLoopMediaPosition(), mediaPlay.getDataList(), TextUtils.isEmpty(mediaPlay.getMCollectionId()), mediaPlay.getMCollectionName()));
        } else if (i == 2) {
            notificationManager.notify(notificationId, INSTANCE.getInstance(service.getApplicationContext()).getNotification(mediaPlay.isPlaying(), mediaPlay.getMListLoopMediaPosition(), mediaPlay.getDataList(), TextUtils.isEmpty(mediaPlay.getMCollectionId()), mediaPlay.getMCollectionName()));
        }
        setMNotifyMode(i);
    }
}
