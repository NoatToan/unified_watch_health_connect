package com.xiaomi.fitness.sport.utils;

import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import defpackage.im9;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SPORT_AUDIO_FEEDBACK_URL", "", "buildAudioFeedbackDownloadRequest", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "checkSportRemindAudioFilesComplete", "", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportAudioFeedbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportAudioFeedbackExt.kt\ncom/xiaomi/fitness/sport/utils/SportAudioFeedbackExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,29:1\n12727#2,3:30\n*S KotlinDebug\n*F\n+ 1 SportAudioFeedbackExt.kt\ncom/xiaomi/fitness/sport/utils/SportAudioFeedbackExtKt\n*L\n24#1:30,3\n*E\n"})
public final class SportAudioFeedbackExtKt {

    @NotNull
    public static final String SPORT_AUDIO_FEEDBACK_URL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/AudioFeedback/AudioFeedback.zip?Expires=9223372036854775807&GalaxyAccessKeyId=AKQAB4U5JA25UMUCY3&Signature=xV8Msyb381BK2DJAsV7Tbec8nwI=";

    @NotNull
    public static final DownloadRequest buildAudioFeedbackDownloadRequest() {
        String strH = im9.H();
        Intrinsics.checkNotNullExpressionValue(strH, "getInternalStorageDirPath(...)");
        return new DownloadRequest(SPORT_AUDIO_FEEDBACK_URL, null, null, strH, 6, null);
    }

    public static final boolean checkSportRemindAudioFilesComplete() {
        File[] fileArrListFiles;
        File file = new File(im9.A());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        int i = 0;
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                i++;
            }
        }
        return i == 106;
    }
}
