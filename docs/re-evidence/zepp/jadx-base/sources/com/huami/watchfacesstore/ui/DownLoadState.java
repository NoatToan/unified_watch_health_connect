package com.huami.watchfacesstore.ui;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huami/watchfacesstore/ui/DownLoadState;", "", "<init>", "()V", "FAIL", "PROGRESS", "START", c.p, "Lcom/huami/watchfacesstore/ui/DownLoadState$START;", "Lcom/huami/watchfacesstore/ui/DownLoadState$PROGRESS;", "Lcom/huami/watchfacesstore/ui/DownLoadState$SUCCESS;", "Lcom/huami/watchfacesstore/ui/DownLoadState$FAIL;", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class DownLoadState {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watchfacesstore/ui/DownLoadState$FAIL;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class FAIL extends DownLoadState {

        @NotNull
        public static final FAIL INSTANCE = new FAIL();

        private FAIL() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/watchfacesstore/ui/DownLoadState$PROGRESS;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "", "component1", "progress", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getProgress", "()I", "<init>", "(I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PROGRESS extends DownLoadState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int progress;

        public PROGRESS(int i) {
            super(null);
            this.progress = i;
        }

        public static /* synthetic */ PROGRESS copy$default(PROGRESS progress, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = progress.progress;
            }
            return progress.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        @NotNull
        public final PROGRESS copy(int progress) {
            return new PROGRESS(progress);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PROGRESS) && this.progress == ((PROGRESS) other).progress;
        }

        public final int getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return this.progress;
        }

        @NotNull
        public String toString() {
            return "PROGRESS(progress=" + this.progress + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watchfacesstore/ui/DownLoadState$START;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class START extends DownLoadState {

        @NotNull
        public static final START INSTANCE = new START();

        private START() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watchfacesstore/ui/DownLoadState$SUCCESS;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class SUCCESS extends DownLoadState {

        @NotNull
        public static final SUCCESS INSTANCE = new SUCCESS();

        private SUCCESS() {
            super(null);
        }
    }

    private DownLoadState() {
    }

    public /* synthetic */ DownLoadState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
