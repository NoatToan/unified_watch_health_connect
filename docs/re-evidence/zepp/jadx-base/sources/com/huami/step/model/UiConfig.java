package com.huami.step.model;

import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/step/model/UiConfig;", "", "", "a", "Z", "isShadow", "()Z", "setShadow", "(Z)V", "Lcom/huami/step/model/UiConfig$Builder;", "builder", "<init>", "(Lcom/huami/step/model/UiConfig$Builder;)V", ShareStoryContent.Builder.k, "step_release"}, k = 1, mv = {1, 5, 1})
public final class UiConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isShadow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0004\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/step/model/UiConfig$Builder;", "", "", "_isShadow", "setShadow", "Lcom/huami/step/model/UiConfig;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Z", "isShadow", "()Z", "(Z)V", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isShadow;

        @NotNull
        public final UiConfig build() {
            return new UiConfig(this, null);
        }

        /* JADX INFO: renamed from: isShadow, reason: from getter */
        public final boolean getIsShadow() {
            return this.isShadow;
        }

        /* JADX INFO: renamed from: setShadow, reason: collision with other method in class */
        public final void m3390setShadow(boolean z) {
            this.isShadow = z;
        }

        @NotNull
        public final Builder setShadow(boolean _isShadow) {
            this.isShadow = _isShadow;
            return this;
        }
    }

    private UiConfig(Builder builder) {
        this.isShadow = builder.getIsShadow();
    }

    public /* synthetic */ UiConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX INFO: renamed from: isShadow, reason: from getter */
    public final boolean getIsShadow() {
        return this.isShadow;
    }

    public final void setShadow(boolean z) {
        this.isShadow = z;
    }
}
