package com.xiaomi.fitness.route.export.api;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.ps9;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\f\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH¦@¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0019\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00170\u0015H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0017H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0017H&¢\u0006\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/route/export/api/TrackApi;", "", "", "", "getTracksOnDeviceIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lps9;", "getTracksOnDevice", "ids", "", "delTracksOnDevice", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", MediaStoreUtil.MediaInfo.SIZE, "Ljava/io/File;", "file", "name", "distance", "preInstallTrackOnDevice", "(Ljava/lang/String;ILjava/io/File;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "segmentLength", "Lkotlin/Function3;", "", "", "action", "installTrackOnDevice", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "showTrackErrorToast", "(I)V", "showTrackServerErrorToast", "startTrackLibPage", "()V", "routeListNotify", "Companion", "route-export_release"}, k = 1, mv = {2, 0, 0})
public interface TrackApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/route/export/api/TrackApi$Companion;", "", "<init>", "()V", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Object delTracksOnDevice(@NotNull String[] strArr, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getTracksOnDevice(@NotNull Continuation<? super ps9[]> continuation);

    @Nullable
    Object getTracksOnDeviceIds(@NotNull Continuation<? super String[]> continuation);

    @Nullable
    Object installTrackOnDevice(@NotNull String str, @NotNull File file, @Nullable Integer num, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object preInstallTrackOnDevice(@NotNull String str, int i, @NotNull File file, @NotNull String str2, int i2, @NotNull Continuation<? super Integer> continuation);

    void routeListNotify();

    void showTrackErrorToast(int code);

    void showTrackServerErrorToast(int code);

    void startTrackLibPage();
}
