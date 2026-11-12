package com.huami.sleepassistant.lib.ui.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.lib.ui.music.MediaPlayService;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bU\u0010VJ:\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH&J(\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&J\u001a\u0010\u001d\u001a\u00020\u000f2\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u000f0\u001aj\u0002`\u001bH&J\b\u0010\u001e\u001a\u00020\u000fH&R$\u0010%\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00102\u001a\u00020\n8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0007038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010I\u001a\u0004\u0018\u00010B8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010/\u001a\u0004\bQ\u00101\"\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/notification/NotificationManagers;", "", "", "isPlay", "", "listLoopMediaPosition", "", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "dataList", "isCollection", "", "collectionName", "Landroid/app/Notification;", "getNotification", "imageUrl", "", "getImageInputStream", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "mediaPlay", "Landroid/app/NotificationManager;", "notificationManager", "notificationId", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "service", "updateNotification", "cancelNotification", "Lkotlin/Function0;", "Lcom/huami/sleepassistant/lib/ui/notification/OnBitmapCallBack;", "callBack", "setOnBitmapCallBack", "removeBitmapCallback", "a", "Landroid/app/Notification;", "getMNotification", "()Landroid/app/Notification;", "setMNotification", "(Landroid/app/Notification;)V", "mNotification", "", "b", "J", "getMNotificationPostTime", "()J", "setMNotificationPostTime", "(J)V", "mNotificationPostTime", "c", "Ljava/lang/String;", "getChannel", "()Ljava/lang/String;", "channel", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getCurrentDataList", "()Ljava/util/List;", "setCurrentDataList", "(Ljava/util/List;)V", "currentDataList", "e", LogUtil.I, "getMNotifyMode", "()I", "setMNotifyMode", "(I)V", "mNotifyMode", "Landroid/graphics/Bitmap;", "f", "Landroid/graphics/Bitmap;", "getMBitmap", "()Landroid/graphics/Bitmap;", "setMBitmap", "(Landroid/graphics/Bitmap;)V", "mBitmap", "g", "Lkotlin/jvm/functions/Function0;", "getCallBack", "()Lkotlin/jvm/functions/Function0;", "setCallBack", "(Lkotlin/jvm/functions/Function0;)V", "h", "getTempUrl", "setTempUrl", "(Ljava/lang/String;)V", "tempUrl", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class NotificationManagers {
    public static final int NOTIFY_MODE_BACKGROUND = 2;
    public static final int NOTIFY_MODE_FOREGROUND = 1;
    public static final int NOTIFY_MODE_NONE = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Notification mNotification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long mNotificationPostTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mNotifyMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Bitmap mBitmap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> callBack;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String channel = "subscribe";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<MusicControlVo> currentDataList = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private String tempUrl = "";

    public abstract void cancelNotification(@NotNull NotificationManager notificationManager, int notificationId, @NotNull MediaPlayService service);

    @Nullable
    public final Function0<Unit> getCallBack() {
        return this.callBack;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final List<MusicControlVo> getCurrentDataList() {
        return this.currentDataList;
    }

    public abstract void getImageInputStream(@NotNull String imageUrl);

    @Nullable
    public final Bitmap getMBitmap() {
        return this.mBitmap;
    }

    @Nullable
    public final Notification getMNotification() {
        return this.mNotification;
    }

    public final long getMNotificationPostTime() {
        return this.mNotificationPostTime;
    }

    public final int getMNotifyMode() {
        return this.mNotifyMode;
    }

    @Nullable
    public abstract Notification getNotification(boolean isPlay, int listLoopMediaPosition, @Nullable List<MusicControlVo> dataList, boolean isCollection, @NotNull String collectionName);

    @NotNull
    public final String getTempUrl() {
        return this.tempUrl;
    }

    public abstract void removeBitmapCallback();

    public final void setCallBack(@Nullable Function0<Unit> function0) {
        this.callBack = function0;
    }

    public final void setCurrentDataList(@NotNull List<MusicControlVo> list) {
        this.currentDataList = list;
    }

    public final void setMBitmap(@Nullable Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public final void setMNotification(@Nullable Notification notification) {
        this.mNotification = notification;
    }

    public final void setMNotificationPostTime(long j) {
        this.mNotificationPostTime = j;
    }

    public final void setMNotifyMode(int i) {
        this.mNotifyMode = i;
    }

    public abstract void setOnBitmapCallBack(@NotNull Function0<Unit> callBack);

    public final void setTempUrl(@NotNull String str) {
        this.tempUrl = str;
    }

    public abstract void updateNotification(@NotNull MediaMusicPlayUtils1 mediaPlay, @NotNull NotificationManager notificationManager, int notificationId, @NotNull MediaPlayService service);
}
