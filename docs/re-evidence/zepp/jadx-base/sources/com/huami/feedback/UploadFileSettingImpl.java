package com.huami.feedback;

import com.huami.feedback.api.UploadFileSetting;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R&\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/feedback/UploadFileSettingImpl;", "Lcom/huami/feedback/api/UploadFileSetting;", "", "name", "", "addUploadFileName", "removeFileUploadSetting", "", "getUploadSettings", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "a", "Ljava/util/HashSet;", "uploadFileSetting", "<init>", "()V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class UploadFileSettingImpl implements UploadFileSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HashSet<String> uploadFileSetting = new HashSet<>();

    @Override // com.huami.feedback.api.UploadFileSetting
    public void addUploadFileName(@NotNull String name) {
        this.uploadFileSetting.add(name);
    }

    @Override // com.huami.feedback.api.UploadFileSetting
    @NotNull
    public List<String> getUploadSettings() {
        return CollectionsKt___CollectionsKt.toList(this.uploadFileSetting);
    }

    @Override // com.huami.feedback.api.UploadFileSetting
    public void removeFileUploadSetting(@NotNull String name) {
        this.uploadFileSetting.remove(name);
    }
}
