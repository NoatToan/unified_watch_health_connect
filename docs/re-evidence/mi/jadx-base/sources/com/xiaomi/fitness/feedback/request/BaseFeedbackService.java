package com.xiaomi.fitness.feedback.request;

import com.xiaomi.fitness.feedback.data.DownloadFileModel;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J8\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\r\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "", "getFeedBackTypes", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "Ljava/util/ArrayList;", "moduleid", "", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUploadFileInfo", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "data", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback", "getDownloadFileInfo", "Lcom/xiaomi/fitness/feedback/data/DownloadFileModel$DownloadFileResult;", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BaseFeedbackService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "healthapp/";

        private Companion() {
        }
    }

    @u0a
    @ngh("stat/feedback")
    @Nullable
    Object feedback(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<String>> continuation);

    @Nullable
    @uua("user/gen_download_userfileurl")
    Object getDownloadFileInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<DownloadFileModel.DownloadFileResult>> continuation);

    @Nullable
    @uua("stat/feedback_tags")
    Object getFeedBackTypes(@NotNull @xfi("data") String str, @NotNull @xfi("locale") String str2, @NotNull Continuation<? super BaseResult<ArrayList<FeedBackModelData.FeedBackType>>> continuation);

    @Nullable
    @uua("user/gen_upload_userfileurl")
    Object getUploadFileInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<UploadFileModel.UploadFileResult>> continuation);
}
