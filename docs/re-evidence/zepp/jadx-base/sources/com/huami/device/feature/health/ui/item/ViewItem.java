package com.huami.device.feature.health.ui.item;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/device/feature/health/ui/item/ViewItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Companion", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public interface ViewItem extends MultiItemEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VIEW_TYPE_HEADER = 1;
    public static final int VIEW_TYPE_ITEM = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/device/feature/health/ui/item/ViewItem$Companion;", "", "", "VIEW_TYPE_HEADER", LogUtil.I, "VIEW_TYPE_ITEM", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VIEW_TYPE_HEADER = 1;
        public static final int VIEW_TYPE_ITEM = 2;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }
}
