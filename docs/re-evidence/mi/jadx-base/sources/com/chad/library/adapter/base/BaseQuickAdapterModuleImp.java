package com.chad.library.adapter.base;

import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapterModuleImp;", "", "addDraggableModule", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "addLoadMoreModule", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "addUpFetchModule", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
interface BaseQuickAdapterModuleImp {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public static final class DefaultImpls {
        @NotNull
        public static BaseDraggableModule addDraggableModule(BaseQuickAdapterModuleImp baseQuickAdapterModuleImp, @NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
            return new BaseDraggableModule(baseQuickAdapter);
        }

        @NotNull
        public static BaseLoadMoreModule addLoadMoreModule(BaseQuickAdapterModuleImp baseQuickAdapterModuleImp, @NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
            return new BaseLoadMoreModule(baseQuickAdapter);
        }

        @NotNull
        public static BaseUpFetchModule addUpFetchModule(BaseQuickAdapterModuleImp baseQuickAdapterModuleImp, @NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
            return new BaseUpFetchModule(baseQuickAdapter);
        }
    }

    @NotNull
    BaseDraggableModule addDraggableModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter);

    @NotNull
    BaseLoadMoreModule addLoadMoreModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter);

    @NotNull
    BaseUpFetchModule addUpFetchModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter);
}
