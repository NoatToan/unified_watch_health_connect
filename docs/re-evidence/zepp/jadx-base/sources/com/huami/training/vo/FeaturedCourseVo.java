package com.huami.training.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/training/vo/FeaturedCourseVo;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", "name", "c", "getRank", WatchFaceDetailActivity.FROM_RANK, "", GoogleApiAvailabilityLight.a, LogUtil.I, "getCourseNumber", "()I", "courseNumber", "e", "getCal", "cal", "", "f", "J", "getStudyNumber", "()J", "studyNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCourseVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String rank;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int courseNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int cal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long studyNumber;

    public FeaturedCourseVo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, long j) {
        this.id = str;
        this.name = str2;
        this.rank = str3;
        this.courseNumber = i;
        this.cal = i2;
        this.studyNumber = j;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getCourseNumber() {
        return this.courseNumber;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRank() {
        return this.rank;
    }

    public final long getStudyNumber() {
        return this.studyNumber;
    }
}
