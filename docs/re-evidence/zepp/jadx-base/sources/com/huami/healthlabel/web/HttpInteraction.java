package com.huami.healthlabel.web;

import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&J\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH&J$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/huami/healthlabel/web/HttpInteraction;", "", "", "url", "", "params", "Lcom/huami/healthlabel/web/Response;", "get", "body", "Lcom/huami/healthlabel/web/ContentType;", CameraActivity.KEY_CONTENT_TYPE, DataItem.HTTP_METHOD_POST, "delete", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public interface HttpInteraction {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Response post$default(HttpInteraction httpInteraction, String str, String str2, ContentType contentType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i & 4) != 0) {
                contentType = ContentType.JSON;
            }
            return httpInteraction.post(str, str2, contentType);
        }
    }

    @NotNull
    Response delete(@NotNull String url, @NotNull Map<String, String> params);

    @NotNull
    Response get(@NotNull String url, @NotNull Map<String, String> params);

    @NotNull
    Response post(@NotNull String url, @NotNull String body, @NotNull ContentType contentType);
}
