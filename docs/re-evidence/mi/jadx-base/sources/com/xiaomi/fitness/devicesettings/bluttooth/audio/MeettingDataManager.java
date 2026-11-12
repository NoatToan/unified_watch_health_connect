package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.mi.health.course.export.data.CourseConfigModel;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeettingDataManager;", "", "<init>", "()V", "meetingBean", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "get", "reset", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeettingDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeettingDataManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/MeettingDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1863#2:41\n1863#2,2:42\n1864#2:44\n*S KotlinDebug\n*F\n+ 1 MeettingDataManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/MeettingDataManager\n*L\n22#1:41\n25#1:42,2\n22#1:44\n*E\n"})
public final class MeettingDataManager {

    @NotNull
    public static final MeettingDataManager INSTANCE = new MeettingDataManager();

    @Nullable
    private static MeetingBean meetingBean;

    private MeettingDataManager() {
    }

    @NotNull
    public final MeetingBean get() {
        MeetingBean meetingBean2 = meetingBean;
        Intrinsics.checkNotNull(meetingBean2);
        return meetingBean2;
    }

    public final void reset() {
        meetingBean = null;
    }

    public final void set(@Nullable MeetingBean meetingBean2) {
        if (meetingBean2 == null) {
            return;
        }
        MeetingBean meetingBean3 = new MeetingBean(meetingBean2.getTime(), meetingBean2.getAddress(), meetingBean2.getStatus(), meetingBean2.getTitle(), meetingBean2.getNewTitle(), meetingBean2.getFdsName(), null, null, 0, FileUtils.S_IRWXU, null);
        for (TalkBean talkBean : meetingBean2.getTalkList()) {
            TalkBean talkBean2 = new TalkBean(talkBean.getSpeakerId(), talkBean.getUserName(), null, talkBean.getUserNameTranslation(), 4, null);
            ListExtKt.add(meetingBean3.getTalkList(), talkBean2);
            for (MessageBean messageBean : talkBean.getMsgList()) {
                ListExtKt.add(talkBean2.getMsgList(), new MessageBean(messageBean.getStart_time(), messageBean.getEnd_time(), messageBean.getContent(), messageBean.getTranslation(), null, null, false, 112, null));
            }
        }
        meetingBean = meetingBean3;
    }
}
