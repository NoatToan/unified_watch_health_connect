package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.userinfo.collect.Category;
import defpackage.h4b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010S\u001a\u00020TR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/mi/health/course/export/data/CourseAllInfo;", "Ljava/io/Serializable;", "<init>", "()V", "courseId", "", "getCourseId", "()J", "setCourseId", "(J)V", "type", "", "getType", "()I", "setType", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "status", "getStatus", "setStatus", "createTime", "getCreateTime", "setCreateTime", "configs", "", "Lcom/mi/health/course/export/data/CourseModel$CourseConfig;", "getConfigs", "()Ljava/util/List;", "setConfigs", "(Ljava/util/List;)V", "basicInfo", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "getBasicInfo", "()Lcom/mi/health/course/export/data/CourseModel$CourseData;", "setBasicInfo", "(Lcom/mi/health/course/export/data/CourseModel$CourseData;)V", "videoInfo", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;", "getVideoInfo", "()Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;", "setVideoInfo", "(Lcom/mi/health/course/export/data/CourseConfigModel$VideoInfo;)V", "detailInfo", "Lcom/mi/health/course/export/data/CourseConfigModel$ConfigDetail;", "getDetailInfo", "()Lcom/mi/health/course/export/data/CourseConfigModel$ConfigDetail;", "setDetailInfo", "(Lcom/mi/health/course/export/data/CourseConfigModel$ConfigDetail;)V", "tags", "Lcom/mi/health/course/export/data/CourseConfigModel$CourseTags;", "getTags", "()Lcom/mi/health/course/export/data/CourseConfigModel$CourseTags;", "setTags", "(Lcom/mi/health/course/export/data/CourseConfigModel$CourseTags;)V", "audioInfo", "Lcom/mi/health/course/export/data/CourseConfigModel$AudioInfo;", "getAudioInfo", "()Lcom/mi/health/course/export/data/CourseConfigModel$AudioInfo;", "setAudioInfo", "(Lcom/mi/health/course/export/data/CourseConfigModel$AudioInfo;)V", "deviceLinkage", "Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "getDeviceLinkage", "()Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "setDeviceLinkage", "(Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;)V", "img", "Lcom/mi/health/course/export/data/CourseConfigModel$PreviewImg;", "getImg", "()Lcom/mi/health/course/export/data/CourseConfigModel$PreviewImg;", "setImg", "(Lcom/mi/health/course/export/data/CourseConfigModel$PreviewImg;)V", "heartCourseDetail", "Lcom/mi/health/course/export/data/HrCourseConfigModel$HrConfigDetail;", "getHeartCourseDetail", "()Lcom/mi/health/course/export/data/HrCourseConfigModel$HrConfigDetail;", "setHeartCourseDetail", "(Lcom/mi/health/course/export/data/HrCourseConfigModel$HrConfigDetail;)V", "genConfig", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseAllInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseAllInfo.kt\ncom/mi/health/course/export/data/CourseAllInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n774#2:70\n865#2,2:71\n1863#2:73\n1864#2:75\n1#3:74\n*S KotlinDebug\n*F\n+ 1 CourseAllInfo.kt\ncom/mi/health/course/export/data/CourseAllInfo\n*L\n49#1:70\n49#1:71,2\n49#1:73\n49#1:75\n*E\n"})
public final class CourseAllInfo implements Serializable {

    @Nullable
    private CourseConfigModel.AudioInfo audioInfo;

    @Nullable
    private CourseModel.CourseData basicInfo;

    @Nullable
    private List<? extends CourseModel.CourseConfig> configs;

    @SerializedName("course_id")
    private long courseId;

    @SerializedName("c_time")
    private long createTime;

    @Nullable
    private CourseConfigModel.ConfigDetail detailInfo;

    @Nullable
    private CourseConfigModel.DeviceLinkage deviceLinkage;

    @Nullable
    private HrCourseConfigModel.HrConfigDetail heartCourseDetail;

    @Nullable
    private CourseConfigModel.PreviewImg img;

    @Nullable
    private String name;
    private int status;

    @Nullable
    private CourseConfigModel.CourseTags tags;
    private int type;

    @Nullable
    private CourseConfigModel.VideoInfo videoInfo;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void genConfig() {
        String str;
        List<? extends CourseModel.CourseConfig> list = this.configs;
        if (list != null) {
            ArrayList<CourseModel.CourseConfig> arrayList = new ArrayList();
            for (Object obj : list) {
                CourseModel.CourseConfig courseConfig = (CourseModel.CourseConfig) obj;
                String str2 = courseConfig.key;
                if (str2 != null && str2.length() != 0 && (str = courseConfig.value) != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            for (CourseModel.CourseConfig courseConfig2 : arrayList) {
                String str3 = courseConfig2.key;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -2138563108:
                            if (str3.equals("device_linkage")) {
                                CourseConfigModel.DeviceLinkage deviceLinkage = (CourseConfigModel.DeviceLinkage) h4b.d(courseConfig2.value, CourseConfigModel.DeviceLinkage.class);
                                deviceLinkage.concernDataSet = CourseAllInfoKt.parseConcernData(deviceLinkage.concernedData);
                                this.deviceLinkage = deviceLinkage;
                            }
                            break;
                        case -1618174478:
                            if (str3.equals("video_info")) {
                                this.videoInfo = (CourseConfigModel.VideoInfo) h4b.d(courseConfig2.value, CourseConfigModel.VideoInfo.class);
                            }
                            break;
                        case -1124288993:
                            if (str3.equals(Category.BASIC_INFO)) {
                                this.basicInfo = (CourseModel.CourseData) h4b.d(courseConfig2.value, CourseModel.CourseData.class);
                            }
                            break;
                        case 3552281:
                            if (str3.equals("tags")) {
                                this.tags = (CourseConfigModel.CourseTags) h4b.d(courseConfig2.value, CourseConfigModel.CourseTags.class);
                            }
                            break;
                        case 696777252:
                            if (str3.equals("preview_image")) {
                                this.img = (CourseConfigModel.PreviewImg) h4b.d(courseConfig2.value, CourseConfigModel.PreviewImg.class);
                            }
                            break;
                        case 1348137205:
                            if (str3.equals("course_detail")) {
                                int i = this.type;
                                if (i == 1 || i == 2) {
                                    this.detailInfo = (CourseConfigModel.ConfigDetail) h4b.d(courseConfig2.value, CourseConfigModel.ConfigDetail.class);
                                } else if (i == 3) {
                                    HrCourseConfigModel.HrConfigDetail hrConfigDetail = (HrCourseConfigModel.HrConfigDetail) h4b.d(courseConfig2.value, HrCourseConfigModel.HrConfigDetail.class);
                                    this.heartCourseDetail = hrConfigDetail;
                                    this.detailInfo = hrConfigDetail != null ? hrConfigDetail.changeToConfigDetail() : null;
                                }
                            }
                            break;
                        case 1549039479:
                            if (str3.equals("audio_info")) {
                                this.audioInfo = (CourseConfigModel.AudioInfo) h4b.d(courseConfig2.value, CourseConfigModel.AudioInfo.class);
                            }
                            break;
                    }
                }
            }
        }
    }

    @Nullable
    public final CourseConfigModel.AudioInfo getAudioInfo() {
        return this.audioInfo;
    }

    @Nullable
    public final CourseModel.CourseData getBasicInfo() {
        return this.basicInfo;
    }

    @Nullable
    public final List<CourseModel.CourseConfig> getConfigs() {
        return this.configs;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final CourseConfigModel.ConfigDetail getDetailInfo() {
        return this.detailInfo;
    }

    @Nullable
    public final CourseConfigModel.DeviceLinkage getDeviceLinkage() {
        return this.deviceLinkage;
    }

    @Nullable
    public final HrCourseConfigModel.HrConfigDetail getHeartCourseDetail() {
        return this.heartCourseDetail;
    }

    @Nullable
    public final CourseConfigModel.PreviewImg getImg() {
        return this.img;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final CourseConfigModel.CourseTags getTags() {
        return this.tags;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final CourseConfigModel.VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setAudioInfo(@Nullable CourseConfigModel.AudioInfo audioInfo) {
        this.audioInfo = audioInfo;
    }

    public final void setBasicInfo(@Nullable CourseModel.CourseData courseData) {
        this.basicInfo = courseData;
    }

    public final void setConfigs(@Nullable List<? extends CourseModel.CourseConfig> list) {
        this.configs = list;
    }

    public final void setCourseId(long j) {
        this.courseId = j;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDetailInfo(@Nullable CourseConfigModel.ConfigDetail configDetail) {
        this.detailInfo = configDetail;
    }

    public final void setDeviceLinkage(@Nullable CourseConfigModel.DeviceLinkage deviceLinkage) {
        this.deviceLinkage = deviceLinkage;
    }

    public final void setHeartCourseDetail(@Nullable HrCourseConfigModel.HrConfigDetail hrConfigDetail) {
        this.heartCourseDetail = hrConfigDetail;
    }

    public final void setImg(@Nullable CourseConfigModel.PreviewImg previewImg) {
        this.img = previewImg;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTags(@Nullable CourseConfigModel.CourseTags courseTags) {
        this.tags = courseTags;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVideoInfo(@Nullable CourseConfigModel.VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }
}
