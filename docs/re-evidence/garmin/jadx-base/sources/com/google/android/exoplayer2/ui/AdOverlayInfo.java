package com.google.android.exoplayer2.ui;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 2;
    public static final int PURPOSE_CONTROLS = 1;
    public static final int PURPOSE_NOT_VISIBLE = 4;
    public static final int PURPOSE_OTHER = 3;
    public final int purpose;
    public final String reasonDetail;

    /* JADX INFO: renamed from: view, reason: collision with root package name */
    public final View f53103view;

    public static final class Builder {
        private String detailedReason;
        private final int purpose;

        /* JADX INFO: renamed from: view, reason: collision with root package name */
        private final View f53104view;

        public Builder(View view2, int i14) {
            this.f53104view = view2;
            this.purpose = i14;
        }

        public AdOverlayInfo build() {
            return new AdOverlayInfo(this.f53104view, this.purpose, this.detailedReason);
        }

        public Builder setDetailedReason(String str) {
            this.detailedReason = str;
            return this;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    @Deprecated
    public AdOverlayInfo(View view2, int i14, String str) {
        this.f53103view = view2;
        this.purpose = i14;
        this.reasonDetail = str;
    }

    @Deprecated
    public AdOverlayInfo(View view2, int i14) {
        this(view2, i14, null);
    }
}
