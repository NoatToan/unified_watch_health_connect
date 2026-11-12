package com.xiaomi.fitness.smarthome.mijiasdk.bean;

import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\tj\b\u0012\u0004\u0012\u00020\b`\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R,\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\tj\b\u0012\u0004\u0012\u00020\b`\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/RoomBean;", "", OneTrack.Param.ROOM_ID, "", "name", "", "common_use_scene_list", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/SceneBean;", "Ljava/util/ArrayList;", "<init>", "(JLjava/lang/String;Ljava/util/ArrayList;)V", "getRoom_id", "()J", "setRoom_id", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCommon_use_scene_list", "()Ljava/util/ArrayList;", "setCommon_use_scene_list", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomBean {

    @NotNull
    private ArrayList<SceneBean> common_use_scene_list;

    @NotNull
    private String name;
    private long room_id;

    public RoomBean(long j, @NotNull String name, @NotNull ArrayList<SceneBean> common_use_scene_list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(common_use_scene_list, "common_use_scene_list");
        this.room_id = j;
        this.name = name;
        this.common_use_scene_list = common_use_scene_list;
    }

    @NotNull
    public final ArrayList<SceneBean> getCommon_use_scene_list() {
        return this.common_use_scene_list;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getRoom_id() {
        return this.room_id;
    }

    public final void setCommon_use_scene_list(@NotNull ArrayList<SceneBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.common_use_scene_list = arrayList;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setRoom_id(long j) {
        this.room_id = j;
    }
}
