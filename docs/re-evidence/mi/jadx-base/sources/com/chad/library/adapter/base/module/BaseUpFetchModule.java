package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.hah;
import defpackage.rbq;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u001c\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0006R\u001c\u0010\u001c\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "Lrbq;", "", "position", "", "autoUpFetch$com_github_CymChad_brvah", "(I)V", "autoUpFetch", "Lhah;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnUpFetchListener", "(Lhah;)V", "mUpFetchListener", "Lhah;", "", "isUpFetchEnable", "Z", "()Z", "setUpFetchEnable", "(Z)V", "isUpFetching", "setUpFetching", "startUpFetchPosition", "I", "getStartUpFetchPosition", "()I", "setStartUpFetchPosition", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public class BaseUpFetchModule implements rbq {
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isUpFetchEnable;
    private boolean isUpFetching;
    private hah mUpFetchListener;
    private int startUpFetchPosition = 1;

    public BaseUpFetchModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        this.baseQuickAdapter = baseQuickAdapter;
    }

    public final void autoUpFetch$com_github_CymChad_brvah(int position) {
    }

    public final int getStartUpFetchPosition() {
        return this.startUpFetchPosition;
    }

    /* JADX INFO: renamed from: isUpFetchEnable, reason: from getter */
    public final boolean getIsUpFetchEnable() {
        return this.isUpFetchEnable;
    }

    /* JADX INFO: renamed from: isUpFetching, reason: from getter */
    public final boolean getIsUpFetching() {
        return this.isUpFetching;
    }

    @Override // defpackage.rbq
    public void setOnUpFetchListener(@Nullable hah listener) {
    }

    public final void setStartUpFetchPosition(int i) {
        this.startUpFetchPosition = i;
    }

    public final void setUpFetchEnable(boolean z) {
        this.isUpFetchEnable = z;
    }

    public final void setUpFetching(boolean z) {
        this.isUpFetching = z;
    }
}
